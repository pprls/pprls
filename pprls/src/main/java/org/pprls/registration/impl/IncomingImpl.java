/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration.impl;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;

import org.pprls.registration.AgrexAgrim;
import org.pprls.registration.Incoming;
import org.pprls.registration.Outgoing;
import org.pprls.registration.Sender;
import org.pprls.registration.SenderRegistryNumber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incoming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.impl.IncomingImpl#isRelatedToOutgoing <em>Related To Outgoing</em>}</li>
 *   <li>{@link org.pprls.registration.impl.IncomingImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.pprls.registration.impl.IncomingImpl#getAgrexagrim <em>Agrexagrim</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncomingImpl extends RegistryRecordImpl implements Incoming {
	/**
	 * The default value of the '{@link #isRelatedToOutgoing() <em>Related To Outgoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelatedToOutgoing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELATED_TO_OUTGOING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRelatedToOutgoing() <em>Related To Outgoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelatedToOutgoing()
	 * @generated
	 * @ordered
	 */
	protected boolean relatedToOutgoing = RELATED_TO_OUTGOING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected EList<Sender> sender;

	/**
	 * The cached value of the '{@link #getAgrexagrim() <em>Agrexagrim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgrexagrim()
	 * @generated
	 * @ordered
	 */
	protected AgrexAgrim agrexagrim;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRelatedToOutgoing() {
		return relatedToOutgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedToOutgoing(boolean newRelatedToOutgoing) {
		relatedToOutgoing = newRelatedToOutgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Sender> getSender() {
		if (sender == null) {
			sender = new BasicInternalEList<Sender>(Sender.class);
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgrexAgrim getAgrexagrim() {
		if (agrexagrim != null && ((EObject)agrexagrim).eIsProxy()) {
			InternalEObject oldAgrexagrim = (InternalEObject)agrexagrim;
			agrexagrim = (AgrexAgrim)eResolveProxy(oldAgrexagrim);
			if (agrexagrim != oldAgrexagrim) {
			}
		}
		return agrexagrim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgrexAgrim basicGetAgrexagrim() {
		return agrexagrim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgrexagrim(AgrexAgrim newAgrexagrim) {
		agrexagrim = newAgrexagrim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sender createSender(String afm, String name, String address, List<String> phones, String registryNumber, XMLGregorianCalendar date) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasSenderRegistryNumber() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderRegistryNumber getSenderRegistryNumber() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outgoing reply() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (relatedToOutgoing: ");
		result.append(relatedToOutgoing);
		result.append(')');
		return result.toString();
	}

} //IncomingImpl
