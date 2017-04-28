/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Embeddable;

import org.pprls.registry.domain.RegistryNumber;

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
 * @generated
 */
@Embeddable
public class RegistryNumber {
	/**
	 * The default value of the '{@link #getRegistryNumber() <em>Registry Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryNumber()
	 * @generated
	 * @ordered
	 */
	protected static final short REGISTRY_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegistryNumber() <em>Registry Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryNumber()
	 * @generated
	 * @ordered
	 */
	protected short registryNumber = REGISTRY_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final Year YEAR_EDEFAULT = Year.YEAR_2006;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected Year year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final LocalDateTime DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected LocalDateTime date = DATE_EDEFAULT;

	/**
	 * Create registry number for current year
	 */
	protected RegistryNumber() {
	}
	
	/**
	 * Create registry number for particular year
	 * @param newDateTime date of registartion
	 * @param year 
	 */
	public RegistryNumber(Short number, LocalDateTime dateTime, Year newYear) {
		registryNumber = number;
		date = dateTime;
		year = newYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getRegistryNumber() {
		return registryNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryNumber(short newRegistryNumber) {
		registryNumber = newRegistryNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(Year newYear) {
		year = newYear == null ? YEAR_EDEFAULT : newYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(LocalDateTime newDate) {
		date = newDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

} //RegistryNumberImpl
