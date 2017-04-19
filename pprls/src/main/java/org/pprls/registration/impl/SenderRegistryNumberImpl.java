/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.pprls.registration.SenderRegistryNumber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sender Registry Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.impl.SenderRegistryNumberImpl#getRegistryNumber <em>Registry Number</em>}</li>
 *   <li>{@link org.pprls.registration.impl.SenderRegistryNumberImpl#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SenderRegistryNumberImpl implements SenderRegistryNumber {
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
	protected static final XMLGregorianCalendar DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar date = DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderRegistryNumberImpl() {
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
	public XMLGregorianCalendar getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(XMLGregorianCalendar newDate) {
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
