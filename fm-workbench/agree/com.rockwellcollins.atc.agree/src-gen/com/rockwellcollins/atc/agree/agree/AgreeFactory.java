/**
 */
package com.rockwellcollins.atc.agree.agree;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.rockwellcollins.atc.agree.agree.AgreePackage
 * @generated
 */
public interface AgreeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AgreeFactory eINSTANCE = com.rockwellcollins.atc.agree.agree.impl.AgreeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	AgreeLibrary createAgreeLibrary();

	/**
	 * Returns a new object of class '<em>Subclause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subclause</em>'.
	 * @generated
	 */
	AgreeSubclause createAgreeSubclause();

	/**
	 * Returns a new object of class '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract</em>'.
	 * @generated
	 */
	Contract createContract();

	/**
	 * Returns a new object of class '<em>Spec Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Statement</em>'.
	 * @generated
	 */
	SpecStatement createSpecStatement();

	/**
	 * Returns a new object of class '<em>Pattern Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Statement</em>'.
	 * @generated
	 */
	PatternStatement createPatternStatement();

	/**
	 * Returns a new object of class '<em>When Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Statement</em>'.
	 * @generated
	 */
	WhenStatement createWhenStatement();

	/**
	 * Returns a new object of class '<em>Whenever Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Whenever Statement</em>'.
	 * @generated
	 */
	WheneverStatement createWheneverStatement();

	/**
	 * Returns a new object of class '<em>Real Time Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Time Statement</em>'.
	 * @generated
	 */
	RealTimeStatement createRealTimeStatement();

	/**
	 * Returns a new object of class '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Interval</em>'.
	 * @generated
	 */
	TimeInterval createTimeInterval();

	/**
	 * Returns a new object of class '<em>Synch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synch Statement</em>'.
	 * @generated
	 */
	SynchStatement createSynchStatement();

	/**
	 * Returns a new object of class '<em>Order Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Statement</em>'.
	 * @generated
	 */
	OrderStatement createOrderStatement();

	/**
	 * Returns a new object of class '<em>Call Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Def</em>'.
	 * @generated
	 */
	CallDef createCallDef();

	/**
	 * Returns a new object of class '<em>Property Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Statement</em>'.
	 * @generated
	 */
	PropertyStatement createPropertyStatement();

	/**
	 * Returns a new object of class '<em>Const Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Const Statement</em>'.
	 * @generated
	 */
	ConstStatement createConstStatement();

	/**
	 * Returns a new object of class '<em>Enum Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Statement</em>'.
	 * @generated
	 */
	EnumStatement createEnumStatement();

	/**
	 * Returns a new object of class '<em>Eq Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eq Statement</em>'.
	 * @generated
	 */
	EqStatement createEqStatement();

	/**
	 * Returns a new object of class '<em>Input Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Statement</em>'.
	 * @generated
	 */
	InputStatement createInputStatement();

	/**
	 * Returns a new object of class '<em>Assign Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assign Statement</em>'.
	 * @generated
	 */
	AssignStatement createAssignStatement();

	/**
	 * Returns a new object of class '<em>Fn Def Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fn Def Expr</em>'.
	 * @generated
	 */
	FnDefExpr createFnDefExpr();

	/**
	 * Returns a new object of class '<em>Library Fn Def Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library Fn Def Expr</em>'.
	 * @generated
	 */
	LibraryFnDefExpr createLibraryFnDefExpr();

	/**
	 * Returns a new object of class '<em>Linearization Def Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linearization Def Expr</em>'.
	 * @generated
	 */
	LinearizationDefExpr createLinearizationDefExpr();

	/**
	 * Returns a new object of class '<em>Linearization Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linearization Interval</em>'.
	 * @generated
	 */
	LinearizationInterval createLinearizationInterval();

	/**
	 * Returns a new object of class '<em>Node Def Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Def Expr</em>'.
	 * @generated
	 */
	NodeDefExpr createNodeDefExpr();

	/**
	 * Returns a new object of class '<em>Node Body Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Body Expr</em>'.
	 * @generated
	 */
	NodeBodyExpr createNodeBodyExpr();

	/**
	 * Returns a new object of class '<em>Node Stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Stmt</em>'.
	 * @generated
	 */
	NodeStmt createNodeStmt();

	/**
	 * Returns a new object of class '<em>Arg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arg</em>'.
	 * @generated
	 */
	Arg createArg();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Record Def Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Def Expr</em>'.
	 * @generated
	 */
	RecordDefExpr createRecordDefExpr();

	/**
	 * Returns a new object of class '<em>Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expr</em>'.
	 * @generated
	 */
	Expr createExpr();

	/**
	 * Returns a new object of class '<em>Complex Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Expr</em>'.
	 * @generated
	 */
	ComplexExpr createComplexExpr();

	/**
	 * Returns a new object of class '<em>Nested Dot ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Dot ID</em>'.
	 * @generated
	 */
	NestedDotID createNestedDotID();

	/**
	 * Returns a new object of class '<em>Named ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named ID</em>'.
	 * @generated
	 */
	NamedID createNamedID();

	/**
	 * Returns a new object of class '<em>Contract Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Library</em>'.
	 * @generated
	 */
	AgreeContractLibrary createAgreeContractLibrary();

	/**
	 * Returns a new object of class '<em>Contract Subclause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Subclause</em>'.
	 * @generated
	 */
	AgreeContractSubclause createAgreeContractSubclause();

	/**
	 * Returns a new object of class '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract</em>'.
	 * @generated
	 */
	AgreeContract createAgreeContract();

	/**
	 * Returns a new object of class '<em>Assume Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assume Statement</em>'.
	 * @generated
	 */
	AssumeStatement createAssumeStatement();

	/**
	 * Returns a new object of class '<em>Guarantee Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guarantee Statement</em>'.
	 * @generated
	 */
	GuaranteeStatement createGuaranteeStatement();

	/**
	 * Returns a new object of class '<em>Assert Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert Statement</em>'.
	 * @generated
	 */
	AssertStatement createAssertStatement();

	/**
	 * Returns a new object of class '<em>Initial Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Statement</em>'.
	 * @generated
	 */
	InitialStatement createInitialStatement();

	/**
	 * Returns a new object of class '<em>Param Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Statement</em>'.
	 * @generated
	 */
	ParamStatement createParamStatement();

	/**
	 * Returns a new object of class '<em>Lemma Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lemma Statement</em>'.
	 * @generated
	 */
	LemmaStatement createLemmaStatement();

	/**
	 * Returns a new object of class '<em>Lift Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lift Statement</em>'.
	 * @generated
	 */
	LiftStatement createLiftStatement();

	/**
	 * Returns a new object of class '<em>Connection Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Statement</em>'.
	 * @generated
	 */
	ConnectionStatement createConnectionStatement();

	/**
	 * Returns a new object of class '<em>Always Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Always Statement</em>'.
	 * @generated
	 */
	AlwaysStatement createAlwaysStatement();

	/**
	 * Returns a new object of class '<em>When Holds Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Holds Statement</em>'.
	 * @generated
	 */
	WhenHoldsStatement createWhenHoldsStatement();

	/**
	 * Returns a new object of class '<em>When Occurs Statment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Occurs Statment</em>'.
	 * @generated
	 */
	WhenOccursStatment createWhenOccursStatment();

	/**
	 * Returns a new object of class '<em>Whenever Occurs Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Whenever Occurs Statement</em>'.
	 * @generated
	 */
	WheneverOccursStatement createWheneverOccursStatement();

	/**
	 * Returns a new object of class '<em>Whenever Becomes True Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Whenever Becomes True Statement</em>'.
	 * @generated
	 */
	WheneverBecomesTrueStatement createWheneverBecomesTrueStatement();

	/**
	 * Returns a new object of class '<em>Whenever Holds Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Whenever Holds Statement</em>'.
	 * @generated
	 */
	WheneverHoldsStatement createWheneverHoldsStatement();

	/**
	 * Returns a new object of class '<em>Whenever Implies Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Whenever Implies Statement</em>'.
	 * @generated
	 */
	WheneverImpliesStatement createWheneverImpliesStatement();

	/**
	 * Returns a new object of class '<em>Periodic Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Statement</em>'.
	 * @generated
	 */
	PeriodicStatement createPeriodicStatement();

	/**
	 * Returns a new object of class '<em>Sporadic Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sporadic Statement</em>'.
	 * @generated
	 */
	SporadicStatement createSporadicStatement();

	/**
	 * Returns a new object of class '<em>Closed Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Closed Time Interval</em>'.
	 * @generated
	 */
	ClosedTimeInterval createClosedTimeInterval();

	/**
	 * Returns a new object of class '<em>Open Left Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Left Time Interval</em>'.
	 * @generated
	 */
	OpenLeftTimeInterval createOpenLeftTimeInterval();

	/**
	 * Returns a new object of class '<em>Open Right Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Right Time Interval</em>'.
	 * @generated
	 */
	OpenRightTimeInterval createOpenRightTimeInterval();

	/**
	 * Returns a new object of class '<em>Open Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Time Interval</em>'.
	 * @generated
	 */
	OpenTimeInterval createOpenTimeInterval();

	/**
	 * Returns a new object of class '<em>MN Synch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MN Synch Statement</em>'.
	 * @generated
	 */
	MNSynchStatement createMNSynchStatement();

	/**
	 * Returns a new object of class '<em>Calen Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calen Statement</em>'.
	 * @generated
	 */
	CalenStatement createCalenStatement();

	/**
	 * Returns a new object of class '<em>Asynch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asynch Statement</em>'.
	 * @generated
	 */
	AsynchStatement createAsynchStatement();

	/**
	 * Returns a new object of class '<em>Latched Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Latched Statement</em>'.
	 * @generated
	 */
	LatchedStatement createLatchedStatement();

	/**
	 * Returns a new object of class '<em>Node Eq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Eq</em>'.
	 * @generated
	 */
	NodeEq createNodeEq();

	/**
	 * Returns a new object of class '<em>Node Lemma</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Lemma</em>'.
	 * @generated
	 */
	NodeLemma createNodeLemma();

	/**
	 * Returns a new object of class '<em>Prim Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prim Type</em>'.
	 * @generated
	 */
	PrimType createPrimType();

	/**
	 * Returns a new object of class '<em>Record Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Type</em>'.
	 * @generated
	 */
	RecordType createRecordType();

	/**
	 * Returns a new object of class '<em>Binary Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Expr</em>'.
	 * @generated
	 */
	BinaryExpr createBinaryExpr();

	/**
	 * Returns a new object of class '<em>Unary Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Expr</em>'.
	 * @generated
	 */
	UnaryExpr createUnaryExpr();

	/**
	 * Returns a new object of class '<em>If Then Else Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Then Else Expr</em>'.
	 * @generated
	 */
	IfThenElseExpr createIfThenElseExpr();

	/**
	 * Returns a new object of class '<em>Prev Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prev Expr</em>'.
	 * @generated
	 */
	PrevExpr createPrevExpr();

	/**
	 * Returns a new object of class '<em>Get Property Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Property Expr</em>'.
	 * @generated
	 */
	GetPropertyExpr createGetPropertyExpr();

	/**
	 * Returns a new object of class '<em>Record Update Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Update Expr</em>'.
	 * @generated
	 */
	RecordUpdateExpr createRecordUpdateExpr();

	/**
	 * Returns a new object of class '<em>Time Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Expr</em>'.
	 * @generated
	 */
	TimeExpr createTimeExpr();

	/**
	 * Returns a new object of class '<em>Int Lit Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Lit Expr</em>'.
	 * @generated
	 */
	IntLitExpr createIntLitExpr();

	/**
	 * Returns a new object of class '<em>Pre Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Expr</em>'.
	 * @generated
	 */
	PreExpr createPreExpr();

	/**
	 * Returns a new object of class '<em>Event Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Expr</em>'.
	 * @generated
	 */
	EventExpr createEventExpr();

	/**
	 * Returns a new object of class '<em>Latched Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Latched Expr</em>'.
	 * @generated
	 */
	LatchedExpr createLatchedExpr();

	/**
	 * Returns a new object of class '<em>Time Of Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Of Expr</em>'.
	 * @generated
	 */
	TimeOfExpr createTimeOfExpr();

	/**
	 * Returns a new object of class '<em>Time Rise Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Rise Expr</em>'.
	 * @generated
	 */
	TimeRiseExpr createTimeRiseExpr();

	/**
	 * Returns a new object of class '<em>Time Fall Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Fall Expr</em>'.
	 * @generated
	 */
	TimeFallExpr createTimeFallExpr();

	/**
	 * Returns a new object of class '<em>Real Lit Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Lit Expr</em>'.
	 * @generated
	 */
	RealLitExpr createRealLitExpr();

	/**
	 * Returns a new object of class '<em>Bool Lit Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bool Lit Expr</em>'.
	 * @generated
	 */
	BoolLitExpr createBoolLitExpr();

	/**
	 * Returns a new object of class '<em>This Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>This Expr</em>'.
	 * @generated
	 */
	ThisExpr createThisExpr();

	/**
	 * Returns a new object of class '<em>Floor Cast</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floor Cast</em>'.
	 * @generated
	 */
	FloorCast createFloorCast();

	/**
	 * Returns a new object of class '<em>Real Cast</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Cast</em>'.
	 * @generated
	 */
	RealCast createRealCast();

	/**
	 * Returns a new object of class '<em>AADL Enumerator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AADL Enumerator</em>'.
	 * @generated
	 */
	AADLEnumerator createAADLEnumerator();

	/**
	 * Returns a new object of class '<em>Fn Call Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fn Call Expr</em>'.
	 * @generated
	 */
	FnCallExpr createFnCallExpr();

	/**
	 * Returns a new object of class '<em>Record Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Expr</em>'.
	 * @generated
	 */
	RecordExpr createRecordExpr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AgreePackage getAgreePackage();

} // AgreeFactory
