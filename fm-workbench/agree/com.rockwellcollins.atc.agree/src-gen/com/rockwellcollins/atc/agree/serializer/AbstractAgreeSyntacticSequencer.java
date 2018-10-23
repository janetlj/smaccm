/*
 * generated by Xtext
 */
package com.rockwellcollins.atc.agree.serializer;

import com.google.inject.Inject;
import com.rockwellcollins.atc.agree.services.AgreeGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractAgreeSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AgreeGrammarAccess grammarAccess;
	protected AbstractElementAlias match_TermExpr_LeftParenthesisKeyword_18_0_a;
	protected AbstractElementAlias match_TermExpr_LeftParenthesisKeyword_18_0_p;
	protected AbstractElementAlias match_WheneverStatement_OccurKeyword_0_0_0_6_0_or_OccursKeyword_0_0_0_6_1;
	protected AbstractElementAlias match_WheneverStatement_OccurKeyword_1_0_0_7_0_or_OccursKeyword_1_0_0_7_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AgreeGrammarAccess) access;
		match_TermExpr_LeftParenthesisKeyword_18_0_a = new TokenAlias(true, true, grammarAccess.getTermExprAccess().getLeftParenthesisKeyword_18_0());
		match_TermExpr_LeftParenthesisKeyword_18_0_p = new TokenAlias(true, false, grammarAccess.getTermExprAccess().getLeftParenthesisKeyword_18_0());
		match_WheneverStatement_OccurKeyword_0_0_0_6_0_or_OccursKeyword_0_0_0_6_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getWheneverStatementAccess().getOccurKeyword_0_0_0_6_0()), new TokenAlias(false, false, grammarAccess.getWheneverStatementAccess().getOccursKeyword_0_0_0_6_1()));
		match_WheneverStatement_OccurKeyword_1_0_0_7_0_or_OccursKeyword_1_0_0_7_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getWheneverStatementAccess().getOccurKeyword_1_0_0_7_0()), new TokenAlias(false, false, grammarAccess.getWheneverStatementAccess().getOccursKeyword_1_0_0_7_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getAppliesToKeywordsRule())
			return getAppliesToKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getInBindingKeywordsRule())
			return getInBindingKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getInModesKeywordsRule())
			return getInModesKeywordsToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * AppliesToKeywords:
	 * 	'applies' 'to'
	 * ;
	 */
	protected String getAppliesToKeywordsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "appliesto";
	}
	
	/**
	 * InBindingKeywords:
	 * 	'in' 'binding'
	 * ;
	 */
	protected String getInBindingKeywordsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "inbinding";
	}
	
	/**
	 * InModesKeywords:
	 * 	'in' 'modes'
	 * ;
	 */
	protected String getInModesKeywordsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "inmodes";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_TermExpr_LeftParenthesisKeyword_18_0_a.equals(syntax))
				emit_TermExpr_LeftParenthesisKeyword_18_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TermExpr_LeftParenthesisKeyword_18_0_p.equals(syntax))
				emit_TermExpr_LeftParenthesisKeyword_18_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_WheneverStatement_OccurKeyword_0_0_0_6_0_or_OccursKeyword_0_0_0_6_1.equals(syntax))
				emit_WheneverStatement_OccurKeyword_0_0_0_6_0_or_OccursKeyword_0_0_0_6_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_WheneverStatement_OccurKeyword_1_0_0_7_0_or_OccursKeyword_1_0_0_7_1.equals(syntax))
				emit_WheneverStatement_OccurKeyword_1_0_0_7_0_or_OccursKeyword_1_0_0_7_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'Get_Property' '(' componentRef=ComponentRef
	 *     (rule start) (ambiguity) '[|' elems+=Expr
	 *     (rule start) (ambiguity) 'enum' '(' enumType=CustomType
	 *     (rule start) (ambiguity) 'event' '(' id=Expr
	 *     (rule start) (ambiguity) 'exists' binding=ArraySubBinding
	 *     (rule start) (ambiguity) 'floor' '(' expr=Expr
	 *     (rule start) (ambiguity) 'foldl' binding=ArraySubBinding
	 *     (rule start) (ambiguity) 'foldr' binding=ArraySubBinding
	 *     (rule start) (ambiguity) 'forall' binding=ArraySubBinding
	 *     (rule start) (ambiguity) 'foreach' binding=ArraySubBinding
	 *     (rule start) (ambiguity) 'if' a=Expr
	 *     (rule start) (ambiguity) 'indices' '(' array=Expr
	 *     (rule start) (ambiguity) 'latched' '(' expr=Expr
	 *     (rule start) (ambiguity) 'pre' '(' expr=Expr
	 *     (rule start) (ambiguity) 'prev' '(' delay=Expr
	 *     (rule start) (ambiguity) 'real' '(' expr=Expr
	 *     (rule start) (ambiguity) 'time' (rule start)
	 *     (rule start) (ambiguity) 'timefall' '(' id=[NamedElement|ID]
	 *     (rule start) (ambiguity) 'timeof' '(' id=[NamedElement|ID]
	 *     (rule start) (ambiguity) 'timerise' '(' id=[NamedElement|ID]
	 *     (rule start) (ambiguity) abstractionRef=AbstractionRef
	 *     (rule start) (ambiguity) namedElm=[NamedElement|EID]
	 *     (rule start) (ambiguity) op='-'
	 *     (rule start) (ambiguity) op='not'
	 *     (rule start) (ambiguity) recordType=CustomType
	 *     (rule start) (ambiguity) val=BooleanLiteral
	 *     (rule start) (ambiguity) val=INTEGER_LIT
	 *     (rule start) (ambiguity) val=REAL_LIT
	 *     (rule start) (ambiguity) {ArraySubExpr.expr=}
	 *     (rule start) (ambiguity) {ArrayUpdateExpr.array=}
	 *     (rule start) (ambiguity) {BinaryExpr.left=}
	 *     (rule start) (ambiguity) {ProjectionExpr.expr=}
	 *     (rule start) (ambiguity) {RecordUpdateExpr.record=}
	 *     (rule start) (ambiguity) {TagExpr.stem=}
	 */
	protected void emit_TermExpr_LeftParenthesisKeyword_18_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'Get_Property' '(' componentRef=ComponentRef
	 *     (rule start) (ambiguity) 'exists' binding=ArraySubBinding
	 *     (rule start) (ambiguity) 'foldl' binding=ArraySubBinding
	 *     (rule start) (ambiguity) 'foldr' binding=ArraySubBinding
	 *     (rule start) (ambiguity) 'forall' binding=ArraySubBinding
	 *     (rule start) (ambiguity) 'foreach' binding=ArraySubBinding
	 *     (rule start) (ambiguity) 'if' a=Expr
	 *     (rule start) (ambiguity) 'prev' '(' delay=Expr
	 *     (rule start) (ambiguity) op='-'
	 *     (rule start) (ambiguity) op='not'
	 *     (rule start) (ambiguity) {ArraySubExpr.expr=}
	 *     (rule start) (ambiguity) {ArrayUpdateExpr.array=}
	 *     (rule start) (ambiguity) {BinaryExpr.left=}
	 *     (rule start) (ambiguity) {ProjectionExpr.expr=}
	 *     (rule start) (ambiguity) {RecordUpdateExpr.record=}
	 *     (rule start) (ambiguity) {TagExpr.stem=}
	 */
	protected void emit_TermExpr_LeftParenthesisKeyword_18_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'occur' | 'occurs'
	 *
	 * This ambiguous syntax occurs at:
	 *     effect=Expr (ambiguity) 'during' interval=TimeInterval
	 *     effect=Expr (ambiguity) (rule end)
	 *     excl='exclusively' (ambiguity) 'during' interval=TimeInterval
	 *     excl='exclusively' (ambiguity) (rule end)
	 */
	protected void emit_WheneverStatement_OccurKeyword_0_0_0_6_0_or_OccursKeyword_0_0_0_6_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'occurs' | 'occur'
	 *
	 * This ambiguous syntax occurs at:
	 *     effect=Expr (ambiguity) 'during' interval=TimeInterval
	 *     effect=Expr (ambiguity) (rule end)
	 *     excl='exclusively' (ambiguity) 'during' interval=TimeInterval
	 *     excl='exclusively' (ambiguity) (rule end)
	 */
	protected void emit_WheneverStatement_OccurKeyword_1_0_0_7_0_or_OccursKeyword_1_0_0_7_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
