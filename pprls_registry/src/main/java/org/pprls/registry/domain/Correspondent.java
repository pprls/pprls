/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import org.pprls.core.EntityDescriptor;
import org.pprls.core.Nobody;

/**
 * A person that sent or receives an document. An '<em><b>Correspondent</b></em>'.
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registry.domain.Correspondent#getVatId <em>Vat Id</em>}</li>
 *   <li>{@link org.pprls.registry.domain.Correspondent#getName <em>Name</em>}</li>
 *   <li>{@link org.pprls.registry.domain.Correspondent#getAddress <em>Address</em>}</li>
 *   <li>{@link org.pprls.registry.domain.Correspondent#getComments <em>Comments</em>}</li>
 *   <li>{@link org.pprls.registry.domain.Correspondent#getInternalUnitId <em>Internal Unit Id</em>}</li>
 *   <li>{@link org.pprls.registry.domain.Correspondent#getPostageinfo <em>Postageinfo</em>}</li>
 *   <li>{@link org.pprls.registry.domain.Correspondent#getCorrespondentType <em>Correspondent Type</em>}</li>
 * </ul>
 *
 */
@Embeddable
public class Correspondent {

	/**
	 * The cached value of the '{@link #getVatId() <em>Vat Id</em>}' attribute.
	 * @see #getVatId()
	 */
	protected String vatId = "";


	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * @see #getName()
	 */
	protected String name = "";

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * @see #getAddress()
	 */
	protected String address = "";

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * @see #getComments()
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
	 * The cached value of the '{@link #getCorrespondentType() <em>Recipient Type</em>}' attribute.
	 * @see #getCorrespondentType()
	 */
	protected CorrespondentType correspondentType = CorrespondentType.RECIPIENT;

	/**
	 * Constructor only for the builder
	 */
	protected Correspondent() {
		super();
	}

	/**
	 * vatId getter
	 */
	public String getVatId() {
		return vatId;
	}

	/**
	 * vatId setter
	 */
	public void setVatId(String newVatId) {
		vatId = newVatId;
	}

	/**
	 * name getter
	 */
	public String getName() {
		return name;
	}

	/**
	 * name setter
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * address getter
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * address setter
	 */
	public void setAddress(String newAddress) {
		address = newAddress;
	}

	/**
	 * comments getter
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * comments setter
	 */
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * entity descriptor getter
	 */
	public EntityDescriptor getEntityDescriptor() {
		return entityDescriptor;
	}

	/**
	 * entity descriptor setter
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
	 * CorrespondentType getter
	 */
	public CorrespondentType getCorrespondentType() {
		return correspondentType;
	}

	/**
	 * CorrespondentType setter
	 */
	public void setCorrespondantType(CorrespondentType newCorrespondentType) {
		correspondentType = newCorrespondentType;
	}
	
	/**
	 * Returns the object as string representation.	
	 */
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
		result.append(", correspondentType: ");
		result.append(correspondentType);
		result.append(')');
		return result.toString();
	}

} 
