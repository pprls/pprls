/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Outgoing Document Operations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.pprls.registration.impl.RegistrationPackageImpl#getOutgoingDocumentOperations()
 * @model
 * @generated
 */
public enum OutgoingDocumentOperations implements InternalOutgoingDocumentOperations {
	/**
	 * The '<em><b>EDIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDIT_VALUE
	 * @generated
	 * @ordered
	 */
	EDIT(0, "EDIT", "\u0395\u03c0\u03b5\u03be\u03b5\u03c1\u03b3\u03b1\u03c3\u03af\u03b1"),

	/**
	 * The '<em><b>REVISE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVISE_VALUE
	 * @generated
	 * @ordered
	 */
	REVISE(1, "REVISE", "\u0391\u03bd\u03b1\u03b8\u03b5\u03ce\u03c1\u03b7\u03c3\u03b7"),

	/**
	 * The '<em><b>CANCEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCEL_VALUE
	 * @generated
	 * @ordered
	 */
	CANCEL(2, "CANCEL", "\u0391\u03ba\u03cd\u03c1\u03c9\u03c3\u03b7"),

	/**
	 * The '<em><b>REVERT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVERT_VALUE
	 * @generated
	 * @ordered
	 */
	REVERT(3, "REVERT", "\u0391\u03bd\u03ac\u03ba\u03bb\u03b7\u03c3\u03b7"),

	/**
	 * The '<em><b>REJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECT_VALUE
	 * @generated
	 * @ordered
	 */
	REJECT(4, "REJECT", "\u0391\u03c0\u03cc\u03c1\u03c1\u03b9\u03c8\u03b7"),

	/**
	 * The '<em><b>CREATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE(5, "CREATE", "\u0394\u03b7\u03bc\u03b9\u03bf\u03c5\u03c1\u03b3\u03af\u03b1"),

	/**
	 * The '<em><b>APPROVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROVE_VALUE
	 * @generated
	 * @ordered
	 */
	APPROVE(6, "APPROVE", "\u0388\u03b3\u03ba\u03c1\u03b9\u03c3\u03b7"),

	/**
	 * The '<em><b>ARCHIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHIVE(7, "ARCHIVE", "\u0391\u03c1\u03c7\u03b5\u03b9\u03bf\u03b8\u03ad\u03c4\u03b7\u03c3\u03b7");

	/**
	 * The '<em><b>EDIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EDIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EDIT
	 * @model literal="\u0395\u03c0\u03b5\u03be\u03b5\u03c1\u03b3\u03b1\u03c3\u03af\u03b1"
	 * @generated
	 * @ordered
	 */
	public static final int EDIT_VALUE = 0;

	/**
	 * The '<em><b>REVISE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REVISE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVISE
	 * @model literal="\u0391\u03bd\u03b1\u03b8\u03b5\u03ce\u03c1\u03b7\u03c3\u03b7"
	 * @generated
	 * @ordered
	 */
	public static final int REVISE_VALUE = 1;

	/**
	 * The '<em><b>CANCEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CANCEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCEL
	 * @model literal="\u0391\u03ba\u03cd\u03c1\u03c9\u03c3\u03b7"
	 * @generated
	 * @ordered
	 */
	public static final int CANCEL_VALUE = 2;

	/**
	 * The '<em><b>REVERT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REVERT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVERT
	 * @model literal="\u0391\u03bd\u03ac\u03ba\u03bb\u03b7\u03c3\u03b7"
	 * @generated
	 * @ordered
	 */
	public static final int REVERT_VALUE = 3;

	/**
	 * The '<em><b>REJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REJECT
	 * @model literal="\u0391\u03c0\u03cc\u03c1\u03c1\u03b9\u03c8\u03b7"
	 * @generated
	 * @ordered
	 */
	public static final int REJECT_VALUE = 4;

	/**
	 * The '<em><b>CREATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CREATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE
	 * @model literal="\u0394\u03b7\u03bc\u03b9\u03bf\u03c5\u03c1\u03b3\u03af\u03b1"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_VALUE = 5;

	/**
	 * The '<em><b>APPROVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APPROVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPROVE
	 * @model literal="\u0388\u03b3\u03ba\u03c1\u03b9\u03c3\u03b7"
	 * @generated
	 * @ordered
	 */
	public static final int APPROVE_VALUE = 6;

	/**
	 * The '<em><b>ARCHIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARCHIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARCHIVE
	 * @model literal="\u0391\u03c1\u03c7\u03b5\u03b9\u03bf\u03b8\u03ad\u03c4\u03b7\u03c3\u03b7"
	 * @generated
	 * @ordered
	 */
	public static final int ARCHIVE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Outgoing Document Operations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OutgoingDocumentOperations[] VALUES_ARRAY =
		new OutgoingDocumentOperations[] {
			EDIT,
			REVISE,
			CANCEL,
			REVERT,
			REJECT,
			CREATE,
			APPROVE,
			ARCHIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Outgoing Document Operations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OutgoingDocumentOperations> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Outgoing Document Operations</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OutgoingDocumentOperations get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OutgoingDocumentOperations result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Outgoing Document Operations</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OutgoingDocumentOperations getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OutgoingDocumentOperations result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Outgoing Document Operations</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OutgoingDocumentOperations get(int value) {
		switch (value) {
			case EDIT_VALUE: return EDIT;
			case REVISE_VALUE: return REVISE;
			case CANCEL_VALUE: return CANCEL;
			case REVERT_VALUE: return REVERT;
			case REJECT_VALUE: return REJECT;
			case CREATE_VALUE: return CREATE;
			case APPROVE_VALUE: return APPROVE;
			case ARCHIVE_VALUE: return ARCHIVE;
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
	private OutgoingDocumentOperations(int value, String name, String literal) {
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
	
} //OutgoingDocumentOperations

/**
 * A private implementation interface used to hide the inheritance from Enumerator.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
interface InternalOutgoingDocumentOperations extends org.eclipse.emf.common.util.Enumerator {
	// Empty 
}
