package org.pprls.registry.mappers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.data.elasticsearch.core.EntityMapper;

import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Created by npetalidis on 19/5/2017.
 */
public class DefaultEntityMapper implements EntityMapper {
    private ObjectMapper mapper;

    public DefaultEntityMapper() {
        mapper = new ObjectMapper();
//        mapper.findAndRegisterModules();
//        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
//        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        JavaTimeModule javaTimeModule = new JavaTimeModule();
        javaTimeModule.addSerializer(LocalDateTime.class, new InstantSerializer());


        javaTimeModule.addDeserializer(LocalDateTime.class, new InstantDeserializer());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.registerModule(javaTimeModule);
    }

    @Override
    public String mapToString(Object object) throws IOException {
        return mapper.writeValueAsString(object);
    }

    @Override
    public <T> T mapToObject(String source, Class<T> clazz) throws IOException {
        return mapper.readValue(source,clazz);
    }
}
