/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.application.services.services;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @model
 * @generated
 */
public interface FileService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" fromDataType="org.eclipse.emf.ecore.xml.type.String" toDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String upload(String from, String to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model filepathDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	void remove(String filepath);


} // FileService
