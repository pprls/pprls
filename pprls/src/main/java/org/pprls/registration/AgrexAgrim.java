/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agrex Agrim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.AgrexAgrim#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.pprls.registration.AgrexAgrim#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface AgrexAgrim {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.pprls.registration.AgrexAgrim#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(AgrixProduct)
	 * @model resolveProxies="false"
	 * @generated
	 */
	AgrixProduct getProduct();

	/**
	 * Sets the value of the '{@link org.pprls.registration.AgrexAgrim#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(AgrixProduct value);


} // AgrexAgrim
