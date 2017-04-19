/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.Document#getId <em>Id</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getCurrentstatus <em>Currentstatus</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getInitialstatus <em>Initialstatus</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getLastDoneDate <em>Last Done Date</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getLastAcceptDate <em>Last Accept Date</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getPhysicalLocation <em>Physical Location</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getAction <em>Action</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getComments <em>Comments</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getAcceptingUnits <em>Accepting Units</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getThreadType <em>Thread Type</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getInternalNumber <em>Internal Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public interface Document {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(UUID)
	 * @generated
	 */
	UUID getId();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(UUID value);

	/**
	 * Returns the value of the '<em><b>Currentstatus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currentstatus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currentstatus</em>' reference.
	 * @see #setCurrentstatus(Status)
	 * @generated
	 */
	Status getCurrentstatus();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getCurrentstatus <em>Currentstatus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currentstatus</em>' reference.
	 * @see #getCurrentstatus()
	 * @generated
	 */
	void setCurrentstatus(Status value);

	/**
	 * Returns the value of the '<em><b>Initialstatus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialstatus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialstatus</em>' reference.
	 * @see #setInitialstatus(Status)
	 * @generated
	 */
	Status getInitialstatus();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getInitialstatus <em>Initialstatus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialstatus</em>' reference.
	 * @see #getInitialstatus()
	 * @generated
	 */
	void setInitialstatus(Status value);

	/**
	 * Returns the value of the '<em><b>Last Done Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Done Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Done Date</em>' attribute.
	 * @see #setLastDoneDate(Date)
	 * @generated
	 */
	Date getLastDoneDate();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getLastDoneDate <em>Last Done Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Done Date</em>' attribute.
	 * @see #getLastDoneDate()
	 * @generated
	 */
	void setLastDoneDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Accept Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Accept Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Accept Date</em>' attribute.
	 * @see #setLastAcceptDate(Date)
	 * @generated
	 */
	Date getLastAcceptDate();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getLastAcceptDate <em>Last Accept Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Accept Date</em>' attribute.
	 * @see #getLastAcceptDate()
	 * @generated
	 */
	void setLastAcceptDate(Date value);

	/**
	 * Returns the value of the '<em><b>Physical Location</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Location</em>' attribute.
	 * @see #setPhysicalLocation(String)
	 * @generated
	 */
	String getPhysicalLocation();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getPhysicalLocation <em>Physical Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Location</em>' attribute.
	 * @see #getPhysicalLocation()
	 * @generated
	 */
	void setPhysicalLocation(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.pprls.registration.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see org.pprls.registration.Action
	 * @see #setAction(Action)
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see org.pprls.registration.Action
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Accepting Units</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Short}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepting Units</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepting Units</em>' attribute list.
	 * @generated
	 */
	List<Short> getAcceptingUnits();

	/**
	 * Returns the value of the '<em><b>Thread Type</b></em>' attribute.
	 * The default value is <code>"RECIPIENT"</code>.
	 * The literals are from the enumeration {@link org.pprls.registration.ThreadType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Type</em>' attribute.
	 * @see org.pprls.registration.ThreadType
	 * @see #setThreadType(ThreadType)
	 * @generated
	 */
	ThreadType getThreadType();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getThreadType <em>Thread Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Type</em>' attribute.
	 * @see org.pprls.registration.ThreadType
	 * @see #getThreadType()
	 * @generated
	 */
	void setThreadType(ThreadType value);

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
	 * Sets the value of the '{@link org.pprls.registration.Document#getInternalNumber <em>Internal Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Number</em>' reference.
	 * @see #getInternalNumber()
	 * @generated
	 */
	void setInternalNumber(InternalNumber value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InternalNumber getCurrentInternalNunber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void cancel(EmployeeDescriptor handler, String log);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void close(EmployeeDescriptor handler, String log);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void accept(EmployeeDescriptor handler, String log);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void forward(EmployeeDescriptor owner, EmployeeDescriptor handler, String log);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	boolean hasBeenThroughThisDirectorateBefore(short directorateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<IncomingDocumentOperations> allowedOperationsFromThisState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void changeState(IncomingDocumentOperations operation, String logMessage, EmployeeDescriptor handler);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmployeeDescriptor getOwner();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	boolean isPending();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	boolean isAccepted();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Boolean isDone();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	boolean isCancelled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocumentStatus getState();


} // Document
