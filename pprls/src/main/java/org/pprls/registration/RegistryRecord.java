/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;

import java.util.List;
import java.util.UUID;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.RegistryRecord#getAttachedFilesDescription <em>Attached Files Description</em>}</li>
 *   <li>{@link org.pprls.registration.RegistryRecord#getComments <em>Comments</em>}</li>
 *   <li>{@link org.pprls.registration.RegistryRecord#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.pprls.registration.RegistryRecord#getFilepaths <em>Filepaths</em>}</li>
 *   <li>{@link org.pprls.registration.RegistryRecord#getType <em>Type</em>}</li>
 *   <li>{@link org.pprls.registration.RegistryRecord#getId <em>Id</em>}</li>
 *   <li>{@link org.pprls.registration.RegistryRecord#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.pprls.registration.RegistryRecord#getAda <em>Ada</em>}</li>
 *   <li>{@link org.pprls.registration.RegistryRecord#getDocument <em>Document</em>}</li>
 *   <li>{@link org.pprls.registration.RegistryRecord#getTag <em>Tag</em>}</li>
 *   <li>{@link org.pprls.registration.RegistryRecord#getRegistrynumber <em>Registrynumber</em>}</li>
 *   <li>{@link org.pprls.registration.RegistryRecord#getRecipients <em>Recipients</em>}</li>
 * </ul>
 *
 * @generated
 */
public interface RegistryRecord {
	/**
	 * Returns the value of the '<em><b>Attached Files Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attached Files Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached Files Description</em>' attribute.
	 * @see #setAttachedFilesDescription(String)
	 * @generated
	 */
	String getAttachedFilesDescription();

	/**
	 * Sets the value of the '{@link org.pprls.registration.RegistryRecord#getAttachedFilesDescription <em>Attached Files Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached Files Description</em>' attribute.
	 * @see #getAttachedFilesDescription()
	 * @generated
	 */
	void setAttachedFilesDescription(String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.pprls.registration.RegistryRecord#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link org.pprls.registration.RegistryRecord#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Filepaths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filepaths</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filepaths</em>' attribute list.
	 * @generated
	 */
	List<String> getFilepaths();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.pprls.registration.DocumentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.pprls.registration.DocumentType
	 * @see #setType(DocumentType)
	 * @generated
	 */
	DocumentType getType();

	/**
	 * Sets the value of the '{@link org.pprls.registration.RegistryRecord#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.pprls.registration.DocumentType
	 * @see #getType()
	 * @generated
	 */
	void setType(DocumentType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(UUID)
	 * @generated
	 */
	UUID getId();

	/**
	 * Sets the value of the '{@link org.pprls.registration.RegistryRecord#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(UUID value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * The default value is <code>"\u0395\u03c3\u03c9\u03c4\u03b5\u03c1\u03b9\u03ba\u03cc"</code>.
	 * The literals are from the enumeration {@link org.pprls.registration.Classification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see org.pprls.registration.Classification
	 * @see #setClassification(Classification)
	 * @generated
	 */
	Classification getClassification();

	/**
	 * Sets the value of the '{@link org.pprls.registration.RegistryRecord#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see org.pprls.registration.Classification
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(Classification value);

	/**
	 * Returns the value of the '<em><b>Ada</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the "Αριθμός Διαδικτυακής Ανάρτησης" = ada
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ada</em>' attribute.
	 * @see #setAda(String)
	 * @generated
	 */
	String getAda();

	/**
	 * Sets the value of the '{@link org.pprls.registration.RegistryRecord#getAda <em>Ada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ada</em>' attribute.
	 * @see #getAda()
	 * @generated
	 */
	void setAda(String value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference list.
	 * The list contents are of type {@link org.pprls.registration.Document}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' containment reference list.
	 * @generated
	 */
	List<Document> getDocument();

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' reference.
	 * @see #setTag(Tag)
	 * @generated
	 */
	Tag getTag();

	/**
	 * Sets the value of the '{@link org.pprls.registration.RegistryRecord#getTag <em>Tag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' reference.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(Tag value);

	/**
	 * Returns the value of the '<em><b>Registrynumber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registrynumber</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registrynumber</em>' reference.
	 * @see #setRegistrynumber(RegistryNumber)
	 * @generated
	 */
	RegistryNumber getRegistrynumber();

	/**
	 * Sets the value of the '{@link org.pprls.registration.RegistryRecord#getRegistrynumber <em>Registrynumber</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registrynumber</em>' reference.
	 * @see #getRegistrynumber()
	 * @generated
	 */
	void setRegistrynumber(RegistryNumber value);

	/**
	 * Returns the value of the '<em><b>Recipients</b></em>' reference list.
	 * The list contents are of type {@link org.pprls.registration.Recipient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipients</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipients</em>' reference list.
	 * @generated
	 */
	List<Recipient> getRecipients();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	boolean requiresProtocolNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Document getThreadForId(UUID id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Document startNewThread(EmployeeDescriptor handler, EmployeeDescriptor owner, Action action, String comments, InternalNumber number);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void cancelAllThreads();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void reserve(EmployeeDescriptor handler, EmployeeDescriptor owner, InternalNumber number);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	boolean canEdit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void cancel(EmployeeDescriptor handler, String log);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	boolean isCancelled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void revert(EmployeeDescriptor handler, String log);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String mapToFilepath(String filepath);


} // RegistryRecord
