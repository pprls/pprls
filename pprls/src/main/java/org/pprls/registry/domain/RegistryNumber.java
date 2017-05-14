/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import java.time.LocalDateTime;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * The human oriented unique number
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registry.registry.domain.RegistryNumber#getRegistryNumber <em>Registry Number</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.RegistryNumber#getYear <em>Year</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.RegistryNumber#getDate <em>Date</em>}</li>
 * </ul>
 *
 */
@Embeddable
public class RegistryNumber {
	/**
	 * The default value of the '{@link #getRegistryNumber() <em>Registry Number</em>}' attribute.
	 * @see #getRegistryNumber()
	 */
	protected static final short REGISTRY_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegistryNumber() <em>Registry Number</em>}' attribute.
	 * @see #getRegistryNumber()
	 */
	protected short registryNumber = REGISTRY_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * @see #getYear()
	 */
	protected static final Year YEAR_EDEFAULT = Year.YEAR_2006;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * @see #getYear()
	 */
	protected Year year = YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * @see #getDate()
	 */
	protected LocalDateTime date = LocalDateTime.now();

	/**
	 * Create registry number for current year
	 */
	protected RegistryNumber() {
	}
	
	/**
	 * Create registry number for particular year
	 * @param newDateTime date of registration
	 * @param year 
	 */
	public RegistryNumber(Short number, LocalDateTime dateTime, Year newYear) {
		registryNumber = number;
		date = dateTime;
		year = newYear;
	}

	/**
	 */
	public short getRegistryNumber() {
		return registryNumber;
	}

	/**
	 */
	public void setRegistryNumber(short newRegistryNumber) {
		registryNumber = newRegistryNumber;
	}

	/**
	 */
	public Year getYear() {
		return year;
	}

	/**
	 */
	public void setYear(Year newYear) {
		year = newYear;
	}

	/**
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/**
	 */
	public void setDate(LocalDateTime newDate) {
		date = newDate;
	}

	/**
	 */
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (registryNumber: ");
		result.append(registryNumber);
		result.append(", year: ");
		result.append(year);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} 
