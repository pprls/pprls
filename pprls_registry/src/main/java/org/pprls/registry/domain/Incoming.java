/*
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedGenerator;
import org.pprls.core.EntityDescriptor;
import org.pprls.core.Nobody;

import javax.persistence.Entity;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * An implementation of the model object '<em><b>Incoming</b></em>'.
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registry.domain.Incoming#isRelatedToOutgoing <em>Related To Outgoing</em>}</li>
 * </ul>
 *
 */
@Entity
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
		TimeBasedGenerator uuidGenerator;
		uuidGenerator = Generators.timeBasedGenerator();
		id = uuidGenerator.generate();
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

	public Set<EntityDescriptor> getEntityDescriptors(){
		return correspondents.stream()
				.filter(correspondent ->!( correspondent.getEntityDescriptor() instanceof Nobody))
				.map(Correspondent::getEntityDescriptor)
				.collect(Collectors.toSet());
	}

} 
