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

import org.pprls.registry.domain.Outgoing;
import org.pprls.registry.domain.RegistryNumber;
import org.pprls.registry.domain.Year;
import org.pprls.registry.service.FileService;
import org.pprls.registry.service.repositories.OutgoingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Domain service that provides new registration numbers
 */
@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationService registrationService;
	@Autowired
	private FileService fileService;
	@Autowired
	private OutgoingRepository registryRepository;
	
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
	
	@Transactional
	public void createOutgoing(Outgoing outgoing){
		
		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);

		outgoing.setRegistryNumber(number);
		List<String> filenames = new ArrayList<>();

		// from: location on disk to read from
		// to: location to write to
		for (String filename : filenames) {
			outgoing.getFilepaths().add(fileService.upload(filename, outgoing.mapToFilepath(filename)));
		}
		
		registryRepository.save(outgoing);	
	}
} 
