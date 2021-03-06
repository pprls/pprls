/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.document.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.pprls.core.EntityDescriptor;

/**
 * The digital representation of a paper document.
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.pprls.document.document.domain.Document#getId
 * <em>Id</em>}</li>
 * <li>{@link org.pprls.document.document.domain.Document#getCurrentstatus
 * <em>CurrentStatus</em>}</li>
 * <li>{@link org.pprls.document.document.domain.Document#getLastDoneDate
 * <em>Last Done Date</em>}</li>
 * <li>{@link org.pprls.document.document.domain.Document#getLastAcceptDate
 * <em>Last Accept Date</em>}</li>
 * <li>{@link org.pprls.document.document.domain.Document#getPhysicalLocation
 * <em>Physical Location</em>}</li>
 * <li>{@link org.pprls.document.document.domain.Document#getAction
 * <em>Action</em>}</li>
 * <li>{@link org.pprls.document.document.domain.Document#getComments
 * <em>Comments</em>}</li>
 * <li>{@link org.pprls.document.document.domain.Document#getAcceptingUnits
 * <em>Accepting Units</em>}</li>
 * <li>{@link org.pprls.document.document.domain.Document#getThreadType
 * <em>Thread Type</em>}</li>
 * <li>{@link org.pprls.document.document.domain.Document#getInternalNumber
 * <em>Internal Number</em>}</li>
 * </ul>
 *
 */
@Entity
@EntityListeners(AuditingDocumentListener.class)
public class Document {
	/**
	 * Unique id for this document.
	 */
	@Id
	@GeneratedValue(generator = "system-uuid2")
	@GenericGenerator(name = "system-uuid2", strategy = "uuid2")
	protected UUID id;

	protected UUID registryRecordId;

	/**
	 * The '{@link #getCurrentStatus() <em>CurrentStatus</em>}' reference.
	 * 
	 * @see #getCurrentStatus()
	 */
	protected DocumentStatus currentStatus;

	/**
	 * The '{@link #getLastDoneDate() <em>Last Done Date</em>}' attribute.
	 * 
	 * @see #getLastDoneDate()
	 */
	protected LocalDateTime lastDoneDate = LocalDateTime.of(1970, 01, 01, 00, 00, 00);

	/**
	 * The '{@link #getLastAcceptDate() <em>Last Accept Date</em>}' attribute.
	 */
	protected LocalDateTime lastAcceptDate = LocalDateTime.of(1970, 01, 01, 00, 00, 00);

	/**
	 * The '{@link #getPhysicalLocation() <em>Physical Location</em>}'
	 * attribute.
	 * 
	 * @see #getPhysicalLocation()
	 */
	protected String physicalLocation = "";

	/**
	 * The '{@link #getAction() <em>Action</em>}' attribute.
	 * 
	 * @see #getAction()
	 */
	protected Action action = Action.NONE;

	/**
	 * The '{@link #getComments() <em>Comments</em>}' attribute.
	 * 
	 * @see #getComments()
	 */
	protected String comments = "";

	/**
	 * The '{@link #getThreadType() <em>Thread Type</em>}' attribute.
	 * 
	 * @see #getThreadType()
	 */
	protected ThreadType threadType = ThreadType.RECIPIENT;

	/**
	 * The constructor
	 */
	protected Document() {
	}

	/**
	 * The constructor
	 */
	public Document(UUID id, EntityDescriptor owner) {
		registryRecordId = id;

		currentStatus = new DocumentStatus("Autocreate : create from message queue", owner);
	}

	/**
	 * Getter for the uuid
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * Setter for the uuid
	 */
	public void setId(UUID newId) {
		id = newId;
	}

	/**
	 * Getter for the currentStatus
	 */
	public DocumentStatus getCurrentStatus() {
		return currentStatus;
	}

	/**
	 * Setter for the currentStatus
	 */
	public void setCurrentStatus(DocumentStatus newCurrentstatus) {
		currentStatus = newCurrentstatus;
	}

	/**
	 * Getter for the lastDoneDate
	 */
	public LocalDateTime getLastDoneDate() {
		return lastDoneDate;
	}

	/**
	 * Setter for the lastDoneDate
	 */
	public void setLastDoneDate(LocalDateTime newLastDoneDate) {
		lastDoneDate = newLastDoneDate;
	}

	/**
	 * Getter for the lastAcceptDate
	 */
	public LocalDateTime getLastAcceptDate() {
		return lastAcceptDate;
	}

	/**
	 * Setter for the lastAcceptDate
	 */
	public void setLastAcceptDate(LocalDateTime newLastAcceptDate) {
		lastAcceptDate = newLastAcceptDate;
	}

	/**
	 * Getter for the physicalLocation
	 */
	public String getPhysicalLocation() {
		return physicalLocation;
	}

	/**
	 * Setter for the physicalLocation
	 */
	public void setPhysicalLocation(String newPhysicalLocation) {
		physicalLocation = newPhysicalLocation;
	}

	/**
	 * Getter for the action
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * setter for the action
	 */
	public void setAction(Action newAction) {
		action = newAction;
	}

	/**
	 * Getter for the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * Setter for the comments
	 */
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * Getter for the threadType
	 */
	public ThreadType getThreadType() {
		return threadType;
	}

	/**
	 * Setter for the threadType
	 */
	public void setThreadType(ThreadType newThreadType) {
		threadType = newThreadType;
	}

	/**
	 * Move document to Cancelled state
	 */
	public void cancel(EntityDescriptor handler, String log) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Move document to Closed state
	 */
	public void close(EntityDescriptor handler, String log) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Move document to Accepted state
	 */
	public void accept(EntityDescriptor handler, String log) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Forward a document to an other entity
	 */
	public void forward(EntityDescriptor owner, EntityDescriptor handler, String log) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Did the document pass through this Entity
	 */
	public boolean hasBeenThroughThisEntityBefore(short directorateId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The allowed Operations from this state.
	 */
	public List<IncomingDocumentOperations> allowedOperationsFromThisState() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Change state
	 */
	public void changeState(IncomingDocumentOperations operation, String logMessage, EntityDescriptor handler) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Get the document owner
	 */
	public EntityDescriptor getOwner() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Is document in pending state
	 */
	public boolean isPending() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Is document in accepted state
	 */
	public boolean isAccepted() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Is document in done state
	 */
	public Boolean isDone() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Is document in cancelled state
	 */
	public boolean isCancelled() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Get state
	 */
	public DocumentState getState() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The well known toString()
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
		result.append(", threadType: ");
		result.append(threadType);
		result.append(')');
		return result.toString();
	}
}
