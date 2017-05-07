/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.document.domain;

import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import org.pprls.core.EntityDescriptor;

/**
 * History of the changes on the state of the Document.
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.pprls.document.DocumentStatus.domain.State#getHandler
 * <em>Handler</em>}</li>
 * <li>{@link org.pprls.document.DocumentStatus.domain.State#getState
 * <em>State</em>}</li>
 * <li>{@link org.pprls.document.DocumentStatus.domain.State#getDate
 * <em>Date</em>}</li>
 * <li>{@link org.pprls.document.DocumentStatus.domain.State#getOwner
 * <em>Owner</em>}</li>
 * <li>{@link org.pprls.document.DocumentStatus.domain.State#getLog
 * <em>Log</em>}</li>
 * </ul>
 *
 */
@Embeddable
public class DocumentStatus {
	/**
	 * The '{@link #getState() <em>State</em>}' attribute.
	 * 
	 * @see #getState()
	 */
	protected DocumentState state = DocumentState.ASSIGN;

	/**
	 * The '{@link #getDate() <em>Date</em>}' attribute.
	 * 
	 * @see #getDate()
	 */
	protected LocalDateTime date = LocalDateTime.now();

	/**
	 * The '{@link #getOwner() <em>Owner</em>}' containment reference.
	 * 
	 * @see #getOwner()
	 */
	@Embedded
	protected EntityDescriptor owner;

	/**
	 * The '{@link #getLog() <em>Log</em>}' attribute.
	 * 
	 * @see #getLog()
	 */
	protected String log = "";

	/**
	 * The constructor
	 */
	public DocumentStatus() {
	}

	/**
	 * The constructor
	 */
	public DocumentStatus(String string, EntityDescriptor owner) {
		setLog(string);
		setOwner(owner);
	}

	/**
	 * state getter
	 */
	public DocumentState getState() {
		return state;
	}

	/**
	 * state setter
	 */
	public void setState(DocumentState newState) {
		state = newState;
	}

	/**
	 * date getter
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/**
	 * date setter
	 */
	public void setDate(LocalDateTime newDate) {
		date = newDate;
	}

	/**
	 * owner getter
	 */
	public EntityDescriptor getOwner() {
		return owner;
	}

	/**
	 * owner setter
	 */
	public void setOwner(EntityDescriptor newOwner) {
		owner = newOwner;
	}

	/**
	 * log getter
	 */
	public String getLog() {
		return log;
	}

	/**
	 * log setter
	 */
	public void setLog(String newLog) {
		log = newLog;
	}

	/**
	 * the well known toString method
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (State: ");
		result.append(state);
		result.append(", date: ");
		result.append(date);
		result.append(", log: ");
		result.append(log);
		result.append(')');
		return result.toString();
	}
}
