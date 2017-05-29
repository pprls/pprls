/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import java.time.Instant;
import java.util.Date;

import javax.persistence.Embeddable;

import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

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
	 * The cached value of the '{@link #getRegistryNumber() <em>Registry Number</em>}' attribute.
	 * @see #getRegistryNumber()
	 */
	protected String registryNumber = "0";

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * @see #getDate()
	 */
	protected Instant date = Instant.now();

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
	public Instant getDate() {
		return date;
	}

	/**
	 */
	public void setDate(Instant newDate) {
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
