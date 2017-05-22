package org.pprls.registry.domain.audit;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.data.elasticsearch.core.EntityMapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

public class CustomEntityMapper implements EntityMapper {
	
	ObjectMapper mapper =  new ObjectMapper();

	public CustomEntityMapper() {
		JavaTimeModule javaTimeModule = new JavaTimeModule();
		javaTimeModule.addSerializer(Instant.class, new InstantSerializer());
		
		javaTimeModule.addDeserializer(LocalDateTime.class,	new InstantDeserializer());
		mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		mapper.registerModule(javaTimeModule);
	}

	@Override
	public String mapToString(Object object) throws IOException {
		return mapper.writeValueAsString(object);
	}

	@Override
	public <T> T mapToObject(String source, Class<T> clazz) throws IOException {
		return mapper.readValue(source, clazz);
	}
}