package com.rockwellcollins.atc.agree.scoping;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.osate.aadl2.DataImplementation;
import org.osate.aadl2.DataPort;
import org.osate.aadl2.DataSubcomponentType;
import org.osate.aadl2.Element;
import org.osate.aadl2.EventDataPort;
import org.osate.aadl2.NamedElement;

import com.rockwellcollins.atc.agree.agree.Arg;
import com.rockwellcollins.atc.agree.agree.BinaryExpr;
import com.rockwellcollins.atc.agree.agree.Expr;
import com.rockwellcollins.atc.agree.agree.IfThenElseExpr;
import com.rockwellcollins.atc.agree.agree.NestedDotID;
import com.rockwellcollins.atc.agree.agree.PreExpr;
import com.rockwellcollins.atc.agree.agree.RecordDefExpr;
import com.rockwellcollins.atc.agree.agree.RecordExpr;
import com.rockwellcollins.atc.agree.agree.RecordType;
import com.rockwellcollins.atc.agree.agree.RecordUpdateExpr;
import com.rockwellcollins.atc.agree.agree.Type;
import com.rockwellcollins.atc.agree.agree.TypeID;

public class RecordExprScoper {

	public static IScope getScope(Expr expr, IScope outerScope) {

		if (expr instanceof BinaryExpr) {
			return getScope((BinaryExpr) expr, outerScope);
		} else if (expr instanceof PreExpr) {
			return getScope((PreExpr) expr, outerScope);
		} else if (expr instanceof IfThenElseExpr) {
			return getScope((IfThenElseExpr) expr, outerScope);
		} else if (expr instanceof RecordUpdateExpr) {
			return getScope((RecordUpdateExpr) expr, outerScope);
		} else if (expr instanceof NestedDotID) {
			return getScope((NestedDotID) expr, outerScope);
		} else if (expr instanceof RecordExpr) {
			return getScope((RecordExpr) expr, outerScope);
		}

		return IScope.NULLSCOPE;
	}

	public static IScope getScope(RecordExpr expr, IScope outerScope) {
		return getScope(expr.getRecord(), outerScope);
	}

	public static IScope getScope(BinaryExpr binExpr, IScope outerScope) {
		// just assume its an arrow expr, the validiator
		// will throw an error otherwise. Just assume
		// that the lhs and rhs times match as well
		return getScope(binExpr.getLeft(), outerScope);
	}

	public static IScope getScope(RecordUpdateExpr upExpr, IScope outerScope) {
		return getScope(upExpr.getRecord(), outerScope);
	}

	public static IScope getScope(PreExpr preExpr, IScope outerScope) {
		return getScope(preExpr.getExpr(), outerScope);
	}

	public static IScope getScope(IfThenElseExpr iteExpr, IScope outerScope) {
		// just assume the then and else types match
		// the validator will check this
		return getScope(iteExpr.getB(), outerScope);
	}

	public static IScope getScope(NestedDotID nestExpr, IScope outerScope) {
		while (nestExpr.getSub() != null) {
			nestExpr = nestExpr.getSub();
		}
		NamedElement recStatement = nestExpr.getBase();
		return getScope(recStatement, outerScope);
	}

	public static IScope getScope(NamedElement recStatement, IScope outerScope) {
		if (recStatement instanceof Arg) {
			Type type = ((Arg) recStatement).getType();
			if (type instanceof RecordType) {
				TypeID nestExpr = ((RecordType) type).getRecord();
				return getRecordComponents(nestExpr.getBase(), outerScope);
			}
		} else if (recStatement instanceof DataPort) {
			DataSubcomponentType dataClass = ((DataPort) recStatement).getDataFeatureClassifier();
			if (dataClass instanceof DataImplementation) {
				return getRecordComponents(dataClass, outerScope);
			}
		} else if (recStatement instanceof EventDataPort) {
			DataSubcomponentType dataClass = ((EventDataPort) recStatement).getDataFeatureClassifier();
			if (dataClass instanceof DataImplementation) {
				return getRecordComponents(dataClass, outerScope);
			}
		} else if (recStatement instanceof RecordDefExpr) {
			return getRecordComponents(recStatement, outerScope);
		}
		return IScope.NULLSCOPE;
	}

	public static IScope getRecordComponents(NamedElement recDef, IScope outerScope) {
		Set<Element> components = new HashSet<>();
		if (recDef instanceof DataImplementation) {
			components.addAll(((DataImplementation) recDef).getAllSubcomponents());
			return Scopes.scopeFor(components, outerScope);
		} else if (recDef instanceof RecordDefExpr) {
			components.addAll(((RecordDefExpr) recDef).getArgs());
			return Scopes.scopeFor(components, outerScope);
		}
		return IScope.NULLSCOPE;
	}

}
