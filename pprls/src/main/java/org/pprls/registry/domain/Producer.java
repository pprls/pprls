/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import org.pprls.registry.domain.Producer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Producer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registry.registry.domain.Producer#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Producer#getLastname <em>Lastname</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Producer#getAfm <em>Afm</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Producer#getFathername <em>Fathername</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Producer#getIdno <em>Idno</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Producer#getPhone1 <em>Phone1</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Producer#getPhone2 <em>Phone2</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Producer#getMobilephone <em>Mobilephone</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Producer#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Producer {
	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected static final String LASTNAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected String lastname = LASTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAfm() <em>Afm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfm()
	 * @generated
	 * @ordered
	 */
	protected static final String AFM_EDEFAULT = "";

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
	 * The default value of the '{@link #getFathername() <em>Fathername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFathername()
	 * @generated
	 * @ordered
	 */
	protected static final String FATHERNAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFathername() <em>Fathername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFathername()
	 * @generated
	 * @ordered
	 */
	protected String fathername = FATHERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdno() <em>Idno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdno()
	 * @generated
	 * @ordered
	 */
	protected static final String IDNO_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getIdno() <em>Idno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdno()
	 * @generated
	 * @ordered
	 */
	protected String idno = IDNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone1() <em>Phone1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone1()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE1_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPhone1() <em>Phone1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone1()
	 * @generated
	 * @ordered
	 */
	protected String phone1 = PHONE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone2() <em>Phone2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone2()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE2_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPhone2() <em>Phone2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone2()
	 * @generated
	 * @ordered
	 */
	protected String phone2 = PHONE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getMobilephone() <em>Mobilephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilephone()
	 * @generated
	 * @ordered
	 */
	protected static final String MOBILEPHONE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getMobilephone() <em>Mobilephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilephone()
	 * @generated
	 * @ordered
	 */
	protected String mobilephone = MOBILEPHONE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Producer() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		firstname = newFirstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastname(String newLastname) {
		lastname = newLastname;
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
	public String getFathername() {
		return fathername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFathername(String newFathername) {
		fathername = newFathername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdno() {
		return idno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdno(String newIdno) {
		idno = newIdno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone1() {
		return phone1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone1(String newPhone1) {
		phone1 = newPhone1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone2() {
		return phone2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone2(String newPhone2) {
		phone2 = newPhone2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMobilephone() {
		return mobilephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobilephone(String newMobilephone) {
		mobilephone = newMobilephone;
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
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstname: ");
		result.append(firstname);
		result.append(", lastname: ");
		result.append(lastname);
		result.append(", afm: ");
		result.append(afm);
		result.append(", fathername: ");
		result.append(fathername);
		result.append(", idno: ");
		result.append(idno);
		result.append(", phone1: ");
		result.append(phone1);
		result.append(", phone2: ");
		result.append(phone2);
		result.append(", mobilephone: ");
		result.append(mobilephone);
		result.append(", address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //ProducerImpl
