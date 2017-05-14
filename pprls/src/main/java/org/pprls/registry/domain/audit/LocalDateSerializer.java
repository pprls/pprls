package org.pprls.registry.domain.audit;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class LocalDateSerializer extends JsonSerializer {
	
	public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd::MM::yyyy HH:mm:ss");

    public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        gen.writeString(((LocalDateTime)value).format(FORMATTER));
    }
}