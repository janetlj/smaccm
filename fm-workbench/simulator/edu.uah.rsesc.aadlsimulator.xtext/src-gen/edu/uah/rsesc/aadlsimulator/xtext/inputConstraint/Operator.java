/**
 */
package edu.uah.rsesc.aadlsimulator.xtext.inputConstraint;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.InputConstraintPackage#getOperator()
 * @model
 * @generated
 */
public enum Operator implements Enumerator
{
  /**
   * The '<em><b>Add Sub Operator</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADD_SUB_OPERATOR_VALUE
   * @generated
   * @ordered
   */
  ADD_SUB_OPERATOR(0, "AddSubOperator", "AddSubOperator"),

  /**
   * The '<em><b>Multi Div Operator</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MULTI_DIV_OPERATOR_VALUE
   * @generated
   * @ordered
   */
  MULTI_DIV_OPERATOR(1, "MultiDivOperator", "MultiDivOperator"),

  /**
   * The '<em><b>ADDITION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADDITION_VALUE
   * @generated
   * @ordered
   */
  ADDITION(2, "ADDITION", "+"),

  /**
   * The '<em><b>SUBTRACTION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUBTRACTION_VALUE
   * @generated
   * @ordered
   */
  SUBTRACTION(3, "SUBTRACTION", "-"),

  /**
   * The '<em><b>MULTIPLICATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MULTIPLICATION_VALUE
   * @generated
   * @ordered
   */
  MULTIPLICATION(4, "MULTIPLICATION", "*"),

  /**
   * The '<em><b>DIVISION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIVISION_VALUE
   * @generated
   * @ordered
   */
  DIVISION(5, "DIVISION", "/");

  /**
   * The '<em><b>Add Sub Operator</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Add Sub Operator</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ADD_SUB_OPERATOR
   * @model name="AddSubOperator"
   * @generated
   * @ordered
   */
  public static final int ADD_SUB_OPERATOR_VALUE = 0;

  /**
   * The '<em><b>Multi Div Operator</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Multi Div Operator</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MULTI_DIV_OPERATOR
   * @model name="MultiDivOperator"
   * @generated
   * @ordered
   */
  public static final int MULTI_DIV_OPERATOR_VALUE = 1;

  /**
   * The '<em><b>ADDITION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ADDITION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ADDITION
   * @model literal="+"
   * @generated
   * @ordered
   */
  public static final int ADDITION_VALUE = 2;

  /**
   * The '<em><b>SUBTRACTION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SUBTRACTION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUBTRACTION
   * @model literal="-"
   * @generated
   * @ordered
   */
  public static final int SUBTRACTION_VALUE = 3;

  /**
   * The '<em><b>MULTIPLICATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MULTIPLICATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MULTIPLICATION
   * @model literal="*"
   * @generated
   * @ordered
   */
  public static final int MULTIPLICATION_VALUE = 4;

  /**
   * The '<em><b>DIVISION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DIVISION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DIVISION
   * @model literal="/"
   * @generated
   * @ordered
   */
  public static final int DIVISION_VALUE = 5;

  /**
   * An array of all the '<em><b>Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Operator[] VALUES_ARRAY =
    new Operator[]
    {
      ADD_SUB_OPERATOR,
      MULTI_DIV_OPERATOR,
      ADDITION,
      SUBTRACTION,
      MULTIPLICATION,
      DIVISION,
    };

  /**
   * A public read-only list of all the '<em><b>Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Operator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Operator</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Operator get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Operator result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Operator</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Operator getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Operator result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Operator</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Operator get(int value)
  {
    switch (value)
    {
      case ADD_SUB_OPERATOR_VALUE: return ADD_SUB_OPERATOR;
      case MULTI_DIV_OPERATOR_VALUE: return MULTI_DIV_OPERATOR;
      case ADDITION_VALUE: return ADDITION;
      case SUBTRACTION_VALUE: return SUBTRACTION;
      case MULTIPLICATION_VALUE: return MULTIPLICATION;
      case DIVISION_VALUE: return DIVISION;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Operator(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Operator