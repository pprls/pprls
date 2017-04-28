/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

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
 * <li>{@link org.pprls.registry.registry.domain.RegistryRecord#getDocument
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
	
	/**
	 * Getter for the UUID
	 * @return uuid
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * The default value of the '{@link #getAttachedFilesDescription()
	 * <em>Attached Files Description</em>}' attribute. 
	 * 
	 * @see #getAttachedFilesDescription()
	 */
	protected static final String ATTACHED_FILES_DESCRIPTION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAttachedFilesDescription()
	 * <em>Attached Files Description</em>}' attribute. 
	 * 
	 * @see #getAttachedFilesDescription()
	 */
	protected String attachedFilesDescription = ATTACHED_FILES_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}'
	 * attribute. 
	 * 
	 * @see #getComments()
	 */
	protected static final String COMMENTS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}'
	 * attribute. 
	 * 
	 * @see #getComments()
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}'
	 * attribute. 
	 * 
	 * @see #getSubject()
	 */
	protected static final String SUBJECT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}'
	 * attribute. 
	 * 
	 * @see #getSubject()
	 */
    protected String subject = SUBJECT_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * 
	 * @see #getType()
	 */
	protected static final DocumentType TYPE_EDEFAULT = DocumentType.NOTE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * 
	 * @see #getType()
	 */
	protected DocumentType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassification()
	 * <em>Classification</em>}' attribute. 
	 * 
	 * @see #getClassification()
	 */
	protected static final Classification CLASSIFICATION_EDEFAULT = Classification.INTERNAL;

	/**
	 * The cached value of the '{@link #getClassification()
	 * <em>Classification</em>}' attribute.
	 * 
	 * @see #getClassification()
	 */
	protected Classification classification = CLASSIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAda() <em>Ada</em>}' attribute.
	 * 
	 * @see #getAda()
	 */
	protected static final String ADA_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAda() <em>Ada</em>}' attribute. 
	 * 
	 * @see #getAda()
	 */
	protected String ada = ADA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}'
	 * containment reference list. 
	 * 
	 * @see #getDocument()

	 */
//	@OneToMany
//	protected List<Document> document;

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
	 * The '{@link #getCorrespondants() <em>Recipients</em>}'
	 * reference list. 
	 * 
	 */
	@ElementCollection
	protected List<Correspondent> correspondants = new ArrayList<Correspondent>();

	/**
	 * 
	 */
	public RegistryRecord() {
		super();
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
		classification = newClassification == null ? CLASSIFICATION_EDEFAULT : newClassification;
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
//	public List<Document> getDocument() {
//		return document;
//	}

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
	public List<Correspondent> getCorrespondants() {
		return correspondants;
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
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 */
	public boolean isCancelled() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 */
	public void revert(EntityDescriptor handler, String log) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
