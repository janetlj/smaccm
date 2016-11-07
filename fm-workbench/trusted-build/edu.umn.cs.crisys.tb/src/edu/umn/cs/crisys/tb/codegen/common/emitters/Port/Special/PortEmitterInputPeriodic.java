package edu.umn.cs.crisys.tb.codegen.common.emitters.Port.Special;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import edu.umn.cs.crisys.tb.TbException;
import edu.umn.cs.crisys.tb.codegen.common.emitters.EmitterFactory;
import edu.umn.cs.crisys.tb.codegen.common.emitters.NameEmitter;
import edu.umn.cs.crisys.tb.codegen.common.emitters.Port.PortEmitterCamkes;
import edu.umn.cs.crisys.tb.codegen.common.emitters.Port.PortEmitterEChronos;
import edu.umn.cs.crisys.tb.codegen.common.emitters.Port.PortEmitterVxWorks;
import edu.umn.cs.crisys.tb.codegen.common.names.ModelNames;
import edu.umn.cs.crisys.tb.codegen.common.names.ThreadImplementationNames;
import edu.umn.cs.crisys.tb.codegen.common.names.TypeNames;
import edu.umn.cs.crisys.tb.codegen.eChronos.EChronosUtil;
import edu.umn.cs.crisys.tb.model.OSModel;
import edu.umn.cs.crisys.tb.model.connection.PortConnection;
import edu.umn.cs.crisys.tb.model.port.DispatchableInputPort;
import edu.umn.cs.crisys.tb.model.port.ExternalHandler;
import edu.umn.cs.crisys.tb.model.port.InitializerPort;
import edu.umn.cs.crisys.tb.model.port.InputDataPort;
import edu.umn.cs.crisys.tb.model.port.InputEventPort;
import edu.umn.cs.crisys.tb.model.port.InputIrqPort;
import edu.umn.cs.crisys.tb.model.port.InputPeriodicPort;
import edu.umn.cs.crisys.tb.model.port.InputPort;
import edu.umn.cs.crisys.tb.model.port.OutputDataPort;
import edu.umn.cs.crisys.tb.model.port.OutputEventPort;
import edu.umn.cs.crisys.tb.model.port.OutputPort;
import edu.umn.cs.crisys.tb.model.port.PortFeature;
import edu.umn.cs.crisys.tb.model.type.BoolType;
import edu.umn.cs.crisys.tb.model.type.IntType;
import edu.umn.cs.crisys.tb.model.type.Type;
import edu.umn.cs.crisys.tb.model.type.UnitType;
import edu.umn.cs.crisys.tb.util.Util;

public class PortEmitterInputPeriodic implements PortEmitterCamkes, PortEmitterEChronos, PortEmitterVxWorks {

   public static boolean isApplicable(PortFeature pf) {
      // right kind of port
      boolean ok = (pf instanceof InputPeriodicPort);
      return ok;
   }
   
   private PortFeature port;
   private OSModel model; 
   Type indexType = new IntType(32, false); 
   STGroupFile template; 
   
   public PortEmitterInputPeriodic(PortFeature pf) {
      template = Util.createTemplate("PortEmitterInputPeriodic.stg");
      this.port = pf;
      this.model = Util.getElementOSModel(pf);
   }
   
   @Override
   public void addPortPublicTypeDeclarations(Map<String, Type> typeList) {
      // no-op for the moment; 
   }

   @Override
   public PortFeature getModelElement() {
      return this.port;
   }

   
   public ST getTemplateST(String stName) {
      return template.getInstanceOf(stName); 
   }

   /*************************************************
    * 
    * C code related declarations
    * 
    *************************************************/
   
   @Override
   public void getWritePortCFiles(File directory) {
      // no-op for InputPeriodicPorts
   }

   @Override
   public void getWritePortHFiles(File directory) {
      // no-op for InputPeriodicPorts
   }
   
   @Override
   public String getWritePortHPrototypes() {
      ST st = getTemplateST("writeUdePrototype");
      st.add("dispatcher", this);
      return st.render(); 
   }


