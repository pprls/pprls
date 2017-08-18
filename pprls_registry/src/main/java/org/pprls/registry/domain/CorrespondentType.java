/*
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>Recipient Type</b></em>',
 * and utility methods for working with them.
 */
public enum CorrespondentType {
	/**
	 * The '<em><b>RECIPIENT</b></em>' literal object.
	 * @see #RECIPIENT_VALUE
	 */
	RECIPIENT(0, "RECIPIENT", "Παραλήπτης"),

	/**
	 * The '<em><b>CC</b></em>' literal object.
	 * @see #CC_VALUE
	 */
	CC(1, "CC", "Κοινοποίηση"),

	/**
	 * The '<em><b>INTERNAL</b></em>' literal object.
	 * @see #INTERNAL_VALUE
	 */
	INTERNAL(2, "INTERNAL", "Εσωτερική διανομή"),
	
	/**
	 * The '<em><b>INTERNAL</b></em>' literal object.
	 * @see #INTERNAL_VALUE
	 */
	SENDER(3, "SENDER", "Αποστολέας");

	/**
	 * The '<em><b>RECIPIENT</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>RECIPIENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #RECIPIENT
	 */
	public static final int RECIPIENT_VALUE = 0;

	/**
	 * The '<em><b>CC</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>CC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #CC
	 */
	public static final int CC_VALUE = 1;

	/**
	 * The '<em><b>INTERNAL</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>INTERNAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #INTERNAL
	 */
	public static final int INTERNAL_VALUE = 2;
	
	/**
	 * The '<em><b>INTERNAL</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>INTERNAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #SENDER
	 */
	public static final int SENDER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Recipient Type</b></em>' enumerators.
	 */
	private static final CorrespondentType[] VALUES_ARRAY =
		new CorrespondentType[] {
			RECIPIENT,
			CC,
			INTERNAL,
			SENDER,
		};

	/**
	 * A public read-only list of all the '<em><b>Recipient Type</b></em>' enumerators.
	 */
	public static final List<CorrespondentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Recipient Type</b></em>' literal with the specified literal value.
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static CorrespondentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CorrespondentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Recipient Type</b></em>' literal with the specified name.
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static CorrespondentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CorrespondentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Recipient Type</b></em>' literal with the specified integer value.
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static CorrespondentType get(int value) {
		switch (value) {
			case RECIPIENT_VALUE: return RECIPIENT;
			case CC_VALUE: return CC;
			case INTERNAL_VALUE: return INTERNAL;
		}
		return null;
	}

	/**
	 */
	private final int value;

	/**
	 */
	private final String name;

	/**
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 */
    CorrespondentType(int value, String name, String literal) {
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
	@Override
	public String toString() {
		return literal;
	}
	
}
