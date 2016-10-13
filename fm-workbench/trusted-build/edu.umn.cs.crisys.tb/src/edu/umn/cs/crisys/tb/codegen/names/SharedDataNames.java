/**
 * 
 */
package edu.umn.cs.crisys.tb.codegen.names;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

import edu.umn.cs.crisys.tb.TbException;
import edu.umn.cs.crisys.tb.model.connection.SharedData;
import edu.umn.cs.crisys.tb.model.connection.SharedDataAccessor;

/**
 * @author Whalen
 *
 */
public class SharedDataNames {
  
  SharedData sd ; 
  
  public SharedDataNames(SharedData sd) {
    this.sd = sd;
  }
  
  public String getVarName() {
    return sd.getVarName();
  }
  
  public TypeNames getType() {
    return new TypeNames(sd.getType());
  }
  
  public List<SharedDataAccessorNames> getNonChosenAccessList() {
    List<SharedDataAccessorNames> sdal = new ArrayList<>(); 
    for (SharedDataAccessor elem : sd.getAccessors()) {
      if (elem.getOwner() != sd.getCamkesOwner()) {
        sdal.add(new SharedDataAccessorNames(elem));
      }
    }
    return sdal;
  }
  
  public SharedDataAccessorNames getChosenAccess() {
    for (SharedDataAccessor sda : sd.getAccessors()) {
      if (sda.getOwner() == sd.getCamkesOwner()) {
        return new SharedDataAccessorNames(sda);
      }
    }
    throw new TbException("Shared data element [" + sd.getVarName() + "] is not accessed by CAmkES owner thread [" + sd.getCamkesOwner().getName() + "]"); 
  }
}
