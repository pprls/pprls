/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.Recipient#getVatId <em>Vat Id</em>}</li>
 *   <li>{@link org.pprls.registration.Recipient#getName <em>Name</em>}</li>
 *   <li>{@link org.pprls.registration.Recipient#getAddress <em>Address</em>}</li>
 *   <li>{@link org.pprls.registration.Recipient#getComments <em>Comments</em>}</li>
 *   <li>{@link org.pprls.registration.Recipient#getInternalUnitId <em>Internal Unit Id</em>}</li>
 *   <li>{@link org.pprls.registration.Recipient#getPostageinfo <em>Postageinfo</em>}</li>
 *   <li>{@link org.pprls.registration.Recipient#getRecipientType <em>Recipient Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public interface Recipient {
	/**
	 * Returns the value of the '<em><b>Vat Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vat Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vat Id</em>' attribute.
	 * @see #setVatId(String)
	 * @generated
	 */
	String getVatId();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Recipient#getVatId <em>Vat Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vat Id</em>' attribute.
	 * @see #getVatId()
	 * @generated
	 */
	void setVatId(String value);

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
	 * Sets the value of the '{@link org.pprls.registration.Recipient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * Sets the value of the '{@link org.pprls.registration.Recipient#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Recipient#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Internal Unit Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Unit Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Unit Id</em>' attribute.
	 * @see #setInternalUnitId(short)
	 * @generated
	 */
	short getInternalUnitId();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Recipient#getInternalUnitId <em>Internal Unit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Unit Id</em>' attribute.
	 * @see #getInternalUnitId()
	 * @generated
	 */
	void setInternalUnitId(short value);

	/**
	 * Returns the value of the '<em><b>Postageinfo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postageinfo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postageinfo</em>' reference.
	 * @see #setPostageinfo(PostageInfo)
	 * @generated
	 */
	PostageInfo getPostageinfo();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Recipient#getPostageinfo <em>Postageinfo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postageinfo</em>' reference.
	 * @see #getPostageinfo()
	 * @generated
	 */
	void setPostageinfo(PostageInfo value);

	/**
	 * Returns the value of the '<em><b>Recipient Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.pprls.registration.RecipientType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient Type</em>' attribute.
	 * @see org.pprls.registration.RecipientType
	 * @see #setRecipientType(RecipientType)
	 * @generated
	 */
	RecipientType getRecipientType();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Recipient#getRecipientType <em>Recipient Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient Type</em>' attribute.
	 * @see org.pprls.registration.RecipientType
	 * @see #getRecipientType()
	 * @generated
	 */
	void setRecipientType(RecipientType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PostageInfo createPostageInfo(XMLGregorianCalendar postageDate, PostalMethod postalMethod, String voucherNumber);


} // Recipient
