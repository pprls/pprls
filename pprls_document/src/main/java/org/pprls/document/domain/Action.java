/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.document.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Οι δυνατές επιλογές στο χαρακτηρισμό ενός εγγράφου από τον Προϊστάμενο.
 * 
 */
public enum Action {
	
	/**
	 * Don't do anything
	 */
	NONE(0, "None", ""),
	
	/**
	 * Act 
	 */
	ACT(1, "Act", "Ένέργεια"),

	/**
	 * File the document
	 */
	FILE(2, "File", "Αρχείο"),

	/**
	 * Collaborate with some to act. 
	 */
	COLLABORATE(3, "Collaborate", "\u03a3\u03c5\u03bd\u03ad\u03c1\u03b3\u03b5\u03b9\u03b1");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 */
	public static final int NONE_VALUE = 0;
	
	/**
	 * The '<em><b>Act</b></em>' literal value.
	 */
	public static final int ACT_VALUE = 1;

	/**
	 * The '<em><b>File</b></em>' literal value.
	 */
	public static final int FILE_VALUE = 2;

	/**
	 * The '<em><b>Collaborate</b></em>' literal value.
	 */
	public static final int COLLABORATE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Action</b></em>' enumerators.
	 */
	private static final Action[] VALUES_ARRAY =
		new Action[] {
			NONE,
			ACT,
			FILE,
			COLLABORATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Action</b></em>' enumerators.
	 */
	public static final List<Action> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action</b></em>' literal with the specified literal value.
	 */
	public static Action get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Action result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action</b></em>' literal with the specified name.
	 */
	public static Action getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Action result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action</b></em>' literal with the specified integer value.
	 */
	public static Action get(int value) {
		switch (value) {
			case ACT_VALUE: return ACT;
			case FILE_VALUE: return FILE;
			case NONE_VALUE: return NONE;
			case COLLABORATE_VALUE: return COLLABORATE;
		}
		return null;
	}

	/**
	 * Value field
	 */
	private final int value;

	/**
	 * Name field
	 */
	private final String name;

	/**
	 * Literal field
	 */
	private final String literal;

	/**
	 * The contractor
	 */
	private Action(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * The value (computer oriented text)
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * The name (developer oriented text)
	 */
	public String getName() {
	  return name;
	}

	/**
	 * The literal (human oriented text)
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * It returns the literal
	 */
	public String toString() {
		return literal;
	}
	
} 
