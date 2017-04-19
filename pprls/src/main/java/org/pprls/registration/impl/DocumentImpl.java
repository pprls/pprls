/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.BasicInternalEList;

import org.pprls.registration.Action;
import org.pprls.registration.Document;
import org.pprls.registration.DocumentStatus;
import org.pprls.registration.EmployeeDescriptor;
import org.pprls.registration.IncomingDocumentOperations;
import org.pprls.registration.InternalNumber;
import org.pprls.registration.Status;
import org.pprls.registration.ThreadType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.impl.DocumentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.pprls.registration.impl.DocumentImpl#getCurrentstatus <em>Currentstatus</em>}</li>
 *   <li>{@link org.pprls.registration.impl.DocumentImpl#getInitialstatus <em>Initialstatus</em>}</li>
 *   <li>{@link org.pprls.registration.impl.DocumentImpl#getLastDoneDate <em>Last Done Date</em>}</li>
 *   <li>{@link org.pprls.registration.impl.DocumentImpl#getLastAcceptDate <em>Last Accept Date</em>}</li>
 *   <li>{@link org.pprls.registration.impl.DocumentImpl#getPhysicalLocation <em>Physical Location</em>}</li>
 *   <li>{@link org.pprls.registration.impl.DocumentImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.pprls.registration.impl.DocumentImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.pprls.registration.impl.DocumentImpl#getAcceptingUnits <em>Accepting Units</em>}</li>
 *   <li>{@link org.pprls.registration.impl.DocumentImpl#getThreadType <em>Thread Type</em>}</li>
 *   <li>{@link org.pprls.registration.impl.DocumentImpl#getInternalNumber <em>Internal Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl implements Document {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final UUID ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected UUID id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrentstatus() <em>Currentstatus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentstatus()
	 * @generated
	 * @ordered
	 */
	protected Status currentstatus;

	/**
	 * The cached value of the '{@link #getInitialstatus() <em>Initialstatus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialstatus()
	 * @generated
	 * @ordered
	 */
	protected Status initialstatus;

	/**
	 * The default value of the '{@link #getLastDoneDate() <em>Last Done Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastDoneDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_DONE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastDoneDate() <em>Last Done Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastDoneDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastDoneDate = LAST_DONE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastAcceptDate() <em>Last Accept Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAcceptDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_ACCEPT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastAcceptDate() <em>Last Accept Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAcceptDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastAcceptDate = LAST_ACCEPT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicalLocation() <em>Physical Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_LOCATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPhysicalLocation() <em>Physical Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalLocation()
	 * @generated
	 * @ordered
	 */
	protected String physicalLocation = PHYSICAL_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final Action ACTION_EDEFAULT = Action.NONE;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAcceptingUnits() <em>Accepting Units</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptingUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Short> acceptingUnits;

	/**
	 * The default value of the '{@link #getThreadType() <em>Thread Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadType()
	 * @generated
	 * @ordered
	 */
	protected static final ThreadType THREAD_TYPE_EDEFAULT = ThreadType.RECIPIENT;

	/**
	 * The cached value of the '{@link #getThreadType() <em>Thread Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadType()
	 * @generated
	 * @ordered
	 */
	protected ThreadType threadType = THREAD_TYPE_EDEFAULT;

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
	public DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(UUID newId) {
		id = newId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getCurrentstatus() {
		return currentstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentstatus(Status newCurrentstatus) {
		currentstatus = newCurrentstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getInitialstatus() {
		return initialstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialstatus(Status newInitialstatus) {
		initialstatus = newInitialstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastDoneDate() {
		return lastDoneDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastDoneDate(Date newLastDoneDate) {
		lastDoneDate = newLastDoneDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastAcceptDate() {
		return lastAcceptDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastAcceptDate(Date newLastAcceptDate) {
		lastAcceptDate = newLastAcceptDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhysicalLocation() {
		return physicalLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalLocation(String newPhysicalLocation) {
		physicalLocation = newPhysicalLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		action = newAction == null ? ACTION_EDEFAULT : newAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Short> getAcceptingUnits() {
		if (acceptingUnits == null) {
			acceptingUnits = new BasicInternalEList<Short>(short.class);
		}
		return acceptingUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadType getThreadType() {
		return threadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadType(ThreadType newThreadType) {
		threadType = newThreadType == null ? THREAD_TYPE_EDEFAULT : newThreadType;
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
	public InternalNumber getCurrentInternalNunber() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancel(EmployeeDescriptor handler, String log) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void close(EmployeeDescriptor handler, String log) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(EmployeeDescriptor handler, String log) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void forward(EmployeeDescriptor owner, EmployeeDescriptor handler, String log) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasBeenThroughThisDirectorateBefore(short directorateId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IncomingDocumentOperations> allowedOperationsFromThisState() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeState(IncomingDocumentOperations operation, String logMessage, EmployeeDescriptor handler) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeDescriptor getOwner() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPending() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAccepted() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isDone() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCancelled() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentStatus getState() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", lastDoneDate: ");
		result.append(lastDoneDate);
		result.append(", lastAcceptDate: ");
		result.append(lastAcceptDate);
		result.append(", physicalLocation: ");
		result.append(physicalLocation);
		result.append(", action: ");
		result.append(action);
		result.append(", comments: ");
		result.append(comments);
		result.append(", acceptingUnits: ");
		result.append(acceptingUnits);
		result.append(", threadType: ");
		result.append(threadType);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl
