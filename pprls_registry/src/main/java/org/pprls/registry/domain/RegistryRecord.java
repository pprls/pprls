/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.GenericGenerator;
import org.pprls.core.EntityDescriptor;
import org.pprls.registry.domain.audit.AuditingRegistryListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * An implementation of the model object '<em><b>Registry Record</b></em>'.
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.pprls.registry.registry.domain.RegistryRecord#getAttachedFilesDescription
 * <em>Attached Files Description</em>}</li>
 * <li>{@link org.pprls.registry.registry.domain.RegistryRecord#getComments
 * <em>Comments</em>}</li>
 * <li>{@link org.pprls.registry.registry.domain.RegistryRecord#getSubject
 * <em>Subject</em>}</li>
 * <li>{@link org.pprls.registry.registry.domain.RegistryRecord#getFilepaths
 * <em>Filepaths</em>}</li>
 * <li>{@link org.pprls.registry.registry.domain.RegistryRecord#getType <em>Type</em>}</li>
 * <li>{@link org.pprls.registry.registry.domain.RegistryRecord#getId <em>Id</em>}</li>
 * <li>{@link org.pprls.registry.registry.domain.RegistryRecord#getClassification
 * <em>Classification</em>}</li>
 * <li>{@link org.pprls.registry.registry.domain.RegistryRecord#getAda <em>Ada</em>}</li>
 * <em>Document</em>}</li>
 * <li>{@link org.pprls.registry.registry.domain.RegistryRecord#getTag <em>Tag</em>}</li>
 * <li>{@link org.pprls.registry.registry.domain.RegistryRecord#getRegistrynumber
 * <em>Registrynumber</em>}</li>
 * <li>{@link org.pprls.registry.registry.domain.RegistryRecord#getRecipients
 * <em>Recipients</em>}</li>
 * </ul>
 *
 */
@MappedSuperclass
public class RegistryRecord {
	
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * 
	 * @see #getId()
	 */
	@Id
	@GeneratedValue(generator = "system-uuid2")
	@GenericGenerator(name = "system-uuid2", strategy = "uuid2")
	protected UUID id;

	@JsonIgnore
	@Version
	protected long version;

	/**
	 * Getter for the UUID
	 * @return uuid
	 */
	public UUID getId() {
		return id;
	}


	/**
	 * The cached value of the '{@link #getAttachedFilesDescription()
	 * <em>Attached Files Description</em>}' attribute. 
	 * 
	 * @see #getAttachedFilesDescription()
	 */
	protected String attachedFilesDescription = "";

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}'
	 * attribute. 
	 * 
	 * @see #getComments()
	 */
	protected String comments = "";

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}'
	 * attribute. 
	 * 
	 * @see #getSubject()
	 */
    protected String subject = "";

	/**
	 * The cached value of the '{@link #getFilepaths() <em>Filepaths</em>}'
	 * attribute list. 
	 * 
	 * @see #getFilepaths()
	 * @generated
	 * @ordered
	 */
    @ElementCollection
	protected List<String> filepaths;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * 
	 * @see #getType()
	 */
	protected DocumentType type = DocumentType.DOCUMENT;

	/**
	 * The cached value of the '{@link #getClassification()
	 * <em>Classification</em>}' attribute.
	 * 
	 * @see #getClassification()
	 */
	protected Classification classification = Classification.INTERNAL;
	
	@Embedded
	protected RegistryStatus initialStatus;
	@Embedded
	protected RegistryStatus currentStatus;

	/**
	 * The cached value of the '{@link #getAda() <em>Ada</em>}' attribute. 
	 * 
	 * @see #getAda()
	 */
	protected String ada = "";

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' reference. 
	 * 
	 * @see #getTag()
	 */
	protected String tag;

	/**
	 * Registry number is the human oriented unique number 
	 * '{@link #getRegistrynumber()	 * <em>Registrynumber</em>}' reference. 
	 *
	 */
	@Embedded
	protected RegistryNumber registryNumber;

	/**
	 * The '{@link #getCorrespondents() <em>Recipients</em>}'
	 * reference list. 
	 * 
	 */
	@ElementCollection(fetch = FetchType.EAGER)
	protected List<Correspondent> correspondents = new ArrayList<Correspondent>();

	/**
	 * 
	 */
	public RegistryRecord() {
	}

	/**
	 * 
	 */
	public String getAttachedFilesDescription() {
		return attachedFilesDescription;
	}

	/**
	 * 
	 */
	public void setAttachedFilesDescription(String newAttachedFilesDescription) {
		attachedFilesDescription = newAttachedFilesDescription;
	}

	/**
	 * 
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * 
	 */
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * 
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * 
	 */
	public void setSubject(String newSubject) {
		subject = newSubject;
	}

	/**
	 * 
	 */
	public List<String> getFilepaths() {
		return filepaths;
	}

	/**
	 * 
	 */
	public DocumentType getType() {
		return type;
	}

	/**
	 * 
	 */
	public void setType(DocumentType newType) {
		type = newType;
	}

	/**
	 * 
	 */
	public void setId(UUID newId) {
		id = newId;
	}

	/**
	 * 
	 */
	public Classification getClassification() {
		return classification;
	}

	/**
	 * 
	 */
	public void setClassification(Classification newClassification) {
		classification = newClassification;
	}

	public RegistryStatus getInitialStatus() {
		return initialStatus;
	}

	public void setInitialStatus(RegistryStatus initialStatus) {
		this.initialStatus = initialStatus;
	}

	public RegistryStatus getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(RegistryStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	/**
	 * 
	 */
	public String getAda() {
		return ada;
	}

	/**
	 * 
	 */
	public void setAda(String newAda) {
		ada = newAda;
	}

	/**
	 * 
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * 
	 */
	public void setTag(String newTag) {
		tag = newTag;
	}

	/**
	 * 
	 */
	public RegistryNumber getRegistryNumber() {
		return registryNumber;
	}

	/**
	 * 
	 */
	public void setRegistryNumber(RegistryNumber newRegistryNumber) {
		registryNumber = newRegistryNumber;
	}

	/**
	 * 
	 */
	public List<Correspondent> getCorrespondents() {
		return correspondents;
	}

	/**
	 * 
	 */
	public boolean requiresProtocolNumber() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 
	 */
	public void cancelAllThreads() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 */
	public boolean canEdit() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 */
	public void cancel(EntityDescriptor handler, String log) {
		
		RegistryStatus newStatus = new RegistryStatus();
		newStatus.setState(RegistryState.CANCELLED);
		newStatus.setLog(log);
		newStatus.setHandler(handler);
		
		setCurrentStatus(newStatus);		
	}

	/**
	 * 
	 */
	@JsonIgnore
	public boolean isCancelled() {
		return getCurrentStatus().getState().equals(RegistryState.CANCELLED);
	}

	/**
	 * @param latestRegistryStatus 
	 * 
	 */
	public void revertTo(RegistryStatus latestRegistryStatus) {
		setCurrentStatus(latestRegistryStatus);
	}
	
	public void revert() {
		throw new UnsupportedOperationException();
		
	}
	
	public void undo() {
		throw new UnsupportedOperationException();
		
	}

	/**
	 * 
	 */
	public String mapToFilepath(String filepath) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 */
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append("registry ");
		return result.toString();
	}

} 
