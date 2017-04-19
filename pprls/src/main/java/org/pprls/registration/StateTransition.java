/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.StateTransition#getState <em>State</em>}</li>
 *   <li>{@link org.pprls.registration.StateTransition#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface StateTransition {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"\u03a3\u03b5 \u03b1\u03bd\u03b1\u03bc\u03bf\u03bd\u03ae"</code>.
	 * The literals are from the enumeration {@link org.pprls.registration.DocumentStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.pprls.registration.DocumentStatus
	 * @see #setState(DocumentStatus)
	 * @model default="\u03a3\u03b5 \u03b1\u03bd\u03b1\u03bc\u03bf\u03bd\u03ae" required="true"
	 * @generated
	 */
	DocumentStatus getState();

	/**
	 * Sets the value of the '{@link org.pprls.registration.StateTransition#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.pprls.registration.DocumentStatus
	 * @see #getState()
	 * @generated
	 */
	void setState(DocumentStatus value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.pprls.registration.IncomingDocumentOperations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see org.pprls.registration.IncomingDocumentOperations
	 * @see #setOperation(IncomingDocumentOperations)
	 * @model required="true"
	 * @generated
	 */
	IncomingDocumentOperations getOperation();

	/**
	 * Sets the value of the '{@link org.pprls.registration.StateTransition#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see org.pprls.registration.IncomingDocumentOperations
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(IncomingDocumentOperations value);


} // StateTransition
