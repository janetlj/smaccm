/*
 * generated by Xtext
 */
package com.rockwellcollins.atc.resolute.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractPartialContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.rockwellcollins.atc.resolute.services.ResoluteGrammarAccess;

public class ResoluteParser extends AbstractPartialContentAssistParser {
	
	@Inject
	private ResoluteGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.rockwellcollins.atc.resolute.ui.contentassist.antlr.internal.InternalResoluteParser createParser() {
		com.rockwellcollins.atc.resolute.ui.contentassist.antlr.internal.InternalResoluteParser result = new com.rockwellcollins.atc.resolute.ui.contentassist.antlr.internal.InternalResoluteParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getNamedElementAccess().getAlternatives(), "rule__NamedElement__Alternatives");
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getDefinitionAccess().getAlternatives(), "rule__Definition__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getBaseTypeAccess().getTypeAlternatives_0(), "rule__BaseType__TypeAlternatives_0");
					put(grammarAccess.getArgAccess().getAlternatives(), "rule__Arg__Alternatives");
					put(grammarAccess.getDefinitionBodyAccess().getAlternatives(), "rule__DefinitionBody__Alternatives");
					put(grammarAccess.getClaimTextAccess().getAlternatives(), "rule__ClaimText__Alternatives");
					put(grammarAccess.getClaimTextVarAccess().getAlternatives(), "rule__ClaimTextVar__Alternatives");
					put(grammarAccess.getOrExprAccess().getAlternatives_1_0_0_1(), "rule__OrExpr__Alternatives_1_0_0_1");
					put(grammarAccess.getAndExprAccess().getAlternatives_1_0_0_1(), "rule__AndExpr__Alternatives_1_0_0_1");
					put(grammarAccess.getRelationalOpAccess().getAlternatives(), "rule__RelationalOp__Alternatives");
					put(grammarAccess.getPlusExprAccess().getOpAlternatives_1_0_0_1_0(), "rule__PlusExpr__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getTimesExprAccess().getOpAlternatives_1_0_0_1_0(), "rule__TimesExpr__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getPrefixExprAccess().getAlternatives(), "rule__PrefixExpr__Alternatives");
					put(grammarAccess.getPrefixExprAccess().getOpAlternatives_0_1_0(), "rule__PrefixExpr__OpAlternatives_0_1_0");
					put(grammarAccess.getAtomicExprAccess().getAlternatives(), "rule__AtomicExpr__Alternatives");
					put(grammarAccess.getAtomicExprAccess().getAlternatives_2_2(), "rule__AtomicExpr__Alternatives_2_2");
					put(grammarAccess.getAtomicExprAccess().getQuantAlternatives_8_1_0(), "rule__AtomicExpr__QuantAlternatives_8_1_0");
					put(grammarAccess.getAtomicExprAccess().getAlternatives_11_2(), "rule__AtomicExpr__Alternatives_11_2");
					put(grammarAccess.getAtomicExprAccess().getAlternatives_12_2(), "rule__AtomicExpr__Alternatives_12_2");
					put(grammarAccess.getBuiltInFnAccess().getAlternatives(), "rule__BuiltInFn__Alternatives");
					put(grammarAccess.getContainedPropertyAssociationAccess().getAlternatives_1(), "rule__ContainedPropertyAssociation__Alternatives_1");
					put(grammarAccess.getPropertyAssociationAccess().getAlternatives_1(), "rule__PropertyAssociation__Alternatives_1");
					put(grammarAccess.getPropertyExpressionAccess().getAlternatives(), "rule__PropertyExpression__Alternatives");
					put(grammarAccess.getBooleanLiteralAccess().getAlternatives_1(), "rule__BooleanLiteral__Alternatives_1");
					put(grammarAccess.getPlusMinusAccess().getAlternatives(), "rule__PlusMinus__Alternatives");
					put(grammarAccess.getSignedIntAccess().getAlternatives_0(), "rule__SignedInt__Alternatives_0");
					put(grammarAccess.getSignedRealAccess().getAlternatives_0(), "rule__SignedReal__Alternatives_0");
					put(grammarAccess.getNumAltAccess().getAlternatives(), "rule__NumAlt__Alternatives");
					put(grammarAccess.getResoluteLibraryAccess().getGroup(), "rule__ResoluteLibrary__Group__0");
					put(grammarAccess.getTypeAccess().getGroup_0(), "rule__Type__Group_0__0");
					put(grammarAccess.getTypeAccess().getGroup_1(), "rule__Type__Group_1__0");
					put(grammarAccess.getTypeAccess().getGroup_2(), "rule__Type__Group_2__0");
					put(grammarAccess.getTypeAccess().getGroup_2_1(), "rule__Type__Group_2_1__0");
					put(grammarAccess.getArgAccess().getGroup_0(), "rule__Arg__Group_0__0");
					put(grammarAccess.getArgAccess().getGroup_0_0(), "rule__Arg__Group_0_0__0");
					put(grammarAccess.getArgAccess().getGroup_1(), "rule__Arg__Group_1__0");
					put(grammarAccess.getConstantDefinitionAccess().getGroup(), "rule__ConstantDefinition__Group__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup(), "rule__FunctionDefinition__Group__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_2(), "rule__FunctionDefinition__Group_2__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_2_1(), "rule__FunctionDefinition__Group_2_1__0");
					put(grammarAccess.getDefinitionBodyAccess().getGroup_0(), "rule__DefinitionBody__Group_0__0");
					put(grammarAccess.getDefinitionBodyAccess().getGroup_1(), "rule__DefinitionBody__Group_1__0");
					put(grammarAccess.getDefinitionBodyAccess().getGroup_1_2(), "rule__DefinitionBody__Group_1_2__0");
					put(grammarAccess.getClaimTextAccess().getGroup_0(), "rule__ClaimText__Group_0__0");
					put(grammarAccess.getClaimTextAccess().getGroup_1(), "rule__ClaimText__Group_1__0");
					put(grammarAccess.getClaimTextAccess().getGroup_1_2(), "rule__ClaimText__Group_1_2__0");
					put(grammarAccess.getImpliesExprAccess().getGroup(), "rule__ImpliesExpr__Group__0");
					put(grammarAccess.getImpliesExprAccess().getGroup_1(), "rule__ImpliesExpr__Group_1__0");
					put(grammarAccess.getImpliesExprAccess().getGroup_1_0(), "rule__ImpliesExpr__Group_1_0__0");
					put(grammarAccess.getImpliesExprAccess().getGroup_1_0_0(), "rule__ImpliesExpr__Group_1_0_0__0");
					put(grammarAccess.getOrExprAccess().getGroup(), "rule__OrExpr__Group__0");
					put(grammarAccess.getOrExprAccess().getGroup_1(), "rule__OrExpr__Group_1__0");
					put(grammarAccess.getOrExprAccess().getGroup_1_0(), "rule__OrExpr__Group_1_0__0");
					put(grammarAccess.getOrExprAccess().getGroup_1_0_0(), "rule__OrExpr__Group_1_0_0__0");
					put(grammarAccess.getAndExprAccess().getGroup(), "rule__AndExpr__Group__0");
					put(grammarAccess.getAndExprAccess().getGroup_1(), "rule__AndExpr__Group_1__0");
					put(grammarAccess.getAndExprAccess().getGroup_1_0(), "rule__AndExpr__Group_1_0__0");
					put(grammarAccess.getAndExprAccess().getGroup_1_0_0(), "rule__AndExpr__Group_1_0_0__0");
					put(grammarAccess.getInstanceOfExprAccess().getGroup(), "rule__InstanceOfExpr__Group__0");
					put(grammarAccess.getInstanceOfExprAccess().getGroup_1(), "rule__InstanceOfExpr__Group_1__0");
					put(grammarAccess.getInstanceOfExprAccess().getGroup_1_0(), "rule__InstanceOfExpr__Group_1_0__0");
					put(grammarAccess.getInstanceOfExprAccess().getGroup_1_0_0(), "rule__InstanceOfExpr__Group_1_0_0__0");
					put(grammarAccess.getRelationalExprAccess().getGroup(), "rule__RelationalExpr__Group__0");
					put(grammarAccess.getRelationalExprAccess().getGroup_1(), "rule__RelationalExpr__Group_1__0");
					put(grammarAccess.getRelationalExprAccess().getGroup_1_0(), "rule__RelationalExpr__Group_1_0__0");
					put(grammarAccess.getRelationalExprAccess().getGroup_1_0_0(), "rule__RelationalExpr__Group_1_0_0__0");
					put(grammarAccess.getPlusExprAccess().getGroup(), "rule__PlusExpr__Group__0");
					put(grammarAccess.getPlusExprAccess().getGroup_1(), "rule__PlusExpr__Group_1__0");
					put(grammarAccess.getPlusExprAccess().getGroup_1_0(), "rule__PlusExpr__Group_1_0__0");
					put(grammarAccess.getPlusExprAccess().getGroup_1_0_0(), "rule__PlusExpr__Group_1_0_0__0");
					put(grammarAccess.getTimesExprAccess().getGroup(), "rule__TimesExpr__Group__0");
					put(grammarAccess.getTimesExprAccess().getGroup_1(), "rule__TimesExpr__Group_1__0");
					put(grammarAccess.getTimesExprAccess().getGroup_1_0(), "rule__TimesExpr__Group_1_0__0");
					put(grammarAccess.getTimesExprAccess().getGroup_1_0_0(), "rule__TimesExpr__Group_1_0_0__0");
					put(grammarAccess.getExpExprAccess().getGroup(), "rule__ExpExpr__Group__0");
					put(grammarAccess.getExpExprAccess().getGroup_1(), "rule__ExpExpr__Group_1__0");
					put(grammarAccess.getExpExprAccess().getGroup_1_0(), "rule__ExpExpr__Group_1_0__0");
					put(grammarAccess.getExpExprAccess().getGroup_1_0_0(), "rule__ExpExpr__Group_1_0_0__0");
					put(grammarAccess.getPrefixExprAccess().getGroup_0(), "rule__PrefixExpr__Group_0__0");
					put(grammarAccess.getPrefixExprAccess().getGroup_1(), "rule__PrefixExpr__Group_1__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_0(), "rule__AtomicExpr__Group_0__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_1(), "rule__AtomicExpr__Group_1__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_1_2(), "rule__AtomicExpr__Group_1_2__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_2(), "rule__AtomicExpr__Group_2__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_2_2_1(), "rule__AtomicExpr__Group_2_2_1__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_3(), "rule__AtomicExpr__Group_3__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_4(), "rule__AtomicExpr__Group_4__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_5(), "rule__AtomicExpr__Group_5__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_6(), "rule__AtomicExpr__Group_6__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_7(), "rule__AtomicExpr__Group_7__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_8(), "rule__AtomicExpr__Group_8__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_8_2(), "rule__AtomicExpr__Group_8_2__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_9(), "rule__AtomicExpr__Group_9__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_9_3(), "rule__AtomicExpr__Group_9_3__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_9_3_1(), "rule__AtomicExpr__Group_9_3_1__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_10(), "rule__AtomicExpr__Group_10__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_10_3(), "rule__AtomicExpr__Group_10_3__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_10_3_1(), "rule__AtomicExpr__Group_10_3_1__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_11(), "rule__AtomicExpr__Group_11__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_11_2_0(), "rule__AtomicExpr__Group_11_2_0__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_11_2_0_2(), "rule__AtomicExpr__Group_11_2_0_2__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_11_2_0_3(), "rule__AtomicExpr__Group_11_2_0_3__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_11_2_1(), "rule__AtomicExpr__Group_11_2_1__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_11_2_1_1(), "rule__AtomicExpr__Group_11_2_1_1__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_12(), "rule__AtomicExpr__Group_12__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_12_2_0(), "rule__AtomicExpr__Group_12_2_0__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_12_2_0_2(), "rule__AtomicExpr__Group_12_2_0_2__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_12_2_0_3(), "rule__AtomicExpr__Group_12_2_0_3__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_12_2_1(), "rule__AtomicExpr__Group_12_2_1__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_12_2_1_1(), "rule__AtomicExpr__Group_12_2_1_1__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_13(), "rule__AtomicExpr__Group_13__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_14(), "rule__AtomicExpr__Group_14__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_15(), "rule__AtomicExpr__Group_15__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_16(), "rule__AtomicExpr__Group_16__0");
					put(grammarAccess.getLetBindingAccess().getGroup(), "rule__LetBinding__Group__0");
					put(grammarAccess.getRealTermAccess().getGroup(), "rule__RealTerm__Group__0");
					put(grammarAccess.getIntegerTermAccess().getGroup(), "rule__IntegerTerm__Group__0");
					put(grammarAccess.getResoluteSubclauseAccess().getGroup(), "rule__ResoluteSubclause__Group__0");
					put(grammarAccess.getNestedDotIDAccess().getGroup(), "rule__NestedDotID__Group__0");
					put(grammarAccess.getNestedDotIDAccess().getGroup_1(), "rule__NestedDotID__Group_1__0");
					put(grammarAccess.getProveStatementAccess().getGroup(), "rule__ProveStatement__Group__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup(), "rule__ContainedPropertyAssociation__Group__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3(), "rule__ContainedPropertyAssociation__Group_3__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3_1(), "rule__ContainedPropertyAssociation__Group_3_1__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4(), "rule__ContainedPropertyAssociation__Group_4__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4_2(), "rule__ContainedPropertyAssociation__Group_4_2__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_5(), "rule__ContainedPropertyAssociation__Group_5__0");
					put(grammarAccess.getPropertyAssociationAccess().getGroup(), "rule__PropertyAssociation__Group__0");
					put(grammarAccess.getPropertyAssociationAccess().getGroup_3(), "rule__PropertyAssociation__Group_3__0");
					put(grammarAccess.getPropertyAssociationAccess().getGroup_3_1(), "rule__PropertyAssociation__Group_3_1__0");
					put(grammarAccess.getPropertyAssociationAccess().getGroup_4(), "rule__PropertyAssociation__Group_4__0");
					put(grammarAccess.getBasicPropertyAssociationAccess().getGroup(), "rule__BasicPropertyAssociation__Group__0");
					put(grammarAccess.getModalPropertyValueAccess().getGroup(), "rule__ModalPropertyValue__Group__0");
					put(grammarAccess.getModalPropertyValueAccess().getGroup_4(), "rule__ModalPropertyValue__Group_4__0");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup(), "rule__OptionalModalPropertyValue__Group__0");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1(), "rule__OptionalModalPropertyValue__Group_1__0");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1_3(), "rule__OptionalModalPropertyValue__Group_1_3__0");
					put(grammarAccess.getBooleanLiteralAccess().getGroup(), "rule__BooleanLiteral__Group__0");
					put(grammarAccess.getReferenceTermAccess().getGroup(), "rule__ReferenceTerm__Group__0");
					put(grammarAccess.getRecordTermAccess().getGroup(), "rule__RecordTerm__Group__0");
					put(grammarAccess.getOldRecordTermAccess().getGroup(), "rule__OldRecordTerm__Group__0");
					put(grammarAccess.getComputedTermAccess().getGroup(), "rule__ComputedTerm__Group__0");
					put(grammarAccess.getComponentClassifierTermAccess().getGroup(), "rule__ComponentClassifierTerm__Group__0");
					put(grammarAccess.getListTermAccess().getGroup(), "rule__ListTerm__Group__0");
					put(grammarAccess.getListTermAccess().getGroup_2(), "rule__ListTerm__Group_2__0");
					put(grammarAccess.getListTermAccess().getGroup_2_1(), "rule__ListTerm__Group_2_1__0");
					put(grammarAccess.getFieldPropertyAssociationAccess().getGroup(), "rule__FieldPropertyAssociation__Group__0");
					put(grammarAccess.getContainmentPathElementAccess().getGroup(), "rule__ContainmentPathElement__Group__0");
					put(grammarAccess.getContainmentPathElementAccess().getGroup_0(), "rule__ContainmentPathElement__Group_0__0");
					put(grammarAccess.getContainmentPathElementAccess().getGroup_1(), "rule__ContainmentPathElement__Group_1__0");
					put(grammarAccess.getANNEXREFAccess().getGroup(), "rule__ANNEXREF__Group__0");
					put(grammarAccess.getArrayRangeAccess().getGroup(), "rule__ArrayRange__Group__0");
					put(grammarAccess.getArrayRangeAccess().getGroup_3(), "rule__ArrayRange__Group_3__0");
					put(grammarAccess.getSignedConstantAccess().getGroup(), "rule__SignedConstant__Group__0");
					put(grammarAccess.getSignedIntAccess().getGroup(), "rule__SignedInt__Group__0");
					put(grammarAccess.getSignedRealAccess().getGroup(), "rule__SignedReal__Group__0");
					put(grammarAccess.getNumericRangeTermAccess().getGroup(), "rule__NumericRangeTerm__Group__0");
					put(grammarAccess.getNumericRangeTermAccess().getGroup_3(), "rule__NumericRangeTerm__Group_3__0");
					put(grammarAccess.getAppliesToKeywordsAccess().getGroup(), "rule__AppliesToKeywords__Group__0");
					put(grammarAccess.getInBindingKeywordsAccess().getGroup(), "rule__InBindingKeywords__Group__0");
					put(grammarAccess.getInModesKeywordsAccess().getGroup(), "rule__InModesKeywords__Group__0");
					put(grammarAccess.getQCLREFAccess().getGroup(), "rule__QCLREF__Group__0");
					put(grammarAccess.getQPREFAccess().getGroup(), "rule__QPREF__Group__0");
					put(grammarAccess.getQPREFAccess().getGroup_1(), "rule__QPREF__Group_1__0");
					put(grammarAccess.getQCREFAccess().getGroup(), "rule__QCREF__Group__0");
					put(grammarAccess.getQCREFAccess().getGroup_0(), "rule__QCREF__Group_0__0");
					put(grammarAccess.getQCREFAccess().getGroup_2(), "rule__QCREF__Group_2__0");
					put(grammarAccess.getResoluteLibraryAccess().getDefinitionsAssignment_1(), "rule__ResoluteLibrary__DefinitionsAssignment_1");
					put(grammarAccess.getTypeAccess().getTypeAssignment_0_2(), "rule__Type__TypeAssignment_0_2");
					put(grammarAccess.getTypeAccess().getTypeAssignment_1_2(), "rule__Type__TypeAssignment_1_2");
					put(grammarAccess.getTypeAccess().getParamTypeAssignment_2_1_1(), "rule__Type__ParamTypeAssignment_2_1_1");
					put(grammarAccess.getBaseTypeAccess().getTypeAssignment(), "rule__BaseType__TypeAssignment");
					put(grammarAccess.getArgAccess().getNameAssignment_0_0_0(), "rule__Arg__NameAssignment_0_0_0");
					put(grammarAccess.getArgAccess().getTypeAssignment_0_0_2(), "rule__Arg__TypeAssignment_0_0_2");
					put(grammarAccess.getArgAccess().getNameAssignment_1_1(), "rule__Arg__NameAssignment_1_1");
					put(grammarAccess.getArgAccess().getExprAssignment_1_3(), "rule__Arg__ExprAssignment_1_3");
					put(grammarAccess.getConstantDefinitionAccess().getNameAssignment_0(), "rule__ConstantDefinition__NameAssignment_0");
					put(grammarAccess.getConstantDefinitionAccess().getTypeAssignment_2(), "rule__ConstantDefinition__TypeAssignment_2");
					put(grammarAccess.getConstantDefinitionAccess().getExprAssignment_4(), "rule__ConstantDefinition__ExprAssignment_4");
					put(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_0(), "rule__FunctionDefinition__NameAssignment_0");
					put(grammarAccess.getFunctionDefinitionAccess().getArgsAssignment_2_0(), "rule__FunctionDefinition__ArgsAssignment_2_0");
					put(grammarAccess.getFunctionDefinitionAccess().getArgsAssignment_2_1_1(), "rule__FunctionDefinition__ArgsAssignment_2_1_1");
					put(grammarAccess.getFunctionDefinitionAccess().getBodyAssignment_4(), "rule__FunctionDefinition__BodyAssignment_4");
					put(grammarAccess.getDefinitionBodyAccess().getTypeAssignment_0_2(), "rule__DefinitionBody__TypeAssignment_0_2");
					put(grammarAccess.getDefinitionBodyAccess().getExprAssignment_0_4(), "rule__DefinitionBody__ExprAssignment_0_4");
					put(grammarAccess.getDefinitionBodyAccess().getClaimAssignment_1_2_1(), "rule__DefinitionBody__ClaimAssignment_1_2_1");
					put(grammarAccess.getDefinitionBodyAccess().getExprAssignment_1_3(), "rule__DefinitionBody__ExprAssignment_1_3");
					put(grammarAccess.getClaimTextAccess().getStrAssignment_0_1(), "rule__ClaimText__StrAssignment_0_1");
					put(grammarAccess.getClaimTextAccess().getArgAssignment_1_1(), "rule__ClaimText__ArgAssignment_1_1");
					put(grammarAccess.getClaimTextAccess().getUnitAssignment_1_2_1(), "rule__ClaimText__UnitAssignment_1_2_1");
					put(grammarAccess.getImpliesExprAccess().getOpAssignment_1_0_0_1(), "rule__ImpliesExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getImpliesExprAccess().getRightAssignment_1_1(), "rule__ImpliesExpr__RightAssignment_1_1");
					put(grammarAccess.getOrExprAccess().getOpAssignment_1_0_0_1_0(), "rule__OrExpr__OpAssignment_1_0_0_1_0");
					put(grammarAccess.getOrExprAccess().getOpAssignment_1_0_0_1_1(), "rule__OrExpr__OpAssignment_1_0_0_1_1");
					put(grammarAccess.getOrExprAccess().getRightAssignment_1_1(), "rule__OrExpr__RightAssignment_1_1");
					put(grammarAccess.getAndExprAccess().getOpAssignment_1_0_0_1_0(), "rule__AndExpr__OpAssignment_1_0_0_1_0");
					put(grammarAccess.getAndExprAccess().getOpAssignment_1_0_0_1_1(), "rule__AndExpr__OpAssignment_1_0_0_1_1");
					put(grammarAccess.getAndExprAccess().getRightAssignment_1_1(), "rule__AndExpr__RightAssignment_1_1");
					put(grammarAccess.getInstanceOfExprAccess().getTypeAssignment_1_1(), "rule__InstanceOfExpr__TypeAssignment_1_1");
					put(grammarAccess.getRelationalExprAccess().getOpAssignment_1_0_0_1(), "rule__RelationalExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getRelationalExprAccess().getRightAssignment_1_1(), "rule__RelationalExpr__RightAssignment_1_1");
					put(grammarAccess.getPlusExprAccess().getOpAssignment_1_0_0_1(), "rule__PlusExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getPlusExprAccess().getRightAssignment_1_1(), "rule__PlusExpr__RightAssignment_1_1");
					put(grammarAccess.getTimesExprAccess().getOpAssignment_1_0_0_1(), "rule__TimesExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getTimesExprAccess().getRightAssignment_1_1(), "rule__TimesExpr__RightAssignment_1_1");
					put(grammarAccess.getExpExprAccess().getOpAssignment_1_0_0_1(), "rule__ExpExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getExpExprAccess().getRightAssignment_1_1(), "rule__ExpExpr__RightAssignment_1_1");
					put(grammarAccess.getPrefixExprAccess().getOpAssignment_0_1(), "rule__PrefixExpr__OpAssignment_0_1");
					put(grammarAccess.getPrefixExprAccess().getExprAssignment_0_2(), "rule__PrefixExpr__ExprAssignment_0_2");
					put(grammarAccess.getPrefixExprAccess().getTypeAssignment_1_2(), "rule__PrefixExpr__TypeAssignment_1_2");
					put(grammarAccess.getPrefixExprAccess().getExprAssignment_1_4(), "rule__PrefixExpr__ExprAssignment_1_4");
					put(grammarAccess.getAtomicExprAccess().getIdAssignment_0_1(), "rule__AtomicExpr__IdAssignment_0_1");
					put(grammarAccess.getAtomicExprAccess().getSubAssignment_1_2_1(), "rule__AtomicExpr__SubAssignment_1_2_1");
					put(grammarAccess.getAtomicExprAccess().getValAssignment_2_2_0(), "rule__AtomicExpr__ValAssignment_2_2_0");
					put(grammarAccess.getAtomicExprAccess().getFailmsgAssignment_2_2_1_1(), "rule__AtomicExpr__FailmsgAssignment_2_2_1_1");
					put(grammarAccess.getAtomicExprAccess().getValAssignment_3_1(), "rule__AtomicExpr__ValAssignment_3_1");
					put(grammarAccess.getAtomicExprAccess().getValAssignment_4_1(), "rule__AtomicExpr__ValAssignment_4_1");
					put(grammarAccess.getAtomicExprAccess().getValAssignment_5_1(), "rule__AtomicExpr__ValAssignment_5_1");
					put(grammarAccess.getAtomicExprAccess().getValAssignment_6_1(), "rule__AtomicExpr__ValAssignment_6_1");
					put(grammarAccess.getAtomicExprAccess().getCondAssignment_7_2(), "rule__AtomicExpr__CondAssignment_7_2");
					put(grammarAccess.getAtomicExprAccess().getThenAssignment_7_4(), "rule__AtomicExpr__ThenAssignment_7_4");
					put(grammarAccess.getAtomicExprAccess().getElseAssignment_7_6(), "rule__AtomicExpr__ElseAssignment_7_6");
					put(grammarAccess.getAtomicExprAccess().getQuantAssignment_8_1(), "rule__AtomicExpr__QuantAssignment_8_1");
					put(grammarAccess.getAtomicExprAccess().getArgsAssignment_8_2_1(), "rule__AtomicExpr__ArgsAssignment_8_2_1");
					put(grammarAccess.getAtomicExprAccess().getExprAssignment_8_4(), "rule__AtomicExpr__ExprAssignment_8_4");
					put(grammarAccess.getAtomicExprAccess().getFnAssignment_9_1(), "rule__AtomicExpr__FnAssignment_9_1");
					put(grammarAccess.getAtomicExprAccess().getArgsAssignment_9_3_0(), "rule__AtomicExpr__ArgsAssignment_9_3_0");
					put(grammarAccess.getAtomicExprAccess().getArgsAssignment_9_3_1_1(), "rule__AtomicExpr__ArgsAssignment_9_3_1_1");
					put(grammarAccess.getAtomicExprAccess().getFnAssignment_10_1(), "rule__AtomicExpr__FnAssignment_10_1");
					put(grammarAccess.getAtomicExprAccess().getArgsAssignment_10_3_0(), "rule__AtomicExpr__ArgsAssignment_10_3_0");
					put(grammarAccess.getAtomicExprAccess().getArgsAssignment_10_3_1_1(), "rule__AtomicExpr__ArgsAssignment_10_3_1_1");
					put(grammarAccess.getAtomicExprAccess().getArgsAssignment_11_2_0_2_1(), "rule__AtomicExpr__ArgsAssignment_11_2_0_2_1");
					put(grammarAccess.getAtomicExprAccess().getFilterAssignment_11_2_0_3_1(), "rule__AtomicExpr__FilterAssignment_11_2_0_3_1");
					put(grammarAccess.getAtomicExprAccess().getExprsAssignment_11_2_1_1_1(), "rule__AtomicExpr__ExprsAssignment_11_2_1_1_1");
					put(grammarAccess.getAtomicExprAccess().getArgsAssignment_12_2_0_2_1(), "rule__AtomicExpr__ArgsAssignment_12_2_0_2_1");
					put(grammarAccess.getAtomicExprAccess().getFilterAssignment_12_2_0_3_1(), "rule__AtomicExpr__FilterAssignment_12_2_0_3_1");
					put(grammarAccess.getAtomicExprAccess().getExprsAssignment_12_2_1_1_1(), "rule__AtomicExpr__ExprsAssignment_12_2_1_1_1");
					put(grammarAccess.getAtomicExprAccess().getBindingAssignment_15_2(), "rule__AtomicExpr__BindingAssignment_15_2");
					put(grammarAccess.getAtomicExprAccess().getExprAssignment_15_4(), "rule__AtomicExpr__ExprAssignment_15_4");
					put(grammarAccess.getLetBindingAccess().getNameAssignment_0(), "rule__LetBinding__NameAssignment_0");
					put(grammarAccess.getLetBindingAccess().getTypeAssignment_2(), "rule__LetBinding__TypeAssignment_2");
					put(grammarAccess.getLetBindingAccess().getExprAssignment_4(), "rule__LetBinding__ExprAssignment_4");
					put(grammarAccess.getRealTermAccess().getValueAssignment_0(), "rule__RealTerm__ValueAssignment_0");
					put(grammarAccess.getRealTermAccess().getUnitAssignment_1(), "rule__RealTerm__UnitAssignment_1");
					put(grammarAccess.getIntegerTermAccess().getValueAssignment_0(), "rule__IntegerTerm__ValueAssignment_0");
					put(grammarAccess.getIntegerTermAccess().getUnitAssignment_1(), "rule__IntegerTerm__UnitAssignment_1");
					put(grammarAccess.getResoluteSubclauseAccess().getProvesAssignment_1(), "rule__ResoluteSubclause__ProvesAssignment_1");
					put(grammarAccess.getNestedDotIDAccess().getBaseAssignment_0(), "rule__NestedDotID__BaseAssignment_0");
					put(grammarAccess.getNestedDotIDAccess().getSubAssignment_1_1(), "rule__NestedDotID__SubAssignment_1_1");
					put(grammarAccess.getProveStatementAccess().getExprAssignment_1(), "rule__ProveStatement__ExprAssignment_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getPropertyAssignment_0(), "rule__ContainedPropertyAssociation__PropertyAssignment_0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getAppendAssignment_1_1(), "rule__ContainedPropertyAssociation__AppendAssignment_1_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getConstantAssignment_2(), "rule__ContainedPropertyAssociation__ConstantAssignment_2");
					put(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_0(), "rule__ContainedPropertyAssociation__OwnedValueAssignment_3_0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_1_1(), "rule__ContainedPropertyAssociation__OwnedValueAssignment_3_1_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_1(), "rule__ContainedPropertyAssociation__AppliesToAssignment_4_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_2_1(), "rule__ContainedPropertyAssociation__AppliesToAssignment_4_2_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getInBindingAssignment_5_2(), "rule__ContainedPropertyAssociation__InBindingAssignment_5_2");
					put(grammarAccess.getPropertyAssociationAccess().getPropertyAssignment_0(), "rule__PropertyAssociation__PropertyAssignment_0");
					put(grammarAccess.getPropertyAssociationAccess().getAppendAssignment_1_1(), "rule__PropertyAssociation__AppendAssignment_1_1");
					put(grammarAccess.getPropertyAssociationAccess().getConstantAssignment_2(), "rule__PropertyAssociation__ConstantAssignment_2");
					put(grammarAccess.getPropertyAssociationAccess().getOwnedValueAssignment_3_0(), "rule__PropertyAssociation__OwnedValueAssignment_3_0");
					put(grammarAccess.getPropertyAssociationAccess().getOwnedValueAssignment_3_1_1(), "rule__PropertyAssociation__OwnedValueAssignment_3_1_1");
					put(grammarAccess.getPropertyAssociationAccess().getInBindingAssignment_4_2(), "rule__PropertyAssociation__InBindingAssignment_4_2");
					put(grammarAccess.getBasicPropertyAssociationAccess().getPropertyAssignment_0(), "rule__BasicPropertyAssociation__PropertyAssignment_0");
					put(grammarAccess.getBasicPropertyAssociationAccess().getOwnedValueAssignment_2(), "rule__BasicPropertyAssociation__OwnedValueAssignment_2");
					put(grammarAccess.getContainmentPathAccess().getPathAssignment(), "rule__ContainmentPath__PathAssignment");
					put(grammarAccess.getModalPropertyValueAccess().getOwnedValueAssignment_0(), "rule__ModalPropertyValue__OwnedValueAssignment_0");
					put(grammarAccess.getModalPropertyValueAccess().getInModeAssignment_3(), "rule__ModalPropertyValue__InModeAssignment_3");
					put(grammarAccess.getModalPropertyValueAccess().getInModeAssignment_4_1(), "rule__ModalPropertyValue__InModeAssignment_4_1");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValueAssignment_0(), "rule__OptionalModalPropertyValue__OwnedValueAssignment_0");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_2(), "rule__OptionalModalPropertyValue__InModeAssignment_1_2");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_3_1(), "rule__OptionalModalPropertyValue__InModeAssignment_1_3_1");
					put(grammarAccess.getPropertyValueAccess().getOwnedValueAssignment(), "rule__PropertyValue__OwnedValueAssignment");
					put(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAssignment(), "rule__LiteralorReferenceTerm__NamedValueAssignment");
					put(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1_0(), "rule__BooleanLiteral__ValueAssignment_1_0");
					put(grammarAccess.getConstantValueAccess().getNamedValueAssignment(), "rule__ConstantValue__NamedValueAssignment");
					put(grammarAccess.getReferenceTermAccess().getPathAssignment_2(), "rule__ReferenceTerm__PathAssignment_2");
					put(grammarAccess.getRecordTermAccess().getOwnedFieldValueAssignment_1(), "rule__RecordTerm__OwnedFieldValueAssignment_1");
					put(grammarAccess.getOldRecordTermAccess().getOwnedFieldValueAssignment_1(), "rule__OldRecordTerm__OwnedFieldValueAssignment_1");
					put(grammarAccess.getComputedTermAccess().getFunctionAssignment_2(), "rule__ComputedTerm__FunctionAssignment_2");
					put(grammarAccess.getComponentClassifierTermAccess().getClassifierAssignment_2(), "rule__ComponentClassifierTerm__ClassifierAssignment_2");
					put(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_0(), "rule__ListTerm__OwnedListElementAssignment_2_0");
					put(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_1_1(), "rule__ListTerm__OwnedListElementAssignment_2_1_1");
					put(grammarAccess.getFieldPropertyAssociationAccess().getPropertyAssignment_0(), "rule__FieldPropertyAssociation__PropertyAssignment_0");
					put(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValueAssignment_2(), "rule__FieldPropertyAssociation__OwnedValueAssignment_2");
					put(grammarAccess.getContainmentPathElementAccess().getNamedElementAssignment_0_0(), "rule__ContainmentPathElement__NamedElementAssignment_0_0");
					put(grammarAccess.getContainmentPathElementAccess().getArrayRangeAssignment_0_1(), "rule__ContainmentPathElement__ArrayRangeAssignment_0_1");
					put(grammarAccess.getContainmentPathElementAccess().getPathAssignment_1_1(), "rule__ContainmentPathElement__PathAssignment_1_1");
					put(grammarAccess.getStringTermAccess().getValueAssignment(), "rule__StringTerm__ValueAssignment");
					put(grammarAccess.getArrayRangeAccess().getLowerBoundAssignment_2(), "rule__ArrayRange__LowerBoundAssignment_2");
					put(grammarAccess.getArrayRangeAccess().getUpperBoundAssignment_3_1(), "rule__ArrayRange__UpperBoundAssignment_3_1");
					put(grammarAccess.getSignedConstantAccess().getOpAssignment_0(), "rule__SignedConstant__OpAssignment_0");
					put(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionAssignment_1(), "rule__SignedConstant__OwnedPropertyExpressionAssignment_1");
					put(grammarAccess.getNumericRangeTermAccess().getMinimumAssignment_0(), "rule__NumericRangeTerm__MinimumAssignment_0");
					put(grammarAccess.getNumericRangeTermAccess().getMaximumAssignment_2(), "rule__NumericRangeTerm__MaximumAssignment_2");
					put(grammarAccess.getNumericRangeTermAccess().getDeltaAssignment_3_1(), "rule__NumericRangeTerm__DeltaAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.rockwellcollins.atc.resolute.ui.contentassist.antlr.internal.InternalResoluteParser typedParser = (com.rockwellcollins.atc.resolute.ui.contentassist.antlr.internal.InternalResoluteParser) parser;
			typedParser.entryRuleAnnexLibrary();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}
	
	public ResoluteGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ResoluteGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
