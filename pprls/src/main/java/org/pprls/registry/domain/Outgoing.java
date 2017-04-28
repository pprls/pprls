/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * 
 * Outgoing registry record
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registry.registry.domain.Outgoing#getReissued <em>Reissued</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Outgoing#getRelatedIncoming <em>Related Incoming</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Outgoing#getNumberOfRepeats <em>Number Of Repeats</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Outgoing#getEditor <em>Editor</em>}</li>
 * </ul>
 *
 */
@Entity
public class Outgoing extends RegistryRecord{
	
	/**
	 * The cached value of the '{@link #getReissued() <em>Reissued</em>}' reference.
	 * @see #getReissued()
	 */
	@OneToOne
	protected Outgoing reissued;

	/**
	 * The cached value of the '{@link #getRelatedIncoming() <em>Related Incoming</em>}' reference.
	 * @see #getRelatedIncoming()
	 */
	//protected Incoming relatedIncoming;

	/**
	 * The default value of the '{@link #getNumberOfRepeats() <em>Number Of Repeats</em>}' attribute.
	 * @see #getNumberOfRepeats()
	 */
	protected static final int NUMBER_OF_REPEATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRepeats() <em>Number Of Repeats</em>}' attribute.
	 * @see #getNumberOfRepeats()
	 */
	protected int numberOfRepeats = NUMBER_OF_REPEATS_EDEFAULT;

	/**
	 * The '{@link #getEditor() <em>Editor</em>}' reference list.
	 */
	@ElementCollection
	protected List<EntityDescriptor> editor;
	
	/**
	 * The '{@link #getIssuer() <em>Issuer</em>}' reference list.
	 */
	@ElementCollection
	protected List<EntityDescriptor> issuer;


	/**
	 */
	protected Outgoing() {
	}

	/**
	 */
	public Outgoing getReissued() {
		return reissued;
	}

	/**
	 */
	public void setReissued(Outgoing newReissued) {
		reissued = newReissued;
	}

//	/**
//	 * The incoming that this out going responds
//	 */
//	public Incoming getRelatedIncoming() {
//		return relatedIncoming;
//	}
//
//	/**
//	 * Connect to incoming if this an answer 
//	 */
//	public void setRelatedIncoming(Incoming newRelatedIncoming) {
//		relatedIncoming = newRelatedIncoming;
//	}

	/**
	 * Getter the number of reissuing 
	 */
	public int getNumberOfRepeats() {
		return numberOfRepeats;
	}

	/**
	 * Setter the number of reissuing 
	 */
	public void setNumberOfRepeats(int newNumberOfRepeats) {
		numberOfRepeats = newNumberOfRepeats;
	}
	
	/**
	 * Get a list of the entities who issue the outgoing.
	 */
	public List<EntityDescriptor> getIssuser() {
		return issuer;
	}

	/**
	 * Get a list of the people who edit the outgoing.
	 */
	public List<EntityDescriptor> getEditor() {
		return editor;
	}

	/**
	 * how originally created the outgoing
	 */
	public EntityDescriptor getBasicEditor() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Getter for the owner of the outgoing
	 */
	public EntityDescriptor getOwner() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Getter for the state of the outgoing
	 */
	public DocumentStatus getState() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * True if the outgoing is digitally signed
	 */
	public boolean isSigned() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Set the state of the outgoing record to closed 
	 */
	public void close(EntityDescriptor handler, String log) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Reissue the outgoing
	 */
	public Outgoing reissue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 */
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append("Outgoing registry number (");
     	result.append("");
		result.append(')');
		return result.toString();
	}

	public void setFirstName(String string) {
		// TODO Auto-generated method stub
		
	}

	public Outgoing reissue(List<EntityDescriptor> issuers) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addEditors(List<EntityDescriptor> editors) {
		editor = editors;
		
	}


	public void addIssuers(List<EntityDescriptor> issuers) {
		issuer = issuers;
		
	}


	public void cancel() {
		// TODO Auto-generated method stub
		
	}


	public void addCorrespondants(List<Correspondent> newCorrespondants) {
		correspondants.addAll(newCorrespondants);
	}
	
	public void setCorrespondants(List<Correspondent> newCorrespondants) {
		correspondants = newCorrespondants;
	}

} 
