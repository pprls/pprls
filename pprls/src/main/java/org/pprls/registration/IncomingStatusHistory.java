/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incoming Status History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.IncomingStatusHistory#getLogMessage <em>Log Message</em>}</li>
 *   <li>{@link org.pprls.registration.IncomingStatusHistory#getIncoming_thread_e_id <em>Incoming thread eid</em>}</li>
 *   <li>{@link org.pprls.registration.IncomingStatusHistory#getStatus <em>Status</em>}</li>
 *   <li>{@link org.pprls.registration.IncomingStatusHistory#getInternalNumber <em>Internal Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public interface IncomingStatusHistory {
	/**
	 * Returns the value of the '<em><b>Log Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Message</em>' attribute.
	 * @see #setLogMessage(String)
	 * @generated
	 */
	String getLogMessage();

	/**
	 * Sets the value of the '{@link org.pprls.registration.IncomingStatusHistory#getLogMessage <em>Log Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Message</em>' attribute.
	 * @see #getLogMessage()
	 * @generated
	 */
	void setLogMessage(String value);

	/**
	 * Returns the value of the '<em><b>Incoming thread eid</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming thread eid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming thread eid</em>' attribute.
	 * @see #setIncoming_thread_e_id(short)
	 * @generated
	 */
	short getIncoming_thread_e_id();

	/**
	 * Sets the value of the '{@link org.pprls.registration.IncomingStatusHistory#getIncoming_thread_e_id <em>Incoming thread eid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming thread eid</em>' attribute.
	 * @see #getIncoming_thread_e_id()
	 * @generated
	 */
	void setIncoming_thread_e_id(short value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link org.pprls.registration.IncomingStatusHistory#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Internal Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Number</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Number</em>' reference.
	 * @see #setInternalNumber(InternalNumber)
	 * @generated
	 */
	InternalNumber getInternalNumber();

	/**
	 * Sets the value of the '{@link org.pprls.registration.IncomingStatusHistory#getInternalNumber <em>Internal Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Number</em>' reference.
	 * @see #getInternalNumber()
	 * @generated
	 */
	void setInternalNumber(InternalNumber value);


} // IncomingStatusHistory
