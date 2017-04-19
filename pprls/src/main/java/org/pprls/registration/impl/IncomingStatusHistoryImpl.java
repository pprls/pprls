/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration.impl;

import org.pprls.registration.IncomingStatusHistory;
import org.pprls.registration.InternalNumber;
import org.pprls.registration.Status;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incoming Status History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.impl.IncomingStatusHistoryImpl#getLogMessage <em>Log Message</em>}</li>
 *   <li>{@link org.pprls.registration.impl.IncomingStatusHistoryImpl#getIncoming_thread_e_id <em>Incoming thread eid</em>}</li>
 *   <li>{@link org.pprls.registration.impl.IncomingStatusHistoryImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.pprls.registration.impl.IncomingStatusHistoryImpl#getInternalNumber <em>Internal Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncomingStatusHistoryImpl implements IncomingStatusHistory {
	/**
	 * The default value of the '{@link #getLogMessage() <em>Log Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogMessage() <em>Log Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogMessage()
	 * @generated
	 * @ordered
	 */
	protected String logMessage = LOG_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncoming_thread_e_id() <em>Incoming thread eid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming_thread_e_id()
	 * @generated
	 * @ordered
	 */
	protected static final short INCOMING_THREAD_EID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIncoming_thread_e_id() <em>Incoming thread eid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming_thread_e_id()
	 * @generated
	 * @ordered
	 */
	protected short incoming_thread_e_id = INCOMING_THREAD_EID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getInternalNumber() <em>Internal Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalNumber()
	 * @generated
	 * @ordered
	 */
	protected InternalNumber internalNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingStatusHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogMessage() {
		return logMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogMessage(String newLogMessage) {
		logMessage = newLogMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getIncoming_thread_e_id() {
		return incoming_thread_e_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncoming_thread_e_id(short newIncoming_thread_e_id) {
		incoming_thread_e_id = newIncoming_thread_e_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		status = newStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalNumber getInternalNumber() {
		return internalNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalNumber(InternalNumber newInternalNumber) {
		internalNumber = newInternalNumber;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (logMessage: ");
		result.append(logMessage);
		result.append(", incoming_thread_e_id: ");
		result.append(incoming_thread_e_id);
		result.append(')');
		return result.toString();
	}

} //IncomingStatusHistoryImpl
