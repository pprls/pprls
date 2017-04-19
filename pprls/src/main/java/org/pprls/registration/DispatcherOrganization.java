/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dispatcher Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.DispatcherOrganization#getLabel <em>Label</em>}</li>
 *   <li>{@link org.pprls.registration.DispatcherOrganization#getLatinName <em>Latin Name</em>}</li>
 *   <li>{@link org.pprls.registration.DispatcherOrganization#isActive <em>Active</em>}</li>
 *   <li>{@link org.pprls.registration.DispatcherOrganization#getHasUnits <em>Has Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public interface DispatcherOrganization extends Dispatcher {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.pprls.registration.DispatcherOrganization#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Latin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latin Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latin Name</em>' attribute.
	 * @see #setLatinName(String)
	 * @generated
	 */
	String getLatinName();

	/**
	 * Sets the value of the '{@link org.pprls.registration.DispatcherOrganization#getLatinName <em>Latin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latin Name</em>' attribute.
	 * @see #getLatinName()
	 * @generated
	 */
	void setLatinName(String value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link org.pprls.registration.DispatcherOrganization#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Units</b></em>' containment reference list.
	 * The list contents are of type {@link org.pprls.registration.DispatcherUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Units</em>' containment reference list.
	 * @generated
	 */
	List<DispatcherUnit> getHasUnits();


} // DispatcherOrganization
