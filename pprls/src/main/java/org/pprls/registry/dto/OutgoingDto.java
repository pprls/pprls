package org.pprls.registry.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.pprls.registry.domain.Correspondant;
import org.pprls.registry.domain.Outgoing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class OutgoingDto implements Serializable {
	private static final long serialVersionUID = -7577055101883104940L;
	
	private static ObjectMapper mapper = new ObjectMapper();

	private UUID id = null;

	private List<Short> entityIds = new ArrayList<Short>();
	
	public OutgoingDto(UUID id, List<Short> entityIds){
		this.setId(id);
		this.entityIds = entityIds;
	}

	public OutgoingDto(Outgoing outgoing) {
		this.setId(outgoing.getId());
		for(Correspondant correspondant : outgoing.getCorrespondants()){
			entityIds.add(correspondant.getEntityDescriptor().getEntityId());
		}
	}
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	
	public List<Short> getEntityIds() {
		return entityIds;
	}
	
	public String toJSON() throws JsonProcessingException{	
		String jsonString = mapper.writeValueAsString(this);
		return jsonString;
	}
}
