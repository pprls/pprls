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
 * @model
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
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="name='relatedToOutgoing'"
	 *        annotation="teneo.jpa value='@Type(type = \"org.hibernate.type.NumericBooleanType\")'"
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
	 * @model resolveProxies="false" required="true"
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
	 * @model resolveProxies="false"
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
	 * @model required="true" afmDataType="org.eclipse.emf.ecore.xml.type.String" nameDataType="org.eclipse.emf.ecore.xml.type.String" addressDataType="org.eclipse.emf.ecore.xml.type.String" phonesDataType="org.eclipse.emf.ecore.xml.type.String" phonesMany="true" registryNumberDataType="org.eclipse.emf.ecore.xml.type.String" dateDataType="org.eclipse.emf.ecore.xml.type.Date"
	 * @generated
	 */
	Sender createSender(String afm, String name, String address, List<String> phones, String registryNumber, XMLGregorianCalendar date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean hasSenderRegistryNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	SenderRegistryNumber getSenderRegistryNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Outgoing reply();


} // Incoming
