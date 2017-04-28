/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import org.pprls.registry.domain.OutgoingCommonSubject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outgoing Common Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registry.registry.domain.OutgoingCommonSubject#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.OutgoingCommonSubject#getDirectorateId <em>Directorate Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutgoingCommonSubject {
	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectorateId() <em>Directorate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectorateId()
	 * @generated
	 * @ordered
	 */
	protected static final short DIRECTORATE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDirectorateId() <em>Directorate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectorateId()
	 * @generated
	 * @ordered
	 */
	protected short directorateId = DIRECTORATE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingCommonSubject() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(String newSubject) {
		subject = newSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getDirectorateId() {
		return directorateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectorateId(short newDirectorateId) {
		directorateId = newDirectorateId;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (subject: ");
		result.append(subject);
		result.append(", directorateId: ");
		result.append(directorateId);
		result.append(')');
		return result.toString();
	}

} //OutgoingCommonSubjectImpl
