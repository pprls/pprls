package org.pprls.core.dto;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

import org.pprls.core.EntityDescriptor;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RegistryRecordDto implements Serializable {
	private static final long serialVersionUID = -7577055101883104940L;
	
	private static ObjectMapper mapper = new ObjectMapper();

	private UUID id = null;

	private Set<EntityDescriptor> entityDescriptors = new TreeSet<EntityDescriptor>();
	
	@JsonCreator
	public RegistryRecordDto(@JsonProperty("id") UUID newId, 
							 @JsonProperty("entityEntityDescriptors") Set<EntityDescriptor> set) {
		id = newId;
		entityDescriptors = set;
		
	}
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	
	public Set<EntityDescriptor> getEntityDescriptors() {
		return entityDescriptors;
	}
	
	public String toJSON() throws JsonProcessingException{	
		return  mapper.writeValueAsString(this);
	}
}
