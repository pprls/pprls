/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.application.services.services;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public interface ServicesFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicesFactory INSTANCE = org.pprls.application.services.services.impl.ServicesFactoryImpl.eINSTANCE;

	/**
	 * Returns a new object of class '<em>File Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Service</em>'.
	 * @generated
	 */
	FileService createFileService();

} //ServicesFactory
