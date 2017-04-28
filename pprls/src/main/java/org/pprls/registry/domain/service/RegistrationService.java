/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain.service;

import java.time.LocalDateTime;

import org.pprls.registry.domain.Builder;
import org.pprls.registry.domain.RegistryNumber;
import org.pprls.registry.domain.Year;
import org.pprls.registry.domain.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		LocalDateTime localdatetime=null;
		// Get from repository number and date and year
		return new RegistryNumber(number, localdatetime, year);
	}
	
	/**
	 * Get a reserved registration number
	 */
	public RegistryNumber getReservedRegistryNumber(LocalDateTime time) {
		Short number=0;
		LocalDateTime localdatetime=null;
		Year year=Year.YEAR_EPOCH;
		// Get from repository resurved number and date and year 
		return new RegistryNumber(number, localdatetime, year);
	}

} 
