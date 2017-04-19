/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.RegistryNumber#getRegistryNumber <em>Registry Number</em>}</li>
 *   <li>{@link org.pprls.registration.RegistryNumber#getYear <em>Year</em>}</li>
 *   <li>{@link org.pprls.registration.RegistryNumber#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface RegistryNumber {
	/**
	 * Returns the value of the '<em><b>Registry Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Number</em>' attribute.
	 * @see #setRegistryNumber(short)
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Short"
	 * @generated
	 */
	short getRegistryNumber();

	/**
	 * Sets the value of the '{@link org.pprls.registration.RegistryNumber#getRegistryNumber <em>Registry Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Number</em>' attribute.
	 * @see #getRegistryNumber()
	 * @generated
	 */
	void setRegistryNumber(short value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * The literals are from the enumeration {@link org.pprls.registration.Year}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see org.pprls.registration.Year
	 * @see #setYear(Year)
	 * @model
	 * @generated
	 */
	Year getYear();

	/**
	 * Sets the value of the '{@link org.pprls.registration.RegistryNumber#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see org.pprls.registration.Year
	 * @see #getYear()
	 * @generated
	 */
	void setYear(Year value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(XMLGregorianCalendar)
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 * @generated
	 */
	XMLGregorianCalendar getDate();

	/**
	 * Sets the value of the '{@link org.pprls.registration.RegistryNumber#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(XMLGregorianCalendar value);


} // RegistryNumber
