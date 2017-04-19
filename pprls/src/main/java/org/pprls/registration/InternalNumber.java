/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.InternalNumber#getNumber <em>Number</em>}</li>
 *   <li>{@link org.pprls.registration.InternalNumber#getDirectorateId <em>Directorate Id</em>}</li>
 *   <li>{@link org.pprls.registration.InternalNumber#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public interface InternalNumber {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(long)
	 * @generated
	 */
	long getNumber();

	/**
	 * Sets the value of the '{@link org.pprls.registration.InternalNumber#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(long value);

	/**
	 * Returns the value of the '<em><b>Directorate Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directorate Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directorate Id</em>' attribute.
	 * @see #setDirectorateId(short)
	 * @generated
	 */
	short getDirectorateId();

	/**
	 * Sets the value of the '{@link org.pprls.registration.InternalNumber#getDirectorateId <em>Directorate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directorate Id</em>' attribute.
	 * @see #getDirectorateId()
	 * @generated
	 */
	void setDirectorateId(short value);

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
	 * @generated
	 */
	Year getYear();

	/**
	 * Sets the value of the '{@link org.pprls.registration.InternalNumber#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see org.pprls.registration.Year
	 * @see #getYear()
	 * @generated
	 */
	void setYear(Year value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	boolean hasBeenSet();


} // InternalNumber
