/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agrix Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.AgrixProduct#getProduct <em>Product</em>}</li>
 *   <li>{@link org.pprls.registration.AgrixProduct#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public interface AgrixProduct {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' attribute.
	 * The literals are from the enumeration {@link org.pprls.registration.AgrixProductTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' attribute.
	 * @see org.pprls.registration.AgrixProductTypes
	 * @see #setProduct(AgrixProductTypes)
	 * @generated
	 */
	AgrixProductTypes getProduct();

	/**
	 * Sets the value of the '{@link org.pprls.registration.AgrixProduct#getProduct <em>Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' attribute.
	 * @see org.pprls.registration.AgrixProductTypes
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(AgrixProductTypes value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.pprls.registration.MeasurementUnits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.pprls.registration.MeasurementUnits
	 * @see #setUnit(MeasurementUnits)
	 * @generated
	 */
	MeasurementUnits getUnit();

	/**
	 * Sets the value of the '{@link org.pprls.registration.AgrixProduct#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.pprls.registration.MeasurementUnits
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(MeasurementUnits value);


} // AgrixProduct
