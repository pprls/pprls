/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import org.pprls.core.EntityDescriptor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.time.Instant;


/**
 * Status of RegistryRecord.Actived / Cancelled etc.
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.RegistryStatus.DocumentStateHistory.domain.Status#getHandler <em>Handler</em>}</li>
 *   <li>{@link org.pprls.RegistryStatus.DocumentStateHistory.domain.Status#getStatus <em>Status</em>}</li>
 *   <li>{@link org.pprls.RegistryStatus.DocumentStateHistory.domain.Status#getDate <em>Date</em>}</li>
 *   <li>{@link org.pprls.RegistryStatus.DocumentStateHistory.domain.Status#getLog <em>Log</em>}</li>
 * </ul>
 *
 */
@Embeddable
public class RegistryStatus {
	/**
	 * The  '{@link #getHandler() <em>Handler</em>}' reference.
	 * @see #getHandler()
	 */
	@Embedded
	protected EntityDescriptor handler;

	/**
	 * The '{@link #getState() <em>State</em>}' attribute.
	 * @see #getState()
	 */
	protected RegistryState state = RegistryState.ACTIVE;

	/**
	 * The '{@link #getDate() <em>Date</em>}' attribute.
	 * @see #getDate()
	 */
	protected Instant date = Instant.now();

	/**
	 * The '{@link #getLog() <em>Log</em>}' attribute.
	 * @see #getLog()
	 */
	protected String log = "";

	/**
	 * The constructor
	 */
	protected  RegistryStatus(){
		
	}
	/**
	 * The constructor
	 */
	public RegistryStatus(EntityDescriptor newHandler) {
		handler = newHandler;
	}

	/**
	 * Handler getter
	 */
	public EntityDescriptor getHandler() {
		return handler;
	}

	/**
	 * Handler setter
	 */
	public void setHandler(EntityDescriptor newHandler) {
		handler = newHandler;
	}

	/**
	 * state getter
	 */
	public RegistryState getState() {
		return state;
	}

	/**
	 * state setter
	 */
	public void setState(RegistryState newStatus) {
		state = newStatus;
	}

	/**
	 * date getter
	 */
	public Instant getDate() {
		return date;
	}

	/**
	 * date setter
	 */
	public void setDate(Instant newDate) {
		date = newDate;
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
		result.append(" (status: ");
		result.append(state);
		result.append(", date: ");
		result.append(date);
		result.append(", log: ");
		result.append(log);
		result.append(')');
		return result.toString();
	}

} 
