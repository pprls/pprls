/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain.service;

import org.pprls.registry.domain.RegistryNumber;
import org.pprls.registry.domain.Year;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;

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
