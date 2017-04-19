/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incoming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.Incoming#isRelatedToOutgoing <em>Related To Outgoing</em>}</li>
 *   <li>{@link org.pprls.registration.Incoming#getSender <em>Sender</em>}</li>
 *   <li>{@link org.pprls.registration.Incoming#getAgrexagrim <em>Agrexagrim</em>}</li>
 * </ul>
 *
 * @generated
 */
public interface Incoming extends RegistryRecord {
	/**
	 * Returns the value of the '<em><b>Related To Outgoing</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related To Outgoing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related To Outgoing</em>' attribute.
	 * @see #setRelatedToOutgoing(boolean)
	 * @generated
	 */
	boolean isRelatedToOutgoing();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Incoming#isRelatedToOutgoing <em>Related To Outgoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related To Outgoing</em>' attribute.
	 * @see #isRelatedToOutgoing()
	 * @generated
	 */
	void setRelatedToOutgoing(boolean value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference list.
	 * The list contents are of type {@link org.pprls.registration.Sender}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference list.
	 * @generated
	 */
	List<Sender> getSender();

	/**
	 * Returns the value of the '<em><b>Agrexagrim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agrexagrim</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agrexagrim</em>' reference.
	 * @see #setAgrexagrim(AgrexAgrim)
	 * @generated
	 */
	AgrexAgrim getAgrexagrim();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Incoming#getAgrexagrim <em>Agrexagrim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agrexagrim</em>' reference.
	 * @see #getAgrexagrim()
	 * @generated
	 */
	void setAgrexagrim(AgrexAgrim value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Sender createSender(String afm, String name, String address, List<String> phones, String registryNumber, XMLGregorianCalendar date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	boolean hasSenderRegistryNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SenderRegistryNumber getSenderRegistryNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Outgoing reply();


} // Incoming
