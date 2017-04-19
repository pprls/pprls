/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Postal Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.pprls.registration.impl.RegistrationPackageImpl#getPostalMethod()
 * @model
 * @generated
 */
public enum PostalMethod implements InternalPostalMethod {
	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(0, "Other", ""),

	/**
	 * The '<em><b>Snail Mail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SNAIL_MAIL_VALUE
	 * @generated
	 * @ordered
	 */
	SNAIL_MAIL(1, "SnailMail", "\u0395\u039b\u03a4\u0391"),

	/**
	 * The '<em><b>Fax</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAX_VALUE
	 * @generated
	 * @ordered
	 */
	FAX(2, "Fax", "Fax"),

	/**
	 * The '<em><b>Email</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	EMAIL(3, "Email", "Email"),

	/**
	 * The '<em><b>Hand Delivered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAND_DELIVERED_VALUE
	 * @generated
	 * @ordered
	 */
	HAND_DELIVERED(4, "HandDelivered", "\u0399\u03b4\u03b9\u03bf\u03c7\u03b5\u03af\u03c1\u03c9\u03c2"),

	/**
	 * The '<em><b>Digital</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_VALUE
	 * @generated
	 * @ordered
	 */
	DIGITAL(5, "Digital", "\u03a8\u03b7\u03c6\u03b9\u03b1\u03ba\u03ac"),

	/**
	 * The '<em><b>Registered Snail Mail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTERED_SNAIL_MAIL_VALUE
	 * @generated
	 * @ordered
	 */
	REGISTERED_SNAIL_MAIL(6, "RegisteredSnailMail", "\u03a3\u03c5\u03c3\u03c4\u03b7\u03bc\u03ad\u03bd\u03bf"),

	/**
	 * The '<em><b>Courier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COURIER_VALUE
	 * @generated
	 * @ordered
	 */
	COURIER(7, "Courier", "Courier"),

	/**
	 * The '<em><b>Empowerment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPOWERMENT_VALUE
	 * @generated
	 * @ordered
	 */
	EMPOWERMENT(8, "Empowerment", "E\u03be\u03bf\u03c5\u03c3\u03b9\u03bf\u03b4\u03cc\u03c4\u03b7\u03c3\u03b7");

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other" literal=""
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 0;

	/**
	 * The '<em><b>Snail Mail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Snail Mail</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SNAIL_MAIL
	 * @model name="SnailMail" literal="\u0395\u039b\u03a4\u0391"
	 * @generated
	 * @ordered
	 */
	public static final int SNAIL_MAIL_VALUE = 1;

	/**
	 * The '<em><b>Fax</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fax</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAX
	 * @model name="Fax"
	 * @generated
	 * @ordered
	 */
	public static final int FAX_VALUE = 2;

	/**
	 * The '<em><b>Email</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Email</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMAIL
	 * @model name="Email"
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL_VALUE = 3;

	/**
	 * The '<em><b>Hand Delivered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hand Delivered</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HAND_DELIVERED
	 * @model name="HandDelivered" literal="\u0399\u03b4\u03b9\u03bf\u03c7\u03b5\u03af\u03c1\u03c9\u03c2"
	 * @generated
	 * @ordered
	 */
	public static final int HAND_DELIVERED_VALUE = 4;

	/**
	 * The '<em><b>Digital</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Digital</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIGITAL
	 * @model name="Digital" literal="\u03a8\u03b7\u03c6\u03b9\u03b1\u03ba\u03ac"
	 * @generated
	 * @ordered
	 */
	public static final int DIGITAL_VALUE = 5;

	/**
	 * The '<em><b>Registered Snail Mail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Registered Snail Mail</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGISTERED_SNAIL_MAIL
	 * @model name="RegisteredSnailMail" literal="\u03a3\u03c5\u03c3\u03c4\u03b7\u03bc\u03ad\u03bd\u03bf"
	 * @generated
	 * @ordered
	 */
	public static final int REGISTERED_SNAIL_MAIL_VALUE = 6;

	/**
	 * The '<em><b>Courier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Courier</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COURIER
	 * @model name="Courier"
	 * @generated
	 * @ordered
	 */
	public static final int COURIER_VALUE = 7;

	/**
	 * The '<em><b>Empowerment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Empowerment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMPOWERMENT
	 * @model name="Empowerment" literal="E\u03be\u03bf\u03c5\u03c3\u03b9\u03bf\u03b4\u03cc\u03c4\u03b7\u03c3\u03b7"
	 * @generated
	 * @ordered
	 */
	public static final int EMPOWERMENT_VALUE = 8;

	/**
	 * An array of all the '<em><b>Postal Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PostalMethod[] VALUES_ARRAY =
		new PostalMethod[] {
			OTHER,
			SNAIL_MAIL,
			FAX,
			EMAIL,
			HAND_DELIVERED,
			DIGITAL,
			REGISTERED_SNAIL_MAIL,
			COURIER,
			EMPOWERMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Postal Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PostalMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Postal Method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PostalMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PostalMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Postal Method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PostalMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PostalMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Postal Method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PostalMethod get(int value) {
		switch (value) {
			case OTHER_VALUE: return OTHER;
			case SNAIL_MAIL_VALUE: return SNAIL_MAIL;
			case FAX_VALUE: return FAX;
			case EMAIL_VALUE: return EMAIL;
			case HAND_DELIVERED_VALUE: return HAND_DELIVERED;
			case DIGITAL_VALUE: return DIGITAL;
			case REGISTERED_SNAIL_MAIL_VALUE: return REGISTERED_SNAIL_MAIL;
			case COURIER_VALUE: return COURIER;
			case EMPOWERMENT_VALUE: return EMPOWERMENT;
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
	private PostalMethod(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PostalMethod

/**
 * A private implementation interface used to hide the inheritance from Enumerator.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
interface InternalPostalMethod extends org.eclipse.emf.common.util.Enumerator {
	// Empty 
}
