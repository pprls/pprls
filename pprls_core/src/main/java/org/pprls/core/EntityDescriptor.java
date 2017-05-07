/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.core;

import javax.persistence.Embeddable;

/**
 * A value object that holds a snapshot of an entity object.
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
	 * The constructor
	 */
	public EntityDescriptor() {
	}

	/**
	 * unit path getter
	 */
	public String getUnitPath() {
		return unitPath;
	}

	/**
	 * unit path setter
	 */
	public void setUnitPath(String newUnitPath) {
		unitPath = newUnitPath;
	}

	/**
	 * full name getter
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * full name setter
	 */
	public void setFullName(String newFullName) {
		fullName = newFullName;
	}

	/**
	 * Entity id unit/directorate or employee getter
	 */
	public short getEntityId() {
		return entityId;
	}

	/**
	 * Entity id unit/directorate or employee setter
	 */
	public void setEntityId(short newEntityId) {
		entityId = newEntityId;
	}

	/**
	 * registration number getter
	 */
	public short getRegistrationNumber() {
		return registrationNumber;
	}

	/**
	 * registration number setter
	 */
	public void setRegistrationNumber(short newRegistrationNumber) {
		registrationNumber = newRegistrationNumber;
	}


	/**
	 * A string representation of the object
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

	/**
	 * hashCode override to be used in collections
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + entityId;
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + registrationNumber;
		result = prime * result + ((unitPath == null) ? 0 : unitPath.hashCode());
		return result;
	}

	/**
	 * equals override to be used in conditions
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntityDescriptor other = (EntityDescriptor) obj;
		if (entityId != other.entityId)
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (registrationNumber != other.registrationNumber)
			return false;
		if (unitPath == null) {
			if (other.unitPath != null)
				return false;
		} else if (!unitPath.equals(other.unitPath))
			return false;
		return true;
	}

} 
