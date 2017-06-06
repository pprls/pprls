/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedGenerator;
import org.pprls.core.EntityDescriptor;
import org.pprls.core.Nobody;
import org.pprls.registry.domain.audit.AuditingOutgoingListener;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * 
 * Outgoing registry record
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registry.domain.Outgoing#getReissued <em>Reissued</em>}</li>
 *   <li>{@link org.pprls.registry.domain.Outgoing#getNumberOfRepeats <em>Number Of Repeats</em>}</li>
 *   <li>{@link org.pprls.registry.domain.Outgoing#getEditor <em>Editor</em>}</li>
 * </ul>
 *
 */
@Entity
@EntityListeners(AuditingOutgoingListener.class)
public class Outgoing extends RegistryRecord{

	/**
	 * The cached value of the '{@link #getReissued() <em>Reissued</em>}' reference.
	 * @see #getReissued()
	 */
	protected UUID reissued;

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
	 * The '{@link #getEditor() <em>Editor</em>}' reference set.
	 */
	@ElementCollection
	protected Set<EntityDescriptor> editor;
	
	/**
	 * The '{@link #getIssuer() <em>Issuer</em>}' reference set.
	 */
	@ElementCollection
	protected Set<EntityDescriptor> issuer;

	/**
	 */
	protected Outgoing() {
		TimeBasedGenerator uuidGenerator;
		uuidGenerator = Generators.timeBasedGenerator();
		id = uuidGenerator.generate();
	}

	/**
	 */
	public UUID getReissued() {
		return reissued;
	}

	/**
	 */
	public void setReissued(UUID newReissued) {
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
	public Set<EntityDescriptor> getIssuer() {
		return issuer;
	}

	/**
	 * Get a list of the people who edit the outgoing.
	 */
	public Set<EntityDescriptor> getEditor() {
		return editor;
	}

	/**
	 * Reissue the outgoing
	 */
	public Outgoing reissue(EntityDescriptor handler) {
		Outgoing outgoing = Builder.INSTANCE.createOutgoing(this.getIssuer(), handler);
		outgoing.setCorrespondents(this.getCorrespondents());
		outgoing.setAda(this.getAda());
		outgoing.setAttachedFilesDescription(this.getAttachedFilesDescription());
		outgoing.setClassification(this.getClassification());
		outgoing.setSubject(this.getSubject());
		outgoing.setComments(this.getComments());
		outgoing.setRegistryNumber(this.getRegistryNumber());
		outgoing.setTag(this.getTag());
		outgoing.setType(this.getType());
		this.setReissued(outgoing.getId());
		outgoing.setNumberOfRepeats(1);
		return outgoing;
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


	public Outgoing reissue(Set<EntityDescriptor> issuers) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addEditors(Set<EntityDescriptor> editors) {
		editor = editors;
		
	}


	public void addIssuers(Set<EntityDescriptor> issuers) {
		issuer = issuers;
		
	}

	public void cancel() {
		// TODO Auto-generated method stub
		
	}


	public void revertTo(Outgoing outgoing) {
		this.setCorrespondents(outgoing.getCorrespondents());
		this.editor = outgoing.getEditor();
		this.issuer = outgoing.getIssuer();
		this.numberOfRepeats = outgoing.getNumberOfRepeats();
		this.reissued = outgoing.getReissued();
		this.ada = outgoing.getAda();
		this.classification = outgoing.getClassification();
		this.attachedFilesDescription = outgoing.getAttachedFilesDescription();
		this.comments = outgoing.getComments();
		this.currentStatus = outgoing.getCurrentStatus();
		this.filepaths = outgoing.getFilepaths();
		this.subject = outgoing.getSubject();
		this.tag = outgoing.getTag();
		this.type = outgoing.getType();
	}
	public void addCorrespondents(List<Correspondent> newCorrespondants) {
		correspondents.addAll(newCorrespondants);
	}
	
	public void setCorrespondents(List<Correspondent> newCorrespondants) {
		correspondents = newCorrespondants;
	}
	
	public Set<EntityDescriptor> getEntityDescriptors(){
		return correspondents.stream()
        .filter(correspondent ->!( correspondent.getEntityDescriptor() instanceof Nobody))
        .map(Correspondent::getEntityDescriptor)
        .collect(Collectors.toSet());
	}



} 
