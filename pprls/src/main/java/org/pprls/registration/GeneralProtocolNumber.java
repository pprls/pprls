/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Protocol Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.GeneralProtocolNumber#getYear <em>Year</em>}</li>
 *   <li>{@link org.pprls.registration.GeneralProtocolNumber#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface GeneralProtocolNumber {
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
	 * @model required="true"
	 * @generated
	 */
	Year getYear();

	/**
	 * Sets the value of the '{@link org.pprls.registration.GeneralProtocolNumber#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see org.pprls.registration.Year
	 * @see #getYear()
	 * @generated
	 */
	void setYear(Year value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(short)
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Short" required="true"
	 * @generated
	 */
	short getNumber();

	/**
	 * Sets the value of the '{@link org.pprls.registration.GeneralProtocolNumber#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(short value);


} // GeneralProtocolNumber
