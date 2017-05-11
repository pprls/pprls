/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

/**
 * An implementation of the model object '<em><b>Producer</b></em>'.
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
 */
public class Producer {

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * @see #getFirstname()
	 */
	protected String firstname = "";

	/**
	 * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * @see #getLastname()
	 */
	protected String lastname = "";

	/**
	 * The cached value of the '{@link #getAfm() <em>Afm</em>}' attribute.
	 * @see #getAfm()
	 */
	protected String afm = "";

	/**
	 * The cached value of the '{@link #getFathername() <em>Fathername</em>}' attribute.
	 * @see #getFathername()
	 */
	protected String fathername = "";

	/**
	 * The cached value of the '{@link #getIdno() <em>Idno</em>}' attribute.
	 * @see #getIdno()
	 */
	protected String idno = "";

	/**
	 * The cached value of the '{@link #getPhone1() <em>Phone1</em>}' attribute.
	 * @see #getPhone1()
	 */
	protected String phone1 = "";

	/**
	 * The cached value of the '{@link #getPhone2() <em>Phone2</em>}' attribute.
	 * @see #getPhone2()
	 */
	protected String phone2 = "";

	/**
	 * The cached value of the '{@link #getMobilephone() <em>Mobilephone</em>}' attribute.
	 * @see #getMobilephone()
	 */
	protected String mobilephone = "";

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * @see #getAddress()
	 */
	protected String address = "";

	/**
	 */
	public Producer() {
		super();
	}

	/**
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 */
	public void setFirstname(String newFirstname) {
		firstname = newFirstname;
	}

	/**
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 */
	public void setLastname(String newLastname) {
		lastname = newLastname;
	}

	/**
	 */
	public String getAfm() {
		return afm;
	}

	/**
	 */
	public void setAfm(String newAfm) {
		afm = newAfm;
	}

	/**
	 */
	public String getFathername() {
		return fathername;
	}

	/**
	 */
	public void setFathername(String newFathername) {
		fathername = newFathername;
	}

	/**
	 */
	public String getIdno() {
		return idno;
	}

	/**
	 */
	public void setIdno(String newIdno) {
		idno = newIdno;
	}

	/**
	 */
	public String getPhone1() {
		return phone1;
	}

	/**
	 */
	public void setPhone1(String newPhone1) {
		phone1 = newPhone1;
	}

	/**
	 */
	public String getPhone2() {
		return phone2;
	}

	/**
	 */
	public void setPhone2(String newPhone2) {
		phone2 = newPhone2;
	}

	/**
	 */
	public String getMobilephone() {
		return mobilephone;
	}

	/**
	 */
	public void setMobilephone(String newMobilephone) {
		mobilephone = newMobilephone;
	}

	/**
	 */
	public String getAddress() {
		return address;
	}

	/**
	 */
	public void setAddress(String newAddress) {
		address = newAddress;
	}


	/**
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

} 
