/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Incoming Document Operations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.pprls.registration.impl.RegistrationPackageImpl#getIncomingDocumentOperations()
 * @generated
 */
public enum IncomingDocumentOperations {
	/**
	 * The '<em><b>ASSIGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGN_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGN(0, "ASSIGN", "\u0391\u03bd\u03ac\u03b8\u03b5\u03c3\u03b7"),

	/**
	 * The '<em><b>CANCEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCEL_VALUE
	 * @generated
	 * @ordered
	 */
	CANCEL(1, "CANCEL", "\u0391\u03ba\u03cd\u03c1\u03c9\u03c3\u03b7"),

	/**
	 * The '<em><b>REJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECT_VALUE
	 * @generated
	 * @ordered
	 */
	REJECT(2, "REJECT", "\u0391\u03c0\u03cc\u03c1\u03c1\u03b9\u03c8\u03b7"),

	/**
	 * The '<em><b>COMPLETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETE(3, "COMPLETE", "\u039f\u03bb\u03bf\u03ba\u03bb\u03ae\u03c1\u03c9\u03c3\u03b7"),

	/**
	 * The '<em><b>REVERT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVERT_VALUE
	 * @generated
	 * @ordered
	 */
	REVERT(4, "REVERT", "\u0391\u03bd\u03ac\u03ba\u03bb\u03b7\u03c3\u03b7"),

	/**
	 * The '<em><b>ARCHIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHIVE(5, "ARCHIVE", "\u0391\u03c1\u03c7\u03b5\u03b9\u03bf\u03b8\u03ad\u03c4\u03b7\u03c3\u03b7"),

	/**
	 * The '<em><b>ACCEPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPT(6, "ACCEPT", "\u0391\u03c0\u03bf\u03b4\u03bf\u03c7\u03ae");

	/**
	 * The '<em><b>ASSIGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASSIGN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSIGN
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_VALUE = 0;

	/**
	 * The '<em><b>CANCEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CANCEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCEL
	 * @generated
	 * @ordered
	 */
	public static final int CANCEL_VALUE = 1;

	/**
	 * The '<em><b>REJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REJECT
	 * @generated
	 * @ordered
	 */
	public static final int REJECT_VALUE = 2;

	/**
	 * The '<em><b>COMPLETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPLETE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETE
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE_VALUE = 3;

	/**
	 * The '<em><b>REVERT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REVERT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVERT
	 * @generated
	 * @ordered
	 */
	public static final int REVERT_VALUE = 4;

	/**
	 * The '<em><b>ARCHIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARCHIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARCHIVE
	 * @generated
	 * @ordered
	 */
	public static final int ARCHIVE_VALUE = 5;

	/**
	 * The '<em><b>ACCEPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACCEPT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCEPT
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPT_VALUE = 6;

	/**
	 * An array of all the '<em><b>Incoming Document Operations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IncomingDocumentOperations[] VALUES_ARRAY =
		new IncomingDocumentOperations[] {
			ASSIGN,
			CANCEL,
			REJECT,
			COMPLETE,
			REVERT,
			ARCHIVE,
			ACCEPT,
		};

	/**
	 * A public read-only list of all the '<em><b>Incoming Document Operations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IncomingDocumentOperations> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Incoming Document Operations</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IncomingDocumentOperations get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IncomingDocumentOperations result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Incoming Document Operations</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IncomingDocumentOperations getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IncomingDocumentOperations result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Incoming Document Operations</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IncomingDocumentOperations get(int value) {
		switch (value) {
			case ASSIGN_VALUE: return ASSIGN;
			case CANCEL_VALUE: return CANCEL;
			case REJECT_VALUE: return REJECT;
			case COMPLETE_VALUE: return COMPLETE;
			case REVERT_VALUE: return REVERT;
			case ARCHIVE_VALUE: return ARCHIVE;
			case ACCEPT_VALUE: return ACCEPT;
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
	private IncomingDocumentOperations(int value, String name, String literal) {
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
	
} //IncomingDocumentOperations
