/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import java.util.List;

import org.pprls.registry.domain.SenderRegistryNumber;

/**
 * An implementation of the model object '<em><b>Incoming</b></em>'.
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registry.registry.domain.Incoming#isRelatedToOutgoing <em>Related To Outgoing</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Incoming#getSender <em>Sender</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Incoming#getAgrexagrim <em>Agrexagrim</em>}</li>
 * </ul>
 *
 */
public class Incoming extends RegistryRecord {
	/**
	 * The default value of the '{@link #isRelatedToOutgoing() <em>Related To Outgoing</em>}' attribute.
	 * @see #isRelatedToOutgoing()
	 */
	protected static final boolean RELATED_TO_OUTGOING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRelatedToOutgoing() <em>Related To Outgoing</em>}' attribute.
	 * @see #isRelatedToOutgoing()
	 */
	protected boolean relatedToOutgoing = RELATED_TO_OUTGOING_EDEFAULT;
	
	/**
	 */
	public Incoming() {
		super();
	}

	/**
	 */
	public boolean isRelatedToOutgoing() {
		return relatedToOutgoing;
	}

	/**
	 */
	public void setRelatedToOutgoing(boolean newRelatedToOutgoing) {
		relatedToOutgoing = newRelatedToOutgoing;
	}

	/**
	 */
	public boolean hasSenderRegistryNumber() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 */
	public SenderRegistryNumber getSenderRegistryNumber() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 */
	public Outgoing reply() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 */
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (relatedToOutgoing: ");
		result.append(relatedToOutgoing);
		result.append(')');
		return result.toString();
	}

} 
