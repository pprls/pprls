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
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Registry Record</b></em>'. <!-- end-user-doc -->
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
 * @generated
 */
@MappedSuperclass
public class RegistryRecord {
	
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
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
	 * <em>Attached Files Description</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAttachedFilesDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACHED_FILES_DESCRIPTION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAttachedFilesDescription()
	 * <em>Attached Files Description</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAttachedFilesDescription()
	 * @generated
	 * @ordered
	 */
	protected String attachedFilesDescription = ATTACHED_FILES_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
    protected String subject = SUBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilepaths() <em>Filepaths</em>}'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFilepaths()
	 * @generated
	 * @ordered
	 */
    @ElementCollection
	protected List<String> filepaths;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DocumentType TYPE_EDEFAULT = DocumentType.NOTE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DocumentType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassification()
	 * <em>Classification</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected static final Classification CLASSIFICATION_EDEFAULT = Classification.INTERNAL;

	/**
	 * The cached value of the '{@link #getClassification()
	 * <em>Classification</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected Classification classification = CLASSIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAda() <em>Ada</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAda()
	 * @generated
	 * @ordered
	 */
	protected static final String ADA_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAda() <em>Ada</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAda()
	 * @generated
	 * @ordered
	 */
	protected String ada = ADA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
//	@OneToMany
//	protected List<Document> document;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTag()
	 * @generated
	 * @ordered
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
	protected List<Correspondant> correspondants = new ArrayList<Correspondant>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RegistryRecord() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getAttachedFilesDescription() {
		return attachedFilesDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAttachedFilesDescription(String newAttachedFilesDescription) {
		attachedFilesDescription = newAttachedFilesDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSubject(String newSubject) {
		subject = newSubject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List<String> getFilepaths() {
		return filepaths;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocumentType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setType(DocumentType newType) {
		type = newType == null ? TYPE_EDEFAULT : newType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(UUID newId) {
		id = newId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Classification getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setClassification(Classification newClassification) {
		classification = newClassification == null ? CLASSIFICATION_EDEFAULT : newClassification;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getAda() {
		return ada;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAda(String newAda) {
		ada = newAda;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
//	public List<Document> getDocument() {
//		return document;
//	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTag(String newTag) {
		tag = newTag;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RegistryNumber getRegistryNumber() {
		return registryNumber;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRegistryNumber(RegistryNumber newRegistryNumber) {
		registryNumber = newRegistryNumber;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List<Correspondant> getCorrespondants() {
		return correspondants;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean requiresProtocolNumber() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void cancelAllThreads() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean canEdit() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void cancel(EntityDescriptor handler, String log) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isCancelled() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void revert(EntityDescriptor handler, String log) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String mapToFilepath(String filepath) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append("registry ");
		return result.toString();
	}

} 
