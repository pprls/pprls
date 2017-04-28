/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.document.domain;

import javax.persistence.Embeddable;

import org.pprls.document.domain.EntityDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.document.document.domain.EntityDescriptor#getUnitPath <em>Unit Path</em>}</li>
 *   <li>{@link org.pprls.document.document.domain.EntityDescriptor#getUnitName <em>Unit Name</em>}</li>
 *   <li>{@link org.pprls.document.document.domain.EntityDescriptor#getDirectorate <em>Directorate</em>}</li>
 *   <li>{@link org.pprls.document.document.domain.EntityDescriptor#getFullName <em>Full Name</em>}</li>
 *   <li>{@link org.pprls.document.document.domain.EntityDescriptor#getUnitId <em>Unit Id</em>}</li>
 *   <li>{@link org.pprls.document.document.domain.EntityDescriptor#getRegistrationNumber <em>Registration Number</em>}</li>
 * </ul>
 *
 * @generated
 */
@Embeddable
public class EntityDescriptor {
	/**
	 * The default value of the '{@link #getUnitPath() <em>Unit Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPath()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_PATH_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getUnitPath() <em>Unit Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPath()
	 * @generated
	 * @ordered
	 */
	protected String unitPath = UNIT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitName() <em>Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDirectorate() <em>Directorate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectorate()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTORATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected String fullName = FULL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntityId() <em>Unit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityId()
	 * @generated
	 * @ordered
	 */
	protected static final short ENTITY_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEntityId() <em>Unit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityId()
	 * @generated
	 * @ordered
	 */
	protected short entityId = ENTITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistrationNumber() <em>Registration Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final short REGISTRATION_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegistrationNumber() <em>Registration Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationNumber()
	 * @generated
	 * @ordered
	 */
	protected short registrationNumber = REGISTRATION_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityDescriptor() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitPath() {
		return unitPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitPath(String newUnitPath) {
		unitPath = newUnitPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullName(String newFullName) {
		fullName = newFullName;
	}

	/**
	 * the entity id unit/directorate or employee
	 * @generated
	 */
	public short getEntityId() {
		return entityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityId(short newEntityId) {
		entityId = newEntityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getRegistrationNumber() {
		return registrationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistrationNumber(short newRegistrationNumber) {
		registrationNumber = newRegistrationNumber;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (unitPath: ");
		result.append(unitPath);
		result.append(", fullName: ");
		result.append(fullName);
		result.append(", registrationNumber: ");
		result.append(registrationNumber);
		result.append(')');
		return result.toString();
	}

} //EmployeeDescriptorImpl
