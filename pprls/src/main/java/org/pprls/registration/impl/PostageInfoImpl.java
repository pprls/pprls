/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration.impl;

import java.util.Date;
import org.pprls.registration.PostageInfo;
import org.pprls.registration.PostalMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postage Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.impl.PostageInfoImpl#getPostageTime <em>Postage Time</em>}</li>
 *   <li>{@link org.pprls.registration.impl.PostageInfoImpl#getPostageMethod <em>Postage Method</em>}</li>
 *   <li>{@link org.pprls.registration.impl.PostageInfoImpl#getVoucherNumber <em>Voucher Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostageInfoImpl implements PostageInfo {
	/**
	 * The default value of the '{@link #getPostageTime() <em>Postage Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostageTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date POSTAGE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostageTime() <em>Postage Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostageTime()
	 * @generated
	 * @ordered
	 */
	protected Date postageTime = POSTAGE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostageMethod() <em>Postage Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostageMethod()
	 * @generated
	 * @ordered
	 */
	protected static final PostalMethod POSTAGE_METHOD_EDEFAULT = PostalMethod.OTHER;

	/**
	 * The cached value of the '{@link #getPostageMethod() <em>Postage Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostageMethod()
	 * @generated
	 * @ordered
	 */
	protected PostalMethod postageMethod = POSTAGE_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoucherNumber() <em>Voucher Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoucherNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String VOUCHER_NUMBER_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getVoucherNumber() <em>Voucher Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoucherNumber()
	 * @generated
	 * @ordered
	 */
	protected String voucherNumber = VOUCHER_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostageInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPostageTime() {
		return postageTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostageTime(Date newPostageTime) {
		postageTime = newPostageTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalMethod getPostageMethod() {
		return postageMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostageMethod(PostalMethod newPostageMethod) {
		postageMethod = newPostageMethod == null ? POSTAGE_METHOD_EDEFAULT : newPostageMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoucherNumber() {
		return voucherNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoucherNumber(String newVoucherNumber) {
		voucherNumber = newVoucherNumber;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (postageTime: ");
		result.append(postageTime);
		result.append(", postageMethod: ");
		result.append(postageMethod);
		result.append(", voucherNumber: ");
		result.append(voucherNumber);
		result.append(')');
		return result.toString();
	}

} //PostageInfoImpl
