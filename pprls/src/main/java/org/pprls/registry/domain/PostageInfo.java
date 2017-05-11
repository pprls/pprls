/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import java.time.LocalDateTime;

import javax.persistence.Embeddable;

/**
 * Information about the courier '<em><b>Postage Info</b></em>'.
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registry.registry.domain.PostageInfo#getPostageTime <em>Postage Time</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.PostageInfo#getPostageMethod <em>Postage Method</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.PostageInfo#getVoucherNumber <em>Voucher Number</em>}</li>
 * </ul>
 *
 */
@Embeddable
public class PostageInfo {

	/**
	 * The cached value of the '{@link #getPostageTime() <em>Postage Time</em>}' attribute.
	 * @see #getPostageTime()
	 */
	protected LocalDateTime postageTime;

	/**
	 * The cached value of the '{@link #getPostageMethod() <em>Postage Method</em>}' attribute.
	 * @see #getPostageMethod()
	 */
	protected PostageMethod postageMethod = PostageMethod.OTHER;

	/**
	 * The default value of the '{@link #getVoucherNumber() <em>Voucher Number</em>}' attribute.
	 * @see #getVoucherNumber()
	 */
	protected static final String VOUCHER_NUMBER_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getVoucherNumber() <em>Voucher Number</em>}' attribute.
	 * @see #getVoucherNumber()
	 */
	protected String voucherNumber = VOUCHER_NUMBER_EDEFAULT;

	/**
	 * 
	 */
	public PostageInfo() {
		super();
	}

	/**
	 * 
	 */
	public LocalDateTime getPostageTime() {
		return postageTime;
	}

	/**
	 * 
	 */
	public void setPostageTime(LocalDateTime postageDate) {
		postageTime = postageDate;
	}

	/**
	 * 
	 */
	public PostageMethod getPostageMethod() {
		return postageMethod;
	}

	/**
	 * 
	 */
	public void setPostageMethod(PostageMethod newPostageMethod) {
		postageMethod = newPostageMethod;
	}

	/**
	 * 
	 */
	public String getVoucherNumber() {
		return voucherNumber;
	}

	/**
	 * 
	 */
	public void setVoucherNumber(String newVoucherNumber) {
		voucherNumber = newVoucherNumber;
	}


	/**
	 * 
	 */
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
