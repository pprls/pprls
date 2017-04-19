/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.Status#getHandler <em>Handler</em>}</li>
 *   <li>{@link org.pprls.registration.Status#getStatus <em>Status</em>}</li>
 *   <li>{@link org.pprls.registration.Status#getDate <em>Date</em>}</li>
 *   <li>{@link org.pprls.registration.Status#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.pprls.registration.Status#getLog <em>Log</em>}</li>
 * </ul>
 *
 * @model annotation="teneo.jpa appinfo='@Embeddable'"
 * @generated
 */
public interface Status {
	/**
	 * Returns the value of the '<em><b>Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler</em>' containment reference.
	 * @see #setHandler(EmployeeDescriptor)
	 * @model containment="true" required="true"
	 *        annotation="teneo.jpa appInfo='@Embedded\r\n@AttributeOverrides({\r\n@AttributeOverride(name=\"path\", column=@Column(name=\"registeringUnitPath\"))\r\n})'"
	 * @generated
	 */
	EmployeeDescriptor getHandler();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Status#getHandler <em>Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler</em>' containment reference.
	 * @see #getHandler()
	 * @generated
	 */
	void setHandler(EmployeeDescriptor value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"\u03a3\u03b5 \u03b1\u03bd\u03b1\u03bc\u03bf\u03bd\u03ae"</code>.
	 * The literals are from the enumeration {@link org.pprls.registration.DocumentStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.pprls.registration.DocumentStatus
	 * @see #setStatus(DocumentStatus)
	 * @model default="\u03a3\u03b5 \u03b1\u03bd\u03b1\u03bc\u03bf\u03bd\u03ae" required="true"
	 * @generated
	 */
	DocumentStatus getStatus();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Status#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.pprls.registration.DocumentStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DocumentStatus value);

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
	 * Sets the value of the '{@link org.pprls.registration.Status#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(EmployeeDescriptor)
	 * @model containment="true" required="true"
	 * @generated
	 */
	EmployeeDescriptor getOwner();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Status#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(EmployeeDescriptor value);

	/**
	 * Returns the value of the '<em><b>Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' attribute.
	 * @see #setLog(String)
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getLog();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Status#getLog <em>Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log</em>' attribute.
	 * @see #getLog()
	 * @generated
	 */
	void setLog(String value);


} // Status
