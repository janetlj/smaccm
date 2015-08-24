/**
 */
package com.rockwellcollins.atc.agree.agree.impl;

import com.rockwellcollins.atc.agree.agree.AgreePackage;
import com.rockwellcollins.atc.agree.agree.PrimType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prim Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.agree.agree.impl.PrimTypeImpl#getString <em>String</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.agree.agree.impl.PrimTypeImpl#getRangeLow <em>Range Low</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.agree.agree.impl.PrimTypeImpl#getRangeHigh <em>Range High</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimTypeImpl extends TypeImpl implements PrimType
{
  /**
   * The default value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected static final String STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected String string = STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getRangeLow() <em>Range Low</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangeLow()
   * @generated
   * @ordered
   */
  protected static final String RANGE_LOW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRangeLow() <em>Range Low</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangeLow()
   * @generated
   * @ordered
   */
  protected String rangeLow = RANGE_LOW_EDEFAULT;

  /**
   * The default value of the '{@link #getRangeHigh() <em>Range High</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangeHigh()
   * @generated
   * @ordered
   */
  protected static final String RANGE_HIGH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRangeHigh() <em>Range High</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangeHigh()
   * @generated
   * @ordered
   */
  protected String rangeHigh = RANGE_HIGH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AgreePackage.Literals.PRIM_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString(String newString)
  {
    String oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgreePackage.PRIM_TYPE__STRING, oldString, string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRangeLow()
  {
    return rangeLow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRangeLow(String newRangeLow)
  {
    String oldRangeLow = rangeLow;
    rangeLow = newRangeLow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgreePackage.PRIM_TYPE__RANGE_LOW, oldRangeLow, rangeLow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRangeHigh()
  {
    return rangeHigh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRangeHigh(String newRangeHigh)
  {
    String oldRangeHigh = rangeHigh;
    rangeHigh = newRangeHigh;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgreePackage.PRIM_TYPE__RANGE_HIGH, oldRangeHigh, rangeHigh));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AgreePackage.PRIM_TYPE__STRING:
        return getString();
      case AgreePackage.PRIM_TYPE__RANGE_LOW:
        return getRangeLow();
      case AgreePackage.PRIM_TYPE__RANGE_HIGH:
        return getRangeHigh();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AgreePackage.PRIM_TYPE__STRING:
        setString((String)newValue);
        return;
      case AgreePackage.PRIM_TYPE__RANGE_LOW:
        setRangeLow((String)newValue);
        return;
      case AgreePackage.PRIM_TYPE__RANGE_HIGH:
        setRangeHigh((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AgreePackage.PRIM_TYPE__STRING:
        setString(STRING_EDEFAULT);
        return;
      case AgreePackage.PRIM_TYPE__RANGE_LOW:
        setRangeLow(RANGE_LOW_EDEFAULT);
        return;
      case AgreePackage.PRIM_TYPE__RANGE_HIGH:
        setRangeHigh(RANGE_HIGH_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AgreePackage.PRIM_TYPE__STRING:
        return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
      case AgreePackage.PRIM_TYPE__RANGE_LOW:
        return RANGE_LOW_EDEFAULT == null ? rangeLow != null : !RANGE_LOW_EDEFAULT.equals(rangeLow);
      case AgreePackage.PRIM_TYPE__RANGE_HIGH:
        return RANGE_HIGH_EDEFAULT == null ? rangeHigh != null : !RANGE_HIGH_EDEFAULT.equals(rangeHigh);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (string: ");
    result.append(string);
    result.append(", rangeLow: ");
    result.append(rangeLow);
    result.append(", rangeHigh: ");
    result.append(rangeHigh);
    result.append(')');
    return result.toString();
  }

} //PrimTypeImpl
