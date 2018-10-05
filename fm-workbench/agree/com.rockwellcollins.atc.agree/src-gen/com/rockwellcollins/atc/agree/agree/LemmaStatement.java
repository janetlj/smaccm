/**
 */
package com.rockwellcollins.atc.agree.agree;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lemma Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.agree.agree.LemmaStatement#getId <em>Id</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.agree.agree.LemmaStatement#getStr <em>Str</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.agree.agree.LemmaStatement#getExpr <em>Expr</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.agree.agree.LemmaStatement#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see com.rockwellcollins.atc.agree.agree.AgreePackage#getLemmaStatement()
 * @model
 * @generated
 */
public interface LemmaStatement extends SpecStatement
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see com.rockwellcollins.atc.agree.agree.AgreePackage#getLemmaStatement_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link com.rockwellcollins.atc.agree.agree.LemmaStatement#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Str</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str</em>' attribute.
   * @see #setStr(String)
   * @see com.rockwellcollins.atc.agree.agree.AgreePackage#getLemmaStatement_Str()
   * @model
   * @generated
   */
  String getStr();

  /**
   * Sets the value of the '{@link com.rockwellcollins.atc.agree.agree.LemmaStatement#getStr <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str</em>' attribute.
   * @see #getStr()
   * @generated
   */
  void setStr(String value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see com.rockwellcollins.atc.agree.agree.AgreePackage#getLemmaStatement_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link com.rockwellcollins.atc.agree.agree.LemmaStatement#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(PatternStatement)
   * @see com.rockwellcollins.atc.agree.agree.AgreePackage#getLemmaStatement_Pattern()
   * @model containment="true"
   * @generated
   */
  PatternStatement getPattern();

  /**
   * Sets the value of the '{@link com.rockwellcollins.atc.agree.agree.LemmaStatement#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(PatternStatement value);

} // LemmaStatement
