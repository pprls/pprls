/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import java.util.Date;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * An implementation of the model object '<em><b>Sender Registry Number</b></em>'.
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registry.registry.domain.SenderRegistryNumber#getRegistryNumber <em>Registry Number</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.SenderRegistryNumber#getDate <em>Date</em>}</li>
 * </ul>
 *
 */
@Embeddable
public class SenderRegistryNumber {
	/**
	 * The default value of the '{@link #getRegistryNumber() <em>Registry Number</em>}' attribute.
	 * @see #getRegistryNumber()
	 */
	protected static final String REGISTRY_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistryNumber() <em>Registry Number</em>}' attribute.
	 * @see #getRegistryNumber()
	 */
	protected String registryNumber = REGISTRY_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * @see #getDate()
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * @see #getDate()
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 */
	public SenderRegistryNumber() {
		super();
	}

	/**
	 */
	public String getRegistryNumber() {
		return registryNumber;
	}

	/**
	 */
	public void setRegistryNumber(String newRegistryNumber) {
		registryNumber = newRegistryNumber;
	}

	/**
	 */
	public Date getDate() {
		return date;
	}

	/**
	 */
	public void setDate(Date newDate) {
		date = newDate;
	}

	/**
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (registryNumber: ");
		result.append(registryNumber);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} 
