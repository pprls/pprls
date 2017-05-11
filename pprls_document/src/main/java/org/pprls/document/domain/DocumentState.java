/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.document.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>Document Status</b></em>',
 * and utility methods for working with them.
 */
public enum DocumentState {
	
	
	/**
	 * The '<em><b>ASSIGN</b></em>' literal object.
	 * @see #ASSIGN_VALUE
	 */
	ASSIGN(0, "ASSIGN", "Αρχή"),
	
	/**
	 * The '<em><b>ACCEPTED</b></em>' literal object.
	 * @see #ACCEPTED_VALUE
	 */
	ACCEPTED(1, "ACCEPTED", "Αποδεκτό"),

	/**
	 * The '<em><b>DONE</b></em>' literal object.
	 * @see #DONE_VALUE
	 */
	DONE(2, "DONE", "Ολοκληρωμένο"),

	/**
	 * The '<em><b>ARCHIVED</b></em>' literal object.
	 * @see #ARCHIVED_VALUE
	 */
	ARCHIVED(3, "ARCHIVED", "Αρχειοθετημένο"),

	/**
	 * The '<em><b>REJECTED</b></em>' literal object.
	 * @see #REJECTED_VALUE
	 */
	REJECTED(4, "REJECTED", "Απορριφθέν"),

	/**
	 * The '<em><b>CANCELLED</b></em>' literal object.
	 * @see #CANCELLED_VALUE
	 */
	CANCELLED(5, "CANCELLED", "Ακυρωμένο"),

	/**
	 * The '<em><b>PENDING</b></em>' literal object.
	 * @see #PENDING_VALUE
	 */
	PENDING(6, "PENDING", "Σε αναμονή"),

	/**
	 * The '<em><b>UNDER REVISION</b></em>' literal object.
	 * @see #UNDER_REVISION_VALUE
	 */
	UNDER_REVISION(7, "UNDER_REVISION", "Επαναληψη το ορθό");


	/**
	 * The '<em><b>START</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>START</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #ASSIGN
	 */
	public static final int ASSIGN_VALUE = 0;

	/**
	 * The '<em><b>ACCEPTED</b></em>' literal value.
	 * <p>
	 * A document has been accepted
	 * </p>
	 * @see #ACCEPTED
	 */
	public static final int ACCEPTED_VALUE = 1;

	/**
	 * The '<em><b>DONE</b></em>' literal value.
	 * <p>
	 * A document life cycle has ended successfully
	 * </p>
	 * @see #DONE
	 */
	public static final int DONE_VALUE = 2;

	/**
	 * The '<em><b>ARCHIVED</b></em>' literal value.
	 * <p>
	 * A document was archived for storage no changes allowed after this
	 * </p>
	 * @see #ARCHIVED
	 */
	public static final int ARCHIVED_VALUE = 3;

	/**
	 * The '<em><b>REJECTED</b></em>' literal value.
	 * <p>
	 * A document assignment was rejected
	 * </p>
	 * @see #REJECTED
	 */
	public static final int REJECTED_VALUE = 4;

	/**
	 * The '<em><b>CANCELLED</b></em>' literal value.
	 * <p>
	 * A document was cancelled
	 * </p>
	 * @see #CANCELLED
	 */
	public static final int CANCELLED_VALUE = 5;

	/**
	 * The '<em><b>PENDING</b></em>' literal value.>
	 * <p>
	 * A document is in pending state someone hat to accept or rejected
	 * </p>
	 * @see #PENDING
	 */
	public static final int PENDING_VALUE = 6;

	/**
	 * The '<em><b>UNDER REVISION</b></em>' literal value.
	 * <p>
	 * A document 
	 * </p>
	 * @see #UNDER_REVISION
	 */
	public static final int UNDER_REVISION_VALUE = 7;



	/**
	 * An array of all the '<em><b>Document Status</b></em>' enumerators.
	 */
	private static final DocumentState[] VALUES_ARRAY =
		new DocumentState[] {
			ASSIGN,
			ACCEPTED,
			DONE,
			ARCHIVED,
			REJECTED,
			CANCELLED,
			PENDING,
			UNDER_REVISION,
		};

	/**
	 * A public read-only list of all the '<em><b>Document Status</b></em>' enumerators.
	 */
	public static final List<DocumentState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Document Status</b></em>' literal with the specified literal value.
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static DocumentState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Document Status</b></em>' literal with the specified name.
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static DocumentState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Document Status</b></em>' literal with the specified integer value.
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static DocumentState get(int value) {
		switch (value) {
			case ASSIGN_VALUE: return ASSIGN;
			case ACCEPTED_VALUE: return ACCEPTED;
			case DONE_VALUE: return DONE;
			case ARCHIVED_VALUE: return ARCHIVED;
			case REJECTED_VALUE: return REJECTED;
			case CANCELLED_VALUE: return CANCELLED;
			case PENDING_VALUE: return PENDING;
			case UNDER_REVISION_VALUE: return UNDER_REVISION;
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
	private DocumentState(int value, String name, String literal) {
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
