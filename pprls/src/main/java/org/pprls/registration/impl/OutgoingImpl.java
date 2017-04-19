/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration.impl;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;

import org.pprls.registration.DocumentStatus;
import org.pprls.registration.EmployeeDescriptor;
import org.pprls.registration.Incoming;
import org.pprls.registration.Outgoing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outgoing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.impl.OutgoingImpl#getReissued <em>Reissued</em>}</li>
 *   <li>{@link org.pprls.registration.impl.OutgoingImpl#getRelatedIncoming <em>Related Incoming</em>}</li>
 *   <li>{@link org.pprls.registration.impl.OutgoingImpl#getNumberOfRepeats <em>Number Of Repeats</em>}</li>
 *   <li>{@link org.pprls.registration.impl.OutgoingImpl#getEditor <em>Editor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutgoingImpl extends RegistryRecordImpl implements Outgoing {
	/**
	 * The cached value of the '{@link #getReissued() <em>Reissued</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReissued()
	 * @generated
	 * @ordered
	 */
	protected Outgoing reissued;

	/**
	 * The cached value of the '{@link #getRelatedIncoming() <em>Related Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedIncoming()
	 * @generated
	 * @ordered
	 */
	protected Incoming relatedIncoming;

	/**
	 * The default value of the '{@link #getNumberOfRepeats() <em>Number Of Repeats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRepeats()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_REPEATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRepeats() <em>Number Of Repeats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRepeats()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRepeats = NUMBER_OF_REPEATS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEditor() <em>Editor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditor()
	 * @generated
	 * @ordered
	 */
	protected EList<EmployeeDescriptor> editor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outgoing getReissued() {
		if (reissued != null && ((EObject)reissued).eIsProxy()) {
			InternalEObject oldReissued = (InternalEObject)reissued;
			reissued = (Outgoing)eResolveProxy(oldReissued);
			if (reissued != oldReissued) {
			}
		}
		return reissued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outgoing basicGetReissued() {
		return reissued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReissued(Outgoing newReissued) {
		reissued = newReissued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Incoming getRelatedIncoming() {
		if (relatedIncoming != null && ((EObject)relatedIncoming).eIsProxy()) {
			InternalEObject oldRelatedIncoming = (InternalEObject)relatedIncoming;
			relatedIncoming = (Incoming)eResolveProxy(oldRelatedIncoming);
			if (relatedIncoming != oldRelatedIncoming) {
			}
		}
		return relatedIncoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Incoming basicGetRelatedIncoming() {
		return relatedIncoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedIncoming(Incoming newRelatedIncoming) {
		relatedIncoming = newRelatedIncoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfRepeats() {
		return numberOfRepeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRepeats(int newNumberOfRepeats) {
		numberOfRepeats = newNumberOfRepeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EmployeeDescriptor> getEditor() {
		if (editor == null) {
			editor = new BasicInternalEList<EmployeeDescriptor>(EmployeeDescriptor.class);
		}
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeDescriptor getBasicEditor() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeDescriptor getOwner() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentStatus getState() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSigned() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void close(EmployeeDescriptor handler, String log) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outgoing reissue() {
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
		result.append(" (numberOfRepeats: ");
		result.append(numberOfRepeats);
		result.append(')');
		return result.toString();
	}

} //OutgoingImpl
