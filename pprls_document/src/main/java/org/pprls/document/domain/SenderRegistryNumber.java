/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.document.domain;

import java.util.Date;

import javax.persistence.Embeddable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sender Registry Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.document.document.domain.SenderRegistryNumber#getRegistryNumber <em>Registry Number</em>}</li>
 *   <li>{@link org.pprls.document.document.domain.SenderRegistryNumber#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @generated
 */
@Embeddable
public class SenderRegistryNumber {
	/**
	 * The default value of the '{@link #getRegistryNumber() <em>Registry Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRY_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistryNumber() <em>Registry Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryNumber()
	 * @generated
	 * @ordered
	 */
	protected String registryNumber = REGISTRY_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderRegistryNumber() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegistryNumber() {
		return registryNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryNumber(String newRegistryNumber) {
		registryNumber = newRegistryNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
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
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //SenderRegistryNumberImpl
