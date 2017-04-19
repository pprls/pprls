/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration.impl;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.pprls.registration.DispatcherOrganization;
import org.pprls.registration.DispatcherUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dispatcher Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.impl.DispatcherOrganizationImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.pprls.registration.impl.DispatcherOrganizationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.pprls.registration.impl.DispatcherOrganizationImpl#getLatinName <em>Latin Name</em>}</li>
 *   <li>{@link org.pprls.registration.impl.DispatcherOrganizationImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.pprls.registration.impl.DispatcherOrganizationImpl#getHasUnits <em>Has Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DispatcherOrganizationImpl implements DispatcherOrganization {
	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final int UID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected int uid = UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatinName() <em>Latin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatinName()
	 * @generated
	 * @ordered
	 */
	protected static final String LATIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatinName() <em>Latin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatinName()
	 * @generated
	 * @ordered
	 */
	protected String latinName = LATIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasUnits() <em>Has Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<DispatcherUnit> hasUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatcherOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(int newUid) {
		uid = newUid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		label = newLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLatinName() {
		return latinName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatinName(String newLatinName) {
		latinName = newLatinName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		active = newActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<DispatcherUnit> getHasUnits() {
		if (hasUnits == null) {
			hasUnits = new BasicInternalEList<DispatcherUnit>(DispatcherUnit.class);
		}
		return hasUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
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
		result.append(" (uid: ");
		result.append(uid);
		result.append(", label: ");
		result.append(label);
		result.append(", latinName: ");
		result.append(latinName);
		result.append(", active: ");
		result.append(active);
		result.append(')');
		return result.toString();
	}

} //DispatcherOrganizationImpl
