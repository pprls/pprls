/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration.impl;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.BasicInternalEList;

import org.pprls.registration.Sender;
import org.pprls.registration.SenderRegistryNumber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sender</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.impl.SenderImpl#getAfm <em>Afm</em>}</li>
 *   <li>{@link org.pprls.registration.impl.SenderImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.pprls.registration.impl.SenderImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.pprls.registration.impl.SenderImpl#getPhones <em>Phones</em>}</li>
 *   <li>{@link org.pprls.registration.impl.SenderImpl#getRegistryNumber <em>Registry Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SenderImpl implements Sender {
	/**
	 * The default value of the '{@link #getAfm() <em>Afm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfm()
	 * @generated
	 * @ordered
	 */
	protected static final String AFM_EDEFAULT = "000000000";

	/**
	 * The cached value of the '{@link #getAfm() <em>Afm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfm()
	 * @generated
	 * @ordered
	 */
	protected String afm = AFM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPhones() <em>Phones</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhones()
	 * @generated
	 * @ordered
	 */
	protected EList<String> phones;

	/**
	 * The cached value of the '{@link #getRegistryNumber() <em>Registry Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryNumber()
	 * @generated
	 * @ordered
	 */
	protected SenderRegistryNumber registryNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfm() {
		return afm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfm(String newAfm) {
		afm = newAfm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		address = newAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getPhones() {
		if (phones == null) {
			phones = new BasicInternalEList<String>(String.class);
		}
		return phones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderRegistryNumber getRegistryNumber() {
		return registryNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryNumber(SenderRegistryNumber newRegistryNumber) {
		registryNumber = newRegistryNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasRegistryNumber() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryNumber(String number, XMLGregorianCalendar date) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Afm: ");
		result.append(afm);
		result.append(", address: ");
		result.append(address);
		result.append(", name: ");
		result.append(name);
		result.append(", phones: ");
		result.append(phones);
		result.append(')');
		return result.toString();
	}

} //SenderImpl