   @Override
   public String getWritePortDeclarations() {
      String result = ""; 
      ST st = getTemplateST("dispatcherComponentPeriodicEventDecls");
      st.add("dispatcher", this);
      result += st.render(); 

      // For VxWorks, we define the OS trigger in-situ.
      if (model.getOsTarget() == OSModel.OSTarget.VxWorks) {
         st = getTemplateST("dispatcherComponentPeriodicEventDecls");
         st.add("dispatcher", this);
         result += st.render(); 
      }
      
      return result; 
   }

   @Override
   public String getWritePortPreEntrypoint() {
      // no-op for InputPeriodicPorts
      return "";
   }

   @Override
   public String getWritePortPostEntrypoint() {
      // no-op for InputPeriodicPorts
      return "";
   }

   @Override
   public String getWritePortEventResponder() {
      String result = ""; 
      ST st = getTemplateST("periodicDispatcher");
      st.add("dispatcher", this);
      return st.render(); 
   }

   @Override
   public String getWritePortThreadInitializer() {
      String result = ""; 
      ST st = getTemplateST("createWatchdog");
      st.add("dispatcher", this);
      return st.render(); 
   }

   @Override
   public String getName() {
      return this.getModelElement().getName();
   }

   @Override
   public String getQualifiedName() {
      return this.getModelElement().getQualifiedName();
   }


   /************************************************************
    * 
    * VxWorks-specific functions 
    * 
    ************************************************************/

   
   @Override
   public String vxWorksAddCommonHFileDeclarations() {
      // no-op for InputPeriodicPorts - no need for mutex
      return "";
   }

   @Override
   public String getVxWorksAddMainCFileIncludes() {
      // no-op for InitializerPorts
      return "";
   }

   @Override
   public String getVxWorksAddMainCFileDeclarations() {
      // no-op for InitializerPorts
      return ""; 
   }

   @Override
   public String getVxWorksAddMainCFileInitializers() {
      // Need to add support for IRQs for VxWorks
      return ""; 
   }

   @Override
   public String getVxWorksAddMainCFileDestructors() {
      // Need to add support for IRQs for VxWorks
      return "";
   }

   /************************************************************
    * 
    * eChronos-specific functions 
    * 
    ************************************************************/

   public String getEChronosAddPrxMutexes() {
      return EChronosUtil.addPrxMutex(this.getMutex());
   }
   
   public String getEChronosAddPrxSemaphores() {
      return "";
   }

   @Override
   public String getEChronosAddCommonHFileDeclarations() {
      return EChronosUtil.eChronosPortWriterPrototype(
            getIncomingWriterName(), this.getModelElement().getType()); 
   }

   @Override
   public String getAddTrampolines() { return ""; }
   
   @Override
   public String getAddInternalIrqs() { return ""; }
   
   @Override
   public String getAddExternalIrqs() { return ""; }
   
   /************************************************************
    * 
    * CAmkES-specific functions 
    * 
    ************************************************************/

   @Override
   public String getAddComponentPortLevelDeclarations() {
      String toReturn = ""; 
      toReturn += this.getType().getReaderWriterInterfaceName(); 
      toReturn += " " + this.getQualifiedName() + ";\n";
      return toReturn;
   }

   @Override
   public String getAddAssemblyFilePortDeclarations() {
      return ""; 
   }
   
   @Override
   public String getAddAssemblyFileCompositionPortDeclarations() {
      String result = ""; 
      ST st = getTemplateST("connectActivePeriodic");
      st.add("dispatcher", this);
      st.add("threadImpl", this.getThreadImplementation()); 
      st.add("model", EmitterFactory.model(this.model));
      result += st.render();
      
      return result;
   }
   
   @Override
   public String getAddAssemblyFileConfigDeclarations() {
      // no-op for Input Periodic Ports for Camkes
      String result = ""; 
      return result;
   }
   
   /************************************************************
    * 
    * Names functions used by the .stg templates for periodic dispatchers
    *
    * type
    * name
    * threadImplementation
    * externalHandlers
    * dispatchOccurredVar
    * periodicTimeVar
    * periodicDispatcherPeriod
    * hasData
    * dispatcherMainLockReleaseStmt <-- OS-specific, handled by thread.
    * incomingActiveThreadDispatchName <--> incomingWriterName <-- OS-specific.
    *
    * 
    * the entrypointCallerName is only dispatched remotely for 
    *    passive threads.  For active threads it will always be 
    *    dispatched from the main thread dispatch loop.
    * 
    * 
    ************************************************************/

