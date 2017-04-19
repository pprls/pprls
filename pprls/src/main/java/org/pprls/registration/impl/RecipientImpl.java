/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.pprls.registration.PostageInfo;
import org.pprls.registration.PostalMethod;
import org.pprls.registration.Recipient;
import org.pprls.registration.RecipientType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.impl.RecipientImpl#getVatId <em>Vat Id</em>}</li>
 *   <li>{@link org.pprls.registration.impl.RecipientImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.pprls.registration.impl.RecipientImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.pprls.registration.impl.RecipientImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.pprls.registration.impl.RecipientImpl#getInternalUnitId <em>Internal Unit Id</em>}</li>
 *   <li>{@link org.pprls.registration.impl.RecipientImpl#getPostageinfo <em>Postageinfo</em>}</li>
 *   <li>{@link org.pprls.registration.impl.RecipientImpl#getRecipientType <em>Recipient Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecipientImpl implements Recipient {
	/**
	 * The default value of the '{@link #getVatId() <em>Vat Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVatId()
	 * @generated
	 * @ordered
	 */
	protected static final String VAT_ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getVatId() <em>Vat Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVatId()
	 * @generated
	 * @ordered
	 */
	protected String vatId = VAT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternalUnitId() <em>Internal Unit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalUnitId()
	 * @generated
	 * @ordered
	 */
	protected static final short INTERNAL_UNIT_ID_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getInternalUnitId() <em>Internal Unit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalUnitId()
	 * @generated
	 * @ordered
	 */
	protected short internalUnitId = INTERNAL_UNIT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPostageinfo() <em>Postageinfo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostageinfo()
	 * @generated
	 * @ordered
	 */
	protected PostageInfo postageinfo;

	/**
	 * The default value of the '{@link #getRecipientType() <em>Recipient Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientType()
	 * @generated
	 * @ordered
	 */
	protected static final RecipientType RECIPIENT_TYPE_EDEFAULT = RecipientType.RECIPIENT;

	/**
	 * The cached value of the '{@link #getRecipientType() <em>Recipient Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientType()
	 * @generated
	 * @ordered
	 */
	protected RecipientType recipientType = RECIPIENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipientImpl() {
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
	public short getInternalUnitId() {
		return internalUnitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalUnitId(short newInternalUnitId) {
		internalUnitId = newInternalUnitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostageInfo getPostageinfo() {
		if (postageinfo != null && ((EObject)postageinfo).eIsProxy()) {
			InternalEObject oldPostageinfo = (InternalEObject)postageinfo;
			postageinfo = (PostageInfo)eResolveProxy(oldPostageinfo);
			if (postageinfo != oldPostageinfo) {
			}
		}
		return postageinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostageInfo basicGetPostageinfo() {
		return postageinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostageinfo(PostageInfo newPostageinfo) {
		postageinfo = newPostageinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipientType getRecipientType() {
		return recipientType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipientType(RecipientType newRecipientType) {
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
		result.append(", internalUnitId: ");
		result.append(internalUnitId);
		result.append(", recipientType: ");
		result.append(recipientType);
		result.append(')');
		return result.toString();
	}

} //RecipientImpl
