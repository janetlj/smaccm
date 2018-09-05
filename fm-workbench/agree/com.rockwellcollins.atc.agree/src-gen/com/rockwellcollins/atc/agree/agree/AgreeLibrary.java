/**
 * generated by Xtext 2.12.0
 */
package com.rockwellcollins.atc.agree.agree;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AnnexLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.agree.agree.AgreeLibrary#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @see com.rockwellcollins.atc.agree.agree.AgreePackage#getAgreeLibrary()
 * @model
 * @generated
 */
public interface AgreeLibrary extends EObject, AnnexLibrary
{
  /**
   * Returns the value of the '<em><b>Contract</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contract</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contract</em>' containment reference.
   * @see #setContract(AgreeContract)
   * @see com.rockwellcollins.atc.agree.agree.AgreePackage#getAgreeLibrary_Contract()
   * @model containment="true"
   * @generated
   */
  AgreeContract getContract();

  /**
   * Sets the value of the '{@link com.rockwellcollins.atc.agree.agree.AgreeLibrary#getContract <em>Contract</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contract</em>' containment reference.
   * @see #getContract()
   * @generated
   */
  void setContract(AgreeContract value);

} // AgreeLibrary
