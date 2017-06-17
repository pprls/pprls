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

@Document(indexName = "auditincoming", type = "IncomingHistory")
public class IncomingHistory {

	@Id
	private UUID id;

	/**
	 * The object to be saved in history
	 */
	private Incoming incoming;

	/**
	 * The time of modification
	 */
	private long timeStamp = System.currentTimeMillis();

	/**
	 * The constructor
	 */
	protected IncomingHistory() {
		TimeBasedGenerator uuidGenerator;
		uuidGenerator = Generators.timeBasedGenerator();
		id = uuidGenerator.generate();
	}

	public IncomingHistory(RegistryRecord registryRecord) {
		this.incoming = incoming;
	}
	
	public RegistryRecord getIncoming() {
		return incoming;
	}

	public void setIncoming(Incoming incoming) {
		this.incoming = incoming;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