   public ThreadImplementationNames getThreadImplementation() {
      return EmitterFactory.threadImplementation(this.getModelElement().getOwner());
   }

   public List<NameEmitter> getExternalHandlers() {
      DispatchableInputPort dip = ((DispatchableInputPort) this.getModelElement());
      List<NameEmitter> ehl = new ArrayList<>(); 
      for (ExternalHandler eh : dip.getExternalHandlerList()) {
         ehl.add(EmitterFactory.externalHandler(eh)); 
      }
      return ehl;
   }

   public String getDispatcherMainLockReleaseStmt() {
      return (EmitterFactory.threadImplementation(
               this.getModelElement().getOwner())).
                  getDispatcherMainLockReleaseStmt();
   }

   public String getDispatchOccurredVar() {
      return getPrefix() + "_occurred_" + getName(); 
   }

   public String getPeriodicTimeVar() {
      return getPrefix() + "_time_" + getName(); 
   }

   public int getPeriodicDispatcherPeriod() {
      InputPeriodicPort ipp = 
            (InputPeriodicPort)this.getModelElement();
      return ipp.getPeriod();
   }
   
   public String getMutex() {
      return (Util.getPrefix_() + getModelElement().getOwner().getNormalizedName() + "_" + getModelElement().getName() + "_mut").toLowerCase();
    }

   public String getUserEntrypointCallerName() {
      return this.getPrefix() + "_entrypoint_" + 
            this.getQualifiedName(); 
   }
   
   public String getActiveThreadInternalDispatcherFnName() {
      return getUserEntrypointCallerName(); 
   }

   public boolean getHasData() { 
      return !(this.getModelElement().getType() instanceof UnitType); 
   }
   
   public TypeNames getType() { 
      return EmitterFactory.type(this.getModelElement().getType()); 
   }

   public String writeType() {
      return "_write" + getModelElement().getType().getCType().typeString();
   }

   public String getLpcPortWriterName() {
      return Util.getPrefix_() + getModelElement().getQualifiedName() + 
            writeType();
   }

   // middleware functions; these must be compatible with the OS.
   public String getIncomingWriterName() {
      PortFeature dp = getModelElement();
      if (model.getOsTarget() == OSModel.OSTarget.CAmkES) {
         return dp.getName() + writeType() ;
      } else if (model.getOsTarget() == OSModel.OSTarget.eChronos) {
         return getLpcPortWriterName();
      } else if (model.getOsTarget() == OSModel.OSTarget.VxWorks) {
         return getLpcPortWriterName();
      } else {
         throw new TbException("Error: getIncomingPortWriterName: OS " + model.getOsTarget() + " is not a known OS target.");
      }
   }
   
   public String getPrefix() { return Util.getPrefix(); }
   
   public String getIdlDispatcherName() {
      return "dispatch_" + getName();
   }

   public String getFirstLevelInterruptHandler() {
      InputIrqPort iip = (InputIrqPort)this.getModelElement();
      return iip.getFirstLevelInterruptHandler(); 
   }
   
   public String getSignalName() {
      InputIrqPort iip = (InputIrqPort)this.getModelElement(); 
      return iip.getSignalName(); 
   }

   public String getSignalNumber() {
      InputIrqPort iip = (InputIrqPort)this.getModelElement(); 
      return Integer.toString(iip.getNumber()); 
   }

   public List<NameEmitter> getMemoryRegions() {
      InputIrqPort iip = (InputIrqPort)this.getModelElement(); 
      List<NameEmitter> regions = new ArrayList<>();
      for (Map.Entry<String, String> entry : iip.getMemoryRegions().entrySet()) {
         NameEmitter region = EmitterFactory.memoryRegion(entry.getKey(), entry.getValue());
         regions.add(region);
      }
      return regions; 
   }

   public String getIrqObject() {
      return getName() + "_obj";
   }

   public String getIrqComponent() {
      return getName() + "_hw"; 
   }

}