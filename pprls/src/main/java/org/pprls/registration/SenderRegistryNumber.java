/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sender Registry Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.SenderRegistryNumber#getRegistryNumber <em>Registry Number</em>}</li>
 *   <li>{@link org.pprls.registration.SenderRegistryNumber#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @model abstract="true"
 * @generated
 */
public interface SenderRegistryNumber {
	/**
	 * Returns the value of the '<em><b>Registry Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Number</em>' attribute.
	 * @see #setRegistryNumber(String)
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getRegistryNumber();

	/**
	 * Sets the value of the '{@link org.pprls.registration.SenderRegistryNumber#getRegistryNumber <em>Registry Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Number</em>' attribute.
	 * @see #getRegistryNumber()
	 * @generated
	 */
	void setRegistryNumber(String value);

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
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 * @generated
	 */
	XMLGregorianCalendar getDate();

	/**
	 * Sets the value of the '{@link org.pprls.registration.SenderRegistryNumber#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(XMLGregorianCalendar value);


} // SenderRegistryNumber