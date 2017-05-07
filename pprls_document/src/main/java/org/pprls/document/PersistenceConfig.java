package org.pprls.document;

import org.pprls.core.EntityDescriptor;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing(auditorAwareRef="auditorProvider")
public class PersistenceConfig {
     
    @Bean
    AuditorAware<EntityDescriptor> auditorProvider() {
        return new AuditorAwareImpl();
    }
     
}