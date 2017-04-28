package org.pprls.document.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RegistryRecordDto implements Serializable {
	private static final long serialVersionUID = -7577055101883104940L;
	
	private static ObjectMapper mapper = new ObjectMapper();

	private UUID id = null;

	private List<Short> entityIds = new ArrayList<Short>();
	
	@JsonCreator
	public RegistryRecordDto(@JsonProperty("id") UUID newId, 
							 @JsonProperty("entityIds") List<Short> newEntityIds) {
		id = newId;
		entityIds = newEntityIds;
		
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
	
	
//	@Test
//	public void whenDeserializingUsingJsonCreator_thenCorrect()
//	  throws IOException {
//	  
//	    String json = "{\"id\":1,\"theName\":\"My bean\"}";
//	 
//	    BeanWithCreator bean = new ObjectMapper()
//	      .readerFor(BeanWithCreator.class)
//	      .readValue(json);
//	    assertEquals("My bean", bean.name);
//	}
	
	
}
