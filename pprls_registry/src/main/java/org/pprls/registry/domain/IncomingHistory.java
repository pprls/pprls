package org.pprls.registry.domain;

import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedGenerator;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * A wrapper object for the registry record.
 * this way will have registry record versions on the database.
 *  
 * @author kapostolou
 *
 */

@Document(indexName = "auditregistryrecord", type = "registryrecord")
public class RegistryHistory {

	@Id
	private UUID id;
	
	/**
	 * The object to be saved in history
	 */
	private RegistryRecord registryRecord;
	
	/**
	 * The time of modification
	 */
	private long timeStamp = System.currentTimeMillis();
	
	/**
	 * The constructor
	 */
	protected RegistryHistory() {
		TimeBasedGenerator uuidGenerator;
		uuidGenerator = Generators.timeBasedGenerator();
		id = uuidGenerator.generate();
	}
	
	public RegistryHistory(RegistryRecord registryRecord) {
		this.registryRecord = registryRecord;
	}
	
	public RegistryRecord getRegistryRecord() {
		return registryRecord;
	}

	public void setRegistryRecord(RegistryRecord registryRecord) {
		this.registryRecord = registryRecord;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
