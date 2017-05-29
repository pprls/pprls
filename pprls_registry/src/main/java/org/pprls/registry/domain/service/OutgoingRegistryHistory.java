package org.pprls.registry.domain.service;

import org.hibernate.annotations.GenericGenerator;
import org.pprls.registry.domain.Outgoing;
import org.pprls.registry.domain.RegistryRecord;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

/**
 * A wrapper object for the registry record.
 * this way will have registry record versions on the database.
 *  
 * @author kapostolou
 *
 */

@Document(indexName = "auditregistryrecord", type = "outgoing")
public class OutgoingRegistryHistory {

	@Id
	@GeneratedValue(generator = "system-uuid2")
	@GenericGenerator(name = "system-uuid2", strategy = "uuid2")
	private UUID id;

	/**
	 * The object to be saved in history
	 */
	private Outgoing outgoing;

	/**
	 * The time of modification
	 */
	private long timeStamp = System.currentTimeMillis();

	/**
	 * The constructor
	 */
	protected OutgoingRegistryHistory() {

	}

	public OutgoingRegistryHistory(Outgoing outgoing) {
		this.outgoing = outgoing;
	}
	
	public Outgoing getOutgoing() {
		return outgoing;
	}

	public void setOutgoing(Outgoing outgoing) {
		this.outgoing = outgoing;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
