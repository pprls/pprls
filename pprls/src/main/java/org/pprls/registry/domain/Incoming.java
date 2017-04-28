/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import java.util.List;

import org.pprls.registry.domain.SenderRegistryNumber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incoming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registry.registry.domain.Incoming#isRelatedToOutgoing <em>Related To Outgoing</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Incoming#getSender <em>Sender</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Incoming#getAgrexagrim <em>Agrexagrim</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Incoming extends RegistryRecord {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Incoming() {
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
