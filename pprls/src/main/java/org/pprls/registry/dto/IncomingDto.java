package org.pprls.registry.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.pprls.registry.domain.Correspondent;
import org.pprls.registry.domain.Incoming;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class IncomingDto {
	private static ObjectMapper mapper = new ObjectMapper();

	private UUID id = null;

	private List<Short> entityIds = new ArrayList<Short>();
	
	public IncomingDto(UUID id, List<Short> entityIds){
		this.setId(id);
		this.entityIds = entityIds;
	}

	public IncomingDto(Incoming incoming) {
		this.setId(incoming.getId());
		for(Correspondent correspondant : incoming.getCorrespondents()){
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
