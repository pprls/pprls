/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain.service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.mockito.Mock;
import org.pprls.core.EntityDescriptor;
import org.pprls.core.dto.RegistryRecordDto;
import org.pprls.registry.domain.Outgoing;
import org.pprls.registry.domain.RegistryNumber;
import org.pprls.registry.domain.Year;
import org.pprls.registry.service.FileService;
import org.pprls.registry.service.MessageService;
import org.pprls.registry.service.repositories.OutgoingRepository;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.junit.Assert.fail;

/**
 * Domain service that provides new registration numbers
 */
@Service
public class RegistrationService {

	/**
	 * The constructor
	 */
	@Autowired
	public RegistrationService() {
	}

	/**
	 * Get a new registration number
	 */
	public RegistryNumber getNumberForYear(Year year) {
		Short number=0;
		Instant instant = Instant.EPOCH;
		// Get from repository number and date and year
		return new RegistryNumber(number, instant, year);
	}
	
	/**
	 * Get a reserved registration number
	 */
	public RegistryNumber getReservedRegistryNumber(LocalDateTime time) {
		Short number=0;
		Instant date = Instant.EPOCH;
		Year year=Year.YEAR_EPOCH;
		// Get from repository resurved number and date and year 
		return new RegistryNumber(number, date, year);
	}
} 
