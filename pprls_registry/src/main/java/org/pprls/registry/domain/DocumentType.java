/*
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>Document Type</b></em>',
 * and utility methods for working with them.
 */
public enum DocumentType {
	/**
	 * The '<em><b>NOTE</b></em>' literal object.
	 * @see #NOTE_VALUE
	 */
	NOTE(0, "NOTE", "Υπηρεσιακό σημείωμα"),

	/**
	 * The '<em><b>DOCUMENT</b></em>' literal object.
	 * @see #DOCUMENT_VALUE
	 */
	DOCUMENT(1, "DOCUMENT", "Έγγραφο"),

	/**
	 * The '<em><b>EMAIL</b></em>' literal object.
	 * @see #EMAIL_VALUE
	 */
	EMAIL(2, "EMAIL", "email"),

	/**
	 * The '<em><b>SMS</b></em>' literal object.
	 * @see #SMS_VALUE
	 */
	SMS(3, "SMS", "SMS");

	/**
	 * The '<em><b>NOTE</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>NOTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #NOTE
	 */
	public static final int NOTE_VALUE = 0;

	/**
	 * The '<em><b>DOCUMENT</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>DOCUMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #DOCUMENT
	 */
	public static final int DOCUMENT_VALUE = 1;

	/**
	 * The '<em><b>EMAIL</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>EMAIL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #EMAIL
	 */
	public static final int EMAIL_VALUE = 2;

	/**
	 * The '<em><b>SMS</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>SMS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #SMS
	 */
	public static final int SMS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Document Type</b></em>' enumerators.
	 */
	private static final DocumentType[] VALUES_ARRAY =
		new DocumentType[] {
			NOTE,
			DOCUMENT,
			EMAIL,
			SMS,
		};

	/**
	 * A public read-only list of all the '<em><b>Document Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DocumentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Document Type</b></em>' literal with the specified literal value.
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static DocumentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Document Type</b></em>' literal with the specified name.
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static DocumentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Document Type</b></em>' literal with the specified integer value.
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static DocumentType get(int value) {
		switch (value) {
			case NOTE_VALUE: return NOTE;
			case DOCUMENT_VALUE: return DOCUMENT;
			case EMAIL_VALUE: return EMAIL;
			case SMS_VALUE: return SMS;
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
    DocumentType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 */
	public int getValue() {
	  return value;
	}

	/**
	 */
	public String getName() {
	  return name;
	}

	/**
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
