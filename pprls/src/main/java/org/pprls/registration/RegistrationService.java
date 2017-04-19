/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @model
 * @generated
 */
public interface RegistrationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" yearRequired="true"
	 * @generated
	 */
	RegistryNumber getNumberForYear(Year year);


} // RegistrationService
