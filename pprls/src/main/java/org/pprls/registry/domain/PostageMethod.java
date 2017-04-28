/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>Postal Method</b></em>',
 * and utility methods for working with them.
 */
public enum PostageMethod {
	
	UNSENT(0, "Unsent", "Μη απεσταλμένο"),
	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * @see #OTHER_VALUE
	 */
	OTHER(1, "Other", "Άλλο"),

	/**
	 * The '<em><b>Snail Mail</b></em>' literal object.
	 * @see #SNAIL_MAIL_VALUE
	 */
	SNAIL_MAIL(2, "SnailMail", "Ταχυδρομικώς"),

	/**
	 * The '<em><b>Fax</b></em>' literal object.
	 * @see #FAX_VALUE
	 */
	FAX(3, "Fax", "Fax"),

	/**
	 * The '<em><b>Email</b></em>' literal object.
	 * @see #EMAIL_VALUE
	 */
	EMAIL(4, "Email", "Ηλεκρονικό ταχυδρομείο"),

	/**
	 * The '<em><b>Hand Delivered</b></em>' literal object.
	 * @see #HAND_DELIVERED_VALUE
	 */
	HAND_DELIVERED(5, "HandDelivered", "Ιδιοχείρως"),

	/**
	 * The '<em><b>Digital</b></em>' literal object.
	 * @see #DIGITAL_VALUE
	 */
	DIGITAL(6, "Digital", "Ψηφιακώς"),

	/**
	 * The '<em><b>Registered Snail Mail</b></em>' literal object.
	 * @see #REGISTERED_SNAIL_MAIL_VALUE
	 */
	REGISTERED_SNAIL_MAIL(7, "RegisteredSnailMail", "Συστημένο"),

	/**
	 * The '<em><b>Courier</b></em>' literal object.
	 * @see #COURIER_VALUE
	 */
	COURIER(8, "Courier", "Ταχυμεταφορική"),

	/**
	 * The '<em><b>Empowerment</b></em>' literal object.
	 * @see #EMPOWERMENT_VALUE
	 */
	EMPOWERMENT(9, "Empowerment", "Εξουσιοδότηση");

	/**
	 * The '<em><b>Unsent</b></em>' literal value.
	 * <p>
	 * It was not sent
	 * </p>
	 * @see #UNSEND
	 */
	public static final int UNSENT_VALUE = 0;
	
	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <p>
	 * Undetermined how it was sent
	 * </p>
	 * @see #OTHER
	 */
	public static final int OTHER_VALUE = 1;

	/**
	 * The '<em><b>Snail Mail</b></em>' literal value.
	 * <p>
	 * Regular post office
	 * </p>
	 * @see #SNAIL_MAIL
	 */
	public static final int SNAIL_MAIL_VALUE = 2;

	/**
	 * The '<em><b>Fax</b></em>' literal value.
	 * <p>
	 * sent by fax
	 * </p>
	 * @see #FAX
	 */
	public static final int FAX_VALUE = 3;

	/**
	 * The '<em><b>Email</b></em>' literal value.
	 * <p>
	 * Sent by e-mail
	 * </p>
	 * @see #EMAIL
	 */
	public static final int EMAIL_VALUE = 4;

	/**
	 * The '<em><b>Hand Delivered</b></em>' literal value.
	 * <p>
	 * delivered by hand
	 * </p>
	 * @see #HAND_DELIVERED
	 */
	public static final int HAND_DELIVERED_VALUE = 5;

	/**
	 * The '<em><b>Digital</b></em>' literal value.
	 * <p>
	 * Sent by the system its shelf
	 * </p>
	 * @see #DIGITAL
	 */
	public static final int DIGITAL_VALUE = 6;

	/**
	 * The '<em><b>Registered Snail Mail</b></em>' literal value.
	 * <p>
	 * Post office with receipt
	 * </p>
	 * @see #REGISTERED_SNAIL_MAIL
	 */
	public static final int REGISTERED_SNAIL_MAIL_VALUE = 7;

	/**
	 * The '<em><b>Courier</b></em>' literal value.
	 * <p>
	 * Courier service
	 * </p>
	 * @see #COURIER
	 */
	public static final int COURIER_VALUE = 8;

	/**
	 * The '<em><b>Empowerment</b></em>' literal value.
	 * <p>
	 * Delivered by hand to a third person 
	 * </p>
	 * @see #EMPOWERMENT
	 */
	public static final int EMPOWERMENT_VALUE = 9;

	/**
	 * An array of all the '<em><b>Postal Method</b></em>' enumerators.
	 */
	private static final PostageMethod[] VALUES_ARRAY =
		new PostageMethod[] {
			UNSENT,
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
	 */
	public static final List<PostageMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Postal Method</b></em>' literal with the specified literal value.
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static PostageMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PostageMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Postal Method</b></em>' literal with the specified name.
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static PostageMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PostageMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Postal Method</b></em>' literal with the specified integer value.
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static PostageMethod get(int value) {
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
	 * value field
	 */
	private final int value;

	/**
	 * name field
	 */
	private final String name;

	/**
	 * literal field
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 */
	private PostageMethod(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * value getter
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * name getter
	 */
	public String getName() {
	  return name;
	}

	/**
	 * literal getter
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 */
	public String toString() {
		return literal;
	}
	
}
