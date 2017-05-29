/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Classification of record or document
 * 
 * @author kapostolou
 *
 */
public enum Classification {
	/**
	 * public constructor
	 */
	PUBLIC(0, "public", "Δημόσιο"),

	/**
	 * internal constructor
	 */
	INTERNAL(1, "internal", "Εσωτερικό"),

	/**
	 * confidential constructor
	 */
	CONFIDENTIAL(2, "confidential", "Εμπιστευτικό"),

	/**
	 * secret constructor
	 */
	SECRET(3, "secret", "Απόρρητο");

	/**
	 * public value
	 */
	public static final int PUBLIC_VALUE = 0;

	/**
	 * internal value
	 */
	public static final int INTERNAL_VALUE = 1;

	/**
	 * confidential value
	 */
	public static final int CONFIDENTIAL_VALUE = 2;

	/**
	 * secret value
	 */
	public static final int SECRET_VALUE = 3;

	/**
	 * An array of all the '<em><b>Classification</b></em>' enumerators. 
	 * 
	 */
	private static final Classification[] VALUES_ARRAY = new Classification[] { PUBLIC, INTERNAL, CONFIDENTIAL,
			SECRET, };

	/**
	 * A public read-only list of all the '<em><b>Classification</b></em>'
	 * enumerators. 
	 */
	public static final List<Classification> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Classification</b></em>' literal with the specified
	 * literal value. 
	 * 
	 * @param literal
	 *            the literal.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static Classification get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Classification result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Classification</b></em>' literal with the specified
	 * name. 
	 * 
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static Classification getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Classification result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Classification</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static Classification get(int value) {
		switch (value) {
		case PUBLIC_VALUE:
			return PUBLIC;
		case INTERNAL_VALUE:
			return INTERNAL;
		case CONFIDENTIAL_VALUE:
			return CONFIDENTIAL;
		case SECRET_VALUE:
			return SECRET;
		}
		return null;
	}

	/**
	 * the value field
	 */
	private final int value;

	/**
	 * the name field
	 */
	private final String name;

	/**
	 * the literal field
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. 
	 */
	private Classification(int value, String name, String literal) {
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
	 * Returns the literal value of the enumerator, which is its string
	 * representation. 
	 */
	@Override
	public String toString() {
		return literal;
	}

}
