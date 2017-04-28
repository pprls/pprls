/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.xml.datatype.XMLGregorianCalendar;

import org.pprls.registry.model.Nobody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registry.registry.domain.Correspondant#getVatId <em>Vat Id</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Correspondant#getName <em>Name</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Correspondant#getAddress <em>Address</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Correspondant#getComments <em>Comments</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Correspondant#getInternalUnitId <em>Internal Unit Id</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Correspondant#getPostageinfo <em>Postageinfo</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.Correspondant#getRecipientType <em>Recipient Type</em>}</li>
 * </ul>
 *
 * @generated
 */
@Embeddable
public class Correspondant {

	/**
	 * The cached value of the '{@link #getVatId() <em>Vat Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVatId()
	 * @generated
	 * @ordered
	 */
	protected String vatId = "";


	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = "";

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = "";

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = "";

	
	/**
	 * The entityDescriptor. 
	 * The '{@link #getEntityDescriptor() <em>EntityDescriptor</em>}' reference.
	 */
	@Embedded
	protected EntityDescriptor entityDescriptor = new Nobody();
	
	/**
	 * The courier info. 
	 * The '{@link #getPostageinfo() <em>Postageinfo</em>}' reference.
	 */
	@Embedded
	protected PostageInfo postageinfo;
	
	
	/**
	 * The senders registry number . 
	 * The '{@link #getSenderRegistryNumber() <em>SenderRegistryNumber</em>}' reference.
	 */
	@Embedded
	protected SenderRegistryNumber registryNumber;

	/**
	 * The default value of the '{@link #getRecipientType() <em>Recipient Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientType()
	 * @generated
	 * @ordered
	 */
	protected static final CorrespondantType RECIPIENT_TYPE_EDEFAULT = CorrespondantType.RECIPIENT;

	/**
	 * The cached value of the '{@link #getRecipientType() <em>Recipient Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientType()
	 * @generated
	 * @ordered
	 */
	protected CorrespondantType recipientType = RECIPIENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correspondant() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVatId() {
		return vatId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVatId(String newVatId) {
		vatId = newVatId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		address = newAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityDescriptor getEntityDescriptor() {
		return entityDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityDescriptor(EntityDescriptor newEntityDescriptor) {
		entityDescriptor = newEntityDescriptor;
	}

    /**
     * Getter for the SenderRegistryNumber
     * @return senderRegistryNumber the details of the courier
     */
	public SenderRegistryNumber getSenderRegistryNumber() {
		return registryNumber;
	}

	/**
	 * Setter for the SenderRegistryNumber
	 * @param newRegistryNumber
	 */
	public void setSenderRegistryNumber(SenderRegistryNumber newRegistryNumber) {
		registryNumber = newRegistryNumber;
	}
	
	 /**
     * Getter for the postageinfo
     * @return postageinfo the details of the courier
     */
	public PostageInfo getPostageinfo() {
		return postageinfo;
	}

	/**
	 * Setter for the Postageinfo
	 * @param newPostageinfo
	 */
	public void setPostageinfo(PostageInfo newPostageinfo) {
		postageinfo = newPostageinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespondantType getRecipientType() {
		return recipientType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipientType(CorrespondantType newRecipientType) {
		recipientType = newRecipientType == null ? RECIPIENT_TYPE_EDEFAULT : newRecipientType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostageInfo createPostageInfo(XMLGregorianCalendar postageDate, PostalMethod postalMethod, String voucherNumber) {
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
		result.append(" (vatId: ");
		result.append(vatId);
		result.append(", name: ");
		result.append(name);
		result.append(", address: ");
		result.append(address);
		result.append(", comments: ");
		result.append(comments);
		result.append(", recipientType: ");
		result.append(recipientType);
		result.append(')');
		return result.toString();
	}

} //RecipientImpl
