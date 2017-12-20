package com.rockwellcollins.atc.agree.parser.antlr.internal;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;

import com.rockwellcollins.atc.agree.services.AgreeGrammarAccess;

@SuppressWarnings("all")
public class InternalAgreeParser extends AbstractInternalAntlrParser {
	public static final String[] tokenNames = new String[] { "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Linearization",
			"Get_Property", "Asynchronous", "Agree_input", "Exclusively", "Classifier", "Connection", "Condition",
			"Guarantee", "Initially", "No_simult", "Parameter", "Reference", "Synchrony", "Calendar", "Constant",
			"External", "Ordering", "Property", "Sporadic", "Timefall", "Timerise", "Whenever", "KW__INSERT",
			"KW__REMOVE", "Applies", "Becomes", "Binding", "Compute", "Implies", "Latched", "Returns", "KW__COUNT",
			"Always", "Assert", "Assign", "Assume", "During", "Jitter", "Occurs", "Raises", "Simult", "Struct",
			"Timeof", "Within", "Const", "Delta", "Event", "False", "Floor", "Holds", "Lemma", "Modes", "Occur",
			"Times", "KW__CLK", "Bool", "Each", "Else", "Enum", "Lift", "Node", "Over", "Prev", "Real", "Then", "This",
			"Time", "True", "Type", "When", "With", "PlusSignEqualsSignGreaterThanSign",
			"LessThanSignEqualsSignGreaterThanSign", "IAT", "And", "Div", "Fun", "Int", "Let", "Mod", "Not", "Pre",
			"Tel", "Var", "ExclamationMarkEqualsSign", "HyphenMinusGreaterThanSign", "FullStopFullStop", "ColonColon",
			"ColonEqualsSign", "LessThanSignEqualsSign", "LessThanSignGreaterThanSign", "EqualsSignGreaterThanSign",
			"GreaterThanSignEqualsSign", "Eq", "If", "In", "Or", "To", "LeftParenthesis", "RightParenthesis",
			"Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "Semicolon", "LessThanSign",
			"EqualsSign", "GreaterThanSign", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent",
			"LeftCurlyBracket", "RightCurlyBracket", "RULE_SL_COMMENT", "RULE_DIGIT", "RULE_EXPONENT",
			"RULE_INT_EXPONENT", "RULE_REAL_LIT", "RULE_BASED_INTEGER", "RULE_INTEGER_LIT", "RULE_EXTENDED_DIGIT",
			"RULE_STRING", "RULE_ID", "RULE_WS" };
	public static final int Enum = 63;
	public static final int Each = 61;
	public static final int LessThanSignGreaterThanSign = 95;
	public static final int Asynchronous = 6;
	public static final int Or = 101;
	public static final int Sporadic = 23;
	public static final int EqualsSignGreaterThanSign = 96;
	public static final int Var = 88;
	public static final int Node = 65;
	public static final int Get_Property = 5;
	public static final int False = 52;
	public static final int LessThanSign = 113;
	public static final int Lift = 64;
	public static final int Assert = 38;
	public static final int PlusSignEqualsSignGreaterThanSign = 76;
	public static final int LeftParenthesis = 103;
	public static final int Bool = 60;
	public static final int Then = 69;
	public static final int Linearization = 4;
	public static final int GreaterThanSign = 115;
	public static final int Timerise = 25;
	public static final int RULE_ID = 130;
	public static final int RULE_DIGIT = 122;
	public static final int Initially = 13;
	public static final int GreaterThanSignEqualsSign = 97;
	public static final int ColonColon = 92;
	public static final int PlusSign = 106;
	public static final int Becomes = 30;
	public static final int LeftSquareBracket = 116;
	public static final int Always = 37;
	public static final int Simult = 45;
	public static final int IAT = 78;
	public static final int If = 99;
	public static final int Synchrony = 17;
	public static final int In = 100;
	public static final int RULE_REAL_LIT = 125;
	public static final int Jitter = 42;
	public static final int LessThanSignEqualsSignGreaterThanSign = 77;
	public static final int Classifier = 9;
	public static final int Occur = 57;
	public static final int Comma = 107;
	public static final int Raises = 44;
	public static final int HyphenMinus = 108;
	public static final int Occurs = 43;
	public static final int Guarantee = 12;
	public static final int LessThanSignEqualsSign = 94;
	public static final int Solidus = 110;
	public static final int RightCurlyBracket = 120;
	public static final int Property = 22;
	public static final int Holds = 54;
	public static final int Fun = 81;
	public static final int Modes = 56;
	public static final int FullStop = 109;
	public static final int Reference = 16;
	public static final int Calendar = 18;
	public static final int Connection = 10;
	public static final int Div = 80;
	public static final int Semicolon = 112;
	public static final int Type = 73;
	public static final int RULE_EXPONENT = 123;
	public static final int KW__REMOVE = 28;
	public static final int When = 74;
	public static final int Delta = 50;
	public static final int Prev = 67;
	public static final int Exclusively = 8;
	public static final int Else = 62;
	public static final int RULE_EXTENDED_DIGIT = 128;
	public static final int Parameter = 15;
	public static final int Event = 51;
	public static final int KW__CLK = 59;
	public static final int Assign = 39;
	public static final int ExclamationMarkEqualsSign = 89;
	public static final int HyphenMinusGreaterThanSign = 90;
	public static final int No_simult = 14;
	public static final int Pre = 86;
	public static final int True = 72;
	public static final int Agree_input = 7;
	public static final int RULE_INT_EXPONENT = 124;
	public static final int Returns = 35;
	public static final int Implies = 33;
	public static final int FullStopFullStop = 91;
	public static final int Ordering = 21;
	public static final int Real = 68;
	public static final int This = 70;
	public static final int To = 102;
	public static final int Applies = 29;
	public static final int RULE_BASED_INTEGER = 126;
	public static final int RightSquareBracket = 117;
	public static final int Binding = 31;
	public static final int Const = 49;
	public static final int RightParenthesis = 104;
	public static final int ColonEqualsSign = 93;
	public static final int Not = 85;
	public static final int Latched = 34;
	public static final int And = 79;
	public static final int External = 20;
	public static final int Assume = 40;
	public static final int RULE_INTEGER_LIT = 127;
	public static final int Constant = 19;
	public static final int Time = 71;
	public static final int RULE_STRING = 129;
	public static final int KW__INSERT = 27;
	public static final int Eq = 98;
	public static final int During = 41;
	public static final int Int = 82;
	public static final int Struct = 46;
	public static final int With = 75;
	public static final int RULE_SL_COMMENT = 121;
	public static final int Over = 66;
	public static final int EqualsSign = 114;
	public static final int Timeof = 47;
	public static final int Lemma = 55;
	public static final int KW__COUNT = 36;
	public static final int Colon = 111;
	public static final int EOF = -1;
	public static final int Whenever = 26;
	public static final int Asterisk = 105;
	public static final int Condition = 11;
	public static final int Floor = 53;
	public static final int Mod = 84;
	public static final int RULE_WS = 131;
	public static final int LeftCurlyBracket = 119;
	public static final int CircumflexAccent = 118;
	public static final int Compute = 32;
	public static final int Times = 58;
	public static final int Timefall = 24;
	public static final int Within = 48;
	public static final int Let = 83;
	public static final int Tel = 87;

	// delegates
	// delegators

	public InternalAgreeParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public InternalAgreeParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);

	}

	@Override
	public String[] getTokenNames() {
		return InternalAgreeParser.tokenNames;
	}

	@Override
	public String getGrammarFileName() {
		return "InternalAgreeParser.g";
	}

	private AgreeGrammarAccess grammarAccess;

	public InternalAgreeParser(TokenStream input, AgreeGrammarAccess grammarAccess) {
		this(input);
		this.grammarAccess = grammarAccess;
		registerRules(grammarAccess.getGrammar());
	}

	@Override
	protected String getFirstRuleName() {
		return "NamedElement";
	}

	@Override
	protected AgreeGrammarAccess getGrammarAccess() {
		return grammarAccess;
	}

	// $ANTLR start "entryRuleNamedElement"
	// InternalAgreeParser.g:61:1: entryRuleNamedElement returns [EObject current=null] : iv_ruleNamedElement= ruleNamedElement EOF ;
	public final EObject entryRuleNamedElement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNamedElement = null;

		try {
			// InternalAgreeParser.g:62:2: (iv_ruleNamedElement= ruleNamedElement EOF )
			// InternalAgreeParser.g:63:2: iv_ruleNamedElement= ruleNamedElement EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getNamedElementRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleNamedElement = ruleNamedElement();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleNamedElement;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleNamedElement"

	// $ANTLR start "ruleNamedElement"
	// InternalAgreeParser.g:70:1: ruleNamedElement returns [EObject current=null] : (this_Arg_0= ruleArg | this_FnDefExpr_1= ruleFnDefExpr |
	// this_PropertyStatement_2= rulePropertyStatement | this_ConstStatement_3= ruleConstStatement | this_EnumStatement_4= ruleEnumStatement |
	// this_NodeDefExpr_5= ruleNodeDefExpr | this_LinearizationDefExpr_6= ruleLinearizationDefExpr | this_LibraryFnDefExpr_7= ruleLibraryFnDefExpr |
	// this_RecordDefExpr_8= ruleRecordDefExpr | this_NamedID_9= ruleNamedID ) ;
	public final EObject ruleNamedElement() throws RecognitionException {
		EObject current = null;

		EObject this_Arg_0 = null;

		EObject this_FnDefExpr_1 = null;

		EObject this_PropertyStatement_2 = null;

		EObject this_ConstStatement_3 = null;

		EObject this_EnumStatement_4 = null;

		EObject this_NodeDefExpr_5 = null;

		EObject this_LinearizationDefExpr_6 = null;

		EObject this_LibraryFnDefExpr_7 = null;

		EObject this_RecordDefExpr_8 = null;

		EObject this_NamedID_9 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:73:28: ( (this_Arg_0= ruleArg | this_FnDefExpr_1= ruleFnDefExpr | this_PropertyStatement_2= rulePropertyStatement |
			// this_ConstStatement_3= ruleConstStatement | this_EnumStatement_4= ruleEnumStatement | this_NodeDefExpr_5= ruleNodeDefExpr |
			// this_LinearizationDefExpr_6= ruleLinearizationDefExpr | this_LibraryFnDefExpr_7= ruleLibraryFnDefExpr | this_RecordDefExpr_8= ruleRecordDefExpr |
			// this_NamedID_9= ruleNamedID ) )
			// InternalAgreeParser.g:74:1: (this_Arg_0= ruleArg | this_FnDefExpr_1= ruleFnDefExpr | this_PropertyStatement_2= rulePropertyStatement |
			// this_ConstStatement_3= ruleConstStatement | this_EnumStatement_4= ruleEnumStatement | this_NodeDefExpr_5= ruleNodeDefExpr |
			// this_LinearizationDefExpr_6= ruleLinearizationDefExpr | this_LibraryFnDefExpr_7= ruleLibraryFnDefExpr | this_RecordDefExpr_8= ruleRecordDefExpr |
			// this_NamedID_9= ruleNamedID )
			{
				// InternalAgreeParser.g:74:1: (this_Arg_0= ruleArg | this_FnDefExpr_1= ruleFnDefExpr | this_PropertyStatement_2= rulePropertyStatement |
				// this_ConstStatement_3= ruleConstStatement | this_EnumStatement_4= ruleEnumStatement | this_NodeDefExpr_5= ruleNodeDefExpr |
				// this_LinearizationDefExpr_6= ruleLinearizationDefExpr | this_LibraryFnDefExpr_7= ruleLibraryFnDefExpr | this_RecordDefExpr_8=
				// ruleRecordDefExpr | this_NamedID_9= ruleNamedID )
				int alt1 = 10;
				alt1 = dfa1.predict(input);
				switch (alt1) {
				case 1:
				// InternalAgreeParser.g:75:5: this_Arg_0= ruleArg
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getNamedElementAccess().getArgParserRuleCall_0());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_Arg_0 = ruleArg();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_Arg_0;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:85:5: this_FnDefExpr_1= ruleFnDefExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getNamedElementAccess().getFnDefExprParserRuleCall_1());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_FnDefExpr_1 = ruleFnDefExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_FnDefExpr_1;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 3:
				// InternalAgreeParser.g:95:5: this_PropertyStatement_2= rulePropertyStatement
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getNamedElementAccess().getPropertyStatementParserRuleCall_2());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_PropertyStatement_2 = rulePropertyStatement();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_PropertyStatement_2;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 4:
				// InternalAgreeParser.g:105:5: this_ConstStatement_3= ruleConstStatement
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getNamedElementAccess().getConstStatementParserRuleCall_3());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_ConstStatement_3 = ruleConstStatement();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_ConstStatement_3;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 5:
				// InternalAgreeParser.g:115:5: this_EnumStatement_4= ruleEnumStatement
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getNamedElementAccess().getEnumStatementParserRuleCall_4());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_EnumStatement_4 = ruleEnumStatement();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_EnumStatement_4;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 6:
				// InternalAgreeParser.g:125:5: this_NodeDefExpr_5= ruleNodeDefExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getNamedElementAccess().getNodeDefExprParserRuleCall_5());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_NodeDefExpr_5 = ruleNodeDefExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_NodeDefExpr_5;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 7:
				// InternalAgreeParser.g:135:5: this_LinearizationDefExpr_6= ruleLinearizationDefExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(
								grammarAccess.getNamedElementAccess().getLinearizationDefExprParserRuleCall_6());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_LinearizationDefExpr_6 = ruleLinearizationDefExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_LinearizationDefExpr_6;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 8:
				// InternalAgreeParser.g:145:5: this_LibraryFnDefExpr_7= ruleLibraryFnDefExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getNamedElementAccess().getLibraryFnDefExprParserRuleCall_7());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_LibraryFnDefExpr_7 = ruleLibraryFnDefExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_LibraryFnDefExpr_7;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 9:
				// InternalAgreeParser.g:155:5: this_RecordDefExpr_8= ruleRecordDefExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getNamedElementAccess().getRecordDefExprParserRuleCall_8());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_RecordDefExpr_8 = ruleRecordDefExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_RecordDefExpr_8;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 10:
				// InternalAgreeParser.g:165:5: this_NamedID_9= ruleNamedID
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getNamedElementAccess().getNamedIDParserRuleCall_9());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_NamedID_9 = ruleNamedID();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_NamedID_9;
						afterParserOrEnumRuleCall();

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleNamedElement"

	// $ANTLR start "entryRuleAgreeLibrary"
	// InternalAgreeParser.g:187:1: entryRuleAgreeLibrary returns [EObject current=null] : iv_ruleAgreeLibrary= ruleAgreeLibrary EOF ;
	public final EObject entryRuleAgreeLibrary() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleAgreeLibrary = null;

		try {
			// InternalAgreeParser.g:188:2: (iv_ruleAgreeLibrary= ruleAgreeLibrary EOF )
			// InternalAgreeParser.g:189:2: iv_ruleAgreeLibrary= ruleAgreeLibrary EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getAgreeLibraryRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleAgreeLibrary = ruleAgreeLibrary();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleAgreeLibrary;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleAgreeLibrary"

	// $ANTLR start "ruleAgreeLibrary"
	// InternalAgreeParser.g:196:1: ruleAgreeLibrary returns [EObject current=null] : ( () ( (lv_contract_1_0= ruleAgreeContract ) ) ) ;
	public final EObject ruleAgreeLibrary() throws RecognitionException {
		EObject current = null;

		EObject lv_contract_1_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:199:28: ( ( () ( (lv_contract_1_0= ruleAgreeContract ) ) ) )
			// InternalAgreeParser.g:200:1: ( () ( (lv_contract_1_0= ruleAgreeContract ) ) )
			{
				// InternalAgreeParser.g:200:1: ( () ( (lv_contract_1_0= ruleAgreeContract ) ) )
				// InternalAgreeParser.g:200:2: () ( (lv_contract_1_0= ruleAgreeContract ) )
				{
					// InternalAgreeParser.g:200:2: ()
					// InternalAgreeParser.g:201:5:
					{
						if (state.backtracking == 0) {

							current = forceCreateModelElement(
									grammarAccess.getAgreeLibraryAccess().getAgreeContractLibraryAction_0(), current);

						}

					}

					// InternalAgreeParser.g:206:2: ( (lv_contract_1_0= ruleAgreeContract ) )
					// InternalAgreeParser.g:207:1: (lv_contract_1_0= ruleAgreeContract )
					{
						// InternalAgreeParser.g:207:1: (lv_contract_1_0= ruleAgreeContract )
						// InternalAgreeParser.g:208:3: lv_contract_1_0= ruleAgreeContract
						{
							if (state.backtracking == 0) {

								newCompositeNode(grammarAccess.getAgreeLibraryAccess()
										.getContractAgreeContractParserRuleCall_1_0());

							}
							pushFollow(FollowSets000.FOLLOW_2);
							lv_contract_1_0 = ruleAgreeContract();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getAgreeLibraryRule());
								}
								set(current, "contract", lv_contract_1_0,
										"com.rockwellcollins.atc.agree.Agree.AgreeContract");
								afterParserOrEnumRuleCall();

							}

						}

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleAgreeLibrary"

	// $ANTLR start "entryRuleAgreeSubclause"
	// InternalAgreeParser.g:232:1: entryRuleAgreeSubclause returns [EObject current=null] : iv_ruleAgreeSubclause= ruleAgreeSubclause EOF ;
	public final EObject entryRuleAgreeSubclause() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleAgreeSubclause = null;

		try {
			// InternalAgreeParser.g:233:2: (iv_ruleAgreeSubclause= ruleAgreeSubclause EOF )
			// InternalAgreeParser.g:234:2: iv_ruleAgreeSubclause= ruleAgreeSubclause EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getAgreeSubclauseRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleAgreeSubclause = ruleAgreeSubclause();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleAgreeSubclause;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleAgreeSubclause"

	// $ANTLR start "ruleAgreeSubclause"
	// InternalAgreeParser.g:241:1: ruleAgreeSubclause returns [EObject current=null] : ( () ( (lv_contract_1_0= ruleAgreeContract ) ) ) ;
	public final EObject ruleAgreeSubclause() throws RecognitionException {
		EObject current = null;

		EObject lv_contract_1_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:244:28: ( ( () ( (lv_contract_1_0= ruleAgreeContract ) ) ) )
			// InternalAgreeParser.g:245:1: ( () ( (lv_contract_1_0= ruleAgreeContract ) ) )
			{
				// InternalAgreeParser.g:245:1: ( () ( (lv_contract_1_0= ruleAgreeContract ) ) )
				// InternalAgreeParser.g:245:2: () ( (lv_contract_1_0= ruleAgreeContract ) )
				{
					// InternalAgreeParser.g:245:2: ()
					// InternalAgreeParser.g:246:5:
					{
						if (state.backtracking == 0) {

							current = forceCreateModelElement(
									grammarAccess.getAgreeSubclauseAccess().getAgreeContractSubclauseAction_0(),
									current);

						}

					}

					// InternalAgreeParser.g:251:2: ( (lv_contract_1_0= ruleAgreeContract ) )
					// InternalAgreeParser.g:252:1: (lv_contract_1_0= ruleAgreeContract )
					{
						// InternalAgreeParser.g:252:1: (lv_contract_1_0= ruleAgreeContract )
						// InternalAgreeParser.g:253:3: lv_contract_1_0= ruleAgreeContract
						{
							if (state.backtracking == 0) {

								newCompositeNode(grammarAccess.getAgreeSubclauseAccess()
										.getContractAgreeContractParserRuleCall_1_0());

							}
							pushFollow(FollowSets000.FOLLOW_2);
							lv_contract_1_0 = ruleAgreeContract();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getAgreeSubclauseRule());
								}
								set(current, "contract", lv_contract_1_0,
										"com.rockwellcollins.atc.agree.Agree.AgreeContract");
								afterParserOrEnumRuleCall();

							}

						}

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleAgreeSubclause"

	// $ANTLR start "entryRuleAgreeContract"
	// InternalAgreeParser.g:277:1: entryRuleAgreeContract returns [EObject current=null] : iv_ruleAgreeContract= ruleAgreeContract EOF ;
	public final EObject entryRuleAgreeContract() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleAgreeContract = null;

		try {
			// InternalAgreeParser.g:278:2: (iv_ruleAgreeContract= ruleAgreeContract EOF )
			// InternalAgreeParser.g:279:2: iv_ruleAgreeContract= ruleAgreeContract EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getAgreeContractRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleAgreeContract = ruleAgreeContract();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleAgreeContract;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleAgreeContract"

	// $ANTLR start "ruleAgreeContract"
	// InternalAgreeParser.g:286:1: ruleAgreeContract returns [EObject current=null] : ( () ( (lv_specs_1_0= ruleSpecStatement ) )* ) ;
	public final EObject ruleAgreeContract() throws RecognitionException {
		EObject current = null;

		EObject lv_specs_1_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:289:28: ( ( () ( (lv_specs_1_0= ruleSpecStatement ) )* ) )
			// InternalAgreeParser.g:290:1: ( () ( (lv_specs_1_0= ruleSpecStatement ) )* )
			{
				// InternalAgreeParser.g:290:1: ( () ( (lv_specs_1_0= ruleSpecStatement ) )* )
				// InternalAgreeParser.g:290:2: () ( (lv_specs_1_0= ruleSpecStatement ) )*
				{
					// InternalAgreeParser.g:290:2: ()
					// InternalAgreeParser.g:291:5:
					{
						if (state.backtracking == 0) {

							current = forceCreateModelElement(
									grammarAccess.getAgreeContractAccess().getAgreeContractAction_0(), current);

						}

					}

					// InternalAgreeParser.g:296:2: ( (lv_specs_1_0= ruleSpecStatement ) )*
					loop2: do {
						int alt2 = 2;
						int LA2_0 = input.LA(1);

						if ((LA2_0 == Linearization || LA2_0 == Agree_input || LA2_0 == Connection
								|| (LA2_0 >= Guarantee && LA2_0 <= Initially) || LA2_0 == Parameter
								|| (LA2_0 >= Synchrony && LA2_0 <= Calendar) || (LA2_0 >= External && LA2_0 <= Property)
								|| (LA2_0 >= Assert && LA2_0 <= Assume) || LA2_0 == Const || LA2_0 == Lemma
								|| (LA2_0 >= Enum && LA2_0 <= Node) || LA2_0 == Type || LA2_0 == Fun || LA2_0 == Eq)) {
							alt2 = 1;
						}

						switch (alt2) {
						case 1:
						// InternalAgreeParser.g:297:1: (lv_specs_1_0= ruleSpecStatement )
						{
							// InternalAgreeParser.g:297:1: (lv_specs_1_0= ruleSpecStatement )
							// InternalAgreeParser.g:298:3: lv_specs_1_0= ruleSpecStatement
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getAgreeContractAccess()
											.getSpecsSpecStatementParserRuleCall_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_3);
								lv_specs_1_0 = ruleSpecStatement();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getAgreeContractRule());
									}
									add(current, "specs", lv_specs_1_0,
											"com.rockwellcollins.atc.agree.Agree.SpecStatement");
									afterParserOrEnumRuleCall();

								}

							}

						}
							break;

						default:
							break loop2;
						}
					} while (true);

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleAgreeContract"

	// $ANTLR start "entryRuleSpecStatement"
	// InternalAgreeParser.g:322:1: entryRuleSpecStatement returns [EObject current=null] : iv_ruleSpecStatement= ruleSpecStatement EOF ;
	public final EObject entryRuleSpecStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSpecStatement = null;

		try {
			// InternalAgreeParser.g:323:2: (iv_ruleSpecStatement= ruleSpecStatement EOF )
			// InternalAgreeParser.g:324:2: iv_ruleSpecStatement= ruleSpecStatement EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getSpecStatementRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleSpecStatement = ruleSpecStatement();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleSpecStatement;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleSpecStatement"

	// $ANTLR start "ruleSpecStatement"
	// InternalAgreeParser.g:331:1: ruleSpecStatement returns [EObject current=null] : ( ( () otherlv_1= Assume ( (lv_str_2_0= RULE_STRING ) ) otherlv_3= Colon
	// ( ( (lv_expr_4_0= ruleExpr ) ) | ( (lv_pattern_5_0= rulePatternStatement ) ) ) otherlv_6= Semicolon ) | ( () otherlv_8= Guarantee ( (lv_str_9_0=
	// RULE_STRING ) ) otherlv_10= Colon ( ( (lv_expr_11_0= ruleExpr ) ) | ( (lv_pattern_12_0= rulePatternStatement ) ) ) otherlv_13= Semicolon ) | ( ()
	// otherlv_15= Assert ( ( (lv_str_16_0= RULE_STRING ) ) otherlv_17= Colon )? ( ( (lv_expr_18_0= ruleExpr ) ) | ( (lv_pattern_19_0= rulePatternStatement ) )
	// ) otherlv_20= Semicolon ) | ( () otherlv_22= Initially otherlv_23= Colon ( (lv_expr_24_0= ruleExpr ) ) otherlv_25= Semicolon ) | ( () otherlv_27=
	// Parameter ( (lv_expr_28_0= ruleExpr ) ) otherlv_29= Colon ( (lv_type_30_0= ruleType ) ) otherlv_31= Semicolon ) | ( () otherlv_33= Lemma ( (lv_str_34_0=
	// RULE_STRING ) ) otherlv_35= Colon ( ( (lv_expr_36_0= ruleExpr ) ) | ( (lv_pattern_37_0= rulePatternStatement ) ) ) otherlv_38= Semicolon ) | ( ()
	// otherlv_40= Lift ( (lv_subcomp_41_0= ruleNestedDotID ) ) otherlv_42= Semicolon ) | ( () otherlv_44= Connection ( (otherlv_45= RULE_ID ) ) otherlv_46=
	// Colon ( (lv_expr_47_0= ruleExpr ) ) otherlv_48= Semicolon ) | this_SynchStatement_49= ruleSynchStatement | this_OrderStatement_50= ruleOrderStatement |
	// this_PropertyStatement_51= rulePropertyStatement | this_ConstStatement_52= ruleConstStatement | this_EnumStatement_53= ruleEnumStatement |
	// this_EqStatement_54= ruleEqStatement | this_AssignStatement_55= ruleAssignStatement | this_LinearizationDefExpr_56= ruleLinearizationDefExpr |
	// this_FnDefExpr_57= ruleFnDefExpr | this_LibraryFnDefExpr_58= ruleLibraryFnDefExpr | this_NodeDefExpr_59= ruleNodeDefExpr | this_RecordDefExpr_60=
	// ruleRecordDefExpr | this_InputStatement_61= ruleInputStatement ) ;
	public final EObject ruleSpecStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token lv_str_2_0 = null;
		Token otherlv_3 = null;
		Token otherlv_6 = null;
		Token otherlv_8 = null;
		Token lv_str_9_0 = null;
		Token otherlv_10 = null;
		Token otherlv_13 = null;
		Token otherlv_15 = null;
		Token lv_str_16_0 = null;
		Token otherlv_17 = null;
		Token otherlv_20 = null;
		Token otherlv_22 = null;
		Token otherlv_23 = null;
		Token otherlv_25 = null;
		Token otherlv_27 = null;
		Token otherlv_29 = null;
		Token otherlv_31 = null;
		Token otherlv_33 = null;
		Token lv_str_34_0 = null;
		Token otherlv_35 = null;
		Token otherlv_38 = null;
		Token otherlv_40 = null;
		Token otherlv_42 = null;
		Token otherlv_44 = null;
		Token otherlv_45 = null;
		Token otherlv_46 = null;
		Token otherlv_48 = null;
		EObject lv_expr_4_0 = null;

		EObject lv_pattern_5_0 = null;

		EObject lv_expr_11_0 = null;

		EObject lv_pattern_12_0 = null;

		EObject lv_expr_18_0 = null;

		EObject lv_pattern_19_0 = null;

		EObject lv_expr_24_0 = null;

		EObject lv_expr_28_0 = null;

		EObject lv_type_30_0 = null;

		EObject lv_expr_36_0 = null;

		EObject lv_pattern_37_0 = null;

		EObject lv_subcomp_41_0 = null;

		EObject lv_expr_47_0 = null;

		EObject this_SynchStatement_49 = null;

		EObject this_OrderStatement_50 = null;

		EObject this_PropertyStatement_51 = null;

		EObject this_ConstStatement_52 = null;

		EObject this_EnumStatement_53 = null;

		EObject this_EqStatement_54 = null;

		EObject this_AssignStatement_55 = null;

		EObject this_LinearizationDefExpr_56 = null;

		EObject this_FnDefExpr_57 = null;

		EObject this_LibraryFnDefExpr_58 = null;

		EObject this_NodeDefExpr_59 = null;

		EObject this_RecordDefExpr_60 = null;

		EObject this_InputStatement_61 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:334:28: ( ( ( () otherlv_1= Assume ( (lv_str_2_0= RULE_STRING ) ) otherlv_3= Colon ( ( (lv_expr_4_0= ruleExpr ) ) | (
			// (lv_pattern_5_0= rulePatternStatement ) ) ) otherlv_6= Semicolon ) | ( () otherlv_8= Guarantee ( (lv_str_9_0= RULE_STRING ) ) otherlv_10= Colon (
			// ( (lv_expr_11_0= ruleExpr ) ) | ( (lv_pattern_12_0= rulePatternStatement ) ) ) otherlv_13= Semicolon ) | ( () otherlv_15= Assert ( (
			// (lv_str_16_0= RULE_STRING ) ) otherlv_17= Colon )? ( ( (lv_expr_18_0= ruleExpr ) ) | ( (lv_pattern_19_0= rulePatternStatement ) ) ) otherlv_20=
			// Semicolon ) | ( () otherlv_22= Initially otherlv_23= Colon ( (lv_expr_24_0= ruleExpr ) ) otherlv_25= Semicolon ) | ( () otherlv_27= Parameter (
			// (lv_expr_28_0= ruleExpr ) ) otherlv_29= Colon ( (lv_type_30_0= ruleType ) ) otherlv_31= Semicolon ) | ( () otherlv_33= Lemma ( (lv_str_34_0=
			// RULE_STRING ) ) otherlv_35= Colon ( ( (lv_expr_36_0= ruleExpr ) ) | ( (lv_pattern_37_0= rulePatternStatement ) ) ) otherlv_38= Semicolon ) | ( ()
			// otherlv_40= Lift ( (lv_subcomp_41_0= ruleNestedDotID ) ) otherlv_42= Semicolon ) | ( () otherlv_44= Connection ( (otherlv_45= RULE_ID ) )
			// otherlv_46= Colon ( (lv_expr_47_0= ruleExpr ) ) otherlv_48= Semicolon ) | this_SynchStatement_49= ruleSynchStatement | this_OrderStatement_50=
			// ruleOrderStatement | this_PropertyStatement_51= rulePropertyStatement | this_ConstStatement_52= ruleConstStatement | this_EnumStatement_53=
			// ruleEnumStatement | this_EqStatement_54= ruleEqStatement | this_AssignStatement_55= ruleAssignStatement | this_LinearizationDefExpr_56=
			// ruleLinearizationDefExpr | this_FnDefExpr_57= ruleFnDefExpr | this_LibraryFnDefExpr_58= ruleLibraryFnDefExpr | this_NodeDefExpr_59=
			// ruleNodeDefExpr | this_RecordDefExpr_60= ruleRecordDefExpr | this_InputStatement_61= ruleInputStatement ) )
			// InternalAgreeParser.g:335:1: ( ( () otherlv_1= Assume ( (lv_str_2_0= RULE_STRING ) ) otherlv_3= Colon ( ( (lv_expr_4_0= ruleExpr ) ) | (
			// (lv_pattern_5_0= rulePatternStatement ) ) ) otherlv_6= Semicolon ) | ( () otherlv_8= Guarantee ( (lv_str_9_0= RULE_STRING ) ) otherlv_10= Colon (
			// ( (lv_expr_11_0= ruleExpr ) ) | ( (lv_pattern_12_0= rulePatternStatement ) ) ) otherlv_13= Semicolon ) | ( () otherlv_15= Assert ( (
			// (lv_str_16_0= RULE_STRING ) ) otherlv_17= Colon )? ( ( (lv_expr_18_0= ruleExpr ) ) | ( (lv_pattern_19_0= rulePatternStatement ) ) ) otherlv_20=
			// Semicolon ) | ( () otherlv_22= Initially otherlv_23= Colon ( (lv_expr_24_0= ruleExpr ) ) otherlv_25= Semicolon ) | ( () otherlv_27= Parameter (
			// (lv_expr_28_0= ruleExpr ) ) otherlv_29= Colon ( (lv_type_30_0= ruleType ) ) otherlv_31= Semicolon ) | ( () otherlv_33= Lemma ( (lv_str_34_0=
			// RULE_STRING ) ) otherlv_35= Colon ( ( (lv_expr_36_0= ruleExpr ) ) | ( (lv_pattern_37_0= rulePatternStatement ) ) ) otherlv_38= Semicolon ) | ( ()
			// otherlv_40= Lift ( (lv_subcomp_41_0= ruleNestedDotID ) ) otherlv_42= Semicolon ) | ( () otherlv_44= Connection ( (otherlv_45= RULE_ID ) )
			// otherlv_46= Colon ( (lv_expr_47_0= ruleExpr ) ) otherlv_48= Semicolon ) | this_SynchStatement_49= ruleSynchStatement | this_OrderStatement_50=
			// ruleOrderStatement | this_PropertyStatement_51= rulePropertyStatement | this_ConstStatement_52= ruleConstStatement | this_EnumStatement_53=
			// ruleEnumStatement | this_EqStatement_54= ruleEqStatement | this_AssignStatement_55= ruleAssignStatement | this_LinearizationDefExpr_56=
			// ruleLinearizationDefExpr | this_FnDefExpr_57= ruleFnDefExpr | this_LibraryFnDefExpr_58= ruleLibraryFnDefExpr | this_NodeDefExpr_59=
			// ruleNodeDefExpr | this_RecordDefExpr_60= ruleRecordDefExpr | this_InputStatement_61= ruleInputStatement )
			{
				// InternalAgreeParser.g:335:1: ( ( () otherlv_1= Assume ( (lv_str_2_0= RULE_STRING ) ) otherlv_3= Colon ( ( (lv_expr_4_0= ruleExpr ) ) | (
				// (lv_pattern_5_0= rulePatternStatement ) ) ) otherlv_6= Semicolon ) | ( () otherlv_8= Guarantee ( (lv_str_9_0= RULE_STRING ) ) otherlv_10=
				// Colon ( ( (lv_expr_11_0= ruleExpr ) ) | ( (lv_pattern_12_0= rulePatternStatement ) ) ) otherlv_13= Semicolon ) | ( () otherlv_15= Assert ( (
				// (lv_str_16_0= RULE_STRING ) ) otherlv_17= Colon )? ( ( (lv_expr_18_0= ruleExpr ) ) | ( (lv_pattern_19_0= rulePatternStatement ) ) )
				// otherlv_20= Semicolon ) | ( () otherlv_22= Initially otherlv_23= Colon ( (lv_expr_24_0= ruleExpr ) ) otherlv_25= Semicolon ) | ( ()
				// otherlv_27= Parameter ( (lv_expr_28_0= ruleExpr ) ) otherlv_29= Colon ( (lv_type_30_0= ruleType ) ) otherlv_31= Semicolon ) | ( ()
				// otherlv_33= Lemma ( (lv_str_34_0= RULE_STRING ) ) otherlv_35= Colon ( ( (lv_expr_36_0= ruleExpr ) ) | ( (lv_pattern_37_0=
				// rulePatternStatement ) ) ) otherlv_38= Semicolon ) | ( () otherlv_40= Lift ( (lv_subcomp_41_0= ruleNestedDotID ) ) otherlv_42= Semicolon ) |
				// ( () otherlv_44= Connection ( (otherlv_45= RULE_ID ) ) otherlv_46= Colon ( (lv_expr_47_0= ruleExpr ) ) otherlv_48= Semicolon ) |
				// this_SynchStatement_49= ruleSynchStatement | this_OrderStatement_50= ruleOrderStatement | this_PropertyStatement_51= rulePropertyStatement |
				// this_ConstStatement_52= ruleConstStatement | this_EnumStatement_53= ruleEnumStatement | this_EqStatement_54= ruleEqStatement |
				// this_AssignStatement_55= ruleAssignStatement | this_LinearizationDefExpr_56= ruleLinearizationDefExpr | this_FnDefExpr_57= ruleFnDefExpr |
				// this_LibraryFnDefExpr_58= ruleLibraryFnDefExpr | this_NodeDefExpr_59= ruleNodeDefExpr | this_RecordDefExpr_60= ruleRecordDefExpr |
				// this_InputStatement_61= ruleInputStatement )
				int alt8 = 21;
				switch (input.LA(1)) {
				case Assume: {
					alt8 = 1;
				}
					break;
				case Guarantee: {
					alt8 = 2;
				}
					break;
				case Assert: {
					alt8 = 3;
				}
					break;
				case Initially: {
					alt8 = 4;
				}
					break;
				case Parameter: {
					alt8 = 5;
				}
					break;
				case Lemma: {
					alt8 = 6;
				}
					break;
				case Lift: {
					alt8 = 7;
				}
					break;
				case Connection: {
					alt8 = 8;
				}
					break;
				case Synchrony:
				case Calendar: {
					alt8 = 9;
				}
					break;
				case Ordering: {
					alt8 = 10;
				}
					break;
				case Property: {
					alt8 = 11;
				}
					break;
				case Const: {
					alt8 = 12;
				}
					break;
				case Enum: {
					alt8 = 13;
				}
					break;
				case Eq: {
					alt8 = 14;
				}
					break;
				case Assign: {
					alt8 = 15;
				}
					break;
				case Linearization: {
					alt8 = 16;
				}
					break;
				case Fun: {
					alt8 = 17;
				}
					break;
				case External: {
					alt8 = 18;
				}
					break;
				case Node: {
					alt8 = 19;
				}
					break;
				case Type: {
					alt8 = 20;
				}
					break;
				case Agree_input: {
					alt8 = 21;
				}
					break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 8, 0, input);

					throw nvae;
				}

				switch (alt8) {
				case 1:
				// InternalAgreeParser.g:335:2: ( () otherlv_1= Assume ( (lv_str_2_0= RULE_STRING ) ) otherlv_3= Colon ( ( (lv_expr_4_0= ruleExpr ) ) | (
				// (lv_pattern_5_0= rulePatternStatement ) ) ) otherlv_6= Semicolon )
				{
					// InternalAgreeParser.g:335:2: ( () otherlv_1= Assume ( (lv_str_2_0= RULE_STRING ) ) otherlv_3= Colon ( ( (lv_expr_4_0= ruleExpr ) ) | (
					// (lv_pattern_5_0= rulePatternStatement ) ) ) otherlv_6= Semicolon )
					// InternalAgreeParser.g:335:3: () otherlv_1= Assume ( (lv_str_2_0= RULE_STRING ) ) otherlv_3= Colon ( ( (lv_expr_4_0= ruleExpr ) ) | (
					// (lv_pattern_5_0= rulePatternStatement ) ) ) otherlv_6= Semicolon
					{
						// InternalAgreeParser.g:335:3: ()
						// InternalAgreeParser.g:336:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getSpecStatementAccess().getAssumeStatementAction_0_0(), current);

							}

						}

						otherlv_1 = (Token) match(input, Assume, FollowSets000.FOLLOW_4);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_1, grammarAccess.getSpecStatementAccess().getAssumeKeyword_0_1());

						}
						// InternalAgreeParser.g:346:1: ( (lv_str_2_0= RULE_STRING ) )
						// InternalAgreeParser.g:347:1: (lv_str_2_0= RULE_STRING )
						{
							// InternalAgreeParser.g:347:1: (lv_str_2_0= RULE_STRING )
							// InternalAgreeParser.g:348:3: lv_str_2_0= RULE_STRING
							{
								lv_str_2_0 = (Token) match(input, RULE_STRING, FollowSets000.FOLLOW_5);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(lv_str_2_0, grammarAccess.getSpecStatementAccess()
											.getStrSTRINGTerminalRuleCall_0_2_0());

								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getSpecStatementRule());
									}
									setWithLastConsumed(current, "str", lv_str_2_0,
											"org.osate.xtext.aadl2.properties.Properties.STRING");

								}

							}

						}

						otherlv_3 = (Token) match(input, Colon, FollowSets000.FOLLOW_6);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_3, grammarAccess.getSpecStatementAccess().getColonKeyword_0_3());

						}
						// InternalAgreeParser.g:369:1: ( ( (lv_expr_4_0= ruleExpr ) ) | ( (lv_pattern_5_0= rulePatternStatement ) ) )
						int alt3 = 2;
						int LA3_0 = input.LA(1);

						if ((LA3_0 == Get_Property || (LA3_0 >= Timefall && LA3_0 <= Timerise) || LA3_0 == Latched
								|| LA3_0 == Timeof || (LA3_0 >= Event && LA3_0 <= Floor) || LA3_0 == Enum
								|| (LA3_0 >= Prev && LA3_0 <= Real) || (LA3_0 >= This && LA3_0 <= True)
								|| (LA3_0 >= Not && LA3_0 <= Pre) || LA3_0 == If || LA3_0 == LeftParenthesis
								|| LA3_0 == HyphenMinus || LA3_0 == RULE_REAL_LIT || LA3_0 == RULE_INTEGER_LIT
								|| LA3_0 == RULE_ID)) {
							alt3 = 1;
						} else if ((LA3_0 == Condition || LA3_0 == Whenever || LA3_0 == Always || LA3_0 == When)) {
							alt3 = 2;
						} else {
							if (state.backtracking > 0) {
								state.failed = true;
								return current;
							}
							NoViableAltException nvae = new NoViableAltException("", 3, 0, input);

							throw nvae;
						}
						switch (alt3) {
						case 1:
						// InternalAgreeParser.g:369:2: ( (lv_expr_4_0= ruleExpr ) )
						{
							// InternalAgreeParser.g:369:2: ( (lv_expr_4_0= ruleExpr ) )
							// InternalAgreeParser.g:370:1: (lv_expr_4_0= ruleExpr )
							{
								// InternalAgreeParser.g:370:1: (lv_expr_4_0= ruleExpr )
								// InternalAgreeParser.g:371:3: lv_expr_4_0= ruleExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getSpecStatementAccess()
												.getExprExprParserRuleCall_0_4_0_0());

									}
									pushFollow(FollowSets000.FOLLOW_7);
									lv_expr_4_0 = ruleExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getSpecStatementRule());
										}
										set(current, "expr", lv_expr_4_0, "com.rockwellcollins.atc.agree.Agree.Expr");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;
						case 2:
						// InternalAgreeParser.g:388:6: ( (lv_pattern_5_0= rulePatternStatement ) )
						{
							// InternalAgreeParser.g:388:6: ( (lv_pattern_5_0= rulePatternStatement ) )
							// InternalAgreeParser.g:389:1: (lv_pattern_5_0= rulePatternStatement )
							{
								// InternalAgreeParser.g:389:1: (lv_pattern_5_0= rulePatternStatement )
								// InternalAgreeParser.g:390:3: lv_pattern_5_0= rulePatternStatement
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getSpecStatementAccess()
												.getPatternPatternStatementParserRuleCall_0_4_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_7);
									lv_pattern_5_0 = rulePatternStatement();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getSpecStatementRule());
										}
										set(current, "pattern", lv_pattern_5_0,
												"com.rockwellcollins.atc.agree.Agree.PatternStatement");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						}

						otherlv_6 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_6, grammarAccess.getSpecStatementAccess().getSemicolonKeyword_0_5());

						}

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:412:6: ( () otherlv_8= Guarantee ( (lv_str_9_0= RULE_STRING ) ) otherlv_10= Colon ( ( (lv_expr_11_0= ruleExpr ) ) | (
				// (lv_pattern_12_0= rulePatternStatement ) ) ) otherlv_13= Semicolon )
				{
					// InternalAgreeParser.g:412:6: ( () otherlv_8= Guarantee ( (lv_str_9_0= RULE_STRING ) ) otherlv_10= Colon ( ( (lv_expr_11_0= ruleExpr ) ) |
					// ( (lv_pattern_12_0= rulePatternStatement ) ) ) otherlv_13= Semicolon )
					// InternalAgreeParser.g:412:7: () otherlv_8= Guarantee ( (lv_str_9_0= RULE_STRING ) ) otherlv_10= Colon ( ( (lv_expr_11_0= ruleExpr ) ) | (
					// (lv_pattern_12_0= rulePatternStatement ) ) ) otherlv_13= Semicolon
					{
						// InternalAgreeParser.g:412:7: ()
						// InternalAgreeParser.g:413:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getSpecStatementAccess().getGuaranteeStatementAction_1_0(),
										current);

							}

						}

						otherlv_8 = (Token) match(input, Guarantee, FollowSets000.FOLLOW_4);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_8, grammarAccess.getSpecStatementAccess().getGuaranteeKeyword_1_1());

						}
						// InternalAgreeParser.g:423:1: ( (lv_str_9_0= RULE_STRING ) )
						// InternalAgreeParser.g:424:1: (lv_str_9_0= RULE_STRING )
						{
							// InternalAgreeParser.g:424:1: (lv_str_9_0= RULE_STRING )
							// InternalAgreeParser.g:425:3: lv_str_9_0= RULE_STRING
							{
								lv_str_9_0 = (Token) match(input, RULE_STRING, FollowSets000.FOLLOW_5);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(lv_str_9_0, grammarAccess.getSpecStatementAccess()
											.getStrSTRINGTerminalRuleCall_1_2_0());

								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getSpecStatementRule());
									}
									setWithLastConsumed(current, "str", lv_str_9_0,
											"org.osate.xtext.aadl2.properties.Properties.STRING");

								}

							}

						}

						otherlv_10 = (Token) match(input, Colon, FollowSets000.FOLLOW_6);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_10, grammarAccess.getSpecStatementAccess().getColonKeyword_1_3());

						}
						// InternalAgreeParser.g:446:1: ( ( (lv_expr_11_0= ruleExpr ) ) | ( (lv_pattern_12_0= rulePatternStatement ) ) )
						int alt4 = 2;
						int LA4_0 = input.LA(1);

						if ((LA4_0 == Get_Property || (LA4_0 >= Timefall && LA4_0 <= Timerise) || LA4_0 == Latched
								|| LA4_0 == Timeof || (LA4_0 >= Event && LA4_0 <= Floor) || LA4_0 == Enum
								|| (LA4_0 >= Prev && LA4_0 <= Real) || (LA4_0 >= This && LA4_0 <= True)
								|| (LA4_0 >= Not && LA4_0 <= Pre) || LA4_0 == If || LA4_0 == LeftParenthesis
								|| LA4_0 == HyphenMinus || LA4_0 == RULE_REAL_LIT || LA4_0 == RULE_INTEGER_LIT
								|| LA4_0 == RULE_ID)) {
							alt4 = 1;
						} else if ((LA4_0 == Condition || LA4_0 == Whenever || LA4_0 == Always || LA4_0 == When)) {
							alt4 = 2;
						} else {
							if (state.backtracking > 0) {
								state.failed = true;
								return current;
							}
							NoViableAltException nvae = new NoViableAltException("", 4, 0, input);

							throw nvae;
						}
						switch (alt4) {
						case 1:
						// InternalAgreeParser.g:446:2: ( (lv_expr_11_0= ruleExpr ) )
						{
							// InternalAgreeParser.g:446:2: ( (lv_expr_11_0= ruleExpr ) )
							// InternalAgreeParser.g:447:1: (lv_expr_11_0= ruleExpr )
							{
								// InternalAgreeParser.g:447:1: (lv_expr_11_0= ruleExpr )
								// InternalAgreeParser.g:448:3: lv_expr_11_0= ruleExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getSpecStatementAccess()
												.getExprExprParserRuleCall_1_4_0_0());

									}
									pushFollow(FollowSets000.FOLLOW_7);
									lv_expr_11_0 = ruleExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getSpecStatementRule());
										}
										set(current, "expr", lv_expr_11_0, "com.rockwellcollins.atc.agree.Agree.Expr");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;
						case 2:
						// InternalAgreeParser.g:465:6: ( (lv_pattern_12_0= rulePatternStatement ) )
						{
							// InternalAgreeParser.g:465:6: ( (lv_pattern_12_0= rulePatternStatement ) )
							// InternalAgreeParser.g:466:1: (lv_pattern_12_0= rulePatternStatement )
							{
								// InternalAgreeParser.g:466:1: (lv_pattern_12_0= rulePatternStatement )
								// InternalAgreeParser.g:467:3: lv_pattern_12_0= rulePatternStatement
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getSpecStatementAccess()
												.getPatternPatternStatementParserRuleCall_1_4_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_7);
									lv_pattern_12_0 = rulePatternStatement();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getSpecStatementRule());
										}
										set(current, "pattern", lv_pattern_12_0,
												"com.rockwellcollins.atc.agree.Agree.PatternStatement");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						}

						otherlv_13 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_13, grammarAccess.getSpecStatementAccess().getSemicolonKeyword_1_5());

						}

					}

				}
					break;
				case 3:
				// InternalAgreeParser.g:489:6: ( () otherlv_15= Assert ( ( (lv_str_16_0= RULE_STRING ) ) otherlv_17= Colon )? ( ( (lv_expr_18_0= ruleExpr ) ) |
				// ( (lv_pattern_19_0= rulePatternStatement ) ) ) otherlv_20= Semicolon )
				{
					// InternalAgreeParser.g:489:6: ( () otherlv_15= Assert ( ( (lv_str_16_0= RULE_STRING ) ) otherlv_17= Colon )? ( ( (lv_expr_18_0= ruleExpr )
					// ) | ( (lv_pattern_19_0= rulePatternStatement ) ) ) otherlv_20= Semicolon )
					// InternalAgreeParser.g:489:7: () otherlv_15= Assert ( ( (lv_str_16_0= RULE_STRING ) ) otherlv_17= Colon )? ( ( (lv_expr_18_0= ruleExpr ) )
					// | ( (lv_pattern_19_0= rulePatternStatement ) ) ) otherlv_20= Semicolon
					{
						// InternalAgreeParser.g:489:7: ()
						// InternalAgreeParser.g:490:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getSpecStatementAccess().getAssertStatementAction_2_0(), current);

							}

						}

						otherlv_15 = (Token) match(input, Assert, FollowSets000.FOLLOW_8);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_15, grammarAccess.getSpecStatementAccess().getAssertKeyword_2_1());

						}
						// InternalAgreeParser.g:500:1: ( ( (lv_str_16_0= RULE_STRING ) ) otherlv_17= Colon )?
						int alt5 = 2;
						int LA5_0 = input.LA(1);

						if ((LA5_0 == RULE_STRING)) {
							alt5 = 1;
						}
						switch (alt5) {
						case 1:
						// InternalAgreeParser.g:500:2: ( (lv_str_16_0= RULE_STRING ) ) otherlv_17= Colon
						{
							// InternalAgreeParser.g:500:2: ( (lv_str_16_0= RULE_STRING ) )
							// InternalAgreeParser.g:501:1: (lv_str_16_0= RULE_STRING )
							{
								// InternalAgreeParser.g:501:1: (lv_str_16_0= RULE_STRING )
								// InternalAgreeParser.g:502:3: lv_str_16_0= RULE_STRING
								{
									lv_str_16_0 = (Token) match(input, RULE_STRING, FollowSets000.FOLLOW_5);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(lv_str_16_0, grammarAccess.getSpecStatementAccess()
												.getStrSTRINGTerminalRuleCall_2_2_0_0());

									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElement(grammarAccess.getSpecStatementRule());
										}
										setWithLastConsumed(current, "str", lv_str_16_0,
												"org.osate.xtext.aadl2.properties.Properties.STRING");

									}

								}

							}

							otherlv_17 = (Token) match(input, Colon, FollowSets000.FOLLOW_6);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_17, grammarAccess.getSpecStatementAccess().getColonKeyword_2_2_1());

							}

						}
							break;

						}

						// InternalAgreeParser.g:523:3: ( ( (lv_expr_18_0= ruleExpr ) ) | ( (lv_pattern_19_0= rulePatternStatement ) ) )
						int alt6 = 2;
						int LA6_0 = input.LA(1);

						if ((LA6_0 == Get_Property || (LA6_0 >= Timefall && LA6_0 <= Timerise) || LA6_0 == Latched
								|| LA6_0 == Timeof || (LA6_0 >= Event && LA6_0 <= Floor) || LA6_0 == Enum
								|| (LA6_0 >= Prev && LA6_0 <= Real) || (LA6_0 >= This && LA6_0 <= True)
								|| (LA6_0 >= Not && LA6_0 <= Pre) || LA6_0 == If || LA6_0 == LeftParenthesis
								|| LA6_0 == HyphenMinus || LA6_0 == RULE_REAL_LIT || LA6_0 == RULE_INTEGER_LIT
								|| LA6_0 == RULE_ID)) {
							alt6 = 1;
						} else if ((LA6_0 == Condition || LA6_0 == Whenever || LA6_0 == Always || LA6_0 == When)) {
							alt6 = 2;
						} else {
							if (state.backtracking > 0) {
								state.failed = true;
								return current;
							}
							NoViableAltException nvae = new NoViableAltException("", 6, 0, input);

							throw nvae;
						}
						switch (alt6) {
						case 1:
						// InternalAgreeParser.g:523:4: ( (lv_expr_18_0= ruleExpr ) )
						{
							// InternalAgreeParser.g:523:4: ( (lv_expr_18_0= ruleExpr ) )
							// InternalAgreeParser.g:524:1: (lv_expr_18_0= ruleExpr )
							{
								// InternalAgreeParser.g:524:1: (lv_expr_18_0= ruleExpr )
								// InternalAgreeParser.g:525:3: lv_expr_18_0= ruleExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getSpecStatementAccess()
												.getExprExprParserRuleCall_2_3_0_0());

									}
									pushFollow(FollowSets000.FOLLOW_7);
									lv_expr_18_0 = ruleExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getSpecStatementRule());
										}
										set(current, "expr", lv_expr_18_0, "com.rockwellcollins.atc.agree.Agree.Expr");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;
						case 2:
						// InternalAgreeParser.g:542:6: ( (lv_pattern_19_0= rulePatternStatement ) )
						{
							// InternalAgreeParser.g:542:6: ( (lv_pattern_19_0= rulePatternStatement ) )
							// InternalAgreeParser.g:543:1: (lv_pattern_19_0= rulePatternStatement )
							{
								// InternalAgreeParser.g:543:1: (lv_pattern_19_0= rulePatternStatement )
								// InternalAgreeParser.g:544:3: lv_pattern_19_0= rulePatternStatement
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getSpecStatementAccess()
												.getPatternPatternStatementParserRuleCall_2_3_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_7);
									lv_pattern_19_0 = rulePatternStatement();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getSpecStatementRule());
										}
										set(current, "pattern", lv_pattern_19_0,
												"com.rockwellcollins.atc.agree.Agree.PatternStatement");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						}

						otherlv_20 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_20, grammarAccess.getSpecStatementAccess().getSemicolonKeyword_2_4());

						}

					}

				}
					break;
				case 4:
				// InternalAgreeParser.g:566:6: ( () otherlv_22= Initially otherlv_23= Colon ( (lv_expr_24_0= ruleExpr ) ) otherlv_25= Semicolon )
				{
					// InternalAgreeParser.g:566:6: ( () otherlv_22= Initially otherlv_23= Colon ( (lv_expr_24_0= ruleExpr ) ) otherlv_25= Semicolon )
					// InternalAgreeParser.g:566:7: () otherlv_22= Initially otherlv_23= Colon ( (lv_expr_24_0= ruleExpr ) ) otherlv_25= Semicolon
					{
						// InternalAgreeParser.g:566:7: ()
						// InternalAgreeParser.g:567:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getSpecStatementAccess().getInitialStatementAction_3_0(),
										current);

							}

						}

						otherlv_22 = (Token) match(input, Initially, FollowSets000.FOLLOW_5);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_22, grammarAccess.getSpecStatementAccess().getInitiallyKeyword_3_1());

						}
						otherlv_23 = (Token) match(input, Colon, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_23, grammarAccess.getSpecStatementAccess().getColonKeyword_3_2());

						}
						// InternalAgreeParser.g:582:1: ( (lv_expr_24_0= ruleExpr ) )
						// InternalAgreeParser.g:583:1: (lv_expr_24_0= ruleExpr )
						{
							// InternalAgreeParser.g:583:1: (lv_expr_24_0= ruleExpr )
							// InternalAgreeParser.g:584:3: lv_expr_24_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getSpecStatementAccess().getExprExprParserRuleCall_3_3_0());

								}
								pushFollow(FollowSets000.FOLLOW_7);
								lv_expr_24_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getSpecStatementRule());
									}
									set(current, "expr", lv_expr_24_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_25 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_25, grammarAccess.getSpecStatementAccess().getSemicolonKeyword_3_4());

						}

					}

				}
					break;
				case 5:
				// InternalAgreeParser.g:606:6: ( () otherlv_27= Parameter ( (lv_expr_28_0= ruleExpr ) ) otherlv_29= Colon ( (lv_type_30_0= ruleType ) )
				// otherlv_31= Semicolon )
				{
					// InternalAgreeParser.g:606:6: ( () otherlv_27= Parameter ( (lv_expr_28_0= ruleExpr ) ) otherlv_29= Colon ( (lv_type_30_0= ruleType ) )
					// otherlv_31= Semicolon )
					// InternalAgreeParser.g:606:7: () otherlv_27= Parameter ( (lv_expr_28_0= ruleExpr ) ) otherlv_29= Colon ( (lv_type_30_0= ruleType ) )
					// otherlv_31= Semicolon
					{
						// InternalAgreeParser.g:606:7: ()
						// InternalAgreeParser.g:607:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getSpecStatementAccess().getParamStatementAction_4_0(), current);

							}

						}

						otherlv_27 = (Token) match(input, Parameter, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_27, grammarAccess.getSpecStatementAccess().getParameterKeyword_4_1());

						}
						// InternalAgreeParser.g:617:1: ( (lv_expr_28_0= ruleExpr ) )
						// InternalAgreeParser.g:618:1: (lv_expr_28_0= ruleExpr )
						{
							// InternalAgreeParser.g:618:1: (lv_expr_28_0= ruleExpr )
							// InternalAgreeParser.g:619:3: lv_expr_28_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getSpecStatementAccess().getExprExprParserRuleCall_4_2_0());

								}
								pushFollow(FollowSets000.FOLLOW_5);
								lv_expr_28_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getSpecStatementRule());
									}
									set(current, "expr", lv_expr_28_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_29 = (Token) match(input, Colon, FollowSets000.FOLLOW_10);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_29, grammarAccess.getSpecStatementAccess().getColonKeyword_4_3());

						}
						// InternalAgreeParser.g:640:1: ( (lv_type_30_0= ruleType ) )
						// InternalAgreeParser.g:641:1: (lv_type_30_0= ruleType )
						{
							// InternalAgreeParser.g:641:1: (lv_type_30_0= ruleType )
							// InternalAgreeParser.g:642:3: lv_type_30_0= ruleType
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getSpecStatementAccess().getTypeTypeParserRuleCall_4_4_0());

								}
								pushFollow(FollowSets000.FOLLOW_7);
								lv_type_30_0 = ruleType();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getSpecStatementRule());
									}
									set(current, "type", lv_type_30_0, "com.rockwellcollins.atc.agree.Agree.Type");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_31 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_31, grammarAccess.getSpecStatementAccess().getSemicolonKeyword_4_5());

						}

					}

				}
					break;
				case 6:
				// InternalAgreeParser.g:664:6: ( () otherlv_33= Lemma ( (lv_str_34_0= RULE_STRING ) ) otherlv_35= Colon ( ( (lv_expr_36_0= ruleExpr ) ) | (
				// (lv_pattern_37_0= rulePatternStatement ) ) ) otherlv_38= Semicolon )
				{
					// InternalAgreeParser.g:664:6: ( () otherlv_33= Lemma ( (lv_str_34_0= RULE_STRING ) ) otherlv_35= Colon ( ( (lv_expr_36_0= ruleExpr ) ) | (
					// (lv_pattern_37_0= rulePatternStatement ) ) ) otherlv_38= Semicolon )
					// InternalAgreeParser.g:664:7: () otherlv_33= Lemma ( (lv_str_34_0= RULE_STRING ) ) otherlv_35= Colon ( ( (lv_expr_36_0= ruleExpr ) ) | (
					// (lv_pattern_37_0= rulePatternStatement ) ) ) otherlv_38= Semicolon
					{
						// InternalAgreeParser.g:664:7: ()
						// InternalAgreeParser.g:665:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getSpecStatementAccess().getLemmaStatementAction_5_0(), current);

							}

						}

						otherlv_33 = (Token) match(input, Lemma, FollowSets000.FOLLOW_4);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_33, grammarAccess.getSpecStatementAccess().getLemmaKeyword_5_1());

						}
						// InternalAgreeParser.g:675:1: ( (lv_str_34_0= RULE_STRING ) )
						// InternalAgreeParser.g:676:1: (lv_str_34_0= RULE_STRING )
						{
							// InternalAgreeParser.g:676:1: (lv_str_34_0= RULE_STRING )
							// InternalAgreeParser.g:677:3: lv_str_34_0= RULE_STRING
							{
								lv_str_34_0 = (Token) match(input, RULE_STRING, FollowSets000.FOLLOW_5);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(lv_str_34_0, grammarAccess.getSpecStatementAccess()
											.getStrSTRINGTerminalRuleCall_5_2_0());

								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getSpecStatementRule());
									}
									setWithLastConsumed(current, "str", lv_str_34_0,
											"org.osate.xtext.aadl2.properties.Properties.STRING");

								}

							}

						}

						otherlv_35 = (Token) match(input, Colon, FollowSets000.FOLLOW_6);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_35, grammarAccess.getSpecStatementAccess().getColonKeyword_5_3());

						}
						// InternalAgreeParser.g:698:1: ( ( (lv_expr_36_0= ruleExpr ) ) | ( (lv_pattern_37_0= rulePatternStatement ) ) )
						int alt7 = 2;
						int LA7_0 = input.LA(1);

						if ((LA7_0 == Get_Property || (LA7_0 >= Timefall && LA7_0 <= Timerise) || LA7_0 == Latched
								|| LA7_0 == Timeof || (LA7_0 >= Event && LA7_0 <= Floor) || LA7_0 == Enum
								|| (LA7_0 >= Prev && LA7_0 <= Real) || (LA7_0 >= This && LA7_0 <= True)
								|| (LA7_0 >= Not && LA7_0 <= Pre) || LA7_0 == If || LA7_0 == LeftParenthesis
								|| LA7_0 == HyphenMinus || LA7_0 == RULE_REAL_LIT || LA7_0 == RULE_INTEGER_LIT
								|| LA7_0 == RULE_ID)) {
							alt7 = 1;
						} else if ((LA7_0 == Condition || LA7_0 == Whenever || LA7_0 == Always || LA7_0 == When)) {
							alt7 = 2;
						} else {
							if (state.backtracking > 0) {
								state.failed = true;
								return current;
							}
							NoViableAltException nvae = new NoViableAltException("", 7, 0, input);

							throw nvae;
						}
						switch (alt7) {
						case 1:
						// InternalAgreeParser.g:698:2: ( (lv_expr_36_0= ruleExpr ) )
						{
							// InternalAgreeParser.g:698:2: ( (lv_expr_36_0= ruleExpr ) )
							// InternalAgreeParser.g:699:1: (lv_expr_36_0= ruleExpr )
							{
								// InternalAgreeParser.g:699:1: (lv_expr_36_0= ruleExpr )
								// InternalAgreeParser.g:700:3: lv_expr_36_0= ruleExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getSpecStatementAccess()
												.getExprExprParserRuleCall_5_4_0_0());

									}
									pushFollow(FollowSets000.FOLLOW_7);
									lv_expr_36_0 = ruleExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getSpecStatementRule());
										}
										set(current, "expr", lv_expr_36_0, "com.rockwellcollins.atc.agree.Agree.Expr");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;
						case 2:
						// InternalAgreeParser.g:717:6: ( (lv_pattern_37_0= rulePatternStatement ) )
						{
							// InternalAgreeParser.g:717:6: ( (lv_pattern_37_0= rulePatternStatement ) )
							// InternalAgreeParser.g:718:1: (lv_pattern_37_0= rulePatternStatement )
							{
								// InternalAgreeParser.g:718:1: (lv_pattern_37_0= rulePatternStatement )
								// InternalAgreeParser.g:719:3: lv_pattern_37_0= rulePatternStatement
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getSpecStatementAccess()
												.getPatternPatternStatementParserRuleCall_5_4_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_7);
									lv_pattern_37_0 = rulePatternStatement();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getSpecStatementRule());
										}
										set(current, "pattern", lv_pattern_37_0,
												"com.rockwellcollins.atc.agree.Agree.PatternStatement");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						}

						otherlv_38 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_38, grammarAccess.getSpecStatementAccess().getSemicolonKeyword_5_5());

						}

					}

				}
					break;
				case 7:
				// InternalAgreeParser.g:741:6: ( () otherlv_40= Lift ( (lv_subcomp_41_0= ruleNestedDotID ) ) otherlv_42= Semicolon )
				{
					// InternalAgreeParser.g:741:6: ( () otherlv_40= Lift ( (lv_subcomp_41_0= ruleNestedDotID ) ) otherlv_42= Semicolon )
					// InternalAgreeParser.g:741:7: () otherlv_40= Lift ( (lv_subcomp_41_0= ruleNestedDotID ) ) otherlv_42= Semicolon
					{
						// InternalAgreeParser.g:741:7: ()
						// InternalAgreeParser.g:742:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getSpecStatementAccess().getLiftStatementAction_6_0(), current);

							}

						}

						otherlv_40 = (Token) match(input, Lift, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_40, grammarAccess.getSpecStatementAccess().getLiftKeyword_6_1());

						}
						// InternalAgreeParser.g:752:1: ( (lv_subcomp_41_0= ruleNestedDotID ) )
						// InternalAgreeParser.g:753:1: (lv_subcomp_41_0= ruleNestedDotID )
						{
							// InternalAgreeParser.g:753:1: (lv_subcomp_41_0= ruleNestedDotID )
							// InternalAgreeParser.g:754:3: lv_subcomp_41_0= ruleNestedDotID
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getSpecStatementAccess()
											.getSubcompNestedDotIDParserRuleCall_6_2_0());

								}
								pushFollow(FollowSets000.FOLLOW_7);
								lv_subcomp_41_0 = ruleNestedDotID();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getSpecStatementRule());
									}
									set(current, "subcomp", lv_subcomp_41_0,
											"com.rockwellcollins.atc.agree.Agree.NestedDotID");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_42 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_42, grammarAccess.getSpecStatementAccess().getSemicolonKeyword_6_3());

						}

					}

				}
					break;
				case 8:
				// InternalAgreeParser.g:776:6: ( () otherlv_44= Connection ( (otherlv_45= RULE_ID ) ) otherlv_46= Colon ( (lv_expr_47_0= ruleExpr ) )
				// otherlv_48= Semicolon )
				{
					// InternalAgreeParser.g:776:6: ( () otherlv_44= Connection ( (otherlv_45= RULE_ID ) ) otherlv_46= Colon ( (lv_expr_47_0= ruleExpr ) )
					// otherlv_48= Semicolon )
					// InternalAgreeParser.g:776:7: () otherlv_44= Connection ( (otherlv_45= RULE_ID ) ) otherlv_46= Colon ( (lv_expr_47_0= ruleExpr ) )
					// otherlv_48= Semicolon
					{
						// InternalAgreeParser.g:776:7: ()
						// InternalAgreeParser.g:777:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getSpecStatementAccess().getConnectionStatementAction_7_0(),
										current);

							}

						}

						otherlv_44 = (Token) match(input, Connection, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_44, grammarAccess.getSpecStatementAccess().getConnectionKeyword_7_1());

						}
						// InternalAgreeParser.g:787:1: ( (otherlv_45= RULE_ID ) )
						// InternalAgreeParser.g:788:1: (otherlv_45= RULE_ID )
						{
							// InternalAgreeParser.g:788:1: (otherlv_45= RULE_ID )
							// InternalAgreeParser.g:789:3: otherlv_45= RULE_ID
							{
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getSpecStatementRule());
									}

								}
								otherlv_45 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_5);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_45, grammarAccess.getSpecStatementAccess()
											.getConnNamedElementCrossReference_7_2_0());

								}

							}

						}

						otherlv_46 = (Token) match(input, Colon, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_46, grammarAccess.getSpecStatementAccess().getColonKeyword_7_3());

						}
						// InternalAgreeParser.g:805:1: ( (lv_expr_47_0= ruleExpr ) )
						// InternalAgreeParser.g:806:1: (lv_expr_47_0= ruleExpr )
						{
							// InternalAgreeParser.g:806:1: (lv_expr_47_0= ruleExpr )
							// InternalAgreeParser.g:807:3: lv_expr_47_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getSpecStatementAccess().getExprExprParserRuleCall_7_4_0());

								}
								pushFollow(FollowSets000.FOLLOW_7);
								lv_expr_47_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getSpecStatementRule());
									}
									set(current, "expr", lv_expr_47_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_48 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_48, grammarAccess.getSpecStatementAccess().getSemicolonKeyword_7_5());

						}

					}

				}
					break;
				case 9:
				// InternalAgreeParser.g:830:5: this_SynchStatement_49= ruleSynchStatement
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getSpecStatementAccess().getSynchStatementParserRuleCall_8());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_SynchStatement_49 = ruleSynchStatement();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_SynchStatement_49;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 10:
				// InternalAgreeParser.g:840:5: this_OrderStatement_50= ruleOrderStatement
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getSpecStatementAccess().getOrderStatementParserRuleCall_9());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_OrderStatement_50 = ruleOrderStatement();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_OrderStatement_50;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 11:
				// InternalAgreeParser.g:850:5: this_PropertyStatement_51= rulePropertyStatement
				{
					if (state.backtracking == 0) {

						newCompositeNode(
								grammarAccess.getSpecStatementAccess().getPropertyStatementParserRuleCall_10());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_PropertyStatement_51 = rulePropertyStatement();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_PropertyStatement_51;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 12:
				// InternalAgreeParser.g:860:5: this_ConstStatement_52= ruleConstStatement
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getSpecStatementAccess().getConstStatementParserRuleCall_11());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_ConstStatement_52 = ruleConstStatement();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_ConstStatement_52;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 13:
				// InternalAgreeParser.g:870:5: this_EnumStatement_53= ruleEnumStatement
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getSpecStatementAccess().getEnumStatementParserRuleCall_12());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_EnumStatement_53 = ruleEnumStatement();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_EnumStatement_53;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 14:
				// InternalAgreeParser.g:880:5: this_EqStatement_54= ruleEqStatement
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getSpecStatementAccess().getEqStatementParserRuleCall_13());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_EqStatement_54 = ruleEqStatement();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_EqStatement_54;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 15:
				// InternalAgreeParser.g:890:5: this_AssignStatement_55= ruleAssignStatement
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getSpecStatementAccess().getAssignStatementParserRuleCall_14());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_AssignStatement_55 = ruleAssignStatement();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_AssignStatement_55;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 16:
				// InternalAgreeParser.g:900:5: this_LinearizationDefExpr_56= ruleLinearizationDefExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(
								grammarAccess.getSpecStatementAccess().getLinearizationDefExprParserRuleCall_15());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_LinearizationDefExpr_56 = ruleLinearizationDefExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_LinearizationDefExpr_56;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 17:
				// InternalAgreeParser.g:910:5: this_FnDefExpr_57= ruleFnDefExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getSpecStatementAccess().getFnDefExprParserRuleCall_16());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_FnDefExpr_57 = ruleFnDefExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_FnDefExpr_57;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 18:
				// InternalAgreeParser.g:920:5: this_LibraryFnDefExpr_58= ruleLibraryFnDefExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getSpecStatementAccess().getLibraryFnDefExprParserRuleCall_17());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_LibraryFnDefExpr_58 = ruleLibraryFnDefExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_LibraryFnDefExpr_58;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 19:
				// InternalAgreeParser.g:930:5: this_NodeDefExpr_59= ruleNodeDefExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getSpecStatementAccess().getNodeDefExprParserRuleCall_18());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_NodeDefExpr_59 = ruleNodeDefExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_NodeDefExpr_59;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 20:
				// InternalAgreeParser.g:940:5: this_RecordDefExpr_60= ruleRecordDefExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getSpecStatementAccess().getRecordDefExprParserRuleCall_19());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_RecordDefExpr_60 = ruleRecordDefExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_RecordDefExpr_60;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 21:
				// InternalAgreeParser.g:950:5: this_InputStatement_61= ruleInputStatement
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getSpecStatementAccess().getInputStatementParserRuleCall_20());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_InputStatement_61 = ruleInputStatement();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_InputStatement_61;
						afterParserOrEnumRuleCall();

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleSpecStatement"

	// $ANTLR start "entryRulePatternStatement"
	// InternalAgreeParser.g:966:1: entryRulePatternStatement returns [EObject current=null] : iv_rulePatternStatement= rulePatternStatement EOF ;
	public final EObject entryRulePatternStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_rulePatternStatement = null;

		try {
			// InternalAgreeParser.g:967:2: (iv_rulePatternStatement= rulePatternStatement EOF )
			// InternalAgreeParser.g:968:2: iv_rulePatternStatement= rulePatternStatement EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getPatternStatementRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_rulePatternStatement = rulePatternStatement();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_rulePatternStatement;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRulePatternStatement"

	// $ANTLR start "rulePatternStatement"
	// InternalAgreeParser.g:975:1: rulePatternStatement returns [EObject current=null] : (this_WheneverStatement_0= ruleWheneverStatement | ( () otherlv_2=
	// Always ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) | this_WhenStatement_5= ruleWhenStatement | this_RealTimeStatement_6= ruleRealTimeStatement )
	// ;
	public final EObject rulePatternStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_2 = null;
		Token otherlv_4 = null;
		EObject this_WheneverStatement_0 = null;

		EObject lv_expr_3_0 = null;

		EObject this_WhenStatement_5 = null;

		EObject this_RealTimeStatement_6 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:978:28: ( (this_WheneverStatement_0= ruleWheneverStatement | ( () otherlv_2= Always ( (lv_expr_3_0= ruleExpr ) ) otherlv_4=
			// Semicolon ) | this_WhenStatement_5= ruleWhenStatement | this_RealTimeStatement_6= ruleRealTimeStatement ) )
			// InternalAgreeParser.g:979:1: (this_WheneverStatement_0= ruleWheneverStatement | ( () otherlv_2= Always ( (lv_expr_3_0= ruleExpr ) ) otherlv_4=
			// Semicolon ) | this_WhenStatement_5= ruleWhenStatement | this_RealTimeStatement_6= ruleRealTimeStatement )
			{
				// InternalAgreeParser.g:979:1: (this_WheneverStatement_0= ruleWheneverStatement | ( () otherlv_2= Always ( (lv_expr_3_0= ruleExpr ) )
				// otherlv_4= Semicolon ) | this_WhenStatement_5= ruleWhenStatement | this_RealTimeStatement_6= ruleRealTimeStatement )
				int alt9 = 4;
				switch (input.LA(1)) {
				case Whenever: {
					alt9 = 1;
				}
					break;
				case Always: {
					alt9 = 2;
				}
					break;
				case When: {
					alt9 = 3;
				}
					break;
				case Condition: {
					alt9 = 4;
				}
					break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 9, 0, input);

					throw nvae;
				}

				switch (alt9) {
				case 1:
				// InternalAgreeParser.g:980:5: this_WheneverStatement_0= ruleWheneverStatement
				{
					if (state.backtracking == 0) {

						newCompositeNode(
								grammarAccess.getPatternStatementAccess().getWheneverStatementParserRuleCall_0());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_WheneverStatement_0 = ruleWheneverStatement();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_WheneverStatement_0;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:989:6: ( () otherlv_2= Always ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
				{
					// InternalAgreeParser.g:989:6: ( () otherlv_2= Always ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
					// InternalAgreeParser.g:989:7: () otherlv_2= Always ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon
					{
						// InternalAgreeParser.g:989:7: ()
						// InternalAgreeParser.g:990:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getPatternStatementAccess().getAlwaysStatementAction_1_0(),
										current);

							}

						}

						otherlv_2 = (Token) match(input, Always, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_2, grammarAccess.getPatternStatementAccess().getAlwaysKeyword_1_1());

						}
						// InternalAgreeParser.g:1000:1: ( (lv_expr_3_0= ruleExpr ) )
						// InternalAgreeParser.g:1001:1: (lv_expr_3_0= ruleExpr )
						{
							// InternalAgreeParser.g:1001:1: (lv_expr_3_0= ruleExpr )
							// InternalAgreeParser.g:1002:3: lv_expr_3_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getPatternStatementAccess()
											.getExprExprParserRuleCall_1_2_0());

								}
								pushFollow(FollowSets000.FOLLOW_7);
								lv_expr_3_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getPatternStatementRule());
									}
									set(current, "expr", lv_expr_3_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_4 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_4, grammarAccess.getPatternStatementAccess().getSemicolonKeyword_1_3());

						}

					}

				}
					break;
				case 3:
				// InternalAgreeParser.g:1025:5: this_WhenStatement_5= ruleWhenStatement
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getPatternStatementAccess().getWhenStatementParserRuleCall_2());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_WhenStatement_5 = ruleWhenStatement();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_WhenStatement_5;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 4:
				// InternalAgreeParser.g:1035:5: this_RealTimeStatement_6= ruleRealTimeStatement
				{
					if (state.backtracking == 0) {

						newCompositeNode(
								grammarAccess.getPatternStatementAccess().getRealTimeStatementParserRuleCall_3());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_RealTimeStatement_6 = ruleRealTimeStatement();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_RealTimeStatement_6;
						afterParserOrEnumRuleCall();

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "rulePatternStatement"

	// $ANTLR start "entryRuleWhenStatement"
	// InternalAgreeParser.g:1051:1: entryRuleWhenStatement returns [EObject current=null] : iv_ruleWhenStatement= ruleWhenStatement EOF ;
	public final EObject entryRuleWhenStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleWhenStatement = null;

		try {
			// InternalAgreeParser.g:1052:2: (iv_ruleWhenStatement= ruleWhenStatement EOF )
			// InternalAgreeParser.g:1053:2: iv_ruleWhenStatement= ruleWhenStatement EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getWhenStatementRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleWhenStatement = ruleWhenStatement();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleWhenStatement;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleWhenStatement"

	// $ANTLR start "ruleWhenStatement"
	// InternalAgreeParser.g:1060:1: ruleWhenStatement returns [EObject current=null] : ( ( ( ( ( () When ( ( ruleExpr ) ) Holds ) )=> ( () otherlv_1= When (
	// (lv_condition_2_0= ruleExpr ) ) otherlv_3= Holds ) ) otherlv_4= During ( (lv_conditionInterval_5_0= ruleTimeInterval ) ) ( (lv_event_6_0= ruleExpr ) ) (
	// (lv_excl_7_0= Exclusively ) )? otherlv_8= Occurs (otherlv_9= During ( (lv_eventInterval_10_0= ruleTimeInterval ) ) )? ) | ( ( ( ( () When ( ( ruleExpr )
	// ) Occurs ) )=> ( () otherlv_12= When ( (lv_condition_13_0= ruleExpr ) ) otherlv_14= Occurs ) ) ( (lv_times_15_0= ruleExpr ) ) otherlv_16= Times
	// otherlv_17= During ( (lv_interval_18_0= ruleTimeInterval ) ) ( (lv_excl_19_0= Exclusively ) )? otherlv_20= Raises ( (lv_event_21_0= ruleExpr ) ) ) ) ;
	public final EObject ruleWhenStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_3 = null;
		Token otherlv_4 = null;
		Token lv_excl_7_0 = null;
		Token otherlv_8 = null;
		Token otherlv_9 = null;
		Token otherlv_12 = null;
		Token otherlv_14 = null;
		Token otherlv_16 = null;
		Token otherlv_17 = null;
		Token lv_excl_19_0 = null;
		Token otherlv_20 = null;
		EObject lv_condition_2_0 = null;

		EObject lv_conditionInterval_5_0 = null;

		EObject lv_event_6_0 = null;

		EObject lv_eventInterval_10_0 = null;

		EObject lv_condition_13_0 = null;

		EObject lv_times_15_0 = null;

		EObject lv_interval_18_0 = null;

		EObject lv_event_21_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:1063:28: ( ( ( ( ( ( () When ( ( ruleExpr ) ) Holds ) )=> ( () otherlv_1= When ( (lv_condition_2_0= ruleExpr ) ) otherlv_3=
			// Holds ) ) otherlv_4= During ( (lv_conditionInterval_5_0= ruleTimeInterval ) ) ( (lv_event_6_0= ruleExpr ) ) ( (lv_excl_7_0= Exclusively ) )?
			// otherlv_8= Occurs (otherlv_9= During ( (lv_eventInterval_10_0= ruleTimeInterval ) ) )? ) | ( ( ( ( () When ( ( ruleExpr ) ) Occurs ) )=> ( ()
			// otherlv_12= When ( (lv_condition_13_0= ruleExpr ) ) otherlv_14= Occurs ) ) ( (lv_times_15_0= ruleExpr ) ) otherlv_16= Times otherlv_17= During (
			// (lv_interval_18_0= ruleTimeInterval ) ) ( (lv_excl_19_0= Exclusively ) )? otherlv_20= Raises ( (lv_event_21_0= ruleExpr ) ) ) ) )
			// InternalAgreeParser.g:1064:1: ( ( ( ( ( () When ( ( ruleExpr ) ) Holds ) )=> ( () otherlv_1= When ( (lv_condition_2_0= ruleExpr ) ) otherlv_3=
			// Holds ) ) otherlv_4= During ( (lv_conditionInterval_5_0= ruleTimeInterval ) ) ( (lv_event_6_0= ruleExpr ) ) ( (lv_excl_7_0= Exclusively ) )?
			// otherlv_8= Occurs (otherlv_9= During ( (lv_eventInterval_10_0= ruleTimeInterval ) ) )? ) | ( ( ( ( () When ( ( ruleExpr ) ) Occurs ) )=> ( ()
			// otherlv_12= When ( (lv_condition_13_0= ruleExpr ) ) otherlv_14= Occurs ) ) ( (lv_times_15_0= ruleExpr ) ) otherlv_16= Times otherlv_17= During (
			// (lv_interval_18_0= ruleTimeInterval ) ) ( (lv_excl_19_0= Exclusively ) )? otherlv_20= Raises ( (lv_event_21_0= ruleExpr ) ) ) )
			{
				// InternalAgreeParser.g:1064:1: ( ( ( ( ( () When ( ( ruleExpr ) ) Holds ) )=> ( () otherlv_1= When ( (lv_condition_2_0= ruleExpr ) )
				// otherlv_3= Holds ) ) otherlv_4= During ( (lv_conditionInterval_5_0= ruleTimeInterval ) ) ( (lv_event_6_0= ruleExpr ) ) ( (lv_excl_7_0=
				// Exclusively ) )? otherlv_8= Occurs (otherlv_9= During ( (lv_eventInterval_10_0= ruleTimeInterval ) ) )? ) | ( ( ( ( () When ( ( ruleExpr ) )
				// Occurs ) )=> ( () otherlv_12= When ( (lv_condition_13_0= ruleExpr ) ) otherlv_14= Occurs ) ) ( (lv_times_15_0= ruleExpr ) ) otherlv_16= Times
				// otherlv_17= During ( (lv_interval_18_0= ruleTimeInterval ) ) ( (lv_excl_19_0= Exclusively ) )? otherlv_20= Raises ( (lv_event_21_0= ruleExpr
				// ) ) ) )
				int alt13 = 2;
				int LA13_0 = input.LA(1);

				if ((LA13_0 == When)) {
					int LA13_1 = input.LA(2);

					if ((synpred1_InternalAgreeParser())) {
						alt13 = 1;
					} else if ((synpred2_InternalAgreeParser())) {
						alt13 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return current;
						}
						NoViableAltException nvae = new NoViableAltException("", 13, 1, input);

						throw nvae;
					}
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 13, 0, input);

					throw nvae;
				}
				switch (alt13) {
				case 1:
				// InternalAgreeParser.g:1064:2: ( ( ( ( () When ( ( ruleExpr ) ) Holds ) )=> ( () otherlv_1= When ( (lv_condition_2_0= ruleExpr ) ) otherlv_3=
				// Holds ) ) otherlv_4= During ( (lv_conditionInterval_5_0= ruleTimeInterval ) ) ( (lv_event_6_0= ruleExpr ) ) ( (lv_excl_7_0= Exclusively ) )?
				// otherlv_8= Occurs (otherlv_9= During ( (lv_eventInterval_10_0= ruleTimeInterval ) ) )? )
				{
					// InternalAgreeParser.g:1064:2: ( ( ( ( () When ( ( ruleExpr ) ) Holds ) )=> ( () otherlv_1= When ( (lv_condition_2_0= ruleExpr ) )
					// otherlv_3= Holds ) ) otherlv_4= During ( (lv_conditionInterval_5_0= ruleTimeInterval ) ) ( (lv_event_6_0= ruleExpr ) ) ( (lv_excl_7_0=
					// Exclusively ) )? otherlv_8= Occurs (otherlv_9= During ( (lv_eventInterval_10_0= ruleTimeInterval ) ) )? )
					// InternalAgreeParser.g:1064:3: ( ( ( () When ( ( ruleExpr ) ) Holds ) )=> ( () otherlv_1= When ( (lv_condition_2_0= ruleExpr ) )
					// otherlv_3= Holds ) ) otherlv_4= During ( (lv_conditionInterval_5_0= ruleTimeInterval ) ) ( (lv_event_6_0= ruleExpr ) ) ( (lv_excl_7_0=
					// Exclusively ) )? otherlv_8= Occurs (otherlv_9= During ( (lv_eventInterval_10_0= ruleTimeInterval ) ) )?
					{
						// InternalAgreeParser.g:1064:3: ( ( ( () When ( ( ruleExpr ) ) Holds ) )=> ( () otherlv_1= When ( (lv_condition_2_0= ruleExpr ) )
						// otherlv_3= Holds ) )
						// InternalAgreeParser.g:1064:4: ( ( () When ( ( ruleExpr ) ) Holds ) )=> ( () otherlv_1= When ( (lv_condition_2_0= ruleExpr ) )
						// otherlv_3= Holds )
						{
							// InternalAgreeParser.g:1073:5: ( () otherlv_1= When ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= Holds )
							// InternalAgreeParser.g:1073:6: () otherlv_1= When ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= Holds
							{
								// InternalAgreeParser.g:1073:6: ()
								// InternalAgreeParser.g:1074:5:
								{
									if (state.backtracking == 0) {

										current = forceCreateModelElement(grammarAccess.getWhenStatementAccess()
												.getWhenHoldsStatementAction_0_0_0_0(), current);

									}

								}

								otherlv_1 = (Token) match(input, When, FollowSets000.FOLLOW_9);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_1,
											grammarAccess.getWhenStatementAccess().getWhenKeyword_0_0_0_1());

								}
								// InternalAgreeParser.g:1084:1: ( (lv_condition_2_0= ruleExpr ) )
								// InternalAgreeParser.g:1085:1: (lv_condition_2_0= ruleExpr )
								{
									// InternalAgreeParser.g:1085:1: (lv_condition_2_0= ruleExpr )
									// InternalAgreeParser.g:1086:3: lv_condition_2_0= ruleExpr
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getWhenStatementAccess()
													.getConditionExprParserRuleCall_0_0_0_2_0());

										}
										pushFollow(FollowSets000.FOLLOW_12);
										lv_condition_2_0 = ruleExpr();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getWhenStatementRule());
											}
											set(current, "condition", lv_condition_2_0,
													"com.rockwellcollins.atc.agree.Agree.Expr");
											afterParserOrEnumRuleCall();

										}

									}

								}

								otherlv_3 = (Token) match(input, Holds, FollowSets000.FOLLOW_13);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_3,
											grammarAccess.getWhenStatementAccess().getHoldsKeyword_0_0_0_3());

								}

							}

						}

						otherlv_4 = (Token) match(input, During, FollowSets000.FOLLOW_14);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_4, grammarAccess.getWhenStatementAccess().getDuringKeyword_0_1());

						}
						// InternalAgreeParser.g:1112:1: ( (lv_conditionInterval_5_0= ruleTimeInterval ) )
						// InternalAgreeParser.g:1113:1: (lv_conditionInterval_5_0= ruleTimeInterval )
						{
							// InternalAgreeParser.g:1113:1: (lv_conditionInterval_5_0= ruleTimeInterval )
							// InternalAgreeParser.g:1114:3: lv_conditionInterval_5_0= ruleTimeInterval
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getWhenStatementAccess()
											.getConditionIntervalTimeIntervalParserRuleCall_0_2_0());

								}
								pushFollow(FollowSets000.FOLLOW_9);
								lv_conditionInterval_5_0 = ruleTimeInterval();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getWhenStatementRule());
									}
									set(current, "conditionInterval", lv_conditionInterval_5_0,
											"com.rockwellcollins.atc.agree.Agree.TimeInterval");
									afterParserOrEnumRuleCall();

								}

							}

						}

						// InternalAgreeParser.g:1130:2: ( (lv_event_6_0= ruleExpr ) )
						// InternalAgreeParser.g:1131:1: (lv_event_6_0= ruleExpr )
						{
							// InternalAgreeParser.g:1131:1: (lv_event_6_0= ruleExpr )
							// InternalAgreeParser.g:1132:3: lv_event_6_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getWhenStatementAccess().getEventExprParserRuleCall_0_3_0());

								}
								pushFollow(FollowSets000.FOLLOW_15);
								lv_event_6_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getWhenStatementRule());
									}
									set(current, "event", lv_event_6_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						// InternalAgreeParser.g:1148:2: ( (lv_excl_7_0= Exclusively ) )?
						int alt10 = 2;
						int LA10_0 = input.LA(1);

						if ((LA10_0 == Exclusively)) {
							alt10 = 1;
						}
						switch (alt10) {
						case 1:
						// InternalAgreeParser.g:1149:1: (lv_excl_7_0= Exclusively )
						{
							// InternalAgreeParser.g:1149:1: (lv_excl_7_0= Exclusively )
							// InternalAgreeParser.g:1150:3: lv_excl_7_0= Exclusively
							{
								lv_excl_7_0 = (Token) match(input, Exclusively, FollowSets000.FOLLOW_16);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(lv_excl_7_0,
											grammarAccess.getWhenStatementAccess().getExclExclusivelyKeyword_0_4_0());

								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getWhenStatementRule());
									}
									setWithLastConsumed(current, "excl", lv_excl_7_0, "exclusively");

								}

							}

						}
							break;

						}

						otherlv_8 = (Token) match(input, Occurs, FollowSets000.FOLLOW_17);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_8, grammarAccess.getWhenStatementAccess().getOccursKeyword_0_5());

						}
						// InternalAgreeParser.g:1169:1: (otherlv_9= During ( (lv_eventInterval_10_0= ruleTimeInterval ) ) )?
						int alt11 = 2;
						int LA11_0 = input.LA(1);

						if ((LA11_0 == During)) {
							alt11 = 1;
						}
						switch (alt11) {
						case 1:
						// InternalAgreeParser.g:1170:2: otherlv_9= During ( (lv_eventInterval_10_0= ruleTimeInterval ) )
						{
							otherlv_9 = (Token) match(input, During, FollowSets000.FOLLOW_14);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_9, grammarAccess.getWhenStatementAccess().getDuringKeyword_0_6_0());

							}
							// InternalAgreeParser.g:1174:1: ( (lv_eventInterval_10_0= ruleTimeInterval ) )
							// InternalAgreeParser.g:1175:1: (lv_eventInterval_10_0= ruleTimeInterval )
							{
								// InternalAgreeParser.g:1175:1: (lv_eventInterval_10_0= ruleTimeInterval )
								// InternalAgreeParser.g:1176:3: lv_eventInterval_10_0= ruleTimeInterval
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getWhenStatementAccess()
												.getEventIntervalTimeIntervalParserRuleCall_0_6_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_2);
									lv_eventInterval_10_0 = ruleTimeInterval();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getWhenStatementRule());
										}
										set(current, "eventInterval", lv_eventInterval_10_0,
												"com.rockwellcollins.atc.agree.Agree.TimeInterval");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						}

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:1193:6: ( ( ( ( () When ( ( ruleExpr ) ) Occurs ) )=> ( () otherlv_12= When ( (lv_condition_13_0= ruleExpr ) )
				// otherlv_14= Occurs ) ) ( (lv_times_15_0= ruleExpr ) ) otherlv_16= Times otherlv_17= During ( (lv_interval_18_0= ruleTimeInterval ) ) (
				// (lv_excl_19_0= Exclusively ) )? otherlv_20= Raises ( (lv_event_21_0= ruleExpr ) ) )
				{
					// InternalAgreeParser.g:1193:6: ( ( ( ( () When ( ( ruleExpr ) ) Occurs ) )=> ( () otherlv_12= When ( (lv_condition_13_0= ruleExpr ) )
					// otherlv_14= Occurs ) ) ( (lv_times_15_0= ruleExpr ) ) otherlv_16= Times otherlv_17= During ( (lv_interval_18_0= ruleTimeInterval ) ) (
					// (lv_excl_19_0= Exclusively ) )? otherlv_20= Raises ( (lv_event_21_0= ruleExpr ) ) )
					// InternalAgreeParser.g:1193:7: ( ( ( () When ( ( ruleExpr ) ) Occurs ) )=> ( () otherlv_12= When ( (lv_condition_13_0= ruleExpr ) )
					// otherlv_14= Occurs ) ) ( (lv_times_15_0= ruleExpr ) ) otherlv_16= Times otherlv_17= During ( (lv_interval_18_0= ruleTimeInterval ) ) (
					// (lv_excl_19_0= Exclusively ) )? otherlv_20= Raises ( (lv_event_21_0= ruleExpr ) )
					{
						// InternalAgreeParser.g:1193:7: ( ( ( () When ( ( ruleExpr ) ) Occurs ) )=> ( () otherlv_12= When ( (lv_condition_13_0= ruleExpr ) )
						// otherlv_14= Occurs ) )
						// InternalAgreeParser.g:1193:8: ( ( () When ( ( ruleExpr ) ) Occurs ) )=> ( () otherlv_12= When ( (lv_condition_13_0= ruleExpr ) )
						// otherlv_14= Occurs )
						{
							// InternalAgreeParser.g:1202:5: ( () otherlv_12= When ( (lv_condition_13_0= ruleExpr ) ) otherlv_14= Occurs )
							// InternalAgreeParser.g:1202:6: () otherlv_12= When ( (lv_condition_13_0= ruleExpr ) ) otherlv_14= Occurs
							{
								// InternalAgreeParser.g:1202:6: ()
								// InternalAgreeParser.g:1203:5:
								{
									if (state.backtracking == 0) {

										current = forceCreateModelElement(grammarAccess.getWhenStatementAccess()
												.getWhenOccursStatmentAction_1_0_0_0(), current);

									}

								}

								otherlv_12 = (Token) match(input, When, FollowSets000.FOLLOW_9);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_12,
											grammarAccess.getWhenStatementAccess().getWhenKeyword_1_0_0_1());

								}
								// InternalAgreeParser.g:1213:1: ( (lv_condition_13_0= ruleExpr ) )
								// InternalAgreeParser.g:1214:1: (lv_condition_13_0= ruleExpr )
								{
									// InternalAgreeParser.g:1214:1: (lv_condition_13_0= ruleExpr )
									// InternalAgreeParser.g:1215:3: lv_condition_13_0= ruleExpr
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getWhenStatementAccess()
													.getConditionExprParserRuleCall_1_0_0_2_0());

										}
										pushFollow(FollowSets000.FOLLOW_16);
										lv_condition_13_0 = ruleExpr();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getWhenStatementRule());
											}
											set(current, "condition", lv_condition_13_0,
													"com.rockwellcollins.atc.agree.Agree.Expr");
											afterParserOrEnumRuleCall();

										}

									}

								}

								otherlv_14 = (Token) match(input, Occurs, FollowSets000.FOLLOW_9);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_14,
											grammarAccess.getWhenStatementAccess().getOccursKeyword_1_0_0_3());

								}

							}

						}

						// InternalAgreeParser.g:1236:3: ( (lv_times_15_0= ruleExpr ) )
						// InternalAgreeParser.g:1237:1: (lv_times_15_0= ruleExpr )
						{
							// InternalAgreeParser.g:1237:1: (lv_times_15_0= ruleExpr )
							// InternalAgreeParser.g:1238:3: lv_times_15_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getWhenStatementAccess().getTimesExprParserRuleCall_1_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_18);
								lv_times_15_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getWhenStatementRule());
									}
									set(current, "times", lv_times_15_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_16 = (Token) match(input, Times, FollowSets000.FOLLOW_13);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_16, grammarAccess.getWhenStatementAccess().getTimesKeyword_1_2());

						}
						otherlv_17 = (Token) match(input, During, FollowSets000.FOLLOW_14);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_17, grammarAccess.getWhenStatementAccess().getDuringKeyword_1_3());

						}
						// InternalAgreeParser.g:1264:1: ( (lv_interval_18_0= ruleTimeInterval ) )
						// InternalAgreeParser.g:1265:1: (lv_interval_18_0= ruleTimeInterval )
						{
							// InternalAgreeParser.g:1265:1: (lv_interval_18_0= ruleTimeInterval )
							// InternalAgreeParser.g:1266:3: lv_interval_18_0= ruleTimeInterval
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getWhenStatementAccess()
											.getIntervalTimeIntervalParserRuleCall_1_4_0());

								}
								pushFollow(FollowSets000.FOLLOW_19);
								lv_interval_18_0 = ruleTimeInterval();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getWhenStatementRule());
									}
									set(current, "interval", lv_interval_18_0,
											"com.rockwellcollins.atc.agree.Agree.TimeInterval");
									afterParserOrEnumRuleCall();

								}

							}

						}

						// InternalAgreeParser.g:1282:2: ( (lv_excl_19_0= Exclusively ) )?
						int alt12 = 2;
						int LA12_0 = input.LA(1);

						if ((LA12_0 == Exclusively)) {
							alt12 = 1;
						}
						switch (alt12) {
						case 1:
						// InternalAgreeParser.g:1283:1: (lv_excl_19_0= Exclusively )
						{
							// InternalAgreeParser.g:1283:1: (lv_excl_19_0= Exclusively )
							// InternalAgreeParser.g:1284:3: lv_excl_19_0= Exclusively
							{
								lv_excl_19_0 = (Token) match(input, Exclusively, FollowSets000.FOLLOW_20);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(lv_excl_19_0,
											grammarAccess.getWhenStatementAccess().getExclExclusivelyKeyword_1_5_0());

								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getWhenStatementRule());
									}
									setWithLastConsumed(current, "excl", lv_excl_19_0, "exclusively");

								}

							}

						}
							break;

						}

						otherlv_20 = (Token) match(input, Raises, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_20, grammarAccess.getWhenStatementAccess().getRaisesKeyword_1_6());

						}
						// InternalAgreeParser.g:1303:1: ( (lv_event_21_0= ruleExpr ) )
						// InternalAgreeParser.g:1304:1: (lv_event_21_0= ruleExpr )
						{
							// InternalAgreeParser.g:1304:1: (lv_event_21_0= ruleExpr )
							// InternalAgreeParser.g:1305:3: lv_event_21_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getWhenStatementAccess().getEventExprParserRuleCall_1_7_0());

								}
								pushFollow(FollowSets000.FOLLOW_2);
								lv_event_21_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getWhenStatementRule());
									}
									set(current, "event", lv_event_21_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleWhenStatement"

	// $ANTLR start "entryRuleWheneverStatement"
	// InternalAgreeParser.g:1329:1: entryRuleWheneverStatement returns [EObject current=null] : iv_ruleWheneverStatement= ruleWheneverStatement EOF ;
	public final EObject entryRuleWheneverStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleWheneverStatement = null;

		try {
			// InternalAgreeParser.g:1330:2: (iv_ruleWheneverStatement= ruleWheneverStatement EOF )
			// InternalAgreeParser.g:1331:2: iv_ruleWheneverStatement= ruleWheneverStatement EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getWheneverStatementRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleWheneverStatement = ruleWheneverStatement();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleWheneverStatement;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleWheneverStatement"

	// $ANTLR start "ruleWheneverStatement"
	// InternalAgreeParser.g:1338:1: ruleWheneverStatement returns [EObject current=null] : ( ( ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( (
	// Exclusively ) )? ( Occur | Occurs ) ) )=> ( () otherlv_1= Whenever ( (lv_cause_2_0= ruleExpr ) ) otherlv_3= Occurs ( (lv_effect_4_0= ruleExpr ) ) (
	// (lv_excl_5_0= Exclusively ) )? (otherlv_6= Occur | otherlv_7= Occurs ) ) ) (otherlv_8= During ( (lv_interval_9_0= ruleTimeInterval ) ) )? ) | ( ( ( ( ()
	// Whenever ( ( ruleExpr ) ) Becomes True ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) ) )=> ( () otherlv_11= Whenever ( (lv_cause_12_0=
	// ruleExpr ) ) otherlv_13= Becomes otherlv_14= True ( (lv_effect_15_0= ruleExpr ) ) ( (lv_excl_16_0= Exclusively ) )? (otherlv_17= Occur | otherlv_18=
	// Occurs ) ) ) (otherlv_19= During ( (lv_interval_20_0= ruleTimeInterval ) ) )? ) | ( ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( (
	// Exclusively ) )? Holds ) )=> ( () otherlv_22= Whenever ( (lv_cause_23_0= ruleExpr ) ) otherlv_24= Occurs ( (lv_effect_25_0= ruleExpr ) ) ( (lv_excl_26_0=
	// Exclusively ) )? otherlv_27= Holds ) ) (otherlv_28= During ( (lv_interval_29_0= ruleTimeInterval ) ) )? ) | ( ( ( ( () Whenever ( ( ruleExpr ) ) Occurs (
	// ( ruleExpr ) ) Implies ) )=> ( () otherlv_31= Whenever ( (lv_cause_32_0= ruleExpr ) ) otherlv_33= Occurs ( (lv_lhs_34_0= ruleExpr ) ) otherlv_35= Implies
	// ) ) ( (lv_rhs_36_0= ruleExpr ) ) ( (lv_excl_37_0= Exclusively ) )? (otherlv_38= During ( (lv_interval_39_0= ruleTimeInterval ) ) )? ) ) ;
	public final EObject ruleWheneverStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_3 = null;
		Token lv_excl_5_0 = null;
		Token otherlv_6 = null;
		Token otherlv_7 = null;
		Token otherlv_8 = null;
		Token otherlv_11 = null;
		Token otherlv_13 = null;
		Token otherlv_14 = null;
		Token lv_excl_16_0 = null;
		Token otherlv_17 = null;
		Token otherlv_18 = null;
		Token otherlv_19 = null;
		Token otherlv_22 = null;
		Token otherlv_24 = null;
		Token lv_excl_26_0 = null;
		Token otherlv_27 = null;
		Token otherlv_28 = null;
		Token otherlv_31 = null;
		Token otherlv_33 = null;
		Token otherlv_35 = null;
		Token lv_excl_37_0 = null;
		Token otherlv_38 = null;
		EObject lv_cause_2_0 = null;

		EObject lv_effect_4_0 = null;

		EObject lv_interval_9_0 = null;

		EObject lv_cause_12_0 = null;

		EObject lv_effect_15_0 = null;

		EObject lv_interval_20_0 = null;

		EObject lv_cause_23_0 = null;

		EObject lv_effect_25_0 = null;

		EObject lv_interval_29_0 = null;

		EObject lv_cause_32_0 = null;

		EObject lv_lhs_34_0 = null;

		EObject lv_rhs_36_0 = null;

		EObject lv_interval_39_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:1341:28: ( ( ( ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) ) )=> (
			// () otherlv_1= Whenever ( (lv_cause_2_0= ruleExpr ) ) otherlv_3= Occurs ( (lv_effect_4_0= ruleExpr ) ) ( (lv_excl_5_0= Exclusively ) )?
			// (otherlv_6= Occur | otherlv_7= Occurs ) ) ) (otherlv_8= During ( (lv_interval_9_0= ruleTimeInterval ) ) )? ) | ( ( ( ( () Whenever ( ( ruleExpr )
			// ) Becomes True ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) ) )=> ( () otherlv_11= Whenever ( (lv_cause_12_0= ruleExpr ) )
			// otherlv_13= Becomes otherlv_14= True ( (lv_effect_15_0= ruleExpr ) ) ( (lv_excl_16_0= Exclusively ) )? (otherlv_17= Occur | otherlv_18= Occurs )
			// ) ) (otherlv_19= During ( (lv_interval_20_0= ruleTimeInterval ) ) )? ) | ( ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( (
			// Exclusively ) )? Holds ) )=> ( () otherlv_22= Whenever ( (lv_cause_23_0= ruleExpr ) ) otherlv_24= Occurs ( (lv_effect_25_0= ruleExpr ) ) (
			// (lv_excl_26_0= Exclusively ) )? otherlv_27= Holds ) ) (otherlv_28= During ( (lv_interval_29_0= ruleTimeInterval ) ) )? ) | ( ( ( ( () Whenever (
			// ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) Implies ) )=> ( () otherlv_31= Whenever ( (lv_cause_32_0= ruleExpr ) ) otherlv_33= Occurs ( (lv_lhs_34_0=
			// ruleExpr ) ) otherlv_35= Implies ) ) ( (lv_rhs_36_0= ruleExpr ) ) ( (lv_excl_37_0= Exclusively ) )? (otherlv_38= During ( (lv_interval_39_0=
			// ruleTimeInterval ) ) )? ) ) )
			// InternalAgreeParser.g:1342:1: ( ( ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) ) )=> ( ()
			// otherlv_1= Whenever ( (lv_cause_2_0= ruleExpr ) ) otherlv_3= Occurs ( (lv_effect_4_0= ruleExpr ) ) ( (lv_excl_5_0= Exclusively ) )? (otherlv_6=
			// Occur | otherlv_7= Occurs ) ) ) (otherlv_8= During ( (lv_interval_9_0= ruleTimeInterval ) ) )? ) | ( ( ( ( () Whenever ( ( ruleExpr ) ) Becomes
			// True ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) ) )=> ( () otherlv_11= Whenever ( (lv_cause_12_0= ruleExpr ) ) otherlv_13= Becomes
			// otherlv_14= True ( (lv_effect_15_0= ruleExpr ) ) ( (lv_excl_16_0= Exclusively ) )? (otherlv_17= Occur | otherlv_18= Occurs ) ) ) (otherlv_19=
			// During ( (lv_interval_20_0= ruleTimeInterval ) ) )? ) | ( ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? Holds )
			// )=> ( () otherlv_22= Whenever ( (lv_cause_23_0= ruleExpr ) ) otherlv_24= Occurs ( (lv_effect_25_0= ruleExpr ) ) ( (lv_excl_26_0= Exclusively ) )?
			// otherlv_27= Holds ) ) (otherlv_28= During ( (lv_interval_29_0= ruleTimeInterval ) ) )? ) | ( ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( (
			// ruleExpr ) ) Implies ) )=> ( () otherlv_31= Whenever ( (lv_cause_32_0= ruleExpr ) ) otherlv_33= Occurs ( (lv_lhs_34_0= ruleExpr ) ) otherlv_35=
			// Implies ) ) ( (lv_rhs_36_0= ruleExpr ) ) ( (lv_excl_37_0= Exclusively ) )? (otherlv_38= During ( (lv_interval_39_0= ruleTimeInterval ) ) )? ) )
			{
				// InternalAgreeParser.g:1342:1: ( ( ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) ) )=> (
				// () otherlv_1= Whenever ( (lv_cause_2_0= ruleExpr ) ) otherlv_3= Occurs ( (lv_effect_4_0= ruleExpr ) ) ( (lv_excl_5_0= Exclusively ) )?
				// (otherlv_6= Occur | otherlv_7= Occurs ) ) ) (otherlv_8= During ( (lv_interval_9_0= ruleTimeInterval ) ) )? ) | ( ( ( ( () Whenever ( (
				// ruleExpr ) ) Becomes True ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) ) )=> ( () otherlv_11= Whenever ( (lv_cause_12_0= ruleExpr
				// ) ) otherlv_13= Becomes otherlv_14= True ( (lv_effect_15_0= ruleExpr ) ) ( (lv_excl_16_0= Exclusively ) )? (otherlv_17= Occur | otherlv_18=
				// Occurs ) ) ) (otherlv_19= During ( (lv_interval_20_0= ruleTimeInterval ) ) )? ) | ( ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr )
				// ) ( ( Exclusively ) )? Holds ) )=> ( () otherlv_22= Whenever ( (lv_cause_23_0= ruleExpr ) ) otherlv_24= Occurs ( (lv_effect_25_0= ruleExpr )
				// ) ( (lv_excl_26_0= Exclusively ) )? otherlv_27= Holds ) ) (otherlv_28= During ( (lv_interval_29_0= ruleTimeInterval ) ) )? ) | ( ( ( ( ()
				// Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) Implies ) )=> ( () otherlv_31= Whenever ( (lv_cause_32_0= ruleExpr ) ) otherlv_33= Occurs (
				// (lv_lhs_34_0= ruleExpr ) ) otherlv_35= Implies ) ) ( (lv_rhs_36_0= ruleExpr ) ) ( (lv_excl_37_0= Exclusively ) )? (otherlv_38= During (
				// (lv_interval_39_0= ruleTimeInterval ) ) )? ) )
				int alt24 = 4;
				int LA24_0 = input.LA(1);

				if ((LA24_0 == Whenever)) {
					int LA24_1 = input.LA(2);

					if ((synpred3_InternalAgreeParser())) {
						alt24 = 1;
					} else if ((synpred4_InternalAgreeParser())) {
						alt24 = 2;
					} else if ((synpred5_InternalAgreeParser())) {
						alt24 = 3;
					} else if ((synpred6_InternalAgreeParser())) {
						alt24 = 4;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return current;
						}
						NoViableAltException nvae = new NoViableAltException("", 24, 1, input);

						throw nvae;
					}
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 24, 0, input);

					throw nvae;
				}
				switch (alt24) {
				case 1:
				// InternalAgreeParser.g:1342:2: ( ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) ) )=> ( ()
				// otherlv_1= Whenever ( (lv_cause_2_0= ruleExpr ) ) otherlv_3= Occurs ( (lv_effect_4_0= ruleExpr ) ) ( (lv_excl_5_0= Exclusively ) )?
				// (otherlv_6= Occur | otherlv_7= Occurs ) ) ) (otherlv_8= During ( (lv_interval_9_0= ruleTimeInterval ) ) )? )
				{
					// InternalAgreeParser.g:1342:2: ( ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) ) )=>
					// ( () otherlv_1= Whenever ( (lv_cause_2_0= ruleExpr ) ) otherlv_3= Occurs ( (lv_effect_4_0= ruleExpr ) ) ( (lv_excl_5_0= Exclusively ) )?
					// (otherlv_6= Occur | otherlv_7= Occurs ) ) ) (otherlv_8= During ( (lv_interval_9_0= ruleTimeInterval ) ) )? )
					// InternalAgreeParser.g:1342:3: ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) ) )=> (
					// () otherlv_1= Whenever ( (lv_cause_2_0= ruleExpr ) ) otherlv_3= Occurs ( (lv_effect_4_0= ruleExpr ) ) ( (lv_excl_5_0= Exclusively ) )?
					// (otherlv_6= Occur | otherlv_7= Occurs ) ) ) (otherlv_8= During ( (lv_interval_9_0= ruleTimeInterval ) ) )?
					{
						// InternalAgreeParser.g:1342:3: ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) )
						// )=> ( () otherlv_1= Whenever ( (lv_cause_2_0= ruleExpr ) ) otherlv_3= Occurs ( (lv_effect_4_0= ruleExpr ) ) ( (lv_excl_5_0=
						// Exclusively ) )? (otherlv_6= Occur | otherlv_7= Occurs ) ) )
						// InternalAgreeParser.g:1342:4: ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) ) )=>
						// ( () otherlv_1= Whenever ( (lv_cause_2_0= ruleExpr ) ) otherlv_3= Occurs ( (lv_effect_4_0= ruleExpr ) ) ( (lv_excl_5_0= Exclusively )
						// )? (otherlv_6= Occur | otherlv_7= Occurs ) )
						{
							// InternalAgreeParser.g:1367:6: ( () otherlv_1= Whenever ( (lv_cause_2_0= ruleExpr ) ) otherlv_3= Occurs ( (lv_effect_4_0= ruleExpr
							// ) ) ( (lv_excl_5_0= Exclusively ) )? (otherlv_6= Occur | otherlv_7= Occurs ) )
							// InternalAgreeParser.g:1367:7: () otherlv_1= Whenever ( (lv_cause_2_0= ruleExpr ) ) otherlv_3= Occurs ( (lv_effect_4_0= ruleExpr )
							// ) ( (lv_excl_5_0= Exclusively ) )? (otherlv_6= Occur | otherlv_7= Occurs )
							{
								// InternalAgreeParser.g:1367:7: ()
								// InternalAgreeParser.g:1368:5:
								{
									if (state.backtracking == 0) {

										current = forceCreateModelElement(grammarAccess.getWheneverStatementAccess()
												.getWheneverOccursStatementAction_0_0_0_0(), current);

									}

								}

								otherlv_1 = (Token) match(input, Whenever, FollowSets000.FOLLOW_9);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_1,
											grammarAccess.getWheneverStatementAccess().getWheneverKeyword_0_0_0_1());

								}
								// InternalAgreeParser.g:1378:1: ( (lv_cause_2_0= ruleExpr ) )
								// InternalAgreeParser.g:1379:1: (lv_cause_2_0= ruleExpr )
								{
									// InternalAgreeParser.g:1379:1: (lv_cause_2_0= ruleExpr )
									// InternalAgreeParser.g:1380:3: lv_cause_2_0= ruleExpr
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getWheneverStatementAccess()
													.getCauseExprParserRuleCall_0_0_0_2_0());

										}
										pushFollow(FollowSets000.FOLLOW_16);
										lv_cause_2_0 = ruleExpr();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getWheneverStatementRule());
											}
											set(current, "cause", lv_cause_2_0,
													"com.rockwellcollins.atc.agree.Agree.Expr");
											afterParserOrEnumRuleCall();

										}

									}

								}

								otherlv_3 = (Token) match(input, Occurs, FollowSets000.FOLLOW_9);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_3,
											grammarAccess.getWheneverStatementAccess().getOccursKeyword_0_0_0_3());

								}
								// InternalAgreeParser.g:1401:1: ( (lv_effect_4_0= ruleExpr ) )
								// InternalAgreeParser.g:1402:1: (lv_effect_4_0= ruleExpr )
								{
									// InternalAgreeParser.g:1402:1: (lv_effect_4_0= ruleExpr )
									// InternalAgreeParser.g:1403:3: lv_effect_4_0= ruleExpr
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getWheneverStatementAccess()
													.getEffectExprParserRuleCall_0_0_0_4_0());

										}
										pushFollow(FollowSets000.FOLLOW_21);
										lv_effect_4_0 = ruleExpr();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getWheneverStatementRule());
											}
											set(current, "effect", lv_effect_4_0,
													"com.rockwellcollins.atc.agree.Agree.Expr");
											afterParserOrEnumRuleCall();

										}

									}

								}

								// InternalAgreeParser.g:1419:2: ( (lv_excl_5_0= Exclusively ) )?
								int alt14 = 2;
								int LA14_0 = input.LA(1);

								if ((LA14_0 == Exclusively)) {
									alt14 = 1;
								}
								switch (alt14) {
								case 1:
								// InternalAgreeParser.g:1420:1: (lv_excl_5_0= Exclusively )
								{
									// InternalAgreeParser.g:1420:1: (lv_excl_5_0= Exclusively )
									// InternalAgreeParser.g:1421:3: lv_excl_5_0= Exclusively
									{
										lv_excl_5_0 = (Token) match(input, Exclusively, FollowSets000.FOLLOW_22);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(lv_excl_5_0, grammarAccess.getWheneverStatementAccess()
													.getExclExclusivelyKeyword_0_0_0_5_0());

										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElement(grammarAccess.getWheneverStatementRule());
											}
											setWithLastConsumed(current, "excl", lv_excl_5_0, "exclusively");

										}

									}

								}
									break;

								}

								// InternalAgreeParser.g:1435:3: (otherlv_6= Occur | otherlv_7= Occurs )
								int alt15 = 2;
								int LA15_0 = input.LA(1);

								if ((LA15_0 == Occur)) {
									alt15 = 1;
								} else if ((LA15_0 == Occurs)) {
									alt15 = 2;
								} else {
									if (state.backtracking > 0) {
										state.failed = true;
										return current;
									}
									NoViableAltException nvae = new NoViableAltException("", 15, 0, input);

									throw nvae;
								}
								switch (alt15) {
								case 1:
								// InternalAgreeParser.g:1436:2: otherlv_6= Occur
								{
									otherlv_6 = (Token) match(input, Occur, FollowSets000.FOLLOW_17);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(otherlv_6,
												grammarAccess.getWheneverStatementAccess().getOccurKeyword_0_0_0_6_0());

									}

								}
									break;
								case 2:
								// InternalAgreeParser.g:1442:2: otherlv_7= Occurs
								{
									otherlv_7 = (Token) match(input, Occurs, FollowSets000.FOLLOW_17);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(otherlv_7, grammarAccess.getWheneverStatementAccess()
												.getOccursKeyword_0_0_0_6_1());

									}

								}
									break;

								}

							}

						}

						// InternalAgreeParser.g:1446:4: (otherlv_8= During ( (lv_interval_9_0= ruleTimeInterval ) ) )?
						int alt16 = 2;
						int LA16_0 = input.LA(1);

						if ((LA16_0 == During)) {
							alt16 = 1;
						}
						switch (alt16) {
						case 1:
						// InternalAgreeParser.g:1447:2: otherlv_8= During ( (lv_interval_9_0= ruleTimeInterval ) )
						{
							otherlv_8 = (Token) match(input, During, FollowSets000.FOLLOW_14);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_8,
										grammarAccess.getWheneverStatementAccess().getDuringKeyword_0_1_0());

							}
							// InternalAgreeParser.g:1451:1: ( (lv_interval_9_0= ruleTimeInterval ) )
							// InternalAgreeParser.g:1452:1: (lv_interval_9_0= ruleTimeInterval )
							{
								// InternalAgreeParser.g:1452:1: (lv_interval_9_0= ruleTimeInterval )
								// InternalAgreeParser.g:1453:3: lv_interval_9_0= ruleTimeInterval
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getWheneverStatementAccess()
												.getIntervalTimeIntervalParserRuleCall_0_1_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_2);
									lv_interval_9_0 = ruleTimeInterval();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(
													grammarAccess.getWheneverStatementRule());
										}
										set(current, "interval", lv_interval_9_0,
												"com.rockwellcollins.atc.agree.Agree.TimeInterval");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						}

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:1470:6: ( ( ( ( () Whenever ( ( ruleExpr ) ) Becomes True ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) )
				// )=> ( () otherlv_11= Whenever ( (lv_cause_12_0= ruleExpr ) ) otherlv_13= Becomes otherlv_14= True ( (lv_effect_15_0= ruleExpr ) ) (
				// (lv_excl_16_0= Exclusively ) )? (otherlv_17= Occur | otherlv_18= Occurs ) ) ) (otherlv_19= During ( (lv_interval_20_0= ruleTimeInterval ) )
				// )? )
				{
					// InternalAgreeParser.g:1470:6: ( ( ( ( () Whenever ( ( ruleExpr ) ) Becomes True ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs )
					// ) )=> ( () otherlv_11= Whenever ( (lv_cause_12_0= ruleExpr ) ) otherlv_13= Becomes otherlv_14= True ( (lv_effect_15_0= ruleExpr ) ) (
					// (lv_excl_16_0= Exclusively ) )? (otherlv_17= Occur | otherlv_18= Occurs ) ) ) (otherlv_19= During ( (lv_interval_20_0= ruleTimeInterval )
					// ) )? )
					// InternalAgreeParser.g:1470:7: ( ( ( () Whenever ( ( ruleExpr ) ) Becomes True ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) )
					// )=> ( () otherlv_11= Whenever ( (lv_cause_12_0= ruleExpr ) ) otherlv_13= Becomes otherlv_14= True ( (lv_effect_15_0= ruleExpr ) ) (
					// (lv_excl_16_0= Exclusively ) )? (otherlv_17= Occur | otherlv_18= Occurs ) ) ) (otherlv_19= During ( (lv_interval_20_0= ruleTimeInterval )
					// ) )?
					{
						// InternalAgreeParser.g:1470:7: ( ( ( () Whenever ( ( ruleExpr ) ) Becomes True ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs
						// ) ) )=> ( () otherlv_11= Whenever ( (lv_cause_12_0= ruleExpr ) ) otherlv_13= Becomes otherlv_14= True ( (lv_effect_15_0= ruleExpr ) )
						// ( (lv_excl_16_0= Exclusively ) )? (otherlv_17= Occur | otherlv_18= Occurs ) ) )
						// InternalAgreeParser.g:1470:8: ( ( () Whenever ( ( ruleExpr ) ) Becomes True ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs )
						// ) )=> ( () otherlv_11= Whenever ( (lv_cause_12_0= ruleExpr ) ) otherlv_13= Becomes otherlv_14= True ( (lv_effect_15_0= ruleExpr ) ) (
						// (lv_excl_16_0= Exclusively ) )? (otherlv_17= Occur | otherlv_18= Occurs ) )
						{
							// InternalAgreeParser.g:1497:6: ( () otherlv_11= Whenever ( (lv_cause_12_0= ruleExpr ) ) otherlv_13= Becomes otherlv_14= True (
							// (lv_effect_15_0= ruleExpr ) ) ( (lv_excl_16_0= Exclusively ) )? (otherlv_17= Occur | otherlv_18= Occurs ) )
							// InternalAgreeParser.g:1497:7: () otherlv_11= Whenever ( (lv_cause_12_0= ruleExpr ) ) otherlv_13= Becomes otherlv_14= True (
							// (lv_effect_15_0= ruleExpr ) ) ( (lv_excl_16_0= Exclusively ) )? (otherlv_17= Occur | otherlv_18= Occurs )
							{
								// InternalAgreeParser.g:1497:7: ()
								// InternalAgreeParser.g:1498:5:
								{
									if (state.backtracking == 0) {

										current = forceCreateModelElement(grammarAccess.getWheneverStatementAccess()
												.getWheneverBecomesTrueStatementAction_1_0_0_0(), current);

									}

								}

								otherlv_11 = (Token) match(input, Whenever, FollowSets000.FOLLOW_9);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_11,
											grammarAccess.getWheneverStatementAccess().getWheneverKeyword_1_0_0_1());

								}
								// InternalAgreeParser.g:1508:1: ( (lv_cause_12_0= ruleExpr ) )
								// InternalAgreeParser.g:1509:1: (lv_cause_12_0= ruleExpr )
								{
									// InternalAgreeParser.g:1509:1: (lv_cause_12_0= ruleExpr )
									// InternalAgreeParser.g:1510:3: lv_cause_12_0= ruleExpr
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getWheneverStatementAccess()
													.getCauseExprParserRuleCall_1_0_0_2_0());

										}
										pushFollow(FollowSets000.FOLLOW_23);
										lv_cause_12_0 = ruleExpr();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getWheneverStatementRule());
											}
											set(current, "cause", lv_cause_12_0,
													"com.rockwellcollins.atc.agree.Agree.Expr");
											afterParserOrEnumRuleCall();

										}

									}

								}

								otherlv_13 = (Token) match(input, Becomes, FollowSets000.FOLLOW_24);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_13,
											grammarAccess.getWheneverStatementAccess().getBecomesKeyword_1_0_0_3());

								}
								otherlv_14 = (Token) match(input, True, FollowSets000.FOLLOW_9);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_14,
											grammarAccess.getWheneverStatementAccess().getTrueKeyword_1_0_0_4());

								}
								// InternalAgreeParser.g:1536:1: ( (lv_effect_15_0= ruleExpr ) )
								// InternalAgreeParser.g:1537:1: (lv_effect_15_0= ruleExpr )
								{
									// InternalAgreeParser.g:1537:1: (lv_effect_15_0= ruleExpr )
									// InternalAgreeParser.g:1538:3: lv_effect_15_0= ruleExpr
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getWheneverStatementAccess()
													.getEffectExprParserRuleCall_1_0_0_5_0());

										}
										pushFollow(FollowSets000.FOLLOW_21);
										lv_effect_15_0 = ruleExpr();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getWheneverStatementRule());
											}
											set(current, "effect", lv_effect_15_0,
													"com.rockwellcollins.atc.agree.Agree.Expr");
											afterParserOrEnumRuleCall();

										}

									}

								}

								// InternalAgreeParser.g:1554:2: ( (lv_excl_16_0= Exclusively ) )?
								int alt17 = 2;
								int LA17_0 = input.LA(1);

								if ((LA17_0 == Exclusively)) {
									alt17 = 1;
								}
								switch (alt17) {
								case 1:
								// InternalAgreeParser.g:1555:1: (lv_excl_16_0= Exclusively )
								{
									// InternalAgreeParser.g:1555:1: (lv_excl_16_0= Exclusively )
									// InternalAgreeParser.g:1556:3: lv_excl_16_0= Exclusively
									{
										lv_excl_16_0 = (Token) match(input, Exclusively, FollowSets000.FOLLOW_22);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(lv_excl_16_0, grammarAccess.getWheneverStatementAccess()
													.getExclExclusivelyKeyword_1_0_0_6_0());

										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElement(grammarAccess.getWheneverStatementRule());
											}
											setWithLastConsumed(current, "excl", lv_excl_16_0, "exclusively");

										}

									}

								}
									break;

								}

								// InternalAgreeParser.g:1570:3: (otherlv_17= Occur | otherlv_18= Occurs )
								int alt18 = 2;
								int LA18_0 = input.LA(1);

								if ((LA18_0 == Occur)) {
									alt18 = 1;
								} else if ((LA18_0 == Occurs)) {
									alt18 = 2;
								} else {
									if (state.backtracking > 0) {
										state.failed = true;
										return current;
									}
									NoViableAltException nvae = new NoViableAltException("", 18, 0, input);

									throw nvae;
								}
								switch (alt18) {
								case 1:
								// InternalAgreeParser.g:1571:2: otherlv_17= Occur
								{
									otherlv_17 = (Token) match(input, Occur, FollowSets000.FOLLOW_17);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(otherlv_17,
												grammarAccess.getWheneverStatementAccess().getOccurKeyword_1_0_0_7_0());

									}

								}
									break;
								case 2:
								// InternalAgreeParser.g:1577:2: otherlv_18= Occurs
								{
									otherlv_18 = (Token) match(input, Occurs, FollowSets000.FOLLOW_17);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(otherlv_18, grammarAccess.getWheneverStatementAccess()
												.getOccursKeyword_1_0_0_7_1());

									}

								}
									break;

								}

							}

						}

						// InternalAgreeParser.g:1581:4: (otherlv_19= During ( (lv_interval_20_0= ruleTimeInterval ) ) )?
						int alt19 = 2;
						int LA19_0 = input.LA(1);

						if ((LA19_0 == During)) {
							alt19 = 1;
						}
						switch (alt19) {
						case 1:
						// InternalAgreeParser.g:1582:2: otherlv_19= During ( (lv_interval_20_0= ruleTimeInterval ) )
						{
							otherlv_19 = (Token) match(input, During, FollowSets000.FOLLOW_14);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_19,
										grammarAccess.getWheneverStatementAccess().getDuringKeyword_1_1_0());

							}
							// InternalAgreeParser.g:1586:1: ( (lv_interval_20_0= ruleTimeInterval ) )
							// InternalAgreeParser.g:1587:1: (lv_interval_20_0= ruleTimeInterval )
							{
								// InternalAgreeParser.g:1587:1: (lv_interval_20_0= ruleTimeInterval )
								// InternalAgreeParser.g:1588:3: lv_interval_20_0= ruleTimeInterval
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getWheneverStatementAccess()
												.getIntervalTimeIntervalParserRuleCall_1_1_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_2);
									lv_interval_20_0 = ruleTimeInterval();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(
													grammarAccess.getWheneverStatementRule());
										}
										set(current, "interval", lv_interval_20_0,
												"com.rockwellcollins.atc.agree.Agree.TimeInterval");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						}

					}

				}
					break;
				case 3:
				// InternalAgreeParser.g:1605:6: ( ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? Holds ) )=> ( () otherlv_22=
				// Whenever ( (lv_cause_23_0= ruleExpr ) ) otherlv_24= Occurs ( (lv_effect_25_0= ruleExpr ) ) ( (lv_excl_26_0= Exclusively ) )? otherlv_27=
				// Holds ) ) (otherlv_28= During ( (lv_interval_29_0= ruleTimeInterval ) ) )? )
				{
					// InternalAgreeParser.g:1605:6: ( ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? Holds ) )=> ( ()
					// otherlv_22= Whenever ( (lv_cause_23_0= ruleExpr ) ) otherlv_24= Occurs ( (lv_effect_25_0= ruleExpr ) ) ( (lv_excl_26_0= Exclusively ) )?
					// otherlv_27= Holds ) ) (otherlv_28= During ( (lv_interval_29_0= ruleTimeInterval ) ) )? )
					// InternalAgreeParser.g:1605:7: ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? Holds ) )=> ( ()
					// otherlv_22= Whenever ( (lv_cause_23_0= ruleExpr ) ) otherlv_24= Occurs ( (lv_effect_25_0= ruleExpr ) ) ( (lv_excl_26_0= Exclusively ) )?
					// otherlv_27= Holds ) ) (otherlv_28= During ( (lv_interval_29_0= ruleTimeInterval ) ) )?
					{
						// InternalAgreeParser.g:1605:7: ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? Holds ) )=> ( ()
						// otherlv_22= Whenever ( (lv_cause_23_0= ruleExpr ) ) otherlv_24= Occurs ( (lv_effect_25_0= ruleExpr ) ) ( (lv_excl_26_0= Exclusively )
						// )? otherlv_27= Holds ) )
						// InternalAgreeParser.g:1605:8: ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? Holds ) )=> ( ()
						// otherlv_22= Whenever ( (lv_cause_23_0= ruleExpr ) ) otherlv_24= Occurs ( (lv_effect_25_0= ruleExpr ) ) ( (lv_excl_26_0= Exclusively )
						// )? otherlv_27= Holds )
						{
							// InternalAgreeParser.g:1627:5: ( () otherlv_22= Whenever ( (lv_cause_23_0= ruleExpr ) ) otherlv_24= Occurs ( (lv_effect_25_0=
							// ruleExpr ) ) ( (lv_excl_26_0= Exclusively ) )? otherlv_27= Holds )
							// InternalAgreeParser.g:1627:6: () otherlv_22= Whenever ( (lv_cause_23_0= ruleExpr ) ) otherlv_24= Occurs ( (lv_effect_25_0=
							// ruleExpr ) ) ( (lv_excl_26_0= Exclusively ) )? otherlv_27= Holds
							{
								// InternalAgreeParser.g:1627:6: ()
								// InternalAgreeParser.g:1628:5:
								{
									if (state.backtracking == 0) {

										current = forceCreateModelElement(grammarAccess.getWheneverStatementAccess()
												.getWheneverHoldsStatementAction_2_0_0_0(), current);

									}

								}

								otherlv_22 = (Token) match(input, Whenever, FollowSets000.FOLLOW_9);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_22,
											grammarAccess.getWheneverStatementAccess().getWheneverKeyword_2_0_0_1());

								}
								// InternalAgreeParser.g:1638:1: ( (lv_cause_23_0= ruleExpr ) )
								// InternalAgreeParser.g:1639:1: (lv_cause_23_0= ruleExpr )
								{
									// InternalAgreeParser.g:1639:1: (lv_cause_23_0= ruleExpr )
									// InternalAgreeParser.g:1640:3: lv_cause_23_0= ruleExpr
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getWheneverStatementAccess()
													.getCauseExprParserRuleCall_2_0_0_2_0());

										}
										pushFollow(FollowSets000.FOLLOW_16);
										lv_cause_23_0 = ruleExpr();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getWheneverStatementRule());
											}
											set(current, "cause", lv_cause_23_0,
													"com.rockwellcollins.atc.agree.Agree.Expr");
											afterParserOrEnumRuleCall();

										}

									}

								}

								otherlv_24 = (Token) match(input, Occurs, FollowSets000.FOLLOW_9);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_24,
											grammarAccess.getWheneverStatementAccess().getOccursKeyword_2_0_0_3());

								}
								// InternalAgreeParser.g:1661:1: ( (lv_effect_25_0= ruleExpr ) )
								// InternalAgreeParser.g:1662:1: (lv_effect_25_0= ruleExpr )
								{
									// InternalAgreeParser.g:1662:1: (lv_effect_25_0= ruleExpr )
									// InternalAgreeParser.g:1663:3: lv_effect_25_0= ruleExpr
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getWheneverStatementAccess()
													.getEffectExprParserRuleCall_2_0_0_4_0());

										}
										pushFollow(FollowSets000.FOLLOW_25);
										lv_effect_25_0 = ruleExpr();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getWheneverStatementRule());
											}
											set(current, "effect", lv_effect_25_0,
													"com.rockwellcollins.atc.agree.Agree.Expr");
											afterParserOrEnumRuleCall();

										}

									}

								}

								// InternalAgreeParser.g:1679:2: ( (lv_excl_26_0= Exclusively ) )?
								int alt20 = 2;
								int LA20_0 = input.LA(1);

								if ((LA20_0 == Exclusively)) {
									alt20 = 1;
								}
								switch (alt20) {
								case 1:
								// InternalAgreeParser.g:1680:1: (lv_excl_26_0= Exclusively )
								{
									// InternalAgreeParser.g:1680:1: (lv_excl_26_0= Exclusively )
									// InternalAgreeParser.g:1681:3: lv_excl_26_0= Exclusively
									{
										lv_excl_26_0 = (Token) match(input, Exclusively, FollowSets000.FOLLOW_12);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(lv_excl_26_0, grammarAccess.getWheneverStatementAccess()
													.getExclExclusivelyKeyword_2_0_0_5_0());

										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElement(grammarAccess.getWheneverStatementRule());
											}
											setWithLastConsumed(current, "excl", lv_excl_26_0, "exclusively");

										}

									}

								}
									break;

								}

								otherlv_27 = (Token) match(input, Holds, FollowSets000.FOLLOW_17);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_27,
											grammarAccess.getWheneverStatementAccess().getHoldsKeyword_2_0_0_6());

								}

							}

						}

						// InternalAgreeParser.g:1700:3: (otherlv_28= During ( (lv_interval_29_0= ruleTimeInterval ) ) )?
						int alt21 = 2;
						int LA21_0 = input.LA(1);

						if ((LA21_0 == During)) {
							alt21 = 1;
						}
						switch (alt21) {
						case 1:
						// InternalAgreeParser.g:1701:2: otherlv_28= During ( (lv_interval_29_0= ruleTimeInterval ) )
						{
							otherlv_28 = (Token) match(input, During, FollowSets000.FOLLOW_14);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_28,
										grammarAccess.getWheneverStatementAccess().getDuringKeyword_2_1_0());

							}
							// InternalAgreeParser.g:1705:1: ( (lv_interval_29_0= ruleTimeInterval ) )
							// InternalAgreeParser.g:1706:1: (lv_interval_29_0= ruleTimeInterval )
							{
								// InternalAgreeParser.g:1706:1: (lv_interval_29_0= ruleTimeInterval )
								// InternalAgreeParser.g:1707:3: lv_interval_29_0= ruleTimeInterval
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getWheneverStatementAccess()
												.getIntervalTimeIntervalParserRuleCall_2_1_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_2);
									lv_interval_29_0 = ruleTimeInterval();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(
													grammarAccess.getWheneverStatementRule());
										}
										set(current, "interval", lv_interval_29_0,
												"com.rockwellcollins.atc.agree.Agree.TimeInterval");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						}

					}

				}
					break;
				case 4:
				// InternalAgreeParser.g:1724:6: ( ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) Implies ) )=> ( () otherlv_31= Whenever (
				// (lv_cause_32_0= ruleExpr ) ) otherlv_33= Occurs ( (lv_lhs_34_0= ruleExpr ) ) otherlv_35= Implies ) ) ( (lv_rhs_36_0= ruleExpr ) ) (
				// (lv_excl_37_0= Exclusively ) )? (otherlv_38= During ( (lv_interval_39_0= ruleTimeInterval ) ) )? )
				{
					// InternalAgreeParser.g:1724:6: ( ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) Implies ) )=> ( () otherlv_31= Whenever (
					// (lv_cause_32_0= ruleExpr ) ) otherlv_33= Occurs ( (lv_lhs_34_0= ruleExpr ) ) otherlv_35= Implies ) ) ( (lv_rhs_36_0= ruleExpr ) ) (
					// (lv_excl_37_0= Exclusively ) )? (otherlv_38= During ( (lv_interval_39_0= ruleTimeInterval ) ) )? )
					// InternalAgreeParser.g:1724:7: ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) Implies ) )=> ( () otherlv_31= Whenever (
					// (lv_cause_32_0= ruleExpr ) ) otherlv_33= Occurs ( (lv_lhs_34_0= ruleExpr ) ) otherlv_35= Implies ) ) ( (lv_rhs_36_0= ruleExpr ) ) (
					// (lv_excl_37_0= Exclusively ) )? (otherlv_38= During ( (lv_interval_39_0= ruleTimeInterval ) ) )?
					{
						// InternalAgreeParser.g:1724:7: ( ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) Implies ) )=> ( () otherlv_31= Whenever (
						// (lv_cause_32_0= ruleExpr ) ) otherlv_33= Occurs ( (lv_lhs_34_0= ruleExpr ) ) otherlv_35= Implies ) )
						// InternalAgreeParser.g:1724:8: ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) Implies ) )=> ( () otherlv_31= Whenever (
						// (lv_cause_32_0= ruleExpr ) ) otherlv_33= Occurs ( (lv_lhs_34_0= ruleExpr ) ) otherlv_35= Implies )
						{
							// InternalAgreeParser.g:1739:5: ( () otherlv_31= Whenever ( (lv_cause_32_0= ruleExpr ) ) otherlv_33= Occurs ( (lv_lhs_34_0=
							// ruleExpr ) ) otherlv_35= Implies )
							// InternalAgreeParser.g:1739:6: () otherlv_31= Whenever ( (lv_cause_32_0= ruleExpr ) ) otherlv_33= Occurs ( (lv_lhs_34_0= ruleExpr
							// ) ) otherlv_35= Implies
							{
								// InternalAgreeParser.g:1739:6: ()
								// InternalAgreeParser.g:1740:5:
								{
									if (state.backtracking == 0) {

										current = forceCreateModelElement(grammarAccess.getWheneverStatementAccess()
												.getWheneverImpliesStatementAction_3_0_0_0(), current);

									}

								}

								otherlv_31 = (Token) match(input, Whenever, FollowSets000.FOLLOW_9);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_31,
											grammarAccess.getWheneverStatementAccess().getWheneverKeyword_3_0_0_1());

								}
								// InternalAgreeParser.g:1750:1: ( (lv_cause_32_0= ruleExpr ) )
								// InternalAgreeParser.g:1751:1: (lv_cause_32_0= ruleExpr )
								{
									// InternalAgreeParser.g:1751:1: (lv_cause_32_0= ruleExpr )
									// InternalAgreeParser.g:1752:3: lv_cause_32_0= ruleExpr
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getWheneverStatementAccess()
													.getCauseExprParserRuleCall_3_0_0_2_0());

										}
										pushFollow(FollowSets000.FOLLOW_16);
										lv_cause_32_0 = ruleExpr();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getWheneverStatementRule());
											}
											set(current, "cause", lv_cause_32_0,
													"com.rockwellcollins.atc.agree.Agree.Expr");
											afterParserOrEnumRuleCall();

										}

									}

								}

								otherlv_33 = (Token) match(input, Occurs, FollowSets000.FOLLOW_9);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_33,
											grammarAccess.getWheneverStatementAccess().getOccursKeyword_3_0_0_3());

								}
								// InternalAgreeParser.g:1773:1: ( (lv_lhs_34_0= ruleExpr ) )
								// InternalAgreeParser.g:1774:1: (lv_lhs_34_0= ruleExpr )
								{
									// InternalAgreeParser.g:1774:1: (lv_lhs_34_0= ruleExpr )
									// InternalAgreeParser.g:1775:3: lv_lhs_34_0= ruleExpr
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getWheneverStatementAccess()
													.getLhsExprParserRuleCall_3_0_0_4_0());

										}
										pushFollow(FollowSets000.FOLLOW_26);
										lv_lhs_34_0 = ruleExpr();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getWheneverStatementRule());
											}
											set(current, "lhs", lv_lhs_34_0,
													"com.rockwellcollins.atc.agree.Agree.Expr");
											afterParserOrEnumRuleCall();

										}

									}

								}

								otherlv_35 = (Token) match(input, Implies, FollowSets000.FOLLOW_9);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_35,
											grammarAccess.getWheneverStatementAccess().getImpliesKeyword_3_0_0_5());

								}

							}

						}

						// InternalAgreeParser.g:1796:3: ( (lv_rhs_36_0= ruleExpr ) )
						// InternalAgreeParser.g:1797:1: (lv_rhs_36_0= ruleExpr )
						{
							// InternalAgreeParser.g:1797:1: (lv_rhs_36_0= ruleExpr )
							// InternalAgreeParser.g:1798:3: lv_rhs_36_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getWheneverStatementAccess()
											.getRhsExprParserRuleCall_3_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_27);
								lv_rhs_36_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getWheneverStatementRule());
									}
									set(current, "rhs", lv_rhs_36_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						// InternalAgreeParser.g:1814:2: ( (lv_excl_37_0= Exclusively ) )?
						int alt22 = 2;
						int LA22_0 = input.LA(1);

						if ((LA22_0 == Exclusively)) {
							alt22 = 1;
						}
						switch (alt22) {
						case 1:
						// InternalAgreeParser.g:1815:1: (lv_excl_37_0= Exclusively )
						{
							// InternalAgreeParser.g:1815:1: (lv_excl_37_0= Exclusively )
							// InternalAgreeParser.g:1816:3: lv_excl_37_0= Exclusively
							{
								lv_excl_37_0 = (Token) match(input, Exclusively, FollowSets000.FOLLOW_17);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(lv_excl_37_0, grammarAccess.getWheneverStatementAccess()
											.getExclExclusivelyKeyword_3_2_0());

								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getWheneverStatementRule());
									}
									setWithLastConsumed(current, "excl", lv_excl_37_0, "exclusively");

								}

							}

						}
							break;

						}

						// InternalAgreeParser.g:1830:3: (otherlv_38= During ( (lv_interval_39_0= ruleTimeInterval ) ) )?
						int alt23 = 2;
						int LA23_0 = input.LA(1);

						if ((LA23_0 == During)) {
							alt23 = 1;
						}
						switch (alt23) {
						case 1:
						// InternalAgreeParser.g:1831:2: otherlv_38= During ( (lv_interval_39_0= ruleTimeInterval ) )
						{
							otherlv_38 = (Token) match(input, During, FollowSets000.FOLLOW_14);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_38,
										grammarAccess.getWheneverStatementAccess().getDuringKeyword_3_3_0());

							}
							// InternalAgreeParser.g:1835:1: ( (lv_interval_39_0= ruleTimeInterval ) )
							// InternalAgreeParser.g:1836:1: (lv_interval_39_0= ruleTimeInterval )
							{
								// InternalAgreeParser.g:1836:1: (lv_interval_39_0= ruleTimeInterval )
								// InternalAgreeParser.g:1837:3: lv_interval_39_0= ruleTimeInterval
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getWheneverStatementAccess()
												.getIntervalTimeIntervalParserRuleCall_3_3_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_2);
									lv_interval_39_0 = ruleTimeInterval();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(
													grammarAccess.getWheneverStatementRule());
										}
										set(current, "interval", lv_interval_39_0,
												"com.rockwellcollins.atc.agree.Agree.TimeInterval");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						}

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleWheneverStatement"

	// $ANTLR start "entryRuleRealTimeStatement"
	// InternalAgreeParser.g:1861:1: entryRuleRealTimeStatement returns [EObject current=null] : iv_ruleRealTimeStatement= ruleRealTimeStatement EOF ;
	public final EObject entryRuleRealTimeStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleRealTimeStatement = null;

		try {
			// InternalAgreeParser.g:1862:2: (iv_ruleRealTimeStatement= ruleRealTimeStatement EOF )
			// InternalAgreeParser.g:1863:2: iv_ruleRealTimeStatement= ruleRealTimeStatement EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getRealTimeStatementRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleRealTimeStatement = ruleRealTimeStatement();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleRealTimeStatement;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleRealTimeStatement"

	// $ANTLR start "ruleRealTimeStatement"
	// InternalAgreeParser.g:1870:1: ruleRealTimeStatement returns [EObject current=null] : ( ( ( ( ( () Condition ( ( ruleExpr ) ) Occurs Each ) )=> ( ()
	// otherlv_1= Condition ( (lv_event_2_0= ruleExpr ) ) otherlv_3= Occurs otherlv_4= Each ) ) ( (lv_period_5_0= ruleExpr ) ) (otherlv_6= With otherlv_7=
	// Jitter ( (lv_jitter_8_0= ruleExpr ) ) )? ) | ( ( ( ( () Condition ( ( ruleExpr ) ) Occurs Sporadic ) )=> ( () otherlv_10= Condition ( (lv_event_11_0=
	// ruleExpr ) ) otherlv_12= Occurs otherlv_13= Sporadic ) ) otherlv_14= With otherlv_15= IAT ( (lv_iat_16_0= ruleExpr ) ) (otherlv_17= With otherlv_18=
	// Jitter ( (lv_jitter_19_0= ruleExpr ) ) )? ) ) ;
	public final EObject ruleRealTimeStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_3 = null;
		Token otherlv_4 = null;
		Token otherlv_6 = null;
		Token otherlv_7 = null;
		Token otherlv_10 = null;
		Token otherlv_12 = null;
		Token otherlv_13 = null;
		Token otherlv_14 = null;
		Token otherlv_15 = null;
		Token otherlv_17 = null;
		Token otherlv_18 = null;
		EObject lv_event_2_0 = null;

		EObject lv_period_5_0 = null;

		EObject lv_jitter_8_0 = null;

		EObject lv_event_11_0 = null;

		EObject lv_iat_16_0 = null;

		EObject lv_jitter_19_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:1873:28: ( ( ( ( ( ( () Condition ( ( ruleExpr ) ) Occurs Each ) )=> ( () otherlv_1= Condition ( (lv_event_2_0= ruleExpr )
			// ) otherlv_3= Occurs otherlv_4= Each ) ) ( (lv_period_5_0= ruleExpr ) ) (otherlv_6= With otherlv_7= Jitter ( (lv_jitter_8_0= ruleExpr ) ) )? ) | (
			// ( ( ( () Condition ( ( ruleExpr ) ) Occurs Sporadic ) )=> ( () otherlv_10= Condition ( (lv_event_11_0= ruleExpr ) ) otherlv_12= Occurs
			// otherlv_13= Sporadic ) ) otherlv_14= With otherlv_15= IAT ( (lv_iat_16_0= ruleExpr ) ) (otherlv_17= With otherlv_18= Jitter ( (lv_jitter_19_0=
			// ruleExpr ) ) )? ) ) )
			// InternalAgreeParser.g:1874:1: ( ( ( ( ( () Condition ( ( ruleExpr ) ) Occurs Each ) )=> ( () otherlv_1= Condition ( (lv_event_2_0= ruleExpr ) )
			// otherlv_3= Occurs otherlv_4= Each ) ) ( (lv_period_5_0= ruleExpr ) ) (otherlv_6= With otherlv_7= Jitter ( (lv_jitter_8_0= ruleExpr ) ) )? ) | ( (
			// ( ( () Condition ( ( ruleExpr ) ) Occurs Sporadic ) )=> ( () otherlv_10= Condition ( (lv_event_11_0= ruleExpr ) ) otherlv_12= Occurs otherlv_13=
			// Sporadic ) ) otherlv_14= With otherlv_15= IAT ( (lv_iat_16_0= ruleExpr ) ) (otherlv_17= With otherlv_18= Jitter ( (lv_jitter_19_0= ruleExpr ) )
			// )? ) )
			{
				// InternalAgreeParser.g:1874:1: ( ( ( ( ( () Condition ( ( ruleExpr ) ) Occurs Each ) )=> ( () otherlv_1= Condition ( (lv_event_2_0= ruleExpr )
				// ) otherlv_3= Occurs otherlv_4= Each ) ) ( (lv_period_5_0= ruleExpr ) ) (otherlv_6= With otherlv_7= Jitter ( (lv_jitter_8_0= ruleExpr ) ) )? )
				// | ( ( ( ( () Condition ( ( ruleExpr ) ) Occurs Sporadic ) )=> ( () otherlv_10= Condition ( (lv_event_11_0= ruleExpr ) ) otherlv_12= Occurs
				// otherlv_13= Sporadic ) ) otherlv_14= With otherlv_15= IAT ( (lv_iat_16_0= ruleExpr ) ) (otherlv_17= With otherlv_18= Jitter (
				// (lv_jitter_19_0= ruleExpr ) ) )? ) )
				int alt27 = 2;
				int LA27_0 = input.LA(1);

				if ((LA27_0 == Condition)) {
					int LA27_1 = input.LA(2);

					if ((synpred7_InternalAgreeParser())) {
						alt27 = 1;
					} else if ((synpred8_InternalAgreeParser())) {
						alt27 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return current;
						}
						NoViableAltException nvae = new NoViableAltException("", 27, 1, input);

						throw nvae;
					}
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 27, 0, input);

					throw nvae;
				}
				switch (alt27) {
				case 1:
				// InternalAgreeParser.g:1874:2: ( ( ( ( () Condition ( ( ruleExpr ) ) Occurs Each ) )=> ( () otherlv_1= Condition ( (lv_event_2_0= ruleExpr ) )
				// otherlv_3= Occurs otherlv_4= Each ) ) ( (lv_period_5_0= ruleExpr ) ) (otherlv_6= With otherlv_7= Jitter ( (lv_jitter_8_0= ruleExpr ) ) )? )
				{
					// InternalAgreeParser.g:1874:2: ( ( ( ( () Condition ( ( ruleExpr ) ) Occurs Each ) )=> ( () otherlv_1= Condition ( (lv_event_2_0= ruleExpr
					// ) ) otherlv_3= Occurs otherlv_4= Each ) ) ( (lv_period_5_0= ruleExpr ) ) (otherlv_6= With otherlv_7= Jitter ( (lv_jitter_8_0= ruleExpr )
					// ) )? )
					// InternalAgreeParser.g:1874:3: ( ( ( () Condition ( ( ruleExpr ) ) Occurs Each ) )=> ( () otherlv_1= Condition ( (lv_event_2_0= ruleExpr )
					// ) otherlv_3= Occurs otherlv_4= Each ) ) ( (lv_period_5_0= ruleExpr ) ) (otherlv_6= With otherlv_7= Jitter ( (lv_jitter_8_0= ruleExpr ) )
					// )?
					{
						// InternalAgreeParser.g:1874:3: ( ( ( () Condition ( ( ruleExpr ) ) Occurs Each ) )=> ( () otherlv_1= Condition ( (lv_event_2_0=
						// ruleExpr ) ) otherlv_3= Occurs otherlv_4= Each ) )
						// InternalAgreeParser.g:1874:4: ( ( () Condition ( ( ruleExpr ) ) Occurs Each ) )=> ( () otherlv_1= Condition ( (lv_event_2_0= ruleExpr
						// ) ) otherlv_3= Occurs otherlv_4= Each )
						{
							// InternalAgreeParser.g:1885:5: ( () otherlv_1= Condition ( (lv_event_2_0= ruleExpr ) ) otherlv_3= Occurs otherlv_4= Each )
							// InternalAgreeParser.g:1885:6: () otherlv_1= Condition ( (lv_event_2_0= ruleExpr ) ) otherlv_3= Occurs otherlv_4= Each
							{
								// InternalAgreeParser.g:1885:6: ()
								// InternalAgreeParser.g:1886:5:
								{
									if (state.backtracking == 0) {

										current = forceCreateModelElement(grammarAccess.getRealTimeStatementAccess()
												.getPeriodicStatementAction_0_0_0_0(), current);

									}

								}

								otherlv_1 = (Token) match(input, Condition, FollowSets000.FOLLOW_9);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_1,
											grammarAccess.getRealTimeStatementAccess().getConditionKeyword_0_0_0_1());

								}
								// InternalAgreeParser.g:1896:1: ( (lv_event_2_0= ruleExpr ) )
								// InternalAgreeParser.g:1897:1: (lv_event_2_0= ruleExpr )
								{
									// InternalAgreeParser.g:1897:1: (lv_event_2_0= ruleExpr )
									// InternalAgreeParser.g:1898:3: lv_event_2_0= ruleExpr
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getRealTimeStatementAccess()
													.getEventExprParserRuleCall_0_0_0_2_0());

										}
										pushFollow(FollowSets000.FOLLOW_16);
										lv_event_2_0 = ruleExpr();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getRealTimeStatementRule());
											}
											set(current, "event", lv_event_2_0,
													"com.rockwellcollins.atc.agree.Agree.Expr");
											afterParserOrEnumRuleCall();

										}

									}

								}

								otherlv_3 = (Token) match(input, Occurs, FollowSets000.FOLLOW_28);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_3,
											grammarAccess.getRealTimeStatementAccess().getOccursKeyword_0_0_0_3());

								}
								otherlv_4 = (Token) match(input, Each, FollowSets000.FOLLOW_9);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_4,
											grammarAccess.getRealTimeStatementAccess().getEachKeyword_0_0_0_4());

								}

							}

						}

						// InternalAgreeParser.g:1924:3: ( (lv_period_5_0= ruleExpr ) )
						// InternalAgreeParser.g:1925:1: (lv_period_5_0= ruleExpr )
						{
							// InternalAgreeParser.g:1925:1: (lv_period_5_0= ruleExpr )
							// InternalAgreeParser.g:1926:3: lv_period_5_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getRealTimeStatementAccess()
											.getPeriodExprParserRuleCall_0_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_29);
								lv_period_5_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getRealTimeStatementRule());
									}
									set(current, "period", lv_period_5_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						// InternalAgreeParser.g:1942:2: (otherlv_6= With otherlv_7= Jitter ( (lv_jitter_8_0= ruleExpr ) ) )?
						int alt25 = 2;
						int LA25_0 = input.LA(1);

						if ((LA25_0 == With)) {
							alt25 = 1;
						}
						switch (alt25) {
						case 1:
						// InternalAgreeParser.g:1943:2: otherlv_6= With otherlv_7= Jitter ( (lv_jitter_8_0= ruleExpr ) )
						{
							otherlv_6 = (Token) match(input, With, FollowSets000.FOLLOW_30);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_6,
										grammarAccess.getRealTimeStatementAccess().getWithKeyword_0_2_0());

							}
							otherlv_7 = (Token) match(input, Jitter, FollowSets000.FOLLOW_9);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_7,
										grammarAccess.getRealTimeStatementAccess().getJitterKeyword_0_2_1());

							}
							// InternalAgreeParser.g:1952:1: ( (lv_jitter_8_0= ruleExpr ) )
							// InternalAgreeParser.g:1953:1: (lv_jitter_8_0= ruleExpr )
							{
								// InternalAgreeParser.g:1953:1: (lv_jitter_8_0= ruleExpr )
								// InternalAgreeParser.g:1954:3: lv_jitter_8_0= ruleExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getRealTimeStatementAccess()
												.getJitterExprParserRuleCall_0_2_2_0());

									}
									pushFollow(FollowSets000.FOLLOW_2);
									lv_jitter_8_0 = ruleExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(
													grammarAccess.getRealTimeStatementRule());
										}
										set(current, "jitter", lv_jitter_8_0,
												"com.rockwellcollins.atc.agree.Agree.Expr");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						}

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:1971:6: ( ( ( ( () Condition ( ( ruleExpr ) ) Occurs Sporadic ) )=> ( () otherlv_10= Condition ( (lv_event_11_0=
				// ruleExpr ) ) otherlv_12= Occurs otherlv_13= Sporadic ) ) otherlv_14= With otherlv_15= IAT ( (lv_iat_16_0= ruleExpr ) ) (otherlv_17= With
				// otherlv_18= Jitter ( (lv_jitter_19_0= ruleExpr ) ) )? )
				{
					// InternalAgreeParser.g:1971:6: ( ( ( ( () Condition ( ( ruleExpr ) ) Occurs Sporadic ) )=> ( () otherlv_10= Condition ( (lv_event_11_0=
					// ruleExpr ) ) otherlv_12= Occurs otherlv_13= Sporadic ) ) otherlv_14= With otherlv_15= IAT ( (lv_iat_16_0= ruleExpr ) ) (otherlv_17= With
					// otherlv_18= Jitter ( (lv_jitter_19_0= ruleExpr ) ) )? )
					// InternalAgreeParser.g:1971:7: ( ( ( () Condition ( ( ruleExpr ) ) Occurs Sporadic ) )=> ( () otherlv_10= Condition ( (lv_event_11_0=
					// ruleExpr ) ) otherlv_12= Occurs otherlv_13= Sporadic ) ) otherlv_14= With otherlv_15= IAT ( (lv_iat_16_0= ruleExpr ) ) (otherlv_17= With
					// otherlv_18= Jitter ( (lv_jitter_19_0= ruleExpr ) ) )?
					{
						// InternalAgreeParser.g:1971:7: ( ( ( () Condition ( ( ruleExpr ) ) Occurs Sporadic ) )=> ( () otherlv_10= Condition ( (lv_event_11_0=
						// ruleExpr ) ) otherlv_12= Occurs otherlv_13= Sporadic ) )
						// InternalAgreeParser.g:1971:8: ( ( () Condition ( ( ruleExpr ) ) Occurs Sporadic ) )=> ( () otherlv_10= Condition ( (lv_event_11_0=
						// ruleExpr ) ) otherlv_12= Occurs otherlv_13= Sporadic )
						{
							// InternalAgreeParser.g:1982:5: ( () otherlv_10= Condition ( (lv_event_11_0= ruleExpr ) ) otherlv_12= Occurs otherlv_13= Sporadic )
							// InternalAgreeParser.g:1982:6: () otherlv_10= Condition ( (lv_event_11_0= ruleExpr ) ) otherlv_12= Occurs otherlv_13= Sporadic
							{
								// InternalAgreeParser.g:1982:6: ()
								// InternalAgreeParser.g:1983:5:
								{
									if (state.backtracking == 0) {

										current = forceCreateModelElement(grammarAccess.getRealTimeStatementAccess()
												.getSporadicStatementAction_1_0_0_0(), current);

									}

								}

								otherlv_10 = (Token) match(input, Condition, FollowSets000.FOLLOW_9);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_10,
											grammarAccess.getRealTimeStatementAccess().getConditionKeyword_1_0_0_1());

								}
								// InternalAgreeParser.g:1993:1: ( (lv_event_11_0= ruleExpr ) )
								// InternalAgreeParser.g:1994:1: (lv_event_11_0= ruleExpr )
								{
									// InternalAgreeParser.g:1994:1: (lv_event_11_0= ruleExpr )
									// InternalAgreeParser.g:1995:3: lv_event_11_0= ruleExpr
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getRealTimeStatementAccess()
													.getEventExprParserRuleCall_1_0_0_2_0());

										}
										pushFollow(FollowSets000.FOLLOW_16);
										lv_event_11_0 = ruleExpr();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getRealTimeStatementRule());
											}
											set(current, "event", lv_event_11_0,
													"com.rockwellcollins.atc.agree.Agree.Expr");
											afterParserOrEnumRuleCall();

										}

									}

								}

								otherlv_12 = (Token) match(input, Occurs, FollowSets000.FOLLOW_31);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_12,
											grammarAccess.getRealTimeStatementAccess().getOccursKeyword_1_0_0_3());

								}
								otherlv_13 = (Token) match(input, Sporadic, FollowSets000.FOLLOW_32);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_13,
											grammarAccess.getRealTimeStatementAccess().getSporadicKeyword_1_0_0_4());

								}

							}

						}

						otherlv_14 = (Token) match(input, With, FollowSets000.FOLLOW_33);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_14, grammarAccess.getRealTimeStatementAccess().getWithKeyword_1_1());

						}
						otherlv_15 = (Token) match(input, IAT, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_15, grammarAccess.getRealTimeStatementAccess().getIATKeyword_1_2());

						}
						// InternalAgreeParser.g:2031:1: ( (lv_iat_16_0= ruleExpr ) )
						// InternalAgreeParser.g:2032:1: (lv_iat_16_0= ruleExpr )
						{
							// InternalAgreeParser.g:2032:1: (lv_iat_16_0= ruleExpr )
							// InternalAgreeParser.g:2033:3: lv_iat_16_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getRealTimeStatementAccess()
											.getIatExprParserRuleCall_1_3_0());

								}
								pushFollow(FollowSets000.FOLLOW_29);
								lv_iat_16_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getRealTimeStatementRule());
									}
									set(current, "iat", lv_iat_16_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						// InternalAgreeParser.g:2049:2: (otherlv_17= With otherlv_18= Jitter ( (lv_jitter_19_0= ruleExpr ) ) )?
						int alt26 = 2;
						int LA26_0 = input.LA(1);

						if ((LA26_0 == With)) {
							alt26 = 1;
						}
						switch (alt26) {
						case 1:
						// InternalAgreeParser.g:2050:2: otherlv_17= With otherlv_18= Jitter ( (lv_jitter_19_0= ruleExpr ) )
						{
							otherlv_17 = (Token) match(input, With, FollowSets000.FOLLOW_30);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_17,
										grammarAccess.getRealTimeStatementAccess().getWithKeyword_1_4_0());

							}
							otherlv_18 = (Token) match(input, Jitter, FollowSets000.FOLLOW_9);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_18,
										grammarAccess.getRealTimeStatementAccess().getJitterKeyword_1_4_1());

							}
							// InternalAgreeParser.g:2059:1: ( (lv_jitter_19_0= ruleExpr ) )
							// InternalAgreeParser.g:2060:1: (lv_jitter_19_0= ruleExpr )
							{
								// InternalAgreeParser.g:2060:1: (lv_jitter_19_0= ruleExpr )
								// InternalAgreeParser.g:2061:3: lv_jitter_19_0= ruleExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getRealTimeStatementAccess()
												.getJitterExprParserRuleCall_1_4_2_0());

									}
									pushFollow(FollowSets000.FOLLOW_2);
									lv_jitter_19_0 = ruleExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(
													grammarAccess.getRealTimeStatementRule());
										}
										set(current, "jitter", lv_jitter_19_0,
												"com.rockwellcollins.atc.agree.Agree.Expr");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						}

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleRealTimeStatement"

	// $ANTLR start "entryRuleTimeInterval"
	// InternalAgreeParser.g:2085:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
	public final EObject entryRuleTimeInterval() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleTimeInterval = null;

		try {
			// InternalAgreeParser.g:2086:2: (iv_ruleTimeInterval= ruleTimeInterval EOF )
			// InternalAgreeParser.g:2087:2: iv_ruleTimeInterval= ruleTimeInterval EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getTimeIntervalRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleTimeInterval = ruleTimeInterval();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleTimeInterval;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleTimeInterval"

	// $ANTLR start "ruleTimeInterval"
	// InternalAgreeParser.g:2094:1: ruleTimeInterval returns [EObject current=null] : ( ( ( ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) )
	// RightSquareBracket ) )=> ( () otherlv_1= LeftSquareBracket ( (lv_low_2_0= ruleExpr ) ) otherlv_3= Comma ( (lv_high_4_0= ruleExpr ) ) otherlv_5=
	// RightSquareBracket ) ) | ( ( ( () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket ) )=> ( () otherlv_7= LeftParenthesis (
	// (lv_low_8_0= ruleExpr ) ) otherlv_9= Comma ( (lv_high_10_0= ruleExpr ) ) otherlv_11= RightSquareBracket ) ) | ( ( ( () LeftSquareBracket ( ( ruleExpr ) )
	// Comma ( ( ruleExpr ) ) RightParenthesis ) )=> ( () otherlv_13= LeftSquareBracket ( (lv_low_14_0= ruleExpr ) ) otherlv_15= Comma ( (lv_high_16_0= ruleExpr
	// ) ) otherlv_17= RightParenthesis ) ) | ( ( ( () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis ) )=> ( () otherlv_19=
	// LeftParenthesis ( (lv_low_20_0= ruleExpr ) ) otherlv_21= Comma ( (lv_high_22_0= ruleExpr ) ) otherlv_23= RightParenthesis ) ) ) ;
	public final EObject ruleTimeInterval() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_3 = null;
		Token otherlv_5 = null;
		Token otherlv_7 = null;
		Token otherlv_9 = null;
		Token otherlv_11 = null;
		Token otherlv_13 = null;
		Token otherlv_15 = null;
		Token otherlv_17 = null;
		Token otherlv_19 = null;
		Token otherlv_21 = null;
		Token otherlv_23 = null;
		EObject lv_low_2_0 = null;

		EObject lv_high_4_0 = null;

		EObject lv_low_8_0 = null;

		EObject lv_high_10_0 = null;

		EObject lv_low_14_0 = null;

		EObject lv_high_16_0 = null;

		EObject lv_low_20_0 = null;

		EObject lv_high_22_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:2097:28: ( ( ( ( ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket ) )=> ( () otherlv_1=
			// LeftSquareBracket ( (lv_low_2_0= ruleExpr ) ) otherlv_3= Comma ( (lv_high_4_0= ruleExpr ) ) otherlv_5= RightSquareBracket ) ) | ( ( ( ()
			// LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket ) )=> ( () otherlv_7= LeftParenthesis ( (lv_low_8_0= ruleExpr ) )
			// otherlv_9= Comma ( (lv_high_10_0= ruleExpr ) ) otherlv_11= RightSquareBracket ) ) | ( ( ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( (
			// ruleExpr ) ) RightParenthesis ) )=> ( () otherlv_13= LeftSquareBracket ( (lv_low_14_0= ruleExpr ) ) otherlv_15= Comma ( (lv_high_16_0= ruleExpr )
			// ) otherlv_17= RightParenthesis ) ) | ( ( ( () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis ) )=> ( () otherlv_19=
			// LeftParenthesis ( (lv_low_20_0= ruleExpr ) ) otherlv_21= Comma ( (lv_high_22_0= ruleExpr ) ) otherlv_23= RightParenthesis ) ) ) )
			// InternalAgreeParser.g:2098:1: ( ( ( ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket ) )=> ( () otherlv_1=
			// LeftSquareBracket ( (lv_low_2_0= ruleExpr ) ) otherlv_3= Comma ( (lv_high_4_0= ruleExpr ) ) otherlv_5= RightSquareBracket ) ) | ( ( ( ()
			// LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket ) )=> ( () otherlv_7= LeftParenthesis ( (lv_low_8_0= ruleExpr ) )
			// otherlv_9= Comma ( (lv_high_10_0= ruleExpr ) ) otherlv_11= RightSquareBracket ) ) | ( ( ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( (
			// ruleExpr ) ) RightParenthesis ) )=> ( () otherlv_13= LeftSquareBracket ( (lv_low_14_0= ruleExpr ) ) otherlv_15= Comma ( (lv_high_16_0= ruleExpr )
			// ) otherlv_17= RightParenthesis ) ) | ( ( ( () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis ) )=> ( () otherlv_19=
			// LeftParenthesis ( (lv_low_20_0= ruleExpr ) ) otherlv_21= Comma ( (lv_high_22_0= ruleExpr ) ) otherlv_23= RightParenthesis ) ) )
			{
				// InternalAgreeParser.g:2098:1: ( ( ( ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket ) )=> ( () otherlv_1=
				// LeftSquareBracket ( (lv_low_2_0= ruleExpr ) ) otherlv_3= Comma ( (lv_high_4_0= ruleExpr ) ) otherlv_5= RightSquareBracket ) ) | ( ( ( ()
				// LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket ) )=> ( () otherlv_7= LeftParenthesis ( (lv_low_8_0= ruleExpr ) )
				// otherlv_9= Comma ( (lv_high_10_0= ruleExpr ) ) otherlv_11= RightSquareBracket ) ) | ( ( ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( (
				// ruleExpr ) ) RightParenthesis ) )=> ( () otherlv_13= LeftSquareBracket ( (lv_low_14_0= ruleExpr ) ) otherlv_15= Comma ( (lv_high_16_0=
				// ruleExpr ) ) otherlv_17= RightParenthesis ) ) | ( ( ( () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis ) )=> ( ()
				// otherlv_19= LeftParenthesis ( (lv_low_20_0= ruleExpr ) ) otherlv_21= Comma ( (lv_high_22_0= ruleExpr ) ) otherlv_23= RightParenthesis ) ) )
				int alt28 = 4;
				int LA28_0 = input.LA(1);

				if ((LA28_0 == LeftSquareBracket)) {
					int LA28_1 = input.LA(2);

					if ((synpred9_InternalAgreeParser())) {
						alt28 = 1;
					} else if ((synpred11_InternalAgreeParser())) {
						alt28 = 3;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return current;
						}
						NoViableAltException nvae = new NoViableAltException("", 28, 1, input);

						throw nvae;
					}
				} else if ((LA28_0 == LeftParenthesis)) {
					int LA28_2 = input.LA(2);

					if ((synpred10_InternalAgreeParser())) {
						alt28 = 2;
					} else if ((synpred12_InternalAgreeParser())) {
						alt28 = 4;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return current;
						}
						NoViableAltException nvae = new NoViableAltException("", 28, 2, input);

						throw nvae;
					}
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 28, 0, input);

					throw nvae;
				}
				switch (alt28) {
				case 1:
				// InternalAgreeParser.g:2098:2: ( ( ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket ) )=> ( () otherlv_1=
				// LeftSquareBracket ( (lv_low_2_0= ruleExpr ) ) otherlv_3= Comma ( (lv_high_4_0= ruleExpr ) ) otherlv_5= RightSquareBracket ) )
				{
					// InternalAgreeParser.g:2098:2: ( ( ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket ) )=> ( () otherlv_1=
					// LeftSquareBracket ( (lv_low_2_0= ruleExpr ) ) otherlv_3= Comma ( (lv_high_4_0= ruleExpr ) ) otherlv_5= RightSquareBracket ) )
					// InternalAgreeParser.g:2098:3: ( ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket ) )=> ( () otherlv_1=
					// LeftSquareBracket ( (lv_low_2_0= ruleExpr ) ) otherlv_3= Comma ( (lv_high_4_0= ruleExpr ) ) otherlv_5= RightSquareBracket )
					{
						// InternalAgreeParser.g:2113:5: ( () otherlv_1= LeftSquareBracket ( (lv_low_2_0= ruleExpr ) ) otherlv_3= Comma ( (lv_high_4_0= ruleExpr
						// ) ) otherlv_5= RightSquareBracket )
						// InternalAgreeParser.g:2113:6: () otherlv_1= LeftSquareBracket ( (lv_low_2_0= ruleExpr ) ) otherlv_3= Comma ( (lv_high_4_0= ruleExpr )
						// ) otherlv_5= RightSquareBracket
						{
							// InternalAgreeParser.g:2113:6: ()
							// InternalAgreeParser.g:2114:5:
							{
								if (state.backtracking == 0) {

									current = forceCreateModelElement(
											grammarAccess.getTimeIntervalAccess().getClosedTimeIntervalAction_0_0_0(),
											current);

								}

							}

							otherlv_1 = (Token) match(input, LeftSquareBracket, FollowSets000.FOLLOW_9);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_1,
										grammarAccess.getTimeIntervalAccess().getLeftSquareBracketKeyword_0_0_1());

							}
							// InternalAgreeParser.g:2124:1: ( (lv_low_2_0= ruleExpr ) )
							// InternalAgreeParser.g:2125:1: (lv_low_2_0= ruleExpr )
							{
								// InternalAgreeParser.g:2125:1: (lv_low_2_0= ruleExpr )
								// InternalAgreeParser.g:2126:3: lv_low_2_0= ruleExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getTimeIntervalAccess()
												.getLowExprParserRuleCall_0_0_2_0());

									}
									pushFollow(FollowSets000.FOLLOW_34);
									lv_low_2_0 = ruleExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getTimeIntervalRule());
										}
										set(current, "low", lv_low_2_0, "com.rockwellcollins.atc.agree.Agree.Expr");
										afterParserOrEnumRuleCall();

									}

								}

							}

							otherlv_3 = (Token) match(input, Comma, FollowSets000.FOLLOW_9);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_3, grammarAccess.getTimeIntervalAccess().getCommaKeyword_0_0_3());

							}
							// InternalAgreeParser.g:2147:1: ( (lv_high_4_0= ruleExpr ) )
							// InternalAgreeParser.g:2148:1: (lv_high_4_0= ruleExpr )
							{
								// InternalAgreeParser.g:2148:1: (lv_high_4_0= ruleExpr )
								// InternalAgreeParser.g:2149:3: lv_high_4_0= ruleExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getTimeIntervalAccess()
												.getHighExprParserRuleCall_0_0_4_0());

									}
									pushFollow(FollowSets000.FOLLOW_35);
									lv_high_4_0 = ruleExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getTimeIntervalRule());
										}
										set(current, "high", lv_high_4_0, "com.rockwellcollins.atc.agree.Agree.Expr");
										afterParserOrEnumRuleCall();

									}

								}

							}

							otherlv_5 = (Token) match(input, RightSquareBracket, FollowSets000.FOLLOW_2);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_5,
										grammarAccess.getTimeIntervalAccess().getRightSquareBracketKeyword_0_0_5());

							}

						}

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:2171:6: ( ( ( () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket ) )=> ( () otherlv_7=
				// LeftParenthesis ( (lv_low_8_0= ruleExpr ) ) otherlv_9= Comma ( (lv_high_10_0= ruleExpr ) ) otherlv_11= RightSquareBracket ) )
				{
					// InternalAgreeParser.g:2171:6: ( ( ( () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket ) )=> ( () otherlv_7=
					// LeftParenthesis ( (lv_low_8_0= ruleExpr ) ) otherlv_9= Comma ( (lv_high_10_0= ruleExpr ) ) otherlv_11= RightSquareBracket ) )
					// InternalAgreeParser.g:2171:7: ( ( () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket ) )=> ( () otherlv_7=
					// LeftParenthesis ( (lv_low_8_0= ruleExpr ) ) otherlv_9= Comma ( (lv_high_10_0= ruleExpr ) ) otherlv_11= RightSquareBracket )
					{
						// InternalAgreeParser.g:2186:5: ( () otherlv_7= LeftParenthesis ( (lv_low_8_0= ruleExpr ) ) otherlv_9= Comma ( (lv_high_10_0= ruleExpr
						// ) ) otherlv_11= RightSquareBracket )
						// InternalAgreeParser.g:2186:6: () otherlv_7= LeftParenthesis ( (lv_low_8_0= ruleExpr ) ) otherlv_9= Comma ( (lv_high_10_0= ruleExpr )
						// ) otherlv_11= RightSquareBracket
						{
							// InternalAgreeParser.g:2186:6: ()
							// InternalAgreeParser.g:2187:5:
							{
								if (state.backtracking == 0) {

									current = forceCreateModelElement(
											grammarAccess.getTimeIntervalAccess().getOpenLeftTimeIntervalAction_1_0_0(),
											current);

								}

							}

							otherlv_7 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_9);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_7,
										grammarAccess.getTimeIntervalAccess().getLeftParenthesisKeyword_1_0_1());

							}
							// InternalAgreeParser.g:2197:1: ( (lv_low_8_0= ruleExpr ) )
							// InternalAgreeParser.g:2198:1: (lv_low_8_0= ruleExpr )
							{
								// InternalAgreeParser.g:2198:1: (lv_low_8_0= ruleExpr )
								// InternalAgreeParser.g:2199:3: lv_low_8_0= ruleExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getTimeIntervalAccess()
												.getLowExprParserRuleCall_1_0_2_0());

									}
									pushFollow(FollowSets000.FOLLOW_34);
									lv_low_8_0 = ruleExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getTimeIntervalRule());
										}
										set(current, "low", lv_low_8_0, "com.rockwellcollins.atc.agree.Agree.Expr");
										afterParserOrEnumRuleCall();

									}

								}

							}

							otherlv_9 = (Token) match(input, Comma, FollowSets000.FOLLOW_9);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_9, grammarAccess.getTimeIntervalAccess().getCommaKeyword_1_0_3());

							}
							// InternalAgreeParser.g:2220:1: ( (lv_high_10_0= ruleExpr ) )
							// InternalAgreeParser.g:2221:1: (lv_high_10_0= ruleExpr )
							{
								// InternalAgreeParser.g:2221:1: (lv_high_10_0= ruleExpr )
								// InternalAgreeParser.g:2222:3: lv_high_10_0= ruleExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getTimeIntervalAccess()
												.getHighExprParserRuleCall_1_0_4_0());

									}
									pushFollow(FollowSets000.FOLLOW_35);
									lv_high_10_0 = ruleExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getTimeIntervalRule());
										}
										set(current, "high", lv_high_10_0, "com.rockwellcollins.atc.agree.Agree.Expr");
										afterParserOrEnumRuleCall();

									}

								}

							}

							otherlv_11 = (Token) match(input, RightSquareBracket, FollowSets000.FOLLOW_2);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_11,
										grammarAccess.getTimeIntervalAccess().getRightSquareBracketKeyword_1_0_5());

							}

						}

					}

				}
					break;
				case 3:
				// InternalAgreeParser.g:2244:6: ( ( ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis ) )=> ( () otherlv_13=
				// LeftSquareBracket ( (lv_low_14_0= ruleExpr ) ) otherlv_15= Comma ( (lv_high_16_0= ruleExpr ) ) otherlv_17= RightParenthesis ) )
				{
					// InternalAgreeParser.g:2244:6: ( ( ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis ) )=> ( () otherlv_13=
					// LeftSquareBracket ( (lv_low_14_0= ruleExpr ) ) otherlv_15= Comma ( (lv_high_16_0= ruleExpr ) ) otherlv_17= RightParenthesis ) )
					// InternalAgreeParser.g:2244:7: ( ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis ) )=> ( () otherlv_13=
					// LeftSquareBracket ( (lv_low_14_0= ruleExpr ) ) otherlv_15= Comma ( (lv_high_16_0= ruleExpr ) ) otherlv_17= RightParenthesis )
					{
						// InternalAgreeParser.g:2259:5: ( () otherlv_13= LeftSquareBracket ( (lv_low_14_0= ruleExpr ) ) otherlv_15= Comma ( (lv_high_16_0=
						// ruleExpr ) ) otherlv_17= RightParenthesis )
						// InternalAgreeParser.g:2259:6: () otherlv_13= LeftSquareBracket ( (lv_low_14_0= ruleExpr ) ) otherlv_15= Comma ( (lv_high_16_0=
						// ruleExpr ) ) otherlv_17= RightParenthesis
						{
							// InternalAgreeParser.g:2259:6: ()
							// InternalAgreeParser.g:2260:5:
							{
								if (state.backtracking == 0) {

									current = forceCreateModelElement(grammarAccess.getTimeIntervalAccess()
											.getOpenRightTimeIntervalAction_2_0_0(), current);

								}

							}

							otherlv_13 = (Token) match(input, LeftSquareBracket, FollowSets000.FOLLOW_9);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_13,
										grammarAccess.getTimeIntervalAccess().getLeftSquareBracketKeyword_2_0_1());

							}
							// InternalAgreeParser.g:2270:1: ( (lv_low_14_0= ruleExpr ) )
							// InternalAgreeParser.g:2271:1: (lv_low_14_0= ruleExpr )
							{
								// InternalAgreeParser.g:2271:1: (lv_low_14_0= ruleExpr )
								// InternalAgreeParser.g:2272:3: lv_low_14_0= ruleExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getTimeIntervalAccess()
												.getLowExprParserRuleCall_2_0_2_0());

									}
									pushFollow(FollowSets000.FOLLOW_34);
									lv_low_14_0 = ruleExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getTimeIntervalRule());
										}
										set(current, "low", lv_low_14_0, "com.rockwellcollins.atc.agree.Agree.Expr");
										afterParserOrEnumRuleCall();

									}

								}

							}

							otherlv_15 = (Token) match(input, Comma, FollowSets000.FOLLOW_9);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_15, grammarAccess.getTimeIntervalAccess().getCommaKeyword_2_0_3());

							}
							// InternalAgreeParser.g:2293:1: ( (lv_high_16_0= ruleExpr ) )
							// InternalAgreeParser.g:2294:1: (lv_high_16_0= ruleExpr )
							{
								// InternalAgreeParser.g:2294:1: (lv_high_16_0= ruleExpr )
								// InternalAgreeParser.g:2295:3: lv_high_16_0= ruleExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getTimeIntervalAccess()
												.getHighExprParserRuleCall_2_0_4_0());

									}
									pushFollow(FollowSets000.FOLLOW_36);
									lv_high_16_0 = ruleExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getTimeIntervalRule());
										}
										set(current, "high", lv_high_16_0, "com.rockwellcollins.atc.agree.Agree.Expr");
										afterParserOrEnumRuleCall();

									}

								}

							}

							otherlv_17 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_17,
										grammarAccess.getTimeIntervalAccess().getRightParenthesisKeyword_2_0_5());

							}

						}

					}

				}
					break;
				case 4:
				// InternalAgreeParser.g:2317:6: ( ( ( () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis ) )=> ( () otherlv_19=
				// LeftParenthesis ( (lv_low_20_0= ruleExpr ) ) otherlv_21= Comma ( (lv_high_22_0= ruleExpr ) ) otherlv_23= RightParenthesis ) )
				{
					// InternalAgreeParser.g:2317:6: ( ( ( () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis ) )=> ( () otherlv_19=
					// LeftParenthesis ( (lv_low_20_0= ruleExpr ) ) otherlv_21= Comma ( (lv_high_22_0= ruleExpr ) ) otherlv_23= RightParenthesis ) )
					// InternalAgreeParser.g:2317:7: ( ( () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis ) )=> ( () otherlv_19=
					// LeftParenthesis ( (lv_low_20_0= ruleExpr ) ) otherlv_21= Comma ( (lv_high_22_0= ruleExpr ) ) otherlv_23= RightParenthesis )
					{
						// InternalAgreeParser.g:2332:5: ( () otherlv_19= LeftParenthesis ( (lv_low_20_0= ruleExpr ) ) otherlv_21= Comma ( (lv_high_22_0=
						// ruleExpr ) ) otherlv_23= RightParenthesis )
						// InternalAgreeParser.g:2332:6: () otherlv_19= LeftParenthesis ( (lv_low_20_0= ruleExpr ) ) otherlv_21= Comma ( (lv_high_22_0= ruleExpr
						// ) ) otherlv_23= RightParenthesis
						{
							// InternalAgreeParser.g:2332:6: ()
							// InternalAgreeParser.g:2333:5:
							{
								if (state.backtracking == 0) {

									current = forceCreateModelElement(
											grammarAccess.getTimeIntervalAccess().getOpenTimeIntervalAction_3_0_0(),
											current);

								}

							}

							otherlv_19 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_9);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_19,
										grammarAccess.getTimeIntervalAccess().getLeftParenthesisKeyword_3_0_1());

							}
							// InternalAgreeParser.g:2343:1: ( (lv_low_20_0= ruleExpr ) )
							// InternalAgreeParser.g:2344:1: (lv_low_20_0= ruleExpr )
							{
								// InternalAgreeParser.g:2344:1: (lv_low_20_0= ruleExpr )
								// InternalAgreeParser.g:2345:3: lv_low_20_0= ruleExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getTimeIntervalAccess()
												.getLowExprParserRuleCall_3_0_2_0());

									}
									pushFollow(FollowSets000.FOLLOW_34);
									lv_low_20_0 = ruleExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getTimeIntervalRule());
										}
										set(current, "low", lv_low_20_0, "com.rockwellcollins.atc.agree.Agree.Expr");
										afterParserOrEnumRuleCall();

									}

								}

							}

							otherlv_21 = (Token) match(input, Comma, FollowSets000.FOLLOW_9);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_21, grammarAccess.getTimeIntervalAccess().getCommaKeyword_3_0_3());

							}
							// InternalAgreeParser.g:2366:1: ( (lv_high_22_0= ruleExpr ) )
							// InternalAgreeParser.g:2367:1: (lv_high_22_0= ruleExpr )
							{
								// InternalAgreeParser.g:2367:1: (lv_high_22_0= ruleExpr )
								// InternalAgreeParser.g:2368:3: lv_high_22_0= ruleExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getTimeIntervalAccess()
												.getHighExprParserRuleCall_3_0_4_0());

									}
									pushFollow(FollowSets000.FOLLOW_36);
									lv_high_22_0 = ruleExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getTimeIntervalRule());
										}
										set(current, "high", lv_high_22_0, "com.rockwellcollins.atc.agree.Agree.Expr");
										afterParserOrEnumRuleCall();

									}

								}

							}

							otherlv_23 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_23,
										grammarAccess.getTimeIntervalAccess().getRightParenthesisKeyword_3_0_5());

							}

						}

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleTimeInterval"

	// $ANTLR start "entryRuleSynchStatement"
	// InternalAgreeParser.g:2397:1: entryRuleSynchStatement returns [EObject current=null] : iv_ruleSynchStatement= ruleSynchStatement EOF ;
	public final EObject entryRuleSynchStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSynchStatement = null;

		try {
			// InternalAgreeParser.g:2398:2: (iv_ruleSynchStatement= ruleSynchStatement EOF )
			// InternalAgreeParser.g:2399:2: iv_ruleSynchStatement= ruleSynchStatement EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getSynchStatementRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleSynchStatement = ruleSynchStatement();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleSynchStatement;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleSynchStatement"

	// $ANTLR start "ruleSynchStatement"
	// InternalAgreeParser.g:2406:1: ruleSynchStatement returns [EObject current=null] : ( ( () otherlv_1= Synchrony otherlv_2= Colon ( (lv_val_3_0=
	// RULE_INTEGER_LIT ) ) (otherlv_4= Comma ( (lv_val2_5_0= RULE_INTEGER_LIT ) ) )? ( ( (lv_sim_6_1= Simult | lv_sim_6_2= No_simult ) ) )? otherlv_7=
	// Semicolon ) | ( () otherlv_9= Synchrony otherlv_10= Colon ( ( (otherlv_11= RULE_ID ) ) otherlv_12= Comma ( (otherlv_13= RULE_ID ) ) otherlv_14= Colon (
	// (lv_max_15_0= RULE_INTEGER_LIT ) ) otherlv_16= Comma ( (lv_min_17_0= RULE_INTEGER_LIT ) ) )+ otherlv_18= Semicolon ) | ( () otherlv_20= Calendar
	// otherlv_21= Colon ( (otherlv_22= RULE_ID ) ) (otherlv_23= Comma ( (otherlv_24= RULE_ID ) ) )* otherlv_25= Semicolon ) | ( () otherlv_27= Synchrony
	// otherlv_28= Colon otherlv_29= Asynchronous otherlv_30= Semicolon ) | ( () otherlv_32= Synchrony otherlv_33= Colon otherlv_34= Latched otherlv_35=
	// Semicolon ) ) ;
	public final EObject ruleSynchStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_2 = null;
		Token lv_val_3_0 = null;
		Token otherlv_4 = null;
		Token lv_val2_5_0 = null;
		Token lv_sim_6_1 = null;
		Token lv_sim_6_2 = null;
		Token otherlv_7 = null;
		Token otherlv_9 = null;
		Token otherlv_10 = null;
		Token otherlv_11 = null;
		Token otherlv_12 = null;
		Token otherlv_13 = null;
		Token otherlv_14 = null;
		Token lv_max_15_0 = null;
		Token otherlv_16 = null;
		Token lv_min_17_0 = null;
		Token otherlv_18 = null;
		Token otherlv_20 = null;
		Token otherlv_21 = null;
		Token otherlv_22 = null;
		Token otherlv_23 = null;
		Token otherlv_24 = null;
		Token otherlv_25 = null;
		Token otherlv_27 = null;
		Token otherlv_28 = null;
		Token otherlv_29 = null;
		Token otherlv_30 = null;
		Token otherlv_32 = null;
		Token otherlv_33 = null;
		Token otherlv_34 = null;
		Token otherlv_35 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:2409:28: ( ( ( () otherlv_1= Synchrony otherlv_2= Colon ( (lv_val_3_0= RULE_INTEGER_LIT ) ) (otherlv_4= Comma (
			// (lv_val2_5_0= RULE_INTEGER_LIT ) ) )? ( ( (lv_sim_6_1= Simult | lv_sim_6_2= No_simult ) ) )? otherlv_7= Semicolon ) | ( () otherlv_9= Synchrony
			// otherlv_10= Colon ( ( (otherlv_11= RULE_ID ) ) otherlv_12= Comma ( (otherlv_13= RULE_ID ) ) otherlv_14= Colon ( (lv_max_15_0= RULE_INTEGER_LIT )
			// ) otherlv_16= Comma ( (lv_min_17_0= RULE_INTEGER_LIT ) ) )+ otherlv_18= Semicolon ) | ( () otherlv_20= Calendar otherlv_21= Colon ( (otherlv_22=
			// RULE_ID ) ) (otherlv_23= Comma ( (otherlv_24= RULE_ID ) ) )* otherlv_25= Semicolon ) | ( () otherlv_27= Synchrony otherlv_28= Colon otherlv_29=
			// Asynchronous otherlv_30= Semicolon ) | ( () otherlv_32= Synchrony otherlv_33= Colon otherlv_34= Latched otherlv_35= Semicolon ) ) )
			// InternalAgreeParser.g:2410:1: ( ( () otherlv_1= Synchrony otherlv_2= Colon ( (lv_val_3_0= RULE_INTEGER_LIT ) ) (otherlv_4= Comma ( (lv_val2_5_0=
			// RULE_INTEGER_LIT ) ) )? ( ( (lv_sim_6_1= Simult | lv_sim_6_2= No_simult ) ) )? otherlv_7= Semicolon ) | ( () otherlv_9= Synchrony otherlv_10=
			// Colon ( ( (otherlv_11= RULE_ID ) ) otherlv_12= Comma ( (otherlv_13= RULE_ID ) ) otherlv_14= Colon ( (lv_max_15_0= RULE_INTEGER_LIT ) )
			// otherlv_16= Comma ( (lv_min_17_0= RULE_INTEGER_LIT ) ) )+ otherlv_18= Semicolon ) | ( () otherlv_20= Calendar otherlv_21= Colon ( (otherlv_22=
			// RULE_ID ) ) (otherlv_23= Comma ( (otherlv_24= RULE_ID ) ) )* otherlv_25= Semicolon ) | ( () otherlv_27= Synchrony otherlv_28= Colon otherlv_29=
			// Asynchronous otherlv_30= Semicolon ) | ( () otherlv_32= Synchrony otherlv_33= Colon otherlv_34= Latched otherlv_35= Semicolon ) )
			{
				// InternalAgreeParser.g:2410:1: ( ( () otherlv_1= Synchrony otherlv_2= Colon ( (lv_val_3_0= RULE_INTEGER_LIT ) ) (otherlv_4= Comma (
				// (lv_val2_5_0= RULE_INTEGER_LIT ) ) )? ( ( (lv_sim_6_1= Simult | lv_sim_6_2= No_simult ) ) )? otherlv_7= Semicolon ) | ( () otherlv_9=
				// Synchrony otherlv_10= Colon ( ( (otherlv_11= RULE_ID ) ) otherlv_12= Comma ( (otherlv_13= RULE_ID ) ) otherlv_14= Colon ( (lv_max_15_0=
				// RULE_INTEGER_LIT ) ) otherlv_16= Comma ( (lv_min_17_0= RULE_INTEGER_LIT ) ) )+ otherlv_18= Semicolon ) | ( () otherlv_20= Calendar
				// otherlv_21= Colon ( (otherlv_22= RULE_ID ) ) (otherlv_23= Comma ( (otherlv_24= RULE_ID ) ) )* otherlv_25= Semicolon ) | ( () otherlv_27=
				// Synchrony otherlv_28= Colon otherlv_29= Asynchronous otherlv_30= Semicolon ) | ( () otherlv_32= Synchrony otherlv_33= Colon otherlv_34=
				// Latched otherlv_35= Semicolon ) )
				int alt34 = 5;
				int LA34_0 = input.LA(1);

				if ((LA34_0 == Synchrony)) {
					int LA34_1 = input.LA(2);

					if ((LA34_1 == Colon)) {
						switch (input.LA(3)) {
						case RULE_INTEGER_LIT: {
							alt34 = 1;
						}
							break;
						case Asynchronous: {
							alt34 = 4;
						}
							break;
						case Latched: {
							alt34 = 5;
						}
							break;
						case RULE_ID: {
							alt34 = 2;
						}
							break;
						default:
							if (state.backtracking > 0) {
								state.failed = true;
								return current;
							}
							NoViableAltException nvae = new NoViableAltException("", 34, 3, input);

							throw nvae;
						}

					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return current;
						}
						NoViableAltException nvae = new NoViableAltException("", 34, 1, input);

						throw nvae;
					}
				} else if ((LA34_0 == Calendar)) {
					alt34 = 3;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 34, 0, input);

					throw nvae;
				}
				switch (alt34) {
				case 1:
				// InternalAgreeParser.g:2410:2: ( () otherlv_1= Synchrony otherlv_2= Colon ( (lv_val_3_0= RULE_INTEGER_LIT ) ) (otherlv_4= Comma (
				// (lv_val2_5_0= RULE_INTEGER_LIT ) ) )? ( ( (lv_sim_6_1= Simult | lv_sim_6_2= No_simult ) ) )? otherlv_7= Semicolon )
				{
					// InternalAgreeParser.g:2410:2: ( () otherlv_1= Synchrony otherlv_2= Colon ( (lv_val_3_0= RULE_INTEGER_LIT ) ) (otherlv_4= Comma (
					// (lv_val2_5_0= RULE_INTEGER_LIT ) ) )? ( ( (lv_sim_6_1= Simult | lv_sim_6_2= No_simult ) ) )? otherlv_7= Semicolon )
					// InternalAgreeParser.g:2410:3: () otherlv_1= Synchrony otherlv_2= Colon ( (lv_val_3_0= RULE_INTEGER_LIT ) ) (otherlv_4= Comma (
					// (lv_val2_5_0= RULE_INTEGER_LIT ) ) )? ( ( (lv_sim_6_1= Simult | lv_sim_6_2= No_simult ) ) )? otherlv_7= Semicolon
					{
						// InternalAgreeParser.g:2410:3: ()
						// InternalAgreeParser.g:2411:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getSynchStatementAccess().getSynchStatementAction_0_0(), current);

							}

						}

						otherlv_1 = (Token) match(input, Synchrony, FollowSets000.FOLLOW_5);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_1, grammarAccess.getSynchStatementAccess().getSynchronyKeyword_0_1());

						}
						otherlv_2 = (Token) match(input, Colon, FollowSets000.FOLLOW_37);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_2, grammarAccess.getSynchStatementAccess().getColonKeyword_0_2());

						}
						// InternalAgreeParser.g:2426:1: ( (lv_val_3_0= RULE_INTEGER_LIT ) )
						// InternalAgreeParser.g:2427:1: (lv_val_3_0= RULE_INTEGER_LIT )
						{
							// InternalAgreeParser.g:2427:1: (lv_val_3_0= RULE_INTEGER_LIT )
							// InternalAgreeParser.g:2428:3: lv_val_3_0= RULE_INTEGER_LIT
							{
								lv_val_3_0 = (Token) match(input, RULE_INTEGER_LIT, FollowSets000.FOLLOW_38);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(lv_val_3_0, grammarAccess.getSynchStatementAccess()
											.getValINTEGER_LITTerminalRuleCall_0_3_0());

								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getSynchStatementRule());
									}
									setWithLastConsumed(current, "val", lv_val_3_0,
											"org.osate.xtext.aadl2.properties.Properties.INTEGER_LIT");

								}

							}

						}

						// InternalAgreeParser.g:2444:2: (otherlv_4= Comma ( (lv_val2_5_0= RULE_INTEGER_LIT ) ) )?
						int alt29 = 2;
						int LA29_0 = input.LA(1);

						if ((LA29_0 == Comma)) {
							alt29 = 1;
						}
						switch (alt29) {
						case 1:
						// InternalAgreeParser.g:2445:2: otherlv_4= Comma ( (lv_val2_5_0= RULE_INTEGER_LIT ) )
						{
							otherlv_4 = (Token) match(input, Comma, FollowSets000.FOLLOW_37);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_4, grammarAccess.getSynchStatementAccess().getCommaKeyword_0_4_0());

							}
							// InternalAgreeParser.g:2449:1: ( (lv_val2_5_0= RULE_INTEGER_LIT ) )
							// InternalAgreeParser.g:2450:1: (lv_val2_5_0= RULE_INTEGER_LIT )
							{
								// InternalAgreeParser.g:2450:1: (lv_val2_5_0= RULE_INTEGER_LIT )
								// InternalAgreeParser.g:2451:3: lv_val2_5_0= RULE_INTEGER_LIT
								{
									lv_val2_5_0 = (Token) match(input, RULE_INTEGER_LIT, FollowSets000.FOLLOW_39);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(lv_val2_5_0, grammarAccess.getSynchStatementAccess()
												.getVal2INTEGER_LITTerminalRuleCall_0_4_1_0());

									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElement(grammarAccess.getSynchStatementRule());
										}
										setWithLastConsumed(current, "val2", lv_val2_5_0,
												"org.osate.xtext.aadl2.properties.Properties.INTEGER_LIT");

									}

								}

							}

						}
							break;

						}

						// InternalAgreeParser.g:2467:4: ( ( (lv_sim_6_1= Simult | lv_sim_6_2= No_simult ) ) )?
						int alt31 = 2;
						int LA31_0 = input.LA(1);

						if ((LA31_0 == No_simult || LA31_0 == Simult)) {
							alt31 = 1;
						}
						switch (alt31) {
						case 1:
						// InternalAgreeParser.g:2468:1: ( (lv_sim_6_1= Simult | lv_sim_6_2= No_simult ) )
						{
							// InternalAgreeParser.g:2468:1: ( (lv_sim_6_1= Simult | lv_sim_6_2= No_simult ) )
							// InternalAgreeParser.g:2469:1: (lv_sim_6_1= Simult | lv_sim_6_2= No_simult )
							{
								// InternalAgreeParser.g:2469:1: (lv_sim_6_1= Simult | lv_sim_6_2= No_simult )
								int alt30 = 2;
								int LA30_0 = input.LA(1);

								if ((LA30_0 == Simult)) {
									alt30 = 1;
								} else if ((LA30_0 == No_simult)) {
									alt30 = 2;
								} else {
									if (state.backtracking > 0) {
										state.failed = true;
										return current;
									}
									NoViableAltException nvae = new NoViableAltException("", 30, 0, input);

									throw nvae;
								}
								switch (alt30) {
								case 1:
								// InternalAgreeParser.g:2470:3: lv_sim_6_1= Simult
								{
									lv_sim_6_1 = (Token) match(input, Simult, FollowSets000.FOLLOW_7);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(lv_sim_6_1,
												grammarAccess.getSynchStatementAccess().getSimSimultKeyword_0_5_0_0());

									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElement(grammarAccess.getSynchStatementRule());
										}
										setWithLastConsumed(current, "sim", lv_sim_6_1, null);

									}

								}
									break;
								case 2:
								// InternalAgreeParser.g:2483:8: lv_sim_6_2= No_simult
								{
									lv_sim_6_2 = (Token) match(input, No_simult, FollowSets000.FOLLOW_7);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(lv_sim_6_2, grammarAccess.getSynchStatementAccess()
												.getSimNo_simultKeyword_0_5_0_1());

									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElement(grammarAccess.getSynchStatementRule());
										}
										setWithLastConsumed(current, "sim", lv_sim_6_2, null);

									}

								}
									break;

								}

							}

						}
							break;

						}

						otherlv_7 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_7, grammarAccess.getSynchStatementAccess().getSemicolonKeyword_0_6());

						}

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:2505:6: ( () otherlv_9= Synchrony otherlv_10= Colon ( ( (otherlv_11= RULE_ID ) ) otherlv_12= Comma ( (otherlv_13=
				// RULE_ID ) ) otherlv_14= Colon ( (lv_max_15_0= RULE_INTEGER_LIT ) ) otherlv_16= Comma ( (lv_min_17_0= RULE_INTEGER_LIT ) ) )+ otherlv_18=
				// Semicolon )
				{
					// InternalAgreeParser.g:2505:6: ( () otherlv_9= Synchrony otherlv_10= Colon ( ( (otherlv_11= RULE_ID ) ) otherlv_12= Comma ( (otherlv_13=
					// RULE_ID ) ) otherlv_14= Colon ( (lv_max_15_0= RULE_INTEGER_LIT ) ) otherlv_16= Comma ( (lv_min_17_0= RULE_INTEGER_LIT ) ) )+ otherlv_18=
					// Semicolon )
					// InternalAgreeParser.g:2505:7: () otherlv_9= Synchrony otherlv_10= Colon ( ( (otherlv_11= RULE_ID ) ) otherlv_12= Comma ( (otherlv_13=
					// RULE_ID ) ) otherlv_14= Colon ( (lv_max_15_0= RULE_INTEGER_LIT ) ) otherlv_16= Comma ( (lv_min_17_0= RULE_INTEGER_LIT ) ) )+ otherlv_18=
					// Semicolon
					{
						// InternalAgreeParser.g:2505:7: ()
						// InternalAgreeParser.g:2506:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getSynchStatementAccess().getMNSynchStatementAction_1_0(),
										current);

							}

						}

						otherlv_9 = (Token) match(input, Synchrony, FollowSets000.FOLLOW_5);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_9, grammarAccess.getSynchStatementAccess().getSynchronyKeyword_1_1());

						}
						otherlv_10 = (Token) match(input, Colon, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_10, grammarAccess.getSynchStatementAccess().getColonKeyword_1_2());

						}
						// InternalAgreeParser.g:2521:1: ( ( (otherlv_11= RULE_ID ) ) otherlv_12= Comma ( (otherlv_13= RULE_ID ) ) otherlv_14= Colon (
						// (lv_max_15_0= RULE_INTEGER_LIT ) ) otherlv_16= Comma ( (lv_min_17_0= RULE_INTEGER_LIT ) ) )+
						int cnt32 = 0;
						loop32: do {
							int alt32 = 2;
							int LA32_0 = input.LA(1);

							if ((LA32_0 == RULE_ID)) {
								alt32 = 1;
							}

							switch (alt32) {
							case 1:
							// InternalAgreeParser.g:2521:2: ( (otherlv_11= RULE_ID ) ) otherlv_12= Comma ( (otherlv_13= RULE_ID ) ) otherlv_14= Colon (
							// (lv_max_15_0= RULE_INTEGER_LIT ) ) otherlv_16= Comma ( (lv_min_17_0= RULE_INTEGER_LIT ) )
							{
								// InternalAgreeParser.g:2521:2: ( (otherlv_11= RULE_ID ) )
								// InternalAgreeParser.g:2522:1: (otherlv_11= RULE_ID )
								{
									// InternalAgreeParser.g:2522:1: (otherlv_11= RULE_ID )
									// InternalAgreeParser.g:2523:3: otherlv_11= RULE_ID
									{
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElement(grammarAccess.getSynchStatementRule());
											}

										}
										otherlv_11 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_34);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(otherlv_11, grammarAccess.getSynchStatementAccess()
													.getComp1NamedElementCrossReference_1_3_0_0());

										}

									}

								}

								otherlv_12 = (Token) match(input, Comma, FollowSets000.FOLLOW_11);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_12,
											grammarAccess.getSynchStatementAccess().getCommaKeyword_1_3_1());

								}
								// InternalAgreeParser.g:2539:1: ( (otherlv_13= RULE_ID ) )
								// InternalAgreeParser.g:2540:1: (otherlv_13= RULE_ID )
								{
									// InternalAgreeParser.g:2540:1: (otherlv_13= RULE_ID )
									// InternalAgreeParser.g:2541:3: otherlv_13= RULE_ID
									{
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElement(grammarAccess.getSynchStatementRule());
											}

										}
										otherlv_13 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_5);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(otherlv_13, grammarAccess.getSynchStatementAccess()
													.getComp2NamedElementCrossReference_1_3_2_0());

										}

									}

								}

								otherlv_14 = (Token) match(input, Colon, FollowSets000.FOLLOW_37);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_14,
											grammarAccess.getSynchStatementAccess().getColonKeyword_1_3_3());

								}
								// InternalAgreeParser.g:2557:1: ( (lv_max_15_0= RULE_INTEGER_LIT ) )
								// InternalAgreeParser.g:2558:1: (lv_max_15_0= RULE_INTEGER_LIT )
								{
									// InternalAgreeParser.g:2558:1: (lv_max_15_0= RULE_INTEGER_LIT )
									// InternalAgreeParser.g:2559:3: lv_max_15_0= RULE_INTEGER_LIT
									{
										lv_max_15_0 = (Token) match(input, RULE_INTEGER_LIT, FollowSets000.FOLLOW_34);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(lv_max_15_0, grammarAccess.getSynchStatementAccess()
													.getMaxINTEGER_LITTerminalRuleCall_1_3_4_0());

										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElement(grammarAccess.getSynchStatementRule());
											}
											addWithLastConsumed(current, "max", lv_max_15_0,
													"org.osate.xtext.aadl2.properties.Properties.INTEGER_LIT");

										}

									}

								}

								otherlv_16 = (Token) match(input, Comma, FollowSets000.FOLLOW_37);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_16,
											grammarAccess.getSynchStatementAccess().getCommaKeyword_1_3_5());

								}
								// InternalAgreeParser.g:2580:1: ( (lv_min_17_0= RULE_INTEGER_LIT ) )
								// InternalAgreeParser.g:2581:1: (lv_min_17_0= RULE_INTEGER_LIT )
								{
									// InternalAgreeParser.g:2581:1: (lv_min_17_0= RULE_INTEGER_LIT )
									// InternalAgreeParser.g:2582:3: lv_min_17_0= RULE_INTEGER_LIT
									{
										lv_min_17_0 = (Token) match(input, RULE_INTEGER_LIT, FollowSets000.FOLLOW_40);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(lv_min_17_0, grammarAccess.getSynchStatementAccess()
													.getMinINTEGER_LITTerminalRuleCall_1_3_6_0());

										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElement(grammarAccess.getSynchStatementRule());
											}
											addWithLastConsumed(current, "min", lv_min_17_0,
													"org.osate.xtext.aadl2.properties.Properties.INTEGER_LIT");

										}

									}

								}

							}
								break;

							default:
								if (cnt32 >= 1) {
									break loop32;
								}
								if (state.backtracking > 0) {
									state.failed = true;
									return current;
								}
								EarlyExitException eee = new EarlyExitException(32, input);
								throw eee;
							}
							cnt32++;
						} while (true);

						otherlv_18 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_18, grammarAccess.getSynchStatementAccess().getSemicolonKeyword_1_4());

						}

					}

				}
					break;
				case 3:
				// InternalAgreeParser.g:2604:6: ( () otherlv_20= Calendar otherlv_21= Colon ( (otherlv_22= RULE_ID ) ) (otherlv_23= Comma ( (otherlv_24=
				// RULE_ID ) ) )* otherlv_25= Semicolon )
				{
					// InternalAgreeParser.g:2604:6: ( () otherlv_20= Calendar otherlv_21= Colon ( (otherlv_22= RULE_ID ) ) (otherlv_23= Comma ( (otherlv_24=
					// RULE_ID ) ) )* otherlv_25= Semicolon )
					// InternalAgreeParser.g:2604:7: () otherlv_20= Calendar otherlv_21= Colon ( (otherlv_22= RULE_ID ) ) (otherlv_23= Comma ( (otherlv_24=
					// RULE_ID ) ) )* otherlv_25= Semicolon
					{
						// InternalAgreeParser.g:2604:7: ()
						// InternalAgreeParser.g:2605:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getSynchStatementAccess().getCalenStatementAction_2_0(), current);

							}

						}

						otherlv_20 = (Token) match(input, Calendar, FollowSets000.FOLLOW_5);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_20, grammarAccess.getSynchStatementAccess().getCalendarKeyword_2_1());

						}
						otherlv_21 = (Token) match(input, Colon, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_21, grammarAccess.getSynchStatementAccess().getColonKeyword_2_2());

						}
						// InternalAgreeParser.g:2620:1: ( (otherlv_22= RULE_ID ) )
						// InternalAgreeParser.g:2621:1: (otherlv_22= RULE_ID )
						{
							// InternalAgreeParser.g:2621:1: (otherlv_22= RULE_ID )
							// InternalAgreeParser.g:2622:3: otherlv_22= RULE_ID
							{
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getSynchStatementRule());
									}

								}
								otherlv_22 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_41);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_22, grammarAccess.getSynchStatementAccess()
											.getElsNamedElementCrossReference_2_3_0());

								}

							}

						}

						// InternalAgreeParser.g:2633:2: (otherlv_23= Comma ( (otherlv_24= RULE_ID ) ) )*
						loop33: do {
							int alt33 = 2;
							int LA33_0 = input.LA(1);

							if ((LA33_0 == Comma)) {
								alt33 = 1;
							}

							switch (alt33) {
							case 1:
							// InternalAgreeParser.g:2634:2: otherlv_23= Comma ( (otherlv_24= RULE_ID ) )
							{
								otherlv_23 = (Token) match(input, Comma, FollowSets000.FOLLOW_11);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_23,
											grammarAccess.getSynchStatementAccess().getCommaKeyword_2_4_0());

								}
								// InternalAgreeParser.g:2638:1: ( (otherlv_24= RULE_ID ) )
								// InternalAgreeParser.g:2639:1: (otherlv_24= RULE_ID )
								{
									// InternalAgreeParser.g:2639:1: (otherlv_24= RULE_ID )
									// InternalAgreeParser.g:2640:3: otherlv_24= RULE_ID
									{
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElement(grammarAccess.getSynchStatementRule());
											}

										}
										otherlv_24 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_41);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(otherlv_24, grammarAccess.getSynchStatementAccess()
													.getElsNamedElementCrossReference_2_4_1_0());

										}

									}

								}

							}
								break;

							default:
								break loop33;
							}
						} while (true);

						otherlv_25 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_25, grammarAccess.getSynchStatementAccess().getSemicolonKeyword_2_5());

						}

					}

				}
					break;
				case 4:
				// InternalAgreeParser.g:2657:6: ( () otherlv_27= Synchrony otherlv_28= Colon otherlv_29= Asynchronous otherlv_30= Semicolon )
				{
					// InternalAgreeParser.g:2657:6: ( () otherlv_27= Synchrony otherlv_28= Colon otherlv_29= Asynchronous otherlv_30= Semicolon )
					// InternalAgreeParser.g:2657:7: () otherlv_27= Synchrony otherlv_28= Colon otherlv_29= Asynchronous otherlv_30= Semicolon
					{
						// InternalAgreeParser.g:2657:7: ()
						// InternalAgreeParser.g:2658:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getSynchStatementAccess().getAsynchStatementAction_3_0(),
										current);

							}

						}

						otherlv_27 = (Token) match(input, Synchrony, FollowSets000.FOLLOW_5);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_27, grammarAccess.getSynchStatementAccess().getSynchronyKeyword_3_1());

						}
						otherlv_28 = (Token) match(input, Colon, FollowSets000.FOLLOW_42);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_28, grammarAccess.getSynchStatementAccess().getColonKeyword_3_2());

						}
						otherlv_29 = (Token) match(input, Asynchronous, FollowSets000.FOLLOW_7);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_29,
									grammarAccess.getSynchStatementAccess().getAsynchronousKeyword_3_3());

						}
						otherlv_30 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_30, grammarAccess.getSynchStatementAccess().getSemicolonKeyword_3_4());

						}

					}

				}
					break;
				case 5:
				// InternalAgreeParser.g:2684:6: ( () otherlv_32= Synchrony otherlv_33= Colon otherlv_34= Latched otherlv_35= Semicolon )
				{
					// InternalAgreeParser.g:2684:6: ( () otherlv_32= Synchrony otherlv_33= Colon otherlv_34= Latched otherlv_35= Semicolon )
					// InternalAgreeParser.g:2684:7: () otherlv_32= Synchrony otherlv_33= Colon otherlv_34= Latched otherlv_35= Semicolon
					{
						// InternalAgreeParser.g:2684:7: ()
						// InternalAgreeParser.g:2685:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getSynchStatementAccess().getLatchedStatementAction_4_0(),
										current);

							}

						}

						otherlv_32 = (Token) match(input, Synchrony, FollowSets000.FOLLOW_5);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_32, grammarAccess.getSynchStatementAccess().getSynchronyKeyword_4_1());

						}
						otherlv_33 = (Token) match(input, Colon, FollowSets000.FOLLOW_43);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_33, grammarAccess.getSynchStatementAccess().getColonKeyword_4_2());

						}
						otherlv_34 = (Token) match(input, Latched, FollowSets000.FOLLOW_7);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_34, grammarAccess.getSynchStatementAccess().getLatchedKeyword_4_3());

						}
						otherlv_35 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_35, grammarAccess.getSynchStatementAccess().getSemicolonKeyword_4_4());

						}

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleSynchStatement"

	// $ANTLR start "entryRuleOrderStatement"
	// InternalAgreeParser.g:2718:1: entryRuleOrderStatement returns [EObject current=null] : iv_ruleOrderStatement= ruleOrderStatement EOF ;
	public final EObject entryRuleOrderStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleOrderStatement = null;

		try {
			// InternalAgreeParser.g:2719:2: (iv_ruleOrderStatement= ruleOrderStatement EOF )
			// InternalAgreeParser.g:2720:2: iv_ruleOrderStatement= ruleOrderStatement EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getOrderStatementRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleOrderStatement = ruleOrderStatement();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleOrderStatement;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleOrderStatement"

	// $ANTLR start "ruleOrderStatement"
	// InternalAgreeParser.g:2727:1: ruleOrderStatement returns [EObject current=null] : (otherlv_0= Ordering otherlv_1= Colon ( (otherlv_2= RULE_ID ) )
	// (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )* otherlv_5= Semicolon ) ;
	public final EObject ruleOrderStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;
		Token otherlv_2 = null;
		Token otherlv_3 = null;
		Token otherlv_4 = null;
		Token otherlv_5 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:2730:28: ( (otherlv_0= Ordering otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )*
			// otherlv_5= Semicolon ) )
			// InternalAgreeParser.g:2731:1: (otherlv_0= Ordering otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )*
			// otherlv_5= Semicolon )
			{
				// InternalAgreeParser.g:2731:1: (otherlv_0= Ordering otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )*
				// otherlv_5= Semicolon )
				// InternalAgreeParser.g:2732:2: otherlv_0= Ordering otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )*
				// otherlv_5= Semicolon
				{
					otherlv_0 = (Token) match(input, Ordering, FollowSets000.FOLLOW_5);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_0, grammarAccess.getOrderStatementAccess().getOrderingKeyword_0());

					}
					otherlv_1 = (Token) match(input, Colon, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_1, grammarAccess.getOrderStatementAccess().getColonKeyword_1());

					}
					// InternalAgreeParser.g:2741:1: ( (otherlv_2= RULE_ID ) )
					// InternalAgreeParser.g:2742:1: (otherlv_2= RULE_ID )
					{
						// InternalAgreeParser.g:2742:1: (otherlv_2= RULE_ID )
						// InternalAgreeParser.g:2743:3: otherlv_2= RULE_ID
						{
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getOrderStatementRule());
								}

							}
							otherlv_2 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_41);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_2, grammarAccess.getOrderStatementAccess()
										.getCompsNamedElementCrossReference_2_0());

							}

						}

					}

					// InternalAgreeParser.g:2754:2: (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )*
					loop35: do {
						int alt35 = 2;
						int LA35_0 = input.LA(1);

						if ((LA35_0 == Comma)) {
							alt35 = 1;
						}

						switch (alt35) {
						case 1:
						// InternalAgreeParser.g:2755:2: otherlv_3= Comma ( (otherlv_4= RULE_ID ) )
						{
							otherlv_3 = (Token) match(input, Comma, FollowSets000.FOLLOW_11);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_3, grammarAccess.getOrderStatementAccess().getCommaKeyword_3_0());

							}
							// InternalAgreeParser.g:2759:1: ( (otherlv_4= RULE_ID ) )
							// InternalAgreeParser.g:2760:1: (otherlv_4= RULE_ID )
							{
								// InternalAgreeParser.g:2760:1: (otherlv_4= RULE_ID )
								// InternalAgreeParser.g:2761:3: otherlv_4= RULE_ID
								{
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElement(grammarAccess.getOrderStatementRule());
										}

									}
									otherlv_4 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_41);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(otherlv_4, grammarAccess.getOrderStatementAccess()
												.getCompsNamedElementCrossReference_3_1_0());

									}

								}

							}

						}
							break;

						default:
							break loop35;
						}
					} while (true);

					otherlv_5 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_5, grammarAccess.getOrderStatementAccess().getSemicolonKeyword_4());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleOrderStatement"

	// $ANTLR start "entryRuleCallDef"
	// InternalAgreeParser.g:2787:1: entryRuleCallDef returns [EObject current=null] : iv_ruleCallDef= ruleCallDef EOF ;
	public final EObject entryRuleCallDef() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleCallDef = null;

		try {
			// InternalAgreeParser.g:2788:2: (iv_ruleCallDef= ruleCallDef EOF )
			// InternalAgreeParser.g:2789:2: iv_ruleCallDef= ruleCallDef EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getCallDefRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleCallDef = ruleCallDef();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleCallDef;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleCallDef"

	// $ANTLR start "ruleCallDef"
	// InternalAgreeParser.g:2796:1: ruleCallDef returns [EObject current=null] : (this_LinearizationDefExpr_0= ruleLinearizationDefExpr |
	// this_LibraryFnDefExpr_1= ruleLibraryFnDefExpr | this_FnDefExpr_2= ruleFnDefExpr | this_NodeDefExpr_3= ruleNodeDefExpr ) ;
	public final EObject ruleCallDef() throws RecognitionException {
		EObject current = null;

		EObject this_LinearizationDefExpr_0 = null;

		EObject this_LibraryFnDefExpr_1 = null;

		EObject this_FnDefExpr_2 = null;

		EObject this_NodeDefExpr_3 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:2799:28: ( (this_LinearizationDefExpr_0= ruleLinearizationDefExpr | this_LibraryFnDefExpr_1= ruleLibraryFnDefExpr |
			// this_FnDefExpr_2= ruleFnDefExpr | this_NodeDefExpr_3= ruleNodeDefExpr ) )
			// InternalAgreeParser.g:2800:1: (this_LinearizationDefExpr_0= ruleLinearizationDefExpr | this_LibraryFnDefExpr_1= ruleLibraryFnDefExpr |
			// this_FnDefExpr_2= ruleFnDefExpr | this_NodeDefExpr_3= ruleNodeDefExpr )
			{
				// InternalAgreeParser.g:2800:1: (this_LinearizationDefExpr_0= ruleLinearizationDefExpr | this_LibraryFnDefExpr_1= ruleLibraryFnDefExpr |
				// this_FnDefExpr_2= ruleFnDefExpr | this_NodeDefExpr_3= ruleNodeDefExpr )
				int alt36 = 4;
				switch (input.LA(1)) {
				case Linearization: {
					alt36 = 1;
				}
					break;
				case External: {
					alt36 = 2;
				}
					break;
				case Fun: {
					alt36 = 3;
				}
					break;
				case Node: {
					alt36 = 4;
				}
					break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 36, 0, input);

					throw nvae;
				}

				switch (alt36) {
				case 1:
				// InternalAgreeParser.g:2801:5: this_LinearizationDefExpr_0= ruleLinearizationDefExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getCallDefAccess().getLinearizationDefExprParserRuleCall_0());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_LinearizationDefExpr_0 = ruleLinearizationDefExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_LinearizationDefExpr_0;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:2811:5: this_LibraryFnDefExpr_1= ruleLibraryFnDefExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getCallDefAccess().getLibraryFnDefExprParserRuleCall_1());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_LibraryFnDefExpr_1 = ruleLibraryFnDefExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_LibraryFnDefExpr_1;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 3:
				// InternalAgreeParser.g:2821:5: this_FnDefExpr_2= ruleFnDefExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getCallDefAccess().getFnDefExprParserRuleCall_2());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_FnDefExpr_2 = ruleFnDefExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_FnDefExpr_2;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 4:
				// InternalAgreeParser.g:2831:5: this_NodeDefExpr_3= ruleNodeDefExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getCallDefAccess().getNodeDefExprParserRuleCall_3());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_NodeDefExpr_3 = ruleNodeDefExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_NodeDefExpr_3;
						afterParserOrEnumRuleCall();

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleCallDef"

	// $ANTLR start "entryRulePropertyStatement"
	// InternalAgreeParser.g:2847:1: entryRulePropertyStatement returns [EObject current=null] : iv_rulePropertyStatement= rulePropertyStatement EOF ;
	public final EObject entryRulePropertyStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_rulePropertyStatement = null;

		try {
			// InternalAgreeParser.g:2848:2: (iv_rulePropertyStatement= rulePropertyStatement EOF )
			// InternalAgreeParser.g:2849:2: iv_rulePropertyStatement= rulePropertyStatement EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getPropertyStatementRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_rulePropertyStatement = rulePropertyStatement();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_rulePropertyStatement;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRulePropertyStatement"

	// $ANTLR start "rulePropertyStatement"
	// InternalAgreeParser.g:2856:1: rulePropertyStatement returns [EObject current=null] : (otherlv_0= Property ( (lv_name_1_0= RULE_ID ) ) otherlv_2=
	// EqualsSign ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) ;
	public final EObject rulePropertyStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_name_1_0 = null;
		Token otherlv_2 = null;
		Token otherlv_4 = null;
		EObject lv_expr_3_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:2859:28: ( (otherlv_0= Property ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expr_3_0= ruleExpr ) ) otherlv_4=
			// Semicolon ) )
			// InternalAgreeParser.g:2860:1: (otherlv_0= Property ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expr_3_0= ruleExpr ) ) otherlv_4=
			// Semicolon )
			{
				// InternalAgreeParser.g:2860:1: (otherlv_0= Property ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expr_3_0= ruleExpr ) ) otherlv_4=
				// Semicolon )
				// InternalAgreeParser.g:2861:2: otherlv_0= Property ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expr_3_0= ruleExpr ) ) otherlv_4=
				// Semicolon
				{
					otherlv_0 = (Token) match(input, Property, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_0, grammarAccess.getPropertyStatementAccess().getPropertyKeyword_0());

					}
					// InternalAgreeParser.g:2865:1: ( (lv_name_1_0= RULE_ID ) )
					// InternalAgreeParser.g:2866:1: (lv_name_1_0= RULE_ID )
					{
						// InternalAgreeParser.g:2866:1: (lv_name_1_0= RULE_ID )
						// InternalAgreeParser.g:2867:3: lv_name_1_0= RULE_ID
						{
							lv_name_1_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_44);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(lv_name_1_0,
										grammarAccess.getPropertyStatementAccess().getNameIDTerminalRuleCall_1_0());

							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getPropertyStatementRule());
								}
								setWithLastConsumed(current, "name", lv_name_1_0,
										"org.osate.xtext.aadl2.properties.Properties.ID");

							}

						}

					}

					otherlv_2 = (Token) match(input, EqualsSign, FollowSets000.FOLLOW_9);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_2, grammarAccess.getPropertyStatementAccess().getEqualsSignKeyword_2());

					}
					// InternalAgreeParser.g:2888:1: ( (lv_expr_3_0= ruleExpr ) )
					// InternalAgreeParser.g:2889:1: (lv_expr_3_0= ruleExpr )
					{
						// InternalAgreeParser.g:2889:1: (lv_expr_3_0= ruleExpr )
						// InternalAgreeParser.g:2890:3: lv_expr_3_0= ruleExpr
						{
							if (state.backtracking == 0) {

								newCompositeNode(
										grammarAccess.getPropertyStatementAccess().getExprExprParserRuleCall_3_0());

							}
							pushFollow(FollowSets000.FOLLOW_7);
							lv_expr_3_0 = ruleExpr();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getPropertyStatementRule());
								}
								set(current, "expr", lv_expr_3_0, "com.rockwellcollins.atc.agree.Agree.Expr");
								afterParserOrEnumRuleCall();

							}

						}

					}

					otherlv_4 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_4, grammarAccess.getPropertyStatementAccess().getSemicolonKeyword_4());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "rulePropertyStatement"

	// $ANTLR start "entryRuleConstStatement"
	// InternalAgreeParser.g:2919:1: entryRuleConstStatement returns [EObject current=null] : iv_ruleConstStatement= ruleConstStatement EOF ;
	public final EObject entryRuleConstStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleConstStatement = null;

		try {
			// InternalAgreeParser.g:2920:2: (iv_ruleConstStatement= ruleConstStatement EOF )
			// InternalAgreeParser.g:2921:2: iv_ruleConstStatement= ruleConstStatement EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getConstStatementRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleConstStatement = ruleConstStatement();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleConstStatement;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleConstStatement"

	// $ANTLR start "ruleConstStatement"
	// InternalAgreeParser.g:2928:1: ruleConstStatement returns [EObject current=null] : (otherlv_0= Const ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (
	// (lv_type_3_0= ruleType ) ) otherlv_4= EqualsSign ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= Semicolon ) ;
	public final EObject ruleConstStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_name_1_0 = null;
		Token otherlv_2 = null;
		Token otherlv_4 = null;
		Token otherlv_6 = null;
		EObject lv_type_3_0 = null;

		EObject lv_expr_5_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:2931:28: ( (otherlv_0= Const ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) ) otherlv_4=
			// EqualsSign ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= Semicolon ) )
			// InternalAgreeParser.g:2932:1: (otherlv_0= Const ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) ) otherlv_4= EqualsSign (
			// (lv_expr_5_0= ruleExpr ) ) otherlv_6= Semicolon )
			{
				// InternalAgreeParser.g:2932:1: (otherlv_0= Const ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) ) otherlv_4=
				// EqualsSign ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= Semicolon )
				// InternalAgreeParser.g:2933:2: otherlv_0= Const ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) ) otherlv_4=
				// EqualsSign ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= Semicolon
				{
					otherlv_0 = (Token) match(input, Const, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_0, grammarAccess.getConstStatementAccess().getConstKeyword_0());

					}
					// InternalAgreeParser.g:2937:1: ( (lv_name_1_0= RULE_ID ) )
					// InternalAgreeParser.g:2938:1: (lv_name_1_0= RULE_ID )
					{
						// InternalAgreeParser.g:2938:1: (lv_name_1_0= RULE_ID )
						// InternalAgreeParser.g:2939:3: lv_name_1_0= RULE_ID
						{
							lv_name_1_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_5);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(lv_name_1_0,
										grammarAccess.getConstStatementAccess().getNameIDTerminalRuleCall_1_0());

							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getConstStatementRule());
								}
								setWithLastConsumed(current, "name", lv_name_1_0,
										"org.osate.xtext.aadl2.properties.Properties.ID");

							}

						}

					}

					otherlv_2 = (Token) match(input, Colon, FollowSets000.FOLLOW_10);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_2, grammarAccess.getConstStatementAccess().getColonKeyword_2());

					}
					// InternalAgreeParser.g:2960:1: ( (lv_type_3_0= ruleType ) )
					// InternalAgreeParser.g:2961:1: (lv_type_3_0= ruleType )
					{
						// InternalAgreeParser.g:2961:1: (lv_type_3_0= ruleType )
						// InternalAgreeParser.g:2962:3: lv_type_3_0= ruleType
						{
							if (state.backtracking == 0) {

								newCompositeNode(
										grammarAccess.getConstStatementAccess().getTypeTypeParserRuleCall_3_0());

							}
							pushFollow(FollowSets000.FOLLOW_44);
							lv_type_3_0 = ruleType();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getConstStatementRule());
								}
								set(current, "type", lv_type_3_0, "com.rockwellcollins.atc.agree.Agree.Type");
								afterParserOrEnumRuleCall();

							}

						}

					}

					otherlv_4 = (Token) match(input, EqualsSign, FollowSets000.FOLLOW_9);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_4, grammarAccess.getConstStatementAccess().getEqualsSignKeyword_4());

					}
					// InternalAgreeParser.g:2983:1: ( (lv_expr_5_0= ruleExpr ) )
					// InternalAgreeParser.g:2984:1: (lv_expr_5_0= ruleExpr )
					{
						// InternalAgreeParser.g:2984:1: (lv_expr_5_0= ruleExpr )
						// InternalAgreeParser.g:2985:3: lv_expr_5_0= ruleExpr
						{
							if (state.backtracking == 0) {

								newCompositeNode(
										grammarAccess.getConstStatementAccess().getExprExprParserRuleCall_5_0());

							}
							pushFollow(FollowSets000.FOLLOW_7);
							lv_expr_5_0 = ruleExpr();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getConstStatementRule());
								}
								set(current, "expr", lv_expr_5_0, "com.rockwellcollins.atc.agree.Agree.Expr");
								afterParserOrEnumRuleCall();

							}

						}

					}

					otherlv_6 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_6, grammarAccess.getConstStatementAccess().getSemicolonKeyword_6());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleConstStatement"

	// $ANTLR start "entryRuleEnumStatement"
	// InternalAgreeParser.g:3014:1: entryRuleEnumStatement returns [EObject current=null] : iv_ruleEnumStatement= ruleEnumStatement EOF ;
	public final EObject entryRuleEnumStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleEnumStatement = null;

		try {
			// InternalAgreeParser.g:3015:2: (iv_ruleEnumStatement= ruleEnumStatement EOF )
			// InternalAgreeParser.g:3016:2: iv_ruleEnumStatement= ruleEnumStatement EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getEnumStatementRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleEnumStatement = ruleEnumStatement();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleEnumStatement;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleEnumStatement"

	// $ANTLR start "ruleEnumStatement"
	// InternalAgreeParser.g:3023:1: ruleEnumStatement returns [EObject current=null] : (otherlv_0= Enum ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign
	// otherlv_3= LeftCurlyBracket ( (lv_enums_4_0= ruleNamedID ) ) (otherlv_5= Comma ( (lv_enums_6_0= ruleNamedID ) ) )* otherlv_7= RightCurlyBracket
	// otherlv_8= Semicolon ) ;
	public final EObject ruleEnumStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_name_1_0 = null;
		Token otherlv_2 = null;
		Token otherlv_3 = null;
		Token otherlv_5 = null;
		Token otherlv_7 = null;
		Token otherlv_8 = null;
		EObject lv_enums_4_0 = null;

		EObject lv_enums_6_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:3026:28: ( (otherlv_0= Enum ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign otherlv_3= LeftCurlyBracket ( (lv_enums_4_0=
			// ruleNamedID ) ) (otherlv_5= Comma ( (lv_enums_6_0= ruleNamedID ) ) )* otherlv_7= RightCurlyBracket otherlv_8= Semicolon ) )
			// InternalAgreeParser.g:3027:1: (otherlv_0= Enum ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign otherlv_3= LeftCurlyBracket ( (lv_enums_4_0=
			// ruleNamedID ) ) (otherlv_5= Comma ( (lv_enums_6_0= ruleNamedID ) ) )* otherlv_7= RightCurlyBracket otherlv_8= Semicolon )
			{
				// InternalAgreeParser.g:3027:1: (otherlv_0= Enum ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign otherlv_3= LeftCurlyBracket ( (lv_enums_4_0=
				// ruleNamedID ) ) (otherlv_5= Comma ( (lv_enums_6_0= ruleNamedID ) ) )* otherlv_7= RightCurlyBracket otherlv_8= Semicolon )
				// InternalAgreeParser.g:3028:2: otherlv_0= Enum ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign otherlv_3= LeftCurlyBracket ( (lv_enums_4_0=
				// ruleNamedID ) ) (otherlv_5= Comma ( (lv_enums_6_0= ruleNamedID ) ) )* otherlv_7= RightCurlyBracket otherlv_8= Semicolon
				{
					otherlv_0 = (Token) match(input, Enum, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_0, grammarAccess.getEnumStatementAccess().getEnumKeyword_0());

					}
					// InternalAgreeParser.g:3032:1: ( (lv_name_1_0= RULE_ID ) )
					// InternalAgreeParser.g:3033:1: (lv_name_1_0= RULE_ID )
					{
						// InternalAgreeParser.g:3033:1: (lv_name_1_0= RULE_ID )
						// InternalAgreeParser.g:3034:3: lv_name_1_0= RULE_ID
						{
							lv_name_1_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_44);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(lv_name_1_0,
										grammarAccess.getEnumStatementAccess().getNameIDTerminalRuleCall_1_0());

							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getEnumStatementRule());
								}
								setWithLastConsumed(current, "name", lv_name_1_0,
										"org.osate.xtext.aadl2.properties.Properties.ID");

							}

						}

					}

					otherlv_2 = (Token) match(input, EqualsSign, FollowSets000.FOLLOW_45);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_2, grammarAccess.getEnumStatementAccess().getEqualsSignKeyword_2());

					}
					otherlv_3 = (Token) match(input, LeftCurlyBracket, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_3, grammarAccess.getEnumStatementAccess().getLeftCurlyBracketKeyword_3());

					}
					// InternalAgreeParser.g:3060:1: ( (lv_enums_4_0= ruleNamedID ) )
					// InternalAgreeParser.g:3061:1: (lv_enums_4_0= ruleNamedID )
					{
						// InternalAgreeParser.g:3061:1: (lv_enums_4_0= ruleNamedID )
						// InternalAgreeParser.g:3062:3: lv_enums_4_0= ruleNamedID
						{
							if (state.backtracking == 0) {

								newCompositeNode(
										grammarAccess.getEnumStatementAccess().getEnumsNamedIDParserRuleCall_4_0());

							}
							pushFollow(FollowSets000.FOLLOW_46);
							lv_enums_4_0 = ruleNamedID();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getEnumStatementRule());
								}
								add(current, "enums", lv_enums_4_0, "com.rockwellcollins.atc.agree.Agree.NamedID");
								afterParserOrEnumRuleCall();

							}

						}

					}

					// InternalAgreeParser.g:3078:2: (otherlv_5= Comma ( (lv_enums_6_0= ruleNamedID ) ) )*
					loop37: do {
						int alt37 = 2;
						int LA37_0 = input.LA(1);

						if ((LA37_0 == Comma)) {
							alt37 = 1;
						}

						switch (alt37) {
						case 1:
						// InternalAgreeParser.g:3079:2: otherlv_5= Comma ( (lv_enums_6_0= ruleNamedID ) )
						{
							otherlv_5 = (Token) match(input, Comma, FollowSets000.FOLLOW_11);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_5, grammarAccess.getEnumStatementAccess().getCommaKeyword_5_0());

							}
							// InternalAgreeParser.g:3083:1: ( (lv_enums_6_0= ruleNamedID ) )
							// InternalAgreeParser.g:3084:1: (lv_enums_6_0= ruleNamedID )
							{
								// InternalAgreeParser.g:3084:1: (lv_enums_6_0= ruleNamedID )
								// InternalAgreeParser.g:3085:3: lv_enums_6_0= ruleNamedID
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getEnumStatementAccess()
												.getEnumsNamedIDParserRuleCall_5_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_46);
									lv_enums_6_0 = ruleNamedID();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getEnumStatementRule());
										}
										add(current, "enums", lv_enums_6_0,
												"com.rockwellcollins.atc.agree.Agree.NamedID");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						default:
							break loop37;
						}
					} while (true);

					otherlv_7 = (Token) match(input, RightCurlyBracket, FollowSets000.FOLLOW_7);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_7, grammarAccess.getEnumStatementAccess().getRightCurlyBracketKeyword_6());

					}
					otherlv_8 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_8, grammarAccess.getEnumStatementAccess().getSemicolonKeyword_7());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleEnumStatement"

	// $ANTLR start "entryRuleEqStatement"
	// InternalAgreeParser.g:3119:1: entryRuleEqStatement returns [EObject current=null] : iv_ruleEqStatement= ruleEqStatement EOF ;
	public final EObject entryRuleEqStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleEqStatement = null;

		try {
			// InternalAgreeParser.g:3120:2: (iv_ruleEqStatement= ruleEqStatement EOF )
			// InternalAgreeParser.g:3121:2: iv_ruleEqStatement= ruleEqStatement EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getEqStatementRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleEqStatement = ruleEqStatement();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleEqStatement;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleEqStatement"

	// $ANTLR start "ruleEqStatement"
	// InternalAgreeParser.g:3128:1: ruleEqStatement returns [EObject current=null] : (otherlv_0= Eq ( ( (lv_lhs_1_0= ruleArg ) ) (otherlv_2= Comma (
	// (lv_lhs_3_0= ruleArg ) ) )* ) (otherlv_4= EqualsSign ( (lv_expr_5_0= ruleExpr ) ) )? otherlv_6= Semicolon ) ;
	public final EObject ruleEqStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		Token otherlv_4 = null;
		Token otherlv_6 = null;
		EObject lv_lhs_1_0 = null;

		EObject lv_lhs_3_0 = null;

		EObject lv_expr_5_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:3131:28: ( (otherlv_0= Eq ( ( (lv_lhs_1_0= ruleArg ) ) (otherlv_2= Comma ( (lv_lhs_3_0= ruleArg ) ) )* ) (otherlv_4=
			// EqualsSign ( (lv_expr_5_0= ruleExpr ) ) )? otherlv_6= Semicolon ) )
			// InternalAgreeParser.g:3132:1: (otherlv_0= Eq ( ( (lv_lhs_1_0= ruleArg ) ) (otherlv_2= Comma ( (lv_lhs_3_0= ruleArg ) ) )* ) (otherlv_4=
			// EqualsSign ( (lv_expr_5_0= ruleExpr ) ) )? otherlv_6= Semicolon )
			{
				// InternalAgreeParser.g:3132:1: (otherlv_0= Eq ( ( (lv_lhs_1_0= ruleArg ) ) (otherlv_2= Comma ( (lv_lhs_3_0= ruleArg ) ) )* ) (otherlv_4=
				// EqualsSign ( (lv_expr_5_0= ruleExpr ) ) )? otherlv_6= Semicolon )
				// InternalAgreeParser.g:3133:2: otherlv_0= Eq ( ( (lv_lhs_1_0= ruleArg ) ) (otherlv_2= Comma ( (lv_lhs_3_0= ruleArg ) ) )* ) (otherlv_4=
				// EqualsSign ( (lv_expr_5_0= ruleExpr ) ) )? otherlv_6= Semicolon
				{
					otherlv_0 = (Token) match(input, Eq, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_0, grammarAccess.getEqStatementAccess().getEqKeyword_0());

					}
					// InternalAgreeParser.g:3137:1: ( ( (lv_lhs_1_0= ruleArg ) ) (otherlv_2= Comma ( (lv_lhs_3_0= ruleArg ) ) )* )
					// InternalAgreeParser.g:3137:2: ( (lv_lhs_1_0= ruleArg ) ) (otherlv_2= Comma ( (lv_lhs_3_0= ruleArg ) ) )*
					{
						// InternalAgreeParser.g:3137:2: ( (lv_lhs_1_0= ruleArg ) )
						// InternalAgreeParser.g:3138:1: (lv_lhs_1_0= ruleArg )
						{
							// InternalAgreeParser.g:3138:1: (lv_lhs_1_0= ruleArg )
							// InternalAgreeParser.g:3139:3: lv_lhs_1_0= ruleArg
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getEqStatementAccess().getLhsArgParserRuleCall_1_0_0());

								}
								pushFollow(FollowSets000.FOLLOW_47);
								lv_lhs_1_0 = ruleArg();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getEqStatementRule());
									}
									add(current, "lhs", lv_lhs_1_0, "com.rockwellcollins.atc.agree.Agree.Arg");
									afterParserOrEnumRuleCall();

								}

							}

						}

						// InternalAgreeParser.g:3155:2: (otherlv_2= Comma ( (lv_lhs_3_0= ruleArg ) ) )*
						loop38: do {
							int alt38 = 2;
							int LA38_0 = input.LA(1);

							if ((LA38_0 == Comma)) {
								alt38 = 1;
							}

							switch (alt38) {
							case 1:
							// InternalAgreeParser.g:3156:2: otherlv_2= Comma ( (lv_lhs_3_0= ruleArg ) )
							{
								otherlv_2 = (Token) match(input, Comma, FollowSets000.FOLLOW_11);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_2,
											grammarAccess.getEqStatementAccess().getCommaKeyword_1_1_0());

								}
								// InternalAgreeParser.g:3160:1: ( (lv_lhs_3_0= ruleArg ) )
								// InternalAgreeParser.g:3161:1: (lv_lhs_3_0= ruleArg )
								{
									// InternalAgreeParser.g:3161:1: (lv_lhs_3_0= ruleArg )
									// InternalAgreeParser.g:3162:3: lv_lhs_3_0= ruleArg
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getEqStatementAccess()
													.getLhsArgParserRuleCall_1_1_1_0());

										}
										pushFollow(FollowSets000.FOLLOW_47);
										lv_lhs_3_0 = ruleArg();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getEqStatementRule());
											}
											add(current, "lhs", lv_lhs_3_0, "com.rockwellcollins.atc.agree.Agree.Arg");
											afterParserOrEnumRuleCall();

										}

									}

								}

							}
								break;

							default:
								break loop38;
							}
						} while (true);

					}

					// InternalAgreeParser.g:3178:5: (otherlv_4= EqualsSign ( (lv_expr_5_0= ruleExpr ) ) )?
					int alt39 = 2;
					int LA39_0 = input.LA(1);

					if ((LA39_0 == EqualsSign)) {
						alt39 = 1;
					}
					switch (alt39) {
					case 1:
					// InternalAgreeParser.g:3179:2: otherlv_4= EqualsSign ( (lv_expr_5_0= ruleExpr ) )
					{
						otherlv_4 = (Token) match(input, EqualsSign, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_4, grammarAccess.getEqStatementAccess().getEqualsSignKeyword_2_0());

						}
						// InternalAgreeParser.g:3183:1: ( (lv_expr_5_0= ruleExpr ) )
						// InternalAgreeParser.g:3184:1: (lv_expr_5_0= ruleExpr )
						{
							// InternalAgreeParser.g:3184:1: (lv_expr_5_0= ruleExpr )
							// InternalAgreeParser.g:3185:3: lv_expr_5_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getEqStatementAccess().getExprExprParserRuleCall_2_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_7);
								lv_expr_5_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getEqStatementRule());
									}
									set(current, "expr", lv_expr_5_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

					}
						break;

					}

					otherlv_6 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_6, grammarAccess.getEqStatementAccess().getSemicolonKeyword_3());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleEqStatement"

	// $ANTLR start "entryRuleInputStatement"
	// InternalAgreeParser.g:3214:1: entryRuleInputStatement returns [EObject current=null] : iv_ruleInputStatement= ruleInputStatement EOF ;
	public final EObject entryRuleInputStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleInputStatement = null;

		try {
			// InternalAgreeParser.g:3215:2: (iv_ruleInputStatement= ruleInputStatement EOF )
			// InternalAgreeParser.g:3216:2: iv_ruleInputStatement= ruleInputStatement EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getInputStatementRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleInputStatement = ruleInputStatement();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleInputStatement;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleInputStatement"

	// $ANTLR start "ruleInputStatement"
	// InternalAgreeParser.g:3223:1: ruleInputStatement returns [EObject current=null] : (otherlv_0= Agree_input ( ( (lv_lhs_1_0= ruleArg ) ) (otherlv_2= Comma
	// ( (lv_lhs_3_0= ruleArg ) ) )* ) otherlv_4= Semicolon ) ;
	public final EObject ruleInputStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		Token otherlv_4 = null;
		EObject lv_lhs_1_0 = null;

		EObject lv_lhs_3_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:3226:28: ( (otherlv_0= Agree_input ( ( (lv_lhs_1_0= ruleArg ) ) (otherlv_2= Comma ( (lv_lhs_3_0= ruleArg ) ) )* )
			// otherlv_4= Semicolon ) )
			// InternalAgreeParser.g:3227:1: (otherlv_0= Agree_input ( ( (lv_lhs_1_0= ruleArg ) ) (otherlv_2= Comma ( (lv_lhs_3_0= ruleArg ) ) )* ) otherlv_4=
			// Semicolon )
			{
				// InternalAgreeParser.g:3227:1: (otherlv_0= Agree_input ( ( (lv_lhs_1_0= ruleArg ) ) (otherlv_2= Comma ( (lv_lhs_3_0= ruleArg ) ) )* )
				// otherlv_4= Semicolon )
				// InternalAgreeParser.g:3228:2: otherlv_0= Agree_input ( ( (lv_lhs_1_0= ruleArg ) ) (otherlv_2= Comma ( (lv_lhs_3_0= ruleArg ) ) )* )
				// otherlv_4= Semicolon
				{
					otherlv_0 = (Token) match(input, Agree_input, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_0, grammarAccess.getInputStatementAccess().getAgree_inputKeyword_0());

					}
					// InternalAgreeParser.g:3232:1: ( ( (lv_lhs_1_0= ruleArg ) ) (otherlv_2= Comma ( (lv_lhs_3_0= ruleArg ) ) )* )
					// InternalAgreeParser.g:3232:2: ( (lv_lhs_1_0= ruleArg ) ) (otherlv_2= Comma ( (lv_lhs_3_0= ruleArg ) ) )*
					{
						// InternalAgreeParser.g:3232:2: ( (lv_lhs_1_0= ruleArg ) )
						// InternalAgreeParser.g:3233:1: (lv_lhs_1_0= ruleArg )
						{
							// InternalAgreeParser.g:3233:1: (lv_lhs_1_0= ruleArg )
							// InternalAgreeParser.g:3234:3: lv_lhs_1_0= ruleArg
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getInputStatementAccess().getLhsArgParserRuleCall_1_0_0());

								}
								pushFollow(FollowSets000.FOLLOW_41);
								lv_lhs_1_0 = ruleArg();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getInputStatementRule());
									}
									add(current, "lhs", lv_lhs_1_0, "com.rockwellcollins.atc.agree.Agree.Arg");
									afterParserOrEnumRuleCall();

								}

							}

						}

						// InternalAgreeParser.g:3250:2: (otherlv_2= Comma ( (lv_lhs_3_0= ruleArg ) ) )*
						loop40: do {
							int alt40 = 2;
							int LA40_0 = input.LA(1);

							if ((LA40_0 == Comma)) {
								alt40 = 1;
							}

							switch (alt40) {
							case 1:
							// InternalAgreeParser.g:3251:2: otherlv_2= Comma ( (lv_lhs_3_0= ruleArg ) )
							{
								otherlv_2 = (Token) match(input, Comma, FollowSets000.FOLLOW_11);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_2,
											grammarAccess.getInputStatementAccess().getCommaKeyword_1_1_0());

								}
								// InternalAgreeParser.g:3255:1: ( (lv_lhs_3_0= ruleArg ) )
								// InternalAgreeParser.g:3256:1: (lv_lhs_3_0= ruleArg )
								{
									// InternalAgreeParser.g:3256:1: (lv_lhs_3_0= ruleArg )
									// InternalAgreeParser.g:3257:3: lv_lhs_3_0= ruleArg
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getInputStatementAccess()
													.getLhsArgParserRuleCall_1_1_1_0());

										}
										pushFollow(FollowSets000.FOLLOW_41);
										lv_lhs_3_0 = ruleArg();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getInputStatementRule());
											}
											add(current, "lhs", lv_lhs_3_0, "com.rockwellcollins.atc.agree.Agree.Arg");
											afterParserOrEnumRuleCall();

										}

									}

								}

							}
								break;

							default:
								break loop40;
							}
						} while (true);

					}

					otherlv_4 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_4, grammarAccess.getInputStatementAccess().getSemicolonKeyword_2());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleInputStatement"

	// $ANTLR start "entryRuleAssignStatement"
	// InternalAgreeParser.g:3286:1: entryRuleAssignStatement returns [EObject current=null] : iv_ruleAssignStatement= ruleAssignStatement EOF ;
	public final EObject entryRuleAssignStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleAssignStatement = null;

		try {
			// InternalAgreeParser.g:3287:2: (iv_ruleAssignStatement= ruleAssignStatement EOF )
			// InternalAgreeParser.g:3288:2: iv_ruleAssignStatement= ruleAssignStatement EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getAssignStatementRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleAssignStatement = ruleAssignStatement();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleAssignStatement;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleAssignStatement"

	// $ANTLR start "ruleAssignStatement"
	// InternalAgreeParser.g:3295:1: ruleAssignStatement returns [EObject current=null] : (otherlv_0= Assign ( (lv_id_1_0= ruleNestedDotID ) ) otherlv_2=
	// EqualsSign ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) ;
	public final EObject ruleAssignStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		Token otherlv_4 = null;
		EObject lv_id_1_0 = null;

		EObject lv_expr_3_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:3298:28: ( (otherlv_0= Assign ( (lv_id_1_0= ruleNestedDotID ) ) otherlv_2= EqualsSign ( (lv_expr_3_0= ruleExpr ) )
			// otherlv_4= Semicolon ) )
			// InternalAgreeParser.g:3299:1: (otherlv_0= Assign ( (lv_id_1_0= ruleNestedDotID ) ) otherlv_2= EqualsSign ( (lv_expr_3_0= ruleExpr ) ) otherlv_4=
			// Semicolon )
			{
				// InternalAgreeParser.g:3299:1: (otherlv_0= Assign ( (lv_id_1_0= ruleNestedDotID ) ) otherlv_2= EqualsSign ( (lv_expr_3_0= ruleExpr ) )
				// otherlv_4= Semicolon )
				// InternalAgreeParser.g:3300:2: otherlv_0= Assign ( (lv_id_1_0= ruleNestedDotID ) ) otherlv_2= EqualsSign ( (lv_expr_3_0= ruleExpr ) )
				// otherlv_4= Semicolon
				{
					otherlv_0 = (Token) match(input, Assign, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_0, grammarAccess.getAssignStatementAccess().getAssignKeyword_0());

					}
					// InternalAgreeParser.g:3304:1: ( (lv_id_1_0= ruleNestedDotID ) )
					// InternalAgreeParser.g:3305:1: (lv_id_1_0= ruleNestedDotID )
					{
						// InternalAgreeParser.g:3305:1: (lv_id_1_0= ruleNestedDotID )
						// InternalAgreeParser.g:3306:3: lv_id_1_0= ruleNestedDotID
						{
							if (state.backtracking == 0) {

								newCompositeNode(
										grammarAccess.getAssignStatementAccess().getIdNestedDotIDParserRuleCall_1_0());

							}
							pushFollow(FollowSets000.FOLLOW_44);
							lv_id_1_0 = ruleNestedDotID();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getAssignStatementRule());
								}
								set(current, "id", lv_id_1_0, "com.rockwellcollins.atc.agree.Agree.NestedDotID");
								afterParserOrEnumRuleCall();

							}

						}

					}

					otherlv_2 = (Token) match(input, EqualsSign, FollowSets000.FOLLOW_9);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_2, grammarAccess.getAssignStatementAccess().getEqualsSignKeyword_2());

					}
					// InternalAgreeParser.g:3327:1: ( (lv_expr_3_0= ruleExpr ) )
					// InternalAgreeParser.g:3328:1: (lv_expr_3_0= ruleExpr )
					{
						// InternalAgreeParser.g:3328:1: (lv_expr_3_0= ruleExpr )
						// InternalAgreeParser.g:3329:3: lv_expr_3_0= ruleExpr
						{
							if (state.backtracking == 0) {

								newCompositeNode(
										grammarAccess.getAssignStatementAccess().getExprExprParserRuleCall_3_0());

							}
							pushFollow(FollowSets000.FOLLOW_7);
							lv_expr_3_0 = ruleExpr();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getAssignStatementRule());
								}
								set(current, "expr", lv_expr_3_0, "com.rockwellcollins.atc.agree.Agree.Expr");
								afterParserOrEnumRuleCall();

							}

						}

					}

					otherlv_4 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_4, grammarAccess.getAssignStatementAccess().getSemicolonKeyword_4());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleAssignStatement"

	// $ANTLR start "entryRuleFnDefExpr"
	// InternalAgreeParser.g:3358:1: entryRuleFnDefExpr returns [EObject current=null] : iv_ruleFnDefExpr= ruleFnDefExpr EOF ;
	public final EObject entryRuleFnDefExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleFnDefExpr = null;

		try {
			// InternalAgreeParser.g:3359:2: (iv_ruleFnDefExpr= ruleFnDefExpr EOF )
			// InternalAgreeParser.g:3360:2: iv_ruleFnDefExpr= ruleFnDefExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getFnDefExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleFnDefExpr = ruleFnDefExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleFnDefExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleFnDefExpr"

	// $ANTLR start "ruleFnDefExpr"
	// InternalAgreeParser.g:3367:1: ruleFnDefExpr returns [EObject current=null] : (otherlv_0= Fun ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis (
	// (lv_args_3_0= ruleArg ) ) (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )* otherlv_6= RightParenthesis otherlv_7= Colon ( (lv_type_8_0= ruleType ) )
	// otherlv_9= EqualsSign ( (lv_expr_10_0= ruleExpr ) ) otherlv_11= Semicolon ) ;
	public final EObject ruleFnDefExpr() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_name_1_0 = null;
		Token otherlv_2 = null;
		Token otherlv_4 = null;
		Token otherlv_6 = null;
		Token otherlv_7 = null;
		Token otherlv_9 = null;
		Token otherlv_11 = null;
		EObject lv_args_3_0 = null;

		EObject lv_args_5_0 = null;

		EObject lv_type_8_0 = null;

		EObject lv_expr_10_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:3370:28: ( (otherlv_0= Fun ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_args_3_0= ruleArg ) ) (otherlv_4=
			// Comma ( (lv_args_5_0= ruleArg ) ) )* otherlv_6= RightParenthesis otherlv_7= Colon ( (lv_type_8_0= ruleType ) ) otherlv_9= EqualsSign (
			// (lv_expr_10_0= ruleExpr ) ) otherlv_11= Semicolon ) )
			// InternalAgreeParser.g:3371:1: (otherlv_0= Fun ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_args_3_0= ruleArg ) ) (otherlv_4=
			// Comma ( (lv_args_5_0= ruleArg ) ) )* otherlv_6= RightParenthesis otherlv_7= Colon ( (lv_type_8_0= ruleType ) ) otherlv_9= EqualsSign (
			// (lv_expr_10_0= ruleExpr ) ) otherlv_11= Semicolon )
			{
				// InternalAgreeParser.g:3371:1: (otherlv_0= Fun ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_args_3_0= ruleArg ) ) (otherlv_4=
				// Comma ( (lv_args_5_0= ruleArg ) ) )* otherlv_6= RightParenthesis otherlv_7= Colon ( (lv_type_8_0= ruleType ) ) otherlv_9= EqualsSign (
				// (lv_expr_10_0= ruleExpr ) ) otherlv_11= Semicolon )
				// InternalAgreeParser.g:3372:2: otherlv_0= Fun ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_args_3_0= ruleArg ) ) (otherlv_4=
				// Comma ( (lv_args_5_0= ruleArg ) ) )* otherlv_6= RightParenthesis otherlv_7= Colon ( (lv_type_8_0= ruleType ) ) otherlv_9= EqualsSign (
				// (lv_expr_10_0= ruleExpr ) ) otherlv_11= Semicolon
				{
					otherlv_0 = (Token) match(input, Fun, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_0, grammarAccess.getFnDefExprAccess().getFunKeyword_0());

					}
					// InternalAgreeParser.g:3376:1: ( (lv_name_1_0= RULE_ID ) )
					// InternalAgreeParser.g:3377:1: (lv_name_1_0= RULE_ID )
					{
						// InternalAgreeParser.g:3377:1: (lv_name_1_0= RULE_ID )
						// InternalAgreeParser.g:3378:3: lv_name_1_0= RULE_ID
						{
							lv_name_1_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_48);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(lv_name_1_0,
										grammarAccess.getFnDefExprAccess().getNameIDTerminalRuleCall_1_0());

							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getFnDefExprRule());
								}
								setWithLastConsumed(current, "name", lv_name_1_0,
										"org.osate.xtext.aadl2.properties.Properties.ID");

							}

						}

					}

					otherlv_2 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_2, grammarAccess.getFnDefExprAccess().getLeftParenthesisKeyword_2());

					}
					// InternalAgreeParser.g:3399:1: ( (lv_args_3_0= ruleArg ) )
					// InternalAgreeParser.g:3400:1: (lv_args_3_0= ruleArg )
					{
						// InternalAgreeParser.g:3400:1: (lv_args_3_0= ruleArg )
						// InternalAgreeParser.g:3401:3: lv_args_3_0= ruleArg
						{
							if (state.backtracking == 0) {

								newCompositeNode(grammarAccess.getFnDefExprAccess().getArgsArgParserRuleCall_3_0());

							}
							pushFollow(FollowSets000.FOLLOW_49);
							lv_args_3_0 = ruleArg();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getFnDefExprRule());
								}
								add(current, "args", lv_args_3_0, "com.rockwellcollins.atc.agree.Agree.Arg");
								afterParserOrEnumRuleCall();

							}

						}

					}

					// InternalAgreeParser.g:3417:2: (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )*
					loop41: do {
						int alt41 = 2;
						int LA41_0 = input.LA(1);

						if ((LA41_0 == Comma)) {
							alt41 = 1;
						}

						switch (alt41) {
						case 1:
						// InternalAgreeParser.g:3418:2: otherlv_4= Comma ( (lv_args_5_0= ruleArg ) )
						{
							otherlv_4 = (Token) match(input, Comma, FollowSets000.FOLLOW_11);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_4, grammarAccess.getFnDefExprAccess().getCommaKeyword_4_0());

							}
							// InternalAgreeParser.g:3422:1: ( (lv_args_5_0= ruleArg ) )
							// InternalAgreeParser.g:3423:1: (lv_args_5_0= ruleArg )
							{
								// InternalAgreeParser.g:3423:1: (lv_args_5_0= ruleArg )
								// InternalAgreeParser.g:3424:3: lv_args_5_0= ruleArg
								{
									if (state.backtracking == 0) {

										newCompositeNode(
												grammarAccess.getFnDefExprAccess().getArgsArgParserRuleCall_4_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_49);
									lv_args_5_0 = ruleArg();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getFnDefExprRule());
										}
										add(current, "args", lv_args_5_0, "com.rockwellcollins.atc.agree.Agree.Arg");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						default:
							break loop41;
						}
					} while (true);

					otherlv_6 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_5);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_6, grammarAccess.getFnDefExprAccess().getRightParenthesisKeyword_5());

					}
					otherlv_7 = (Token) match(input, Colon, FollowSets000.FOLLOW_10);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_7, grammarAccess.getFnDefExprAccess().getColonKeyword_6());

					}
					// InternalAgreeParser.g:3450:1: ( (lv_type_8_0= ruleType ) )
					// InternalAgreeParser.g:3451:1: (lv_type_8_0= ruleType )
					{
						// InternalAgreeParser.g:3451:1: (lv_type_8_0= ruleType )
						// InternalAgreeParser.g:3452:3: lv_type_8_0= ruleType
						{
							if (state.backtracking == 0) {

								newCompositeNode(grammarAccess.getFnDefExprAccess().getTypeTypeParserRuleCall_7_0());

							}
							pushFollow(FollowSets000.FOLLOW_44);
							lv_type_8_0 = ruleType();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getFnDefExprRule());
								}
								set(current, "type", lv_type_8_0, "com.rockwellcollins.atc.agree.Agree.Type");
								afterParserOrEnumRuleCall();

							}

						}

					}

					otherlv_9 = (Token) match(input, EqualsSign, FollowSets000.FOLLOW_9);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_9, grammarAccess.getFnDefExprAccess().getEqualsSignKeyword_8());

					}
					// InternalAgreeParser.g:3473:1: ( (lv_expr_10_0= ruleExpr ) )
					// InternalAgreeParser.g:3474:1: (lv_expr_10_0= ruleExpr )
					{
						// InternalAgreeParser.g:3474:1: (lv_expr_10_0= ruleExpr )
						// InternalAgreeParser.g:3475:3: lv_expr_10_0= ruleExpr
						{
							if (state.backtracking == 0) {

								newCompositeNode(grammarAccess.getFnDefExprAccess().getExprExprParserRuleCall_9_0());

							}
							pushFollow(FollowSets000.FOLLOW_7);
							lv_expr_10_0 = ruleExpr();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getFnDefExprRule());
								}
								set(current, "expr", lv_expr_10_0, "com.rockwellcollins.atc.agree.Agree.Expr");
								afterParserOrEnumRuleCall();

							}

						}

					}

					otherlv_11 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_11, grammarAccess.getFnDefExprAccess().getSemicolonKeyword_10());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleFnDefExpr"

	// $ANTLR start "entryRuleLibraryFnDefExpr"
	// InternalAgreeParser.g:3504:1: entryRuleLibraryFnDefExpr returns [EObject current=null] : iv_ruleLibraryFnDefExpr= ruleLibraryFnDefExpr EOF ;
	public final EObject entryRuleLibraryFnDefExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleLibraryFnDefExpr = null;

		try {
			// InternalAgreeParser.g:3505:2: (iv_ruleLibraryFnDefExpr= ruleLibraryFnDefExpr EOF )
			// InternalAgreeParser.g:3506:2: iv_ruleLibraryFnDefExpr= ruleLibraryFnDefExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getLibraryFnDefExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleLibraryFnDefExpr = ruleLibraryFnDefExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleLibraryFnDefExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleLibraryFnDefExpr"

	// $ANTLR start "ruleLibraryFnDefExpr"
	// InternalAgreeParser.g:3513:1: ruleLibraryFnDefExpr returns [EObject current=null] : (otherlv_0= External ( (lv_name_1_0= RULE_ID ) ) otherlv_2=
	// LeftParenthesis ( (lv_args_3_0= ruleArg ) ) (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )* otherlv_6= RightParenthesis otherlv_7= Colon ( (lv_type_8_0=
	// ruleType ) ) otherlv_9= Semicolon ) ;
	public final EObject ruleLibraryFnDefExpr() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_name_1_0 = null;
		Token otherlv_2 = null;
		Token otherlv_4 = null;
		Token otherlv_6 = null;
		Token otherlv_7 = null;
		Token otherlv_9 = null;
		EObject lv_args_3_0 = null;

		EObject lv_args_5_0 = null;

		EObject lv_type_8_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:3516:28: ( (otherlv_0= External ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_args_3_0= ruleArg ) )
			// (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )* otherlv_6= RightParenthesis otherlv_7= Colon ( (lv_type_8_0= ruleType ) ) otherlv_9= Semicolon )
			// )
			// InternalAgreeParser.g:3517:1: (otherlv_0= External ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_args_3_0= ruleArg ) ) (otherlv_4=
			// Comma ( (lv_args_5_0= ruleArg ) ) )* otherlv_6= RightParenthesis otherlv_7= Colon ( (lv_type_8_0= ruleType ) ) otherlv_9= Semicolon )
			{
				// InternalAgreeParser.g:3517:1: (otherlv_0= External ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_args_3_0= ruleArg ) )
				// (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )* otherlv_6= RightParenthesis otherlv_7= Colon ( (lv_type_8_0= ruleType ) ) otherlv_9=
				// Semicolon )
				// InternalAgreeParser.g:3518:2: otherlv_0= External ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_args_3_0= ruleArg ) )
				// (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )* otherlv_6= RightParenthesis otherlv_7= Colon ( (lv_type_8_0= ruleType ) ) otherlv_9=
				// Semicolon
				{
					otherlv_0 = (Token) match(input, External, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_0, grammarAccess.getLibraryFnDefExprAccess().getExternalKeyword_0());

					}
					// InternalAgreeParser.g:3522:1: ( (lv_name_1_0= RULE_ID ) )
					// InternalAgreeParser.g:3523:1: (lv_name_1_0= RULE_ID )
					{
						// InternalAgreeParser.g:3523:1: (lv_name_1_0= RULE_ID )
						// InternalAgreeParser.g:3524:3: lv_name_1_0= RULE_ID
						{
							lv_name_1_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_48);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(lv_name_1_0,
										grammarAccess.getLibraryFnDefExprAccess().getNameIDTerminalRuleCall_1_0());

							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getLibraryFnDefExprRule());
								}
								setWithLastConsumed(current, "name", lv_name_1_0,
										"org.osate.xtext.aadl2.properties.Properties.ID");

							}

						}

					}

					otherlv_2 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_2, grammarAccess.getLibraryFnDefExprAccess().getLeftParenthesisKeyword_2());

					}
					// InternalAgreeParser.g:3545:1: ( (lv_args_3_0= ruleArg ) )
					// InternalAgreeParser.g:3546:1: (lv_args_3_0= ruleArg )
					{
						// InternalAgreeParser.g:3546:1: (lv_args_3_0= ruleArg )
						// InternalAgreeParser.g:3547:3: lv_args_3_0= ruleArg
						{
							if (state.backtracking == 0) {

								newCompositeNode(
										grammarAccess.getLibraryFnDefExprAccess().getArgsArgParserRuleCall_3_0());

							}
							pushFollow(FollowSets000.FOLLOW_49);
							lv_args_3_0 = ruleArg();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getLibraryFnDefExprRule());
								}
								add(current, "args", lv_args_3_0, "com.rockwellcollins.atc.agree.Agree.Arg");
								afterParserOrEnumRuleCall();

							}

						}

					}

					// InternalAgreeParser.g:3563:2: (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )*
					loop42: do {
						int alt42 = 2;
						int LA42_0 = input.LA(1);

						if ((LA42_0 == Comma)) {
							alt42 = 1;
						}

						switch (alt42) {
						case 1:
						// InternalAgreeParser.g:3564:2: otherlv_4= Comma ( (lv_args_5_0= ruleArg ) )
						{
							otherlv_4 = (Token) match(input, Comma, FollowSets000.FOLLOW_11);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_4, grammarAccess.getLibraryFnDefExprAccess().getCommaKeyword_4_0());

							}
							// InternalAgreeParser.g:3568:1: ( (lv_args_5_0= ruleArg ) )
							// InternalAgreeParser.g:3569:1: (lv_args_5_0= ruleArg )
							{
								// InternalAgreeParser.g:3569:1: (lv_args_5_0= ruleArg )
								// InternalAgreeParser.g:3570:3: lv_args_5_0= ruleArg
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getLibraryFnDefExprAccess()
												.getArgsArgParserRuleCall_4_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_49);
									lv_args_5_0 = ruleArg();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(
													grammarAccess.getLibraryFnDefExprRule());
										}
										add(current, "args", lv_args_5_0, "com.rockwellcollins.atc.agree.Agree.Arg");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						default:
							break loop42;
						}
					} while (true);

					otherlv_6 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_5);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_6,
								grammarAccess.getLibraryFnDefExprAccess().getRightParenthesisKeyword_5());

					}
					otherlv_7 = (Token) match(input, Colon, FollowSets000.FOLLOW_10);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_7, grammarAccess.getLibraryFnDefExprAccess().getColonKeyword_6());

					}
					// InternalAgreeParser.g:3596:1: ( (lv_type_8_0= ruleType ) )
					// InternalAgreeParser.g:3597:1: (lv_type_8_0= ruleType )
					{
						// InternalAgreeParser.g:3597:1: (lv_type_8_0= ruleType )
						// InternalAgreeParser.g:3598:3: lv_type_8_0= ruleType
						{
							if (state.backtracking == 0) {

								newCompositeNode(
										grammarAccess.getLibraryFnDefExprAccess().getTypeTypeParserRuleCall_7_0());

							}
							pushFollow(FollowSets000.FOLLOW_7);
							lv_type_8_0 = ruleType();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getLibraryFnDefExprRule());
								}
								set(current, "type", lv_type_8_0, "com.rockwellcollins.atc.agree.Agree.Type");
								afterParserOrEnumRuleCall();

							}

						}

					}

					otherlv_9 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_9, grammarAccess.getLibraryFnDefExprAccess().getSemicolonKeyword_8());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleLibraryFnDefExpr"

	// $ANTLR start "entryRuleLinearizationDefExpr"
	// InternalAgreeParser.g:3627:1: entryRuleLinearizationDefExpr returns [EObject current=null] : iv_ruleLinearizationDefExpr= ruleLinearizationDefExpr EOF ;
	public final EObject entryRuleLinearizationDefExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleLinearizationDefExpr = null;

		try {
			// InternalAgreeParser.g:3628:2: (iv_ruleLinearizationDefExpr= ruleLinearizationDefExpr EOF )
			// InternalAgreeParser.g:3629:2: iv_ruleLinearizationDefExpr= ruleLinearizationDefExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getLinearizationDefExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleLinearizationDefExpr = ruleLinearizationDefExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleLinearizationDefExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleLinearizationDefExpr"

	// $ANTLR start "ruleLinearizationDefExpr"
	// InternalAgreeParser.g:3636:1: ruleLinearizationDefExpr returns [EObject current=null] : (otherlv_0= Linearization ( (lv_name_1_0= RULE_ID ) ) otherlv_2=
	// LeftParenthesis ( (lv_args_3_0= ruleArg ) ) (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )* otherlv_6= RightParenthesis otherlv_7= Over otherlv_8=
	// LeftSquareBracket ( (lv_intervals_9_0= ruleLinearizationInterval ) ) (otherlv_10= Comma ( (lv_intervals_11_0= ruleLinearizationInterval ) ) )*
	// otherlv_12= RightSquareBracket (otherlv_13= Within ( (lv_precision_14_0= ruleExpr ) ) )? otherlv_15= Colon ( (lv_exprBody_16_0= ruleExpr ) ) otherlv_17=
	// Semicolon ) ;
	public final EObject ruleLinearizationDefExpr() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_name_1_0 = null;
		Token otherlv_2 = null;
		Token otherlv_4 = null;
		Token otherlv_6 = null;
		Token otherlv_7 = null;
		Token otherlv_8 = null;
		Token otherlv_10 = null;
		Token otherlv_12 = null;
		Token otherlv_13 = null;
		Token otherlv_15 = null;
		Token otherlv_17 = null;
		EObject lv_args_3_0 = null;

		EObject lv_args_5_0 = null;

		EObject lv_intervals_9_0 = null;

		EObject lv_intervals_11_0 = null;

		EObject lv_precision_14_0 = null;

		EObject lv_exprBody_16_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:3639:28: ( (otherlv_0= Linearization ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_args_3_0= ruleArg ) )
			// (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )* otherlv_6= RightParenthesis otherlv_7= Over otherlv_8= LeftSquareBracket ( (lv_intervals_9_0=
			// ruleLinearizationInterval ) ) (otherlv_10= Comma ( (lv_intervals_11_0= ruleLinearizationInterval ) ) )* otherlv_12= RightSquareBracket
			// (otherlv_13= Within ( (lv_precision_14_0= ruleExpr ) ) )? otherlv_15= Colon ( (lv_exprBody_16_0= ruleExpr ) ) otherlv_17= Semicolon ) )
			// InternalAgreeParser.g:3640:1: (otherlv_0= Linearization ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_args_3_0= ruleArg ) )
			// (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )* otherlv_6= RightParenthesis otherlv_7= Over otherlv_8= LeftSquareBracket ( (lv_intervals_9_0=
			// ruleLinearizationInterval ) ) (otherlv_10= Comma ( (lv_intervals_11_0= ruleLinearizationInterval ) ) )* otherlv_12= RightSquareBracket
			// (otherlv_13= Within ( (lv_precision_14_0= ruleExpr ) ) )? otherlv_15= Colon ( (lv_exprBody_16_0= ruleExpr ) ) otherlv_17= Semicolon )
			{
				// InternalAgreeParser.g:3640:1: (otherlv_0= Linearization ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_args_3_0= ruleArg ) )
				// (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )* otherlv_6= RightParenthesis otherlv_7= Over otherlv_8= LeftSquareBracket (
				// (lv_intervals_9_0= ruleLinearizationInterval ) ) (otherlv_10= Comma ( (lv_intervals_11_0= ruleLinearizationInterval ) ) )* otherlv_12=
				// RightSquareBracket (otherlv_13= Within ( (lv_precision_14_0= ruleExpr ) ) )? otherlv_15= Colon ( (lv_exprBody_16_0= ruleExpr ) ) otherlv_17=
				// Semicolon )
				// InternalAgreeParser.g:3641:2: otherlv_0= Linearization ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_args_3_0= ruleArg ) )
				// (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )* otherlv_6= RightParenthesis otherlv_7= Over otherlv_8= LeftSquareBracket (
				// (lv_intervals_9_0= ruleLinearizationInterval ) ) (otherlv_10= Comma ( (lv_intervals_11_0= ruleLinearizationInterval ) ) )* otherlv_12=
				// RightSquareBracket (otherlv_13= Within ( (lv_precision_14_0= ruleExpr ) ) )? otherlv_15= Colon ( (lv_exprBody_16_0= ruleExpr ) ) otherlv_17=
				// Semicolon
				{
					otherlv_0 = (Token) match(input, Linearization, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_0,
								grammarAccess.getLinearizationDefExprAccess().getLinearizationKeyword_0());

					}
					// InternalAgreeParser.g:3645:1: ( (lv_name_1_0= RULE_ID ) )
					// InternalAgreeParser.g:3646:1: (lv_name_1_0= RULE_ID )
					{
						// InternalAgreeParser.g:3646:1: (lv_name_1_0= RULE_ID )
						// InternalAgreeParser.g:3647:3: lv_name_1_0= RULE_ID
						{
							lv_name_1_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_48);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(lv_name_1_0,
										grammarAccess.getLinearizationDefExprAccess().getNameIDTerminalRuleCall_1_0());

							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getLinearizationDefExprRule());
								}
								setWithLastConsumed(current, "name", lv_name_1_0,
										"org.osate.xtext.aadl2.properties.Properties.ID");

							}

						}

					}

					otherlv_2 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_2,
								grammarAccess.getLinearizationDefExprAccess().getLeftParenthesisKeyword_2());

					}
					// InternalAgreeParser.g:3668:1: ( (lv_args_3_0= ruleArg ) )
					// InternalAgreeParser.g:3669:1: (lv_args_3_0= ruleArg )
					{
						// InternalAgreeParser.g:3669:1: (lv_args_3_0= ruleArg )
						// InternalAgreeParser.g:3670:3: lv_args_3_0= ruleArg
						{
							if (state.backtracking == 0) {

								newCompositeNode(
										grammarAccess.getLinearizationDefExprAccess().getArgsArgParserRuleCall_3_0());

							}
							pushFollow(FollowSets000.FOLLOW_49);
							lv_args_3_0 = ruleArg();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getLinearizationDefExprRule());
								}
								add(current, "args", lv_args_3_0, "com.rockwellcollins.atc.agree.Agree.Arg");
								afterParserOrEnumRuleCall();

							}

						}

					}

					// InternalAgreeParser.g:3686:2: (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )*
					loop43: do {
						int alt43 = 2;
						int LA43_0 = input.LA(1);

						if ((LA43_0 == Comma)) {
							alt43 = 1;
						}

						switch (alt43) {
						case 1:
						// InternalAgreeParser.g:3687:2: otherlv_4= Comma ( (lv_args_5_0= ruleArg ) )
						{
							otherlv_4 = (Token) match(input, Comma, FollowSets000.FOLLOW_11);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_4,
										grammarAccess.getLinearizationDefExprAccess().getCommaKeyword_4_0());

							}
							// InternalAgreeParser.g:3691:1: ( (lv_args_5_0= ruleArg ) )
							// InternalAgreeParser.g:3692:1: (lv_args_5_0= ruleArg )
							{
								// InternalAgreeParser.g:3692:1: (lv_args_5_0= ruleArg )
								// InternalAgreeParser.g:3693:3: lv_args_5_0= ruleArg
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getLinearizationDefExprAccess()
												.getArgsArgParserRuleCall_4_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_49);
									lv_args_5_0 = ruleArg();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(
													grammarAccess.getLinearizationDefExprRule());
										}
										add(current, "args", lv_args_5_0, "com.rockwellcollins.atc.agree.Agree.Arg");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						default:
							break loop43;
						}
					} while (true);

					otherlv_6 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_50);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_6,
								grammarAccess.getLinearizationDefExprAccess().getRightParenthesisKeyword_5());

					}
					otherlv_7 = (Token) match(input, Over, FollowSets000.FOLLOW_51);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_7, grammarAccess.getLinearizationDefExprAccess().getOverKeyword_6());

					}
					otherlv_8 = (Token) match(input, LeftSquareBracket, FollowSets000.FOLLOW_9);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_8,
								grammarAccess.getLinearizationDefExprAccess().getLeftSquareBracketKeyword_7());

					}
					// InternalAgreeParser.g:3724:1: ( (lv_intervals_9_0= ruleLinearizationInterval ) )
					// InternalAgreeParser.g:3725:1: (lv_intervals_9_0= ruleLinearizationInterval )
					{
						// InternalAgreeParser.g:3725:1: (lv_intervals_9_0= ruleLinearizationInterval )
						// InternalAgreeParser.g:3726:3: lv_intervals_9_0= ruleLinearizationInterval
						{
							if (state.backtracking == 0) {

								newCompositeNode(grammarAccess.getLinearizationDefExprAccess()
										.getIntervalsLinearizationIntervalParserRuleCall_8_0());

							}
							pushFollow(FollowSets000.FOLLOW_52);
							lv_intervals_9_0 = ruleLinearizationInterval();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getLinearizationDefExprRule());
								}
								add(current, "intervals", lv_intervals_9_0,
										"com.rockwellcollins.atc.agree.Agree.LinearizationInterval");
								afterParserOrEnumRuleCall();

							}

						}

					}

					// InternalAgreeParser.g:3742:2: (otherlv_10= Comma ( (lv_intervals_11_0= ruleLinearizationInterval ) ) )*
					loop44: do {
						int alt44 = 2;
						int LA44_0 = input.LA(1);

						if ((LA44_0 == Comma)) {
							alt44 = 1;
						}

						switch (alt44) {
						case 1:
						// InternalAgreeParser.g:3743:2: otherlv_10= Comma ( (lv_intervals_11_0= ruleLinearizationInterval ) )
						{
							otherlv_10 = (Token) match(input, Comma, FollowSets000.FOLLOW_9);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_10,
										grammarAccess.getLinearizationDefExprAccess().getCommaKeyword_9_0());

							}
							// InternalAgreeParser.g:3747:1: ( (lv_intervals_11_0= ruleLinearizationInterval ) )
							// InternalAgreeParser.g:3748:1: (lv_intervals_11_0= ruleLinearizationInterval )
							{
								// InternalAgreeParser.g:3748:1: (lv_intervals_11_0= ruleLinearizationInterval )
								// InternalAgreeParser.g:3749:3: lv_intervals_11_0= ruleLinearizationInterval
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getLinearizationDefExprAccess()
												.getIntervalsLinearizationIntervalParserRuleCall_9_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_52);
									lv_intervals_11_0 = ruleLinearizationInterval();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(
													grammarAccess.getLinearizationDefExprRule());
										}
										add(current, "intervals", lv_intervals_11_0,
												"com.rockwellcollins.atc.agree.Agree.LinearizationInterval");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						default:
							break loop44;
						}
					} while (true);

					otherlv_12 = (Token) match(input, RightSquareBracket, FollowSets000.FOLLOW_53);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_12,
								grammarAccess.getLinearizationDefExprAccess().getRightSquareBracketKeyword_10());

					}
					// InternalAgreeParser.g:3770:1: (otherlv_13= Within ( (lv_precision_14_0= ruleExpr ) ) )?
					int alt45 = 2;
					int LA45_0 = input.LA(1);

					if ((LA45_0 == Within)) {
						alt45 = 1;
					}
					switch (alt45) {
					case 1:
					// InternalAgreeParser.g:3771:2: otherlv_13= Within ( (lv_precision_14_0= ruleExpr ) )
					{
						otherlv_13 = (Token) match(input, Within, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_13,
									grammarAccess.getLinearizationDefExprAccess().getWithinKeyword_11_0());

						}
						// InternalAgreeParser.g:3775:1: ( (lv_precision_14_0= ruleExpr ) )
						// InternalAgreeParser.g:3776:1: (lv_precision_14_0= ruleExpr )
						{
							// InternalAgreeParser.g:3776:1: (lv_precision_14_0= ruleExpr )
							// InternalAgreeParser.g:3777:3: lv_precision_14_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getLinearizationDefExprAccess()
											.getPrecisionExprParserRuleCall_11_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_5);
								lv_precision_14_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(
												grammarAccess.getLinearizationDefExprRule());
									}
									set(current, "precision", lv_precision_14_0,
											"com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

					}
						break;

					}

					otherlv_15 = (Token) match(input, Colon, FollowSets000.FOLLOW_9);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_15, grammarAccess.getLinearizationDefExprAccess().getColonKeyword_12());

					}
					// InternalAgreeParser.g:3798:1: ( (lv_exprBody_16_0= ruleExpr ) )
					// InternalAgreeParser.g:3799:1: (lv_exprBody_16_0= ruleExpr )
					{
						// InternalAgreeParser.g:3799:1: (lv_exprBody_16_0= ruleExpr )
						// InternalAgreeParser.g:3800:3: lv_exprBody_16_0= ruleExpr
						{
							if (state.backtracking == 0) {

								newCompositeNode(grammarAccess.getLinearizationDefExprAccess()
										.getExprBodyExprParserRuleCall_13_0());

							}
							pushFollow(FollowSets000.FOLLOW_7);
							lv_exprBody_16_0 = ruleExpr();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getLinearizationDefExprRule());
								}
								set(current, "exprBody", lv_exprBody_16_0, "com.rockwellcollins.atc.agree.Agree.Expr");
								afterParserOrEnumRuleCall();

							}

						}

					}

					otherlv_17 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_17, grammarAccess.getLinearizationDefExprAccess().getSemicolonKeyword_14());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleLinearizationDefExpr"

	// $ANTLR start "entryRuleLinearizationInterval"
	// InternalAgreeParser.g:3829:1: entryRuleLinearizationInterval returns [EObject current=null] : iv_ruleLinearizationInterval= ruleLinearizationInterval EOF
	// ;
	public final EObject entryRuleLinearizationInterval() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleLinearizationInterval = null;

		try {
			// InternalAgreeParser.g:3830:2: (iv_ruleLinearizationInterval= ruleLinearizationInterval EOF )
			// InternalAgreeParser.g:3831:2: iv_ruleLinearizationInterval= ruleLinearizationInterval EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getLinearizationIntervalRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleLinearizationInterval = ruleLinearizationInterval();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleLinearizationInterval;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleLinearizationInterval"

	// $ANTLR start "ruleLinearizationInterval"
	// InternalAgreeParser.g:3838:1: ruleLinearizationInterval returns [EObject current=null] : ( ( (lv_start_0_0= ruleExpr ) ) otherlv_1= FullStopFullStop (
	// (lv_end_2_0= ruleExpr ) ) ) ;
	public final EObject ruleLinearizationInterval() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		EObject lv_start_0_0 = null;

		EObject lv_end_2_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:3841:28: ( ( ( (lv_start_0_0= ruleExpr ) ) otherlv_1= FullStopFullStop ( (lv_end_2_0= ruleExpr ) ) ) )
			// InternalAgreeParser.g:3842:1: ( ( (lv_start_0_0= ruleExpr ) ) otherlv_1= FullStopFullStop ( (lv_end_2_0= ruleExpr ) ) )
			{
				// InternalAgreeParser.g:3842:1: ( ( (lv_start_0_0= ruleExpr ) ) otherlv_1= FullStopFullStop ( (lv_end_2_0= ruleExpr ) ) )
				// InternalAgreeParser.g:3842:2: ( (lv_start_0_0= ruleExpr ) ) otherlv_1= FullStopFullStop ( (lv_end_2_0= ruleExpr ) )
				{
					// InternalAgreeParser.g:3842:2: ( (lv_start_0_0= ruleExpr ) )
					// InternalAgreeParser.g:3843:1: (lv_start_0_0= ruleExpr )
					{
						// InternalAgreeParser.g:3843:1: (lv_start_0_0= ruleExpr )
						// InternalAgreeParser.g:3844:3: lv_start_0_0= ruleExpr
						{
							if (state.backtracking == 0) {

								newCompositeNode(grammarAccess.getLinearizationIntervalAccess()
										.getStartExprParserRuleCall_0_0());

							}
							pushFollow(FollowSets000.FOLLOW_54);
							lv_start_0_0 = ruleExpr();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getLinearizationIntervalRule());
								}
								set(current, "start", lv_start_0_0, "com.rockwellcollins.atc.agree.Agree.Expr");
								afterParserOrEnumRuleCall();

							}

						}

					}

					otherlv_1 = (Token) match(input, FullStopFullStop, FollowSets000.FOLLOW_9);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_1,
								grammarAccess.getLinearizationIntervalAccess().getFullStopFullStopKeyword_1());

					}
					// InternalAgreeParser.g:3865:1: ( (lv_end_2_0= ruleExpr ) )
					// InternalAgreeParser.g:3866:1: (lv_end_2_0= ruleExpr )
					{
						// InternalAgreeParser.g:3866:1: (lv_end_2_0= ruleExpr )
						// InternalAgreeParser.g:3867:3: lv_end_2_0= ruleExpr
						{
							if (state.backtracking == 0) {

								newCompositeNode(
										grammarAccess.getLinearizationIntervalAccess().getEndExprParserRuleCall_2_0());

							}
							pushFollow(FollowSets000.FOLLOW_2);
							lv_end_2_0 = ruleExpr();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getLinearizationIntervalRule());
								}
								set(current, "end", lv_end_2_0, "com.rockwellcollins.atc.agree.Agree.Expr");
								afterParserOrEnumRuleCall();

							}

						}

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleLinearizationInterval"

	// $ANTLR start "entryRuleNodeDefExpr"
	// InternalAgreeParser.g:3891:1: entryRuleNodeDefExpr returns [EObject current=null] : iv_ruleNodeDefExpr= ruleNodeDefExpr EOF ;
	public final EObject entryRuleNodeDefExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNodeDefExpr = null;

		try {
			// InternalAgreeParser.g:3892:2: (iv_ruleNodeDefExpr= ruleNodeDefExpr EOF )
			// InternalAgreeParser.g:3893:2: iv_ruleNodeDefExpr= ruleNodeDefExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getNodeDefExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleNodeDefExpr = ruleNodeDefExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleNodeDefExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleNodeDefExpr"

	// $ANTLR start "ruleNodeDefExpr"
	// InternalAgreeParser.g:3900:1: ruleNodeDefExpr returns [EObject current=null] : (otherlv_0= Node ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis (
	// ( (lv_args_3_0= ruleArg ) ) (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )* )? otherlv_6= RightParenthesis otherlv_7= Returns otherlv_8= LeftParenthesis
	// ( ( (lv_rets_9_0= ruleArg ) ) (otherlv_10= Comma ( (lv_rets_11_0= ruleArg ) ) )* )? otherlv_12= RightParenthesis otherlv_13= Semicolon (
	// (lv_nodeBody_14_0= ruleNodeBodyExpr ) ) ) ;
	public final EObject ruleNodeDefExpr() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_name_1_0 = null;
		Token otherlv_2 = null;
		Token otherlv_4 = null;
		Token otherlv_6 = null;
		Token otherlv_7 = null;
		Token otherlv_8 = null;
		Token otherlv_10 = null;
		Token otherlv_12 = null;
		Token otherlv_13 = null;
		EObject lv_args_3_0 = null;

		EObject lv_args_5_0 = null;

		EObject lv_rets_9_0 = null;

		EObject lv_rets_11_0 = null;

		EObject lv_nodeBody_14_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:3903:28: ( (otherlv_0= Node ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_args_3_0= ruleArg ) )
			// (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )* )? otherlv_6= RightParenthesis otherlv_7= Returns otherlv_8= LeftParenthesis ( ( (lv_rets_9_0=
			// ruleArg ) ) (otherlv_10= Comma ( (lv_rets_11_0= ruleArg ) ) )* )? otherlv_12= RightParenthesis otherlv_13= Semicolon ( (lv_nodeBody_14_0=
			// ruleNodeBodyExpr ) ) ) )
			// InternalAgreeParser.g:3904:1: (otherlv_0= Node ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_args_3_0= ruleArg ) ) (otherlv_4=
			// Comma ( (lv_args_5_0= ruleArg ) ) )* )? otherlv_6= RightParenthesis otherlv_7= Returns otherlv_8= LeftParenthesis ( ( (lv_rets_9_0= ruleArg ) )
			// (otherlv_10= Comma ( (lv_rets_11_0= ruleArg ) ) )* )? otherlv_12= RightParenthesis otherlv_13= Semicolon ( (lv_nodeBody_14_0= ruleNodeBodyExpr )
			// ) )
			{
				// InternalAgreeParser.g:3904:1: (otherlv_0= Node ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_args_3_0= ruleArg ) )
				// (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )* )? otherlv_6= RightParenthesis otherlv_7= Returns otherlv_8= LeftParenthesis ( (
				// (lv_rets_9_0= ruleArg ) ) (otherlv_10= Comma ( (lv_rets_11_0= ruleArg ) ) )* )? otherlv_12= RightParenthesis otherlv_13= Semicolon (
				// (lv_nodeBody_14_0= ruleNodeBodyExpr ) ) )
				// InternalAgreeParser.g:3905:2: otherlv_0= Node ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_args_3_0= ruleArg ) )
				// (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )* )? otherlv_6= RightParenthesis otherlv_7= Returns otherlv_8= LeftParenthesis ( (
				// (lv_rets_9_0= ruleArg ) ) (otherlv_10= Comma ( (lv_rets_11_0= ruleArg ) ) )* )? otherlv_12= RightParenthesis otherlv_13= Semicolon (
				// (lv_nodeBody_14_0= ruleNodeBodyExpr ) )
				{
					otherlv_0 = (Token) match(input, Node, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_0, grammarAccess.getNodeDefExprAccess().getNodeKeyword_0());

					}
					// InternalAgreeParser.g:3909:1: ( (lv_name_1_0= RULE_ID ) )
					// InternalAgreeParser.g:3910:1: (lv_name_1_0= RULE_ID )
					{
						// InternalAgreeParser.g:3910:1: (lv_name_1_0= RULE_ID )
						// InternalAgreeParser.g:3911:3: lv_name_1_0= RULE_ID
						{
							lv_name_1_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_48);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(lv_name_1_0,
										grammarAccess.getNodeDefExprAccess().getNameIDTerminalRuleCall_1_0());

							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getNodeDefExprRule());
								}
								setWithLastConsumed(current, "name", lv_name_1_0,
										"org.osate.xtext.aadl2.properties.Properties.ID");

							}

						}

					}

					otherlv_2 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_55);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_2, grammarAccess.getNodeDefExprAccess().getLeftParenthesisKeyword_2());

					}
					// InternalAgreeParser.g:3932:1: ( ( (lv_args_3_0= ruleArg ) ) (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )* )?
					int alt47 = 2;
					int LA47_0 = input.LA(1);

					if ((LA47_0 == RULE_ID)) {
						alt47 = 1;
					}
					switch (alt47) {
					case 1:
					// InternalAgreeParser.g:3932:2: ( (lv_args_3_0= ruleArg ) ) (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )*
					{
						// InternalAgreeParser.g:3932:2: ( (lv_args_3_0= ruleArg ) )
						// InternalAgreeParser.g:3933:1: (lv_args_3_0= ruleArg )
						{
							// InternalAgreeParser.g:3933:1: (lv_args_3_0= ruleArg )
							// InternalAgreeParser.g:3934:3: lv_args_3_0= ruleArg
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getNodeDefExprAccess().getArgsArgParserRuleCall_3_0_0());

								}
								pushFollow(FollowSets000.FOLLOW_49);
								lv_args_3_0 = ruleArg();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getNodeDefExprRule());
									}
									add(current, "args", lv_args_3_0, "com.rockwellcollins.atc.agree.Agree.Arg");
									afterParserOrEnumRuleCall();

								}

							}

						}

						// InternalAgreeParser.g:3950:2: (otherlv_4= Comma ( (lv_args_5_0= ruleArg ) ) )*
						loop46: do {
							int alt46 = 2;
							int LA46_0 = input.LA(1);

							if ((LA46_0 == Comma)) {
								alt46 = 1;
							}

							switch (alt46) {
							case 1:
							// InternalAgreeParser.g:3951:2: otherlv_4= Comma ( (lv_args_5_0= ruleArg ) )
							{
								otherlv_4 = (Token) match(input, Comma, FollowSets000.FOLLOW_11);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_4,
											grammarAccess.getNodeDefExprAccess().getCommaKeyword_3_1_0());

								}
								// InternalAgreeParser.g:3955:1: ( (lv_args_5_0= ruleArg ) )
								// InternalAgreeParser.g:3956:1: (lv_args_5_0= ruleArg )
								{
									// InternalAgreeParser.g:3956:1: (lv_args_5_0= ruleArg )
									// InternalAgreeParser.g:3957:3: lv_args_5_0= ruleArg
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getNodeDefExprAccess()
													.getArgsArgParserRuleCall_3_1_1_0());

										}
										pushFollow(FollowSets000.FOLLOW_49);
										lv_args_5_0 = ruleArg();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getNodeDefExprRule());
											}
											add(current, "args", lv_args_5_0,
													"com.rockwellcollins.atc.agree.Agree.Arg");
											afterParserOrEnumRuleCall();

										}

									}

								}

							}
								break;

							default:
								break loop46;
							}
						} while (true);

					}
						break;

					}

					otherlv_6 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_56);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_6, grammarAccess.getNodeDefExprAccess().getRightParenthesisKeyword_4());

					}
					otherlv_7 = (Token) match(input, Returns, FollowSets000.FOLLOW_48);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_7, grammarAccess.getNodeDefExprAccess().getReturnsKeyword_5());

					}
					otherlv_8 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_55);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_8, grammarAccess.getNodeDefExprAccess().getLeftParenthesisKeyword_6());

					}
					// InternalAgreeParser.g:3988:1: ( ( (lv_rets_9_0= ruleArg ) ) (otherlv_10= Comma ( (lv_rets_11_0= ruleArg ) ) )* )?
					int alt49 = 2;
					int LA49_0 = input.LA(1);

					if ((LA49_0 == RULE_ID)) {
						alt49 = 1;
					}
					switch (alt49) {
					case 1:
					// InternalAgreeParser.g:3988:2: ( (lv_rets_9_0= ruleArg ) ) (otherlv_10= Comma ( (lv_rets_11_0= ruleArg ) ) )*
					{
						// InternalAgreeParser.g:3988:2: ( (lv_rets_9_0= ruleArg ) )
						// InternalAgreeParser.g:3989:1: (lv_rets_9_0= ruleArg )
						{
							// InternalAgreeParser.g:3989:1: (lv_rets_9_0= ruleArg )
							// InternalAgreeParser.g:3990:3: lv_rets_9_0= ruleArg
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getNodeDefExprAccess().getRetsArgParserRuleCall_7_0_0());

								}
								pushFollow(FollowSets000.FOLLOW_49);
								lv_rets_9_0 = ruleArg();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getNodeDefExprRule());
									}
									add(current, "rets", lv_rets_9_0, "com.rockwellcollins.atc.agree.Agree.Arg");
									afterParserOrEnumRuleCall();

								}

							}

						}

						// InternalAgreeParser.g:4006:2: (otherlv_10= Comma ( (lv_rets_11_0= ruleArg ) ) )*
						loop48: do {
							int alt48 = 2;
							int LA48_0 = input.LA(1);

							if ((LA48_0 == Comma)) {
								alt48 = 1;
							}

							switch (alt48) {
							case 1:
							// InternalAgreeParser.g:4007:2: otherlv_10= Comma ( (lv_rets_11_0= ruleArg ) )
							{
								otherlv_10 = (Token) match(input, Comma, FollowSets000.FOLLOW_11);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_10,
											grammarAccess.getNodeDefExprAccess().getCommaKeyword_7_1_0());

								}
								// InternalAgreeParser.g:4011:1: ( (lv_rets_11_0= ruleArg ) )
								// InternalAgreeParser.g:4012:1: (lv_rets_11_0= ruleArg )
								{
									// InternalAgreeParser.g:4012:1: (lv_rets_11_0= ruleArg )
									// InternalAgreeParser.g:4013:3: lv_rets_11_0= ruleArg
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getNodeDefExprAccess()
													.getRetsArgParserRuleCall_7_1_1_0());

										}
										pushFollow(FollowSets000.FOLLOW_49);
										lv_rets_11_0 = ruleArg();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getNodeDefExprRule());
											}
											add(current, "rets", lv_rets_11_0,
													"com.rockwellcollins.atc.agree.Agree.Arg");
											afterParserOrEnumRuleCall();

										}

									}

								}

							}
								break;

							default:
								break loop48;
							}
						} while (true);

					}
						break;

					}

					otherlv_12 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_7);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_12, grammarAccess.getNodeDefExprAccess().getRightParenthesisKeyword_8());

					}
					otherlv_13 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_57);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_13, grammarAccess.getNodeDefExprAccess().getSemicolonKeyword_9());

					}
					// InternalAgreeParser.g:4039:1: ( (lv_nodeBody_14_0= ruleNodeBodyExpr ) )
					// InternalAgreeParser.g:4040:1: (lv_nodeBody_14_0= ruleNodeBodyExpr )
					{
						// InternalAgreeParser.g:4040:1: (lv_nodeBody_14_0= ruleNodeBodyExpr )
						// InternalAgreeParser.g:4041:3: lv_nodeBody_14_0= ruleNodeBodyExpr
						{
							if (state.backtracking == 0) {

								newCompositeNode(grammarAccess.getNodeDefExprAccess()
										.getNodeBodyNodeBodyExprParserRuleCall_10_0());

							}
							pushFollow(FollowSets000.FOLLOW_2);
							lv_nodeBody_14_0 = ruleNodeBodyExpr();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getNodeDefExprRule());
								}
								set(current, "nodeBody", lv_nodeBody_14_0,
										"com.rockwellcollins.atc.agree.Agree.NodeBodyExpr");
								afterParserOrEnumRuleCall();

							}

						}

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleNodeDefExpr"

	// $ANTLR start "entryRuleNodeBodyExpr"
	// InternalAgreeParser.g:4065:1: entryRuleNodeBodyExpr returns [EObject current=null] : iv_ruleNodeBodyExpr= ruleNodeBodyExpr EOF ;
	public final EObject entryRuleNodeBodyExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNodeBodyExpr = null;

		try {
			// InternalAgreeParser.g:4066:2: (iv_ruleNodeBodyExpr= ruleNodeBodyExpr EOF )
			// InternalAgreeParser.g:4067:2: iv_ruleNodeBodyExpr= ruleNodeBodyExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getNodeBodyExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleNodeBodyExpr = ruleNodeBodyExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleNodeBodyExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleNodeBodyExpr"

	// $ANTLR start "ruleNodeBodyExpr"
	// InternalAgreeParser.g:4074:1: ruleNodeBodyExpr returns [EObject current=null] : ( (otherlv_0= Var ( ( (lv_locs_1_0= ruleArg ) ) otherlv_2= Semicolon )+
	// )? otherlv_3= Let ( (lv_stmts_4_0= ruleNodeStmt ) )+ otherlv_5= Tel otherlv_6= Semicolon ) ;
	public final EObject ruleNodeBodyExpr() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		Token otherlv_3 = null;
		Token otherlv_5 = null;
		Token otherlv_6 = null;
		EObject lv_locs_1_0 = null;

		EObject lv_stmts_4_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:4077:28: ( ( (otherlv_0= Var ( ( (lv_locs_1_0= ruleArg ) ) otherlv_2= Semicolon )+ )? otherlv_3= Let ( (lv_stmts_4_0=
			// ruleNodeStmt ) )+ otherlv_5= Tel otherlv_6= Semicolon ) )
			// InternalAgreeParser.g:4078:1: ( (otherlv_0= Var ( ( (lv_locs_1_0= ruleArg ) ) otherlv_2= Semicolon )+ )? otherlv_3= Let ( (lv_stmts_4_0=
			// ruleNodeStmt ) )+ otherlv_5= Tel otherlv_6= Semicolon )
			{
				// InternalAgreeParser.g:4078:1: ( (otherlv_0= Var ( ( (lv_locs_1_0= ruleArg ) ) otherlv_2= Semicolon )+ )? otherlv_3= Let ( (lv_stmts_4_0=
				// ruleNodeStmt ) )+ otherlv_5= Tel otherlv_6= Semicolon )
				// InternalAgreeParser.g:4078:2: (otherlv_0= Var ( ( (lv_locs_1_0= ruleArg ) ) otherlv_2= Semicolon )+ )? otherlv_3= Let ( (lv_stmts_4_0=
				// ruleNodeStmt ) )+ otherlv_5= Tel otherlv_6= Semicolon
				{
					// InternalAgreeParser.g:4078:2: (otherlv_0= Var ( ( (lv_locs_1_0= ruleArg ) ) otherlv_2= Semicolon )+ )?
					int alt51 = 2;
					int LA51_0 = input.LA(1);

					if ((LA51_0 == Var)) {
						alt51 = 1;
					}
					switch (alt51) {
					case 1:
					// InternalAgreeParser.g:4079:2: otherlv_0= Var ( ( (lv_locs_1_0= ruleArg ) ) otherlv_2= Semicolon )+
					{
						otherlv_0 = (Token) match(input, Var, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_0, grammarAccess.getNodeBodyExprAccess().getVarKeyword_0_0());

						}
						// InternalAgreeParser.g:4083:1: ( ( (lv_locs_1_0= ruleArg ) ) otherlv_2= Semicolon )+
						int cnt50 = 0;
						loop50: do {
							int alt50 = 2;
							int LA50_0 = input.LA(1);

							if ((LA50_0 == RULE_ID)) {
								alt50 = 1;
							}

							switch (alt50) {
							case 1:
							// InternalAgreeParser.g:4083:2: ( (lv_locs_1_0= ruleArg ) ) otherlv_2= Semicolon
							{
								// InternalAgreeParser.g:4083:2: ( (lv_locs_1_0= ruleArg ) )
								// InternalAgreeParser.g:4084:1: (lv_locs_1_0= ruleArg )
								{
									// InternalAgreeParser.g:4084:1: (lv_locs_1_0= ruleArg )
									// InternalAgreeParser.g:4085:3: lv_locs_1_0= ruleArg
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getNodeBodyExprAccess()
													.getLocsArgParserRuleCall_0_1_0_0());

										}
										pushFollow(FollowSets000.FOLLOW_7);
										lv_locs_1_0 = ruleArg();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getNodeBodyExprRule());
											}
											add(current, "locs", lv_locs_1_0,
													"com.rockwellcollins.atc.agree.Agree.Arg");
											afterParserOrEnumRuleCall();

										}

									}

								}

								otherlv_2 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_58);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_2,
											grammarAccess.getNodeBodyExprAccess().getSemicolonKeyword_0_1_1());

								}

							}
								break;

							default:
								if (cnt50 >= 1) {
									break loop50;
								}
								if (state.backtracking > 0) {
									state.failed = true;
									return current;
								}
								EarlyExitException eee = new EarlyExitException(50, input);
								throw eee;
							}
							cnt50++;
						} while (true);

					}
						break;

					}

					otherlv_3 = (Token) match(input, Let, FollowSets000.FOLLOW_59);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_3, grammarAccess.getNodeBodyExprAccess().getLetKeyword_1());

					}
					// InternalAgreeParser.g:4111:1: ( (lv_stmts_4_0= ruleNodeStmt ) )+
					int cnt52 = 0;
					loop52: do {
						int alt52 = 2;
						int LA52_0 = input.LA(1);

						if ((LA52_0 == Lemma || LA52_0 == RULE_ID)) {
							alt52 = 1;
						}

						switch (alt52) {
						case 1:
						// InternalAgreeParser.g:4112:1: (lv_stmts_4_0= ruleNodeStmt )
						{
							// InternalAgreeParser.g:4112:1: (lv_stmts_4_0= ruleNodeStmt )
							// InternalAgreeParser.g:4113:3: lv_stmts_4_0= ruleNodeStmt
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getNodeBodyExprAccess().getStmtsNodeStmtParserRuleCall_2_0());

								}
								pushFollow(FollowSets000.FOLLOW_60);
								lv_stmts_4_0 = ruleNodeStmt();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getNodeBodyExprRule());
									}
									add(current, "stmts", lv_stmts_4_0, "com.rockwellcollins.atc.agree.Agree.NodeStmt");
									afterParserOrEnumRuleCall();

								}

							}

						}
							break;

						default:
							if (cnt52 >= 1) {
								break loop52;
							}
							if (state.backtracking > 0) {
								state.failed = true;
								return current;
							}
							EarlyExitException eee = new EarlyExitException(52, input);
							throw eee;
						}
						cnt52++;
					} while (true);

					otherlv_5 = (Token) match(input, Tel, FollowSets000.FOLLOW_7);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_5, grammarAccess.getNodeBodyExprAccess().getTelKeyword_3());

					}
					otherlv_6 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_6, grammarAccess.getNodeBodyExprAccess().getSemicolonKeyword_4());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleNodeBodyExpr"

	// $ANTLR start "entryRuleNodeStmt"
	// InternalAgreeParser.g:4147:1: entryRuleNodeStmt returns [EObject current=null] : iv_ruleNodeStmt= ruleNodeStmt EOF ;
	public final EObject entryRuleNodeStmt() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNodeStmt = null;

		try {
			// InternalAgreeParser.g:4148:2: (iv_ruleNodeStmt= ruleNodeStmt EOF )
			// InternalAgreeParser.g:4149:2: iv_ruleNodeStmt= ruleNodeStmt EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getNodeStmtRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleNodeStmt = ruleNodeStmt();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleNodeStmt;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleNodeStmt"

	// $ANTLR start "ruleNodeStmt"
	// InternalAgreeParser.g:4156:1: ruleNodeStmt returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= Comma ( (otherlv_3= RULE_ID ) )
	// )* otherlv_4= EqualsSign ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= Semicolon ) | ( () otherlv_8= Lemma ( (lv_str_9_0= RULE_STRING ) ) otherlv_10= Colon (
	// (lv_expr_11_0= ruleExpr ) ) otherlv_12= Semicolon ) ) ;
	public final EObject ruleNodeStmt() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_2 = null;
		Token otherlv_3 = null;
		Token otherlv_4 = null;
		Token otherlv_6 = null;
		Token otherlv_8 = null;
		Token lv_str_9_0 = null;
		Token otherlv_10 = null;
		Token otherlv_12 = null;
		EObject lv_expr_5_0 = null;

		EObject lv_expr_11_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:4159:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= Comma ( (otherlv_3= RULE_ID ) ) )* otherlv_4= EqualsSign (
			// (lv_expr_5_0= ruleExpr ) ) otherlv_6= Semicolon ) | ( () otherlv_8= Lemma ( (lv_str_9_0= RULE_STRING ) ) otherlv_10= Colon ( (lv_expr_11_0=
			// ruleExpr ) ) otherlv_12= Semicolon ) ) )
			// InternalAgreeParser.g:4160:1: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= Comma ( (otherlv_3= RULE_ID ) ) )* otherlv_4= EqualsSign (
			// (lv_expr_5_0= ruleExpr ) ) otherlv_6= Semicolon ) | ( () otherlv_8= Lemma ( (lv_str_9_0= RULE_STRING ) ) otherlv_10= Colon ( (lv_expr_11_0=
			// ruleExpr ) ) otherlv_12= Semicolon ) )
			{
				// InternalAgreeParser.g:4160:1: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= Comma ( (otherlv_3= RULE_ID ) ) )* otherlv_4= EqualsSign (
				// (lv_expr_5_0= ruleExpr ) ) otherlv_6= Semicolon ) | ( () otherlv_8= Lemma ( (lv_str_9_0= RULE_STRING ) ) otherlv_10= Colon ( (lv_expr_11_0=
				// ruleExpr ) ) otherlv_12= Semicolon ) )
				int alt54 = 2;
				int LA54_0 = input.LA(1);

				if ((LA54_0 == RULE_ID)) {
					alt54 = 1;
				} else if ((LA54_0 == Lemma)) {
					alt54 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 54, 0, input);

					throw nvae;
				}
				switch (alt54) {
				case 1:
				// InternalAgreeParser.g:4160:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= Comma ( (otherlv_3= RULE_ID ) ) )* otherlv_4= EqualsSign (
				// (lv_expr_5_0= ruleExpr ) ) otherlv_6= Semicolon )
				{
					// InternalAgreeParser.g:4160:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= Comma ( (otherlv_3= RULE_ID ) ) )* otherlv_4= EqualsSign (
					// (lv_expr_5_0= ruleExpr ) ) otherlv_6= Semicolon )
					// InternalAgreeParser.g:4160:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= Comma ( (otherlv_3= RULE_ID ) ) )* otherlv_4= EqualsSign (
					// (lv_expr_5_0= ruleExpr ) ) otherlv_6= Semicolon
					{
						// InternalAgreeParser.g:4160:3: ()
						// InternalAgreeParser.g:4161:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getNodeStmtAccess().getNodeEqAction_0_0(), current);

							}

						}

						// InternalAgreeParser.g:4166:2: ( (otherlv_1= RULE_ID ) )
						// InternalAgreeParser.g:4167:1: (otherlv_1= RULE_ID )
						{
							// InternalAgreeParser.g:4167:1: (otherlv_1= RULE_ID )
							// InternalAgreeParser.g:4168:3: otherlv_1= RULE_ID
							{
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getNodeStmtRule());
									}

								}
								otherlv_1 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_61);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_1,
											grammarAccess.getNodeStmtAccess().getLhsArgCrossReference_0_1_0());

								}

							}

						}

						// InternalAgreeParser.g:4179:2: (otherlv_2= Comma ( (otherlv_3= RULE_ID ) ) )*
						loop53: do {
							int alt53 = 2;
							int LA53_0 = input.LA(1);

							if ((LA53_0 == Comma)) {
								alt53 = 1;
							}

							switch (alt53) {
							case 1:
							// InternalAgreeParser.g:4180:2: otherlv_2= Comma ( (otherlv_3= RULE_ID ) )
							{
								otherlv_2 = (Token) match(input, Comma, FollowSets000.FOLLOW_11);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_2, grammarAccess.getNodeStmtAccess().getCommaKeyword_0_2_0());

								}
								// InternalAgreeParser.g:4184:1: ( (otherlv_3= RULE_ID ) )
								// InternalAgreeParser.g:4185:1: (otherlv_3= RULE_ID )
								{
									// InternalAgreeParser.g:4185:1: (otherlv_3= RULE_ID )
									// InternalAgreeParser.g:4186:3: otherlv_3= RULE_ID
									{
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElement(grammarAccess.getNodeStmtRule());
											}

										}
										otherlv_3 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_61);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(otherlv_3, grammarAccess.getNodeStmtAccess()
													.getLhsArgCrossReference_0_2_1_0());

										}

									}

								}

							}
								break;

							default:
								break loop53;
							}
						} while (true);

						otherlv_4 = (Token) match(input, EqualsSign, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_4, grammarAccess.getNodeStmtAccess().getEqualsSignKeyword_0_3());

						}
						// InternalAgreeParser.g:4202:1: ( (lv_expr_5_0= ruleExpr ) )
						// InternalAgreeParser.g:4203:1: (lv_expr_5_0= ruleExpr )
						{
							// InternalAgreeParser.g:4203:1: (lv_expr_5_0= ruleExpr )
							// InternalAgreeParser.g:4204:3: lv_expr_5_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getNodeStmtAccess().getExprExprParserRuleCall_0_4_0());

								}
								pushFollow(FollowSets000.FOLLOW_7);
								lv_expr_5_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getNodeStmtRule());
									}
									set(current, "expr", lv_expr_5_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_6 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_6, grammarAccess.getNodeStmtAccess().getSemicolonKeyword_0_5());

						}

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:4226:6: ( () otherlv_8= Lemma ( (lv_str_9_0= RULE_STRING ) ) otherlv_10= Colon ( (lv_expr_11_0= ruleExpr ) )
				// otherlv_12= Semicolon )
				{
					// InternalAgreeParser.g:4226:6: ( () otherlv_8= Lemma ( (lv_str_9_0= RULE_STRING ) ) otherlv_10= Colon ( (lv_expr_11_0= ruleExpr ) )
					// otherlv_12= Semicolon )
					// InternalAgreeParser.g:4226:7: () otherlv_8= Lemma ( (lv_str_9_0= RULE_STRING ) ) otherlv_10= Colon ( (lv_expr_11_0= ruleExpr ) )
					// otherlv_12= Semicolon
					{
						// InternalAgreeParser.g:4226:7: ()
						// InternalAgreeParser.g:4227:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getNodeStmtAccess().getNodeLemmaAction_1_0(), current);

							}

						}

						otherlv_8 = (Token) match(input, Lemma, FollowSets000.FOLLOW_4);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_8, grammarAccess.getNodeStmtAccess().getLemmaKeyword_1_1());

						}
						// InternalAgreeParser.g:4237:1: ( (lv_str_9_0= RULE_STRING ) )
						// InternalAgreeParser.g:4238:1: (lv_str_9_0= RULE_STRING )
						{
							// InternalAgreeParser.g:4238:1: (lv_str_9_0= RULE_STRING )
							// InternalAgreeParser.g:4239:3: lv_str_9_0= RULE_STRING
							{
								lv_str_9_0 = (Token) match(input, RULE_STRING, FollowSets000.FOLLOW_5);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(lv_str_9_0,
											grammarAccess.getNodeStmtAccess().getStrSTRINGTerminalRuleCall_1_2_0());

								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getNodeStmtRule());
									}
									setWithLastConsumed(current, "str", lv_str_9_0,
											"org.osate.xtext.aadl2.properties.Properties.STRING");

								}

							}

						}

						otherlv_10 = (Token) match(input, Colon, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_10, grammarAccess.getNodeStmtAccess().getColonKeyword_1_3());

						}
						// InternalAgreeParser.g:4260:1: ( (lv_expr_11_0= ruleExpr ) )
						// InternalAgreeParser.g:4261:1: (lv_expr_11_0= ruleExpr )
						{
							// InternalAgreeParser.g:4261:1: (lv_expr_11_0= ruleExpr )
							// InternalAgreeParser.g:4262:3: lv_expr_11_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getNodeStmtAccess().getExprExprParserRuleCall_1_4_0());

								}
								pushFollow(FollowSets000.FOLLOW_7);
								lv_expr_11_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getNodeStmtRule());
									}
									set(current, "expr", lv_expr_11_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_12 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_12, grammarAccess.getNodeStmtAccess().getSemicolonKeyword_1_5());

						}

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleNodeStmt"

	// $ANTLR start "entryRuleArg"
	// InternalAgreeParser.g:4291:1: entryRuleArg returns [EObject current=null] : iv_ruleArg= ruleArg EOF ;
	public final EObject entryRuleArg() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleArg = null;

		try {
			// InternalAgreeParser.g:4292:2: (iv_ruleArg= ruleArg EOF )
			// InternalAgreeParser.g:4293:2: iv_ruleArg= ruleArg EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getArgRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleArg = ruleArg();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleArg;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleArg"

	// $ANTLR start "ruleArg"
	// InternalAgreeParser.g:4300:1: ruleArg returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) ) ;
	public final EObject ruleArg() throws RecognitionException {
		EObject current = null;

		Token lv_name_0_0 = null;
		Token otherlv_1 = null;
		EObject lv_type_2_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:4303:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) ) )
			// InternalAgreeParser.g:4304:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) )
			{
				// InternalAgreeParser.g:4304:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) )
				// InternalAgreeParser.g:4304:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) )
				{
					// InternalAgreeParser.g:4304:2: ( (lv_name_0_0= RULE_ID ) )
					// InternalAgreeParser.g:4305:1: (lv_name_0_0= RULE_ID )
					{
						// InternalAgreeParser.g:4305:1: (lv_name_0_0= RULE_ID )
						// InternalAgreeParser.g:4306:3: lv_name_0_0= RULE_ID
						{
							lv_name_0_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_5);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(lv_name_0_0, grammarAccess.getArgAccess().getNameIDTerminalRuleCall_0_0());

							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getArgRule());
								}
								setWithLastConsumed(current, "name", lv_name_0_0,
										"org.osate.xtext.aadl2.properties.Properties.ID");

							}

						}

					}

					otherlv_1 = (Token) match(input, Colon, FollowSets000.FOLLOW_10);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_1, grammarAccess.getArgAccess().getColonKeyword_1());

					}
					// InternalAgreeParser.g:4327:1: ( (lv_type_2_0= ruleType ) )
					// InternalAgreeParser.g:4328:1: (lv_type_2_0= ruleType )
					{
						// InternalAgreeParser.g:4328:1: (lv_type_2_0= ruleType )
						// InternalAgreeParser.g:4329:3: lv_type_2_0= ruleType
						{
							if (state.backtracking == 0) {

								newCompositeNode(grammarAccess.getArgAccess().getTypeTypeParserRuleCall_2_0());

							}
							pushFollow(FollowSets000.FOLLOW_2);
							lv_type_2_0 = ruleType();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getArgRule());
								}
								set(current, "type", lv_type_2_0, "com.rockwellcollins.atc.agree.Agree.Type");
								afterParserOrEnumRuleCall();

							}

						}

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleArg"

	// $ANTLR start "entryRuleType"
	// InternalAgreeParser.g:4353:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
	public final EObject entryRuleType() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleType = null;

		try {
			// InternalAgreeParser.g:4354:2: (iv_ruleType= ruleType EOF )
			// InternalAgreeParser.g:4355:2: iv_ruleType= ruleType EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getTypeRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleType = ruleType();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleType;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleType"

	// $ANTLR start "ruleType"
	// InternalAgreeParser.g:4362:1: ruleType returns [EObject current=null] : ( ( () ( (lv_string_1_0= ruleprimTypes ) ) (otherlv_2= LeftSquareBracket (
	// (lv_lowNeg_3_0= HyphenMinus ) )? ( ( (lv_rangeLow_4_1= RULE_INTEGER_LIT | lv_rangeLow_4_2= RULE_REAL_LIT ) ) ) otherlv_5= Comma ( (lv_highNeg_6_0=
	// HyphenMinus ) )? ( ( (lv_rangeHigh_7_1= RULE_INTEGER_LIT | lv_rangeHigh_7_2= RULE_REAL_LIT ) ) ) otherlv_8= RightSquareBracket )? ) | ( () (
	// (lv_record_10_0= ruleNestedDotID ) ) ) ) ;
	public final EObject ruleType() throws RecognitionException {
		EObject current = null;

		Token otherlv_2 = null;
		Token lv_lowNeg_3_0 = null;
		Token lv_rangeLow_4_1 = null;
		Token lv_rangeLow_4_2 = null;
		Token otherlv_5 = null;
		Token lv_highNeg_6_0 = null;
		Token lv_rangeHigh_7_1 = null;
		Token lv_rangeHigh_7_2 = null;
		Token otherlv_8 = null;
		AntlrDatatypeRuleToken lv_string_1_0 = null;

		EObject lv_record_10_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:4365:28: ( ( ( () ( (lv_string_1_0= ruleprimTypes ) ) (otherlv_2= LeftSquareBracket ( (lv_lowNeg_3_0= HyphenMinus ) )? ( (
			// (lv_rangeLow_4_1= RULE_INTEGER_LIT | lv_rangeLow_4_2= RULE_REAL_LIT ) ) ) otherlv_5= Comma ( (lv_highNeg_6_0= HyphenMinus ) )? ( (
			// (lv_rangeHigh_7_1= RULE_INTEGER_LIT | lv_rangeHigh_7_2= RULE_REAL_LIT ) ) ) otherlv_8= RightSquareBracket )? ) | ( () ( (lv_record_10_0=
			// ruleNestedDotID ) ) ) ) )
			// InternalAgreeParser.g:4366:1: ( ( () ( (lv_string_1_0= ruleprimTypes ) ) (otherlv_2= LeftSquareBracket ( (lv_lowNeg_3_0= HyphenMinus ) )? ( (
			// (lv_rangeLow_4_1= RULE_INTEGER_LIT | lv_rangeLow_4_2= RULE_REAL_LIT ) ) ) otherlv_5= Comma ( (lv_highNeg_6_0= HyphenMinus ) )? ( (
			// (lv_rangeHigh_7_1= RULE_INTEGER_LIT | lv_rangeHigh_7_2= RULE_REAL_LIT ) ) ) otherlv_8= RightSquareBracket )? ) | ( () ( (lv_record_10_0=
			// ruleNestedDotID ) ) ) )
			{
				// InternalAgreeParser.g:4366:1: ( ( () ( (lv_string_1_0= ruleprimTypes ) ) (otherlv_2= LeftSquareBracket ( (lv_lowNeg_3_0= HyphenMinus ) )? ( (
				// (lv_rangeLow_4_1= RULE_INTEGER_LIT | lv_rangeLow_4_2= RULE_REAL_LIT ) ) ) otherlv_5= Comma ( (lv_highNeg_6_0= HyphenMinus ) )? ( (
				// (lv_rangeHigh_7_1= RULE_INTEGER_LIT | lv_rangeHigh_7_2= RULE_REAL_LIT ) ) ) otherlv_8= RightSquareBracket )? ) | ( () ( (lv_record_10_0=
				// ruleNestedDotID ) ) ) )
				int alt60 = 2;
				int LA60_0 = input.LA(1);

				if ((LA60_0 == Bool || LA60_0 == Real || LA60_0 == Int)) {
					alt60 = 1;
				} else if ((LA60_0 == RULE_ID)) {
					alt60 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 60, 0, input);

					throw nvae;
				}
				switch (alt60) {
				case 1:
				// InternalAgreeParser.g:4366:2: ( () ( (lv_string_1_0= ruleprimTypes ) ) (otherlv_2= LeftSquareBracket ( (lv_lowNeg_3_0= HyphenMinus ) )? ( (
				// (lv_rangeLow_4_1= RULE_INTEGER_LIT | lv_rangeLow_4_2= RULE_REAL_LIT ) ) ) otherlv_5= Comma ( (lv_highNeg_6_0= HyphenMinus ) )? ( (
				// (lv_rangeHigh_7_1= RULE_INTEGER_LIT | lv_rangeHigh_7_2= RULE_REAL_LIT ) ) ) otherlv_8= RightSquareBracket )? )
				{
					// InternalAgreeParser.g:4366:2: ( () ( (lv_string_1_0= ruleprimTypes ) ) (otherlv_2= LeftSquareBracket ( (lv_lowNeg_3_0= HyphenMinus ) )? (
					// ( (lv_rangeLow_4_1= RULE_INTEGER_LIT | lv_rangeLow_4_2= RULE_REAL_LIT ) ) ) otherlv_5= Comma ( (lv_highNeg_6_0= HyphenMinus ) )? ( (
					// (lv_rangeHigh_7_1= RULE_INTEGER_LIT | lv_rangeHigh_7_2= RULE_REAL_LIT ) ) ) otherlv_8= RightSquareBracket )? )
					// InternalAgreeParser.g:4366:3: () ( (lv_string_1_0= ruleprimTypes ) ) (otherlv_2= LeftSquareBracket ( (lv_lowNeg_3_0= HyphenMinus ) )? ( (
					// (lv_rangeLow_4_1= RULE_INTEGER_LIT | lv_rangeLow_4_2= RULE_REAL_LIT ) ) ) otherlv_5= Comma ( (lv_highNeg_6_0= HyphenMinus ) )? ( (
					// (lv_rangeHigh_7_1= RULE_INTEGER_LIT | lv_rangeHigh_7_2= RULE_REAL_LIT ) ) ) otherlv_8= RightSquareBracket )?
					{
						// InternalAgreeParser.g:4366:3: ()
						// InternalAgreeParser.g:4367:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(grammarAccess.getTypeAccess().getPrimTypeAction_0_0(),
										current);

							}

						}

						// InternalAgreeParser.g:4372:2: ( (lv_string_1_0= ruleprimTypes ) )
						// InternalAgreeParser.g:4373:1: (lv_string_1_0= ruleprimTypes )
						{
							// InternalAgreeParser.g:4373:1: (lv_string_1_0= ruleprimTypes )
							// InternalAgreeParser.g:4374:3: lv_string_1_0= ruleprimTypes
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getTypeAccess().getStringPrimTypesParserRuleCall_0_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_62);
								lv_string_1_0 = ruleprimTypes();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getTypeRule());
									}
									set(current, "string", lv_string_1_0,
											"com.rockwellcollins.atc.agree.Agree.primTypes");
									afterParserOrEnumRuleCall();

								}

							}

						}

						// InternalAgreeParser.g:4390:2: (otherlv_2= LeftSquareBracket ( (lv_lowNeg_3_0= HyphenMinus ) )? ( ( (lv_rangeLow_4_1= RULE_INTEGER_LIT
						// | lv_rangeLow_4_2= RULE_REAL_LIT ) ) ) otherlv_5= Comma ( (lv_highNeg_6_0= HyphenMinus ) )? ( ( (lv_rangeHigh_7_1= RULE_INTEGER_LIT |
						// lv_rangeHigh_7_2= RULE_REAL_LIT ) ) ) otherlv_8= RightSquareBracket )?
						int alt59 = 2;
						int LA59_0 = input.LA(1);

						if ((LA59_0 == LeftSquareBracket)) {
							alt59 = 1;
						}
						switch (alt59) {
						case 1:
						// InternalAgreeParser.g:4391:2: otherlv_2= LeftSquareBracket ( (lv_lowNeg_3_0= HyphenMinus ) )? ( ( (lv_rangeLow_4_1= RULE_INTEGER_LIT
						// | lv_rangeLow_4_2= RULE_REAL_LIT ) ) ) otherlv_5= Comma ( (lv_highNeg_6_0= HyphenMinus ) )? ( ( (lv_rangeHigh_7_1= RULE_INTEGER_LIT |
						// lv_rangeHigh_7_2= RULE_REAL_LIT ) ) ) otherlv_8= RightSquareBracket
						{
							otherlv_2 = (Token) match(input, LeftSquareBracket, FollowSets000.FOLLOW_63);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_2,
										grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_0_2_0());

							}
							// InternalAgreeParser.g:4395:1: ( (lv_lowNeg_3_0= HyphenMinus ) )?
							int alt55 = 2;
							int LA55_0 = input.LA(1);

							if ((LA55_0 == HyphenMinus)) {
								alt55 = 1;
							}
							switch (alt55) {
							case 1:
							// InternalAgreeParser.g:4396:1: (lv_lowNeg_3_0= HyphenMinus )
							{
								// InternalAgreeParser.g:4396:1: (lv_lowNeg_3_0= HyphenMinus )
								// InternalAgreeParser.g:4397:3: lv_lowNeg_3_0= HyphenMinus
								{
									lv_lowNeg_3_0 = (Token) match(input, HyphenMinus, FollowSets000.FOLLOW_64);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(lv_lowNeg_3_0,
												grammarAccess.getTypeAccess().getLowNegHyphenMinusKeyword_0_2_1_0());

									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElement(grammarAccess.getTypeRule());
										}
										setWithLastConsumed(current, "lowNeg", lv_lowNeg_3_0, "-");

									}

								}

							}
								break;

							}

							// InternalAgreeParser.g:4411:3: ( ( (lv_rangeLow_4_1= RULE_INTEGER_LIT | lv_rangeLow_4_2= RULE_REAL_LIT ) ) )
							// InternalAgreeParser.g:4412:1: ( (lv_rangeLow_4_1= RULE_INTEGER_LIT | lv_rangeLow_4_2= RULE_REAL_LIT ) )
							{
								// InternalAgreeParser.g:4412:1: ( (lv_rangeLow_4_1= RULE_INTEGER_LIT | lv_rangeLow_4_2= RULE_REAL_LIT ) )
								// InternalAgreeParser.g:4413:1: (lv_rangeLow_4_1= RULE_INTEGER_LIT | lv_rangeLow_4_2= RULE_REAL_LIT )
								{
									// InternalAgreeParser.g:4413:1: (lv_rangeLow_4_1= RULE_INTEGER_LIT | lv_rangeLow_4_2= RULE_REAL_LIT )
									int alt56 = 2;
									int LA56_0 = input.LA(1);

									if ((LA56_0 == RULE_INTEGER_LIT)) {
										alt56 = 1;
									} else if ((LA56_0 == RULE_REAL_LIT)) {
										alt56 = 2;
									} else {
										if (state.backtracking > 0) {
											state.failed = true;
											return current;
										}
										NoViableAltException nvae = new NoViableAltException("", 56, 0, input);

										throw nvae;
									}
									switch (alt56) {
									case 1:
									// InternalAgreeParser.g:4414:3: lv_rangeLow_4_1= RULE_INTEGER_LIT
									{
										lv_rangeLow_4_1 = (Token) match(input, RULE_INTEGER_LIT,
												FollowSets000.FOLLOW_34);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(lv_rangeLow_4_1, grammarAccess.getTypeAccess()
													.getRangeLowINTEGER_LITTerminalRuleCall_0_2_2_0_0());

										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElement(grammarAccess.getTypeRule());
											}
											setWithLastConsumed(current, "rangeLow", lv_rangeLow_4_1,
													"org.osate.xtext.aadl2.properties.Properties.INTEGER_LIT");

										}

									}
										break;
									case 2:
									// InternalAgreeParser.g:4429:8: lv_rangeLow_4_2= RULE_REAL_LIT
									{
										lv_rangeLow_4_2 = (Token) match(input, RULE_REAL_LIT, FollowSets000.FOLLOW_34);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(lv_rangeLow_4_2, grammarAccess.getTypeAccess()
													.getRangeLowREAL_LITTerminalRuleCall_0_2_2_0_1());

										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElement(grammarAccess.getTypeRule());
											}
											setWithLastConsumed(current, "rangeLow", lv_rangeLow_4_2,
													"org.osate.xtext.aadl2.properties.Properties.REAL_LIT");

										}

									}
										break;

									}

								}

							}

							otherlv_5 = (Token) match(input, Comma, FollowSets000.FOLLOW_63);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getCommaKeyword_0_2_3());

							}
							// InternalAgreeParser.g:4452:1: ( (lv_highNeg_6_0= HyphenMinus ) )?
							int alt57 = 2;
							int LA57_0 = input.LA(1);

							if ((LA57_0 == HyphenMinus)) {
								alt57 = 1;
							}
							switch (alt57) {
							case 1:
							// InternalAgreeParser.g:4453:1: (lv_highNeg_6_0= HyphenMinus )
							{
								// InternalAgreeParser.g:4453:1: (lv_highNeg_6_0= HyphenMinus )
								// InternalAgreeParser.g:4454:3: lv_highNeg_6_0= HyphenMinus
								{
									lv_highNeg_6_0 = (Token) match(input, HyphenMinus, FollowSets000.FOLLOW_64);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(lv_highNeg_6_0,
												grammarAccess.getTypeAccess().getHighNegHyphenMinusKeyword_0_2_4_0());

									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElement(grammarAccess.getTypeRule());
										}
										setWithLastConsumed(current, "highNeg", lv_highNeg_6_0, "-");

									}

								}

							}
								break;

							}

							// InternalAgreeParser.g:4468:3: ( ( (lv_rangeHigh_7_1= RULE_INTEGER_LIT | lv_rangeHigh_7_2= RULE_REAL_LIT ) ) )
							// InternalAgreeParser.g:4469:1: ( (lv_rangeHigh_7_1= RULE_INTEGER_LIT | lv_rangeHigh_7_2= RULE_REAL_LIT ) )
							{
								// InternalAgreeParser.g:4469:1: ( (lv_rangeHigh_7_1= RULE_INTEGER_LIT | lv_rangeHigh_7_2= RULE_REAL_LIT ) )
								// InternalAgreeParser.g:4470:1: (lv_rangeHigh_7_1= RULE_INTEGER_LIT | lv_rangeHigh_7_2= RULE_REAL_LIT )
								{
									// InternalAgreeParser.g:4470:1: (lv_rangeHigh_7_1= RULE_INTEGER_LIT | lv_rangeHigh_7_2= RULE_REAL_LIT )
									int alt58 = 2;
									int LA58_0 = input.LA(1);

									if ((LA58_0 == RULE_INTEGER_LIT)) {
										alt58 = 1;
									} else if ((LA58_0 == RULE_REAL_LIT)) {
										alt58 = 2;
									} else {
										if (state.backtracking > 0) {
											state.failed = true;
											return current;
										}
										NoViableAltException nvae = new NoViableAltException("", 58, 0, input);

										throw nvae;
									}
									switch (alt58) {
									case 1:
									// InternalAgreeParser.g:4471:3: lv_rangeHigh_7_1= RULE_INTEGER_LIT
									{
										lv_rangeHigh_7_1 = (Token) match(input, RULE_INTEGER_LIT,
												FollowSets000.FOLLOW_35);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(lv_rangeHigh_7_1, grammarAccess.getTypeAccess()
													.getRangeHighINTEGER_LITTerminalRuleCall_0_2_5_0_0());

										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElement(grammarAccess.getTypeRule());
											}
											setWithLastConsumed(current, "rangeHigh", lv_rangeHigh_7_1,
													"org.osate.xtext.aadl2.properties.Properties.INTEGER_LIT");

										}

									}
										break;
									case 2:
									// InternalAgreeParser.g:4486:8: lv_rangeHigh_7_2= RULE_REAL_LIT
									{
										lv_rangeHigh_7_2 = (Token) match(input, RULE_REAL_LIT, FollowSets000.FOLLOW_35);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(lv_rangeHigh_7_2, grammarAccess.getTypeAccess()
													.getRangeHighREAL_LITTerminalRuleCall_0_2_5_0_1());

										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElement(grammarAccess.getTypeRule());
											}
											setWithLastConsumed(current, "rangeHigh", lv_rangeHigh_7_2,
													"org.osate.xtext.aadl2.properties.Properties.REAL_LIT");

										}

									}
										break;

									}

								}

							}

							otherlv_8 = (Token) match(input, RightSquareBracket, FollowSets000.FOLLOW_2);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_8,
										grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_2_6());

							}

						}
							break;

						}

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:4510:6: ( () ( (lv_record_10_0= ruleNestedDotID ) ) )
				{
					// InternalAgreeParser.g:4510:6: ( () ( (lv_record_10_0= ruleNestedDotID ) ) )
					// InternalAgreeParser.g:4510:7: () ( (lv_record_10_0= ruleNestedDotID ) )
					{
						// InternalAgreeParser.g:4510:7: ()
						// InternalAgreeParser.g:4511:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getTypeAccess().getRecordTypeAction_1_0(), current);

							}

						}

						// InternalAgreeParser.g:4516:2: ( (lv_record_10_0= ruleNestedDotID ) )
						// InternalAgreeParser.g:4517:1: (lv_record_10_0= ruleNestedDotID )
						{
							// InternalAgreeParser.g:4517:1: (lv_record_10_0= ruleNestedDotID )
							// InternalAgreeParser.g:4518:3: lv_record_10_0= ruleNestedDotID
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getTypeAccess().getRecordNestedDotIDParserRuleCall_1_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_2);
								lv_record_10_0 = ruleNestedDotID();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getTypeRule());
									}
									set(current, "record", lv_record_10_0,
											"com.rockwellcollins.atc.agree.Agree.NestedDotID");
									afterParserOrEnumRuleCall();

								}

							}

						}

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleType"

	// $ANTLR start "entryRuleprimTypes"
	// InternalAgreeParser.g:4542:1: entryRuleprimTypes returns [String current=null] : iv_ruleprimTypes= ruleprimTypes EOF ;
	public final String entryRuleprimTypes() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_ruleprimTypes = null;

		try {
			// InternalAgreeParser.g:4543:1: (iv_ruleprimTypes= ruleprimTypes EOF )
			// InternalAgreeParser.g:4544:2: iv_ruleprimTypes= ruleprimTypes EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getPrimTypesRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleprimTypes = ruleprimTypes();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleprimTypes.getText();
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleprimTypes"

	// $ANTLR start "ruleprimTypes"
	// InternalAgreeParser.g:4551:1: ruleprimTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Real | kw= Bool | kw= Int ) ;
	public final AntlrDatatypeRuleToken ruleprimTypes() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token kw = null;

		enterRule();

		try {
			// InternalAgreeParser.g:4555:6: ( (kw= Real | kw= Bool | kw= Int ) )
			// InternalAgreeParser.g:4556:1: (kw= Real | kw= Bool | kw= Int )
			{
				// InternalAgreeParser.g:4556:1: (kw= Real | kw= Bool | kw= Int )
				int alt61 = 3;
				switch (input.LA(1)) {
				case Real: {
					alt61 = 1;
				}
					break;
				case Bool: {
					alt61 = 2;
				}
					break;
				case Int: {
					alt61 = 3;
				}
					break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 61, 0, input);

					throw nvae;
				}

				switch (alt61) {
				case 1:
				// InternalAgreeParser.g:4557:2: kw= Real
				{
					kw = (Token) match(input, Real, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getPrimTypesAccess().getRealKeyword_0());

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:4564:2: kw= Bool
				{
					kw = (Token) match(input, Bool, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getPrimTypesAccess().getBoolKeyword_1());

					}

				}
					break;
				case 3:
				// InternalAgreeParser.g:4571:2: kw= Int
				{
					kw = (Token) match(input, Int, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getPrimTypesAccess().getIntKeyword_2());

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();

			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleprimTypes"

	// $ANTLR start "entryRuleRecordDefExpr"
	// InternalAgreeParser.g:4584:1: entryRuleRecordDefExpr returns [EObject current=null] : iv_ruleRecordDefExpr= ruleRecordDefExpr EOF ;
	public final EObject entryRuleRecordDefExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleRecordDefExpr = null;

		try {
			// InternalAgreeParser.g:4585:2: (iv_ruleRecordDefExpr= ruleRecordDefExpr EOF )
			// InternalAgreeParser.g:4586:2: iv_ruleRecordDefExpr= ruleRecordDefExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getRecordDefExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleRecordDefExpr = ruleRecordDefExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleRecordDefExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleRecordDefExpr"

	// $ANTLR start "ruleRecordDefExpr"
	// InternalAgreeParser.g:4593:1: ruleRecordDefExpr returns [EObject current=null] : (otherlv_0= Type ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign
	// otherlv_3= Struct otherlv_4= LeftCurlyBracket ( ( (lv_args_5_0= ruleArg ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleArg ) ) )* ) otherlv_8=
	// RightCurlyBracket otherlv_9= Semicolon ) ;
	public final EObject ruleRecordDefExpr() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_name_1_0 = null;
		Token otherlv_2 = null;
		Token otherlv_3 = null;
		Token otherlv_4 = null;
		Token otherlv_6 = null;
		Token otherlv_8 = null;
		Token otherlv_9 = null;
		EObject lv_args_5_0 = null;

		EObject lv_args_7_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:4596:28: ( (otherlv_0= Type ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign otherlv_3= Struct otherlv_4= LeftCurlyBracket
			// ( ( (lv_args_5_0= ruleArg ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleArg ) ) )* ) otherlv_8= RightCurlyBracket otherlv_9= Semicolon ) )
			// InternalAgreeParser.g:4597:1: (otherlv_0= Type ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign otherlv_3= Struct otherlv_4= LeftCurlyBracket (
			// ( (lv_args_5_0= ruleArg ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleArg ) ) )* ) otherlv_8= RightCurlyBracket otherlv_9= Semicolon )
			{
				// InternalAgreeParser.g:4597:1: (otherlv_0= Type ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign otherlv_3= Struct otherlv_4=
				// LeftCurlyBracket ( ( (lv_args_5_0= ruleArg ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleArg ) ) )* ) otherlv_8= RightCurlyBracket otherlv_9=
				// Semicolon )
				// InternalAgreeParser.g:4598:2: otherlv_0= Type ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign otherlv_3= Struct otherlv_4= LeftCurlyBracket
				// ( ( (lv_args_5_0= ruleArg ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleArg ) ) )* ) otherlv_8= RightCurlyBracket otherlv_9= Semicolon
				{
					otherlv_0 = (Token) match(input, Type, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_0, grammarAccess.getRecordDefExprAccess().getTypeKeyword_0());

					}
					// InternalAgreeParser.g:4602:1: ( (lv_name_1_0= RULE_ID ) )
					// InternalAgreeParser.g:4603:1: (lv_name_1_0= RULE_ID )
					{
						// InternalAgreeParser.g:4603:1: (lv_name_1_0= RULE_ID )
						// InternalAgreeParser.g:4604:3: lv_name_1_0= RULE_ID
						{
							lv_name_1_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_44);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(lv_name_1_0,
										grammarAccess.getRecordDefExprAccess().getNameIDTerminalRuleCall_1_0());

							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getRecordDefExprRule());
								}
								setWithLastConsumed(current, "name", lv_name_1_0,
										"org.osate.xtext.aadl2.properties.Properties.ID");

							}

						}

					}

					otherlv_2 = (Token) match(input, EqualsSign, FollowSets000.FOLLOW_65);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_2, grammarAccess.getRecordDefExprAccess().getEqualsSignKeyword_2());

					}
					otherlv_3 = (Token) match(input, Struct, FollowSets000.FOLLOW_45);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_3, grammarAccess.getRecordDefExprAccess().getStructKeyword_3());

					}
					otherlv_4 = (Token) match(input, LeftCurlyBracket, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_4, grammarAccess.getRecordDefExprAccess().getLeftCurlyBracketKeyword_4());

					}
					// InternalAgreeParser.g:4635:1: ( ( (lv_args_5_0= ruleArg ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleArg ) ) )* )
					// InternalAgreeParser.g:4635:2: ( (lv_args_5_0= ruleArg ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleArg ) ) )*
					{
						// InternalAgreeParser.g:4635:2: ( (lv_args_5_0= ruleArg ) )
						// InternalAgreeParser.g:4636:1: (lv_args_5_0= ruleArg )
						{
							// InternalAgreeParser.g:4636:1: (lv_args_5_0= ruleArg )
							// InternalAgreeParser.g:4637:3: lv_args_5_0= ruleArg
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getRecordDefExprAccess().getArgsArgParserRuleCall_5_0_0());

								}
								pushFollow(FollowSets000.FOLLOW_46);
								lv_args_5_0 = ruleArg();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getRecordDefExprRule());
									}
									add(current, "args", lv_args_5_0, "com.rockwellcollins.atc.agree.Agree.Arg");
									afterParserOrEnumRuleCall();

								}

							}

						}

						// InternalAgreeParser.g:4653:2: (otherlv_6= Comma ( (lv_args_7_0= ruleArg ) ) )*
						loop62: do {
							int alt62 = 2;
							int LA62_0 = input.LA(1);

							if ((LA62_0 == Comma)) {
								alt62 = 1;
							}

							switch (alt62) {
							case 1:
							// InternalAgreeParser.g:4654:2: otherlv_6= Comma ( (lv_args_7_0= ruleArg ) )
							{
								otherlv_6 = (Token) match(input, Comma, FollowSets000.FOLLOW_11);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_6,
											grammarAccess.getRecordDefExprAccess().getCommaKeyword_5_1_0());

								}
								// InternalAgreeParser.g:4658:1: ( (lv_args_7_0= ruleArg ) )
								// InternalAgreeParser.g:4659:1: (lv_args_7_0= ruleArg )
								{
									// InternalAgreeParser.g:4659:1: (lv_args_7_0= ruleArg )
									// InternalAgreeParser.g:4660:3: lv_args_7_0= ruleArg
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getRecordDefExprAccess()
													.getArgsArgParserRuleCall_5_1_1_0());

										}
										pushFollow(FollowSets000.FOLLOW_46);
										lv_args_7_0 = ruleArg();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getRecordDefExprRule());
											}
											add(current, "args", lv_args_7_0,
													"com.rockwellcollins.atc.agree.Agree.Arg");
											afterParserOrEnumRuleCall();

										}

									}

								}

							}
								break;

							default:
								break loop62;
							}
						} while (true);

					}

					otherlv_8 = (Token) match(input, RightCurlyBracket, FollowSets000.FOLLOW_7);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_8, grammarAccess.getRecordDefExprAccess().getRightCurlyBracketKeyword_6());

					}
					otherlv_9 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_9, grammarAccess.getRecordDefExprAccess().getSemicolonKeyword_7());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleRecordDefExpr"

	// $ANTLR start "entryRuleExpr"
	// InternalAgreeParser.g:4694:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
	public final EObject entryRuleExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleExpr = null;

		try {
			// InternalAgreeParser.g:4695:2: (iv_ruleExpr= ruleExpr EOF )
			// InternalAgreeParser.g:4696:2: iv_ruleExpr= ruleExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleExpr = ruleExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleExpr"

	// $ANTLR start "ruleExpr"
	// InternalAgreeParser.g:4703:1: ruleExpr returns [EObject current=null] : this_ArrowExpr_0= ruleArrowExpr ;
	public final EObject ruleExpr() throws RecognitionException {
		EObject current = null;

		EObject this_ArrowExpr_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:4706:28: (this_ArrowExpr_0= ruleArrowExpr )
			// InternalAgreeParser.g:4708:5: this_ArrowExpr_0= ruleArrowExpr
			{
				if (state.backtracking == 0) {

					newCompositeNode(grammarAccess.getExprAccess().getArrowExprParserRuleCall());

				}
				pushFollow(FollowSets000.FOLLOW_2);
				this_ArrowExpr_0 = ruleArrowExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {

					current = this_ArrowExpr_0;
					afterParserOrEnumRuleCall();

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleExpr"

	// $ANTLR start "entryRuleArrowExpr"
	// InternalAgreeParser.g:4724:1: entryRuleArrowExpr returns [EObject current=null] : iv_ruleArrowExpr= ruleArrowExpr EOF ;
	public final EObject entryRuleArrowExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleArrowExpr = null;

		try {
			// InternalAgreeParser.g:4725:2: (iv_ruleArrowExpr= ruleArrowExpr EOF )
			// InternalAgreeParser.g:4726:2: iv_ruleArrowExpr= ruleArrowExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getArrowExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleArrowExpr = ruleArrowExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleArrowExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleArrowExpr"

	// $ANTLR start "ruleArrowExpr"
	// InternalAgreeParser.g:4733:1: ruleArrowExpr returns [EObject current=null] : (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( (
	// HyphenMinusGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= HyphenMinusGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )? ) ;
	public final EObject ruleArrowExpr() throws RecognitionException {
		EObject current = null;

		Token lv_op_2_0 = null;
		EObject this_ImpliesExpr_0 = null;

		EObject lv_right_3_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:4736:28: ( (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( HyphenMinusGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0=
			// HyphenMinusGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )? ) )
			// InternalAgreeParser.g:4737:1: (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( HyphenMinusGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0=
			// HyphenMinusGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )? )
			{
				// InternalAgreeParser.g:4737:1: (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( HyphenMinusGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0=
				// HyphenMinusGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )? )
				// InternalAgreeParser.g:4738:5: this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( HyphenMinusGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0=
				// HyphenMinusGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )?
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getArrowExprAccess().getImpliesExprParserRuleCall_0());

					}
					pushFollow(FollowSets000.FOLLOW_66);
					this_ImpliesExpr_0 = ruleImpliesExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_ImpliesExpr_0;
						afterParserOrEnumRuleCall();

					}
					// InternalAgreeParser.g:4746:1: ( ( ( ( () ( ( HyphenMinusGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= HyphenMinusGreaterThanSign ) ) ) ) (
					// (lv_right_3_0= ruleArrowExpr ) ) )?
					int alt63 = 2;
					int LA63_0 = input.LA(1);

					if ((LA63_0 == HyphenMinusGreaterThanSign)) {
						int LA63_1 = input.LA(2);

						if ((synpred13_InternalAgreeParser())) {
							alt63 = 1;
						}
					}
					switch (alt63) {
					case 1:
					// InternalAgreeParser.g:4746:2: ( ( ( () ( ( HyphenMinusGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= HyphenMinusGreaterThanSign ) ) ) ) (
					// (lv_right_3_0= ruleArrowExpr ) )
					{
						// InternalAgreeParser.g:4746:2: ( ( ( () ( ( HyphenMinusGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= HyphenMinusGreaterThanSign ) ) ) )
						// InternalAgreeParser.g:4746:3: ( ( () ( ( HyphenMinusGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= HyphenMinusGreaterThanSign ) ) )
						{
							// InternalAgreeParser.g:4754:6: ( () ( (lv_op_2_0= HyphenMinusGreaterThanSign ) ) )
							// InternalAgreeParser.g:4754:7: () ( (lv_op_2_0= HyphenMinusGreaterThanSign ) )
							{
								// InternalAgreeParser.g:4754:7: ()
								// InternalAgreeParser.g:4755:5:
								{
									if (state.backtracking == 0) {

										current = forceCreateModelElementAndSet(
												grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0(),
												current);

									}

								}

								// InternalAgreeParser.g:4760:2: ( (lv_op_2_0= HyphenMinusGreaterThanSign ) )
								// InternalAgreeParser.g:4761:1: (lv_op_2_0= HyphenMinusGreaterThanSign )
								{
									// InternalAgreeParser.g:4761:1: (lv_op_2_0= HyphenMinusGreaterThanSign )
									// InternalAgreeParser.g:4762:3: lv_op_2_0= HyphenMinusGreaterThanSign
									{
										lv_op_2_0 = (Token) match(input, HyphenMinusGreaterThanSign,
												FollowSets000.FOLLOW_9);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(lv_op_2_0, grammarAccess.getArrowExprAccess()
													.getOpHyphenMinusGreaterThanSignKeyword_1_0_0_1_0());

										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElement(grammarAccess.getArrowExprRule());
											}
											setWithLastConsumed(current, "op", lv_op_2_0, "->");

										}

									}

								}

							}

						}

						// InternalAgreeParser.g:4776:4: ( (lv_right_3_0= ruleArrowExpr ) )
						// InternalAgreeParser.g:4777:1: (lv_right_3_0= ruleArrowExpr )
						{
							// InternalAgreeParser.g:4777:1: (lv_right_3_0= ruleArrowExpr )
							// InternalAgreeParser.g:4778:3: lv_right_3_0= ruleArrowExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getArrowExprAccess().getRightArrowExprParserRuleCall_1_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_2);
								lv_right_3_0 = ruleArrowExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getArrowExprRule());
									}
									set(current, "right", lv_right_3_0,
											"com.rockwellcollins.atc.agree.Agree.ArrowExpr");
									afterParserOrEnumRuleCall();

								}

							}

						}

					}
						break;

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleArrowExpr"

	// $ANTLR start "entryRuleImpliesExpr"
	// InternalAgreeParser.g:4802:1: entryRuleImpliesExpr returns [EObject current=null] : iv_ruleImpliesExpr= ruleImpliesExpr EOF ;
	public final EObject entryRuleImpliesExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleImpliesExpr = null;

		try {
			// InternalAgreeParser.g:4803:2: (iv_ruleImpliesExpr= ruleImpliesExpr EOF )
			// InternalAgreeParser.g:4804:2: iv_ruleImpliesExpr= ruleImpliesExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getImpliesExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleImpliesExpr = ruleImpliesExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleImpliesExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleImpliesExpr"

	// $ANTLR start "ruleImpliesExpr"
	// InternalAgreeParser.g:4811:1: ruleImpliesExpr returns [EObject current=null] : (this_EquivExpr_0= ruleEquivExpr ( ( ( ( () ( ( EqualsSignGreaterThanSign
	// ) ) ) )=> ( () ( (lv_op_2_0= EqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? ) ;
	public final EObject ruleImpliesExpr() throws RecognitionException {
		EObject current = null;

		Token lv_op_2_0 = null;
		EObject this_EquivExpr_0 = null;

		EObject lv_right_3_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:4814:28: ( (this_EquivExpr_0= ruleEquivExpr ( ( ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0=
			// EqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? ) )
			// InternalAgreeParser.g:4815:1: (this_EquivExpr_0= ruleEquivExpr ( ( ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0=
			// EqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? )
			{
				// InternalAgreeParser.g:4815:1: (this_EquivExpr_0= ruleEquivExpr ( ( ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0=
				// EqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? )
				// InternalAgreeParser.g:4816:5: this_EquivExpr_0= ruleEquivExpr ( ( ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0=
				// EqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )?
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getImpliesExprAccess().getEquivExprParserRuleCall_0());

					}
					pushFollow(FollowSets000.FOLLOW_67);
					this_EquivExpr_0 = ruleEquivExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_EquivExpr_0;
						afterParserOrEnumRuleCall();

					}
					// InternalAgreeParser.g:4824:1: ( ( ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= EqualsSignGreaterThanSign ) ) ) ) (
					// (lv_right_3_0= ruleImpliesExpr ) ) )?
					int alt64 = 2;
					int LA64_0 = input.LA(1);

					if ((LA64_0 == EqualsSignGreaterThanSign)) {
						int LA64_1 = input.LA(2);

						if ((synpred14_InternalAgreeParser())) {
							alt64 = 1;
						}
					}
					switch (alt64) {
					case 1:
					// InternalAgreeParser.g:4824:2: ( ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= EqualsSignGreaterThanSign ) ) ) ) (
					// (lv_right_3_0= ruleImpliesExpr ) )
					{
						// InternalAgreeParser.g:4824:2: ( ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= EqualsSignGreaterThanSign ) ) ) )
						// InternalAgreeParser.g:4824:3: ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= EqualsSignGreaterThanSign ) ) )
						{
							// InternalAgreeParser.g:4832:6: ( () ( (lv_op_2_0= EqualsSignGreaterThanSign ) ) )
							// InternalAgreeParser.g:4832:7: () ( (lv_op_2_0= EqualsSignGreaterThanSign ) )
							{
								// InternalAgreeParser.g:4832:7: ()
								// InternalAgreeParser.g:4833:5:
								{
									if (state.backtracking == 0) {

										current = forceCreateModelElementAndSet(
												grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0(),
												current);

									}

								}

								// InternalAgreeParser.g:4838:2: ( (lv_op_2_0= EqualsSignGreaterThanSign ) )
								// InternalAgreeParser.g:4839:1: (lv_op_2_0= EqualsSignGreaterThanSign )
								{
									// InternalAgreeParser.g:4839:1: (lv_op_2_0= EqualsSignGreaterThanSign )
									// InternalAgreeParser.g:4840:3: lv_op_2_0= EqualsSignGreaterThanSign
									{
										lv_op_2_0 = (Token) match(input, EqualsSignGreaterThanSign,
												FollowSets000.FOLLOW_9);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(lv_op_2_0, grammarAccess.getImpliesExprAccess()
													.getOpEqualsSignGreaterThanSignKeyword_1_0_0_1_0());

										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElement(grammarAccess.getImpliesExprRule());
											}
											setWithLastConsumed(current, "op", lv_op_2_0, "=>");

										}

									}

								}

							}

						}

						// InternalAgreeParser.g:4854:4: ( (lv_right_3_0= ruleImpliesExpr ) )
						// InternalAgreeParser.g:4855:1: (lv_right_3_0= ruleImpliesExpr )
						{
							// InternalAgreeParser.g:4855:1: (lv_right_3_0= ruleImpliesExpr )
							// InternalAgreeParser.g:4856:3: lv_right_3_0= ruleImpliesExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getImpliesExprAccess()
											.getRightImpliesExprParserRuleCall_1_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_2);
								lv_right_3_0 = ruleImpliesExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getImpliesExprRule());
									}
									set(current, "right", lv_right_3_0,
											"com.rockwellcollins.atc.agree.Agree.ImpliesExpr");
									afterParserOrEnumRuleCall();

								}

							}

						}

					}
						break;

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleImpliesExpr"

	// $ANTLR start "entryRuleEquivExpr"
	// InternalAgreeParser.g:4880:1: entryRuleEquivExpr returns [EObject current=null] : iv_ruleEquivExpr= ruleEquivExpr EOF ;
	public final EObject entryRuleEquivExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleEquivExpr = null;

		try {
			// InternalAgreeParser.g:4881:2: (iv_ruleEquivExpr= ruleEquivExpr EOF )
			// InternalAgreeParser.g:4882:2: iv_ruleEquivExpr= ruleEquivExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getEquivExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleEquivExpr = ruleEquivExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleEquivExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleEquivExpr"

	// $ANTLR start "ruleEquivExpr"
	// InternalAgreeParser.g:4889:1: ruleEquivExpr returns [EObject current=null] : (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( (
	// LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )? ) ;
	public final EObject ruleEquivExpr() throws RecognitionException {
		EObject current = null;

		Token lv_op_2_0 = null;
		EObject this_OrExpr_0 = null;

		EObject lv_right_3_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:4892:28: ( (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0=
			// LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )? ) )
			// InternalAgreeParser.g:4893:1: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0=
			// LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )? )
			{
				// InternalAgreeParser.g:4893:1: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0=
				// LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )? )
				// InternalAgreeParser.g:4894:5: this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0=
				// LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )?
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getEquivExprAccess().getOrExprParserRuleCall_0());

					}
					pushFollow(FollowSets000.FOLLOW_68);
					this_OrExpr_0 = ruleOrExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_OrExpr_0;
						afterParserOrEnumRuleCall();

					}
					// InternalAgreeParser.g:4902:1: ( ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0=
					// LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )?
					int alt65 = 2;
					int LA65_0 = input.LA(1);

					if ((LA65_0 == LessThanSignEqualsSignGreaterThanSign)) {
						int LA65_1 = input.LA(2);

						if ((synpred15_InternalAgreeParser())) {
							alt65 = 1;
						}
					}
					switch (alt65) {
					case 1:
					// InternalAgreeParser.g:4902:2: ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0=
					// LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) )
					{
						// InternalAgreeParser.g:4902:2: ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0=
						// LessThanSignEqualsSignGreaterThanSign ) ) ) )
						// InternalAgreeParser.g:4902:3: ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0=
						// LessThanSignEqualsSignGreaterThanSign ) ) )
						{
							// InternalAgreeParser.g:4910:6: ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) )
							// InternalAgreeParser.g:4910:7: () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) )
							{
								// InternalAgreeParser.g:4910:7: ()
								// InternalAgreeParser.g:4911:5:
								{
									if (state.backtracking == 0) {

										current = forceCreateModelElementAndSet(
												grammarAccess.getEquivExprAccess().getBinaryExprLeftAction_1_0_0_0(),
												current);

									}

								}

								// InternalAgreeParser.g:4916:2: ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) )
								// InternalAgreeParser.g:4917:1: (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign )
								{
									// InternalAgreeParser.g:4917:1: (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign )
									// InternalAgreeParser.g:4918:3: lv_op_2_0= LessThanSignEqualsSignGreaterThanSign
									{
										lv_op_2_0 = (Token) match(input, LessThanSignEqualsSignGreaterThanSign,
												FollowSets000.FOLLOW_9);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(lv_op_2_0, grammarAccess.getEquivExprAccess()
													.getOpLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_1_0());

										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElement(grammarAccess.getEquivExprRule());
											}
											setWithLastConsumed(current, "op", lv_op_2_0, "<=>");

										}

									}

								}

							}

						}

						// InternalAgreeParser.g:4932:4: ( (lv_right_3_0= ruleOrExpr ) )
						// InternalAgreeParser.g:4933:1: (lv_right_3_0= ruleOrExpr )
						{
							// InternalAgreeParser.g:4933:1: (lv_right_3_0= ruleOrExpr )
							// InternalAgreeParser.g:4934:3: lv_right_3_0= ruleOrExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getEquivExprAccess().getRightOrExprParserRuleCall_1_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_2);
								lv_right_3_0 = ruleOrExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getEquivExprRule());
									}
									set(current, "right", lv_right_3_0, "com.rockwellcollins.atc.agree.Agree.OrExpr");
									afterParserOrEnumRuleCall();

								}

							}

						}

					}
						break;

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleEquivExpr"

	// $ANTLR start "entryRuleOrExpr"
	// InternalAgreeParser.g:4958:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
	public final EObject entryRuleOrExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleOrExpr = null;

		try {
			// InternalAgreeParser.g:4959:2: (iv_ruleOrExpr= ruleOrExpr EOF )
			// InternalAgreeParser.g:4960:2: iv_ruleOrExpr= ruleOrExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getOrExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleOrExpr = ruleOrExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleOrExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleOrExpr"

	// $ANTLR start "ruleOrExpr"
	// InternalAgreeParser.g:4967:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or
	// ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
	public final EObject ruleOrExpr() throws RecognitionException {
		EObject current = null;

		Token lv_op_2_0 = null;
		EObject this_AndExpr_0 = null;

		EObject lv_right_3_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:4970:28: ( (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or ) ) ) ) ( (lv_right_3_0=
			// ruleAndExpr ) ) )* ) )
			// InternalAgreeParser.g:4971:1: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpr
			// ) ) )* )
			{
				// InternalAgreeParser.g:4971:1: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or ) ) ) ) ( (lv_right_3_0=
				// ruleAndExpr ) ) )* )
				// InternalAgreeParser.g:4972:5: this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or ) ) ) ) ( (lv_right_3_0=
				// ruleAndExpr ) ) )*
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0());

					}
					pushFollow(FollowSets000.FOLLOW_69);
					this_AndExpr_0 = ruleAndExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_AndExpr_0;
						afterParserOrEnumRuleCall();

					}
					// InternalAgreeParser.g:4980:1: ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
					loop66: do {
						int alt66 = 2;
						int LA66_0 = input.LA(1);

						if ((LA66_0 == Or)) {
							int LA66_2 = input.LA(2);

							if ((synpred16_InternalAgreeParser())) {
								alt66 = 1;
							}

						}

						switch (alt66) {
						case 1:
						// InternalAgreeParser.g:4980:2: ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) )
						{
							// InternalAgreeParser.g:4980:2: ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or ) ) ) )
							// InternalAgreeParser.g:4980:3: ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or ) ) )
							{
								// InternalAgreeParser.g:4988:6: ( () ( (lv_op_2_0= Or ) ) )
								// InternalAgreeParser.g:4988:7: () ( (lv_op_2_0= Or ) )
								{
									// InternalAgreeParser.g:4988:7: ()
									// InternalAgreeParser.g:4989:5:
									{
										if (state.backtracking == 0) {

											current = forceCreateModelElementAndSet(
													grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0(),
													current);

										}

									}

									// InternalAgreeParser.g:4994:2: ( (lv_op_2_0= Or ) )
									// InternalAgreeParser.g:4995:1: (lv_op_2_0= Or )
									{
										// InternalAgreeParser.g:4995:1: (lv_op_2_0= Or )
										// InternalAgreeParser.g:4996:3: lv_op_2_0= Or
										{
											lv_op_2_0 = (Token) match(input, Or, FollowSets000.FOLLOW_9);
											if (state.failed) {
												return current;
											}
											if (state.backtracking == 0) {

												newLeafNode(lv_op_2_0,
														grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_0_1_0());

											}
											if (state.backtracking == 0) {

												if (current == null) {
													current = createModelElement(grammarAccess.getOrExprRule());
												}
												setWithLastConsumed(current, "op", lv_op_2_0, "or");

											}

										}

									}

								}

							}

							// InternalAgreeParser.g:5010:4: ( (lv_right_3_0= ruleAndExpr ) )
							// InternalAgreeParser.g:5011:1: (lv_right_3_0= ruleAndExpr )
							{
								// InternalAgreeParser.g:5011:1: (lv_right_3_0= ruleAndExpr )
								// InternalAgreeParser.g:5012:3: lv_right_3_0= ruleAndExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(
												grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_69);
									lv_right_3_0 = ruleAndExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getOrExprRule());
										}
										set(current, "right", lv_right_3_0,
												"com.rockwellcollins.atc.agree.Agree.AndExpr");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						default:
							break loop66;
						}
					} while (true);

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleOrExpr"

	// $ANTLR start "entryRuleAndExpr"
	// InternalAgreeParser.g:5036:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
	public final EObject entryRuleAndExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleAndExpr = null;

		try {
			// InternalAgreeParser.g:5037:2: (iv_ruleAndExpr= ruleAndExpr EOF )
			// InternalAgreeParser.g:5038:2: iv_ruleAndExpr= ruleAndExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getAndExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleAndExpr = ruleAndExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleAndExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleAndExpr"

	// $ANTLR start "ruleAndExpr"
	// InternalAgreeParser.g:5045:1: ruleAndExpr returns [EObject current=null] : (this_RelateExpr_0= ruleRelateExpr ( ( ( ( () ( ( And ) ) ) )=> ( () (
	// (lv_op_2_0= And ) ) ) ) ( (lv_right_3_0= ruleRelateExpr ) ) )* ) ;
	public final EObject ruleAndExpr() throws RecognitionException {
		EObject current = null;

		Token lv_op_2_0 = null;
		EObject this_RelateExpr_0 = null;

		EObject lv_right_3_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:5048:28: ( (this_RelateExpr_0= ruleRelateExpr ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_op_2_0= And ) ) ) ) ( (lv_right_3_0=
			// ruleRelateExpr ) ) )* ) )
			// InternalAgreeParser.g:5049:1: (this_RelateExpr_0= ruleRelateExpr ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_op_2_0= And ) ) ) ) ( (lv_right_3_0=
			// ruleRelateExpr ) ) )* )
			{
				// InternalAgreeParser.g:5049:1: (this_RelateExpr_0= ruleRelateExpr ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_op_2_0= And ) ) ) ) ( (lv_right_3_0=
				// ruleRelateExpr ) ) )* )
				// InternalAgreeParser.g:5050:5: this_RelateExpr_0= ruleRelateExpr ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_op_2_0= And ) ) ) ) ( (lv_right_3_0=
				// ruleRelateExpr ) ) )*
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getAndExprAccess().getRelateExprParserRuleCall_0());

					}
					pushFollow(FollowSets000.FOLLOW_70);
					this_RelateExpr_0 = ruleRelateExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_RelateExpr_0;
						afterParserOrEnumRuleCall();

					}
					// InternalAgreeParser.g:5058:1: ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_op_2_0= And ) ) ) ) ( (lv_right_3_0= ruleRelateExpr ) ) )*
					loop67: do {
						int alt67 = 2;
						int LA67_0 = input.LA(1);

						if ((LA67_0 == And)) {
							int LA67_2 = input.LA(2);

							if ((synpred17_InternalAgreeParser())) {
								alt67 = 1;
							}

						}

						switch (alt67) {
						case 1:
						// InternalAgreeParser.g:5058:2: ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_op_2_0= And ) ) ) ) ( (lv_right_3_0= ruleRelateExpr ) )
						{
							// InternalAgreeParser.g:5058:2: ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_op_2_0= And ) ) ) )
							// InternalAgreeParser.g:5058:3: ( ( () ( ( And ) ) ) )=> ( () ( (lv_op_2_0= And ) ) )
							{
								// InternalAgreeParser.g:5066:6: ( () ( (lv_op_2_0= And ) ) )
								// InternalAgreeParser.g:5066:7: () ( (lv_op_2_0= And ) )
								{
									// InternalAgreeParser.g:5066:7: ()
									// InternalAgreeParser.g:5067:5:
									{
										if (state.backtracking == 0) {

											current = forceCreateModelElementAndSet(
													grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0(),
													current);

										}

									}

									// InternalAgreeParser.g:5072:2: ( (lv_op_2_0= And ) )
									// InternalAgreeParser.g:5073:1: (lv_op_2_0= And )
									{
										// InternalAgreeParser.g:5073:1: (lv_op_2_0= And )
										// InternalAgreeParser.g:5074:3: lv_op_2_0= And
										{
											lv_op_2_0 = (Token) match(input, And, FollowSets000.FOLLOW_9);
											if (state.failed) {
												return current;
											}
											if (state.backtracking == 0) {

												newLeafNode(lv_op_2_0,
														grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_0_1_0());

											}
											if (state.backtracking == 0) {

												if (current == null) {
													current = createModelElement(grammarAccess.getAndExprRule());
												}
												setWithLastConsumed(current, "op", lv_op_2_0, "and");

											}

										}

									}

								}

							}

							// InternalAgreeParser.g:5088:4: ( (lv_right_3_0= ruleRelateExpr ) )
							// InternalAgreeParser.g:5089:1: (lv_right_3_0= ruleRelateExpr )
							{
								// InternalAgreeParser.g:5089:1: (lv_right_3_0= ruleRelateExpr )
								// InternalAgreeParser.g:5090:3: lv_right_3_0= ruleRelateExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getAndExprAccess()
												.getRightRelateExprParserRuleCall_1_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_70);
									lv_right_3_0 = ruleRelateExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getAndExprRule());
										}
										set(current, "right", lv_right_3_0,
												"com.rockwellcollins.atc.agree.Agree.RelateExpr");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						default:
							break loop67;
						}
					} while (true);

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleAndExpr"

	// $ANTLR start "entryRuleRelateOp"
	// InternalAgreeParser.g:5114:1: entryRuleRelateOp returns [String current=null] : iv_ruleRelateOp= ruleRelateOp EOF ;
	public final String entryRuleRelateOp() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_ruleRelateOp = null;

		try {
			// InternalAgreeParser.g:5115:1: (iv_ruleRelateOp= ruleRelateOp EOF )
			// InternalAgreeParser.g:5116:2: iv_ruleRelateOp= ruleRelateOp EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getRelateOpRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleRelateOp = ruleRelateOp();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleRelateOp.getText();
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleRelateOp"

	// $ANTLR start "ruleRelateOp"
	// InternalAgreeParser.g:5123:1: ruleRelateOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LessThanSign | kw=
	// LessThanSignEqualsSign | kw= GreaterThanSign | kw= GreaterThanSignEqualsSign | kw= EqualsSign | kw= LessThanSignGreaterThanSign | kw=
	// ExclamationMarkEqualsSign ) ;
	public final AntlrDatatypeRuleToken ruleRelateOp() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token kw = null;

		enterRule();

		try {
			// InternalAgreeParser.g:5127:6: ( (kw= LessThanSign | kw= LessThanSignEqualsSign | kw= GreaterThanSign | kw= GreaterThanSignEqualsSign | kw=
			// EqualsSign | kw= LessThanSignGreaterThanSign | kw= ExclamationMarkEqualsSign ) )
			// InternalAgreeParser.g:5128:1: (kw= LessThanSign | kw= LessThanSignEqualsSign | kw= GreaterThanSign | kw= GreaterThanSignEqualsSign | kw=
			// EqualsSign | kw= LessThanSignGreaterThanSign | kw= ExclamationMarkEqualsSign )
			{
				// InternalAgreeParser.g:5128:1: (kw= LessThanSign | kw= LessThanSignEqualsSign | kw= GreaterThanSign | kw= GreaterThanSignEqualsSign | kw=
				// EqualsSign | kw= LessThanSignGreaterThanSign | kw= ExclamationMarkEqualsSign )
				int alt68 = 7;
				switch (input.LA(1)) {
				case LessThanSign: {
					alt68 = 1;
				}
					break;
				case LessThanSignEqualsSign: {
					alt68 = 2;
				}
					break;
				case GreaterThanSign: {
					alt68 = 3;
				}
					break;
				case GreaterThanSignEqualsSign: {
					alt68 = 4;
				}
					break;
				case EqualsSign: {
					alt68 = 5;
				}
					break;
				case LessThanSignGreaterThanSign: {
					alt68 = 6;
				}
					break;
				case ExclamationMarkEqualsSign: {
					alt68 = 7;
				}
					break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 68, 0, input);

					throw nvae;
				}

				switch (alt68) {
				case 1:
				// InternalAgreeParser.g:5129:2: kw= LessThanSign
				{
					kw = (Token) match(input, LessThanSign, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getRelateOpAccess().getLessThanSignKeyword_0());

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:5136:2: kw= LessThanSignEqualsSign
				{
					kw = (Token) match(input, LessThanSignEqualsSign, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getRelateOpAccess().getLessThanSignEqualsSignKeyword_1());

					}

				}
					break;
				case 3:
				// InternalAgreeParser.g:5143:2: kw= GreaterThanSign
				{
					kw = (Token) match(input, GreaterThanSign, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getRelateOpAccess().getGreaterThanSignKeyword_2());

					}

				}
					break;
				case 4:
				// InternalAgreeParser.g:5150:2: kw= GreaterThanSignEqualsSign
				{
					kw = (Token) match(input, GreaterThanSignEqualsSign, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getRelateOpAccess().getGreaterThanSignEqualsSignKeyword_3());

					}

				}
					break;
				case 5:
				// InternalAgreeParser.g:5157:2: kw= EqualsSign
				{
					kw = (Token) match(input, EqualsSign, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getRelateOpAccess().getEqualsSignKeyword_4());

					}

				}
					break;
				case 6:
				// InternalAgreeParser.g:5164:2: kw= LessThanSignGreaterThanSign
				{
					kw = (Token) match(input, LessThanSignGreaterThanSign, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getRelateOpAccess().getLessThanSignGreaterThanSignKeyword_5());

					}

				}
					break;
				case 7:
				// InternalAgreeParser.g:5171:2: kw= ExclamationMarkEqualsSign
				{
					kw = (Token) match(input, ExclamationMarkEqualsSign, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getRelateOpAccess().getExclamationMarkEqualsSignKeyword_6());

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();

			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleRelateOp"

	// $ANTLR start "entryRuleRelateExpr"
	// InternalAgreeParser.g:5184:1: entryRuleRelateExpr returns [EObject current=null] : iv_ruleRelateExpr= ruleRelateExpr EOF ;
	public final EObject entryRuleRelateExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleRelateExpr = null;

		try {
			// InternalAgreeParser.g:5185:2: (iv_ruleRelateExpr= ruleRelateExpr EOF )
			// InternalAgreeParser.g:5186:2: iv_ruleRelateExpr= ruleRelateExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getRelateExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleRelateExpr = ruleRelateExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleRelateExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleRelateExpr"

	// $ANTLR start "ruleRelateExpr"
	// InternalAgreeParser.g:5193:1: ruleRelateExpr returns [EObject current=null] : (this_AddSubExpr_0= ruleAddSubExpr ( ( ( ( () ( ( ruleRelateOp ) ) ) )=> (
	// () ( (lv_op_2_0= ruleRelateOp ) ) ) ) ( (lv_right_3_0= ruleAddSubExpr ) ) )? ) ;
	public final EObject ruleRelateExpr() throws RecognitionException {
		EObject current = null;

		EObject this_AddSubExpr_0 = null;

		AntlrDatatypeRuleToken lv_op_2_0 = null;

		EObject lv_right_3_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:5196:28: ( (this_AddSubExpr_0= ruleAddSubExpr ( ( ( ( () ( ( ruleRelateOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelateOp ) ) ) )
			// ( (lv_right_3_0= ruleAddSubExpr ) ) )? ) )
			// InternalAgreeParser.g:5197:1: (this_AddSubExpr_0= ruleAddSubExpr ( ( ( ( () ( ( ruleRelateOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelateOp ) ) ) ) (
			// (lv_right_3_0= ruleAddSubExpr ) ) )? )
			{
				// InternalAgreeParser.g:5197:1: (this_AddSubExpr_0= ruleAddSubExpr ( ( ( ( () ( ( ruleRelateOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelateOp ) ) )
				// ) ( (lv_right_3_0= ruleAddSubExpr ) ) )? )
				// InternalAgreeParser.g:5198:5: this_AddSubExpr_0= ruleAddSubExpr ( ( ( ( () ( ( ruleRelateOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelateOp ) ) ) )
				// ( (lv_right_3_0= ruleAddSubExpr ) ) )?
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getRelateExprAccess().getAddSubExprParserRuleCall_0());

					}
					pushFollow(FollowSets000.FOLLOW_71);
					this_AddSubExpr_0 = ruleAddSubExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_AddSubExpr_0;
						afterParserOrEnumRuleCall();

					}
					// InternalAgreeParser.g:5206:1: ( ( ( ( () ( ( ruleRelateOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelateOp ) ) ) ) ( (lv_right_3_0=
					// ruleAddSubExpr ) ) )?
					int alt69 = 2;
					alt69 = dfa69.predict(input);
					switch (alt69) {
					case 1:
					// InternalAgreeParser.g:5206:2: ( ( ( () ( ( ruleRelateOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelateOp ) ) ) ) ( (lv_right_3_0= ruleAddSubExpr
					// ) )
					{
						// InternalAgreeParser.g:5206:2: ( ( ( () ( ( ruleRelateOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelateOp ) ) ) )
						// InternalAgreeParser.g:5206:3: ( ( () ( ( ruleRelateOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelateOp ) ) )
						{
							// InternalAgreeParser.g:5211:6: ( () ( (lv_op_2_0= ruleRelateOp ) ) )
							// InternalAgreeParser.g:5211:7: () ( (lv_op_2_0= ruleRelateOp ) )
							{
								// InternalAgreeParser.g:5211:7: ()
								// InternalAgreeParser.g:5212:5:
								{
									if (state.backtracking == 0) {

										current = forceCreateModelElementAndSet(
												grammarAccess.getRelateExprAccess().getBinaryExprLeftAction_1_0_0_0(),
												current);

									}

								}

								// InternalAgreeParser.g:5217:2: ( (lv_op_2_0= ruleRelateOp ) )
								// InternalAgreeParser.g:5218:1: (lv_op_2_0= ruleRelateOp )
								{
									// InternalAgreeParser.g:5218:1: (lv_op_2_0= ruleRelateOp )
									// InternalAgreeParser.g:5219:3: lv_op_2_0= ruleRelateOp
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getRelateExprAccess()
													.getOpRelateOpParserRuleCall_1_0_0_1_0());

										}
										pushFollow(FollowSets000.FOLLOW_9);
										lv_op_2_0 = ruleRelateOp();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getRelateExprRule());
											}
											set(current, "op", lv_op_2_0,
													"com.rockwellcollins.atc.agree.Agree.RelateOp");
											afterParserOrEnumRuleCall();

										}

									}

								}

							}

						}

						// InternalAgreeParser.g:5235:4: ( (lv_right_3_0= ruleAddSubExpr ) )
						// InternalAgreeParser.g:5236:1: (lv_right_3_0= ruleAddSubExpr )
						{
							// InternalAgreeParser.g:5236:1: (lv_right_3_0= ruleAddSubExpr )
							// InternalAgreeParser.g:5237:3: lv_right_3_0= ruleAddSubExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getRelateExprAccess()
											.getRightAddSubExprParserRuleCall_1_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_2);
								lv_right_3_0 = ruleAddSubExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getRelateExprRule());
									}
									set(current, "right", lv_right_3_0,
											"com.rockwellcollins.atc.agree.Agree.AddSubExpr");
									afterParserOrEnumRuleCall();

								}

							}

						}

					}
						break;

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleRelateExpr"

	// $ANTLR start "entryRuleAddSubExpr"
	// InternalAgreeParser.g:5261:1: entryRuleAddSubExpr returns [EObject current=null] : iv_ruleAddSubExpr= ruleAddSubExpr EOF ;
	public final EObject entryRuleAddSubExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleAddSubExpr = null;

		try {
			// InternalAgreeParser.g:5262:2: (iv_ruleAddSubExpr= ruleAddSubExpr EOF )
			// InternalAgreeParser.g:5263:2: iv_ruleAddSubExpr= ruleAddSubExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getAddSubExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleAddSubExpr = ruleAddSubExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleAddSubExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleAddSubExpr"

	// $ANTLR start "ruleAddSubExpr"
	// InternalAgreeParser.g:5270:1: ruleAddSubExpr returns [EObject current=null] : (this_MultDivExpr_0= ruleMultDivExpr ( ( ( ( () ( ( ( PlusSign |
	// HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivExpr ) ) )* ) ;
	public final EObject ruleAddSubExpr() throws RecognitionException {
		EObject current = null;

		Token lv_op_2_1 = null;
		Token lv_op_2_2 = null;
		EObject this_MultDivExpr_0 = null;

		EObject lv_right_3_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:5273:28: ( (this_MultDivExpr_0= ruleMultDivExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1=
			// PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivExpr ) ) )* ) )
			// InternalAgreeParser.g:5274:1: (this_MultDivExpr_0= ruleMultDivExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1=
			// PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivExpr ) ) )* )
			{
				// InternalAgreeParser.g:5274:1: (this_MultDivExpr_0= ruleMultDivExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1=
				// PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivExpr ) ) )* )
				// InternalAgreeParser.g:5275:5: this_MultDivExpr_0= ruleMultDivExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1=
				// PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivExpr ) ) )*
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getAddSubExprAccess().getMultDivExprParserRuleCall_0());

					}
					pushFollow(FollowSets000.FOLLOW_72);
					this_MultDivExpr_0 = ruleMultDivExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_MultDivExpr_0;
						afterParserOrEnumRuleCall();

					}
					// InternalAgreeParser.g:5283:1: ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus
					// ) ) ) ) ) ( (lv_right_3_0= ruleMultDivExpr ) ) )*
					loop71: do {
						int alt71 = 2;
						int LA71_0 = input.LA(1);

						if ((LA71_0 == PlusSign)) {
							int LA71_2 = input.LA(2);

							if ((synpred19_InternalAgreeParser())) {
								alt71 = 1;
							}

						} else if ((LA71_0 == HyphenMinus)) {
							int LA71_3 = input.LA(2);

							if ((synpred19_InternalAgreeParser())) {
								alt71 = 1;
							}

						}

						switch (alt71) {
						case 1:
						// InternalAgreeParser.g:5283:2: ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2=
						// HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivExpr ) )
						{
							// InternalAgreeParser.g:5283:2: ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2=
							// HyphenMinus ) ) ) ) )
							// InternalAgreeParser.g:5283:3: ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2=
							// HyphenMinus ) ) ) )
							{
								// InternalAgreeParser.g:5298:6: ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) )
								// InternalAgreeParser.g:5298:7: () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) )
								{
									// InternalAgreeParser.g:5298:7: ()
									// InternalAgreeParser.g:5299:5:
									{
										if (state.backtracking == 0) {

											current = forceCreateModelElementAndSet(grammarAccess.getAddSubExprAccess()
													.getBinaryExprLeftAction_1_0_0_0(), current);

										}

									}

									// InternalAgreeParser.g:5304:2: ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) )
									// InternalAgreeParser.g:5305:1: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
									{
										// InternalAgreeParser.g:5305:1: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
										// InternalAgreeParser.g:5306:1: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
										{
											// InternalAgreeParser.g:5306:1: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
											int alt70 = 2;
											int LA70_0 = input.LA(1);

											if ((LA70_0 == PlusSign)) {
												alt70 = 1;
											} else if ((LA70_0 == HyphenMinus)) {
												alt70 = 2;
											} else {
												if (state.backtracking > 0) {
													state.failed = true;
													return current;
												}
												NoViableAltException nvae = new NoViableAltException("", 70, 0, input);

												throw nvae;
											}
											switch (alt70) {
											case 1:
											// InternalAgreeParser.g:5307:3: lv_op_2_1= PlusSign
											{
												lv_op_2_1 = (Token) match(input, PlusSign, FollowSets000.FOLLOW_9);
												if (state.failed) {
													return current;
												}
												if (state.backtracking == 0) {

													newLeafNode(lv_op_2_1, grammarAccess.getAddSubExprAccess()
															.getOpPlusSignKeyword_1_0_0_1_0_0());

												}
												if (state.backtracking == 0) {

													if (current == null) {
														current = createModelElement(grammarAccess.getAddSubExprRule());
													}
													setWithLastConsumed(current, "op", lv_op_2_1, null);

												}

											}
												break;
											case 2:
											// InternalAgreeParser.g:5320:8: lv_op_2_2= HyphenMinus
											{
												lv_op_2_2 = (Token) match(input, HyphenMinus, FollowSets000.FOLLOW_9);
												if (state.failed) {
													return current;
												}
												if (state.backtracking == 0) {

													newLeafNode(lv_op_2_2, grammarAccess.getAddSubExprAccess()
															.getOpHyphenMinusKeyword_1_0_0_1_0_1());

												}
												if (state.backtracking == 0) {

													if (current == null) {
														current = createModelElement(grammarAccess.getAddSubExprRule());
													}
													setWithLastConsumed(current, "op", lv_op_2_2, null);

												}

											}
												break;

											}

										}

									}

								}

							}

							// InternalAgreeParser.g:5336:4: ( (lv_right_3_0= ruleMultDivExpr ) )
							// InternalAgreeParser.g:5337:1: (lv_right_3_0= ruleMultDivExpr )
							{
								// InternalAgreeParser.g:5337:1: (lv_right_3_0= ruleMultDivExpr )
								// InternalAgreeParser.g:5338:3: lv_right_3_0= ruleMultDivExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getAddSubExprAccess()
												.getRightMultDivExprParserRuleCall_1_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_72);
									lv_right_3_0 = ruleMultDivExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getAddSubExprRule());
										}
										set(current, "right", lv_right_3_0,
												"com.rockwellcollins.atc.agree.Agree.MultDivExpr");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						default:
							break loop71;
						}
					} while (true);

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleAddSubExpr"

	// $ANTLR start "entryRuleMultDivExpr"
	// InternalAgreeParser.g:5362:1: entryRuleMultDivExpr returns [EObject current=null] : iv_ruleMultDivExpr= ruleMultDivExpr EOF ;
	public final EObject entryRuleMultDivExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleMultDivExpr = null;

		try {
			// InternalAgreeParser.g:5363:2: (iv_ruleMultDivExpr= ruleMultDivExpr EOF )
			// InternalAgreeParser.g:5364:2: iv_ruleMultDivExpr= ruleMultDivExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getMultDivExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleMultDivExpr = ruleMultDivExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleMultDivExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleMultDivExpr"

	// $ANTLR start "ruleMultDivExpr"
	// InternalAgreeParser.g:5371:1: ruleMultDivExpr returns [EObject current=null] : (this_PowerExpr_0= rulePowerExpr ( ( ( ( () ( ( ( Asterisk | Solidus | Div
	// | Mod ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= Div | lv_op_2_4= Mod ) ) ) ) ) ( (lv_right_3_0= rulePowerExpr ) ) )* )
	// ;
	public final EObject ruleMultDivExpr() throws RecognitionException {
		EObject current = null;

		Token lv_op_2_1 = null;
		Token lv_op_2_2 = null;
		Token lv_op_2_3 = null;
		Token lv_op_2_4 = null;
		EObject this_PowerExpr_0 = null;

		EObject lv_right_3_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:5374:28: ( (this_PowerExpr_0= rulePowerExpr ( ( ( ( () ( ( ( Asterisk | Solidus | Div | Mod ) ) ) ) )=> ( () ( (
			// (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= Div | lv_op_2_4= Mod ) ) ) ) ) ( (lv_right_3_0= rulePowerExpr ) ) )* ) )
			// InternalAgreeParser.g:5375:1: (this_PowerExpr_0= rulePowerExpr ( ( ( ( () ( ( ( Asterisk | Solidus | Div | Mod ) ) ) ) )=> ( () ( ( (lv_op_2_1=
			// Asterisk | lv_op_2_2= Solidus | lv_op_2_3= Div | lv_op_2_4= Mod ) ) ) ) ) ( (lv_right_3_0= rulePowerExpr ) ) )* )
			{
				// InternalAgreeParser.g:5375:1: (this_PowerExpr_0= rulePowerExpr ( ( ( ( () ( ( ( Asterisk | Solidus | Div | Mod ) ) ) ) )=> ( () ( (
				// (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= Div | lv_op_2_4= Mod ) ) ) ) ) ( (lv_right_3_0= rulePowerExpr ) ) )* )
				// InternalAgreeParser.g:5376:5: this_PowerExpr_0= rulePowerExpr ( ( ( ( () ( ( ( Asterisk | Solidus | Div | Mod ) ) ) ) )=> ( () ( (
				// (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= Div | lv_op_2_4= Mod ) ) ) ) ) ( (lv_right_3_0= rulePowerExpr ) ) )*
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getMultDivExprAccess().getPowerExprParserRuleCall_0());

					}
					pushFollow(FollowSets000.FOLLOW_73);
					this_PowerExpr_0 = rulePowerExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_PowerExpr_0;
						afterParserOrEnumRuleCall();

					}
					// InternalAgreeParser.g:5384:1: ( ( ( ( () ( ( ( Asterisk | Solidus | Div | Mod ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2=
					// Solidus | lv_op_2_3= Div | lv_op_2_4= Mod ) ) ) ) ) ( (lv_right_3_0= rulePowerExpr ) ) )*
					loop73: do {
						int alt73 = 2;
						switch (input.LA(1)) {
						case Asterisk: {
							int LA73_2 = input.LA(2);

							if ((synpred20_InternalAgreeParser())) {
								alt73 = 1;
							}

						}
							break;
						case Solidus: {
							int LA73_3 = input.LA(2);

							if ((synpred20_InternalAgreeParser())) {
								alt73 = 1;
							}

						}
							break;
						case Div: {
							int LA73_4 = input.LA(2);

							if ((synpred20_InternalAgreeParser())) {
								alt73 = 1;
							}

						}
							break;
						case Mod: {
							int LA73_5 = input.LA(2);

							if ((synpred20_InternalAgreeParser())) {
								alt73 = 1;
							}

						}
							break;

						}

						switch (alt73) {
						case 1:
						// InternalAgreeParser.g:5384:2: ( ( ( () ( ( ( Asterisk | Solidus | Div | Mod ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2=
						// Solidus | lv_op_2_3= Div | lv_op_2_4= Mod ) ) ) ) ) ( (lv_right_3_0= rulePowerExpr ) )
						{
							// InternalAgreeParser.g:5384:2: ( ( ( () ( ( ( Asterisk | Solidus | Div | Mod ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk |
							// lv_op_2_2= Solidus | lv_op_2_3= Div | lv_op_2_4= Mod ) ) ) ) )
							// InternalAgreeParser.g:5384:3: ( ( () ( ( ( Asterisk | Solidus | Div | Mod ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2=
							// Solidus | lv_op_2_3= Div | lv_op_2_4= Mod ) ) ) )
							{
								// InternalAgreeParser.g:5407:6: ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= Div | lv_op_2_4= Mod ) ) ) )
								// InternalAgreeParser.g:5407:7: () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= Div | lv_op_2_4= Mod ) ) )
								{
									// InternalAgreeParser.g:5407:7: ()
									// InternalAgreeParser.g:5408:5:
									{
										if (state.backtracking == 0) {

											current = forceCreateModelElementAndSet(grammarAccess.getMultDivExprAccess()
													.getBinaryExprLeftAction_1_0_0_0(), current);

										}

									}

									// InternalAgreeParser.g:5413:2: ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= Div | lv_op_2_4= Mod ) ) )
									// InternalAgreeParser.g:5414:1: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= Div | lv_op_2_4= Mod ) )
									{
										// InternalAgreeParser.g:5414:1: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= Div | lv_op_2_4= Mod ) )
										// InternalAgreeParser.g:5415:1: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= Div | lv_op_2_4= Mod )
										{
											// InternalAgreeParser.g:5415:1: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= Div | lv_op_2_4= Mod )
											int alt72 = 4;
											switch (input.LA(1)) {
											case Asterisk: {
												alt72 = 1;
											}
												break;
											case Solidus: {
												alt72 = 2;
											}
												break;
											case Div: {
												alt72 = 3;
											}
												break;
											case Mod: {
												alt72 = 4;
											}
												break;
											default:
												if (state.backtracking > 0) {
													state.failed = true;
													return current;
												}
												NoViableAltException nvae = new NoViableAltException("", 72, 0, input);

												throw nvae;
											}

											switch (alt72) {
											case 1:
											// InternalAgreeParser.g:5416:3: lv_op_2_1= Asterisk
											{
												lv_op_2_1 = (Token) match(input, Asterisk, FollowSets000.FOLLOW_9);
												if (state.failed) {
													return current;
												}
												if (state.backtracking == 0) {

													newLeafNode(lv_op_2_1, grammarAccess.getMultDivExprAccess()
															.getOpAsteriskKeyword_1_0_0_1_0_0());

												}
												if (state.backtracking == 0) {

													if (current == null) {
														current = createModelElement(
																grammarAccess.getMultDivExprRule());
													}
													setWithLastConsumed(current, "op", lv_op_2_1, null);

												}

											}
												break;
											case 2:
											// InternalAgreeParser.g:5429:8: lv_op_2_2= Solidus
											{
												lv_op_2_2 = (Token) match(input, Solidus, FollowSets000.FOLLOW_9);
												if (state.failed) {
													return current;
												}
												if (state.backtracking == 0) {

													newLeafNode(lv_op_2_2, grammarAccess.getMultDivExprAccess()
															.getOpSolidusKeyword_1_0_0_1_0_1());

												}
												if (state.backtracking == 0) {

													if (current == null) {
														current = createModelElement(
																grammarAccess.getMultDivExprRule());
													}
													setWithLastConsumed(current, "op", lv_op_2_2, null);

												}

											}
												break;
											case 3:
											// InternalAgreeParser.g:5442:8: lv_op_2_3= Div
											{
												lv_op_2_3 = (Token) match(input, Div, FollowSets000.FOLLOW_9);
												if (state.failed) {
													return current;
												}
												if (state.backtracking == 0) {

													newLeafNode(lv_op_2_3, grammarAccess.getMultDivExprAccess()
															.getOpDivKeyword_1_0_0_1_0_2());

												}
												if (state.backtracking == 0) {

													if (current == null) {
														current = createModelElement(
																grammarAccess.getMultDivExprRule());
													}
													setWithLastConsumed(current, "op", lv_op_2_3, null);

												}

											}
												break;
											case 4:
											// InternalAgreeParser.g:5455:8: lv_op_2_4= Mod
											{
												lv_op_2_4 = (Token) match(input, Mod, FollowSets000.FOLLOW_9);
												if (state.failed) {
													return current;
												}
												if (state.backtracking == 0) {

													newLeafNode(lv_op_2_4, grammarAccess.getMultDivExprAccess()
															.getOpModKeyword_1_0_0_1_0_3());

												}
												if (state.backtracking == 0) {

													if (current == null) {
														current = createModelElement(
																grammarAccess.getMultDivExprRule());
													}
													setWithLastConsumed(current, "op", lv_op_2_4, null);

												}

											}
												break;

											}

										}

									}

								}

							}

							// InternalAgreeParser.g:5471:4: ( (lv_right_3_0= rulePowerExpr ) )
							// InternalAgreeParser.g:5472:1: (lv_right_3_0= rulePowerExpr )
							{
								// InternalAgreeParser.g:5472:1: (lv_right_3_0= rulePowerExpr )
								// InternalAgreeParser.g:5473:3: lv_right_3_0= rulePowerExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getMultDivExprAccess()
												.getRightPowerExprParserRuleCall_1_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_73);
									lv_right_3_0 = rulePowerExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getMultDivExprRule());
										}
										set(current, "right", lv_right_3_0,
												"com.rockwellcollins.atc.agree.Agree.PowerExpr");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						default:
							break loop73;
						}
					} while (true);

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleMultDivExpr"

	// $ANTLR start "entryRulePowerExpr"
	// InternalAgreeParser.g:5497:1: entryRulePowerExpr returns [EObject current=null] : iv_rulePowerExpr= rulePowerExpr EOF ;
	public final EObject entryRulePowerExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_rulePowerExpr = null;

		try {
			// InternalAgreeParser.g:5498:2: (iv_rulePowerExpr= rulePowerExpr EOF )
			// InternalAgreeParser.g:5499:2: iv_rulePowerExpr= rulePowerExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getPowerExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_rulePowerExpr = rulePowerExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_rulePowerExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRulePowerExpr"

	// $ANTLR start "rulePowerExpr"
	// InternalAgreeParser.g:5506:1: rulePowerExpr returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> (
	// () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) ;
	public final EObject rulePowerExpr() throws RecognitionException {
		EObject current = null;

		Token lv_op_2_0 = null;
		EObject this_UnaryExpr_0 = null;

		EObject lv_right_3_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:5509:28: ( (this_UnaryExpr_0= ruleUnaryExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent )
			// ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) )
			// InternalAgreeParser.g:5510:1: (this_UnaryExpr_0= ruleUnaryExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) )
			// ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
			{
				// InternalAgreeParser.g:5510:1: (this_UnaryExpr_0= ruleUnaryExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent
				// ) ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
				// InternalAgreeParser.g:5511:5: this_UnaryExpr_0= ruleUnaryExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent )
				// ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getPowerExprAccess().getUnaryExprParserRuleCall_0());

					}
					pushFollow(FollowSets000.FOLLOW_74);
					this_UnaryExpr_0 = ruleUnaryExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_UnaryExpr_0;
						afterParserOrEnumRuleCall();

					}
					// InternalAgreeParser.g:5519:1: ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0=
					// ruleUnaryExpr ) ) )*
					loop74: do {
						int alt74 = 2;
						int LA74_0 = input.LA(1);

						if ((LA74_0 == CircumflexAccent)) {
							int LA74_2 = input.LA(2);

							if ((synpred21_InternalAgreeParser())) {
								alt74 = 1;
							}

						}

						switch (alt74) {
						case 1:
						// InternalAgreeParser.g:5519:2: ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0=
						// ruleUnaryExpr ) )
						{
							// InternalAgreeParser.g:5519:2: ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) )
							// InternalAgreeParser.g:5519:3: ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) )
							{
								// InternalAgreeParser.g:5527:6: ( () ( (lv_op_2_0= CircumflexAccent ) ) )
								// InternalAgreeParser.g:5527:7: () ( (lv_op_2_0= CircumflexAccent ) )
								{
									// InternalAgreeParser.g:5527:7: ()
									// InternalAgreeParser.g:5528:5:
									{
										if (state.backtracking == 0) {

											current = forceCreateModelElementAndSet(grammarAccess.getPowerExprAccess()
													.getBinaryExprLeftAction_1_0_0_0(), current);

										}

									}

									// InternalAgreeParser.g:5533:2: ( (lv_op_2_0= CircumflexAccent ) )
									// InternalAgreeParser.g:5534:1: (lv_op_2_0= CircumflexAccent )
									{
										// InternalAgreeParser.g:5534:1: (lv_op_2_0= CircumflexAccent )
										// InternalAgreeParser.g:5535:3: lv_op_2_0= CircumflexAccent
										{
											lv_op_2_0 = (Token) match(input, CircumflexAccent, FollowSets000.FOLLOW_9);
											if (state.failed) {
												return current;
											}
											if (state.backtracking == 0) {

												newLeafNode(lv_op_2_0, grammarAccess.getPowerExprAccess()
														.getOpCircumflexAccentKeyword_1_0_0_1_0());

											}
											if (state.backtracking == 0) {

												if (current == null) {
													current = createModelElement(grammarAccess.getPowerExprRule());
												}
												setWithLastConsumed(current, "op", lv_op_2_0, "^");

											}

										}

									}

								}

							}

							// InternalAgreeParser.g:5549:4: ( (lv_right_3_0= ruleUnaryExpr ) )
							// InternalAgreeParser.g:5550:1: (lv_right_3_0= ruleUnaryExpr )
							{
								// InternalAgreeParser.g:5550:1: (lv_right_3_0= ruleUnaryExpr )
								// InternalAgreeParser.g:5551:3: lv_right_3_0= ruleUnaryExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getPowerExprAccess()
												.getRightUnaryExprParserRuleCall_1_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_74);
									lv_right_3_0 = ruleUnaryExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getPowerExprRule());
										}
										set(current, "right", lv_right_3_0,
												"com.rockwellcollins.atc.agree.Agree.UnaryExpr");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						default:
							break loop74;
						}
					} while (true);

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "rulePowerExpr"

	// $ANTLR start "entryRuleUnaryExpr"
	// InternalAgreeParser.g:5575:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
	public final EObject entryRuleUnaryExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleUnaryExpr = null;

		try {
			// InternalAgreeParser.g:5576:2: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
			// InternalAgreeParser.g:5577:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getUnaryExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleUnaryExpr = ruleUnaryExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleUnaryExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleUnaryExpr"

	// $ANTLR start "ruleUnaryExpr"
	// InternalAgreeParser.g:5584:1: ruleUnaryExpr returns [EObject current=null] : ( ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0=
	// ruleUnaryExpr ) ) ) | this_IfThenElseExpr_3= ruleIfThenElseExpr ) ;
	public final EObject ruleUnaryExpr() throws RecognitionException {
		EObject current = null;

		Token lv_op_1_1 = null;
		Token lv_op_1_2 = null;
		EObject lv_expr_2_0 = null;

		EObject this_IfThenElseExpr_3 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:5587:28: ( ( ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= ruleUnaryExpr ) ) ) |
			// this_IfThenElseExpr_3= ruleIfThenElseExpr ) )
			// InternalAgreeParser.g:5588:1: ( ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= ruleUnaryExpr ) ) ) |
			// this_IfThenElseExpr_3= ruleIfThenElseExpr )
			{
				// InternalAgreeParser.g:5588:1: ( ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= ruleUnaryExpr ) ) ) |
				// this_IfThenElseExpr_3= ruleIfThenElseExpr )
				int alt76 = 2;
				int LA76_0 = input.LA(1);

				if ((LA76_0 == Not || LA76_0 == HyphenMinus)) {
					alt76 = 1;
				} else if ((LA76_0 == Get_Property || (LA76_0 >= Timefall && LA76_0 <= Timerise) || LA76_0 == Latched
						|| LA76_0 == Timeof || (LA76_0 >= Event && LA76_0 <= Floor) || LA76_0 == Enum
						|| (LA76_0 >= Prev && LA76_0 <= Real) || (LA76_0 >= This && LA76_0 <= True) || LA76_0 == Pre
						|| LA76_0 == If || LA76_0 == LeftParenthesis || LA76_0 == RULE_REAL_LIT
						|| LA76_0 == RULE_INTEGER_LIT || LA76_0 == RULE_ID)) {
					alt76 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 76, 0, input);

					throw nvae;
				}
				switch (alt76) {
				case 1:
				// InternalAgreeParser.g:5588:2: ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= ruleUnaryExpr ) ) )
				{
					// InternalAgreeParser.g:5588:2: ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= ruleUnaryExpr ) ) )
					// InternalAgreeParser.g:5588:3: () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= ruleUnaryExpr ) )
					{
						// InternalAgreeParser.g:5588:3: ()
						// InternalAgreeParser.g:5589:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getUnaryExprAccess().getUnaryExprAction_0_0(), current);

							}

						}

						// InternalAgreeParser.g:5594:2: ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) )
						// InternalAgreeParser.g:5595:1: ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) )
						{
							// InternalAgreeParser.g:5595:1: ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) )
							// InternalAgreeParser.g:5596:1: (lv_op_1_1= HyphenMinus | lv_op_1_2= Not )
							{
								// InternalAgreeParser.g:5596:1: (lv_op_1_1= HyphenMinus | lv_op_1_2= Not )
								int alt75 = 2;
								int LA75_0 = input.LA(1);

								if ((LA75_0 == HyphenMinus)) {
									alt75 = 1;
								} else if ((LA75_0 == Not)) {
									alt75 = 2;
								} else {
									if (state.backtracking > 0) {
										state.failed = true;
										return current;
									}
									NoViableAltException nvae = new NoViableAltException("", 75, 0, input);

									throw nvae;
								}
								switch (alt75) {
								case 1:
								// InternalAgreeParser.g:5597:3: lv_op_1_1= HyphenMinus
								{
									lv_op_1_1 = (Token) match(input, HyphenMinus, FollowSets000.FOLLOW_9);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(lv_op_1_1,
												grammarAccess.getUnaryExprAccess().getOpHyphenMinusKeyword_0_1_0_0());

									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElement(grammarAccess.getUnaryExprRule());
										}
										setWithLastConsumed(current, "op", lv_op_1_1, null);

									}

								}
									break;
								case 2:
								// InternalAgreeParser.g:5610:8: lv_op_1_2= Not
								{
									lv_op_1_2 = (Token) match(input, Not, FollowSets000.FOLLOW_9);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(lv_op_1_2,
												grammarAccess.getUnaryExprAccess().getOpNotKeyword_0_1_0_1());

									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElement(grammarAccess.getUnaryExprRule());
										}
										setWithLastConsumed(current, "op", lv_op_1_2, null);

									}

								}
									break;

								}

							}

						}

						// InternalAgreeParser.g:5626:2: ( (lv_expr_2_0= ruleUnaryExpr ) )
						// InternalAgreeParser.g:5627:1: (lv_expr_2_0= ruleUnaryExpr )
						{
							// InternalAgreeParser.g:5627:1: (lv_expr_2_0= ruleUnaryExpr )
							// InternalAgreeParser.g:5628:3: lv_expr_2_0= ruleUnaryExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getUnaryExprAccess().getExprUnaryExprParserRuleCall_0_2_0());

								}
								pushFollow(FollowSets000.FOLLOW_2);
								lv_expr_2_0 = ruleUnaryExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getUnaryExprRule());
									}
									set(current, "expr", lv_expr_2_0, "com.rockwellcollins.atc.agree.Agree.UnaryExpr");
									afterParserOrEnumRuleCall();

								}

							}

						}

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:5646:5: this_IfThenElseExpr_3= ruleIfThenElseExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getUnaryExprAccess().getIfThenElseExprParserRuleCall_1());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_IfThenElseExpr_3 = ruleIfThenElseExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_IfThenElseExpr_3;
						afterParserOrEnumRuleCall();

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleUnaryExpr"

	// $ANTLR start "entryRuleIfThenElseExpr"
	// InternalAgreeParser.g:5662:1: entryRuleIfThenElseExpr returns [EObject current=null] : iv_ruleIfThenElseExpr= ruleIfThenElseExpr EOF ;
	public final EObject entryRuleIfThenElseExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleIfThenElseExpr = null;

		try {
			// InternalAgreeParser.g:5663:2: (iv_ruleIfThenElseExpr= ruleIfThenElseExpr EOF )
			// InternalAgreeParser.g:5664:2: iv_ruleIfThenElseExpr= ruleIfThenElseExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getIfThenElseExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleIfThenElseExpr = ruleIfThenElseExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleIfThenElseExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleIfThenElseExpr"

	// $ANTLR start "ruleIfThenElseExpr"
	// InternalAgreeParser.g:5671:1: ruleIfThenElseExpr returns [EObject current=null] : ( ( () otherlv_1= If ( (lv_a_2_0= ruleExpr ) ) otherlv_3= Then (
	// (lv_b_4_0= ruleExpr ) ) otherlv_5= Else ( (lv_c_6_0= ruleExpr ) ) ) | this_PreDefFnExpr_7= rulePreDefFnExpr ) ;
	public final EObject ruleIfThenElseExpr() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_3 = null;
		Token otherlv_5 = null;
		EObject lv_a_2_0 = null;

		EObject lv_b_4_0 = null;

		EObject lv_c_6_0 = null;

		EObject this_PreDefFnExpr_7 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:5674:28: ( ( ( () otherlv_1= If ( (lv_a_2_0= ruleExpr ) ) otherlv_3= Then ( (lv_b_4_0= ruleExpr ) ) otherlv_5= Else (
			// (lv_c_6_0= ruleExpr ) ) ) | this_PreDefFnExpr_7= rulePreDefFnExpr ) )
			// InternalAgreeParser.g:5675:1: ( ( () otherlv_1= If ( (lv_a_2_0= ruleExpr ) ) otherlv_3= Then ( (lv_b_4_0= ruleExpr ) ) otherlv_5= Else (
			// (lv_c_6_0= ruleExpr ) ) ) | this_PreDefFnExpr_7= rulePreDefFnExpr )
			{
				// InternalAgreeParser.g:5675:1: ( ( () otherlv_1= If ( (lv_a_2_0= ruleExpr ) ) otherlv_3= Then ( (lv_b_4_0= ruleExpr ) ) otherlv_5= Else (
				// (lv_c_6_0= ruleExpr ) ) ) | this_PreDefFnExpr_7= rulePreDefFnExpr )
				int alt77 = 2;
				int LA77_0 = input.LA(1);

				if ((LA77_0 == If)) {
					alt77 = 1;
				} else if ((LA77_0 == Get_Property || (LA77_0 >= Timefall && LA77_0 <= Timerise) || LA77_0 == Latched
						|| LA77_0 == Timeof || (LA77_0 >= Event && LA77_0 <= Floor) || LA77_0 == Enum
						|| (LA77_0 >= Prev && LA77_0 <= Real) || (LA77_0 >= This && LA77_0 <= True) || LA77_0 == Pre
						|| LA77_0 == LeftParenthesis || LA77_0 == RULE_REAL_LIT || LA77_0 == RULE_INTEGER_LIT
						|| LA77_0 == RULE_ID)) {
					alt77 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 77, 0, input);

					throw nvae;
				}
				switch (alt77) {
				case 1:
				// InternalAgreeParser.g:5675:2: ( () otherlv_1= If ( (lv_a_2_0= ruleExpr ) ) otherlv_3= Then ( (lv_b_4_0= ruleExpr ) ) otherlv_5= Else (
				// (lv_c_6_0= ruleExpr ) ) )
				{
					// InternalAgreeParser.g:5675:2: ( () otherlv_1= If ( (lv_a_2_0= ruleExpr ) ) otherlv_3= Then ( (lv_b_4_0= ruleExpr ) ) otherlv_5= Else (
					// (lv_c_6_0= ruleExpr ) ) )
					// InternalAgreeParser.g:5675:3: () otherlv_1= If ( (lv_a_2_0= ruleExpr ) ) otherlv_3= Then ( (lv_b_4_0= ruleExpr ) ) otherlv_5= Else (
					// (lv_c_6_0= ruleExpr ) )
					{
						// InternalAgreeParser.g:5675:3: ()
						// InternalAgreeParser.g:5676:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getIfThenElseExprAccess().getIfThenElseExprAction_0_0(), current);

							}

						}

						otherlv_1 = (Token) match(input, If, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_1, grammarAccess.getIfThenElseExprAccess().getIfKeyword_0_1());

						}
						// InternalAgreeParser.g:5686:1: ( (lv_a_2_0= ruleExpr ) )
						// InternalAgreeParser.g:5687:1: (lv_a_2_0= ruleExpr )
						{
							// InternalAgreeParser.g:5687:1: (lv_a_2_0= ruleExpr )
							// InternalAgreeParser.g:5688:3: lv_a_2_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getIfThenElseExprAccess().getAExprParserRuleCall_0_2_0());

								}
								pushFollow(FollowSets000.FOLLOW_75);
								lv_a_2_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getIfThenElseExprRule());
									}
									set(current, "a", lv_a_2_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_3 = (Token) match(input, Then, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_3, grammarAccess.getIfThenElseExprAccess().getThenKeyword_0_3());

						}
						// InternalAgreeParser.g:5709:1: ( (lv_b_4_0= ruleExpr ) )
						// InternalAgreeParser.g:5710:1: (lv_b_4_0= ruleExpr )
						{
							// InternalAgreeParser.g:5710:1: (lv_b_4_0= ruleExpr )
							// InternalAgreeParser.g:5711:3: lv_b_4_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getIfThenElseExprAccess().getBExprParserRuleCall_0_4_0());

								}
								pushFollow(FollowSets000.FOLLOW_76);
								lv_b_4_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getIfThenElseExprRule());
									}
									set(current, "b", lv_b_4_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_5 = (Token) match(input, Else, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_5, grammarAccess.getIfThenElseExprAccess().getElseKeyword_0_5());

						}
						// InternalAgreeParser.g:5732:1: ( (lv_c_6_0= ruleExpr ) )
						// InternalAgreeParser.g:5733:1: (lv_c_6_0= ruleExpr )
						{
							// InternalAgreeParser.g:5733:1: (lv_c_6_0= ruleExpr )
							// InternalAgreeParser.g:5734:3: lv_c_6_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getIfThenElseExprAccess().getCExprParserRuleCall_0_6_0());

								}
								pushFollow(FollowSets000.FOLLOW_2);
								lv_c_6_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getIfThenElseExprRule());
									}
									set(current, "c", lv_c_6_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:5752:5: this_PreDefFnExpr_7= rulePreDefFnExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getIfThenElseExprAccess().getPreDefFnExprParserRuleCall_1());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_PreDefFnExpr_7 = rulePreDefFnExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_PreDefFnExpr_7;
						afterParserOrEnumRuleCall();

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleIfThenElseExpr"

	// $ANTLR start "entryRulePreDefFnExpr"
	// InternalAgreeParser.g:5768:1: entryRulePreDefFnExpr returns [EObject current=null] : iv_rulePreDefFnExpr= rulePreDefFnExpr EOF ;
	public final EObject entryRulePreDefFnExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_rulePreDefFnExpr = null;

		try {
			// InternalAgreeParser.g:5769:2: (iv_rulePreDefFnExpr= rulePreDefFnExpr EOF )
			// InternalAgreeParser.g:5770:2: iv_rulePreDefFnExpr= rulePreDefFnExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getPreDefFnExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_rulePreDefFnExpr = rulePreDefFnExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_rulePreDefFnExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRulePreDefFnExpr"

	// $ANTLR start "rulePreDefFnExpr"
	// InternalAgreeParser.g:5777:1: rulePreDefFnExpr returns [EObject current=null] : ( ( () otherlv_1= Prev otherlv_2= LeftParenthesis ( (lv_delay_3_0=
	// ruleExpr ) ) otherlv_4= Comma ( (lv_init_5_0= ruleExpr ) ) otherlv_6= RightParenthesis ) | ( () otherlv_8= Get_Property otherlv_9= LeftParenthesis (
	// (lv_component_10_0= ruleExpr ) ) otherlv_11= Comma ( ( ruleQCLREF ) ) otherlv_13= RightParenthesis ) | this_RecordUpdateExpr_14= ruleRecordUpdateExpr ) ;
	public final EObject rulePreDefFnExpr() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_2 = null;
		Token otherlv_4 = null;
		Token otherlv_6 = null;
		Token otherlv_8 = null;
		Token otherlv_9 = null;
		Token otherlv_11 = null;
		Token otherlv_13 = null;
		EObject lv_delay_3_0 = null;

		EObject lv_init_5_0 = null;

		EObject lv_component_10_0 = null;

		EObject this_RecordUpdateExpr_14 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:5780:28: ( ( ( () otherlv_1= Prev otherlv_2= LeftParenthesis ( (lv_delay_3_0= ruleExpr ) ) otherlv_4= Comma ( (lv_init_5_0=
			// ruleExpr ) ) otherlv_6= RightParenthesis ) | ( () otherlv_8= Get_Property otherlv_9= LeftParenthesis ( (lv_component_10_0= ruleExpr ) )
			// otherlv_11= Comma ( ( ruleQCLREF ) ) otherlv_13= RightParenthesis ) | this_RecordUpdateExpr_14= ruleRecordUpdateExpr ) )
			// InternalAgreeParser.g:5781:1: ( ( () otherlv_1= Prev otherlv_2= LeftParenthesis ( (lv_delay_3_0= ruleExpr ) ) otherlv_4= Comma ( (lv_init_5_0=
			// ruleExpr ) ) otherlv_6= RightParenthesis ) | ( () otherlv_8= Get_Property otherlv_9= LeftParenthesis ( (lv_component_10_0= ruleExpr ) )
			// otherlv_11= Comma ( ( ruleQCLREF ) ) otherlv_13= RightParenthesis ) | this_RecordUpdateExpr_14= ruleRecordUpdateExpr )
			{
				// InternalAgreeParser.g:5781:1: ( ( () otherlv_1= Prev otherlv_2= LeftParenthesis ( (lv_delay_3_0= ruleExpr ) ) otherlv_4= Comma (
				// (lv_init_5_0= ruleExpr ) ) otherlv_6= RightParenthesis ) | ( () otherlv_8= Get_Property otherlv_9= LeftParenthesis ( (lv_component_10_0=
				// ruleExpr ) ) otherlv_11= Comma ( ( ruleQCLREF ) ) otherlv_13= RightParenthesis ) | this_RecordUpdateExpr_14= ruleRecordUpdateExpr )
				int alt78 = 3;
				switch (input.LA(1)) {
				case Prev: {
					alt78 = 1;
				}
					break;
				case Get_Property: {
					alt78 = 2;
				}
					break;
				case Timefall:
				case Timerise:
				case Latched:
				case Timeof:
				case Event:
				case False:
				case Floor:
				case Enum:
				case Real:
				case This:
				case Time:
				case True:
				case Pre:
				case LeftParenthesis:
				case RULE_REAL_LIT:
				case RULE_INTEGER_LIT:
				case RULE_ID: {
					alt78 = 3;
				}
					break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 78, 0, input);

					throw nvae;
				}

				switch (alt78) {
				case 1:
				// InternalAgreeParser.g:5781:2: ( () otherlv_1= Prev otherlv_2= LeftParenthesis ( (lv_delay_3_0= ruleExpr ) ) otherlv_4= Comma ( (lv_init_5_0=
				// ruleExpr ) ) otherlv_6= RightParenthesis )
				{
					// InternalAgreeParser.g:5781:2: ( () otherlv_1= Prev otherlv_2= LeftParenthesis ( (lv_delay_3_0= ruleExpr ) ) otherlv_4= Comma (
					// (lv_init_5_0= ruleExpr ) ) otherlv_6= RightParenthesis )
					// InternalAgreeParser.g:5781:3: () otherlv_1= Prev otherlv_2= LeftParenthesis ( (lv_delay_3_0= ruleExpr ) ) otherlv_4= Comma (
					// (lv_init_5_0= ruleExpr ) ) otherlv_6= RightParenthesis
					{
						// InternalAgreeParser.g:5781:3: ()
						// InternalAgreeParser.g:5782:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getPreDefFnExprAccess().getPrevExprAction_0_0(), current);

							}

						}

						otherlv_1 = (Token) match(input, Prev, FollowSets000.FOLLOW_48);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_1, grammarAccess.getPreDefFnExprAccess().getPrevKeyword_0_1());

						}
						otherlv_2 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_2,
									grammarAccess.getPreDefFnExprAccess().getLeftParenthesisKeyword_0_2());

						}
						// InternalAgreeParser.g:5797:1: ( (lv_delay_3_0= ruleExpr ) )
						// InternalAgreeParser.g:5798:1: (lv_delay_3_0= ruleExpr )
						{
							// InternalAgreeParser.g:5798:1: (lv_delay_3_0= ruleExpr )
							// InternalAgreeParser.g:5799:3: lv_delay_3_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getPreDefFnExprAccess().getDelayExprParserRuleCall_0_3_0());

								}
								pushFollow(FollowSets000.FOLLOW_34);
								lv_delay_3_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getPreDefFnExprRule());
									}
									set(current, "delay", lv_delay_3_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_4 = (Token) match(input, Comma, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_4, grammarAccess.getPreDefFnExprAccess().getCommaKeyword_0_4());

						}
						// InternalAgreeParser.g:5820:1: ( (lv_init_5_0= ruleExpr ) )
						// InternalAgreeParser.g:5821:1: (lv_init_5_0= ruleExpr )
						{
							// InternalAgreeParser.g:5821:1: (lv_init_5_0= ruleExpr )
							// InternalAgreeParser.g:5822:3: lv_init_5_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getPreDefFnExprAccess().getInitExprParserRuleCall_0_5_0());

								}
								pushFollow(FollowSets000.FOLLOW_36);
								lv_init_5_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getPreDefFnExprRule());
									}
									set(current, "init", lv_init_5_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_6 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_6,
									grammarAccess.getPreDefFnExprAccess().getRightParenthesisKeyword_0_6());

						}

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:5844:6: ( () otherlv_8= Get_Property otherlv_9= LeftParenthesis ( (lv_component_10_0= ruleExpr ) ) otherlv_11= Comma (
				// ( ruleQCLREF ) ) otherlv_13= RightParenthesis )
				{
					// InternalAgreeParser.g:5844:6: ( () otherlv_8= Get_Property otherlv_9= LeftParenthesis ( (lv_component_10_0= ruleExpr ) ) otherlv_11=
					// Comma ( ( ruleQCLREF ) ) otherlv_13= RightParenthesis )
					// InternalAgreeParser.g:5844:7: () otherlv_8= Get_Property otherlv_9= LeftParenthesis ( (lv_component_10_0= ruleExpr ) ) otherlv_11= Comma
					// ( ( ruleQCLREF ) ) otherlv_13= RightParenthesis
					{
						// InternalAgreeParser.g:5844:7: ()
						// InternalAgreeParser.g:5845:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getPreDefFnExprAccess().getGetPropertyExprAction_1_0(), current);

							}

						}

						otherlv_8 = (Token) match(input, Get_Property, FollowSets000.FOLLOW_48);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_8, grammarAccess.getPreDefFnExprAccess().getGet_PropertyKeyword_1_1());

						}
						otherlv_9 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_9,
									grammarAccess.getPreDefFnExprAccess().getLeftParenthesisKeyword_1_2());

						}
						// InternalAgreeParser.g:5860:1: ( (lv_component_10_0= ruleExpr ) )
						// InternalAgreeParser.g:5861:1: (lv_component_10_0= ruleExpr )
						{
							// InternalAgreeParser.g:5861:1: (lv_component_10_0= ruleExpr )
							// InternalAgreeParser.g:5862:3: lv_component_10_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getPreDefFnExprAccess()
											.getComponentExprParserRuleCall_1_3_0());

								}
								pushFollow(FollowSets000.FOLLOW_34);
								lv_component_10_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getPreDefFnExprRule());
									}
									set(current, "component", lv_component_10_0,
											"com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_11 = (Token) match(input, Comma, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_11, grammarAccess.getPreDefFnExprAccess().getCommaKeyword_1_4());

						}
						// InternalAgreeParser.g:5883:1: ( ( ruleQCLREF ) )
						// InternalAgreeParser.g:5884:1: ( ruleQCLREF )
						{
							// InternalAgreeParser.g:5884:1: ( ruleQCLREF )
							// InternalAgreeParser.g:5885:3: ruleQCLREF
							{
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getPreDefFnExprRule());
									}

								}
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getPreDefFnExprAccess()
											.getPropNamedElementCrossReference_1_5_0());

								}
								pushFollow(FollowSets000.FOLLOW_36);
								ruleQCLREF();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_13 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_13,
									grammarAccess.getPreDefFnExprAccess().getRightParenthesisKeyword_1_6());

						}

					}

				}
					break;
				case 3:
				// InternalAgreeParser.g:5906:5: this_RecordUpdateExpr_14= ruleRecordUpdateExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getPreDefFnExprAccess().getRecordUpdateExprParserRuleCall_2());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_RecordUpdateExpr_14 = ruleRecordUpdateExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_RecordUpdateExpr_14;
						afterParserOrEnumRuleCall();

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "rulePreDefFnExpr"

	// $ANTLR start "entryRuleRecordUpdateExpr"
	// InternalAgreeParser.g:5922:1: entryRuleRecordUpdateExpr returns [EObject current=null] : iv_ruleRecordUpdateExpr= ruleRecordUpdateExpr EOF ;
	public final EObject entryRuleRecordUpdateExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleRecordUpdateExpr = null;

		try {
			// InternalAgreeParser.g:5923:2: (iv_ruleRecordUpdateExpr= ruleRecordUpdateExpr EOF )
			// InternalAgreeParser.g:5924:2: iv_ruleRecordUpdateExpr= ruleRecordUpdateExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getRecordUpdateExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleRecordUpdateExpr = ruleRecordUpdateExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleRecordUpdateExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleRecordUpdateExpr"

	// $ANTLR start "ruleRecordUpdateExpr"
	// InternalAgreeParser.g:5931:1: ruleRecordUpdateExpr returns [EObject current=null] : (this_TermExpr_0= ruleTermExpr ( ( ( () ( LeftCurlyBracket ( (
	// RULE_ID ) ) ColonEqualsSign ( ( ruleExpr ) ) RightCurlyBracket )+ ) )=> ( () (otherlv_2= LeftCurlyBracket ( (otherlv_3= RULE_ID ) ) otherlv_4=
	// ColonEqualsSign ( (lv_argExpr_5_0= ruleExpr ) ) otherlv_6= RightCurlyBracket )+ ) )? ) ;
	public final EObject ruleRecordUpdateExpr() throws RecognitionException {
		EObject current = null;

		Token otherlv_2 = null;
		Token otherlv_3 = null;
		Token otherlv_4 = null;
		Token otherlv_6 = null;
		EObject this_TermExpr_0 = null;

		EObject lv_argExpr_5_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:5934:28: ( (this_TermExpr_0= ruleTermExpr ( ( ( () ( LeftCurlyBracket ( ( RULE_ID ) ) ColonEqualsSign ( ( ruleExpr ) )
			// RightCurlyBracket )+ ) )=> ( () (otherlv_2= LeftCurlyBracket ( (otherlv_3= RULE_ID ) ) otherlv_4= ColonEqualsSign ( (lv_argExpr_5_0= ruleExpr ) )
			// otherlv_6= RightCurlyBracket )+ ) )? ) )
			// InternalAgreeParser.g:5935:1: (this_TermExpr_0= ruleTermExpr ( ( ( () ( LeftCurlyBracket ( ( RULE_ID ) ) ColonEqualsSign ( ( ruleExpr ) )
			// RightCurlyBracket )+ ) )=> ( () (otherlv_2= LeftCurlyBracket ( (otherlv_3= RULE_ID ) ) otherlv_4= ColonEqualsSign ( (lv_argExpr_5_0= ruleExpr ) )
			// otherlv_6= RightCurlyBracket )+ ) )? )
			{
				// InternalAgreeParser.g:5935:1: (this_TermExpr_0= ruleTermExpr ( ( ( () ( LeftCurlyBracket ( ( RULE_ID ) ) ColonEqualsSign ( ( ruleExpr ) )
				// RightCurlyBracket )+ ) )=> ( () (otherlv_2= LeftCurlyBracket ( (otherlv_3= RULE_ID ) ) otherlv_4= ColonEqualsSign ( (lv_argExpr_5_0= ruleExpr
				// ) ) otherlv_6= RightCurlyBracket )+ ) )? )
				// InternalAgreeParser.g:5936:5: this_TermExpr_0= ruleTermExpr ( ( ( () ( LeftCurlyBracket ( ( RULE_ID ) ) ColonEqualsSign ( ( ruleExpr ) )
				// RightCurlyBracket )+ ) )=> ( () (otherlv_2= LeftCurlyBracket ( (otherlv_3= RULE_ID ) ) otherlv_4= ColonEqualsSign ( (lv_argExpr_5_0= ruleExpr
				// ) ) otherlv_6= RightCurlyBracket )+ ) )?
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getRecordUpdateExprAccess().getTermExprParserRuleCall_0());

					}
					pushFollow(FollowSets000.FOLLOW_77);
					this_TermExpr_0 = ruleTermExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_TermExpr_0;
						afterParserOrEnumRuleCall();

					}
					// InternalAgreeParser.g:5944:1: ( ( ( () ( LeftCurlyBracket ( ( RULE_ID ) ) ColonEqualsSign ( ( ruleExpr ) ) RightCurlyBracket )+ ) )=> (
					// () (otherlv_2= LeftCurlyBracket ( (otherlv_3= RULE_ID ) ) otherlv_4= ColonEqualsSign ( (lv_argExpr_5_0= ruleExpr ) ) otherlv_6=
					// RightCurlyBracket )+ ) )?
					int alt80 = 2;
					int LA80_0 = input.LA(1);

					if ((LA80_0 == LeftCurlyBracket) && (synpred22_InternalAgreeParser())) {
						alt80 = 1;
					}
					switch (alt80) {
					case 1:
					// InternalAgreeParser.g:5944:2: ( ( () ( LeftCurlyBracket ( ( RULE_ID ) ) ColonEqualsSign ( ( ruleExpr ) ) RightCurlyBracket )+ ) )=> ( ()
					// (otherlv_2= LeftCurlyBracket ( (otherlv_3= RULE_ID ) ) otherlv_4= ColonEqualsSign ( (lv_argExpr_5_0= ruleExpr ) ) otherlv_6=
					// RightCurlyBracket )+ )
					{
						// InternalAgreeParser.g:5960:7: ( () (otherlv_2= LeftCurlyBracket ( (otherlv_3= RULE_ID ) ) otherlv_4= ColonEqualsSign (
						// (lv_argExpr_5_0= ruleExpr ) ) otherlv_6= RightCurlyBracket )+ )
						// InternalAgreeParser.g:5960:8: () (otherlv_2= LeftCurlyBracket ( (otherlv_3= RULE_ID ) ) otherlv_4= ColonEqualsSign ( (lv_argExpr_5_0=
						// ruleExpr ) ) otherlv_6= RightCurlyBracket )+
						{
							// InternalAgreeParser.g:5960:8: ()
							// InternalAgreeParser.g:5961:5:
							{
								if (state.backtracking == 0) {

									current = forceCreateModelElementAndSet(grammarAccess.getRecordUpdateExprAccess()
											.getRecordUpdateExprRecordAction_1_0_0(), current);

								}

							}

							// InternalAgreeParser.g:5966:2: (otherlv_2= LeftCurlyBracket ( (otherlv_3= RULE_ID ) ) otherlv_4= ColonEqualsSign (
							// (lv_argExpr_5_0= ruleExpr ) ) otherlv_6= RightCurlyBracket )+
							int cnt79 = 0;
							loop79: do {
								int alt79 = 2;
								int LA79_0 = input.LA(1);

								if ((LA79_0 == LeftCurlyBracket)) {
									alt79 = 1;
								}

								switch (alt79) {
								case 1:
								// InternalAgreeParser.g:5967:2: otherlv_2= LeftCurlyBracket ( (otherlv_3= RULE_ID ) ) otherlv_4= ColonEqualsSign (
								// (lv_argExpr_5_0= ruleExpr ) ) otherlv_6= RightCurlyBracket
								{
									otherlv_2 = (Token) match(input, LeftCurlyBracket, FollowSets000.FOLLOW_11);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(otherlv_2, grammarAccess.getRecordUpdateExprAccess()
												.getLeftCurlyBracketKeyword_1_0_1_0());

									}
									// InternalAgreeParser.g:5971:1: ( (otherlv_3= RULE_ID ) )
									// InternalAgreeParser.g:5972:1: (otherlv_3= RULE_ID )
									{
										// InternalAgreeParser.g:5972:1: (otherlv_3= RULE_ID )
										// InternalAgreeParser.g:5973:3: otherlv_3= RULE_ID
										{
											if (state.backtracking == 0) {

												if (current == null) {
													current = createModelElement(
															grammarAccess.getRecordUpdateExprRule());
												}

											}
											otherlv_3 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_78);
											if (state.failed) {
												return current;
											}
											if (state.backtracking == 0) {

												newLeafNode(otherlv_3, grammarAccess.getRecordUpdateExprAccess()
														.getArgsNamedElementCrossReference_1_0_1_1_0());

											}

										}

									}

									otherlv_4 = (Token) match(input, ColonEqualsSign, FollowSets000.FOLLOW_9);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(otherlv_4, grammarAccess.getRecordUpdateExprAccess()
												.getColonEqualsSignKeyword_1_0_1_2());

									}
									// InternalAgreeParser.g:5989:1: ( (lv_argExpr_5_0= ruleExpr ) )
									// InternalAgreeParser.g:5990:1: (lv_argExpr_5_0= ruleExpr )
									{
										// InternalAgreeParser.g:5990:1: (lv_argExpr_5_0= ruleExpr )
										// InternalAgreeParser.g:5991:3: lv_argExpr_5_0= ruleExpr
										{
											if (state.backtracking == 0) {

												newCompositeNode(grammarAccess.getRecordUpdateExprAccess()
														.getArgExprExprParserRuleCall_1_0_1_3_0());

											}
											pushFollow(FollowSets000.FOLLOW_79);
											lv_argExpr_5_0 = ruleExpr();

											state._fsp--;
											if (state.failed) {
												return current;
											}
											if (state.backtracking == 0) {

												if (current == null) {
													current = createModelElementForParent(
															grammarAccess.getRecordUpdateExprRule());
												}
												add(current, "argExpr", lv_argExpr_5_0,
														"com.rockwellcollins.atc.agree.Agree.Expr");
												afterParserOrEnumRuleCall();

											}

										}

									}

									otherlv_6 = (Token) match(input, RightCurlyBracket, FollowSets000.FOLLOW_77);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(otherlv_6, grammarAccess.getRecordUpdateExprAccess()
												.getRightCurlyBracketKeyword_1_0_1_4());

									}

								}
									break;

								default:
									if (cnt79 >= 1) {
										break loop79;
									}
									if (state.backtracking > 0) {
										state.failed = true;
										return current;
									}
									EarlyExitException eee = new EarlyExitException(79, input);
									throw eee;
								}
								cnt79++;
							} while (true);

						}

					}
						break;

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleRecordUpdateExpr"

	// $ANTLR start "entryRuleTermExpr"
	// InternalAgreeParser.g:6020:1: entryRuleTermExpr returns [EObject current=null] : iv_ruleTermExpr= ruleTermExpr EOF ;
	public final EObject entryRuleTermExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleTermExpr = null;

		try {
			// InternalAgreeParser.g:6021:2: (iv_ruleTermExpr= ruleTermExpr EOF )
			// InternalAgreeParser.g:6022:2: iv_ruleTermExpr= ruleTermExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getTermExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleTermExpr = ruleTermExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleTermExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleTermExpr"

	// $ANTLR start "ruleTermExpr"
	// InternalAgreeParser.g:6029:1: ruleTermExpr returns [EObject current=null] : ( ( () otherlv_1= Time ) | this_ComplexExpr_2= ruleComplexExpr | ( () (
	// (lv_val_4_0= RULE_INTEGER_LIT ) ) ) | ( () otherlv_6= Pre otherlv_7= LeftParenthesis ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= RightParenthesis ) | ( ()
	// otherlv_11= Event otherlv_12= LeftParenthesis ( (lv_id_13_0= ruleNestedDotID ) ) otherlv_14= RightParenthesis ) | ( () otherlv_16= Latched otherlv_17=
	// LeftParenthesis ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= RightParenthesis ) | ( () otherlv_21= Timeof otherlv_22= LeftParenthesis ( (lv_id_23_0=
	// ruleNestedDotID ) ) otherlv_24= RightParenthesis ) | ( () otherlv_26= Timerise otherlv_27= LeftParenthesis ( (lv_id_28_0= ruleNestedDotID ) ) otherlv_29=
	// RightParenthesis ) | ( () otherlv_31= Timefall otherlv_32= LeftParenthesis ( (lv_id_33_0= ruleNestedDotID ) ) otherlv_34= RightParenthesis ) | ( () (
	// (lv_val_36_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_val_38_0= ruleBooleanLiteral ) ) ) | ( () otherlv_40= This (otherlv_41= FullStop ( (lv_subThis_42_0=
	// ruleNestedDotID ) ) )? ) | ( () otherlv_44= Floor otherlv_45= LeftParenthesis ( (lv_expr_46_0= ruleExpr ) ) otherlv_47= RightParenthesis ) | ( ()
	// otherlv_49= Real otherlv_50= LeftParenthesis ( (lv_expr_51_0= ruleExpr ) ) otherlv_52= RightParenthesis ) | ( () otherlv_54= Enum otherlv_55=
	// LeftParenthesis ( (lv_enumType_56_0= ruleNestedDotID ) ) otherlv_57= Comma ( (lv_value_58_0= RULE_ID ) ) otherlv_59= RightParenthesis ) | (otherlv_60=
	// LeftParenthesis this_Expr_61= ruleExpr otherlv_62= RightParenthesis ) ) ;
	public final EObject ruleTermExpr() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token lv_val_4_0 = null;
		Token otherlv_6 = null;
		Token otherlv_7 = null;
		Token otherlv_9 = null;
		Token otherlv_11 = null;
		Token otherlv_12 = null;
		Token otherlv_14 = null;
		Token otherlv_16 = null;
		Token otherlv_17 = null;
		Token otherlv_19 = null;
		Token otherlv_21 = null;
		Token otherlv_22 = null;
		Token otherlv_24 = null;
		Token otherlv_26 = null;
		Token otherlv_27 = null;
		Token otherlv_29 = null;
		Token otherlv_31 = null;
		Token otherlv_32 = null;
		Token otherlv_34 = null;
		Token lv_val_36_0 = null;
		Token otherlv_40 = null;
		Token otherlv_41 = null;
		Token otherlv_44 = null;
		Token otherlv_45 = null;
		Token otherlv_47 = null;
		Token otherlv_49 = null;
		Token otherlv_50 = null;
		Token otherlv_52 = null;
		Token otherlv_54 = null;
		Token otherlv_55 = null;
		Token otherlv_57 = null;
		Token lv_value_58_0 = null;
		Token otherlv_59 = null;
		Token otherlv_60 = null;
		Token otherlv_62 = null;
		EObject this_ComplexExpr_2 = null;

		EObject lv_expr_8_0 = null;

		EObject lv_id_13_0 = null;

		EObject lv_expr_18_0 = null;

		EObject lv_id_23_0 = null;

		EObject lv_id_28_0 = null;

		EObject lv_id_33_0 = null;

		EObject lv_val_38_0 = null;

		EObject lv_subThis_42_0 = null;

		EObject lv_expr_46_0 = null;

		EObject lv_expr_51_0 = null;

		EObject lv_enumType_56_0 = null;

		EObject this_Expr_61 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:6032:28: ( ( ( () otherlv_1= Time ) | this_ComplexExpr_2= ruleComplexExpr | ( () ( (lv_val_4_0= RULE_INTEGER_LIT ) ) ) | (
			// () otherlv_6= Pre otherlv_7= LeftParenthesis ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= RightParenthesis ) | ( () otherlv_11= Event otherlv_12=
			// LeftParenthesis ( (lv_id_13_0= ruleNestedDotID ) ) otherlv_14= RightParenthesis ) | ( () otherlv_16= Latched otherlv_17= LeftParenthesis (
			// (lv_expr_18_0= ruleExpr ) ) otherlv_19= RightParenthesis ) | ( () otherlv_21= Timeof otherlv_22= LeftParenthesis ( (lv_id_23_0= ruleNestedDotID )
			// ) otherlv_24= RightParenthesis ) | ( () otherlv_26= Timerise otherlv_27= LeftParenthesis ( (lv_id_28_0= ruleNestedDotID ) ) otherlv_29=
			// RightParenthesis ) | ( () otherlv_31= Timefall otherlv_32= LeftParenthesis ( (lv_id_33_0= ruleNestedDotID ) ) otherlv_34= RightParenthesis ) | (
			// () ( (lv_val_36_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_val_38_0= ruleBooleanLiteral ) ) ) | ( () otherlv_40= This (otherlv_41= FullStop (
			// (lv_subThis_42_0= ruleNestedDotID ) ) )? ) | ( () otherlv_44= Floor otherlv_45= LeftParenthesis ( (lv_expr_46_0= ruleExpr ) ) otherlv_47=
			// RightParenthesis ) | ( () otherlv_49= Real otherlv_50= LeftParenthesis ( (lv_expr_51_0= ruleExpr ) ) otherlv_52= RightParenthesis ) | ( ()
			// otherlv_54= Enum otherlv_55= LeftParenthesis ( (lv_enumType_56_0= ruleNestedDotID ) ) otherlv_57= Comma ( (lv_value_58_0= RULE_ID ) ) otherlv_59=
			// RightParenthesis ) | (otherlv_60= LeftParenthesis this_Expr_61= ruleExpr otherlv_62= RightParenthesis ) ) )
			// InternalAgreeParser.g:6033:1: ( ( () otherlv_1= Time ) | this_ComplexExpr_2= ruleComplexExpr | ( () ( (lv_val_4_0= RULE_INTEGER_LIT ) ) ) | ( ()
			// otherlv_6= Pre otherlv_7= LeftParenthesis ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= RightParenthesis ) | ( () otherlv_11= Event otherlv_12=
			// LeftParenthesis ( (lv_id_13_0= ruleNestedDotID ) ) otherlv_14= RightParenthesis ) | ( () otherlv_16= Latched otherlv_17= LeftParenthesis (
			// (lv_expr_18_0= ruleExpr ) ) otherlv_19= RightParenthesis ) | ( () otherlv_21= Timeof otherlv_22= LeftParenthesis ( (lv_id_23_0= ruleNestedDotID )
			// ) otherlv_24= RightParenthesis ) | ( () otherlv_26= Timerise otherlv_27= LeftParenthesis ( (lv_id_28_0= ruleNestedDotID ) ) otherlv_29=
			// RightParenthesis ) | ( () otherlv_31= Timefall otherlv_32= LeftParenthesis ( (lv_id_33_0= ruleNestedDotID ) ) otherlv_34= RightParenthesis ) | (
			// () ( (lv_val_36_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_val_38_0= ruleBooleanLiteral ) ) ) | ( () otherlv_40= This (otherlv_41= FullStop (
			// (lv_subThis_42_0= ruleNestedDotID ) ) )? ) | ( () otherlv_44= Floor otherlv_45= LeftParenthesis ( (lv_expr_46_0= ruleExpr ) ) otherlv_47=
			// RightParenthesis ) | ( () otherlv_49= Real otherlv_50= LeftParenthesis ( (lv_expr_51_0= ruleExpr ) ) otherlv_52= RightParenthesis ) | ( ()
			// otherlv_54= Enum otherlv_55= LeftParenthesis ( (lv_enumType_56_0= ruleNestedDotID ) ) otherlv_57= Comma ( (lv_value_58_0= RULE_ID ) ) otherlv_59=
			// RightParenthesis ) | (otherlv_60= LeftParenthesis this_Expr_61= ruleExpr otherlv_62= RightParenthesis ) )
			{
				// InternalAgreeParser.g:6033:1: ( ( () otherlv_1= Time ) | this_ComplexExpr_2= ruleComplexExpr | ( () ( (lv_val_4_0= RULE_INTEGER_LIT ) ) ) | (
				// () otherlv_6= Pre otherlv_7= LeftParenthesis ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= RightParenthesis ) | ( () otherlv_11= Event otherlv_12=
				// LeftParenthesis ( (lv_id_13_0= ruleNestedDotID ) ) otherlv_14= RightParenthesis ) | ( () otherlv_16= Latched otherlv_17= LeftParenthesis (
				// (lv_expr_18_0= ruleExpr ) ) otherlv_19= RightParenthesis ) | ( () otherlv_21= Timeof otherlv_22= LeftParenthesis ( (lv_id_23_0=
				// ruleNestedDotID ) ) otherlv_24= RightParenthesis ) | ( () otherlv_26= Timerise otherlv_27= LeftParenthesis ( (lv_id_28_0= ruleNestedDotID ) )
				// otherlv_29= RightParenthesis ) | ( () otherlv_31= Timefall otherlv_32= LeftParenthesis ( (lv_id_33_0= ruleNestedDotID ) ) otherlv_34=
				// RightParenthesis ) | ( () ( (lv_val_36_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_val_38_0= ruleBooleanLiteral ) ) ) | ( () otherlv_40= This
				// (otherlv_41= FullStop ( (lv_subThis_42_0= ruleNestedDotID ) ) )? ) | ( () otherlv_44= Floor otherlv_45= LeftParenthesis ( (lv_expr_46_0=
				// ruleExpr ) ) otherlv_47= RightParenthesis ) | ( () otherlv_49= Real otherlv_50= LeftParenthesis ( (lv_expr_51_0= ruleExpr ) ) otherlv_52=
				// RightParenthesis ) | ( () otherlv_54= Enum otherlv_55= LeftParenthesis ( (lv_enumType_56_0= ruleNestedDotID ) ) otherlv_57= Comma (
				// (lv_value_58_0= RULE_ID ) ) otherlv_59= RightParenthesis ) | (otherlv_60= LeftParenthesis this_Expr_61= ruleExpr otherlv_62= RightParenthesis
				// ) )
				int alt82 = 16;
				alt82 = dfa82.predict(input);
				switch (alt82) {
				case 1:
				// InternalAgreeParser.g:6033:2: ( () otherlv_1= Time )
				{
					// InternalAgreeParser.g:6033:2: ( () otherlv_1= Time )
					// InternalAgreeParser.g:6033:3: () otherlv_1= Time
					{
						// InternalAgreeParser.g:6033:3: ()
						// InternalAgreeParser.g:6034:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getTermExprAccess().getTimeExprAction_0_0(), current);

							}

						}

						otherlv_1 = (Token) match(input, Time, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_1, grammarAccess.getTermExprAccess().getTimeKeyword_0_1());

						}

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:6046:5: this_ComplexExpr_2= ruleComplexExpr
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getTermExprAccess().getComplexExprParserRuleCall_1());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_ComplexExpr_2 = ruleComplexExpr();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_ComplexExpr_2;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 3:
				// InternalAgreeParser.g:6055:6: ( () ( (lv_val_4_0= RULE_INTEGER_LIT ) ) )
				{
					// InternalAgreeParser.g:6055:6: ( () ( (lv_val_4_0= RULE_INTEGER_LIT ) ) )
					// InternalAgreeParser.g:6055:7: () ( (lv_val_4_0= RULE_INTEGER_LIT ) )
					{
						// InternalAgreeParser.g:6055:7: ()
						// InternalAgreeParser.g:6056:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getTermExprAccess().getIntLitExprAction_2_0(), current);

							}

						}

						// InternalAgreeParser.g:6061:2: ( (lv_val_4_0= RULE_INTEGER_LIT ) )
						// InternalAgreeParser.g:6062:1: (lv_val_4_0= RULE_INTEGER_LIT )
						{
							// InternalAgreeParser.g:6062:1: (lv_val_4_0= RULE_INTEGER_LIT )
							// InternalAgreeParser.g:6063:3: lv_val_4_0= RULE_INTEGER_LIT
							{
								lv_val_4_0 = (Token) match(input, RULE_INTEGER_LIT, FollowSets000.FOLLOW_2);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(lv_val_4_0, grammarAccess.getTermExprAccess()
											.getValINTEGER_LITTerminalRuleCall_2_1_0());

								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getTermExprRule());
									}
									setWithLastConsumed(current, "val", lv_val_4_0,
											"org.osate.xtext.aadl2.properties.Properties.INTEGER_LIT");

								}

							}

						}

					}

				}
					break;
				case 4:
				// InternalAgreeParser.g:6080:6: ( () otherlv_6= Pre otherlv_7= LeftParenthesis ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= RightParenthesis )
				{
					// InternalAgreeParser.g:6080:6: ( () otherlv_6= Pre otherlv_7= LeftParenthesis ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= RightParenthesis )
					// InternalAgreeParser.g:6080:7: () otherlv_6= Pre otherlv_7= LeftParenthesis ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= RightParenthesis
					{
						// InternalAgreeParser.g:6080:7: ()
						// InternalAgreeParser.g:6081:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getTermExprAccess().getPreExprAction_3_0(), current);

							}

						}

						otherlv_6 = (Token) match(input, Pre, FollowSets000.FOLLOW_48);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_6, grammarAccess.getTermExprAccess().getPreKeyword_3_1());

						}
						otherlv_7 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_7, grammarAccess.getTermExprAccess().getLeftParenthesisKeyword_3_2());

						}
						// InternalAgreeParser.g:6096:1: ( (lv_expr_8_0= ruleExpr ) )
						// InternalAgreeParser.g:6097:1: (lv_expr_8_0= ruleExpr )
						{
							// InternalAgreeParser.g:6097:1: (lv_expr_8_0= ruleExpr )
							// InternalAgreeParser.g:6098:3: lv_expr_8_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getTermExprAccess().getExprExprParserRuleCall_3_3_0());

								}
								pushFollow(FollowSets000.FOLLOW_36);
								lv_expr_8_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getTermExprRule());
									}
									set(current, "expr", lv_expr_8_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_9 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_9, grammarAccess.getTermExprAccess().getRightParenthesisKeyword_3_4());

						}

					}

				}
					break;
				case 5:
				// InternalAgreeParser.g:6120:6: ( () otherlv_11= Event otherlv_12= LeftParenthesis ( (lv_id_13_0= ruleNestedDotID ) ) otherlv_14=
				// RightParenthesis )
				{
					// InternalAgreeParser.g:6120:6: ( () otherlv_11= Event otherlv_12= LeftParenthesis ( (lv_id_13_0= ruleNestedDotID ) ) otherlv_14=
					// RightParenthesis )
					// InternalAgreeParser.g:6120:7: () otherlv_11= Event otherlv_12= LeftParenthesis ( (lv_id_13_0= ruleNestedDotID ) ) otherlv_14=
					// RightParenthesis
					{
						// InternalAgreeParser.g:6120:7: ()
						// InternalAgreeParser.g:6121:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getTermExprAccess().getEventExprAction_4_0(), current);

							}

						}

						otherlv_11 = (Token) match(input, Event, FollowSets000.FOLLOW_48);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_11, grammarAccess.getTermExprAccess().getEventKeyword_4_1());

						}
						otherlv_12 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_12, grammarAccess.getTermExprAccess().getLeftParenthesisKeyword_4_2());

						}
						// InternalAgreeParser.g:6136:1: ( (lv_id_13_0= ruleNestedDotID ) )
						// InternalAgreeParser.g:6137:1: (lv_id_13_0= ruleNestedDotID )
						{
							// InternalAgreeParser.g:6137:1: (lv_id_13_0= ruleNestedDotID )
							// InternalAgreeParser.g:6138:3: lv_id_13_0= ruleNestedDotID
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getTermExprAccess().getIdNestedDotIDParserRuleCall_4_3_0());

								}
								pushFollow(FollowSets000.FOLLOW_36);
								lv_id_13_0 = ruleNestedDotID();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getTermExprRule());
									}
									set(current, "id", lv_id_13_0, "com.rockwellcollins.atc.agree.Agree.NestedDotID");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_14 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_14, grammarAccess.getTermExprAccess().getRightParenthesisKeyword_4_4());

						}

					}

				}
					break;
				case 6:
				// InternalAgreeParser.g:6160:6: ( () otherlv_16= Latched otherlv_17= LeftParenthesis ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= RightParenthesis
				// )
				{
					// InternalAgreeParser.g:6160:6: ( () otherlv_16= Latched otherlv_17= LeftParenthesis ( (lv_expr_18_0= ruleExpr ) ) otherlv_19=
					// RightParenthesis )
					// InternalAgreeParser.g:6160:7: () otherlv_16= Latched otherlv_17= LeftParenthesis ( (lv_expr_18_0= ruleExpr ) ) otherlv_19=
					// RightParenthesis
					{
						// InternalAgreeParser.g:6160:7: ()
						// InternalAgreeParser.g:6161:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getTermExprAccess().getLatchedExprAction_5_0(), current);

							}

						}

						otherlv_16 = (Token) match(input, Latched, FollowSets000.FOLLOW_48);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_16, grammarAccess.getTermExprAccess().getLatchedKeyword_5_1());

						}
						otherlv_17 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_17, grammarAccess.getTermExprAccess().getLeftParenthesisKeyword_5_2());

						}
						// InternalAgreeParser.g:6176:1: ( (lv_expr_18_0= ruleExpr ) )
						// InternalAgreeParser.g:6177:1: (lv_expr_18_0= ruleExpr )
						{
							// InternalAgreeParser.g:6177:1: (lv_expr_18_0= ruleExpr )
							// InternalAgreeParser.g:6178:3: lv_expr_18_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getTermExprAccess().getExprExprParserRuleCall_5_3_0());

								}
								pushFollow(FollowSets000.FOLLOW_36);
								lv_expr_18_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getTermExprRule());
									}
									set(current, "expr", lv_expr_18_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_19 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_19, grammarAccess.getTermExprAccess().getRightParenthesisKeyword_5_4());

						}

					}

				}
					break;
				case 7:
				// InternalAgreeParser.g:6200:6: ( () otherlv_21= Timeof otherlv_22= LeftParenthesis ( (lv_id_23_0= ruleNestedDotID ) ) otherlv_24=
				// RightParenthesis )
				{
					// InternalAgreeParser.g:6200:6: ( () otherlv_21= Timeof otherlv_22= LeftParenthesis ( (lv_id_23_0= ruleNestedDotID ) ) otherlv_24=
					// RightParenthesis )
					// InternalAgreeParser.g:6200:7: () otherlv_21= Timeof otherlv_22= LeftParenthesis ( (lv_id_23_0= ruleNestedDotID ) ) otherlv_24=
					// RightParenthesis
					{
						// InternalAgreeParser.g:6200:7: ()
						// InternalAgreeParser.g:6201:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getTermExprAccess().getTimeOfExprAction_6_0(), current);

							}

						}

						otherlv_21 = (Token) match(input, Timeof, FollowSets000.FOLLOW_48);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_21, grammarAccess.getTermExprAccess().getTimeofKeyword_6_1());

						}
						otherlv_22 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_22, grammarAccess.getTermExprAccess().getLeftParenthesisKeyword_6_2());

						}
						// InternalAgreeParser.g:6216:1: ( (lv_id_23_0= ruleNestedDotID ) )
						// InternalAgreeParser.g:6217:1: (lv_id_23_0= ruleNestedDotID )
						{
							// InternalAgreeParser.g:6217:1: (lv_id_23_0= ruleNestedDotID )
							// InternalAgreeParser.g:6218:3: lv_id_23_0= ruleNestedDotID
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getTermExprAccess().getIdNestedDotIDParserRuleCall_6_3_0());

								}
								pushFollow(FollowSets000.FOLLOW_36);
								lv_id_23_0 = ruleNestedDotID();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getTermExprRule());
									}
									set(current, "id", lv_id_23_0, "com.rockwellcollins.atc.agree.Agree.NestedDotID");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_24 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_24, grammarAccess.getTermExprAccess().getRightParenthesisKeyword_6_4());

						}

					}

				}
					break;
				case 8:
				// InternalAgreeParser.g:6240:6: ( () otherlv_26= Timerise otherlv_27= LeftParenthesis ( (lv_id_28_0= ruleNestedDotID ) ) otherlv_29=
				// RightParenthesis )
				{
					// InternalAgreeParser.g:6240:6: ( () otherlv_26= Timerise otherlv_27= LeftParenthesis ( (lv_id_28_0= ruleNestedDotID ) ) otherlv_29=
					// RightParenthesis )
					// InternalAgreeParser.g:6240:7: () otherlv_26= Timerise otherlv_27= LeftParenthesis ( (lv_id_28_0= ruleNestedDotID ) ) otherlv_29=
					// RightParenthesis
					{
						// InternalAgreeParser.g:6240:7: ()
						// InternalAgreeParser.g:6241:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getTermExprAccess().getTimeRiseExprAction_7_0(), current);

							}

						}

						otherlv_26 = (Token) match(input, Timerise, FollowSets000.FOLLOW_48);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_26, grammarAccess.getTermExprAccess().getTimeriseKeyword_7_1());

						}
						otherlv_27 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_27, grammarAccess.getTermExprAccess().getLeftParenthesisKeyword_7_2());

						}
						// InternalAgreeParser.g:6256:1: ( (lv_id_28_0= ruleNestedDotID ) )
						// InternalAgreeParser.g:6257:1: (lv_id_28_0= ruleNestedDotID )
						{
							// InternalAgreeParser.g:6257:1: (lv_id_28_0= ruleNestedDotID )
							// InternalAgreeParser.g:6258:3: lv_id_28_0= ruleNestedDotID
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getTermExprAccess().getIdNestedDotIDParserRuleCall_7_3_0());

								}
								pushFollow(FollowSets000.FOLLOW_36);
								lv_id_28_0 = ruleNestedDotID();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getTermExprRule());
									}
									set(current, "id", lv_id_28_0, "com.rockwellcollins.atc.agree.Agree.NestedDotID");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_29 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_29, grammarAccess.getTermExprAccess().getRightParenthesisKeyword_7_4());

						}

					}

				}
					break;
				case 9:
				// InternalAgreeParser.g:6280:6: ( () otherlv_31= Timefall otherlv_32= LeftParenthesis ( (lv_id_33_0= ruleNestedDotID ) ) otherlv_34=
				// RightParenthesis )
				{
					// InternalAgreeParser.g:6280:6: ( () otherlv_31= Timefall otherlv_32= LeftParenthesis ( (lv_id_33_0= ruleNestedDotID ) ) otherlv_34=
					// RightParenthesis )
					// InternalAgreeParser.g:6280:7: () otherlv_31= Timefall otherlv_32= LeftParenthesis ( (lv_id_33_0= ruleNestedDotID ) ) otherlv_34=
					// RightParenthesis
					{
						// InternalAgreeParser.g:6280:7: ()
						// InternalAgreeParser.g:6281:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getTermExprAccess().getTimeFallExprAction_8_0(), current);

							}

						}

						otherlv_31 = (Token) match(input, Timefall, FollowSets000.FOLLOW_48);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_31, grammarAccess.getTermExprAccess().getTimefallKeyword_8_1());

						}
						otherlv_32 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_32, grammarAccess.getTermExprAccess().getLeftParenthesisKeyword_8_2());

						}
						// InternalAgreeParser.g:6296:1: ( (lv_id_33_0= ruleNestedDotID ) )
						// InternalAgreeParser.g:6297:1: (lv_id_33_0= ruleNestedDotID )
						{
							// InternalAgreeParser.g:6297:1: (lv_id_33_0= ruleNestedDotID )
							// InternalAgreeParser.g:6298:3: lv_id_33_0= ruleNestedDotID
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getTermExprAccess().getIdNestedDotIDParserRuleCall_8_3_0());

								}
								pushFollow(FollowSets000.FOLLOW_36);
								lv_id_33_0 = ruleNestedDotID();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getTermExprRule());
									}
									set(current, "id", lv_id_33_0, "com.rockwellcollins.atc.agree.Agree.NestedDotID");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_34 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_34, grammarAccess.getTermExprAccess().getRightParenthesisKeyword_8_4());

						}

					}

				}
					break;
				case 10:
				// InternalAgreeParser.g:6320:6: ( () ( (lv_val_36_0= RULE_REAL_LIT ) ) )
				{
					// InternalAgreeParser.g:6320:6: ( () ( (lv_val_36_0= RULE_REAL_LIT ) ) )
					// InternalAgreeParser.g:6320:7: () ( (lv_val_36_0= RULE_REAL_LIT ) )
					{
						// InternalAgreeParser.g:6320:7: ()
						// InternalAgreeParser.g:6321:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getTermExprAccess().getRealLitExprAction_9_0(), current);

							}

						}

						// InternalAgreeParser.g:6326:2: ( (lv_val_36_0= RULE_REAL_LIT ) )
						// InternalAgreeParser.g:6327:1: (lv_val_36_0= RULE_REAL_LIT )
						{
							// InternalAgreeParser.g:6327:1: (lv_val_36_0= RULE_REAL_LIT )
							// InternalAgreeParser.g:6328:3: lv_val_36_0= RULE_REAL_LIT
							{
								lv_val_36_0 = (Token) match(input, RULE_REAL_LIT, FollowSets000.FOLLOW_2);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(lv_val_36_0,
											grammarAccess.getTermExprAccess().getValREAL_LITTerminalRuleCall_9_1_0());

								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getTermExprRule());
									}
									setWithLastConsumed(current, "val", lv_val_36_0,
											"org.osate.xtext.aadl2.properties.Properties.REAL_LIT");

								}

							}

						}

					}

				}
					break;
				case 11:
				// InternalAgreeParser.g:6345:6: ( () ( (lv_val_38_0= ruleBooleanLiteral ) ) )
				{
					// InternalAgreeParser.g:6345:6: ( () ( (lv_val_38_0= ruleBooleanLiteral ) ) )
					// InternalAgreeParser.g:6345:7: () ( (lv_val_38_0= ruleBooleanLiteral ) )
					{
						// InternalAgreeParser.g:6345:7: ()
						// InternalAgreeParser.g:6346:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getTermExprAccess().getBoolLitExprAction_10_0(), current);

							}

						}

						// InternalAgreeParser.g:6351:2: ( (lv_val_38_0= ruleBooleanLiteral ) )
						// InternalAgreeParser.g:6352:1: (lv_val_38_0= ruleBooleanLiteral )
						{
							// InternalAgreeParser.g:6352:1: (lv_val_38_0= ruleBooleanLiteral )
							// InternalAgreeParser.g:6353:3: lv_val_38_0= ruleBooleanLiteral
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getTermExprAccess()
											.getValBooleanLiteralParserRuleCall_10_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_2);
								lv_val_38_0 = ruleBooleanLiteral();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getTermExprRule());
									}
									set(current, "val", lv_val_38_0,
											"org.osate.xtext.aadl2.properties.Properties.BooleanLiteral");
									afterParserOrEnumRuleCall();

								}

							}

						}

					}

				}
					break;
				case 12:
				// InternalAgreeParser.g:6370:6: ( () otherlv_40= This (otherlv_41= FullStop ( (lv_subThis_42_0= ruleNestedDotID ) ) )? )
				{
					// InternalAgreeParser.g:6370:6: ( () otherlv_40= This (otherlv_41= FullStop ( (lv_subThis_42_0= ruleNestedDotID ) ) )? )
					// InternalAgreeParser.g:6370:7: () otherlv_40= This (otherlv_41= FullStop ( (lv_subThis_42_0= ruleNestedDotID ) ) )?
					{
						// InternalAgreeParser.g:6370:7: ()
						// InternalAgreeParser.g:6371:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getTermExprAccess().getThisExprAction_11_0(), current);

							}

						}

						otherlv_40 = (Token) match(input, This, FollowSets000.FOLLOW_80);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_40, grammarAccess.getTermExprAccess().getThisKeyword_11_1());

						}
						// InternalAgreeParser.g:6381:1: (otherlv_41= FullStop ( (lv_subThis_42_0= ruleNestedDotID ) ) )?
						int alt81 = 2;
						int LA81_0 = input.LA(1);

						if ((LA81_0 == FullStop)) {
							alt81 = 1;
						}
						switch (alt81) {
						case 1:
						// InternalAgreeParser.g:6382:2: otherlv_41= FullStop ( (lv_subThis_42_0= ruleNestedDotID ) )
						{
							otherlv_41 = (Token) match(input, FullStop, FollowSets000.FOLLOW_11);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_41, grammarAccess.getTermExprAccess().getFullStopKeyword_11_2_0());

							}
							// InternalAgreeParser.g:6386:1: ( (lv_subThis_42_0= ruleNestedDotID ) )
							// InternalAgreeParser.g:6387:1: (lv_subThis_42_0= ruleNestedDotID )
							{
								// InternalAgreeParser.g:6387:1: (lv_subThis_42_0= ruleNestedDotID )
								// InternalAgreeParser.g:6388:3: lv_subThis_42_0= ruleNestedDotID
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getTermExprAccess()
												.getSubThisNestedDotIDParserRuleCall_11_2_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_2);
									lv_subThis_42_0 = ruleNestedDotID();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getTermExprRule());
										}
										set(current, "subThis", lv_subThis_42_0,
												"com.rockwellcollins.atc.agree.Agree.NestedDotID");
										afterParserOrEnumRuleCall();

									}

								}

							}

						}
							break;

						}

					}

				}
					break;
				case 13:
				// InternalAgreeParser.g:6405:6: ( () otherlv_44= Floor otherlv_45= LeftParenthesis ( (lv_expr_46_0= ruleExpr ) ) otherlv_47= RightParenthesis )
				{
					// InternalAgreeParser.g:6405:6: ( () otherlv_44= Floor otherlv_45= LeftParenthesis ( (lv_expr_46_0= ruleExpr ) ) otherlv_47=
					// RightParenthesis )
					// InternalAgreeParser.g:6405:7: () otherlv_44= Floor otherlv_45= LeftParenthesis ( (lv_expr_46_0= ruleExpr ) ) otherlv_47= RightParenthesis
					{
						// InternalAgreeParser.g:6405:7: ()
						// InternalAgreeParser.g:6406:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getTermExprAccess().getFloorCastAction_12_0(), current);

							}

						}

						otherlv_44 = (Token) match(input, Floor, FollowSets000.FOLLOW_48);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_44, grammarAccess.getTermExprAccess().getFloorKeyword_12_1());

						}
						otherlv_45 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_45, grammarAccess.getTermExprAccess().getLeftParenthesisKeyword_12_2());

						}
						// InternalAgreeParser.g:6421:1: ( (lv_expr_46_0= ruleExpr ) )
						// InternalAgreeParser.g:6422:1: (lv_expr_46_0= ruleExpr )
						{
							// InternalAgreeParser.g:6422:1: (lv_expr_46_0= ruleExpr )
							// InternalAgreeParser.g:6423:3: lv_expr_46_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getTermExprAccess().getExprExprParserRuleCall_12_3_0());

								}
								pushFollow(FollowSets000.FOLLOW_36);
								lv_expr_46_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getTermExprRule());
									}
									set(current, "expr", lv_expr_46_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_47 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_47,
									grammarAccess.getTermExprAccess().getRightParenthesisKeyword_12_4());

						}

					}

				}
					break;
				case 14:
				// InternalAgreeParser.g:6445:6: ( () otherlv_49= Real otherlv_50= LeftParenthesis ( (lv_expr_51_0= ruleExpr ) ) otherlv_52= RightParenthesis )
				{
					// InternalAgreeParser.g:6445:6: ( () otherlv_49= Real otherlv_50= LeftParenthesis ( (lv_expr_51_0= ruleExpr ) ) otherlv_52=
					// RightParenthesis )
					// InternalAgreeParser.g:6445:7: () otherlv_49= Real otherlv_50= LeftParenthesis ( (lv_expr_51_0= ruleExpr ) ) otherlv_52= RightParenthesis
					{
						// InternalAgreeParser.g:6445:7: ()
						// InternalAgreeParser.g:6446:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getTermExprAccess().getRealCastAction_13_0(), current);

							}

						}

						otherlv_49 = (Token) match(input, Real, FollowSets000.FOLLOW_48);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_49, grammarAccess.getTermExprAccess().getRealKeyword_13_1());

						}
						otherlv_50 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_50, grammarAccess.getTermExprAccess().getLeftParenthesisKeyword_13_2());

						}
						// InternalAgreeParser.g:6461:1: ( (lv_expr_51_0= ruleExpr ) )
						// InternalAgreeParser.g:6462:1: (lv_expr_51_0= ruleExpr )
						{
							// InternalAgreeParser.g:6462:1: (lv_expr_51_0= ruleExpr )
							// InternalAgreeParser.g:6463:3: lv_expr_51_0= ruleExpr
							{
								if (state.backtracking == 0) {

									newCompositeNode(
											grammarAccess.getTermExprAccess().getExprExprParserRuleCall_13_3_0());

								}
								pushFollow(FollowSets000.FOLLOW_36);
								lv_expr_51_0 = ruleExpr();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getTermExprRule());
									}
									set(current, "expr", lv_expr_51_0, "com.rockwellcollins.atc.agree.Agree.Expr");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_52 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_52,
									grammarAccess.getTermExprAccess().getRightParenthesisKeyword_13_4());

						}

					}

				}
					break;
				case 15:
				// InternalAgreeParser.g:6485:6: ( () otherlv_54= Enum otherlv_55= LeftParenthesis ( (lv_enumType_56_0= ruleNestedDotID ) ) otherlv_57= Comma (
				// (lv_value_58_0= RULE_ID ) ) otherlv_59= RightParenthesis )
				{
					// InternalAgreeParser.g:6485:6: ( () otherlv_54= Enum otherlv_55= LeftParenthesis ( (lv_enumType_56_0= ruleNestedDotID ) ) otherlv_57=
					// Comma ( (lv_value_58_0= RULE_ID ) ) otherlv_59= RightParenthesis )
					// InternalAgreeParser.g:6485:7: () otherlv_54= Enum otherlv_55= LeftParenthesis ( (lv_enumType_56_0= ruleNestedDotID ) ) otherlv_57= Comma
					// ( (lv_value_58_0= RULE_ID ) ) otherlv_59= RightParenthesis
					{
						// InternalAgreeParser.g:6485:7: ()
						// InternalAgreeParser.g:6486:5:
						{
							if (state.backtracking == 0) {

								current = forceCreateModelElement(
										grammarAccess.getTermExprAccess().getAADLEnumeratorAction_14_0(), current);

							}

						}

						otherlv_54 = (Token) match(input, Enum, FollowSets000.FOLLOW_48);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_54, grammarAccess.getTermExprAccess().getEnumKeyword_14_1());

						}
						otherlv_55 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_55, grammarAccess.getTermExprAccess().getLeftParenthesisKeyword_14_2());

						}
						// InternalAgreeParser.g:6501:1: ( (lv_enumType_56_0= ruleNestedDotID ) )
						// InternalAgreeParser.g:6502:1: (lv_enumType_56_0= ruleNestedDotID )
						{
							// InternalAgreeParser.g:6502:1: (lv_enumType_56_0= ruleNestedDotID )
							// InternalAgreeParser.g:6503:3: lv_enumType_56_0= ruleNestedDotID
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getTermExprAccess()
											.getEnumTypeNestedDotIDParserRuleCall_14_3_0());

								}
								pushFollow(FollowSets000.FOLLOW_34);
								lv_enumType_56_0 = ruleNestedDotID();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getTermExprRule());
									}
									set(current, "enumType", lv_enumType_56_0,
											"com.rockwellcollins.atc.agree.Agree.NestedDotID");
									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_57 = (Token) match(input, Comma, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_57, grammarAccess.getTermExprAccess().getCommaKeyword_14_4());

						}
						// InternalAgreeParser.g:6524:1: ( (lv_value_58_0= RULE_ID ) )
						// InternalAgreeParser.g:6525:1: (lv_value_58_0= RULE_ID )
						{
							// InternalAgreeParser.g:6525:1: (lv_value_58_0= RULE_ID )
							// InternalAgreeParser.g:6526:3: lv_value_58_0= RULE_ID
							{
								lv_value_58_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_36);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(lv_value_58_0,
											grammarAccess.getTermExprAccess().getValueIDTerminalRuleCall_14_5_0());

								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getTermExprRule());
									}
									setWithLastConsumed(current, "value", lv_value_58_0,
											"org.osate.xtext.aadl2.properties.Properties.ID");

								}

							}

						}

						otherlv_59 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_59,
									grammarAccess.getTermExprAccess().getRightParenthesisKeyword_14_6());

						}

					}

				}
					break;
				case 16:
				// InternalAgreeParser.g:6548:6: (otherlv_60= LeftParenthesis this_Expr_61= ruleExpr otherlv_62= RightParenthesis )
				{
					// InternalAgreeParser.g:6548:6: (otherlv_60= LeftParenthesis this_Expr_61= ruleExpr otherlv_62= RightParenthesis )
					// InternalAgreeParser.g:6549:2: otherlv_60= LeftParenthesis this_Expr_61= ruleExpr otherlv_62= RightParenthesis
					{
						otherlv_60 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_60, grammarAccess.getTermExprAccess().getLeftParenthesisKeyword_15_0());

						}
						if (state.backtracking == 0) {

							newCompositeNode(grammarAccess.getTermExprAccess().getExprParserRuleCall_15_1());

						}
						pushFollow(FollowSets000.FOLLOW_36);
						this_Expr_61 = ruleExpr();

						state._fsp--;
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							current = this_Expr_61;
							afterParserOrEnumRuleCall();

						}
						otherlv_62 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_62,
									grammarAccess.getTermExprAccess().getRightParenthesisKeyword_15_2());

						}

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleTermExpr"

	// $ANTLR start "entryRuleComplexExpr"
	// InternalAgreeParser.g:6575:1: entryRuleComplexExpr returns [EObject current=null] : iv_ruleComplexExpr= ruleComplexExpr EOF ;
	public final EObject entryRuleComplexExpr() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleComplexExpr = null;

		try {
			// InternalAgreeParser.g:6576:2: (iv_ruleComplexExpr= ruleComplexExpr EOF )
			// InternalAgreeParser.g:6577:2: iv_ruleComplexExpr= ruleComplexExpr EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getComplexExprRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleComplexExpr = ruleComplexExpr();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleComplexExpr;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleComplexExpr"

	// $ANTLR start "ruleComplexExpr"
	// InternalAgreeParser.g:6584:1: ruleComplexExpr returns [EObject current=null] : (this_NestedDotID_0= ruleNestedDotID ( ( ( ( ( () LeftParenthesis ) )=> (
	// () otherlv_2= LeftParenthesis ) ) ( ( (lv_args_3_0= ruleExpr ) ) (otherlv_4= Comma ( (lv_args_5_0= ruleExpr ) ) )* )? otherlv_6= RightParenthesis ) | ( (
	// ( ( () LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () otherlv_8= LeftCurlyBracket ( (otherlv_9= RULE_ID ) ) otherlv_10= EqualsSign ) ) (
	// (lv_argExpr_11_0= ruleExpr ) ) (otherlv_12= Semicolon ( (otherlv_13= RULE_ID ) ) otherlv_14= EqualsSign ( (lv_argExpr_15_0= ruleExpr ) ) )* otherlv_16=
	// RightCurlyBracket ) )? ) ;
	public final EObject ruleComplexExpr() throws RecognitionException {
		EObject current = null;

		Token otherlv_2 = null;
		Token otherlv_4 = null;
		Token otherlv_6 = null;
		Token otherlv_8 = null;
		Token otherlv_9 = null;
		Token otherlv_10 = null;
		Token otherlv_12 = null;
		Token otherlv_13 = null;
		Token otherlv_14 = null;
		Token otherlv_16 = null;
		EObject this_NestedDotID_0 = null;

		EObject lv_args_3_0 = null;

		EObject lv_args_5_0 = null;

		EObject lv_argExpr_11_0 = null;

		EObject lv_argExpr_15_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:6587:28: ( (this_NestedDotID_0= ruleNestedDotID ( ( ( ( ( () LeftParenthesis ) )=> ( () otherlv_2= LeftParenthesis ) ) ( (
			// (lv_args_3_0= ruleExpr ) ) (otherlv_4= Comma ( (lv_args_5_0= ruleExpr ) ) )* )? otherlv_6= RightParenthesis ) | ( ( ( ( () LeftCurlyBracket ( (
			// RULE_ID ) ) EqualsSign ) )=> ( () otherlv_8= LeftCurlyBracket ( (otherlv_9= RULE_ID ) ) otherlv_10= EqualsSign ) ) ( (lv_argExpr_11_0= ruleExpr )
			// ) (otherlv_12= Semicolon ( (otherlv_13= RULE_ID ) ) otherlv_14= EqualsSign ( (lv_argExpr_15_0= ruleExpr ) ) )* otherlv_16= RightCurlyBracket ) )?
			// ) )
			// InternalAgreeParser.g:6588:1: (this_NestedDotID_0= ruleNestedDotID ( ( ( ( ( () LeftParenthesis ) )=> ( () otherlv_2= LeftParenthesis ) ) ( (
			// (lv_args_3_0= ruleExpr ) ) (otherlv_4= Comma ( (lv_args_5_0= ruleExpr ) ) )* )? otherlv_6= RightParenthesis ) | ( ( ( ( () LeftCurlyBracket ( (
			// RULE_ID ) ) EqualsSign ) )=> ( () otherlv_8= LeftCurlyBracket ( (otherlv_9= RULE_ID ) ) otherlv_10= EqualsSign ) ) ( (lv_argExpr_11_0= ruleExpr )
			// ) (otherlv_12= Semicolon ( (otherlv_13= RULE_ID ) ) otherlv_14= EqualsSign ( (lv_argExpr_15_0= ruleExpr ) ) )* otherlv_16= RightCurlyBracket ) )?
			// )
			{
				// InternalAgreeParser.g:6588:1: (this_NestedDotID_0= ruleNestedDotID ( ( ( ( ( () LeftParenthesis ) )=> ( () otherlv_2= LeftParenthesis ) ) ( (
				// (lv_args_3_0= ruleExpr ) ) (otherlv_4= Comma ( (lv_args_5_0= ruleExpr ) ) )* )? otherlv_6= RightParenthesis ) | ( ( ( ( () LeftCurlyBracket (
				// ( RULE_ID ) ) EqualsSign ) )=> ( () otherlv_8= LeftCurlyBracket ( (otherlv_9= RULE_ID ) ) otherlv_10= EqualsSign ) ) ( (lv_argExpr_11_0=
				// ruleExpr ) ) (otherlv_12= Semicolon ( (otherlv_13= RULE_ID ) ) otherlv_14= EqualsSign ( (lv_argExpr_15_0= ruleExpr ) ) )* otherlv_16=
				// RightCurlyBracket ) )? )
				// InternalAgreeParser.g:6589:5: this_NestedDotID_0= ruleNestedDotID ( ( ( ( ( () LeftParenthesis ) )=> ( () otherlv_2= LeftParenthesis ) ) ( (
				// (lv_args_3_0= ruleExpr ) ) (otherlv_4= Comma ( (lv_args_5_0= ruleExpr ) ) )* )? otherlv_6= RightParenthesis ) | ( ( ( ( () LeftCurlyBracket (
				// ( RULE_ID ) ) EqualsSign ) )=> ( () otherlv_8= LeftCurlyBracket ( (otherlv_9= RULE_ID ) ) otherlv_10= EqualsSign ) ) ( (lv_argExpr_11_0=
				// ruleExpr ) ) (otherlv_12= Semicolon ( (otherlv_13= RULE_ID ) ) otherlv_14= EqualsSign ( (lv_argExpr_15_0= ruleExpr ) ) )* otherlv_16=
				// RightCurlyBracket ) )?
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getComplexExprAccess().getNestedDotIDParserRuleCall_0());

					}
					pushFollow(FollowSets000.FOLLOW_81);
					this_NestedDotID_0 = ruleNestedDotID();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_NestedDotID_0;
						afterParserOrEnumRuleCall();

					}
					// InternalAgreeParser.g:6597:1: ( ( ( ( ( () LeftParenthesis ) )=> ( () otherlv_2= LeftParenthesis ) ) ( ( (lv_args_3_0= ruleExpr ) )
					// (otherlv_4= Comma ( (lv_args_5_0= ruleExpr ) ) )* )? otherlv_6= RightParenthesis ) | ( ( ( ( () LeftCurlyBracket ( ( RULE_ID ) )
					// EqualsSign ) )=> ( () otherlv_8= LeftCurlyBracket ( (otherlv_9= RULE_ID ) ) otherlv_10= EqualsSign ) ) ( (lv_argExpr_11_0= ruleExpr ) )
					// (otherlv_12= Semicolon ( (otherlv_13= RULE_ID ) ) otherlv_14= EqualsSign ( (lv_argExpr_15_0= ruleExpr ) ) )* otherlv_16=
					// RightCurlyBracket ) )?
					int alt86 = 3;
					int LA86_0 = input.LA(1);

					if ((LA86_0 == LeftParenthesis) && (synpred23_InternalAgreeParser())) {
						alt86 = 1;
					} else if ((LA86_0 == LeftCurlyBracket)) {
						int LA86_2 = input.LA(2);

						if ((LA86_2 == RULE_ID)) {
							int LA86_4 = input.LA(3);

							if ((LA86_4 == EqualsSign) && (synpred24_InternalAgreeParser())) {
								alt86 = 2;
							}
						}
					}
					switch (alt86) {
					case 1:
					// InternalAgreeParser.g:6597:2: ( ( ( ( () LeftParenthesis ) )=> ( () otherlv_2= LeftParenthesis ) ) ( ( (lv_args_3_0= ruleExpr ) )
					// (otherlv_4= Comma ( (lv_args_5_0= ruleExpr ) ) )* )? otherlv_6= RightParenthesis )
					{
						// InternalAgreeParser.g:6597:2: ( ( ( ( () LeftParenthesis ) )=> ( () otherlv_2= LeftParenthesis ) ) ( ( (lv_args_3_0= ruleExpr ) )
						// (otherlv_4= Comma ( (lv_args_5_0= ruleExpr ) ) )* )? otherlv_6= RightParenthesis )
						// InternalAgreeParser.g:6597:3: ( ( ( () LeftParenthesis ) )=> ( () otherlv_2= LeftParenthesis ) ) ( ( (lv_args_3_0= ruleExpr ) )
						// (otherlv_4= Comma ( (lv_args_5_0= ruleExpr ) ) )* )? otherlv_6= RightParenthesis
						{
							// InternalAgreeParser.g:6597:3: ( ( ( () LeftParenthesis ) )=> ( () otherlv_2= LeftParenthesis ) )
							// InternalAgreeParser.g:6597:4: ( ( () LeftParenthesis ) )=> ( () otherlv_2= LeftParenthesis )
							{
								// InternalAgreeParser.g:6600:5: ( () otherlv_2= LeftParenthesis )
								// InternalAgreeParser.g:6600:6: () otherlv_2= LeftParenthesis
								{
									// InternalAgreeParser.g:6600:6: ()
									// InternalAgreeParser.g:6601:5:
									{
										if (state.backtracking == 0) {

											current = forceCreateModelElementAndSet(grammarAccess.getComplexExprAccess()
													.getFnCallExprFnAction_1_0_0_0_0(), current);

										}

									}

									otherlv_2 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_82);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(otherlv_2, grammarAccess.getComplexExprAccess()
												.getLeftParenthesisKeyword_1_0_0_0_1());

									}

								}

							}

							// InternalAgreeParser.g:6611:3: ( ( (lv_args_3_0= ruleExpr ) ) (otherlv_4= Comma ( (lv_args_5_0= ruleExpr ) ) )* )?
							int alt84 = 2;
							int LA84_0 = input.LA(1);

							if ((LA84_0 == Get_Property || (LA84_0 >= Timefall && LA84_0 <= Timerise)
									|| LA84_0 == Latched || LA84_0 == Timeof || (LA84_0 >= Event && LA84_0 <= Floor)
									|| LA84_0 == Enum || (LA84_0 >= Prev && LA84_0 <= Real)
									|| (LA84_0 >= This && LA84_0 <= True) || (LA84_0 >= Not && LA84_0 <= Pre)
									|| LA84_0 == If || LA84_0 == LeftParenthesis || LA84_0 == HyphenMinus
									|| LA84_0 == RULE_REAL_LIT || LA84_0 == RULE_INTEGER_LIT || LA84_0 == RULE_ID)) {
								alt84 = 1;
							}
							switch (alt84) {
							case 1:
							// InternalAgreeParser.g:6611:4: ( (lv_args_3_0= ruleExpr ) ) (otherlv_4= Comma ( (lv_args_5_0= ruleExpr ) ) )*
							{
								// InternalAgreeParser.g:6611:4: ( (lv_args_3_0= ruleExpr ) )
								// InternalAgreeParser.g:6612:1: (lv_args_3_0= ruleExpr )
								{
									// InternalAgreeParser.g:6612:1: (lv_args_3_0= ruleExpr )
									// InternalAgreeParser.g:6613:3: lv_args_3_0= ruleExpr
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getComplexExprAccess()
													.getArgsExprParserRuleCall_1_0_1_0_0());

										}
										pushFollow(FollowSets000.FOLLOW_49);
										lv_args_3_0 = ruleExpr();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getComplexExprRule());
											}
											add(current, "args", lv_args_3_0,
													"com.rockwellcollins.atc.agree.Agree.Expr");
											afterParserOrEnumRuleCall();

										}

									}

								}

								// InternalAgreeParser.g:6629:2: (otherlv_4= Comma ( (lv_args_5_0= ruleExpr ) ) )*
								loop83: do {
									int alt83 = 2;
									int LA83_0 = input.LA(1);

									if ((LA83_0 == Comma)) {
										alt83 = 1;
									}

									switch (alt83) {
									case 1:
									// InternalAgreeParser.g:6630:2: otherlv_4= Comma ( (lv_args_5_0= ruleExpr ) )
									{
										otherlv_4 = (Token) match(input, Comma, FollowSets000.FOLLOW_9);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(otherlv_4,
													grammarAccess.getComplexExprAccess().getCommaKeyword_1_0_1_1_0());

										}
										// InternalAgreeParser.g:6634:1: ( (lv_args_5_0= ruleExpr ) )
										// InternalAgreeParser.g:6635:1: (lv_args_5_0= ruleExpr )
										{
											// InternalAgreeParser.g:6635:1: (lv_args_5_0= ruleExpr )
											// InternalAgreeParser.g:6636:3: lv_args_5_0= ruleExpr
											{
												if (state.backtracking == 0) {

													newCompositeNode(grammarAccess.getComplexExprAccess()
															.getArgsExprParserRuleCall_1_0_1_1_1_0());

												}
												pushFollow(FollowSets000.FOLLOW_49);
												lv_args_5_0 = ruleExpr();

												state._fsp--;
												if (state.failed) {
													return current;
												}
												if (state.backtracking == 0) {

													if (current == null) {
														current = createModelElementForParent(
																grammarAccess.getComplexExprRule());
													}
													add(current, "args", lv_args_5_0,
															"com.rockwellcollins.atc.agree.Agree.Expr");
													afterParserOrEnumRuleCall();

												}

											}

										}

									}
										break;

									default:
										break loop83;
									}
								} while (true);

							}
								break;

							}

							otherlv_6 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_6,
										grammarAccess.getComplexExprAccess().getRightParenthesisKeyword_1_0_2());

							}

						}

					}
						break;
					case 2:
					// InternalAgreeParser.g:6658:6: ( ( ( ( () LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () otherlv_8= LeftCurlyBracket ( (otherlv_9=
					// RULE_ID ) ) otherlv_10= EqualsSign ) ) ( (lv_argExpr_11_0= ruleExpr ) ) (otherlv_12= Semicolon ( (otherlv_13= RULE_ID ) ) otherlv_14=
					// EqualsSign ( (lv_argExpr_15_0= ruleExpr ) ) )* otherlv_16= RightCurlyBracket )
					{
						// InternalAgreeParser.g:6658:6: ( ( ( ( () LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () otherlv_8= LeftCurlyBracket (
						// (otherlv_9= RULE_ID ) ) otherlv_10= EqualsSign ) ) ( (lv_argExpr_11_0= ruleExpr ) ) (otherlv_12= Semicolon ( (otherlv_13= RULE_ID ) )
						// otherlv_14= EqualsSign ( (lv_argExpr_15_0= ruleExpr ) ) )* otherlv_16= RightCurlyBracket )
						// InternalAgreeParser.g:6658:7: ( ( ( () LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () otherlv_8= LeftCurlyBracket (
						// (otherlv_9= RULE_ID ) ) otherlv_10= EqualsSign ) ) ( (lv_argExpr_11_0= ruleExpr ) ) (otherlv_12= Semicolon ( (otherlv_13= RULE_ID ) )
						// otherlv_14= EqualsSign ( (lv_argExpr_15_0= ruleExpr ) ) )* otherlv_16= RightCurlyBracket
						{
							// InternalAgreeParser.g:6658:7: ( ( ( () LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () otherlv_8= LeftCurlyBracket (
							// (otherlv_9= RULE_ID ) ) otherlv_10= EqualsSign ) )
							// InternalAgreeParser.g:6658:8: ( ( () LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () otherlv_8= LeftCurlyBracket (
							// (otherlv_9= RULE_ID ) ) otherlv_10= EqualsSign )
							{
								// InternalAgreeParser.g:6668:5: ( () otherlv_8= LeftCurlyBracket ( (otherlv_9= RULE_ID ) ) otherlv_10= EqualsSign )
								// InternalAgreeParser.g:6668:6: () otherlv_8= LeftCurlyBracket ( (otherlv_9= RULE_ID ) ) otherlv_10= EqualsSign
								{
									// InternalAgreeParser.g:6668:6: ()
									// InternalAgreeParser.g:6669:5:
									{
										if (state.backtracking == 0) {

											current = forceCreateModelElementAndSet(grammarAccess.getComplexExprAccess()
													.getRecordExprRecordAction_1_1_0_0_0(), current);

										}

									}

									otherlv_8 = (Token) match(input, LeftCurlyBracket, FollowSets000.FOLLOW_11);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(otherlv_8, grammarAccess.getComplexExprAccess()
												.getLeftCurlyBracketKeyword_1_1_0_0_1());

									}
									// InternalAgreeParser.g:6679:1: ( (otherlv_9= RULE_ID ) )
									// InternalAgreeParser.g:6680:1: (otherlv_9= RULE_ID )
									{
										// InternalAgreeParser.g:6680:1: (otherlv_9= RULE_ID )
										// InternalAgreeParser.g:6681:3: otherlv_9= RULE_ID
										{
											if (state.backtracking == 0) {

												if (current == null) {
													current = createModelElement(grammarAccess.getComplexExprRule());
												}

											}
											otherlv_9 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_44);
											if (state.failed) {
												return current;
											}
											if (state.backtracking == 0) {

												newLeafNode(otherlv_9, grammarAccess.getComplexExprAccess()
														.getArgsNamedElementCrossReference_1_1_0_0_2_0());

											}

										}

									}

									otherlv_10 = (Token) match(input, EqualsSign, FollowSets000.FOLLOW_9);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(otherlv_10,
												grammarAccess.getComplexExprAccess().getEqualsSignKeyword_1_1_0_0_3());

									}

								}

							}

							// InternalAgreeParser.g:6697:3: ( (lv_argExpr_11_0= ruleExpr ) )
							// InternalAgreeParser.g:6698:1: (lv_argExpr_11_0= ruleExpr )
							{
								// InternalAgreeParser.g:6698:1: (lv_argExpr_11_0= ruleExpr )
								// InternalAgreeParser.g:6699:3: lv_argExpr_11_0= ruleExpr
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getComplexExprAccess()
												.getArgExprExprParserRuleCall_1_1_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_83);
									lv_argExpr_11_0 = ruleExpr();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(grammarAccess.getComplexExprRule());
										}
										add(current, "argExpr", lv_argExpr_11_0,
												"com.rockwellcollins.atc.agree.Agree.Expr");
										afterParserOrEnumRuleCall();

									}

								}

							}

							// InternalAgreeParser.g:6715:2: (otherlv_12= Semicolon ( (otherlv_13= RULE_ID ) ) otherlv_14= EqualsSign ( (lv_argExpr_15_0=
							// ruleExpr ) ) )*
							loop85: do {
								int alt85 = 2;
								int LA85_0 = input.LA(1);

								if ((LA85_0 == Semicolon)) {
									alt85 = 1;
								}

								switch (alt85) {
								case 1:
								// InternalAgreeParser.g:6716:2: otherlv_12= Semicolon ( (otherlv_13= RULE_ID ) ) otherlv_14= EqualsSign ( (lv_argExpr_15_0=
								// ruleExpr ) )
								{
									otherlv_12 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_11);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(otherlv_12,
												grammarAccess.getComplexExprAccess().getSemicolonKeyword_1_1_2_0());

									}
									// InternalAgreeParser.g:6720:1: ( (otherlv_13= RULE_ID ) )
									// InternalAgreeParser.g:6721:1: (otherlv_13= RULE_ID )
									{
										// InternalAgreeParser.g:6721:1: (otherlv_13= RULE_ID )
										// InternalAgreeParser.g:6722:3: otherlv_13= RULE_ID
										{
											if (state.backtracking == 0) {

												if (current == null) {
													current = createModelElement(grammarAccess.getComplexExprRule());
												}

											}
											otherlv_13 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_44);
											if (state.failed) {
												return current;
											}
											if (state.backtracking == 0) {

												newLeafNode(otherlv_13, grammarAccess.getComplexExprAccess()
														.getArgsNamedElementCrossReference_1_1_2_1_0());

											}

										}

									}

									otherlv_14 = (Token) match(input, EqualsSign, FollowSets000.FOLLOW_9);
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										newLeafNode(otherlv_14,
												grammarAccess.getComplexExprAccess().getEqualsSignKeyword_1_1_2_2());

									}
									// InternalAgreeParser.g:6738:1: ( (lv_argExpr_15_0= ruleExpr ) )
									// InternalAgreeParser.g:6739:1: (lv_argExpr_15_0= ruleExpr )
									{
										// InternalAgreeParser.g:6739:1: (lv_argExpr_15_0= ruleExpr )
										// InternalAgreeParser.g:6740:3: lv_argExpr_15_0= ruleExpr
										{
											if (state.backtracking == 0) {

												newCompositeNode(grammarAccess.getComplexExprAccess()
														.getArgExprExprParserRuleCall_1_1_2_3_0());

											}
											pushFollow(FollowSets000.FOLLOW_83);
											lv_argExpr_15_0 = ruleExpr();

											state._fsp--;
											if (state.failed) {
												return current;
											}
											if (state.backtracking == 0) {

												if (current == null) {
													current = createModelElementForParent(
															grammarAccess.getComplexExprRule());
												}
												add(current, "argExpr", lv_argExpr_15_0,
														"com.rockwellcollins.atc.agree.Agree.Expr");
												afterParserOrEnumRuleCall();

											}

										}

									}

								}
									break;

								default:
									break loop85;
								}
							} while (true);

							otherlv_16 = (Token) match(input, RightCurlyBracket, FollowSets000.FOLLOW_2);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_16,
										grammarAccess.getComplexExprAccess().getRightCurlyBracketKeyword_1_1_3());

							}

						}

					}
						break;

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleComplexExpr"

	// $ANTLR start "entryRuleNestedDotID"
	// InternalAgreeParser.g:6769:1: entryRuleNestedDotID returns [EObject current=null] : iv_ruleNestedDotID= ruleNestedDotID EOF ;
	public final EObject entryRuleNestedDotID() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNestedDotID = null;

		try {
			// InternalAgreeParser.g:6770:2: (iv_ruleNestedDotID= ruleNestedDotID EOF )
			// InternalAgreeParser.g:6771:2: iv_ruleNestedDotID= ruleNestedDotID EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getNestedDotIDRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleNestedDotID = ruleNestedDotID();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleNestedDotID;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleNestedDotID"

	// $ANTLR start "ruleNestedDotID"
	// InternalAgreeParser.g:6778:1: ruleNestedDotID returns [EObject current=null] : ( ( ( ruleQCPREF ) ) ( ( ( FullStop ( ( ( ruleReservedVarTag ) ) | ( (
	// ruleNestedDotID ) ) ) ) )=> (otherlv_1= FullStop ( ( (lv_tag_2_0= ruleReservedVarTag ) ) | ( (lv_sub_3_0= ruleNestedDotID ) ) ) ) )? ) ;
	public final EObject ruleNestedDotID() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		AntlrDatatypeRuleToken lv_tag_2_0 = null;

		EObject lv_sub_3_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:6781:28: ( ( ( ( ruleQCPREF ) ) ( ( ( FullStop ( ( ( ruleReservedVarTag ) ) | ( ( ruleNestedDotID ) ) ) ) )=> (otherlv_1=
			// FullStop ( ( (lv_tag_2_0= ruleReservedVarTag ) ) | ( (lv_sub_3_0= ruleNestedDotID ) ) ) ) )? ) )
			// InternalAgreeParser.g:6782:1: ( ( ( ruleQCPREF ) ) ( ( ( FullStop ( ( ( ruleReservedVarTag ) ) | ( ( ruleNestedDotID ) ) ) ) )=> (otherlv_1=
			// FullStop ( ( (lv_tag_2_0= ruleReservedVarTag ) ) | ( (lv_sub_3_0= ruleNestedDotID ) ) ) ) )? )
			{
				// InternalAgreeParser.g:6782:1: ( ( ( ruleQCPREF ) ) ( ( ( FullStop ( ( ( ruleReservedVarTag ) ) | ( ( ruleNestedDotID ) ) ) ) )=> (otherlv_1=
				// FullStop ( ( (lv_tag_2_0= ruleReservedVarTag ) ) | ( (lv_sub_3_0= ruleNestedDotID ) ) ) ) )? )
				// InternalAgreeParser.g:6782:2: ( ( ruleQCPREF ) ) ( ( ( FullStop ( ( ( ruleReservedVarTag ) ) | ( ( ruleNestedDotID ) ) ) ) )=> (otherlv_1=
				// FullStop ( ( (lv_tag_2_0= ruleReservedVarTag ) ) | ( (lv_sub_3_0= ruleNestedDotID ) ) ) ) )?
				{
					// InternalAgreeParser.g:6782:2: ( ( ruleQCPREF ) )
					// InternalAgreeParser.g:6783:1: ( ruleQCPREF )
					{
						// InternalAgreeParser.g:6783:1: ( ruleQCPREF )
						// InternalAgreeParser.g:6784:3: ruleQCPREF
						{
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getNestedDotIDRule());
								}

							}
							if (state.backtracking == 0) {

								newCompositeNode(
										grammarAccess.getNestedDotIDAccess().getBaseNamedElementCrossReference_0_0());

							}
							pushFollow(FollowSets000.FOLLOW_80);
							ruleQCPREF();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								afterParserOrEnumRuleCall();

							}

						}

					}

					// InternalAgreeParser.g:6798:2: ( ( ( FullStop ( ( ( ruleReservedVarTag ) ) | ( ( ruleNestedDotID ) ) ) ) )=> (otherlv_1= FullStop ( (
					// (lv_tag_2_0= ruleReservedVarTag ) ) | ( (lv_sub_3_0= ruleNestedDotID ) ) ) ) )?
					int alt88 = 2;
					int LA88_0 = input.LA(1);

					if ((LA88_0 == FullStop) && (synpred25_InternalAgreeParser())) {
						alt88 = 1;
					}
					switch (alt88) {
					case 1:
					// InternalAgreeParser.g:6798:3: ( ( FullStop ( ( ( ruleReservedVarTag ) ) | ( ( ruleNestedDotID ) ) ) ) )=> (otherlv_1= FullStop ( (
					// (lv_tag_2_0= ruleReservedVarTag ) ) | ( (lv_sub_3_0= ruleNestedDotID ) ) ) )
					{
						// InternalAgreeParser.g:6809:7: (otherlv_1= FullStop ( ( (lv_tag_2_0= ruleReservedVarTag ) ) | ( (lv_sub_3_0= ruleNestedDotID ) ) ) )
						// InternalAgreeParser.g:6810:2: otherlv_1= FullStop ( ( (lv_tag_2_0= ruleReservedVarTag ) ) | ( (lv_sub_3_0= ruleNestedDotID ) ) )
						{
							otherlv_1 = (Token) match(input, FullStop, FollowSets000.FOLLOW_84);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_1, grammarAccess.getNestedDotIDAccess().getFullStopKeyword_1_0_0());

							}
							// InternalAgreeParser.g:6814:1: ( ( (lv_tag_2_0= ruleReservedVarTag ) ) | ( (lv_sub_3_0= ruleNestedDotID ) ) )
							int alt87 = 2;
							int LA87_0 = input.LA(1);

							if (((LA87_0 >= KW__INSERT && LA87_0 <= KW__REMOVE) || LA87_0 == KW__COUNT
									|| LA87_0 == KW__CLK)) {
								alt87 = 1;
							} else if ((LA87_0 == RULE_ID)) {
								alt87 = 2;
							} else {
								if (state.backtracking > 0) {
									state.failed = true;
									return current;
								}
								NoViableAltException nvae = new NoViableAltException("", 87, 0, input);

								throw nvae;
							}
							switch (alt87) {
							case 1:
							// InternalAgreeParser.g:6814:2: ( (lv_tag_2_0= ruleReservedVarTag ) )
							{
								// InternalAgreeParser.g:6814:2: ( (lv_tag_2_0= ruleReservedVarTag ) )
								// InternalAgreeParser.g:6815:1: (lv_tag_2_0= ruleReservedVarTag )
								{
									// InternalAgreeParser.g:6815:1: (lv_tag_2_0= ruleReservedVarTag )
									// InternalAgreeParser.g:6816:3: lv_tag_2_0= ruleReservedVarTag
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getNestedDotIDAccess()
													.getTagReservedVarTagParserRuleCall_1_0_1_0_0());

										}
										pushFollow(FollowSets000.FOLLOW_2);
										lv_tag_2_0 = ruleReservedVarTag();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getNestedDotIDRule());
											}
											set(current, "tag", lv_tag_2_0,
													"com.rockwellcollins.atc.agree.Agree.ReservedVarTag");
											afterParserOrEnumRuleCall();

										}

									}

								}

							}
								break;
							case 2:
							// InternalAgreeParser.g:6833:6: ( (lv_sub_3_0= ruleNestedDotID ) )
							{
								// InternalAgreeParser.g:6833:6: ( (lv_sub_3_0= ruleNestedDotID ) )
								// InternalAgreeParser.g:6834:1: (lv_sub_3_0= ruleNestedDotID )
								{
									// InternalAgreeParser.g:6834:1: (lv_sub_3_0= ruleNestedDotID )
									// InternalAgreeParser.g:6835:3: lv_sub_3_0= ruleNestedDotID
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getNestedDotIDAccess()
													.getSubNestedDotIDParserRuleCall_1_0_1_1_0());

										}
										pushFollow(FollowSets000.FOLLOW_2);
										lv_sub_3_0 = ruleNestedDotID();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getNestedDotIDRule());
											}
											set(current, "sub", lv_sub_3_0,
													"com.rockwellcollins.atc.agree.Agree.NestedDotID");
											afterParserOrEnumRuleCall();

										}

									}

								}

							}
								break;

							}

						}

					}
						break;

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleNestedDotID"

	// $ANTLR start "entryRuleQCPREF"
	// InternalAgreeParser.g:6859:1: entryRuleQCPREF returns [String current=null] : iv_ruleQCPREF= ruleQCPREF EOF ;
	public final String entryRuleQCPREF() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_ruleQCPREF = null;

		try {
			// InternalAgreeParser.g:6860:1: (iv_ruleQCPREF= ruleQCPREF EOF )
			// InternalAgreeParser.g:6861:2: iv_ruleQCPREF= ruleQCPREF EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getQCPREFRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleQCPREF = ruleQCPREF();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleQCPREF.getText();
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleQCPREF"

	// $ANTLR start "ruleQCPREF"
	// InternalAgreeParser.g:6868:1: ruleQCPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( ( RULE_ID ColonColon ) )=>
	// (this_ID_0= RULE_ID kw= ColonColon ) ) this_ID_2= RULE_ID ( ( ( FullStop RULE_ID ) )=> (kw= FullStop this_ID_4= RULE_ID ) )? ) | this_ID_5= RULE_ID ) ;
	public final AntlrDatatypeRuleToken ruleQCPREF() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token this_ID_0 = null;
		Token kw = null;
		Token this_ID_2 = null;
		Token this_ID_4 = null;
		Token this_ID_5 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:6872:6: ( ( ( ( ( ( RULE_ID ColonColon ) )=> (this_ID_0= RULE_ID kw= ColonColon ) ) this_ID_2= RULE_ID ( ( ( FullStop
			// RULE_ID ) )=> (kw= FullStop this_ID_4= RULE_ID ) )? ) | this_ID_5= RULE_ID ) )
			// InternalAgreeParser.g:6873:1: ( ( ( ( ( RULE_ID ColonColon ) )=> (this_ID_0= RULE_ID kw= ColonColon ) ) this_ID_2= RULE_ID ( ( ( FullStop RULE_ID
			// ) )=> (kw= FullStop this_ID_4= RULE_ID ) )? ) | this_ID_5= RULE_ID )
			{
				// InternalAgreeParser.g:6873:1: ( ( ( ( ( RULE_ID ColonColon ) )=> (this_ID_0= RULE_ID kw= ColonColon ) ) this_ID_2= RULE_ID ( ( ( FullStop
				// RULE_ID ) )=> (kw= FullStop this_ID_4= RULE_ID ) )? ) | this_ID_5= RULE_ID )
				int alt90 = 2;
				int LA90_0 = input.LA(1);

				if ((LA90_0 == RULE_ID)) {
					int LA90_1 = input.LA(2);

					if ((LA90_1 == EOF || LA90_1 == Exclusively || LA90_1 == Becomes || LA90_1 == Implies
							|| LA90_1 == During || LA90_1 == Occurs || LA90_1 == Holds
							|| (LA90_1 >= Occur && LA90_1 <= Times) || LA90_1 == Else || LA90_1 == Then
							|| LA90_1 == With || LA90_1 == LessThanSignEqualsSignGreaterThanSign
							|| (LA90_1 >= And && LA90_1 <= Div) || LA90_1 == Mod
							|| (LA90_1 >= ExclamationMarkEqualsSign && LA90_1 <= FullStopFullStop)
							|| (LA90_1 >= LessThanSignEqualsSign && LA90_1 <= GreaterThanSignEqualsSign) || LA90_1 == Or
							|| (LA90_1 >= LeftParenthesis && LA90_1 <= GreaterThanSign)
							|| (LA90_1 >= RightSquareBracket && LA90_1 <= RightCurlyBracket))) {
						alt90 = 2;
					} else if ((LA90_1 == ColonColon) && (synpred26_InternalAgreeParser())) {
						alt90 = 1;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return current;
						}
						NoViableAltException nvae = new NoViableAltException("", 90, 1, input);

						throw nvae;
					}
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 90, 0, input);

					throw nvae;
				}
				switch (alt90) {
				case 1:
				// InternalAgreeParser.g:6873:2: ( ( ( ( RULE_ID ColonColon ) )=> (this_ID_0= RULE_ID kw= ColonColon ) ) this_ID_2= RULE_ID ( ( ( FullStop
				// RULE_ID ) )=> (kw= FullStop this_ID_4= RULE_ID ) )? )
				{
					// InternalAgreeParser.g:6873:2: ( ( ( ( RULE_ID ColonColon ) )=> (this_ID_0= RULE_ID kw= ColonColon ) ) this_ID_2= RULE_ID ( ( ( FullStop
					// RULE_ID ) )=> (kw= FullStop this_ID_4= RULE_ID ) )? )
					// InternalAgreeParser.g:6873:3: ( ( ( RULE_ID ColonColon ) )=> (this_ID_0= RULE_ID kw= ColonColon ) ) this_ID_2= RULE_ID ( ( ( FullStop
					// RULE_ID ) )=> (kw= FullStop this_ID_4= RULE_ID ) )?
					{
						// InternalAgreeParser.g:6873:3: ( ( ( RULE_ID ColonColon ) )=> (this_ID_0= RULE_ID kw= ColonColon ) )
						// InternalAgreeParser.g:6873:4: ( ( RULE_ID ColonColon ) )=> (this_ID_0= RULE_ID kw= ColonColon )
						{
							// InternalAgreeParser.g:6875:5: (this_ID_0= RULE_ID kw= ColonColon )
							// InternalAgreeParser.g:6875:10: this_ID_0= RULE_ID kw= ColonColon
							{
								this_ID_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_85);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									current.merge(this_ID_0);

								}
								if (state.backtracking == 0) {

									newLeafNode(this_ID_0,
											grammarAccess.getQCPREFAccess().getIDTerminalRuleCall_0_0_0_0());

								}
								kw = (Token) match(input, ColonColon, FollowSets000.FOLLOW_11);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									current.merge(kw);
									newLeafNode(kw, grammarAccess.getQCPREFAccess().getColonColonKeyword_0_0_0_1());

								}

							}

						}

						this_ID_2 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_80);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							current.merge(this_ID_2);

						}
						if (state.backtracking == 0) {

							newLeafNode(this_ID_2, grammarAccess.getQCPREFAccess().getIDTerminalRuleCall_0_1());

						}
						// InternalAgreeParser.g:6895:1: ( ( ( FullStop RULE_ID ) )=> (kw= FullStop this_ID_4= RULE_ID ) )?
						int alt89 = 2;
						int LA89_0 = input.LA(1);

						if ((LA89_0 == FullStop)) {
							int LA89_1 = input.LA(2);

							if ((LA89_1 == RULE_ID)) {
								int LA89_3 = input.LA(3);

								if ((synpred27_InternalAgreeParser())) {
									alt89 = 1;
								}
							}
						}
						switch (alt89) {
						case 1:
						// InternalAgreeParser.g:6895:2: ( ( FullStop RULE_ID ) )=> (kw= FullStop this_ID_4= RULE_ID )
						{
							// InternalAgreeParser.g:6897:12: (kw= FullStop this_ID_4= RULE_ID )
							// InternalAgreeParser.g:6898:2: kw= FullStop this_ID_4= RULE_ID
							{
								kw = (Token) match(input, FullStop, FollowSets000.FOLLOW_11);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									current.merge(kw);
									newLeafNode(kw, grammarAccess.getQCPREFAccess().getFullStopKeyword_0_2_0_0());

								}
								this_ID_4 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_2);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									current.merge(this_ID_4);

								}
								if (state.backtracking == 0) {

									newLeafNode(this_ID_4,
											grammarAccess.getQCPREFAccess().getIDTerminalRuleCall_0_2_0_1());

								}

							}

						}
							break;

						}

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:6911:10: this_ID_5= RULE_ID
				{
					this_ID_5 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(this_ID_5);

					}
					if (state.backtracking == 0) {

						newLeafNode(this_ID_5, grammarAccess.getQCPREFAccess().getIDTerminalRuleCall_1());

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();

			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleQCPREF"

	// $ANTLR start "entryRuleReservedVarTag"
	// InternalAgreeParser.g:6926:1: entryRuleReservedVarTag returns [String current=null] : iv_ruleReservedVarTag= ruleReservedVarTag EOF ;
	public final String entryRuleReservedVarTag() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_ruleReservedVarTag = null;

		try {
			// InternalAgreeParser.g:6927:1: (iv_ruleReservedVarTag= ruleReservedVarTag EOF )
			// InternalAgreeParser.g:6928:2: iv_ruleReservedVarTag= ruleReservedVarTag EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getReservedVarTagRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleReservedVarTag = ruleReservedVarTag();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleReservedVarTag.getText();
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleReservedVarTag"

	// $ANTLR start "ruleReservedVarTag"
	// InternalAgreeParser.g:6935:1: ruleReservedVarTag returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KW__REMOVE | kw= KW__INSERT
	// | kw= KW__COUNT | kw= KW__CLK ) ;
	public final AntlrDatatypeRuleToken ruleReservedVarTag() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token kw = null;

		enterRule();

		try {
			// InternalAgreeParser.g:6939:6: ( (kw= KW__REMOVE | kw= KW__INSERT | kw= KW__COUNT | kw= KW__CLK ) )
			// InternalAgreeParser.g:6940:1: (kw= KW__REMOVE | kw= KW__INSERT | kw= KW__COUNT | kw= KW__CLK )
			{
				// InternalAgreeParser.g:6940:1: (kw= KW__REMOVE | kw= KW__INSERT | kw= KW__COUNT | kw= KW__CLK )
				int alt91 = 4;
				switch (input.LA(1)) {
				case KW__REMOVE: {
					alt91 = 1;
				}
					break;
				case KW__INSERT: {
					alt91 = 2;
				}
					break;
				case KW__COUNT: {
					alt91 = 3;
				}
					break;
				case KW__CLK: {
					alt91 = 4;
				}
					break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 91, 0, input);

					throw nvae;
				}

				switch (alt91) {
				case 1:
				// InternalAgreeParser.g:6941:2: kw= KW__REMOVE
				{
					kw = (Token) match(input, KW__REMOVE, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getReservedVarTagAccess().get_REMOVEKeyword_0());

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:6948:2: kw= KW__INSERT
				{
					kw = (Token) match(input, KW__INSERT, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getReservedVarTagAccess().get_INSERTKeyword_1());

					}

				}
					break;
				case 3:
				// InternalAgreeParser.g:6955:2: kw= KW__COUNT
				{
					kw = (Token) match(input, KW__COUNT, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getReservedVarTagAccess().get_COUNTKeyword_2());

					}

				}
					break;
				case 4:
				// InternalAgreeParser.g:6962:2: kw= KW__CLK
				{
					kw = (Token) match(input, KW__CLK, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getReservedVarTagAccess().get_CLKKeyword_3());

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();

			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleReservedVarTag"

	// $ANTLR start "entryRuleNamedID"
	// InternalAgreeParser.g:6975:1: entryRuleNamedID returns [EObject current=null] : iv_ruleNamedID= ruleNamedID EOF ;
	public final EObject entryRuleNamedID() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNamedID = null;

		try {
			// InternalAgreeParser.g:6976:2: (iv_ruleNamedID= ruleNamedID EOF )
			// InternalAgreeParser.g:6977:2: iv_ruleNamedID= ruleNamedID EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getNamedIDRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleNamedID = ruleNamedID();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleNamedID;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleNamedID"

	// $ANTLR start "ruleNamedID"
	// InternalAgreeParser.g:6984:1: ruleNamedID returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
	public final EObject ruleNamedID() throws RecognitionException {
		EObject current = null;

		Token lv_name_0_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:6987:28: ( ( (lv_name_0_0= RULE_ID ) ) )
			// InternalAgreeParser.g:6988:1: ( (lv_name_0_0= RULE_ID ) )
			{
				// InternalAgreeParser.g:6988:1: ( (lv_name_0_0= RULE_ID ) )
				// InternalAgreeParser.g:6989:1: (lv_name_0_0= RULE_ID )
				{
					// InternalAgreeParser.g:6989:1: (lv_name_0_0= RULE_ID )
					// InternalAgreeParser.g:6990:3: lv_name_0_0= RULE_ID
					{
						lv_name_0_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(lv_name_0_0, grammarAccess.getNamedIDAccess().getNameIDTerminalRuleCall_0());

						}
						if (state.backtracking == 0) {

							if (current == null) {
								current = createModelElement(grammarAccess.getNamedIDRule());
							}
							setWithLastConsumed(current, "name", lv_name_0_0,
									"org.osate.xtext.aadl2.properties.Properties.ID");

						}

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleNamedID"

	// $ANTLR start "entryRuleContainedPropertyAssociation"
	// InternalAgreeParser.g:7018:1: entryRuleContainedPropertyAssociation returns [EObject current=null] : iv_ruleContainedPropertyAssociation=
	// ruleContainedPropertyAssociation EOF ;
	public final EObject entryRuleContainedPropertyAssociation() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleContainedPropertyAssociation = null;

		try {
			// InternalAgreeParser.g:7019:2: (iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF )
			// InternalAgreeParser.g:7020:2: iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getContainedPropertyAssociationRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleContainedPropertyAssociation = ruleContainedPropertyAssociation();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleContainedPropertyAssociation;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleContainedPropertyAssociation"

	// $ANTLR start "ruleContainedPropertyAssociation"
	// InternalAgreeParser.g:7027:1: ruleContainedPropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign
	// | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) )
	// (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) )
	// (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14=
	// RightParenthesis )? otherlv_15= Semicolon ) ;
	public final EObject ruleContainedPropertyAssociation() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token lv_append_2_0 = null;
		Token lv_constant_3_0 = null;
		Token otherlv_5 = null;
		Token otherlv_9 = null;
		Token otherlv_12 = null;
		Token otherlv_14 = null;
		Token otherlv_15 = null;
		EObject lv_ownedValue_4_0 = null;

		EObject lv_ownedValue_6_0 = null;

		EObject lv_appliesTo_8_0 = null;

		EObject lv_appliesTo_10_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:7030:28: ( ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign
			// ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0=
			// ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma (
			// (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14=
			// RightParenthesis )? otherlv_15= Semicolon ) )
			// InternalAgreeParser.g:7031:1: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
			// ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0=
			// ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma (
			// (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14=
			// RightParenthesis )? otherlv_15= Semicolon )
			{
				// InternalAgreeParser.g:7031:1: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign
				// ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0=
				// ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma (
				// (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14=
				// RightParenthesis )? otherlv_15= Semicolon )
				// InternalAgreeParser.g:7031:2: ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
				// ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0=
				// ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma (
				// (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14=
				// RightParenthesis )? otherlv_15= Semicolon
				{
					// InternalAgreeParser.g:7031:2: ( ( ruleQPREF ) )
					// InternalAgreeParser.g:7032:1: ( ruleQPREF )
					{
						// InternalAgreeParser.g:7032:1: ( ruleQPREF )
						// InternalAgreeParser.g:7033:3: ruleQPREF
						{
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
								}

							}
							if (state.backtracking == 0) {

								newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess()
										.getPropertyPropertyCrossReference_0_0());

							}
							pushFollow(FollowSets000.FOLLOW_86);
							ruleQPREF();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								afterParserOrEnumRuleCall();

							}

						}

					}

					// InternalAgreeParser.g:7047:2: (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) )
					int alt92 = 2;
					int LA92_0 = input.LA(1);

					if ((LA92_0 == EqualsSignGreaterThanSign)) {
						alt92 = 1;
					} else if ((LA92_0 == PlusSignEqualsSignGreaterThanSign)) {
						alt92 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return current;
						}
						NoViableAltException nvae = new NoViableAltException("", 92, 0, input);

						throw nvae;
					}
					switch (alt92) {
					case 1:
					// InternalAgreeParser.g:7048:2: otherlv_1= EqualsSignGreaterThanSign
					{
						otherlv_1 = (Token) match(input, EqualsSignGreaterThanSign, FollowSets000.FOLLOW_87);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess()
									.getEqualsSignGreaterThanSignKeyword_1_0());

						}

					}
						break;
					case 2:
					// InternalAgreeParser.g:7053:6: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
					{
						// InternalAgreeParser.g:7053:6: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
						// InternalAgreeParser.g:7054:1: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
						{
							// InternalAgreeParser.g:7054:1: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
							// InternalAgreeParser.g:7055:3: lv_append_2_0= PlusSignEqualsSignGreaterThanSign
							{
								lv_append_2_0 = (Token) match(input, PlusSignEqualsSignGreaterThanSign,
										FollowSets000.FOLLOW_87);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(lv_append_2_0, grammarAccess.getContainedPropertyAssociationAccess()
											.getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0());

								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(
												grammarAccess.getContainedPropertyAssociationRule());
									}
									setWithLastConsumed(current, "append", true, "+=>");

								}

							}

						}

					}
						break;

					}

					// InternalAgreeParser.g:7069:3: ( (lv_constant_3_0= Constant ) )?
					int alt93 = 2;
					int LA93_0 = input.LA(1);

					if ((LA93_0 == Constant)) {
						alt93 = 1;
					}
					switch (alt93) {
					case 1:
					// InternalAgreeParser.g:7070:1: (lv_constant_3_0= Constant )
					{
						// InternalAgreeParser.g:7070:1: (lv_constant_3_0= Constant )
						// InternalAgreeParser.g:7071:3: lv_constant_3_0= Constant
						{
							lv_constant_3_0 = (Token) match(input, Constant, FollowSets000.FOLLOW_87);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(lv_constant_3_0, grammarAccess.getContainedPropertyAssociationAccess()
										.getConstantConstantKeyword_2_0());

							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
								}
								setWithLastConsumed(current, "constant", true, "constant");

							}

						}

					}
						break;

					}

					// InternalAgreeParser.g:7085:3: ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0=
					// ruleOptionalModalPropertyValue ) ) )* )
					// InternalAgreeParser.g:7085:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0=
					// ruleOptionalModalPropertyValue ) ) )*
					{
						// InternalAgreeParser.g:7085:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) )
						// InternalAgreeParser.g:7086:1: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
						{
							// InternalAgreeParser.g:7086:1: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
							// InternalAgreeParser.g:7087:3: lv_ownedValue_4_0= ruleOptionalModalPropertyValue
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess()
											.getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0());

								}
								pushFollow(FollowSets000.FOLLOW_88);
								lv_ownedValue_4_0 = ruleOptionalModalPropertyValue();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(
												grammarAccess.getContainedPropertyAssociationRule());
									}
									add(current, "ownedValue", lv_ownedValue_4_0,
											"org.osate.xtext.aadl2.properties.Properties.OptionalModalPropertyValue");
									afterParserOrEnumRuleCall();

								}

							}

						}

						// InternalAgreeParser.g:7103:2: (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
						loop94: do {
							int alt94 = 2;
							int LA94_0 = input.LA(1);

							if ((LA94_0 == Comma)) {
								alt94 = 1;
							}

							switch (alt94) {
							case 1:
							// InternalAgreeParser.g:7104:2: otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
							{
								otherlv_5 = (Token) match(input, Comma, FollowSets000.FOLLOW_87);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_5, grammarAccess.getContainedPropertyAssociationAccess()
											.getCommaKeyword_3_1_0());

								}
								// InternalAgreeParser.g:7108:1: ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
								// InternalAgreeParser.g:7109:1: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
								{
									// InternalAgreeParser.g:7109:1: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
									// InternalAgreeParser.g:7110:3: lv_ownedValue_6_0= ruleOptionalModalPropertyValue
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess()
													.getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0());

										}
										pushFollow(FollowSets000.FOLLOW_88);
										lv_ownedValue_6_0 = ruleOptionalModalPropertyValue();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getContainedPropertyAssociationRule());
											}
											add(current, "ownedValue", lv_ownedValue_6_0,
													"org.osate.xtext.aadl2.properties.Properties.OptionalModalPropertyValue");
											afterParserOrEnumRuleCall();

										}

									}

								}

							}
								break;

							default:
								break loop94;
							}
						} while (true);

					}

					// InternalAgreeParser.g:7126:5: ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma (
					// (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )?
					int alt96 = 2;
					int LA96_0 = input.LA(1);

					if ((LA96_0 == Applies)) {
						alt96 = 1;
					}
					switch (alt96) {
					case 1:
					// InternalAgreeParser.g:7127:5: ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0=
					// ruleContainmentPath ) ) )*
					{
						if (state.backtracking == 0) {

							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess()
									.getAppliesToKeywordsParserRuleCall_4_0());

						}
						pushFollow(FollowSets000.FOLLOW_11);
						ruleAppliesToKeywords();

						state._fsp--;
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							afterParserOrEnumRuleCall();

						}
						// InternalAgreeParser.g:7134:1: ( (lv_appliesTo_8_0= ruleContainmentPath ) )
						// InternalAgreeParser.g:7135:1: (lv_appliesTo_8_0= ruleContainmentPath )
						{
							// InternalAgreeParser.g:7135:1: (lv_appliesTo_8_0= ruleContainmentPath )
							// InternalAgreeParser.g:7136:3: lv_appliesTo_8_0= ruleContainmentPath
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess()
											.getAppliesToContainmentPathParserRuleCall_4_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_89);
								lv_appliesTo_8_0 = ruleContainmentPath();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(
												grammarAccess.getContainedPropertyAssociationRule());
									}
									add(current, "appliesTo", lv_appliesTo_8_0,
											"org.osate.xtext.aadl2.properties.Properties.ContainmentPath");
									afterParserOrEnumRuleCall();

								}

							}

						}

						// InternalAgreeParser.g:7152:2: (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
						loop95: do {
							int alt95 = 2;
							int LA95_0 = input.LA(1);

							if ((LA95_0 == Comma)) {
								alt95 = 1;
							}

							switch (alt95) {
							case 1:
							// InternalAgreeParser.g:7153:2: otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) )
							{
								otherlv_9 = (Token) match(input, Comma, FollowSets000.FOLLOW_11);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_9, grammarAccess.getContainedPropertyAssociationAccess()
											.getCommaKeyword_4_2_0());

								}
								// InternalAgreeParser.g:7157:1: ( (lv_appliesTo_10_0= ruleContainmentPath ) )
								// InternalAgreeParser.g:7158:1: (lv_appliesTo_10_0= ruleContainmentPath )
								{
									// InternalAgreeParser.g:7158:1: (lv_appliesTo_10_0= ruleContainmentPath )
									// InternalAgreeParser.g:7159:3: lv_appliesTo_10_0= ruleContainmentPath
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess()
													.getAppliesToContainmentPathParserRuleCall_4_2_1_0());

										}
										pushFollow(FollowSets000.FOLLOW_89);
										lv_appliesTo_10_0 = ruleContainmentPath();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(
														grammarAccess.getContainedPropertyAssociationRule());
											}
											add(current, "appliesTo", lv_appliesTo_10_0,
													"org.osate.xtext.aadl2.properties.Properties.ContainmentPath");
											afterParserOrEnumRuleCall();

										}

									}

								}

							}
								break;

							default:
								break loop95;
							}
						} while (true);

					}
						break;

					}

					// InternalAgreeParser.g:7175:6: ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )?
					int alt97 = 2;
					int LA97_0 = input.LA(1);

					if ((LA97_0 == In)) {
						alt97 = 1;
					}
					switch (alt97) {
					case 1:
					// InternalAgreeParser.g:7176:5: ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis
					{
						if (state.backtracking == 0) {

							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess()
									.getInBindingKeywordsParserRuleCall_5_0());

						}
						pushFollow(FollowSets000.FOLLOW_48);
						ruleInBindingKeywords();

						state._fsp--;
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							afterParserOrEnumRuleCall();

						}
						otherlv_12 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_12, grammarAccess.getContainedPropertyAssociationAccess()
									.getLeftParenthesisKeyword_5_1());

						}
						// InternalAgreeParser.g:7188:1: ( ( ruleQCREF ) )
						// InternalAgreeParser.g:7189:1: ( ruleQCREF )
						{
							// InternalAgreeParser.g:7189:1: ( ruleQCREF )
							// InternalAgreeParser.g:7190:3: ruleQCREF
							{
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(
												grammarAccess.getContainedPropertyAssociationRule());
									}

								}
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess()
											.getInBindingClassifierCrossReference_5_2_0());

								}
								pushFollow(FollowSets000.FOLLOW_36);
								ruleQCREF();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									afterParserOrEnumRuleCall();

								}

							}

						}

						otherlv_14 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_7);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_14, grammarAccess.getContainedPropertyAssociationAccess()
									.getRightParenthesisKeyword_5_3());

						}

					}
						break;

					}

					otherlv_15 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_15,
								grammarAccess.getContainedPropertyAssociationAccess().getSemicolonKeyword_6());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleContainedPropertyAssociation"

	// $ANTLR start "entryRuleContainmentPath"
	// InternalAgreeParser.g:7226:1: entryRuleContainmentPath returns [EObject current=null] : iv_ruleContainmentPath= ruleContainmentPath EOF ;
	public final EObject entryRuleContainmentPath() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleContainmentPath = null;

		try {
			// InternalAgreeParser.g:7227:2: (iv_ruleContainmentPath= ruleContainmentPath EOF )
			// InternalAgreeParser.g:7228:2: iv_ruleContainmentPath= ruleContainmentPath EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getContainmentPathRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleContainmentPath = ruleContainmentPath();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleContainmentPath;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleContainmentPath"

	// $ANTLR start "ruleContainmentPath"
	// InternalAgreeParser.g:7235:1: ruleContainmentPath returns [EObject current=null] : ( (lv_path_0_0= ruleContainmentPathElement ) ) ;
	public final EObject ruleContainmentPath() throws RecognitionException {
		EObject current = null;

		EObject lv_path_0_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:7238:28: ( ( (lv_path_0_0= ruleContainmentPathElement ) ) )
			// InternalAgreeParser.g:7239:1: ( (lv_path_0_0= ruleContainmentPathElement ) )
			{
				// InternalAgreeParser.g:7239:1: ( (lv_path_0_0= ruleContainmentPathElement ) )
				// InternalAgreeParser.g:7240:1: (lv_path_0_0= ruleContainmentPathElement )
				{
					// InternalAgreeParser.g:7240:1: (lv_path_0_0= ruleContainmentPathElement )
					// InternalAgreeParser.g:7241:3: lv_path_0_0= ruleContainmentPathElement
					{
						if (state.backtracking == 0) {

							newCompositeNode(grammarAccess.getContainmentPathAccess()
									.getPathContainmentPathElementParserRuleCall_0());

						}
						pushFollow(FollowSets000.FOLLOW_2);
						lv_path_0_0 = ruleContainmentPathElement();

						state._fsp--;
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							if (current == null) {
								current = createModelElementForParent(grammarAccess.getContainmentPathRule());
							}
							set(current, "path", lv_path_0_0,
									"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
							afterParserOrEnumRuleCall();

						}

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleContainmentPath"

	// $ANTLR start "entryRuleOptionalModalPropertyValue"
	// InternalAgreeParser.g:7267:1: entryRuleOptionalModalPropertyValue returns [EObject current=null] : iv_ruleOptionalModalPropertyValue=
	// ruleOptionalModalPropertyValue EOF ;
	public final EObject entryRuleOptionalModalPropertyValue() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleOptionalModalPropertyValue = null;

		try {
			// InternalAgreeParser.g:7268:2: (iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF )
			// InternalAgreeParser.g:7269:2: iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getOptionalModalPropertyValueRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleOptionalModalPropertyValue = ruleOptionalModalPropertyValue();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleOptionalModalPropertyValue;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleOptionalModalPropertyValue"

	// $ANTLR start "ruleOptionalModalPropertyValue"
	// InternalAgreeParser.g:7276:1: ruleOptionalModalPropertyValue returns [EObject current=null] : ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) (
	// ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
	// ;
	public final EObject ruleOptionalModalPropertyValue() throws RecognitionException {
		EObject current = null;

		Token otherlv_2 = null;
		Token otherlv_3 = null;
		Token otherlv_4 = null;
		Token otherlv_5 = null;
		Token otherlv_6 = null;
		EObject lv_ownedValue_0_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:7279:28: ( ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis (
			// (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) )
			// InternalAgreeParser.g:7280:1: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3=
			// RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
			{
				// InternalAgreeParser.g:7280:1: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis (
				// (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
				// InternalAgreeParser.g:7280:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3=
				// RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
				{
					// InternalAgreeParser.g:7280:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
					// InternalAgreeParser.g:7281:1: (lv_ownedValue_0_0= rulePropertyExpression )
					{
						// InternalAgreeParser.g:7281:1: (lv_ownedValue_0_0= rulePropertyExpression )
						// InternalAgreeParser.g:7282:3: lv_ownedValue_0_0= rulePropertyExpression
						{
							if (state.backtracking == 0) {

								newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess()
										.getOwnedValuePropertyExpressionParserRuleCall_0_0());

							}
							pushFollow(FollowSets000.FOLLOW_90);
							lv_ownedValue_0_0 = rulePropertyExpression();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(
											grammarAccess.getOptionalModalPropertyValueRule());
								}
								set(current, "ownedValue", lv_ownedValue_0_0,
										"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
								afterParserOrEnumRuleCall();

							}

						}

					}

					// InternalAgreeParser.g:7298:2: ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5=
					// RULE_ID ) ) )* otherlv_6= RightParenthesis )?
					int alt99 = 2;
					int LA99_0 = input.LA(1);

					if ((LA99_0 == In)) {
						int LA99_1 = input.LA(2);

						if ((LA99_1 == Modes)) {
							alt99 = 1;
						}
					}
					switch (alt99) {
					case 1:
					// InternalAgreeParser.g:7299:5: ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5=
					// RULE_ID ) ) )* otherlv_6= RightParenthesis
					{
						if (state.backtracking == 0) {

							newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess()
									.getInModesKeywordsParserRuleCall_1_0());

						}
						pushFollow(FollowSets000.FOLLOW_48);
						ruleInModesKeywords();

						state._fsp--;
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							afterParserOrEnumRuleCall();

						}
						otherlv_2 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_2, grammarAccess.getOptionalModalPropertyValueAccess()
									.getLeftParenthesisKeyword_1_1());

						}
						// InternalAgreeParser.g:7311:1: ( (otherlv_3= RULE_ID ) )
						// InternalAgreeParser.g:7312:1: (otherlv_3= RULE_ID )
						{
							// InternalAgreeParser.g:7312:1: (otherlv_3= RULE_ID )
							// InternalAgreeParser.g:7313:3: otherlv_3= RULE_ID
							{
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
									}

								}
								otherlv_3 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_49);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess()
											.getInModeModeCrossReference_1_2_0());

								}

							}

						}

						// InternalAgreeParser.g:7324:2: (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
						loop98: do {
							int alt98 = 2;
							int LA98_0 = input.LA(1);

							if ((LA98_0 == Comma)) {
								alt98 = 1;
							}

							switch (alt98) {
							case 1:
							// InternalAgreeParser.g:7325:2: otherlv_4= Comma ( (otherlv_5= RULE_ID ) )
							{
								otherlv_4 = (Token) match(input, Comma, FollowSets000.FOLLOW_11);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess()
											.getCommaKeyword_1_3_0());

								}
								// InternalAgreeParser.g:7329:1: ( (otherlv_5= RULE_ID ) )
								// InternalAgreeParser.g:7330:1: (otherlv_5= RULE_ID )
								{
									// InternalAgreeParser.g:7330:1: (otherlv_5= RULE_ID )
									// InternalAgreeParser.g:7331:3: otherlv_5= RULE_ID
									{
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElement(
														grammarAccess.getOptionalModalPropertyValueRule());
											}

										}
										otherlv_5 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_49);
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											newLeafNode(otherlv_5, grammarAccess.getOptionalModalPropertyValueAccess()
													.getInModeModeCrossReference_1_3_1_0());

										}

									}

								}

							}
								break;

							default:
								break loop98;
							}
						} while (true);

						otherlv_6 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_6, grammarAccess.getOptionalModalPropertyValueAccess()
									.getRightParenthesisKeyword_1_4());

						}

					}
						break;

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleOptionalModalPropertyValue"

	// $ANTLR start "entryRulePropertyValue"
	// InternalAgreeParser.g:7355:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
	public final EObject entryRulePropertyValue() throws RecognitionException {
		EObject current = null;

		EObject iv_rulePropertyValue = null;

		try {
			// InternalAgreeParser.g:7356:2: (iv_rulePropertyValue= rulePropertyValue EOF )
			// InternalAgreeParser.g:7357:2: iv_rulePropertyValue= rulePropertyValue EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getPropertyValueRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_rulePropertyValue = rulePropertyValue();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_rulePropertyValue;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRulePropertyValue"

	// $ANTLR start "rulePropertyValue"
	// InternalAgreeParser.g:7364:1: rulePropertyValue returns [EObject current=null] : ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ;
	public final EObject rulePropertyValue() throws RecognitionException {
		EObject current = null;

		EObject lv_ownedValue_0_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:7367:28: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) )
			// InternalAgreeParser.g:7368:1: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
			{
				// InternalAgreeParser.g:7368:1: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
				// InternalAgreeParser.g:7369:1: (lv_ownedValue_0_0= rulePropertyExpression )
				{
					// InternalAgreeParser.g:7369:1: (lv_ownedValue_0_0= rulePropertyExpression )
					// InternalAgreeParser.g:7370:3: lv_ownedValue_0_0= rulePropertyExpression
					{
						if (state.backtracking == 0) {

							newCompositeNode(grammarAccess.getPropertyValueAccess()
									.getOwnedValuePropertyExpressionParserRuleCall_0());

						}
						pushFollow(FollowSets000.FOLLOW_2);
						lv_ownedValue_0_0 = rulePropertyExpression();

						state._fsp--;
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							if (current == null) {
								current = createModelElementForParent(grammarAccess.getPropertyValueRule());
							}
							set(current, "ownedValue", lv_ownedValue_0_0,
									"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
							afterParserOrEnumRuleCall();

						}

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "rulePropertyValue"

	// $ANTLR start "entryRulePropertyExpression"
	// InternalAgreeParser.g:7394:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
	public final EObject entryRulePropertyExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_rulePropertyExpression = null;

		try {
			// InternalAgreeParser.g:7395:2: (iv_rulePropertyExpression= rulePropertyExpression EOF )
			// InternalAgreeParser.g:7396:2: iv_rulePropertyExpression= rulePropertyExpression EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getPropertyExpressionRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_rulePropertyExpression = rulePropertyExpression();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_rulePropertyExpression;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRulePropertyExpression"

	// $ANTLR start "rulePropertyExpression"
	// InternalAgreeParser.g:7403:1: rulePropertyExpression returns [EObject current=null] : (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1=
	// ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4=
	// ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8=
	// ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) ;
	public final EObject rulePropertyExpression() throws RecognitionException {
		EObject current = null;

		EObject this_RecordTerm_0 = null;

		EObject this_ReferenceTerm_1 = null;

		EObject this_ComponentClassifierTerm_2 = null;

		EObject this_ComputedTerm_3 = null;

		EObject this_StringTerm_4 = null;

		EObject this_NumericRangeTerm_5 = null;

		EObject this_RealTerm_6 = null;

		EObject this_IntegerTerm_7 = null;

		EObject this_ListTerm_8 = null;

		EObject this_BooleanLiteral_9 = null;

		EObject this_LiteralorReferenceTerm_10 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:7406:28: ( (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2=
			// ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5=
			// ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm |
			// this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) )
			// InternalAgreeParser.g:7407:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2=
			// ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5=
			// ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm |
			// this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
			{
				// InternalAgreeParser.g:7407:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2=
				// ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5=
				// ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm |
				// this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
				int alt100 = 11;
				alt100 = dfa100.predict(input);
				switch (alt100) {
				case 1:
				// InternalAgreeParser.g:7408:5: this_RecordTerm_0= ruleRecordTerm
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRecordTermParserRuleCall_0());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_RecordTerm_0 = ruleRecordTerm();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_RecordTerm_0;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:7418:5: this_ReferenceTerm_1= ruleReferenceTerm
				{
					if (state.backtracking == 0) {

						newCompositeNode(
								grammarAccess.getPropertyExpressionAccess().getReferenceTermParserRuleCall_1());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_ReferenceTerm_1 = ruleReferenceTerm();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_ReferenceTerm_1;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 3:
				// InternalAgreeParser.g:7428:5: this_ComponentClassifierTerm_2= ruleComponentClassifierTerm
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getPropertyExpressionAccess()
								.getComponentClassifierTermParserRuleCall_2());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_ComponentClassifierTerm_2 = ruleComponentClassifierTerm();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_ComponentClassifierTerm_2;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 4:
				// InternalAgreeParser.g:7438:5: this_ComputedTerm_3= ruleComputedTerm
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComputedTermParserRuleCall_3());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_ComputedTerm_3 = ruleComputedTerm();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_ComputedTerm_3;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 5:
				// InternalAgreeParser.g:7448:5: this_StringTerm_4= ruleStringTerm
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getPropertyExpressionAccess().getStringTermParserRuleCall_4());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_StringTerm_4 = ruleStringTerm();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_StringTerm_4;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 6:
				// InternalAgreeParser.g:7458:5: this_NumericRangeTerm_5= ruleNumericRangeTerm
				{
					if (state.backtracking == 0) {

						newCompositeNode(
								grammarAccess.getPropertyExpressionAccess().getNumericRangeTermParserRuleCall_5());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_NumericRangeTerm_5 = ruleNumericRangeTerm();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_NumericRangeTerm_5;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 7:
				// InternalAgreeParser.g:7468:5: this_RealTerm_6= ruleRealTerm
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRealTermParserRuleCall_6());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_RealTerm_6 = ruleRealTerm();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_RealTerm_6;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 8:
				// InternalAgreeParser.g:7478:5: this_IntegerTerm_7= ruleIntegerTerm
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getPropertyExpressionAccess().getIntegerTermParserRuleCall_7());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_IntegerTerm_7 = ruleIntegerTerm();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_IntegerTerm_7;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 9:
				// InternalAgreeParser.g:7488:5: this_ListTerm_8= ruleListTerm
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getPropertyExpressionAccess().getListTermParserRuleCall_8());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_ListTerm_8 = ruleListTerm();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_ListTerm_8;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 10:
				// InternalAgreeParser.g:7498:5: this_BooleanLiteral_9= ruleBooleanLiteral
				{
					if (state.backtracking == 0) {

						newCompositeNode(
								grammarAccess.getPropertyExpressionAccess().getBooleanLiteralParserRuleCall_9());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_BooleanLiteral_9 = ruleBooleanLiteral();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_BooleanLiteral_9;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 11:
				// InternalAgreeParser.g:7508:5: this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getPropertyExpressionAccess()
								.getLiteralorReferenceTermParserRuleCall_10());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_LiteralorReferenceTerm_10 = ruleLiteralorReferenceTerm();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_LiteralorReferenceTerm_10;
						afterParserOrEnumRuleCall();

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "rulePropertyExpression"

	// $ANTLR start "entryRuleLiteralorReferenceTerm"
	// InternalAgreeParser.g:7524:1: entryRuleLiteralorReferenceTerm returns [EObject current=null] : iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm
	// EOF ;
	public final EObject entryRuleLiteralorReferenceTerm() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleLiteralorReferenceTerm = null;

		try {
			// InternalAgreeParser.g:7525:2: (iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF )
			// InternalAgreeParser.g:7526:2: iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getLiteralorReferenceTermRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleLiteralorReferenceTerm = ruleLiteralorReferenceTerm();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleLiteralorReferenceTerm;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleLiteralorReferenceTerm"

	// $ANTLR start "ruleLiteralorReferenceTerm"
	// InternalAgreeParser.g:7533:1: ruleLiteralorReferenceTerm returns [EObject current=null] : ( ( ruleQPREF ) ) ;
	public final EObject ruleLiteralorReferenceTerm() throws RecognitionException {
		EObject current = null;

		enterRule();

		try {
			// InternalAgreeParser.g:7536:28: ( ( ( ruleQPREF ) ) )
			// InternalAgreeParser.g:7537:1: ( ( ruleQPREF ) )
			{
				// InternalAgreeParser.g:7537:1: ( ( ruleQPREF ) )
				// InternalAgreeParser.g:7538:1: ( ruleQPREF )
				{
					// InternalAgreeParser.g:7538:1: ( ruleQPREF )
					// InternalAgreeParser.g:7539:3: ruleQPREF
					{
						if (state.backtracking == 0) {

							if (current == null) {
								current = createModelElement(grammarAccess.getLiteralorReferenceTermRule());
							}

						}
						if (state.backtracking == 0) {

							newCompositeNode(grammarAccess.getLiteralorReferenceTermAccess()
									.getNamedValueAbstractNamedValueCrossReference_0());

						}
						pushFollow(FollowSets000.FOLLOW_2);
						ruleQPREF();

						state._fsp--;
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							afterParserOrEnumRuleCall();

						}

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleLiteralorReferenceTerm"

	// $ANTLR start "entryRuleBooleanLiteral"
	// InternalAgreeParser.g:7561:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
	public final EObject entryRuleBooleanLiteral() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleBooleanLiteral = null;

		try {
			// InternalAgreeParser.g:7562:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
			// InternalAgreeParser.g:7563:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getBooleanLiteralRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleBooleanLiteral = ruleBooleanLiteral();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleBooleanLiteral;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleBooleanLiteral"

	// $ANTLR start "ruleBooleanLiteral"
	// InternalAgreeParser.g:7570:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) ;
	public final EObject ruleBooleanLiteral() throws RecognitionException {
		EObject current = null;

		Token lv_value_1_0 = null;
		Token otherlv_2 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:7573:28: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) )
			// InternalAgreeParser.g:7574:1: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
			{
				// InternalAgreeParser.g:7574:1: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
				// InternalAgreeParser.g:7574:2: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
				{
					// InternalAgreeParser.g:7574:2: ()
					// InternalAgreeParser.g:7575:5:
					{
						if (state.backtracking == 0) {

							current = forceCreateModelElement(
									grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(), current);

						}

					}

					// InternalAgreeParser.g:7580:2: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
					int alt101 = 2;
					int LA101_0 = input.LA(1);

					if ((LA101_0 == True)) {
						alt101 = 1;
					} else if ((LA101_0 == False)) {
						alt101 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return current;
						}
						NoViableAltException nvae = new NoViableAltException("", 101, 0, input);

						throw nvae;
					}
					switch (alt101) {
					case 1:
					// InternalAgreeParser.g:7580:3: ( (lv_value_1_0= True ) )
					{
						// InternalAgreeParser.g:7580:3: ( (lv_value_1_0= True ) )
						// InternalAgreeParser.g:7581:1: (lv_value_1_0= True )
						{
							// InternalAgreeParser.g:7581:1: (lv_value_1_0= True )
							// InternalAgreeParser.g:7582:3: lv_value_1_0= True
							{
								lv_value_1_0 = (Token) match(input, True, FollowSets000.FOLLOW_2);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(lv_value_1_0,
											grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0());

								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getBooleanLiteralRule());
									}
									setWithLastConsumed(current, "value", true, "true");

								}

							}

						}

					}
						break;
					case 2:
					// InternalAgreeParser.g:7598:2: otherlv_2= False
					{
						otherlv_2 = (Token) match(input, False, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());

						}

					}
						break;

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleBooleanLiteral"

	// $ANTLR start "entryRuleConstantValue"
	// InternalAgreeParser.g:7610:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
	public final EObject entryRuleConstantValue() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleConstantValue = null;

		try {
			// InternalAgreeParser.g:7611:2: (iv_ruleConstantValue= ruleConstantValue EOF )
			// InternalAgreeParser.g:7612:2: iv_ruleConstantValue= ruleConstantValue EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getConstantValueRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleConstantValue = ruleConstantValue();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleConstantValue;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleConstantValue"

	// $ANTLR start "ruleConstantValue"
	// InternalAgreeParser.g:7619:1: ruleConstantValue returns [EObject current=null] : ( ( ruleQPREF ) ) ;
	public final EObject ruleConstantValue() throws RecognitionException {
		EObject current = null;

		enterRule();

		try {
			// InternalAgreeParser.g:7622:28: ( ( ( ruleQPREF ) ) )
			// InternalAgreeParser.g:7623:1: ( ( ruleQPREF ) )
			{
				// InternalAgreeParser.g:7623:1: ( ( ruleQPREF ) )
				// InternalAgreeParser.g:7624:1: ( ruleQPREF )
				{
					// InternalAgreeParser.g:7624:1: ( ruleQPREF )
					// InternalAgreeParser.g:7625:3: ruleQPREF
					{
						if (state.backtracking == 0) {

							if (current == null) {
								current = createModelElement(grammarAccess.getConstantValueRule());
							}

						}
						if (state.backtracking == 0) {

							newCompositeNode(grammarAccess.getConstantValueAccess()
									.getNamedValuePropertyConstantCrossReference_0());

						}
						pushFollow(FollowSets000.FOLLOW_2);
						ruleQPREF();

						state._fsp--;
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							afterParserOrEnumRuleCall();

						}

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleConstantValue"

	// $ANTLR start "entryRuleReferenceTerm"
	// InternalAgreeParser.g:7647:1: entryRuleReferenceTerm returns [EObject current=null] : iv_ruleReferenceTerm= ruleReferenceTerm EOF ;
	public final EObject entryRuleReferenceTerm() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleReferenceTerm = null;

		try {
			// InternalAgreeParser.g:7648:2: (iv_ruleReferenceTerm= ruleReferenceTerm EOF )
			// InternalAgreeParser.g:7649:2: iv_ruleReferenceTerm= ruleReferenceTerm EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getReferenceTermRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleReferenceTerm = ruleReferenceTerm();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleReferenceTerm;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleReferenceTerm"

	// $ANTLR start "ruleReferenceTerm"
	// InternalAgreeParser.g:7656:1: ruleReferenceTerm returns [EObject current=null] : (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0=
	// ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) ;
	public final EObject ruleReferenceTerm() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;
		Token otherlv_3 = null;
		EObject lv_path_2_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:7659:28: ( (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3=
			// RightParenthesis ) )
			// InternalAgreeParser.g:7660:1: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3=
			// RightParenthesis )
			{
				// InternalAgreeParser.g:7660:1: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3=
				// RightParenthesis )
				// InternalAgreeParser.g:7661:2: otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3=
				// RightParenthesis
				{
					otherlv_0 = (Token) match(input, Reference, FollowSets000.FOLLOW_48);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());

					}
					otherlv_1 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());

					}
					// InternalAgreeParser.g:7670:1: ( (lv_path_2_0= ruleContainmentPathElement ) )
					// InternalAgreeParser.g:7671:1: (lv_path_2_0= ruleContainmentPathElement )
					{
						// InternalAgreeParser.g:7671:1: (lv_path_2_0= ruleContainmentPathElement )
						// InternalAgreeParser.g:7672:3: lv_path_2_0= ruleContainmentPathElement
						{
							if (state.backtracking == 0) {

								newCompositeNode(grammarAccess.getReferenceTermAccess()
										.getPathContainmentPathElementParserRuleCall_2_0());

							}
							pushFollow(FollowSets000.FOLLOW_36);
							lv_path_2_0 = ruleContainmentPathElement();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getReferenceTermRule());
								}
								set(current, "path", lv_path_2_0,
										"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
								afterParserOrEnumRuleCall();

							}

						}

					}

					otherlv_3 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_3, grammarAccess.getReferenceTermAccess().getRightParenthesisKeyword_3());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleReferenceTerm"

	// $ANTLR start "entryRuleRecordTerm"
	// InternalAgreeParser.g:7701:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
	public final EObject entryRuleRecordTerm() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleRecordTerm = null;

		try {
			// InternalAgreeParser.g:7702:2: (iv_ruleRecordTerm= ruleRecordTerm EOF )
			// InternalAgreeParser.g:7703:2: iv_ruleRecordTerm= ruleRecordTerm EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getRecordTermRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleRecordTerm = ruleRecordTerm();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleRecordTerm;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleRecordTerm"

	// $ANTLR start "ruleRecordTerm"
	// InternalAgreeParser.g:7710:1: ruleRecordTerm returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0=
	// ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) ;
	public final EObject ruleRecordTerm() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		EObject lv_ownedFieldValue_1_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:7713:28: ( (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2=
			// RightSquareBracket ) )
			// InternalAgreeParser.g:7714:1: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2=
			// RightSquareBracket )
			{
				// InternalAgreeParser.g:7714:1: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2=
				// RightSquareBracket )
				// InternalAgreeParser.g:7715:2: otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2=
				// RightSquareBracket
				{
					otherlv_0 = (Token) match(input, LeftSquareBracket, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0());

					}
					// InternalAgreeParser.g:7719:1: ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+
					int cnt102 = 0;
					loop102: do {
						int alt102 = 2;
						int LA102_0 = input.LA(1);

						if ((LA102_0 == RULE_ID)) {
							alt102 = 1;
						}

						switch (alt102) {
						case 1:
						// InternalAgreeParser.g:7720:1: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
						{
							// InternalAgreeParser.g:7720:1: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
							// InternalAgreeParser.g:7721:3: lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getRecordTermAccess()
											.getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_91);
								lv_ownedFieldValue_1_0 = ruleFieldPropertyAssociation();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getRecordTermRule());
									}
									add(current, "ownedFieldValue", lv_ownedFieldValue_1_0,
											"org.osate.xtext.aadl2.properties.Properties.FieldPropertyAssociation");
									afterParserOrEnumRuleCall();

								}

							}

						}
							break;

						default:
							if (cnt102 >= 1) {
								break loop102;
							}
							if (state.backtracking > 0) {
								state.failed = true;
								return current;
							}
							EarlyExitException eee = new EarlyExitException(102, input);
							throw eee;
						}
						cnt102++;
					} while (true);

					otherlv_2 = (Token) match(input, RightSquareBracket, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_2, grammarAccess.getRecordTermAccess().getRightSquareBracketKeyword_2());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleRecordTerm"

	// $ANTLR start "entryRuleComputedTerm"
	// InternalAgreeParser.g:7752:1: entryRuleComputedTerm returns [EObject current=null] : iv_ruleComputedTerm= ruleComputedTerm EOF ;
	public final EObject entryRuleComputedTerm() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleComputedTerm = null;

		try {
			// InternalAgreeParser.g:7753:2: (iv_ruleComputedTerm= ruleComputedTerm EOF )
			// InternalAgreeParser.g:7754:2: iv_ruleComputedTerm= ruleComputedTerm EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getComputedTermRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleComputedTerm = ruleComputedTerm();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleComputedTerm;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleComputedTerm"

	// $ANTLR start "ruleComputedTerm"
	// InternalAgreeParser.g:7761:1: ruleComputedTerm returns [EObject current=null] : (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0=
	// RULE_ID ) ) otherlv_3= RightParenthesis ) ;
	public final EObject ruleComputedTerm() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;
		Token lv_function_2_0 = null;
		Token otherlv_3 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:7764:28: ( (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) )
			// InternalAgreeParser.g:7765:1: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
			{
				// InternalAgreeParser.g:7765:1: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
				// InternalAgreeParser.g:7766:2: otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis
				{
					otherlv_0 = (Token) match(input, Compute, FollowSets000.FOLLOW_48);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());

					}
					otherlv_1 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());

					}
					// InternalAgreeParser.g:7775:1: ( (lv_function_2_0= RULE_ID ) )
					// InternalAgreeParser.g:7776:1: (lv_function_2_0= RULE_ID )
					{
						// InternalAgreeParser.g:7776:1: (lv_function_2_0= RULE_ID )
						// InternalAgreeParser.g:7777:3: lv_function_2_0= RULE_ID
						{
							lv_function_2_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_36);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(lv_function_2_0,
										grammarAccess.getComputedTermAccess().getFunctionIDTerminalRuleCall_2_0());

							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getComputedTermRule());
								}
								setWithLastConsumed(current, "function", lv_function_2_0,
										"org.osate.xtext.aadl2.properties.Properties.ID");

							}

						}

					}

					otherlv_3 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_3, grammarAccess.getComputedTermAccess().getRightParenthesisKeyword_3());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleComputedTerm"

	// $ANTLR start "entryRuleComponentClassifierTerm"
	// InternalAgreeParser.g:7806:1: entryRuleComponentClassifierTerm returns [EObject current=null] : iv_ruleComponentClassifierTerm=
	// ruleComponentClassifierTerm EOF ;
	public final EObject entryRuleComponentClassifierTerm() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleComponentClassifierTerm = null;

		try {
			// InternalAgreeParser.g:7807:2: (iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF )
			// InternalAgreeParser.g:7808:2: iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getComponentClassifierTermRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleComponentClassifierTerm = ruleComponentClassifierTerm();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleComponentClassifierTerm;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleComponentClassifierTerm"

	// $ANTLR start "ruleComponentClassifierTerm"
	// InternalAgreeParser.g:7815:1: ruleComponentClassifierTerm returns [EObject current=null] : (otherlv_0= Classifier otherlv_1= LeftParenthesis ( (
	// ruleQCREF ) ) otherlv_3= RightParenthesis ) ;
	public final EObject ruleComponentClassifierTerm() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;
		Token otherlv_3 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:7818:28: ( (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) )
			// InternalAgreeParser.g:7819:1: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
			{
				// InternalAgreeParser.g:7819:1: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
				// InternalAgreeParser.g:7820:2: otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis
				{
					otherlv_0 = (Token) match(input, Classifier, FollowSets000.FOLLOW_48);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_0,
								grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());

					}
					otherlv_1 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_1,
								grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());

					}
					// InternalAgreeParser.g:7829:1: ( ( ruleQCREF ) )
					// InternalAgreeParser.g:7830:1: ( ruleQCREF )
					{
						// InternalAgreeParser.g:7830:1: ( ruleQCREF )
						// InternalAgreeParser.g:7831:3: ruleQCREF
						{
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getComponentClassifierTermRule());
								}

							}
							if (state.backtracking == 0) {

								newCompositeNode(grammarAccess.getComponentClassifierTermAccess()
										.getClassifierComponentClassifierCrossReference_2_0());

							}
							pushFollow(FollowSets000.FOLLOW_36);
							ruleQCREF();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								afterParserOrEnumRuleCall();

							}

						}

					}

					otherlv_3 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_3,
								grammarAccess.getComponentClassifierTermAccess().getRightParenthesisKeyword_3());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleComponentClassifierTerm"

	// $ANTLR start "entryRuleListTerm"
	// InternalAgreeParser.g:7858:1: entryRuleListTerm returns [EObject current=null] : iv_ruleListTerm= ruleListTerm EOF ;
	public final EObject entryRuleListTerm() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleListTerm = null;

		try {
			// InternalAgreeParser.g:7859:2: (iv_ruleListTerm= ruleListTerm EOF )
			// InternalAgreeParser.g:7860:2: iv_ruleListTerm= ruleListTerm EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getListTermRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleListTerm = ruleListTerm();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleListTerm;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleListTerm"

	// $ANTLR start "ruleListTerm"
	// InternalAgreeParser.g:7867:1: ruleListTerm returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0=
	// rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) ;
	public final EObject ruleListTerm() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_3 = null;
		Token otherlv_5 = null;
		EObject lv_ownedListElement_2_0 = null;

		EObject lv_ownedListElement_4_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:7870:28: ( ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma (
			// (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) )
			// InternalAgreeParser.g:7871:1: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma (
			// (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
			{
				// InternalAgreeParser.g:7871:1: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma (
				// (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
				// InternalAgreeParser.g:7871:2: () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma (
				// (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis
				{
					// InternalAgreeParser.g:7871:2: ()
					// InternalAgreeParser.g:7872:5:
					{
						if (state.backtracking == 0) {

							current = forceCreateModelElement(grammarAccess.getListTermAccess().getListValueAction_0(),
									current);

						}

					}

					otherlv_1 = (Token) match(input, LeftParenthesis, FollowSets000.FOLLOW_92);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1());

					}
					// InternalAgreeParser.g:7882:1: ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0=
					// rulePropertyExpression ) ) )* )?
					int alt104 = 2;
					int LA104_0 = input.LA(1);

					if ((LA104_0 == Classifier || LA104_0 == Reference || LA104_0 == Compute || LA104_0 == False
							|| LA104_0 == True || LA104_0 == LeftParenthesis || LA104_0 == PlusSign
							|| LA104_0 == HyphenMinus || LA104_0 == LeftSquareBracket || LA104_0 == RULE_REAL_LIT
							|| LA104_0 == RULE_INTEGER_LIT || (LA104_0 >= RULE_STRING && LA104_0 <= RULE_ID))) {
						alt104 = 1;
					}
					switch (alt104) {
					case 1:
					// InternalAgreeParser.g:7882:2: ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0=
					// rulePropertyExpression ) ) )*
					{
						// InternalAgreeParser.g:7882:2: ( (lv_ownedListElement_2_0= rulePropertyExpression ) )
						// InternalAgreeParser.g:7883:1: (lv_ownedListElement_2_0= rulePropertyExpression )
						{
							// InternalAgreeParser.g:7883:1: (lv_ownedListElement_2_0= rulePropertyExpression )
							// InternalAgreeParser.g:7884:3: lv_ownedListElement_2_0= rulePropertyExpression
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getListTermAccess()
											.getOwnedListElementPropertyExpressionParserRuleCall_2_0_0());

								}
								pushFollow(FollowSets000.FOLLOW_49);
								lv_ownedListElement_2_0 = rulePropertyExpression();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getListTermRule());
									}
									add(current, "ownedListElement", lv_ownedListElement_2_0,
											"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
									afterParserOrEnumRuleCall();

								}

							}

						}

						// InternalAgreeParser.g:7900:2: (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
						loop103: do {
							int alt103 = 2;
							int LA103_0 = input.LA(1);

							if ((LA103_0 == Comma)) {
								alt103 = 1;
							}

							switch (alt103) {
							case 1:
							// InternalAgreeParser.g:7901:2: otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
							{
								otherlv_3 = (Token) match(input, Comma, FollowSets000.FOLLOW_87);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_2_1_0());

								}
								// InternalAgreeParser.g:7905:1: ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
								// InternalAgreeParser.g:7906:1: (lv_ownedListElement_4_0= rulePropertyExpression )
								{
									// InternalAgreeParser.g:7906:1: (lv_ownedListElement_4_0= rulePropertyExpression )
									// InternalAgreeParser.g:7907:3: lv_ownedListElement_4_0= rulePropertyExpression
									{
										if (state.backtracking == 0) {

											newCompositeNode(grammarAccess.getListTermAccess()
													.getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0());

										}
										pushFollow(FollowSets000.FOLLOW_49);
										lv_ownedListElement_4_0 = rulePropertyExpression();

										state._fsp--;
										if (state.failed) {
											return current;
										}
										if (state.backtracking == 0) {

											if (current == null) {
												current = createModelElementForParent(grammarAccess.getListTermRule());
											}
											add(current, "ownedListElement", lv_ownedListElement_4_0,
													"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
											afterParserOrEnumRuleCall();

										}

									}

								}

							}
								break;

							default:
								break loop103;
							}
						} while (true);

					}
						break;

					}

					otherlv_5 = (Token) match(input, RightParenthesis, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_5, grammarAccess.getListTermAccess().getRightParenthesisKeyword_3());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleListTerm"

	// $ANTLR start "entryRuleFieldPropertyAssociation"
	// InternalAgreeParser.g:7936:1: entryRuleFieldPropertyAssociation returns [EObject current=null] : iv_ruleFieldPropertyAssociation=
	// ruleFieldPropertyAssociation EOF ;
	public final EObject entryRuleFieldPropertyAssociation() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleFieldPropertyAssociation = null;

		try {
			// InternalAgreeParser.g:7937:2: (iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF )
			// InternalAgreeParser.g:7938:2: iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getFieldPropertyAssociationRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleFieldPropertyAssociation = ruleFieldPropertyAssociation();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleFieldPropertyAssociation;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleFieldPropertyAssociation"

	// $ANTLR start "ruleFieldPropertyAssociation"
	// InternalAgreeParser.g:7945:1: ruleFieldPropertyAssociation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1=
	// EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) ;
	public final EObject ruleFieldPropertyAssociation() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;
		Token otherlv_3 = null;
		EObject lv_ownedValue_2_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:7948:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression )
			// ) otherlv_3= Semicolon ) )
			// InternalAgreeParser.g:7949:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) )
			// otherlv_3= Semicolon )
			{
				// InternalAgreeParser.g:7949:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression )
				// ) otherlv_3= Semicolon )
				// InternalAgreeParser.g:7949:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) )
				// otherlv_3= Semicolon
				{
					// InternalAgreeParser.g:7949:2: ( (otherlv_0= RULE_ID ) )
					// InternalAgreeParser.g:7950:1: (otherlv_0= RULE_ID )
					{
						// InternalAgreeParser.g:7950:1: (otherlv_0= RULE_ID )
						// InternalAgreeParser.g:7951:3: otherlv_0= RULE_ID
						{
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getFieldPropertyAssociationRule());
								}

							}
							otherlv_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_93);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_0, grammarAccess.getFieldPropertyAssociationAccess()
										.getPropertyBasicPropertyCrossReference_0_0());

							}

						}

					}

					otherlv_1 = (Token) match(input, EqualsSignGreaterThanSign, FollowSets000.FOLLOW_87);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess()
								.getEqualsSignGreaterThanSignKeyword_1());

					}
					// InternalAgreeParser.g:7967:1: ( (lv_ownedValue_2_0= rulePropertyExpression ) )
					// InternalAgreeParser.g:7968:1: (lv_ownedValue_2_0= rulePropertyExpression )
					{
						// InternalAgreeParser.g:7968:1: (lv_ownedValue_2_0= rulePropertyExpression )
						// InternalAgreeParser.g:7969:3: lv_ownedValue_2_0= rulePropertyExpression
						{
							if (state.backtracking == 0) {

								newCompositeNode(grammarAccess.getFieldPropertyAssociationAccess()
										.getOwnedValuePropertyExpressionParserRuleCall_2_0());

							}
							pushFollow(FollowSets000.FOLLOW_7);
							lv_ownedValue_2_0 = rulePropertyExpression();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(
											grammarAccess.getFieldPropertyAssociationRule());
								}
								set(current, "ownedValue", lv_ownedValue_2_0,
										"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
								afterParserOrEnumRuleCall();

							}

						}

					}

					otherlv_3 = (Token) match(input, Semicolon, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_3,
								grammarAccess.getFieldPropertyAssociationAccess().getSemicolonKeyword_3());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleFieldPropertyAssociation"

	// $ANTLR start "entryRuleContainmentPathElement"
	// InternalAgreeParser.g:7998:1: entryRuleContainmentPathElement returns [EObject current=null] : iv_ruleContainmentPathElement= ruleContainmentPathElement
	// EOF ;
	public final EObject entryRuleContainmentPathElement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleContainmentPathElement = null;

		try {
			// InternalAgreeParser.g:7999:2: (iv_ruleContainmentPathElement= ruleContainmentPathElement EOF )
			// InternalAgreeParser.g:8000:2: iv_ruleContainmentPathElement= ruleContainmentPathElement EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getContainmentPathElementRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleContainmentPathElement = ruleContainmentPathElement();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleContainmentPathElement;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleContainmentPathElement"

	// $ANTLR start "ruleContainmentPathElement"
	// InternalAgreeParser.g:8007:1: ruleContainmentPathElement returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0=
	// ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) ;
	public final EObject ruleContainmentPathElement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		EObject lv_arrayRange_1_0 = null;

		EObject lv_path_3_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8010:28: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0=
			// ruleContainmentPathElement ) ) )? ) )
			// InternalAgreeParser.g:8011:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0=
			// ruleContainmentPathElement ) ) )? )
			{
				// InternalAgreeParser.g:8011:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0=
				// ruleContainmentPathElement ) ) )? )
				// InternalAgreeParser.g:8011:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0=
				// ruleContainmentPathElement ) ) )?
				{
					// InternalAgreeParser.g:8011:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
					// InternalAgreeParser.g:8011:3: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
					{
						// InternalAgreeParser.g:8011:3: ( (otherlv_0= RULE_ID ) )
						// InternalAgreeParser.g:8012:1: (otherlv_0= RULE_ID )
						{
							// InternalAgreeParser.g:8012:1: (otherlv_0= RULE_ID )
							// InternalAgreeParser.g:8013:3: otherlv_0= RULE_ID
							{
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElement(grammarAccess.getContainmentPathElementRule());
									}

								}
								otherlv_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_94);
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess()
											.getNamedElementNamedElementCrossReference_0_0_0());

								}

							}

						}

						// InternalAgreeParser.g:8024:2: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
						loop105: do {
							int alt105 = 2;
							int LA105_0 = input.LA(1);

							if ((LA105_0 == LeftSquareBracket)) {
								alt105 = 1;
							}

							switch (alt105) {
							case 1:
							// InternalAgreeParser.g:8025:1: (lv_arrayRange_1_0= ruleArrayRange )
							{
								// InternalAgreeParser.g:8025:1: (lv_arrayRange_1_0= ruleArrayRange )
								// InternalAgreeParser.g:8026:3: lv_arrayRange_1_0= ruleArrayRange
								{
									if (state.backtracking == 0) {

										newCompositeNode(grammarAccess.getContainmentPathElementAccess()
												.getArrayRangeArrayRangeParserRuleCall_0_1_0());

									}
									pushFollow(FollowSets000.FOLLOW_94);
									lv_arrayRange_1_0 = ruleArrayRange();

									state._fsp--;
									if (state.failed) {
										return current;
									}
									if (state.backtracking == 0) {

										if (current == null) {
											current = createModelElementForParent(
													grammarAccess.getContainmentPathElementRule());
										}
										add(current, "arrayRange", lv_arrayRange_1_0,
												"org.osate.xtext.aadl2.properties.Properties.ArrayRange");
										afterParserOrEnumRuleCall();

									}

								}

							}
								break;

							default:
								break loop105;
							}
						} while (true);

					}

					// InternalAgreeParser.g:8042:4: (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
					int alt106 = 2;
					int LA106_0 = input.LA(1);

					if ((LA106_0 == FullStop)) {
						alt106 = 1;
					}
					switch (alt106) {
					case 1:
					// InternalAgreeParser.g:8043:2: otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) )
					{
						otherlv_2 = (Token) match(input, FullStop, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_2,
									grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0());

						}
						// InternalAgreeParser.g:8047:1: ( (lv_path_3_0= ruleContainmentPathElement ) )
						// InternalAgreeParser.g:8048:1: (lv_path_3_0= ruleContainmentPathElement )
						{
							// InternalAgreeParser.g:8048:1: (lv_path_3_0= ruleContainmentPathElement )
							// InternalAgreeParser.g:8049:3: lv_path_3_0= ruleContainmentPathElement
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getContainmentPathElementAccess()
											.getPathContainmentPathElementParserRuleCall_1_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_2);
								lv_path_3_0 = ruleContainmentPathElement();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(
												grammarAccess.getContainmentPathElementRule());
									}
									set(current, "path", lv_path_3_0,
											"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
									afterParserOrEnumRuleCall();

								}

							}

						}

					}
						break;

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleContainmentPathElement"

	// $ANTLR start "entryRulePlusMinus"
	// InternalAgreeParser.g:8075:1: entryRulePlusMinus returns [String current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
	public final String entryRulePlusMinus() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_rulePlusMinus = null;

		try {
			// InternalAgreeParser.g:8076:1: (iv_rulePlusMinus= rulePlusMinus EOF )
			// InternalAgreeParser.g:8077:2: iv_rulePlusMinus= rulePlusMinus EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getPlusMinusRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_rulePlusMinus = rulePlusMinus();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_rulePlusMinus.getText();
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRulePlusMinus"

	// $ANTLR start "rulePlusMinus"
	// InternalAgreeParser.g:8084:1: rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= PlusSign | kw= HyphenMinus ) ;
	public final AntlrDatatypeRuleToken rulePlusMinus() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token kw = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8088:6: ( (kw= PlusSign | kw= HyphenMinus ) )
			// InternalAgreeParser.g:8089:1: (kw= PlusSign | kw= HyphenMinus )
			{
				// InternalAgreeParser.g:8089:1: (kw= PlusSign | kw= HyphenMinus )
				int alt107 = 2;
				int LA107_0 = input.LA(1);

				if ((LA107_0 == PlusSign)) {
					alt107 = 1;
				} else if ((LA107_0 == HyphenMinus)) {
					alt107 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 107, 0, input);

					throw nvae;
				}
				switch (alt107) {
				case 1:
				// InternalAgreeParser.g:8090:2: kw= PlusSign
				{
					kw = (Token) match(input, PlusSign, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0());

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:8097:2: kw= HyphenMinus
				{
					kw = (Token) match(input, HyphenMinus, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1());

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();

			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "rulePlusMinus"

	// $ANTLR start "entryRuleStringTerm"
	// InternalAgreeParser.g:8110:1: entryRuleStringTerm returns [EObject current=null] : iv_ruleStringTerm= ruleStringTerm EOF ;
	public final EObject entryRuleStringTerm() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleStringTerm = null;

		try {
			// InternalAgreeParser.g:8111:2: (iv_ruleStringTerm= ruleStringTerm EOF )
			// InternalAgreeParser.g:8112:2: iv_ruleStringTerm= ruleStringTerm EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getStringTermRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleStringTerm = ruleStringTerm();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleStringTerm;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleStringTerm"

	// $ANTLR start "ruleStringTerm"
	// InternalAgreeParser.g:8119:1: ruleStringTerm returns [EObject current=null] : ( (lv_value_0_0= ruleNoQuoteString ) ) ;
	public final EObject ruleStringTerm() throws RecognitionException {
		EObject current = null;

		AntlrDatatypeRuleToken lv_value_0_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8122:28: ( ( (lv_value_0_0= ruleNoQuoteString ) ) )
			// InternalAgreeParser.g:8123:1: ( (lv_value_0_0= ruleNoQuoteString ) )
			{
				// InternalAgreeParser.g:8123:1: ( (lv_value_0_0= ruleNoQuoteString ) )
				// InternalAgreeParser.g:8124:1: (lv_value_0_0= ruleNoQuoteString )
				{
					// InternalAgreeParser.g:8124:1: (lv_value_0_0= ruleNoQuoteString )
					// InternalAgreeParser.g:8125:3: lv_value_0_0= ruleNoQuoteString
					{
						if (state.backtracking == 0) {

							newCompositeNode(
									grammarAccess.getStringTermAccess().getValueNoQuoteStringParserRuleCall_0());

						}
						pushFollow(FollowSets000.FOLLOW_2);
						lv_value_0_0 = ruleNoQuoteString();

						state._fsp--;
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							if (current == null) {
								current = createModelElementForParent(grammarAccess.getStringTermRule());
							}
							set(current, "value", lv_value_0_0,
									"org.osate.xtext.aadl2.properties.Properties.NoQuoteString");
							afterParserOrEnumRuleCall();

						}

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleStringTerm"

	// $ANTLR start "entryRuleNoQuoteString"
	// InternalAgreeParser.g:8149:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
	public final String entryRuleNoQuoteString() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;

		try {
			// InternalAgreeParser.g:8150:1: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
			// InternalAgreeParser.g:8151:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getNoQuoteStringRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleNoQuoteString = ruleNoQuoteString();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleNoQuoteString.getText();
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleNoQuoteString"

	// $ANTLR start "ruleNoQuoteString"
	// InternalAgreeParser.g:8158:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
	public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token this_STRING_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8162:6: (this_STRING_0= RULE_STRING )
			// InternalAgreeParser.g:8163:5: this_STRING_0= RULE_STRING
			{
				this_STRING_0 = (Token) match(input, RULE_STRING, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {

					current.merge(this_STRING_0);

				}
				if (state.backtracking == 0) {

					newLeafNode(this_STRING_0, grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall());

				}

			}

			if (state.backtracking == 0) {
				leaveRule();

			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleNoQuoteString"

	// $ANTLR start "entryRuleArrayRange"
	// InternalAgreeParser.g:8178:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
	public final EObject entryRuleArrayRange() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleArrayRange = null;

		try {
			// InternalAgreeParser.g:8179:2: (iv_ruleArrayRange= ruleArrayRange EOF )
			// InternalAgreeParser.g:8180:2: iv_ruleArrayRange= ruleArrayRange EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getArrayRangeRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleArrayRange = ruleArrayRange();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleArrayRange;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleArrayRange"

	// $ANTLR start "ruleArrayRange"
	// InternalAgreeParser.g:8187:1: ruleArrayRange returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) )
	// (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) ;
	public final EObject ruleArrayRange() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_3 = null;
		Token otherlv_5 = null;
		AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

		AntlrDatatypeRuleToken lv_upperBound_4_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8190:28: ( ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop (
			// (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) )
			// InternalAgreeParser.g:8191:1: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop (
			// (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
			{
				// InternalAgreeParser.g:8191:1: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop (
				// (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
				// InternalAgreeParser.g:8191:2: () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop (
				// (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket
				{
					// InternalAgreeParser.g:8191:2: ()
					// InternalAgreeParser.g:8192:5:
					{
						if (state.backtracking == 0) {

							current = forceCreateModelElement(
									grammarAccess.getArrayRangeAccess().getArrayRangeAction_0(), current);

						}

					}

					otherlv_1 = (Token) match(input, LeftSquareBracket, FollowSets000.FOLLOW_37);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());

					}
					// InternalAgreeParser.g:8202:1: ( (lv_lowerBound_2_0= ruleINTVALUE ) )
					// InternalAgreeParser.g:8203:1: (lv_lowerBound_2_0= ruleINTVALUE )
					{
						// InternalAgreeParser.g:8203:1: (lv_lowerBound_2_0= ruleINTVALUE )
						// InternalAgreeParser.g:8204:3: lv_lowerBound_2_0= ruleINTVALUE
						{
							if (state.backtracking == 0) {

								newCompositeNode(
										grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0());

							}
							pushFollow(FollowSets000.FOLLOW_95);
							lv_lowerBound_2_0 = ruleINTVALUE();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getArrayRangeRule());
								}
								set(current, "lowerBound", lv_lowerBound_2_0,
										"org.osate.xtext.aadl2.properties.Properties.INTVALUE");
								afterParserOrEnumRuleCall();

							}

						}

					}

					// InternalAgreeParser.g:8220:2: (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )?
					int alt108 = 2;
					int LA108_0 = input.LA(1);

					if ((LA108_0 == FullStopFullStop)) {
						alt108 = 1;
					}
					switch (alt108) {
					case 1:
					// InternalAgreeParser.g:8221:2: otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) )
					{
						otherlv_3 = (Token) match(input, FullStopFullStop, FollowSets000.FOLLOW_37);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_3,
									grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());

						}
						// InternalAgreeParser.g:8225:1: ( (lv_upperBound_4_0= ruleINTVALUE ) )
						// InternalAgreeParser.g:8226:1: (lv_upperBound_4_0= ruleINTVALUE )
						{
							// InternalAgreeParser.g:8226:1: (lv_upperBound_4_0= ruleINTVALUE )
							// InternalAgreeParser.g:8227:3: lv_upperBound_4_0= ruleINTVALUE
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getArrayRangeAccess()
											.getUpperBoundINTVALUEParserRuleCall_3_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_35);
								lv_upperBound_4_0 = ruleINTVALUE();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getArrayRangeRule());
									}
									set(current, "upperBound", lv_upperBound_4_0,
											"org.osate.xtext.aadl2.properties.Properties.INTVALUE");
									afterParserOrEnumRuleCall();

								}

							}

						}

					}
						break;

					}

					otherlv_5 = (Token) match(input, RightSquareBracket, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_5, grammarAccess.getArrayRangeAccess().getRightSquareBracketKeyword_4());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleArrayRange"

	// $ANTLR start "entryRuleSignedConstant"
	// InternalAgreeParser.g:8256:1: entryRuleSignedConstant returns [EObject current=null] : iv_ruleSignedConstant= ruleSignedConstant EOF ;
	public final EObject entryRuleSignedConstant() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSignedConstant = null;

		try {
			// InternalAgreeParser.g:8257:2: (iv_ruleSignedConstant= ruleSignedConstant EOF )
			// InternalAgreeParser.g:8258:2: iv_ruleSignedConstant= ruleSignedConstant EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getSignedConstantRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleSignedConstant = ruleSignedConstant();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleSignedConstant;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleSignedConstant"

	// $ANTLR start "ruleSignedConstant"
	// InternalAgreeParser.g:8265:1: ruleSignedConstant returns [EObject current=null] : ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0=
	// ruleConstantValue ) ) ) ;
	public final EObject ruleSignedConstant() throws RecognitionException {
		EObject current = null;

		AntlrDatatypeRuleToken lv_op_0_0 = null;

		EObject lv_ownedPropertyExpression_1_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8268:28: ( ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) )
			// InternalAgreeParser.g:8269:1: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
			{
				// InternalAgreeParser.g:8269:1: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
				// InternalAgreeParser.g:8269:2: ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
				{
					// InternalAgreeParser.g:8269:2: ( (lv_op_0_0= rulePlusMinus ) )
					// InternalAgreeParser.g:8270:1: (lv_op_0_0= rulePlusMinus )
					{
						// InternalAgreeParser.g:8270:1: (lv_op_0_0= rulePlusMinus )
						// InternalAgreeParser.g:8271:3: lv_op_0_0= rulePlusMinus
						{
							if (state.backtracking == 0) {

								newCompositeNode(
										grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0());

							}
							pushFollow(FollowSets000.FOLLOW_96);
							lv_op_0_0 = rulePlusMinus();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getSignedConstantRule());
								}
								set(current, "op", lv_op_0_0, "org.osate.xtext.aadl2.properties.Properties.PlusMinus");
								afterParserOrEnumRuleCall();

							}

						}

					}

					// InternalAgreeParser.g:8287:2: ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
					// InternalAgreeParser.g:8288:1: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
					{
						// InternalAgreeParser.g:8288:1: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
						// InternalAgreeParser.g:8289:3: lv_ownedPropertyExpression_1_0= ruleConstantValue
						{
							if (state.backtracking == 0) {

								newCompositeNode(grammarAccess.getSignedConstantAccess()
										.getOwnedPropertyExpressionConstantValueParserRuleCall_1_0());

							}
							pushFollow(FollowSets000.FOLLOW_2);
							lv_ownedPropertyExpression_1_0 = ruleConstantValue();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getSignedConstantRule());
								}
								add(current, "ownedPropertyExpression", lv_ownedPropertyExpression_1_0,
										"org.osate.xtext.aadl2.properties.Properties.ConstantValue");
								afterParserOrEnumRuleCall();

							}

						}

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleSignedConstant"

	// $ANTLR start "entryRuleIntegerTerm"
	// InternalAgreeParser.g:8313:1: entryRuleIntegerTerm returns [EObject current=null] : iv_ruleIntegerTerm= ruleIntegerTerm EOF ;
	public final EObject entryRuleIntegerTerm() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleIntegerTerm = null;

		try {
			// InternalAgreeParser.g:8314:2: (iv_ruleIntegerTerm= ruleIntegerTerm EOF )
			// InternalAgreeParser.g:8315:2: iv_ruleIntegerTerm= ruleIntegerTerm EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getIntegerTermRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleIntegerTerm = ruleIntegerTerm();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleIntegerTerm;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleIntegerTerm"

	// $ANTLR start "ruleIntegerTerm"
	// InternalAgreeParser.g:8322:1: ruleIntegerTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) ;
	public final EObject ruleIntegerTerm() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		AntlrDatatypeRuleToken lv_value_0_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8325:28: ( ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) )
			// InternalAgreeParser.g:8326:1: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
			{
				// InternalAgreeParser.g:8326:1: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
				// InternalAgreeParser.g:8326:2: ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )?
				{
					// InternalAgreeParser.g:8326:2: ( (lv_value_0_0= ruleSignedInt ) )
					// InternalAgreeParser.g:8327:1: (lv_value_0_0= ruleSignedInt )
					{
						// InternalAgreeParser.g:8327:1: (lv_value_0_0= ruleSignedInt )
						// InternalAgreeParser.g:8328:3: lv_value_0_0= ruleSignedInt
						{
							if (state.backtracking == 0) {

								newCompositeNode(
										grammarAccess.getIntegerTermAccess().getValueSignedIntParserRuleCall_0_0());

							}
							pushFollow(FollowSets000.FOLLOW_97);
							lv_value_0_0 = ruleSignedInt();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getIntegerTermRule());
								}
								set(current, "value", lv_value_0_0,
										"org.osate.xtext.aadl2.properties.Properties.SignedInt");
								afterParserOrEnumRuleCall();

							}

						}

					}

					// InternalAgreeParser.g:8344:2: ( (otherlv_1= RULE_ID ) )?
					int alt109 = 2;
					int LA109_0 = input.LA(1);

					if ((LA109_0 == RULE_ID)) {
						alt109 = 1;
					}
					switch (alt109) {
					case 1:
					// InternalAgreeParser.g:8345:1: (otherlv_1= RULE_ID )
					{
						// InternalAgreeParser.g:8345:1: (otherlv_1= RULE_ID )
						// InternalAgreeParser.g:8346:3: otherlv_1= RULE_ID
						{
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getIntegerTermRule());
								}

							}
							otherlv_1 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_2);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_1,
										grammarAccess.getIntegerTermAccess().getUnitUnitLiteralCrossReference_1_0());

							}

						}

					}
						break;

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleIntegerTerm"

	// $ANTLR start "entryRuleSignedInt"
	// InternalAgreeParser.g:8365:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
	public final String entryRuleSignedInt() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_ruleSignedInt = null;

		try {
			// InternalAgreeParser.g:8366:1: (iv_ruleSignedInt= ruleSignedInt EOF )
			// InternalAgreeParser.g:8367:2: iv_ruleSignedInt= ruleSignedInt EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getSignedIntRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleSignedInt = ruleSignedInt();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleSignedInt.getText();
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleSignedInt"

	// $ANTLR start "ruleSignedInt"
	// InternalAgreeParser.g:8374:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )?
	// this_INTEGER_LIT_2= RULE_INTEGER_LIT ) ;
	public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token kw = null;
		Token this_INTEGER_LIT_2 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8378:6: ( ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) )
			// InternalAgreeParser.g:8379:1: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
			{
				// InternalAgreeParser.g:8379:1: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
				// InternalAgreeParser.g:8379:2: (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT
				{
					// InternalAgreeParser.g:8379:2: (kw= PlusSign | kw= HyphenMinus )?
					int alt110 = 3;
					int LA110_0 = input.LA(1);

					if ((LA110_0 == PlusSign)) {
						alt110 = 1;
					} else if ((LA110_0 == HyphenMinus)) {
						alt110 = 2;
					}
					switch (alt110) {
					case 1:
					// InternalAgreeParser.g:8380:2: kw= PlusSign
					{
						kw = (Token) match(input, PlusSign, FollowSets000.FOLLOW_37);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							current.merge(kw);
							newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0());

						}

					}
						break;
					case 2:
					// InternalAgreeParser.g:8387:2: kw= HyphenMinus
					{
						kw = (Token) match(input, HyphenMinus, FollowSets000.FOLLOW_37);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							current.merge(kw);
							newLeafNode(kw, grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0_1());

						}

					}
						break;

					}

					this_INTEGER_LIT_2 = (Token) match(input, RULE_INTEGER_LIT, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(this_INTEGER_LIT_2);

					}
					if (state.backtracking == 0) {

						newLeafNode(this_INTEGER_LIT_2,
								grammarAccess.getSignedIntAccess().getINTEGER_LITTerminalRuleCall_1());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();

			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleSignedInt"

	// $ANTLR start "entryRuleRealTerm"
	// InternalAgreeParser.g:8407:1: entryRuleRealTerm returns [EObject current=null] : iv_ruleRealTerm= ruleRealTerm EOF ;
	public final EObject entryRuleRealTerm() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleRealTerm = null;

		try {
			// InternalAgreeParser.g:8408:2: (iv_ruleRealTerm= ruleRealTerm EOF )
			// InternalAgreeParser.g:8409:2: iv_ruleRealTerm= ruleRealTerm EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getRealTermRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleRealTerm = ruleRealTerm();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleRealTerm;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleRealTerm"

	// $ANTLR start "ruleRealTerm"
	// InternalAgreeParser.g:8416:1: ruleRealTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) ;
	public final EObject ruleRealTerm() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		AntlrDatatypeRuleToken lv_value_0_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8419:28: ( ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) )
			// InternalAgreeParser.g:8420:1: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
			{
				// InternalAgreeParser.g:8420:1: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
				// InternalAgreeParser.g:8420:2: ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )?
				{
					// InternalAgreeParser.g:8420:2: ( (lv_value_0_0= ruleSignedReal ) )
					// InternalAgreeParser.g:8421:1: (lv_value_0_0= ruleSignedReal )
					{
						// InternalAgreeParser.g:8421:1: (lv_value_0_0= ruleSignedReal )
						// InternalAgreeParser.g:8422:3: lv_value_0_0= ruleSignedReal
						{
							if (state.backtracking == 0) {

								newCompositeNode(
										grammarAccess.getRealTermAccess().getValueSignedRealParserRuleCall_0_0());

							}
							pushFollow(FollowSets000.FOLLOW_97);
							lv_value_0_0 = ruleSignedReal();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getRealTermRule());
								}
								set(current, "value", lv_value_0_0,
										"org.osate.xtext.aadl2.properties.Properties.SignedReal");
								afterParserOrEnumRuleCall();

							}

						}

					}

					// InternalAgreeParser.g:8438:2: ( (otherlv_1= RULE_ID ) )?
					int alt111 = 2;
					int LA111_0 = input.LA(1);

					if ((LA111_0 == RULE_ID)) {
						alt111 = 1;
					}
					switch (alt111) {
					case 1:
					// InternalAgreeParser.g:8439:1: (otherlv_1= RULE_ID )
					{
						// InternalAgreeParser.g:8439:1: (otherlv_1= RULE_ID )
						// InternalAgreeParser.g:8440:3: otherlv_1= RULE_ID
						{
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElement(grammarAccess.getRealTermRule());
								}

							}
							otherlv_1 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_2);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								newLeafNode(otherlv_1,
										grammarAccess.getRealTermAccess().getUnitUnitLiteralCrossReference_1_0());

							}

						}

					}
						break;

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleRealTerm"

	// $ANTLR start "entryRuleSignedReal"
	// InternalAgreeParser.g:8459:1: entryRuleSignedReal returns [String current=null] : iv_ruleSignedReal= ruleSignedReal EOF ;
	public final String entryRuleSignedReal() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_ruleSignedReal = null;

		try {
			// InternalAgreeParser.g:8460:1: (iv_ruleSignedReal= ruleSignedReal EOF )
			// InternalAgreeParser.g:8461:2: iv_ruleSignedReal= ruleSignedReal EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getSignedRealRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleSignedReal = ruleSignedReal();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleSignedReal.getText();
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleSignedReal"

	// $ANTLR start "ruleSignedReal"
	// InternalAgreeParser.g:8468:1: ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )?
	// this_REAL_LIT_2= RULE_REAL_LIT ) ;
	public final AntlrDatatypeRuleToken ruleSignedReal() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token kw = null;
		Token this_REAL_LIT_2 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8472:6: ( ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) )
			// InternalAgreeParser.g:8473:1: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
			{
				// InternalAgreeParser.g:8473:1: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
				// InternalAgreeParser.g:8473:2: (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT
				{
					// InternalAgreeParser.g:8473:2: (kw= PlusSign | kw= HyphenMinus )?
					int alt112 = 3;
					int LA112_0 = input.LA(1);

					if ((LA112_0 == PlusSign)) {
						alt112 = 1;
					} else if ((LA112_0 == HyphenMinus)) {
						alt112 = 2;
					}
					switch (alt112) {
					case 1:
					// InternalAgreeParser.g:8474:2: kw= PlusSign
					{
						kw = (Token) match(input, PlusSign, FollowSets000.FOLLOW_98);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							current.merge(kw);
							newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0());

						}

					}
						break;
					case 2:
					// InternalAgreeParser.g:8481:2: kw= HyphenMinus
					{
						kw = (Token) match(input, HyphenMinus, FollowSets000.FOLLOW_98);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							current.merge(kw);
							newLeafNode(kw, grammarAccess.getSignedRealAccess().getHyphenMinusKeyword_0_1());

						}

					}
						break;

					}

					this_REAL_LIT_2 = (Token) match(input, RULE_REAL_LIT, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(this_REAL_LIT_2);

					}
					if (state.backtracking == 0) {

						newLeafNode(this_REAL_LIT_2,
								grammarAccess.getSignedRealAccess().getREAL_LITTerminalRuleCall_1());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();

			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleSignedReal"

	// $ANTLR start "entryRuleNumericRangeTerm"
	// InternalAgreeParser.g:8501:1: entryRuleNumericRangeTerm returns [EObject current=null] : iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF ;
	public final EObject entryRuleNumericRangeTerm() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNumericRangeTerm = null;

		try {
			// InternalAgreeParser.g:8502:2: (iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF )
			// InternalAgreeParser.g:8503:2: iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getNumericRangeTermRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleNumericRangeTerm = ruleNumericRangeTerm();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleNumericRangeTerm;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleNumericRangeTerm"

	// $ANTLR start "ruleNumericRangeTerm"
	// InternalAgreeParser.g:8510:1: ruleNumericRangeTerm returns [EObject current=null] : ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop (
	// (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) ;
	public final EObject ruleNumericRangeTerm() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_3 = null;
		EObject lv_minimum_0_0 = null;

		EObject lv_maximum_2_0 = null;

		EObject lv_delta_4_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8513:28: ( ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3=
			// Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) )
			// InternalAgreeParser.g:8514:1: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta
			// ( (lv_delta_4_0= ruleNumAlt ) ) )? )
			{
				// InternalAgreeParser.g:8514:1: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3=
				// Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
				// InternalAgreeParser.g:8514:2: ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3=
				// Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
				{
					// InternalAgreeParser.g:8514:2: ( (lv_minimum_0_0= ruleNumAlt ) )
					// InternalAgreeParser.g:8515:1: (lv_minimum_0_0= ruleNumAlt )
					{
						// InternalAgreeParser.g:8515:1: (lv_minimum_0_0= ruleNumAlt )
						// InternalAgreeParser.g:8516:3: lv_minimum_0_0= ruleNumAlt
						{
							if (state.backtracking == 0) {

								newCompositeNode(
										grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0());

							}
							pushFollow(FollowSets000.FOLLOW_54);
							lv_minimum_0_0 = ruleNumAlt();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
								}
								set(current, "minimum", lv_minimum_0_0,
										"org.osate.xtext.aadl2.properties.Properties.NumAlt");
								afterParserOrEnumRuleCall();

							}

						}

					}

					otherlv_1 = (Token) match(input, FullStopFullStop, FollowSets000.FOLLOW_96);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						newLeafNode(otherlv_1,
								grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());

					}
					// InternalAgreeParser.g:8537:1: ( (lv_maximum_2_0= ruleNumAlt ) )
					// InternalAgreeParser.g:8538:1: (lv_maximum_2_0= ruleNumAlt )
					{
						// InternalAgreeParser.g:8538:1: (lv_maximum_2_0= ruleNumAlt )
						// InternalAgreeParser.g:8539:3: lv_maximum_2_0= ruleNumAlt
						{
							if (state.backtracking == 0) {

								newCompositeNode(
										grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0());

							}
							pushFollow(FollowSets000.FOLLOW_99);
							lv_maximum_2_0 = ruleNumAlt();

							state._fsp--;
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								if (current == null) {
									current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
								}
								set(current, "maximum", lv_maximum_2_0,
										"org.osate.xtext.aadl2.properties.Properties.NumAlt");
								afterParserOrEnumRuleCall();

							}

						}

					}

					// InternalAgreeParser.g:8555:2: (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
					int alt113 = 2;
					int LA113_0 = input.LA(1);

					if ((LA113_0 == Delta)) {
						alt113 = 1;
					}
					switch (alt113) {
					case 1:
					// InternalAgreeParser.g:8556:2: otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) )
					{
						otherlv_3 = (Token) match(input, Delta, FollowSets000.FOLLOW_96);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());

						}
						// InternalAgreeParser.g:8560:1: ( (lv_delta_4_0= ruleNumAlt ) )
						// InternalAgreeParser.g:8561:1: (lv_delta_4_0= ruleNumAlt )
						{
							// InternalAgreeParser.g:8561:1: (lv_delta_4_0= ruleNumAlt )
							// InternalAgreeParser.g:8562:3: lv_delta_4_0= ruleNumAlt
							{
								if (state.backtracking == 0) {

									newCompositeNode(grammarAccess.getNumericRangeTermAccess()
											.getDeltaNumAltParserRuleCall_3_1_0());

								}
								pushFollow(FollowSets000.FOLLOW_2);
								lv_delta_4_0 = ruleNumAlt();

								state._fsp--;
								if (state.failed) {
									return current;
								}
								if (state.backtracking == 0) {

									if (current == null) {
										current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
									}
									set(current, "delta", lv_delta_4_0,
											"org.osate.xtext.aadl2.properties.Properties.NumAlt");
									afterParserOrEnumRuleCall();

								}

							}

						}

					}
						break;

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleNumericRangeTerm"

	// $ANTLR start "entryRuleNumAlt"
	// InternalAgreeParser.g:8586:1: entryRuleNumAlt returns [EObject current=null] : iv_ruleNumAlt= ruleNumAlt EOF ;
	public final EObject entryRuleNumAlt() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNumAlt = null;

		try {
			// InternalAgreeParser.g:8587:2: (iv_ruleNumAlt= ruleNumAlt EOF )
			// InternalAgreeParser.g:8588:2: iv_ruleNumAlt= ruleNumAlt EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getNumAltRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleNumAlt = ruleNumAlt();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleNumAlt;
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleNumAlt"

	// $ANTLR start "ruleNumAlt"
	// InternalAgreeParser.g:8595:1: ruleNumAlt returns [EObject current=null] : (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm |
	// this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) ;
	public final EObject ruleNumAlt() throws RecognitionException {
		EObject current = null;

		EObject this_RealTerm_0 = null;

		EObject this_IntegerTerm_1 = null;

		EObject this_SignedConstant_2 = null;

		EObject this_ConstantValue_3 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8598:28: ( (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant
			// | this_ConstantValue_3= ruleConstantValue ) )
			// InternalAgreeParser.g:8599:1: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant |
			// this_ConstantValue_3= ruleConstantValue )
			{
				// InternalAgreeParser.g:8599:1: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2=
				// ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
				int alt114 = 4;
				switch (input.LA(1)) {
				case PlusSign: {
					switch (input.LA(2)) {
					case RULE_ID: {
						alt114 = 3;
					}
						break;
					case RULE_REAL_LIT: {
						alt114 = 1;
					}
						break;
					case RULE_INTEGER_LIT: {
						alt114 = 2;
					}
						break;
					default:
						if (state.backtracking > 0) {
							state.failed = true;
							return current;
						}
						NoViableAltException nvae = new NoViableAltException("", 114, 1, input);

						throw nvae;
					}

				}
					break;
				case HyphenMinus: {
					switch (input.LA(2)) {
					case RULE_REAL_LIT: {
						alt114 = 1;
					}
						break;
					case RULE_INTEGER_LIT: {
						alt114 = 2;
					}
						break;
					case RULE_ID: {
						alt114 = 3;
					}
						break;
					default:
						if (state.backtracking > 0) {
							state.failed = true;
							return current;
						}
						NoViableAltException nvae = new NoViableAltException("", 114, 2, input);

						throw nvae;
					}

				}
					break;
				case RULE_REAL_LIT: {
					alt114 = 1;
				}
					break;
				case RULE_INTEGER_LIT: {
					alt114 = 2;
				}
					break;
				case RULE_ID: {
					alt114 = 4;
				}
					break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return current;
					}
					NoViableAltException nvae = new NoViableAltException("", 114, 0, input);

					throw nvae;
				}

				switch (alt114) {
				case 1:
				// InternalAgreeParser.g:8600:5: this_RealTerm_0= ruleRealTerm
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getNumAltAccess().getRealTermParserRuleCall_0());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_RealTerm_0 = ruleRealTerm();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_RealTerm_0;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:8610:5: this_IntegerTerm_1= ruleIntegerTerm
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getNumAltAccess().getIntegerTermParserRuleCall_1());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_IntegerTerm_1 = ruleIntegerTerm();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_IntegerTerm_1;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 3:
				// InternalAgreeParser.g:8620:5: this_SignedConstant_2= ruleSignedConstant
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getNumAltAccess().getSignedConstantParserRuleCall_2());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_SignedConstant_2 = ruleSignedConstant();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_SignedConstant_2;
						afterParserOrEnumRuleCall();

					}

				}
					break;
				case 4:
				// InternalAgreeParser.g:8630:5: this_ConstantValue_3= ruleConstantValue
				{
					if (state.backtracking == 0) {

						newCompositeNode(grammarAccess.getNumAltAccess().getConstantValueParserRuleCall_3());

					}
					pushFollow(FollowSets000.FOLLOW_2);
					this_ConstantValue_3 = ruleConstantValue();

					state._fsp--;
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current = this_ConstantValue_3;
						afterParserOrEnumRuleCall();

					}

				}
					break;

				}

			}

			if (state.backtracking == 0) {
				leaveRule();
			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleNumAlt"

	// $ANTLR start "entryRuleAppliesToKeywords"
	// InternalAgreeParser.g:8646:1: entryRuleAppliesToKeywords returns [String current=null] : iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF ;
	public final String entryRuleAppliesToKeywords() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_ruleAppliesToKeywords = null;

		try {
			// InternalAgreeParser.g:8647:1: (iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF )
			// InternalAgreeParser.g:8648:2: iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getAppliesToKeywordsRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleAppliesToKeywords = ruleAppliesToKeywords();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleAppliesToKeywords.getText();
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleAppliesToKeywords"

	// $ANTLR start "ruleAppliesToKeywords"
	// InternalAgreeParser.g:8655:1: ruleAppliesToKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Applies kw= To ) ;
	public final AntlrDatatypeRuleToken ruleAppliesToKeywords() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token kw = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8659:6: ( (kw= Applies kw= To ) )
			// InternalAgreeParser.g:8660:1: (kw= Applies kw= To )
			{
				// InternalAgreeParser.g:8660:1: (kw= Applies kw= To )
				// InternalAgreeParser.g:8661:2: kw= Applies kw= To
				{
					kw = (Token) match(input, Applies, FollowSets000.FOLLOW_100);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getAppliesToKeywordsAccess().getAppliesKeyword_0());

					}
					kw = (Token) match(input, To, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getAppliesToKeywordsAccess().getToKeyword_1());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();

			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleAppliesToKeywords"

	// $ANTLR start "entryRuleInBindingKeywords"
	// InternalAgreeParser.g:8680:1: entryRuleInBindingKeywords returns [String current=null] : iv_ruleInBindingKeywords= ruleInBindingKeywords EOF ;
	public final String entryRuleInBindingKeywords() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_ruleInBindingKeywords = null;

		try {
			// InternalAgreeParser.g:8681:1: (iv_ruleInBindingKeywords= ruleInBindingKeywords EOF )
			// InternalAgreeParser.g:8682:2: iv_ruleInBindingKeywords= ruleInBindingKeywords EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getInBindingKeywordsRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleInBindingKeywords = ruleInBindingKeywords();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleInBindingKeywords.getText();
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleInBindingKeywords"

	// $ANTLR start "ruleInBindingKeywords"
	// InternalAgreeParser.g:8689:1: ruleInBindingKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In kw= Binding ) ;
	public final AntlrDatatypeRuleToken ruleInBindingKeywords() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token kw = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8693:6: ( (kw= In kw= Binding ) )
			// InternalAgreeParser.g:8694:1: (kw= In kw= Binding )
			{
				// InternalAgreeParser.g:8694:1: (kw= In kw= Binding )
				// InternalAgreeParser.g:8695:2: kw= In kw= Binding
				{
					kw = (Token) match(input, In, FollowSets000.FOLLOW_101);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getInBindingKeywordsAccess().getInKeyword_0());

					}
					kw = (Token) match(input, Binding, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getInBindingKeywordsAccess().getBindingKeyword_1());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();

			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleInBindingKeywords"

	// $ANTLR start "entryRuleInModesKeywords"
	// InternalAgreeParser.g:8714:1: entryRuleInModesKeywords returns [String current=null] : iv_ruleInModesKeywords= ruleInModesKeywords EOF ;
	public final String entryRuleInModesKeywords() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_ruleInModesKeywords = null;

		try {
			// InternalAgreeParser.g:8715:1: (iv_ruleInModesKeywords= ruleInModesKeywords EOF )
			// InternalAgreeParser.g:8716:2: iv_ruleInModesKeywords= ruleInModesKeywords EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getInModesKeywordsRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleInModesKeywords = ruleInModesKeywords();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleInModesKeywords.getText();
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleInModesKeywords"

	// $ANTLR start "ruleInModesKeywords"
	// InternalAgreeParser.g:8723:1: ruleInModesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In kw= Modes ) ;
	public final AntlrDatatypeRuleToken ruleInModesKeywords() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token kw = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8727:6: ( (kw= In kw= Modes ) )
			// InternalAgreeParser.g:8728:1: (kw= In kw= Modes )
			{
				// InternalAgreeParser.g:8728:1: (kw= In kw= Modes )
				// InternalAgreeParser.g:8729:2: kw= In kw= Modes
				{
					kw = (Token) match(input, In, FollowSets000.FOLLOW_102);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getInModesKeywordsAccess().getInKeyword_0());

					}
					kw = (Token) match(input, Modes, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getInModesKeywordsAccess().getModesKeyword_1());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();

			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleInModesKeywords"

	// $ANTLR start "entryRuleINTVALUE"
	// InternalAgreeParser.g:8748:1: entryRuleINTVALUE returns [String current=null] : iv_ruleINTVALUE= ruleINTVALUE EOF ;
	public final String entryRuleINTVALUE() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_ruleINTVALUE = null;

		try {
			// InternalAgreeParser.g:8749:1: (iv_ruleINTVALUE= ruleINTVALUE EOF )
			// InternalAgreeParser.g:8750:2: iv_ruleINTVALUE= ruleINTVALUE EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getINTVALUERule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleINTVALUE = ruleINTVALUE();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleINTVALUE.getText();
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleINTVALUE"

	// $ANTLR start "ruleINTVALUE"
	// InternalAgreeParser.g:8757:1: ruleINTVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_LIT_0= RULE_INTEGER_LIT ;
	public final AntlrDatatypeRuleToken ruleINTVALUE() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token this_INTEGER_LIT_0 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8761:6: (this_INTEGER_LIT_0= RULE_INTEGER_LIT )
			// InternalAgreeParser.g:8762:5: this_INTEGER_LIT_0= RULE_INTEGER_LIT
			{
				this_INTEGER_LIT_0 = (Token) match(input, RULE_INTEGER_LIT, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {

					current.merge(this_INTEGER_LIT_0);

				}
				if (state.backtracking == 0) {

					newLeafNode(this_INTEGER_LIT_0, grammarAccess.getINTVALUEAccess().getINTEGER_LITTerminalRuleCall());

				}

			}

			if (state.backtracking == 0) {
				leaveRule();

			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleINTVALUE"

	// $ANTLR start "entryRuleQCLREF"
	// InternalAgreeParser.g:8777:1: entryRuleQCLREF returns [String current=null] : iv_ruleQCLREF= ruleQCLREF EOF ;
	public final String entryRuleQCLREF() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_ruleQCLREF = null;

		try {
			// InternalAgreeParser.g:8778:1: (iv_ruleQCLREF= ruleQCLREF EOF )
			// InternalAgreeParser.g:8779:2: iv_ruleQCLREF= ruleQCLREF EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getQCLREFRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleQCLREF = ruleQCLREF();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleQCLREF.getText();
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleQCLREF"

	// $ANTLR start "ruleQCLREF"
	// InternalAgreeParser.g:8786:1: ruleQCLREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= ColonColon
	// this_ID_2= RULE_ID ) ;
	public final AntlrDatatypeRuleToken ruleQCLREF() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token this_ID_0 = null;
		Token kw = null;
		Token this_ID_2 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8790:6: ( (this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID ) )
			// InternalAgreeParser.g:8791:1: (this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID )
			{
				// InternalAgreeParser.g:8791:1: (this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID )
				// InternalAgreeParser.g:8791:6: this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID
				{
					this_ID_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_85);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(this_ID_0);

					}
					if (state.backtracking == 0) {

						newLeafNode(this_ID_0, grammarAccess.getQCLREFAccess().getIDTerminalRuleCall_0());

					}
					kw = (Token) match(input, ColonColon, FollowSets000.FOLLOW_11);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(kw);
						newLeafNode(kw, grammarAccess.getQCLREFAccess().getColonColonKeyword_1());

					}
					this_ID_2 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_2);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(this_ID_2);

					}
					if (state.backtracking == 0) {

						newLeafNode(this_ID_2, grammarAccess.getQCLREFAccess().getIDTerminalRuleCall_2());

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();

			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleQCLREF"

	// $ANTLR start "entryRuleQPREF"
	// InternalAgreeParser.g:8819:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
	public final String entryRuleQPREF() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_ruleQPREF = null;

		try {
			// InternalAgreeParser.g:8820:1: (iv_ruleQPREF= ruleQPREF EOF )
			// InternalAgreeParser.g:8821:2: iv_ruleQPREF= ruleQPREF EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getQPREFRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleQPREF = ruleQPREF();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleQPREF.getText();
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleQPREF"

	// $ANTLR start "ruleQPREF"
	// InternalAgreeParser.g:8828:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon
	// this_ID_2= RULE_ID )? ) ;
	public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token this_ID_0 = null;
		Token kw = null;
		Token this_ID_2 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8832:6: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) )
			// InternalAgreeParser.g:8833:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
			{
				// InternalAgreeParser.g:8833:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
				// InternalAgreeParser.g:8833:6: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )?
				{
					this_ID_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_103);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(this_ID_0);

					}
					if (state.backtracking == 0) {

						newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0());

					}
					// InternalAgreeParser.g:8840:1: (kw= ColonColon this_ID_2= RULE_ID )?
					int alt115 = 2;
					int LA115_0 = input.LA(1);

					if ((LA115_0 == ColonColon)) {
						alt115 = 1;
					}
					switch (alt115) {
					case 1:
					// InternalAgreeParser.g:8841:2: kw= ColonColon this_ID_2= RULE_ID
					{
						kw = (Token) match(input, ColonColon, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							current.merge(kw);
							newLeafNode(kw, grammarAccess.getQPREFAccess().getColonColonKeyword_1_0());

						}
						this_ID_2 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							current.merge(this_ID_2);

						}
						if (state.backtracking == 0) {

							newLeafNode(this_ID_2, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1());

						}

					}
						break;

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();

			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleQPREF"

	// $ANTLR start "entryRuleQCREF"
	// InternalAgreeParser.g:8861:1: entryRuleQCREF returns [String current=null] : iv_ruleQCREF= ruleQCREF EOF ;
	public final String entryRuleQCREF() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_ruleQCREF = null;

		try {
			// InternalAgreeParser.g:8862:1: (iv_ruleQCREF= ruleQCREF EOF )
			// InternalAgreeParser.g:8863:2: iv_ruleQCREF= ruleQCREF EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getQCREFRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleQCREF = ruleQCREF();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleQCREF.getText();
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleQCREF"

	// $ANTLR start "ruleQCREF"
	// InternalAgreeParser.g:8870:1: ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ColonColon )*
	// this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) ;
	public final AntlrDatatypeRuleToken ruleQCREF() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token this_ID_0 = null;
		Token kw = null;
		Token this_ID_2 = null;
		Token this_ID_4 = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8874:6: ( ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) )
			// InternalAgreeParser.g:8875:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
			{
				// InternalAgreeParser.g:8875:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
				// InternalAgreeParser.g:8875:2: (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )?
				{
					// InternalAgreeParser.g:8875:2: (this_ID_0= RULE_ID kw= ColonColon )*
					loop116: do {
						int alt116 = 2;
						int LA116_0 = input.LA(1);

						if ((LA116_0 == RULE_ID)) {
							int LA116_1 = input.LA(2);

							if ((LA116_1 == ColonColon)) {
								alt116 = 1;
							}

						}

						switch (alt116) {
						case 1:
						// InternalAgreeParser.g:8875:7: this_ID_0= RULE_ID kw= ColonColon
						{
							this_ID_0 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_85);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								current.merge(this_ID_0);

							}
							if (state.backtracking == 0) {

								newLeafNode(this_ID_0, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0());

							}
							kw = (Token) match(input, ColonColon, FollowSets000.FOLLOW_11);
							if (state.failed) {
								return current;
							}
							if (state.backtracking == 0) {

								current.merge(kw);
								newLeafNode(kw, grammarAccess.getQCREFAccess().getColonColonKeyword_0_1());

							}

						}
							break;

						default:
							break loop116;
						}
					} while (true);

					this_ID_2 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_80);
					if (state.failed) {
						return current;
					}
					if (state.backtracking == 0) {

						current.merge(this_ID_2);

					}
					if (state.backtracking == 0) {

						newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1());

					}
					// InternalAgreeParser.g:8895:1: (kw= FullStop this_ID_4= RULE_ID )?
					int alt117 = 2;
					int LA117_0 = input.LA(1);

					if ((LA117_0 == FullStop)) {
						alt117 = 1;
					}
					switch (alt117) {
					case 1:
					// InternalAgreeParser.g:8896:2: kw= FullStop this_ID_4= RULE_ID
					{
						kw = (Token) match(input, FullStop, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							current.merge(kw);
							newLeafNode(kw, grammarAccess.getQCREFAccess().getFullStopKeyword_2_0());

						}
						this_ID_4 = (Token) match(input, RULE_ID, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return current;
						}
						if (state.backtracking == 0) {

							current.merge(this_ID_4);

						}
						if (state.backtracking == 0) {

							newLeafNode(this_ID_4, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_2_1());

						}

					}
						break;

					}

				}

			}

			if (state.backtracking == 0) {
				leaveRule();

			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleQCREF"

	// $ANTLR start "entryRuleSTAR"
	// InternalAgreeParser.g:8916:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
	public final String entryRuleSTAR() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_ruleSTAR = null;

		try {
			// InternalAgreeParser.g:8917:1: (iv_ruleSTAR= ruleSTAR EOF )
			// InternalAgreeParser.g:8918:2: iv_ruleSTAR= ruleSTAR EOF
			{
				if (state.backtracking == 0) {
					newCompositeNode(grammarAccess.getSTARRule());
				}
				pushFollow(FollowSets000.FOLLOW_1);
				iv_ruleSTAR = ruleSTAR();

				state._fsp--;
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {
					current = iv_ruleSTAR.getText();
				}
				match(input, EOF, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleSTAR"

	// $ANTLR start "ruleSTAR"
	// InternalAgreeParser.g:8925:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Asterisk ;
	public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token kw = null;

		enterRule();

		try {
			// InternalAgreeParser.g:8929:6: (kw= Asterisk )
			// InternalAgreeParser.g:8931:2: kw= Asterisk
			{
				kw = (Token) match(input, Asterisk, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return current;
				}
				if (state.backtracking == 0) {

					current.merge(kw);
					newLeafNode(kw, grammarAccess.getSTARAccess().getAsteriskKeyword());

				}

			}

			if (state.backtracking == 0) {
				leaveRule();

			}
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleSTAR"

	// $ANTLR start synpred1_InternalAgreeParser
	public final void synpred1_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:1064:4: ( ( () When ( ( ruleExpr ) ) Holds ) )
		// InternalAgreeParser.g:1064:5: ( () When ( ( ruleExpr ) ) Holds )
		{
			// InternalAgreeParser.g:1064:5: ( () When ( ( ruleExpr ) ) Holds )
			// InternalAgreeParser.g:1064:6: () When ( ( ruleExpr ) ) Holds
			{
				// InternalAgreeParser.g:1064:6: ()
				// InternalAgreeParser.g:1065:1:
				{
				}

				match(input, When, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:1067:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:1068:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:1068:1: ( ruleExpr )
					// InternalAgreeParser.g:1069:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_12);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				match(input, Holds, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		}
	}
	// $ANTLR end synpred1_InternalAgreeParser

	// $ANTLR start synpred2_InternalAgreeParser
	public final void synpred2_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:1193:8: ( ( () When ( ( ruleExpr ) ) Occurs ) )
		// InternalAgreeParser.g:1193:9: ( () When ( ( ruleExpr ) ) Occurs )
		{
			// InternalAgreeParser.g:1193:9: ( () When ( ( ruleExpr ) ) Occurs )
			// InternalAgreeParser.g:1193:10: () When ( ( ruleExpr ) ) Occurs
			{
				// InternalAgreeParser.g:1193:10: ()
				// InternalAgreeParser.g:1194:1:
				{
				}

				match(input, When, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:1196:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:1197:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:1197:1: ( ruleExpr )
					// InternalAgreeParser.g:1198:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_16);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				match(input, Occurs, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		}
	}
	// $ANTLR end synpred2_InternalAgreeParser

	// $ANTLR start synpred3_InternalAgreeParser
	public final void synpred3_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:1342:4: ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) ) )
		// InternalAgreeParser.g:1342:5: ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) )
		{
			// InternalAgreeParser.g:1342:5: ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) )
			// InternalAgreeParser.g:1342:6: () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs )
			{
				// InternalAgreeParser.g:1342:6: ()
				// InternalAgreeParser.g:1343:1:
				{
				}

				match(input, Whenever, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:1345:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:1346:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:1346:1: ( ruleExpr )
					// InternalAgreeParser.g:1347:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_16);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				match(input, Occurs, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:1351:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:1352:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:1352:1: ( ruleExpr )
					// InternalAgreeParser.g:1353:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_21);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				// InternalAgreeParser.g:1355:2: ( ( Exclusively ) )?
				int alt118 = 2;
				int LA118_0 = input.LA(1);

				if ((LA118_0 == Exclusively)) {
					alt118 = 1;
				}
				switch (alt118) {
				case 1:
				// InternalAgreeParser.g:1356:1: ( Exclusively )
				{
					// InternalAgreeParser.g:1356:1: ( Exclusively )
					// InternalAgreeParser.g:1358:1: Exclusively
					{
						match(input, Exclusively, FollowSets000.FOLLOW_22);
						if (state.failed) {
							return;
						}

					}

				}
					break;

				}

				if (input.LA(1) == Occurs || input.LA(1) == Occur) {
					input.consume();
					state.errorRecovery = false;
					state.failed = false;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return;
					}
					MismatchedSetException mse = new MismatchedSetException(null, input);
					throw mse;
				}

			}

		}
	}
	// $ANTLR end synpred3_InternalAgreeParser

	// $ANTLR start synpred4_InternalAgreeParser
	public final void synpred4_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:1470:8: ( ( () Whenever ( ( ruleExpr ) ) Becomes True ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) ) )
		// InternalAgreeParser.g:1470:9: ( () Whenever ( ( ruleExpr ) ) Becomes True ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) )
		{
			// InternalAgreeParser.g:1470:9: ( () Whenever ( ( ruleExpr ) ) Becomes True ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs ) )
			// InternalAgreeParser.g:1470:10: () Whenever ( ( ruleExpr ) ) Becomes True ( ( ruleExpr ) ) ( ( Exclusively ) )? ( Occur | Occurs )
			{
				// InternalAgreeParser.g:1470:10: ()
				// InternalAgreeParser.g:1471:1:
				{
				}

				match(input, Whenever, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:1473:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:1474:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:1474:1: ( ruleExpr )
					// InternalAgreeParser.g:1475:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_23);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				match(input, Becomes, FollowSets000.FOLLOW_24);
				if (state.failed) {
					return;
				}
				match(input, True, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:1481:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:1482:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:1482:1: ( ruleExpr )
					// InternalAgreeParser.g:1483:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_21);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				// InternalAgreeParser.g:1485:2: ( ( Exclusively ) )?
				int alt119 = 2;
				int LA119_0 = input.LA(1);

				if ((LA119_0 == Exclusively)) {
					alt119 = 1;
				}
				switch (alt119) {
				case 1:
				// InternalAgreeParser.g:1486:1: ( Exclusively )
				{
					// InternalAgreeParser.g:1486:1: ( Exclusively )
					// InternalAgreeParser.g:1488:1: Exclusively
					{
						match(input, Exclusively, FollowSets000.FOLLOW_22);
						if (state.failed) {
							return;
						}

					}

				}
					break;

				}

				if (input.LA(1) == Occurs || input.LA(1) == Occur) {
					input.consume();
					state.errorRecovery = false;
					state.failed = false;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return;
					}
					MismatchedSetException mse = new MismatchedSetException(null, input);
					throw mse;
				}

			}

		}
	}
	// $ANTLR end synpred4_InternalAgreeParser

	// $ANTLR start synpred5_InternalAgreeParser
	public final void synpred5_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:1605:8: ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? Holds ) )
		// InternalAgreeParser.g:1605:9: ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? Holds )
		{
			// InternalAgreeParser.g:1605:9: ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? Holds )
			// InternalAgreeParser.g:1605:10: () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) ( ( Exclusively ) )? Holds
			{
				// InternalAgreeParser.g:1605:10: ()
				// InternalAgreeParser.g:1606:1:
				{
				}

				match(input, Whenever, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:1608:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:1609:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:1609:1: ( ruleExpr )
					// InternalAgreeParser.g:1610:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_16);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				match(input, Occurs, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:1614:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:1615:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:1615:1: ( ruleExpr )
					// InternalAgreeParser.g:1616:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_25);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				// InternalAgreeParser.g:1618:2: ( ( Exclusively ) )?
				int alt120 = 2;
				int LA120_0 = input.LA(1);

				if ((LA120_0 == Exclusively)) {
					alt120 = 1;
				}
				switch (alt120) {
				case 1:
				// InternalAgreeParser.g:1619:1: ( Exclusively )
				{
					// InternalAgreeParser.g:1619:1: ( Exclusively )
					// InternalAgreeParser.g:1621:1: Exclusively
					{
						match(input, Exclusively, FollowSets000.FOLLOW_12);
						if (state.failed) {
							return;
						}

					}

				}
					break;

				}

				match(input, Holds, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		}
	}
	// $ANTLR end synpred5_InternalAgreeParser

	// $ANTLR start synpred6_InternalAgreeParser
	public final void synpred6_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:1724:8: ( ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) Implies ) )
		// InternalAgreeParser.g:1724:9: ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) Implies )
		{
			// InternalAgreeParser.g:1724:9: ( () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) Implies )
			// InternalAgreeParser.g:1724:10: () Whenever ( ( ruleExpr ) ) Occurs ( ( ruleExpr ) ) Implies
			{
				// InternalAgreeParser.g:1724:10: ()
				// InternalAgreeParser.g:1725:1:
				{
				}

				match(input, Whenever, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:1727:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:1728:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:1728:1: ( ruleExpr )
					// InternalAgreeParser.g:1729:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_16);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				match(input, Occurs, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:1733:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:1734:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:1734:1: ( ruleExpr )
					// InternalAgreeParser.g:1735:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_26);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				match(input, Implies, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		}
	}
	// $ANTLR end synpred6_InternalAgreeParser

	// $ANTLR start synpred7_InternalAgreeParser
	public final void synpred7_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:1874:4: ( ( () Condition ( ( ruleExpr ) ) Occurs Each ) )
		// InternalAgreeParser.g:1874:5: ( () Condition ( ( ruleExpr ) ) Occurs Each )
		{
			// InternalAgreeParser.g:1874:5: ( () Condition ( ( ruleExpr ) ) Occurs Each )
			// InternalAgreeParser.g:1874:6: () Condition ( ( ruleExpr ) ) Occurs Each
			{
				// InternalAgreeParser.g:1874:6: ()
				// InternalAgreeParser.g:1875:1:
				{
				}

				match(input, Condition, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:1877:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:1878:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:1878:1: ( ruleExpr )
					// InternalAgreeParser.g:1879:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_16);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				match(input, Occurs, FollowSets000.FOLLOW_28);
				if (state.failed) {
					return;
				}
				match(input, Each, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		}
	}
	// $ANTLR end synpred7_InternalAgreeParser

	// $ANTLR start synpred8_InternalAgreeParser
	public final void synpred8_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:1971:8: ( ( () Condition ( ( ruleExpr ) ) Occurs Sporadic ) )
		// InternalAgreeParser.g:1971:9: ( () Condition ( ( ruleExpr ) ) Occurs Sporadic )
		{
			// InternalAgreeParser.g:1971:9: ( () Condition ( ( ruleExpr ) ) Occurs Sporadic )
			// InternalAgreeParser.g:1971:10: () Condition ( ( ruleExpr ) ) Occurs Sporadic
			{
				// InternalAgreeParser.g:1971:10: ()
				// InternalAgreeParser.g:1972:1:
				{
				}

				match(input, Condition, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:1974:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:1975:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:1975:1: ( ruleExpr )
					// InternalAgreeParser.g:1976:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_16);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				match(input, Occurs, FollowSets000.FOLLOW_31);
				if (state.failed) {
					return;
				}
				match(input, Sporadic, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		}
	}
	// $ANTLR end synpred8_InternalAgreeParser

	// $ANTLR start synpred9_InternalAgreeParser
	public final void synpred9_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:2098:3: ( ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket ) )
		// InternalAgreeParser.g:2098:4: ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket )
		{
			// InternalAgreeParser.g:2098:4: ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket )
			// InternalAgreeParser.g:2098:5: () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket
			{
				// InternalAgreeParser.g:2098:5: ()
				// InternalAgreeParser.g:2099:1:
				{
				}

				match(input, LeftSquareBracket, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:2101:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:2102:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:2102:1: ( ruleExpr )
					// InternalAgreeParser.g:2103:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_34);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				match(input, Comma, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:2107:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:2108:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:2108:1: ( ruleExpr )
					// InternalAgreeParser.g:2109:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_35);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				match(input, RightSquareBracket, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		}
	}
	// $ANTLR end synpred9_InternalAgreeParser

	// $ANTLR start synpred10_InternalAgreeParser
	public final void synpred10_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:2171:7: ( ( () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket ) )
		// InternalAgreeParser.g:2171:8: ( () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket )
		{
			// InternalAgreeParser.g:2171:8: ( () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket )
			// InternalAgreeParser.g:2171:9: () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightSquareBracket
			{
				// InternalAgreeParser.g:2171:9: ()
				// InternalAgreeParser.g:2172:1:
				{
				}

				match(input, LeftParenthesis, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:2174:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:2175:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:2175:1: ( ruleExpr )
					// InternalAgreeParser.g:2176:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_34);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				match(input, Comma, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:2180:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:2181:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:2181:1: ( ruleExpr )
					// InternalAgreeParser.g:2182:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_35);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				match(input, RightSquareBracket, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		}
	}
	// $ANTLR end synpred10_InternalAgreeParser

	// $ANTLR start synpred11_InternalAgreeParser
	public final void synpred11_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:2244:7: ( ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis ) )
		// InternalAgreeParser.g:2244:8: ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis )
		{
			// InternalAgreeParser.g:2244:8: ( () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis )
			// InternalAgreeParser.g:2244:9: () LeftSquareBracket ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis
			{
				// InternalAgreeParser.g:2244:9: ()
				// InternalAgreeParser.g:2245:1:
				{
				}

				match(input, LeftSquareBracket, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:2247:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:2248:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:2248:1: ( ruleExpr )
					// InternalAgreeParser.g:2249:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_34);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				match(input, Comma, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:2253:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:2254:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:2254:1: ( ruleExpr )
					// InternalAgreeParser.g:2255:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_36);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				match(input, RightParenthesis, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		}
	}
	// $ANTLR end synpred11_InternalAgreeParser

	// $ANTLR start synpred12_InternalAgreeParser
	public final void synpred12_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:2317:7: ( ( () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis ) )
		// InternalAgreeParser.g:2317:8: ( () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis )
		{
			// InternalAgreeParser.g:2317:8: ( () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis )
			// InternalAgreeParser.g:2317:9: () LeftParenthesis ( ( ruleExpr ) ) Comma ( ( ruleExpr ) ) RightParenthesis
			{
				// InternalAgreeParser.g:2317:9: ()
				// InternalAgreeParser.g:2318:1:
				{
				}

				match(input, LeftParenthesis, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:2320:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:2321:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:2321:1: ( ruleExpr )
					// InternalAgreeParser.g:2322:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_34);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				match(input, Comma, FollowSets000.FOLLOW_9);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:2326:1: ( ( ruleExpr ) )
				// InternalAgreeParser.g:2327:1: ( ruleExpr )
				{
					// InternalAgreeParser.g:2327:1: ( ruleExpr )
					// InternalAgreeParser.g:2328:1: ruleExpr
					{
						pushFollow(FollowSets000.FOLLOW_36);
						ruleExpr();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

				match(input, RightParenthesis, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		}
	}
	// $ANTLR end synpred12_InternalAgreeParser

	// $ANTLR start synpred13_InternalAgreeParser
	public final void synpred13_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:4746:3: ( ( () ( ( HyphenMinusGreaterThanSign ) ) ) )
		// InternalAgreeParser.g:4746:4: ( () ( ( HyphenMinusGreaterThanSign ) ) )
		{
			// InternalAgreeParser.g:4746:4: ( () ( ( HyphenMinusGreaterThanSign ) ) )
			// InternalAgreeParser.g:4746:5: () ( ( HyphenMinusGreaterThanSign ) )
			{
				// InternalAgreeParser.g:4746:5: ()
				// InternalAgreeParser.g:4747:1:
				{
				}

				// InternalAgreeParser.g:4747:2: ( ( HyphenMinusGreaterThanSign ) )
				// InternalAgreeParser.g:4748:1: ( HyphenMinusGreaterThanSign )
				{
					// InternalAgreeParser.g:4748:1: ( HyphenMinusGreaterThanSign )
					// InternalAgreeParser.g:4750:1: HyphenMinusGreaterThanSign
					{
						match(input, HyphenMinusGreaterThanSign, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return;
						}

					}

				}

			}

		}
	}
	// $ANTLR end synpred13_InternalAgreeParser

	// $ANTLR start synpred14_InternalAgreeParser
	public final void synpred14_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:4824:3: ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )
		// InternalAgreeParser.g:4824:4: ( () ( ( EqualsSignGreaterThanSign ) ) )
		{
			// InternalAgreeParser.g:4824:4: ( () ( ( EqualsSignGreaterThanSign ) ) )
			// InternalAgreeParser.g:4824:5: () ( ( EqualsSignGreaterThanSign ) )
			{
				// InternalAgreeParser.g:4824:5: ()
				// InternalAgreeParser.g:4825:1:
				{
				}

				// InternalAgreeParser.g:4825:2: ( ( EqualsSignGreaterThanSign ) )
				// InternalAgreeParser.g:4826:1: ( EqualsSignGreaterThanSign )
				{
					// InternalAgreeParser.g:4826:1: ( EqualsSignGreaterThanSign )
					// InternalAgreeParser.g:4828:1: EqualsSignGreaterThanSign
					{
						match(input, EqualsSignGreaterThanSign, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return;
						}

					}

				}

			}

		}
	}
	// $ANTLR end synpred14_InternalAgreeParser

	// $ANTLR start synpred15_InternalAgreeParser
	public final void synpred15_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:4902:3: ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )
		// InternalAgreeParser.g:4902:4: ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) )
		{
			// InternalAgreeParser.g:4902:4: ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) )
			// InternalAgreeParser.g:4902:5: () ( ( LessThanSignEqualsSignGreaterThanSign ) )
			{
				// InternalAgreeParser.g:4902:5: ()
				// InternalAgreeParser.g:4903:1:
				{
				}

				// InternalAgreeParser.g:4903:2: ( ( LessThanSignEqualsSignGreaterThanSign ) )
				// InternalAgreeParser.g:4904:1: ( LessThanSignEqualsSignGreaterThanSign )
				{
					// InternalAgreeParser.g:4904:1: ( LessThanSignEqualsSignGreaterThanSign )
					// InternalAgreeParser.g:4906:1: LessThanSignEqualsSignGreaterThanSign
					{
						match(input, LessThanSignEqualsSignGreaterThanSign, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return;
						}

					}

				}

			}

		}
	}
	// $ANTLR end synpred15_InternalAgreeParser

	// $ANTLR start synpred16_InternalAgreeParser
	public final void synpred16_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:4980:3: ( ( () ( ( Or ) ) ) )
		// InternalAgreeParser.g:4980:4: ( () ( ( Or ) ) )
		{
			// InternalAgreeParser.g:4980:4: ( () ( ( Or ) ) )
			// InternalAgreeParser.g:4980:5: () ( ( Or ) )
			{
				// InternalAgreeParser.g:4980:5: ()
				// InternalAgreeParser.g:4981:1:
				{
				}

				// InternalAgreeParser.g:4981:2: ( ( Or ) )
				// InternalAgreeParser.g:4982:1: ( Or )
				{
					// InternalAgreeParser.g:4982:1: ( Or )
					// InternalAgreeParser.g:4984:1: Or
					{
						match(input, Or, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return;
						}

					}

				}

			}

		}
	}
	// $ANTLR end synpred16_InternalAgreeParser

	// $ANTLR start synpred17_InternalAgreeParser
	public final void synpred17_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:5058:3: ( ( () ( ( And ) ) ) )
		// InternalAgreeParser.g:5058:4: ( () ( ( And ) ) )
		{
			// InternalAgreeParser.g:5058:4: ( () ( ( And ) ) )
			// InternalAgreeParser.g:5058:5: () ( ( And ) )
			{
				// InternalAgreeParser.g:5058:5: ()
				// InternalAgreeParser.g:5059:1:
				{
				}

				// InternalAgreeParser.g:5059:2: ( ( And ) )
				// InternalAgreeParser.g:5060:1: ( And )
				{
					// InternalAgreeParser.g:5060:1: ( And )
					// InternalAgreeParser.g:5062:1: And
					{
						match(input, And, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return;
						}

					}

				}

			}

		}
	}
	// $ANTLR end synpred17_InternalAgreeParser

	// $ANTLR start synpred18_InternalAgreeParser
	public final void synpred18_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:5206:3: ( ( () ( ( ruleRelateOp ) ) ) )
		// InternalAgreeParser.g:5206:4: ( () ( ( ruleRelateOp ) ) )
		{
			// InternalAgreeParser.g:5206:4: ( () ( ( ruleRelateOp ) ) )
			// InternalAgreeParser.g:5206:5: () ( ( ruleRelateOp ) )
			{
				// InternalAgreeParser.g:5206:5: ()
				// InternalAgreeParser.g:5207:1:
				{
				}

				// InternalAgreeParser.g:5207:2: ( ( ruleRelateOp ) )
				// InternalAgreeParser.g:5208:1: ( ruleRelateOp )
				{
					// InternalAgreeParser.g:5208:1: ( ruleRelateOp )
					// InternalAgreeParser.g:5209:1: ruleRelateOp
					{
						pushFollow(FollowSets000.FOLLOW_2);
						ruleRelateOp();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

				}

			}

		}
	}
	// $ANTLR end synpred18_InternalAgreeParser

	// $ANTLR start synpred19_InternalAgreeParser
	public final void synpred19_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:5283:3: ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )
		// InternalAgreeParser.g:5283:4: ( () ( ( ( PlusSign | HyphenMinus ) ) ) )
		{
			// InternalAgreeParser.g:5283:4: ( () ( ( ( PlusSign | HyphenMinus ) ) ) )
			// InternalAgreeParser.g:5283:5: () ( ( ( PlusSign | HyphenMinus ) ) )
			{
				// InternalAgreeParser.g:5283:5: ()
				// InternalAgreeParser.g:5284:1:
				{
				}

				// InternalAgreeParser.g:5284:2: ( ( ( PlusSign | HyphenMinus ) ) )
				// InternalAgreeParser.g:5285:1: ( ( PlusSign | HyphenMinus ) )
				{
					// InternalAgreeParser.g:5285:1: ( ( PlusSign | HyphenMinus ) )
					// InternalAgreeParser.g:5286:1: ( PlusSign | HyphenMinus )
					{
						if (input.LA(1) == PlusSign || input.LA(1) == HyphenMinus) {
							input.consume();
							state.errorRecovery = false;
							state.failed = false;
						} else {
							if (state.backtracking > 0) {
								state.failed = true;
								return;
							}
							MismatchedSetException mse = new MismatchedSetException(null, input);
							throw mse;
						}

					}

				}

			}

		}
	}
	// $ANTLR end synpred19_InternalAgreeParser

	// $ANTLR start synpred20_InternalAgreeParser
	public final void synpred20_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:5384:3: ( ( () ( ( ( Asterisk | Solidus | Div | Mod ) ) ) ) )
		// InternalAgreeParser.g:5384:4: ( () ( ( ( Asterisk | Solidus | Div | Mod ) ) ) )
		{
			// InternalAgreeParser.g:5384:4: ( () ( ( ( Asterisk | Solidus | Div | Mod ) ) ) )
			// InternalAgreeParser.g:5384:5: () ( ( ( Asterisk | Solidus | Div | Mod ) ) )
			{
				// InternalAgreeParser.g:5384:5: ()
				// InternalAgreeParser.g:5385:1:
				{
				}

				// InternalAgreeParser.g:5385:2: ( ( ( Asterisk | Solidus | Div | Mod ) ) )
				// InternalAgreeParser.g:5386:1: ( ( Asterisk | Solidus | Div | Mod ) )
				{
					// InternalAgreeParser.g:5386:1: ( ( Asterisk | Solidus | Div | Mod ) )
					// InternalAgreeParser.g:5387:1: ( Asterisk | Solidus | Div | Mod )
					{
						if (input.LA(1) == Div || input.LA(1) == Mod || input.LA(1) == Asterisk
								|| input.LA(1) == Solidus) {
							input.consume();
							state.errorRecovery = false;
							state.failed = false;
						} else {
							if (state.backtracking > 0) {
								state.failed = true;
								return;
							}
							MismatchedSetException mse = new MismatchedSetException(null, input);
							throw mse;
						}

					}

				}

			}

		}
	}
	// $ANTLR end synpred20_InternalAgreeParser

	// $ANTLR start synpred21_InternalAgreeParser
	public final void synpred21_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:5519:3: ( ( () ( ( CircumflexAccent ) ) ) )
		// InternalAgreeParser.g:5519:4: ( () ( ( CircumflexAccent ) ) )
		{
			// InternalAgreeParser.g:5519:4: ( () ( ( CircumflexAccent ) ) )
			// InternalAgreeParser.g:5519:5: () ( ( CircumflexAccent ) )
			{
				// InternalAgreeParser.g:5519:5: ()
				// InternalAgreeParser.g:5520:1:
				{
				}

				// InternalAgreeParser.g:5520:2: ( ( CircumflexAccent ) )
				// InternalAgreeParser.g:5521:1: ( CircumflexAccent )
				{
					// InternalAgreeParser.g:5521:1: ( CircumflexAccent )
					// InternalAgreeParser.g:5523:1: CircumflexAccent
					{
						match(input, CircumflexAccent, FollowSets000.FOLLOW_2);
						if (state.failed) {
							return;
						}

					}

				}

			}

		}
	}
	// $ANTLR end synpred21_InternalAgreeParser

	// $ANTLR start synpred22_InternalAgreeParser
	public final void synpred22_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:5944:2: ( ( () ( LeftCurlyBracket ( ( RULE_ID ) ) ColonEqualsSign ( ( ruleExpr ) ) RightCurlyBracket )+ ) )
		// InternalAgreeParser.g:5944:3: ( () ( LeftCurlyBracket ( ( RULE_ID ) ) ColonEqualsSign ( ( ruleExpr ) ) RightCurlyBracket )+ )
		{
			// InternalAgreeParser.g:5944:3: ( () ( LeftCurlyBracket ( ( RULE_ID ) ) ColonEqualsSign ( ( ruleExpr ) ) RightCurlyBracket )+ )
			// InternalAgreeParser.g:5944:4: () ( LeftCurlyBracket ( ( RULE_ID ) ) ColonEqualsSign ( ( ruleExpr ) ) RightCurlyBracket )+
			{
				// InternalAgreeParser.g:5944:4: ()
				// InternalAgreeParser.g:5945:1:
				{
				}

				// InternalAgreeParser.g:5945:2: ( LeftCurlyBracket ( ( RULE_ID ) ) ColonEqualsSign ( ( ruleExpr ) ) RightCurlyBracket )+
				int cnt121 = 0;
				loop121: do {
					int alt121 = 2;
					int LA121_0 = input.LA(1);

					if ((LA121_0 == LeftCurlyBracket)) {
						alt121 = 1;
					}

					switch (alt121) {
					case 1:
					// InternalAgreeParser.g:5946:1: LeftCurlyBracket ( ( RULE_ID ) ) ColonEqualsSign ( ( ruleExpr ) ) RightCurlyBracket
					{
						match(input, LeftCurlyBracket, FollowSets000.FOLLOW_11);
						if (state.failed) {
							return;
						}
						// InternalAgreeParser.g:5947:1: ( ( RULE_ID ) )
						// InternalAgreeParser.g:5948:1: ( RULE_ID )
						{
							// InternalAgreeParser.g:5948:1: ( RULE_ID )
							// InternalAgreeParser.g:5949:2: RULE_ID
							{
								match(input, RULE_ID, FollowSets000.FOLLOW_78);
								if (state.failed) {
									return;
								}

							}

						}

						match(input, ColonEqualsSign, FollowSets000.FOLLOW_9);
						if (state.failed) {
							return;
						}
						// InternalAgreeParser.g:5954:1: ( ( ruleExpr ) )
						// InternalAgreeParser.g:5955:1: ( ruleExpr )
						{
							// InternalAgreeParser.g:5955:1: ( ruleExpr )
							// InternalAgreeParser.g:5956:1: ruleExpr
							{
								pushFollow(FollowSets000.FOLLOW_79);
								ruleExpr();

								state._fsp--;
								if (state.failed) {
									return;
								}

							}

						}

						match(input, RightCurlyBracket, FollowSets000.FOLLOW_77);
						if (state.failed) {
							return;
						}

					}
						break;

					default:
						if (cnt121 >= 1) {
							break loop121;
						}
						if (state.backtracking > 0) {
							state.failed = true;
							return;
						}
						EarlyExitException eee = new EarlyExitException(121, input);
						throw eee;
					}
					cnt121++;
				} while (true);

			}

		}
	}
	// $ANTLR end synpred22_InternalAgreeParser

	// $ANTLR start synpred23_InternalAgreeParser
	public final void synpred23_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:6597:4: ( ( () LeftParenthesis ) )
		// InternalAgreeParser.g:6597:5: ( () LeftParenthesis )
		{
			// InternalAgreeParser.g:6597:5: ( () LeftParenthesis )
			// InternalAgreeParser.g:6597:6: () LeftParenthesis
			{
				// InternalAgreeParser.g:6597:6: ()
				// InternalAgreeParser.g:6598:1:
				{
				}

				match(input, LeftParenthesis, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		}
	}
	// $ANTLR end synpred23_InternalAgreeParser

	// $ANTLR start synpred24_InternalAgreeParser
	public final void synpred24_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:6658:8: ( ( () LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )
		// InternalAgreeParser.g:6658:9: ( () LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign )
		{
			// InternalAgreeParser.g:6658:9: ( () LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign )
			// InternalAgreeParser.g:6658:10: () LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign
			{
				// InternalAgreeParser.g:6658:10: ()
				// InternalAgreeParser.g:6659:1:
				{
				}

				match(input, LeftCurlyBracket, FollowSets000.FOLLOW_11);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:6661:1: ( ( RULE_ID ) )
				// InternalAgreeParser.g:6662:1: ( RULE_ID )
				{
					// InternalAgreeParser.g:6662:1: ( RULE_ID )
					// InternalAgreeParser.g:6663:2: RULE_ID
					{
						match(input, RULE_ID, FollowSets000.FOLLOW_44);
						if (state.failed) {
							return;
						}

					}

				}

				match(input, EqualsSign, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		}
	}
	// $ANTLR end synpred24_InternalAgreeParser

	// $ANTLR start synpred25_InternalAgreeParser
	public final void synpred25_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:6798:3: ( ( FullStop ( ( ( ruleReservedVarTag ) ) | ( ( ruleNestedDotID ) ) ) ) )
		// InternalAgreeParser.g:6798:4: ( FullStop ( ( ( ruleReservedVarTag ) ) | ( ( ruleNestedDotID ) ) ) )
		{
			// InternalAgreeParser.g:6798:4: ( FullStop ( ( ( ruleReservedVarTag ) ) | ( ( ruleNestedDotID ) ) ) )
			// InternalAgreeParser.g:6799:1: FullStop ( ( ( ruleReservedVarTag ) ) | ( ( ruleNestedDotID ) ) )
			{
				match(input, FullStop, FollowSets000.FOLLOW_84);
				if (state.failed) {
					return;
				}
				// InternalAgreeParser.g:6800:1: ( ( ( ruleReservedVarTag ) ) | ( ( ruleNestedDotID ) ) )
				int alt122 = 2;
				int LA122_0 = input.LA(1);

				if (((LA122_0 >= KW__INSERT && LA122_0 <= KW__REMOVE) || LA122_0 == KW__COUNT || LA122_0 == KW__CLK)) {
					alt122 = 1;
				} else if ((LA122_0 == RULE_ID)) {
					alt122 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return;
					}
					NoViableAltException nvae = new NoViableAltException("", 122, 0, input);

					throw nvae;
				}
				switch (alt122) {
				case 1:
				// InternalAgreeParser.g:6800:2: ( ( ruleReservedVarTag ) )
				{
					// InternalAgreeParser.g:6800:2: ( ( ruleReservedVarTag ) )
					// InternalAgreeParser.g:6801:1: ( ruleReservedVarTag )
					{
						// InternalAgreeParser.g:6801:1: ( ruleReservedVarTag )
						// InternalAgreeParser.g:6802:1: ruleReservedVarTag
						{
							pushFollow(FollowSets000.FOLLOW_2);
							ruleReservedVarTag();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}

					}

				}
					break;
				case 2:
				// InternalAgreeParser.g:6805:6: ( ( ruleNestedDotID ) )
				{
					// InternalAgreeParser.g:6805:6: ( ( ruleNestedDotID ) )
					// InternalAgreeParser.g:6806:1: ( ruleNestedDotID )
					{
						// InternalAgreeParser.g:6806:1: ( ruleNestedDotID )
						// InternalAgreeParser.g:6807:1: ruleNestedDotID
						{
							pushFollow(FollowSets000.FOLLOW_2);
							ruleNestedDotID();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}

					}

				}
					break;

				}

			}

		}
	}
	// $ANTLR end synpred25_InternalAgreeParser

	// $ANTLR start synpred26_InternalAgreeParser
	public final void synpred26_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:6873:4: ( ( RULE_ID ColonColon ) )
		// InternalAgreeParser.g:6873:5: ( RULE_ID ColonColon )
		{
			// InternalAgreeParser.g:6873:5: ( RULE_ID ColonColon )
			// InternalAgreeParser.g:6873:6: RULE_ID ColonColon
			{
				match(input, RULE_ID, FollowSets000.FOLLOW_85);
				if (state.failed) {
					return;
				}
				match(input, ColonColon, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		}
	}
	// $ANTLR end synpred26_InternalAgreeParser

	// $ANTLR start synpred27_InternalAgreeParser
	public final void synpred27_InternalAgreeParser_fragment() throws RecognitionException {
		// InternalAgreeParser.g:6895:2: ( ( FullStop RULE_ID ) )
		// InternalAgreeParser.g:6895:3: ( FullStop RULE_ID )
		{
			// InternalAgreeParser.g:6895:3: ( FullStop RULE_ID )
			// InternalAgreeParser.g:6896:2: FullStop RULE_ID
			{
				match(input, FullStop, FollowSets000.FOLLOW_11);
				if (state.failed) {
					return;
				}
				match(input, RULE_ID, FollowSets000.FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		}
	}
	// $ANTLR end synpred27_InternalAgreeParser

	// Delegated rules

	public final boolean synpred3_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred17_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred8_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred12_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred12_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred23_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred23_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred5_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred14_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred14_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred2_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred25_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred25_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred20_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred7_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred27_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred27_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred22_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred22_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred11_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred11_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred16_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred16_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred19_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred13_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred13_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred4_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred1_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred9_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred10_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred18_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred21_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred21_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred24_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred24_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred26_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred26_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred15_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred15_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred6_InternalAgreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_InternalAgreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	protected DFA1 dfa1 = new DFA1(this);
	protected DFA69 dfa69 = new DFA69(this);
	protected DFA82 dfa82 = new DFA82(this);
	protected DFA100 dfa100 = new DFA100(this);
	static final String dfa_1s = "\14\uffff";
	static final String dfa_2s = "\1\uffff\1\12\12\uffff";
	static final String dfa_3s = "\1\4\1\157\12\uffff";
	static final String dfa_4s = "\1\u0082\1\157\12\uffff";
	static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\1";
	static final String dfa_6s = "\14\uffff}>";
	static final String[] dfa_7s = {
			"\1\7\17\uffff\1\10\1\uffff\1\3\32\uffff\1\4\15\uffff\1\5\1\uffff\1\6\7\uffff\1\11\7\uffff\1\2\60\uffff\1\1",
			"\1\13", "", "", "", "", "", "", "", "", "", "" };

	static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
	static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
	static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
	static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
	static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
	static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
	static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

	class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			decisionNumber = 1;
			eot = dfa_1;
			eof = dfa_2;
			min = dfa_3;
			max = dfa_4;
			accept = dfa_5;
			special = dfa_6;
			transition = dfa_7;
		}

		@Override
		public String getDescription() {
			return "74:1: (this_Arg_0= ruleArg | this_FnDefExpr_1= ruleFnDefExpr | this_PropertyStatement_2= rulePropertyStatement | this_ConstStatement_3= ruleConstStatement | this_EnumStatement_4= ruleEnumStatement | this_NodeDefExpr_5= ruleNodeDefExpr | this_LinearizationDefExpr_6= ruleLinearizationDefExpr | this_LibraryFnDefExpr_7= ruleLibraryFnDefExpr | this_RecordDefExpr_8= ruleRecordDefExpr | this_NamedID_9= ruleNamedID )";
		}
	}

	static final String dfa_8s = "\12\uffff";
	static final String dfa_9s = "\1\10\11\uffff";
	static final String dfa_10s = "\1\10\7\0\2\uffff";
	static final String dfa_11s = "\1\170\7\0\2\uffff";
	static final String dfa_12s = "\10\uffff\1\2\1\1";
	static final String dfa_13s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
	static final String[] dfa_14s = {
			"\1\10\25\uffff\1\10\2\uffff\1\10\7\uffff\1\10\1\uffff\1\10\12\uffff\1\10\2\uffff\2\10\3\uffff\1\10\6\uffff\1\10\5\uffff\1\10\1\uffff\1\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\7\2\10\2\uffff\1\2\1\6\1\10\1\4\3\uffff\1\10\2\uffff\5\10\1\uffff\3\10\1\1\1\5\1\3\1\uffff\2\10\1\uffff\1\10",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "", "" };

	static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
	static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
	static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
	static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
	static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
	static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
	static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

	class DFA69 extends DFA {

		public DFA69(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			decisionNumber = 69;
			eot = dfa_8;
			eof = dfa_9;
			min = dfa_10;
			max = dfa_11;
			accept = dfa_12;
			special = dfa_13;
			transition = dfa_14;
		}

		@Override
		public String getDescription() {
			return "5206:1: ( ( ( ( () ( ( ruleRelateOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelateOp ) ) ) ) ( (lv_right_3_0= ruleAddSubExpr ) ) )?";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA69_1 = input.LA(1);

				int index69_1 = input.index();
				input.rewind();
				s = -1;
				if ((synpred18_InternalAgreeParser())) {
					s = 9;
				}

				else if ((true)) {
					s = 8;
				}

				input.seek(index69_1);
				if (s >= 0) {
					return s;
				}
				break;
			case 1:
				int LA69_2 = input.LA(1);

				int index69_2 = input.index();
				input.rewind();
				s = -1;
				if ((synpred18_InternalAgreeParser())) {
					s = 9;
				}

				else if ((true)) {
					s = 8;
				}

				input.seek(index69_2);
				if (s >= 0) {
					return s;
				}
				break;
			case 2:
				int LA69_3 = input.LA(1);

				int index69_3 = input.index();
				input.rewind();
				s = -1;
				if ((synpred18_InternalAgreeParser())) {
					s = 9;
				}

				else if ((true)) {
					s = 8;
				}

				input.seek(index69_3);
				if (s >= 0) {
					return s;
				}
				break;
			case 3:
				int LA69_4 = input.LA(1);

				int index69_4 = input.index();
				input.rewind();
				s = -1;
				if ((synpred18_InternalAgreeParser())) {
					s = 9;
				}

				else if ((true)) {
					s = 8;
				}

				input.seek(index69_4);
				if (s >= 0) {
					return s;
				}
				break;
			case 4:
				int LA69_5 = input.LA(1);

				int index69_5 = input.index();
				input.rewind();
				s = -1;
				if ((synpred18_InternalAgreeParser())) {
					s = 9;
				}

				else if ((true)) {
					s = 8;
				}

				input.seek(index69_5);
				if (s >= 0) {
					return s;
				}
				break;
			case 5:
				int LA69_6 = input.LA(1);

				int index69_6 = input.index();
				input.rewind();
				s = -1;
				if ((synpred18_InternalAgreeParser())) {
					s = 9;
				}

				else if ((true)) {
					s = 8;
				}

				input.seek(index69_6);
				if (s >= 0) {
					return s;
				}
				break;
			case 6:
				int LA69_7 = input.LA(1);

				int index69_7 = input.index();
				input.rewind();
				s = -1;
				if ((synpred18_InternalAgreeParser())) {
					s = 9;
				}

				else if ((true)) {
					s = 8;
				}

				input.seek(index69_7);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(getDescription(), 69, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String dfa_15s = "\21\uffff";
	static final String dfa_16s = "\1\30\20\uffff";
	static final String dfa_17s = "\1\u0082\20\uffff";
	static final String dfa_18s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20";
	static final String dfa_19s = "\21\uffff}>";
	static final String[] dfa_20s = {
			"\1\11\1\10\10\uffff\1\6\14\uffff\1\7\3\uffff\1\5\1\13\1\15\11\uffff\1\17\4\uffff\1\16\1\uffff\1\14\1\1\1\13\15\uffff\1\4\20\uffff\1\20\25\uffff\1\12\1\uffff\1\3\2\uffff\1\2",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };

	static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
	static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
	static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
	static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
	static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
	static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

	class DFA82 extends DFA {

		public DFA82(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			decisionNumber = 82;
			eot = dfa_15;
			eof = dfa_15;
			min = dfa_16;
			max = dfa_17;
			accept = dfa_18;
			special = dfa_19;
			transition = dfa_20;
		}

		@Override
		public String getDescription() {
			return "6033:1: ( ( () otherlv_1= Time ) | this_ComplexExpr_2= ruleComplexExpr | ( () ( (lv_val_4_0= RULE_INTEGER_LIT ) ) ) | ( () otherlv_6= Pre otherlv_7= LeftParenthesis ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= RightParenthesis ) | ( () otherlv_11= Event otherlv_12= LeftParenthesis ( (lv_id_13_0= ruleNestedDotID ) ) otherlv_14= RightParenthesis ) | ( () otherlv_16= Latched otherlv_17= LeftParenthesis ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= RightParenthesis ) | ( () otherlv_21= Timeof otherlv_22= LeftParenthesis ( (lv_id_23_0= ruleNestedDotID ) ) otherlv_24= RightParenthesis ) | ( () otherlv_26= Timerise otherlv_27= LeftParenthesis ( (lv_id_28_0= ruleNestedDotID ) ) otherlv_29= RightParenthesis ) | ( () otherlv_31= Timefall otherlv_32= LeftParenthesis ( (lv_id_33_0= ruleNestedDotID ) ) otherlv_34= RightParenthesis ) | ( () ( (lv_val_36_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_val_38_0= ruleBooleanLiteral ) ) ) | ( () otherlv_40= This (otherlv_41= FullStop ( (lv_subThis_42_0= ruleNestedDotID ) ) )? ) | ( () otherlv_44= Floor otherlv_45= LeftParenthesis ( (lv_expr_46_0= ruleExpr ) ) otherlv_47= RightParenthesis ) | ( () otherlv_49= Real otherlv_50= LeftParenthesis ( (lv_expr_51_0= ruleExpr ) ) otherlv_52= RightParenthesis ) | ( () otherlv_54= Enum otherlv_55= LeftParenthesis ( (lv_enumType_56_0= ruleNestedDotID ) ) otherlv_57= Comma ( (lv_value_58_0= RULE_ID ) ) otherlv_59= RightParenthesis ) | (otherlv_60= LeftParenthesis this_Expr_61= ruleExpr otherlv_62= RightParenthesis ) )";
		}
	}

	static final String dfa_21s = "\25\uffff";
	static final String dfa_22s = "\10\uffff\1\17\1\21\1\23\3\uffff\1\17\1\uffff\1\21\3\uffff\1\23";
	static final String dfa_23s = "\1\11\5\uffff\2\175\3\35\3\uffff\1\35\1\uffff\1\35\1\uffff\1\u0082\1\uffff\1\35";
	static final String dfa_24s = "\1\u0082\5\uffff\4\u0082\1\160\3\uffff\1\160\1\uffff\1\160\1\uffff\1\u0082\1\uffff\1\160";
	static final String dfa_25s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\5\uffff\1\11\1\12\1\6\1\uffff\1\7\1\uffff\1\10\1\uffff\1\13\1\uffff";
	static final String dfa_26s = "\25\uffff}>";
	static final String[] dfa_27s = {
			"\1\3\6\uffff\1\2\17\uffff\1\4\23\uffff\1\14\23\uffff\1\14\36\uffff\1\13\2\uffff\1\6\1\uffff\1\7\7\uffff\1\1\10\uffff\1\10\1\uffff\1\11\1\uffff\1\5\1\12",
			"", "", "", "", "", "\1\10\1\uffff\1\11\2\uffff\1\15", "\1\10\1\uffff\1\11\2\uffff\1\15",
			"\1\17\75\uffff\1\15\10\uffff\1\17\3\uffff\1\17\2\uffff\1\17\4\uffff\1\17\21\uffff\1\16",
			"\1\21\75\uffff\1\15\10\uffff\1\21\3\uffff\1\21\2\uffff\1\21\4\uffff\1\21\21\uffff\1\20",
			"\1\23\75\uffff\1\15\1\22\7\uffff\1\23\3\uffff\1\23\2\uffff\1\23\4\uffff\1\23", "", "", "",
			"\1\17\75\uffff\1\15\10\uffff\1\17\3\uffff\1\17\2\uffff\1\17\4\uffff\1\17", "",
			"\1\21\75\uffff\1\15\10\uffff\1\21\3\uffff\1\21\2\uffff\1\21\4\uffff\1\21", "", "\1\24", "",
			"\1\23\75\uffff\1\15\10\uffff\1\23\3\uffff\1\23\2\uffff\1\23\4\uffff\1\23" };

	static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
	static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
	static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
	static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
	static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
	static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
	static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

	class DFA100 extends DFA {

		public DFA100(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			decisionNumber = 100;
			eot = dfa_21;
			eof = dfa_22;
			min = dfa_23;
			max = dfa_24;
			accept = dfa_25;
			special = dfa_26;
			transition = dfa_27;
		}

		@Override
		public String getDescription() {
			return "7407:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )";
		}
	}

	private static class FollowSets000 {
		public static final BitSet FOLLOW_1 = new BitSet(new long[] { 0x0000000000000000L });
		public static final BitSet FOLLOW_2 = new BitSet(new long[] { 0x0000000000000002L });
		public static final BitSet FOLLOW_3 = new BitSet(new long[] { 0x808201C00076B492L, 0x0000000400020203L });
		public static final BitSet FOLLOW_4 = new BitSet(
				new long[] { 0x0000000000000000L, 0x0000000000000000L, 0x0000000000000002L });
		public static final BitSet FOLLOW_5 = new BitSet(new long[] { 0x0000000000000000L, 0x0000800000000000L });
		public static final BitSet FOLLOW_6 = new BitSet(
				new long[] { 0x8038802407000820L, 0xA0001088006005D8L, 0x0000000000000004L });
		public static final BitSet FOLLOW_7 = new BitSet(new long[] { 0x0000000000000000L, 0x0001000000000000L });
		public static final BitSet FOLLOW_8 = new BitSet(
				new long[] { 0x8038802407000820L, 0xA0001088006005D8L, 0x0000000000000006L });
		public static final BitSet FOLLOW_9 = new BitSet(
				new long[] { 0x8038800403000020L, 0xA0001088006001D8L, 0x0000000000000004L });
		public static final BitSet FOLLOW_10 = new BitSet(
				new long[] { 0x1000000000000000L, 0x0000000000040010L, 0x0000000000000004L });
		public static final BitSet FOLLOW_11 = new BitSet(
				new long[] { 0x0000000000000000L, 0x0000000000000000L, 0x0000000000000004L });
		public static final BitSet FOLLOW_12 = new BitSet(new long[] { 0x0040000000000000L });
		public static final BitSet FOLLOW_13 = new BitSet(new long[] { 0x0000020000000000L });
		public static final BitSet FOLLOW_14 = new BitSet(new long[] { 0x0000000000000000L, 0x0010008000000000L });
		public static final BitSet FOLLOW_15 = new BitSet(new long[] { 0x0000080000000100L });
		public static final BitSet FOLLOW_16 = new BitSet(new long[] { 0x0000080000000000L });
		public static final BitSet FOLLOW_17 = new BitSet(new long[] { 0x0000020000000002L });
		public static final BitSet FOLLOW_18 = new BitSet(new long[] { 0x0400000000000000L });
		public static final BitSet FOLLOW_19 = new BitSet(new long[] { 0x0000100000000100L });
		public static final BitSet FOLLOW_20 = new BitSet(new long[] { 0x0000100000000000L });
		public static final BitSet FOLLOW_21 = new BitSet(new long[] { 0x0200080000000100L });
		public static final BitSet FOLLOW_22 = new BitSet(new long[] { 0x0200080000000000L });
		public static final BitSet FOLLOW_23 = new BitSet(new long[] { 0x0000000040000000L });
		public static final BitSet FOLLOW_24 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000100L });
		public static final BitSet FOLLOW_25 = new BitSet(new long[] { 0x0040000000000100L });
		public static final BitSet FOLLOW_26 = new BitSet(new long[] { 0x0000000200000000L });
		public static final BitSet FOLLOW_27 = new BitSet(new long[] { 0x0000020000000102L });
		public static final BitSet FOLLOW_28 = new BitSet(new long[] { 0x2000000000000000L });
		public static final BitSet FOLLOW_29 = new BitSet(new long[] { 0x0000000000000002L, 0x0000000000000800L });
		public static final BitSet FOLLOW_30 = new BitSet(new long[] { 0x0000040000000000L });
		public static final BitSet FOLLOW_31 = new BitSet(new long[] { 0x0000000000800000L });
		public static final BitSet FOLLOW_32 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000800L });
		public static final BitSet FOLLOW_33 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000004000L });
		public static final BitSet FOLLOW_34 = new BitSet(new long[] { 0x0000000000000000L, 0x0000080000000000L });
		public static final BitSet FOLLOW_35 = new BitSet(new long[] { 0x0000000000000000L, 0x0020000000000000L });
		public static final BitSet FOLLOW_36 = new BitSet(new long[] { 0x0000000000000000L, 0x0000010000000000L });
		public static final BitSet FOLLOW_37 = new BitSet(new long[] { 0x0000000000000000L, 0x8000000000000000L });
		public static final BitSet FOLLOW_38 = new BitSet(new long[] { 0x0000200000004000L, 0x0001080000000000L });
		public static final BitSet FOLLOW_39 = new BitSet(new long[] { 0x0000200000004000L, 0x0001000000000000L });
		public static final BitSet FOLLOW_40 = new BitSet(
				new long[] { 0x0000000000000000L, 0x0001000000000000L, 0x0000000000000004L });
		public static final BitSet FOLLOW_41 = new BitSet(new long[] { 0x0000000000000000L, 0x0001080000000000L });
		public static final BitSet FOLLOW_42 = new BitSet(new long[] { 0x0000000000000040L });
		public static final BitSet FOLLOW_43 = new BitSet(new long[] { 0x0000000400000000L });
		public static final BitSet FOLLOW_44 = new BitSet(new long[] { 0x0000000000000000L, 0x0004000000000000L });
		public static final BitSet FOLLOW_45 = new BitSet(new long[] { 0x0000000000000000L, 0x0080000000000000L });
		public static final BitSet FOLLOW_46 = new BitSet(new long[] { 0x0000000000000000L, 0x0100080000000000L });
		public static final BitSet FOLLOW_47 = new BitSet(new long[] { 0x0000000000000000L, 0x0005080000000000L });
		public static final BitSet FOLLOW_48 = new BitSet(new long[] { 0x0000000000000000L, 0x0000008000000000L });
		public static final BitSet FOLLOW_49 = new BitSet(new long[] { 0x0000000000000000L, 0x0000090000000000L });
		public static final BitSet FOLLOW_50 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000004L });
		public static final BitSet FOLLOW_51 = new BitSet(new long[] { 0x0000000000000000L, 0x0010000000000000L });
		public static final BitSet FOLLOW_52 = new BitSet(new long[] { 0x0000000000000000L, 0x0020080000000000L });
		public static final BitSet FOLLOW_53 = new BitSet(new long[] { 0x0001000000000000L, 0x0000800000000000L });
		public static final BitSet FOLLOW_54 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000008000000L });
		public static final BitSet FOLLOW_55 = new BitSet(
				new long[] { 0x0000000000000000L, 0x0000010000000000L, 0x0000000000000004L });
		public static final BitSet FOLLOW_56 = new BitSet(new long[] { 0x0000000800000000L });
		public static final BitSet FOLLOW_57 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000001080000L });
		public static final BitSet FOLLOW_58 = new BitSet(
				new long[] { 0x0000000000000000L, 0x0000000000080000L, 0x0000000000000004L });
		public static final BitSet FOLLOW_59 = new BitSet(
				new long[] { 0x0080000000000000L, 0x0000000000000000L, 0x0000000000000004L });
		public static final BitSet FOLLOW_60 = new BitSet(
				new long[] { 0x0080000000000000L, 0x0000000000800000L, 0x0000000000000004L });
		public static final BitSet FOLLOW_61 = new BitSet(new long[] { 0x0000000000000000L, 0x0004080000000000L });
		public static final BitSet FOLLOW_62 = new BitSet(new long[] { 0x0000000000000002L, 0x0010000000000000L });
		public static final BitSet FOLLOW_63 = new BitSet(new long[] { 0x0000000000000000L, 0xA000100000000000L });
		public static final BitSet FOLLOW_64 = new BitSet(new long[] { 0x0000000000000000L, 0xA000000000000000L });
		public static final BitSet FOLLOW_65 = new BitSet(new long[] { 0x0000400000000000L });
		public static final BitSet FOLLOW_66 = new BitSet(new long[] { 0x0000000000000002L, 0x0000000004000000L });
		public static final BitSet FOLLOW_67 = new BitSet(new long[] { 0x0000000000000002L, 0x0000000100000000L });
		public static final BitSet FOLLOW_68 = new BitSet(new long[] { 0x0000000000000002L, 0x0000000000002000L });
		public static final BitSet FOLLOW_69 = new BitSet(new long[] { 0x0000000000000002L, 0x0000002000000000L });
		public static final BitSet FOLLOW_70 = new BitSet(new long[] { 0x0000000000000002L, 0x0000000000008000L });
		public static final BitSet FOLLOW_71 = new BitSet(new long[] { 0x0000000000000002L, 0x000E0002C2000000L });
		public static final BitSet FOLLOW_72 = new BitSet(new long[] { 0x0000000000000002L, 0x0000140000000000L });
		public static final BitSet FOLLOW_73 = new BitSet(new long[] { 0x0000000000000002L, 0x0000420000110000L });
		public static final BitSet FOLLOW_74 = new BitSet(new long[] { 0x0000000000000002L, 0x0040000000000000L });
		public static final BitSet FOLLOW_75 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000020L });
		public static final BitSet FOLLOW_76 = new BitSet(new long[] { 0x4000000000000000L });
		public static final BitSet FOLLOW_77 = new BitSet(new long[] { 0x0000000000000002L, 0x0080000000000000L });
		public static final BitSet FOLLOW_78 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000020000000L });
		public static final BitSet FOLLOW_79 = new BitSet(new long[] { 0x0000000000000000L, 0x0100000000000000L });
		public static final BitSet FOLLOW_80 = new BitSet(new long[] { 0x0000000000000002L, 0x0000200000000000L });
		public static final BitSet FOLLOW_81 = new BitSet(new long[] { 0x0000000000000002L, 0x0080008000000000L });
		public static final BitSet FOLLOW_82 = new BitSet(
				new long[] { 0x8038800403000020L, 0xA0001188006001D8L, 0x0000000000000004L });
		public static final BitSet FOLLOW_83 = new BitSet(new long[] { 0x0000000000000000L, 0x0101000000000000L });
		public static final BitSet FOLLOW_84 = new BitSet(
				new long[] { 0x0800001018000000L, 0x0000000000000000L, 0x0000000000000004L });
		public static final BitSet FOLLOW_85 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000010000000L });
		public static final BitSet FOLLOW_86 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000100001000L });
		public static final BitSet FOLLOW_87 = new BitSet(
				new long[] { 0x0010000100090200L, 0xA010148000000100L, 0x0000000000000006L });
		public static final BitSet FOLLOW_88 = new BitSet(new long[] { 0x0000000020000000L, 0x0001081000000000L });
		public static final BitSet FOLLOW_89 = new BitSet(new long[] { 0x0000000000000000L, 0x0001081000000000L });
		public static final BitSet FOLLOW_90 = new BitSet(new long[] { 0x0000000000000002L, 0x0000001000000000L });
		public static final BitSet FOLLOW_91 = new BitSet(
				new long[] { 0x0000000000000000L, 0x0020000000000000L, 0x0000000000000004L });
		public static final BitSet FOLLOW_92 = new BitSet(
				new long[] { 0x0010000100090200L, 0xA010158000000100L, 0x0000000000000006L });
		public static final BitSet FOLLOW_93 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000100000000L });
		public static final BitSet FOLLOW_94 = new BitSet(new long[] { 0x0000000000000002L, 0x0010200000000000L });
		public static final BitSet FOLLOW_95 = new BitSet(new long[] { 0x0000000000000000L, 0x0020000008000000L });
		public static final BitSet FOLLOW_96 = new BitSet(
				new long[] { 0x0000000000000000L, 0xA000140000000000L, 0x0000000000000004L });
		public static final BitSet FOLLOW_97 = new BitSet(
				new long[] { 0x0000000000000002L, 0x0000000000000000L, 0x0000000000000004L });
		public static final BitSet FOLLOW_98 = new BitSet(new long[] { 0x0000000000000000L, 0x2000000000000000L });
		public static final BitSet FOLLOW_99 = new BitSet(new long[] { 0x0004000000000002L });
		public static final BitSet FOLLOW_100 = new BitSet(new long[] { 0x0000000000000000L, 0x0000004000000000L });
		public static final BitSet FOLLOW_101 = new BitSet(new long[] { 0x0000000080000000L });
		public static final BitSet FOLLOW_102 = new BitSet(new long[] { 0x0100000000000000L });
		public static final BitSet FOLLOW_103 = new BitSet(new long[] { 0x0000000000000002L, 0x0000000010000000L });
	}

}