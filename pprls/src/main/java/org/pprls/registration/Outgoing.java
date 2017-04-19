/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outgoing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.Outgoing#getReissued <em>Reissued</em>}</li>
 *   <li>{@link org.pprls.registration.Outgoing#getRelatedIncoming <em>Related Incoming</em>}</li>
 *   <li>{@link org.pprls.registration.Outgoing#getNumberOfRepeats <em>Number Of Repeats</em>}</li>
 *   <li>{@link org.pprls.registration.Outgoing#getEditor <em>Editor</em>}</li>
 * </ul>
 *
 * @generated
 */
public interface Outgoing extends RegistryRecord {
	/**
	 * Returns the value of the '<em><b>Reissued</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reissued</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reissued</em>' reference.
	 * @see #setReissued(Outgoing)
	 * @generated
	 */
	Outgoing getReissued();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Outgoing#getReissued <em>Reissued</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reissued</em>' reference.
	 * @see #getReissued()
	 * @generated
	 */
	void setReissued(Outgoing value);

	/**
	 * Returns the value of the '<em><b>Related Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Incoming</em>' reference.
	 * @see #setRelatedIncoming(Incoming)
	 * @generated
	 */
	Incoming getRelatedIncoming();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Outgoing#getRelatedIncoming <em>Related Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Incoming</em>' reference.
	 * @see #getRelatedIncoming()
	 * @generated
	 */
	void setRelatedIncoming(Incoming value);

	/**
	 * Returns the value of the '<em><b>Number Of Repeats</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Repeats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Repeats</em>' attribute.
	 * @see #setNumberOfRepeats(int)
	 * @generated
	 */
	int getNumberOfRepeats();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Outgoing#getNumberOfRepeats <em>Number Of Repeats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Repeats</em>' attribute.
	 * @see #getNumberOfRepeats()
	 * @generated
	 */
	void setNumberOfRepeats(int value);

	/**
	 * Returns the value of the '<em><b>Editor</b></em>' reference list.
	 * The list contents are of type {@link org.pprls.registration.EmployeeDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor</em>' reference list.
	 * @generated
	 */
	List<EmployeeDescriptor> getEditor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmployeeDescriptor getBasicEditor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmployeeDescriptor getOwner();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocumentStatus getState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	boolean isSigned();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void close(EmployeeDescriptor handler, String log);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Outgoing reissue();


} // Outgoing
