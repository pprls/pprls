package org.pprls.registry.domain;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedGenerator;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;
import java.util.UUID;

/**
 * A wrapper object for the registry record.
 * this way will have registry record versions on the database.
 *  
 * @author kapostolou
 *
 */

@Document(indexName = "auditoutgoing", type = "OutgoingHistory")
public class OutgoingHistory {

	@Id
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
	protected OutgoingHistory() {
		TimeBasedGenerator uuidGenerator;
		uuidGenerator = Generators.timeBasedGenerator();
		id = uuidGenerator.generate();
	}
	
	public OutgoingHistory(Outgoing outgoing) {
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

	public UUID getId() { return id; }

	public void setId(UUID id) { this.id = id; }
}
