/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import javax.persistence.Embeddable;

import org.pprls.registry.domain.EntityDescriptor;

/**
 * An implementation of the model object '<em><b>Employee Descriptor</b></em>'.
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registry.registry.domain.EntityDescriptor#getUnitPath <em>Unit Path</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.EntityDescriptor#getUnitName <em>Unit Name</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.EntityDescriptor#getDirectorate <em>Directorate</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.EntityDescriptor#getFullName <em>Full Name</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.EntityDescriptor#getUnitId <em>Unit Id</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.EntityDescriptor#getRegistrationNumber <em>Registration Number</em>}</li>
 * </ul>
 *
 */
@Embeddable
public class EntityDescriptor {

	/**
	 * The '{@link #getUnitPath() <em>Unit Path</em>}' attribute.
	 * @see #getUnitPath()
	 */
	protected String unitPath = "";

	/**
	 * The cached value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * @see #getFullName()
	 */
	protected String fullName = "";

	/**
	 * The cached value of the '{@link #getEntityId() <em>Unit Id</em>}' attribute.
	 * @see #getEntityId()
	 */
	protected short entityId = 0;

	/**
	 * The cached value of the '{@link #getRegistrationNumber() <em>Registration Number</em>}' attribute.
	 * @see #getRegistrationNumber()
	 */
	protected short registrationNumber = 0;

	/**
	 */
	public EntityDescriptor() {
		super();
	}

	/**
	 */
	public String getUnitPath() {
		return unitPath;
	}

	/**
	 */
	public void setUnitPath(String newUnitPath) {
		unitPath = newUnitPath;
	}

	/**
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 */
	public void setFullName(String newFullName) {
		fullName = newFullName;
	}

	/**
	 * the entity id unit/directorate or employee
	 */
	public short getEntityId() {
		return entityId;
	}

	/**
	 */
	public void setEntityId(short newEntityId) {
		entityId = newEntityId;
	}

	/**
	 */
	public short getRegistrationNumber() {
		return registrationNumber;
	}

	/**
	 */
	public void setRegistrationNumber(short newRegistrationNumber) {
		registrationNumber = newRegistrationNumber;
	}


	/**
	 */
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

} 
