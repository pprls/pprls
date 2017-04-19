/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sender</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.Sender#getAfm <em>Afm</em>}</li>
 *   <li>{@link org.pprls.registration.Sender#getAddress <em>Address</em>}</li>
 *   <li>{@link org.pprls.registration.Sender#getName <em>Name</em>}</li>
 *   <li>{@link org.pprls.registration.Sender#getPhones <em>Phones</em>}</li>
 *   <li>{@link org.pprls.registration.Sender#getRegistryNumber <em>Registry Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public interface Sender {
	/**
	 * Returns the value of the '<em><b>Afm</b></em>' attribute.
	 * The default value is <code>"000000000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Afm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Afm</em>' attribute.
	 * @see #setAfm(String)
	 * @generated
	 */
	String getAfm();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Sender#getAfm <em>Afm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Afm</em>' attribute.
	 * @see #getAfm()
	 * @generated
	 */
	void setAfm(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Sender#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Sender#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Phones</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phones</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phones</em>' attribute list.
	 * @generated
	 */
	List<String> getPhones();

	/**
	 * Returns the value of the '<em><b>Registry Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Number</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Number</em>' reference.
	 * @see #setRegistryNumber(SenderRegistryNumber)
	 * @generated
	 */
	SenderRegistryNumber getRegistryNumber();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Sender#getRegistryNumber <em>Registry Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Number</em>' reference.
	 * @see #getRegistryNumber()
	 * @generated
	 */
	void setRegistryNumber(SenderRegistryNumber value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	boolean hasRegistryNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setRegistryNumber(String number, XMLGregorianCalendar date);


} // Sender
