/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postage Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.PostageInfo#getPostageTime <em>Postage Time</em>}</li>
 *   <li>{@link org.pprls.registration.PostageInfo#getPostageMethod <em>Postage Method</em>}</li>
 *   <li>{@link org.pprls.registration.PostageInfo#getVoucherNumber <em>Voucher Number</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface PostageInfo {
	/**
	 * Returns the value of the '<em><b>Postage Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postage Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postage Time</em>' attribute.
	 * @see #setPostageTime(XMLGregorianCalendar)
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 * @generated
	 */
	XMLGregorianCalendar getPostageTime();

	/**
	 * Sets the value of the '{@link org.pprls.registration.PostageInfo#getPostageTime <em>Postage Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postage Time</em>' attribute.
	 * @see #getPostageTime()
	 * @generated
	 */
	void setPostageTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Postage Method</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.pprls.registration.PostalMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postage Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postage Method</em>' attribute.
	 * @see org.pprls.registration.PostalMethod
	 * @see #setPostageMethod(PostalMethod)
	 * @model default=""
	 * @generated
	 */
	PostalMethod getPostageMethod();

	/**
	 * Sets the value of the '{@link org.pprls.registration.PostageInfo#getPostageMethod <em>Postage Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postage Method</em>' attribute.
	 * @see org.pprls.registration.PostalMethod
	 * @see #getPostageMethod()
	 * @generated
	 */
	void setPostageMethod(PostalMethod value);

	/**
	 * Returns the value of the '<em><b>Voucher Number</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voucher Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voucher Number</em>' attribute.
	 * @see #setVoucherNumber(String)
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getVoucherNumber();

	/**
	 * Sets the value of the '{@link org.pprls.registration.PostageInfo#getVoucherNumber <em>Voucher Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voucher Number</em>' attribute.
	 * @see #getVoucherNumber()
	 * @generated
	 */
	void setVoucherNumber(String value);


} // PostageInfo
