/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incoming Common Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.IncomingCommonSubject#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.pprls.registration.IncomingCommonSubject#getDirectorateId <em>Directorate Id</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface IncomingCommonSubject {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link org.pprls.registration.IncomingCommonSubject#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Directorate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directorate Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directorate Id</em>' attribute.
	 * @see #setDirectorateId(short)
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Short"
	 * @generated
	 */
	short getDirectorateId();

	/**
	 * Sets the value of the '{@link org.pprls.registration.IncomingCommonSubject#getDirectorateId <em>Directorate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directorate Id</em>' attribute.
	 * @see #getDirectorateId()
	 * @generated
	 */
	void setDirectorateId(short value);


} // IncomingCommonSubject
