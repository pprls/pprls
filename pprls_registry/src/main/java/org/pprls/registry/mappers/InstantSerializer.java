package org.pprls.registry.mappers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstantSerializer extends JsonSerializer {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        String tmp = ((LocalDateTime) value).format(FORMATTER);

        gen.writeString(((LocalDateTime) value).format(FORMATTER));
    }

}
