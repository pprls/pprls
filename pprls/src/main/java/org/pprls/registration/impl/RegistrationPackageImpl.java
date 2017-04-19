/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration.impl;

import java.util.Date;
import java.util.UUID;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.pprls.application.services.services.impl.ServicesPackageImpl;
import org.pprls.registration.AgrexAgrim;
import org.pprls.registration.AgrixProduct;
import org.pprls.registration.Dispatcher;
import org.pprls.registration.DispatcherOrganization;
import org.pprls.registration.DispatcherUnit;
import org.pprls.registration.Document;
import org.pprls.registration.EmployeeDescriptor;
import org.pprls.registration.GeneralProtocolNumber;
import org.pprls.registration.Incoming;
import org.pprls.registration.IncomingCommonSubject;
import org.pprls.registration.IncomingStatusHistory;
import org.pprls.registration.InternalNumber;
import org.pprls.registration.Outgoing;
import org.pprls.registration.OutgoingCommonSubject;
import org.pprls.registration.PostageInfo;
import org.pprls.registration.Producer;
import org.pprls.registration.Recipient;
import org.pprls.registration.RegistrationFactory;
import org.pprls.registration.RegistrationService;
import org.pprls.registration.RegistryNumber;
import org.pprls.registration.RegistryRecord;
import org.pprls.registration.Sender;
import org.pprls.registration.SenderRegistryNumber;
import org.pprls.registration.StateTransition;
import org.pprls.registration.Status;
import org.pprls.registration.Tag;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.pprls.registration.RegistrationFactory
 * @generated
 */
public class RegistrationPackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "registration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://org.pprls/registration/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.pprls.registration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RegistrationPackageImpl eINSTANCE = org.pprls.registration.impl.RegistrationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.TagImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getTag()
	 * @generated
	 */
	public static final int TAG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAG__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.pprls.registration.Dispatcher <em>Dispatcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.Dispatcher
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getDispatcher()
	 * @generated
	 */
	public static final int DISPATCHER = 6;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISPATCHER__UID = 0;

	/**
	 * The number of structural features of the '<em>Dispatcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISPATCHER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.DispatcherOrganizationImpl <em>Dispatcher Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.DispatcherOrganizationImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getDispatcherOrganization()
	 * @generated
	 */
	public static final int DISPATCHER_ORGANIZATION = 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISPATCHER_ORGANIZATION__UID = DISPATCHER__UID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISPATCHER_ORGANIZATION__LABEL = DISPATCHER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISPATCHER_ORGANIZATION__LATIN_NAME = DISPATCHER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISPATCHER_ORGANIZATION__ACTIVE = DISPATCHER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISPATCHER_ORGANIZATION__HAS_UNITS = DISPATCHER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dispatcher Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISPATCHER_ORGANIZATION_FEATURE_COUNT = DISPATCHER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.DispatcherUnitImpl <em>Dispatcher Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.DispatcherUnitImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getDispatcherUnit()
	 * @generated
	 */
	public static final int DISPATCHER_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISPATCHER_UNIT__UID = DISPATCHER__UID;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISPATCHER_UNIT__BELONGS_TO = DISPATCHER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISPATCHER_UNIT__LABEL = DISPATCHER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dispatcher Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISPATCHER_UNIT_FEATURE_COUNT = DISPATCHER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.RecipientImpl <em>Recipient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.RecipientImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getRecipient()
	 * @generated
	 */
	public static final int RECIPIENT = 3;

	/**
	 * The feature id for the '<em><b>Vat Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECIPIENT__VAT_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECIPIENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECIPIENT__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECIPIENT__COMMENTS = 3;

	/**
	 * The feature id for the '<em><b>Internal Unit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECIPIENT__INTERNAL_UNIT_ID = 4;

	/**
	 * The feature id for the '<em><b>Postageinfo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECIPIENT__POSTAGEINFO = 5;

	/**
	 * The feature id for the '<em><b>Recipient Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECIPIENT__RECIPIENT_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Recipient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECIPIENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.RegistryRecordImpl <em>Registry Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.RegistryRecordImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getRegistryRecord()
	 * @generated
	 */
	public static final int REGISTRY_RECORD = 22;

	/**
	 * The feature id for the '<em><b>Attached Files Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_RECORD__ATTACHED_FILES_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_RECORD__COMMENTS = 1;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_RECORD__SUBJECT = 2;

	/**
	 * The feature id for the '<em><b>Filepaths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_RECORD__FILEPATHS = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_RECORD__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_RECORD__ID = 5;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_RECORD__CLASSIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Ada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_RECORD__ADA = 7;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_RECORD__DOCUMENT = 8;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_RECORD__TAG = 9;

	/**
	 * The feature id for the '<em><b>Registrynumber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_RECORD__REGISTRYNUMBER = 10;

	/**
	 * The feature id for the '<em><b>Recipients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_RECORD__RECIPIENTS = 11;

	/**
	 * The number of structural features of the '<em>Registry Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_RECORD_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.OutgoingImpl <em>Outgoing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.OutgoingImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getOutgoing()
	 * @generated
	 */
	public static final int OUTGOING = 4;

	/**
	 * The feature id for the '<em><b>Attached Files Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING__ATTACHED_FILES_DESCRIPTION = REGISTRY_RECORD__ATTACHED_FILES_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING__COMMENTS = REGISTRY_RECORD__COMMENTS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING__SUBJECT = REGISTRY_RECORD__SUBJECT;

	/**
	 * The feature id for the '<em><b>Filepaths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING__FILEPATHS = REGISTRY_RECORD__FILEPATHS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING__TYPE = REGISTRY_RECORD__TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING__ID = REGISTRY_RECORD__ID;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING__CLASSIFICATION = REGISTRY_RECORD__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Ada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING__ADA = REGISTRY_RECORD__ADA;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING__DOCUMENT = REGISTRY_RECORD__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING__TAG = REGISTRY_RECORD__TAG;

	/**
	 * The feature id for the '<em><b>Registrynumber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING__REGISTRYNUMBER = REGISTRY_RECORD__REGISTRYNUMBER;

	/**
	 * The feature id for the '<em><b>Recipients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING__RECIPIENTS = REGISTRY_RECORD__RECIPIENTS;

	/**
	 * The feature id for the '<em><b>Reissued</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING__REISSUED = REGISTRY_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Related Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING__RELATED_INCOMING = REGISTRY_RECORD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Repeats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING__NUMBER_OF_REPEATS = REGISTRY_RECORD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING__EDITOR = REGISTRY_RECORD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Outgoing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING_FEATURE_COUNT = REGISTRY_RECORD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.GeneralProtocolNumberImpl <em>General Protocol Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.GeneralProtocolNumberImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getGeneralProtocolNumber()
	 * @generated
	 */
	public static final int GENERAL_PROTOCOL_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_PROTOCOL_NUMBER__YEAR = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_PROTOCOL_NUMBER__NUMBER = 1;

	/**
	 * The number of structural features of the '<em>General Protocol Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_PROTOCOL_NUMBER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.IncomingImpl <em>Incoming</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.IncomingImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getIncoming()
	 * @generated
	 */
	public static final int INCOMING = 7;

	/**
	 * The feature id for the '<em><b>Attached Files Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING__ATTACHED_FILES_DESCRIPTION = REGISTRY_RECORD__ATTACHED_FILES_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING__COMMENTS = REGISTRY_RECORD__COMMENTS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING__SUBJECT = REGISTRY_RECORD__SUBJECT;

	/**
	 * The feature id for the '<em><b>Filepaths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING__FILEPATHS = REGISTRY_RECORD__FILEPATHS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING__TYPE = REGISTRY_RECORD__TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING__ID = REGISTRY_RECORD__ID;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING__CLASSIFICATION = REGISTRY_RECORD__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Ada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING__ADA = REGISTRY_RECORD__ADA;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING__DOCUMENT = REGISTRY_RECORD__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING__TAG = REGISTRY_RECORD__TAG;

	/**
	 * The feature id for the '<em><b>Registrynumber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING__REGISTRYNUMBER = REGISTRY_RECORD__REGISTRYNUMBER;

	/**
	 * The feature id for the '<em><b>Recipients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING__RECIPIENTS = REGISTRY_RECORD__RECIPIENTS;

	/**
	 * The feature id for the '<em><b>Related To Outgoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING__RELATED_TO_OUTGOING = REGISTRY_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING__SENDER = REGISTRY_RECORD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Agrexagrim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING__AGREXAGRIM = REGISTRY_RECORD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Incoming</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING_FEATURE_COUNT = REGISTRY_RECORD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.IncomingStatusHistoryImpl <em>Incoming Status History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.IncomingStatusHistoryImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getIncomingStatusHistory()
	 * @generated
	 */
	public static final int INCOMING_STATUS_HISTORY = 8;

	/**
	 * The feature id for the '<em><b>Log Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING_STATUS_HISTORY__LOG_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Incoming thread eid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING_STATUS_HISTORY__INCOMING_THREAD_EID = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING_STATUS_HISTORY__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Internal Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING_STATUS_HISTORY__INTERNAL_NUMBER = 3;

	/**
	 * The number of structural features of the '<em>Incoming Status History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING_STATUS_HISTORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.AgrexAgrimImpl <em>Agrex Agrim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.AgrexAgrimImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getAgrexAgrim()
	 * @generated
	 */
	public static final int AGREX_AGRIM = 9;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREX_AGRIM__QUANTITY = 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREX_AGRIM__PRODUCT = 1;

	/**
	 * The number of structural features of the '<em>Agrex Agrim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREX_AGRIM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.AgrixProductImpl <em>Agrix Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.AgrixProductImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getAgrixProduct()
	 * @generated
	 */
	public static final int AGRIX_PRODUCT = 10;

	/**
	 * The feature id for the '<em><b>Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGRIX_PRODUCT__PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGRIX_PRODUCT__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Agrix Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGRIX_PRODUCT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.ProducerImpl <em>Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.ProducerImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getProducer()
	 * @generated
	 */
	public static final int PRODUCER = 11;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCER__FIRSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCER__LASTNAME = 1;

	/**
	 * The feature id for the '<em><b>Afm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCER__AFM = 2;

	/**
	 * The feature id for the '<em><b>Fathername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCER__FATHERNAME = 3;

	/**
	 * The feature id for the '<em><b>Idno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCER__IDNO = 4;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCER__PHONE1 = 5;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCER__PHONE2 = 6;

	/**
	 * The feature id for the '<em><b>Mobilephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCER__MOBILEPHONE = 7;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCER__ADDRESS = 8;

	/**
	 * The number of structural features of the '<em>Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCER_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.DocumentImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getDocument()
	 * @generated
	 */
	public static final int DOCUMENT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Currentstatus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__CURRENTSTATUS = 1;

	/**
	 * The feature id for the '<em><b>Initialstatus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__INITIALSTATUS = 2;

	/**
	 * The feature id for the '<em><b>Last Done Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__LAST_DONE_DATE = 3;

	/**
	 * The feature id for the '<em><b>Last Accept Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__LAST_ACCEPT_DATE = 4;

	/**
	 * The feature id for the '<em><b>Physical Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__PHYSICAL_LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__ACTION = 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__COMMENTS = 7;

	/**
	 * The feature id for the '<em><b>Accepting Units</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__ACCEPTING_UNITS = 8;

	/**
	 * The feature id for the '<em><b>Thread Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__THREAD_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Internal Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__INTERNAL_NUMBER = 10;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.IncomingCommonSubjectImpl <em>Incoming Common Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.IncomingCommonSubjectImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getIncomingCommonSubject()
	 * @generated
	 */
	public static final int INCOMING_COMMON_SUBJECT = 13;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING_COMMON_SUBJECT__SUBJECT = 0;

	/**
	 * The feature id for the '<em><b>Directorate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING_COMMON_SUBJECT__DIRECTORATE_ID = 1;

	/**
	 * The number of structural features of the '<em>Incoming Common Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCOMING_COMMON_SUBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.OutgoingCommonSubjectImpl <em>Outgoing Common Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.OutgoingCommonSubjectImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getOutgoingCommonSubject()
	 * @generated
	 */
	public static final int OUTGOING_COMMON_SUBJECT = 14;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING_COMMON_SUBJECT__SUBJECT = 0;

	/**
	 * The feature id for the '<em><b>Directorate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING_COMMON_SUBJECT__DIRECTORATE_ID = 1;

	/**
	 * The number of structural features of the '<em>Outgoing Common Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTGOING_COMMON_SUBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.StatusImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getStatus()
	 * @generated
	 */
	public static final int STATUS = 15;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATUS__HANDLER = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATUS__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATUS__DATE = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATUS__OWNER = 3;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATUS__LOG = 4;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.EmployeeDescriptorImpl <em>Employee Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.EmployeeDescriptorImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getEmployeeDescriptor()
	 * @generated
	 */
	public static final int EMPLOYEE_DESCRIPTOR = 16;

	/**
	 * The feature id for the '<em><b>Unit Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYEE_DESCRIPTOR__UNIT_PATH = 0;

	/**
	 * The feature id for the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYEE_DESCRIPTOR__UNIT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Directorate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYEE_DESCRIPTOR__DIRECTORATE = 2;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYEE_DESCRIPTOR__FULL_NAME = 3;

	/**
	 * The feature id for the '<em><b>Unit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYEE_DESCRIPTOR__UNIT_ID = 4;

	/**
	 * The feature id for the '<em><b>Registration Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYEE_DESCRIPTOR__REGISTRATION_NUMBER = 5;

	/**
	 * The number of structural features of the '<em>Employee Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYEE_DESCRIPTOR_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.InternalNumberImpl <em>Internal Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.InternalNumberImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getInternalNumber()
	 * @generated
	 */
	public static final int INTERNAL_NUMBER = 17;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_NUMBER__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Directorate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_NUMBER__DIRECTORATE_ID = 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_NUMBER__YEAR = 2;

	/**
	 * The number of structural features of the '<em>Internal Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_NUMBER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.SenderImpl <em>Sender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.SenderImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getSender()
	 * @generated
	 */
	public static final int SENDER = 18;

	/**
	 * The feature id for the '<em><b>Afm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENDER__AFM = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENDER__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENDER__NAME = 2;

	/**
	 * The feature id for the '<em><b>Phones</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENDER__PHONES = 3;

	/**
	 * The feature id for the '<em><b>Registry Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENDER__REGISTRY_NUMBER = 4;

	/**
	 * The number of structural features of the '<em>Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENDER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.PostageInfoImpl <em>Postage Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.PostageInfoImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getPostageInfo()
	 * @generated
	 */
	public static final int POSTAGE_INFO = 19;

	/**
	 * The feature id for the '<em><b>Postage Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSTAGE_INFO__POSTAGE_TIME = 0;

	/**
	 * The feature id for the '<em><b>Postage Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSTAGE_INFO__POSTAGE_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Voucher Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSTAGE_INFO__VOUCHER_NUMBER = 2;

	/**
	 * The number of structural features of the '<em>Postage Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSTAGE_INFO_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.SenderRegistryNumberImpl <em>Sender Registry Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.SenderRegistryNumberImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getSenderRegistryNumber()
	 * @generated
	 */
	public static final int SENDER_REGISTRY_NUMBER = 20;

	/**
	 * The feature id for the '<em><b>Registry Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENDER_REGISTRY_NUMBER__REGISTRY_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENDER_REGISTRY_NUMBER__DATE = 1;

	/**
	 * The number of structural features of the '<em>Sender Registry Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENDER_REGISTRY_NUMBER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.StateTransitionImpl <em>State Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.StateTransitionImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getStateTransition()
	 * @generated
	 */
	public static final int STATE_TRANSITION = 21;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_TRANSITION__STATE = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_TRANSITION__OPERATION = 1;

	/**
	 * The number of structural features of the '<em>State Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.RegistryNumberImpl <em>Registry Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.RegistryNumberImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getRegistryNumber()
	 * @generated
	 */
	public static final int REGISTRY_NUMBER = 23;

	/**
	 * The feature id for the '<em><b>Registry Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_NUMBER__REGISTRY_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_NUMBER__YEAR = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_NUMBER__DATE = 2;

	/**
	 * The number of structural features of the '<em>Registry Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_NUMBER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.pprls.registration.impl.RegistrationServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.impl.RegistrationServiceImpl
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getRegistrationService()
	 * @generated
	 */
	public static final int REGISTRATION_SERVICE = 24;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRATION_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pprls.registration.FileType <em>File Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.FileType
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getFileType()
	 * @generated
	 */
	public static final int FILE_TYPE = 25;

	/**
	 * The meta object id for the '{@link org.pprls.registration.Year <em>Year</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.Year
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getYear()
	 * @generated
	 */
	public static final int YEAR = 26;

	/**
	 * The meta object id for the '{@link org.pprls.registration.DocumentType <em>Document Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.DocumentType
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getDocumentType()
	 * @generated
	 */
	public static final int DOCUMENT_TYPE = 27;

	/**
	 * The meta object id for the '{@link org.pprls.registration.PostalMethod <em>Postal Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.PostalMethod
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getPostalMethod()
	 * @generated
	 */
	public static final int POSTAL_METHOD = 28;

	/**
	 * The meta object id for the '{@link org.pprls.registration.DocumentStatus <em>Document Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.DocumentStatus
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getDocumentStatus()
	 * @generated
	 */
	public static final int DOCUMENT_STATUS = 29;

	/**
	 * The meta object id for the '{@link org.pprls.registration.MeasurementUnits <em>Measurement Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.MeasurementUnits
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getMeasurementUnits()
	 * @generated
	 */
	public static final int MEASUREMENT_UNITS = 30;

	/**
	 * The meta object id for the '{@link org.pprls.registration.AgrixProductTypes <em>Agrix Product Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.AgrixProductTypes
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getAgrixProductTypes()
	 * @generated
	 */
	public static final int AGRIX_PRODUCT_TYPES = 31;

	/**
	 * The meta object id for the '{@link org.pprls.registration.IncomingDocumentOperations <em>Incoming Document Operations</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.IncomingDocumentOperations
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getIncomingDocumentOperations()
	 * @generated
	 */
	public static final int INCOMING_DOCUMENT_OPERATIONS = 32;

	/**
	 * The meta object id for the '{@link org.pprls.registration.OutgoingDocumentOperations <em>Outgoing Document Operations</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.OutgoingDocumentOperations
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getOutgoingDocumentOperations()
	 * @generated
	 */
	public static final int OUTGOING_DOCUMENT_OPERATIONS = 33;

	/**
	 * The meta object id for the '{@link org.pprls.registration.Action <em>Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.Action
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getAction()
	 * @generated
	 */
	public static final int ACTION = 34;

	/**
	 * The meta object id for the '{@link org.pprls.registration.ThreadType <em>Thread Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.ThreadType
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getThreadType()
	 * @generated
	 */
	public static final int THREAD_TYPE = 35;

	/**
	 * The meta object id for the '{@link org.pprls.registration.Classification <em>Classification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.Classification
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getClassification()
	 * @generated
	 */
	public static final int CLASSIFICATION = 36;

	/**
	 * The meta object id for the '{@link org.pprls.registration.RecipientType <em>Recipient Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pprls.registration.RecipientType
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getRecipientType()
	 * @generated
	 */
	public static final int RECIPIENT_TYPE = 37;

	/**
	 * The meta object id for the '<em>Document Id Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.UUID
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getDocumentIdType()
	 * @generated
	 */
	public static final int DOCUMENT_ID_TYPE = 38;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#getDate()
	 * @generated
	 */
	public static final int DATE = 39;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispatcherOrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispatcherUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recipientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outgoingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalProtocolNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispatcherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomingStatusHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agrexAgrimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agrixProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass producerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomingCommonSubjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outgoingCommonSubjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postageInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderRegistryNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registrationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fileTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yearEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum postalMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measurementUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum agrixProductTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum incomingDocumentOperationsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum outgoingDocumentOperationsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum threadTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classificationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recipientTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType documentIdTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.pprls.registration.impl.RegistrationPackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RegistrationPackageImpl() {
		super(eNS_URI, ((EFactory)RegistrationFactory.INSTANCE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RegistrationPackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RegistrationPackageImpl init() {
		if (isInited) return (RegistrationPackageImpl)EPackage.Registry.INSTANCE.getEPackage(RegistrationPackageImpl.eNS_URI);

		// Obtain or create and register package
		RegistrationPackageImpl theRegistrationPackage = (RegistrationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RegistrationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RegistrationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI) : ServicesPackageImpl.eINSTANCE);

		// Create package meta-data objects
		theRegistrationPackage.createPackageContents();
		theServicesPackage.createPackageContents();

		// Initialize created meta-data
		theRegistrationPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRegistrationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RegistrationPackageImpl.eNS_URI, theRegistrationPackage);
		return theRegistrationPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.pprls.registration.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.pprls.registration.Tag
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.pprls.registration.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	public EAttribute getTag_Name() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.DispatcherOrganization <em>Dispatcher Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispatcher Organization</em>'.
	 * @see org.pprls.registration.DispatcherOrganization
	 * @generated
	 */
	public EClass getDispatcherOrganization() {
		return dispatcherOrganizationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.DispatcherOrganization#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.pprls.registration.DispatcherOrganization#getLabel()
	 * @see #getDispatcherOrganization()
	 * @generated
	 */
	public EAttribute getDispatcherOrganization_Label() {
		return (EAttribute)dispatcherOrganizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.DispatcherOrganization#getLatinName <em>Latin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latin Name</em>'.
	 * @see org.pprls.registration.DispatcherOrganization#getLatinName()
	 * @see #getDispatcherOrganization()
	 * @generated
	 */
	public EAttribute getDispatcherOrganization_LatinName() {
		return (EAttribute)dispatcherOrganizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.DispatcherOrganization#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.pprls.registration.DispatcherOrganization#isActive()
	 * @see #getDispatcherOrganization()
	 * @generated
	 */
	public EAttribute getDispatcherOrganization_Active() {
		return (EAttribute)dispatcherOrganizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.pprls.registration.DispatcherOrganization#getHasUnits <em>Has Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Units</em>'.
	 * @see org.pprls.registration.DispatcherOrganization#getHasUnits()
	 * @see #getDispatcherOrganization()
	 * @generated
	 */
	public EReference getDispatcherOrganization_HasUnits() {
		return (EReference)dispatcherOrganizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.DispatcherUnit <em>Dispatcher Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispatcher Unit</em>'.
	 * @see org.pprls.registration.DispatcherUnit
	 * @generated
	 */
	public EClass getDispatcherUnit() {
		return dispatcherUnitEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link org.pprls.registration.DispatcherUnit#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see org.pprls.registration.DispatcherUnit#getBelongsTo()
	 * @see #getDispatcherUnit()
	 * @generated
	 */
	public EReference getDispatcherUnit_BelongsTo() {
		return (EReference)dispatcherUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.DispatcherUnit#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.pprls.registration.DispatcherUnit#getLabel()
	 * @see #getDispatcherUnit()
	 * @generated
	 */
	public EAttribute getDispatcherUnit_Label() {
		return (EAttribute)dispatcherUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.Recipient <em>Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipient</em>'.
	 * @see org.pprls.registration.Recipient
	 * @generated
	 */
	public EClass getRecipient() {
		return recipientEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Recipient#getVatId <em>Vat Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vat Id</em>'.
	 * @see org.pprls.registration.Recipient#getVatId()
	 * @see #getRecipient()
	 * @generated
	 */
	public EAttribute getRecipient_VatId() {
		return (EAttribute)recipientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Recipient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.pprls.registration.Recipient#getName()
	 * @see #getRecipient()
	 * @generated
	 */
	public EAttribute getRecipient_Name() {
		return (EAttribute)recipientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Recipient#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.pprls.registration.Recipient#getAddress()
	 * @see #getRecipient()
	 * @generated
	 */
	public EAttribute getRecipient_Address() {
		return (EAttribute)recipientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Recipient#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.pprls.registration.Recipient#getComments()
	 * @see #getRecipient()
	 * @generated
	 */
	public EAttribute getRecipient_Comments() {
		return (EAttribute)recipientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Recipient#getInternalUnitId <em>Internal Unit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Unit Id</em>'.
	 * @see org.pprls.registration.Recipient#getInternalUnitId()
	 * @see #getRecipient()
	 * @generated
	 */
	public EAttribute getRecipient_InternalUnitId() {
		return (EAttribute)recipientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link org.pprls.registration.Recipient#getPostageinfo <em>Postageinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Postageinfo</em>'.
	 * @see org.pprls.registration.Recipient#getPostageinfo()
	 * @see #getRecipient()
	 * @generated
	 */
	public EReference getRecipient_Postageinfo() {
		return (EReference)recipientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Recipient#getRecipientType <em>Recipient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recipient Type</em>'.
	 * @see org.pprls.registration.Recipient#getRecipientType()
	 * @see #getRecipient()
	 * @generated
	 */
	public EAttribute getRecipient_RecipientType() {
		return (EAttribute)recipientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.Outgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outgoing</em>'.
	 * @see org.pprls.registration.Outgoing
	 * @generated
	 */
	public EClass getOutgoing() {
		return outgoingEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link org.pprls.registration.Outgoing#getReissued <em>Reissued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reissued</em>'.
	 * @see org.pprls.registration.Outgoing#getReissued()
	 * @see #getOutgoing()
	 * @generated
	 */
	public EReference getOutgoing_Reissued() {
		return (EReference)outgoingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link org.pprls.registration.Outgoing#getRelatedIncoming <em>Related Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Incoming</em>'.
	 * @see org.pprls.registration.Outgoing#getRelatedIncoming()
	 * @see #getOutgoing()
	 * @generated
	 */
	public EReference getOutgoing_RelatedIncoming() {
		return (EReference)outgoingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Outgoing#getNumberOfRepeats <em>Number Of Repeats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Repeats</em>'.
	 * @see org.pprls.registration.Outgoing#getNumberOfRepeats()
	 * @see #getOutgoing()
	 * @generated
	 */
	public EAttribute getOutgoing_NumberOfRepeats() {
		return (EAttribute)outgoingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.pprls.registration.Outgoing#getEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Editor</em>'.
	 * @see org.pprls.registration.Outgoing#getEditor()
	 * @see #getOutgoing()
	 * @generated
	 */
	public EReference getOutgoing_Editor() {
		return (EReference)outgoingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.GeneralProtocolNumber <em>General Protocol Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Protocol Number</em>'.
	 * @see org.pprls.registration.GeneralProtocolNumber
	 * @generated
	 */
	public EClass getGeneralProtocolNumber() {
		return generalProtocolNumberEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.GeneralProtocolNumber#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see org.pprls.registration.GeneralProtocolNumber#getYear()
	 * @see #getGeneralProtocolNumber()
	 * @generated
	 */
	public EAttribute getGeneralProtocolNumber_Year() {
		return (EAttribute)generalProtocolNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.GeneralProtocolNumber#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.pprls.registration.GeneralProtocolNumber#getNumber()
	 * @see #getGeneralProtocolNumber()
	 * @generated
	 */
	public EAttribute getGeneralProtocolNumber_Number() {
		return (EAttribute)generalProtocolNumberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.Dispatcher <em>Dispatcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispatcher</em>'.
	 * @see org.pprls.registration.Dispatcher
	 * @generated
	 */
	public EClass getDispatcher() {
		return dispatcherEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Dispatcher#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see org.pprls.registration.Dispatcher#getUid()
	 * @see #getDispatcher()
	 * @generated
	 */
	public EAttribute getDispatcher_Uid() {
		return (EAttribute)dispatcherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.Incoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incoming</em>'.
	 * @see org.pprls.registration.Incoming
	 * @generated
	 */
	public EClass getIncoming() {
		return incomingEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Incoming#isRelatedToOutgoing <em>Related To Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Related To Outgoing</em>'.
	 * @see org.pprls.registration.Incoming#isRelatedToOutgoing()
	 * @see #getIncoming()
	 * @generated
	 */
	public EAttribute getIncoming_RelatedToOutgoing() {
		return (EAttribute)incomingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.pprls.registration.Incoming#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sender</em>'.
	 * @see org.pprls.registration.Incoming#getSender()
	 * @see #getIncoming()
	 * @generated
	 */
	public EReference getIncoming_Sender() {
		return (EReference)incomingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link org.pprls.registration.Incoming#getAgrexagrim <em>Agrexagrim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agrexagrim</em>'.
	 * @see org.pprls.registration.Incoming#getAgrexagrim()
	 * @see #getIncoming()
	 * @generated
	 */
	public EReference getIncoming_Agrexagrim() {
		return (EReference)incomingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.IncomingStatusHistory <em>Incoming Status History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incoming Status History</em>'.
	 * @see org.pprls.registration.IncomingStatusHistory
	 * @generated
	 */
	public EClass getIncomingStatusHistory() {
		return incomingStatusHistoryEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.IncomingStatusHistory#getLogMessage <em>Log Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Message</em>'.
	 * @see org.pprls.registration.IncomingStatusHistory#getLogMessage()
	 * @see #getIncomingStatusHistory()
	 * @generated
	 */
	public EAttribute getIncomingStatusHistory_LogMessage() {
		return (EAttribute)incomingStatusHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.IncomingStatusHistory#getIncoming_thread_e_id <em>Incoming thread eid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incoming thread eid</em>'.
	 * @see org.pprls.registration.IncomingStatusHistory#getIncoming_thread_e_id()
	 * @see #getIncomingStatusHistory()
	 * @generated
	 */
	public EAttribute getIncomingStatusHistory_Incoming_thread_e_id() {
		return (EAttribute)incomingStatusHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link org.pprls.registration.IncomingStatusHistory#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.pprls.registration.IncomingStatusHistory#getStatus()
	 * @see #getIncomingStatusHistory()
	 * @generated
	 */
	public EReference getIncomingStatusHistory_Status() {
		return (EReference)incomingStatusHistoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link org.pprls.registration.IncomingStatusHistory#getInternalNumber <em>Internal Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Number</em>'.
	 * @see org.pprls.registration.IncomingStatusHistory#getInternalNumber()
	 * @see #getIncomingStatusHistory()
	 * @generated
	 */
	public EReference getIncomingStatusHistory_InternalNumber() {
		return (EReference)incomingStatusHistoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.AgrexAgrim <em>Agrex Agrim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agrex Agrim</em>'.
	 * @see org.pprls.registration.AgrexAgrim
	 * @generated
	 */
	public EClass getAgrexAgrim() {
		return agrexAgrimEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.AgrexAgrim#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.pprls.registration.AgrexAgrim#getQuantity()
	 * @see #getAgrexAgrim()
	 * @generated
	 */
	public EAttribute getAgrexAgrim_Quantity() {
		return (EAttribute)agrexAgrimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link org.pprls.registration.AgrexAgrim#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.pprls.registration.AgrexAgrim#getProduct()
	 * @see #getAgrexAgrim()
	 * @generated
	 */
	public EReference getAgrexAgrim_Product() {
		return (EReference)agrexAgrimEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.AgrixProduct <em>Agrix Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agrix Product</em>'.
	 * @see org.pprls.registration.AgrixProduct
	 * @generated
	 */
	public EClass getAgrixProduct() {
		return agrixProductEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.AgrixProduct#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product</em>'.
	 * @see org.pprls.registration.AgrixProduct#getProduct()
	 * @see #getAgrixProduct()
	 * @generated
	 */
	public EAttribute getAgrixProduct_Product() {
		return (EAttribute)agrixProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.AgrixProduct#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.pprls.registration.AgrixProduct#getUnit()
	 * @see #getAgrixProduct()
	 * @generated
	 */
	public EAttribute getAgrixProduct_Unit() {
		return (EAttribute)agrixProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.Producer <em>Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Producer</em>'.
	 * @see org.pprls.registration.Producer
	 * @generated
	 */
	public EClass getProducer() {
		return producerEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Producer#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see org.pprls.registration.Producer#getFirstname()
	 * @see #getProducer()
	 * @generated
	 */
	public EAttribute getProducer_Firstname() {
		return (EAttribute)producerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Producer#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see org.pprls.registration.Producer#getLastname()
	 * @see #getProducer()
	 * @generated
	 */
	public EAttribute getProducer_Lastname() {
		return (EAttribute)producerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Producer#getAfm <em>Afm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Afm</em>'.
	 * @see org.pprls.registration.Producer#getAfm()
	 * @see #getProducer()
	 * @generated
	 */
	public EAttribute getProducer_Afm() {
		return (EAttribute)producerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Producer#getFathername <em>Fathername</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fathername</em>'.
	 * @see org.pprls.registration.Producer#getFathername()
	 * @see #getProducer()
	 * @generated
	 */
	public EAttribute getProducer_Fathername() {
		return (EAttribute)producerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Producer#getIdno <em>Idno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idno</em>'.
	 * @see org.pprls.registration.Producer#getIdno()
	 * @see #getProducer()
	 * @generated
	 */
	public EAttribute getProducer_Idno() {
		return (EAttribute)producerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Producer#getPhone1 <em>Phone1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone1</em>'.
	 * @see org.pprls.registration.Producer#getPhone1()
	 * @see #getProducer()
	 * @generated
	 */
	public EAttribute getProducer_Phone1() {
		return (EAttribute)producerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Producer#getPhone2 <em>Phone2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone2</em>'.
	 * @see org.pprls.registration.Producer#getPhone2()
	 * @see #getProducer()
	 * @generated
	 */
	public EAttribute getProducer_Phone2() {
		return (EAttribute)producerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Producer#getMobilephone <em>Mobilephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mobilephone</em>'.
	 * @see org.pprls.registration.Producer#getMobilephone()
	 * @see #getProducer()
	 * @generated
	 */
	public EAttribute getProducer_Mobilephone() {
		return (EAttribute)producerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Producer#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.pprls.registration.Producer#getAddress()
	 * @see #getProducer()
	 * @generated
	 */
	public EAttribute getProducer_Address() {
		return (EAttribute)producerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see org.pprls.registration.Document
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Document#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.pprls.registration.Document#getId()
	 * @see #getDocument()
	 * @generated
	 */
	public EAttribute getDocument_Id() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link org.pprls.registration.Document#getCurrentstatus <em>Currentstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currentstatus</em>'.
	 * @see org.pprls.registration.Document#getCurrentstatus()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_Currentstatus() {
		return (EReference)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link org.pprls.registration.Document#getInitialstatus <em>Initialstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initialstatus</em>'.
	 * @see org.pprls.registration.Document#getInitialstatus()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_Initialstatus() {
		return (EReference)documentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Document#getLastDoneDate <em>Last Done Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Done Date</em>'.
	 * @see org.pprls.registration.Document#getLastDoneDate()
	 * @see #getDocument()
	 * @generated
	 */
	public EAttribute getDocument_LastDoneDate() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Document#getLastAcceptDate <em>Last Accept Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Accept Date</em>'.
	 * @see org.pprls.registration.Document#getLastAcceptDate()
	 * @see #getDocument()
	 * @generated
	 */
	public EAttribute getDocument_LastAcceptDate() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Document#getPhysicalLocation <em>Physical Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Location</em>'.
	 * @see org.pprls.registration.Document#getPhysicalLocation()
	 * @see #getDocument()
	 * @generated
	 */
	public EAttribute getDocument_PhysicalLocation() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Document#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.pprls.registration.Document#getAction()
	 * @see #getDocument()
	 * @generated
	 */
	public EAttribute getDocument_Action() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Document#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.pprls.registration.Document#getComments()
	 * @see #getDocument()
	 * @generated
	 */
	public EAttribute getDocument_Comments() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.pprls.registration.Document#getAcceptingUnits <em>Accepting Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepting Units</em>'.
	 * @see org.pprls.registration.Document#getAcceptingUnits()
	 * @see #getDocument()
	 * @generated
	 */
	public EAttribute getDocument_AcceptingUnits() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Document#getThreadType <em>Thread Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Type</em>'.
	 * @see org.pprls.registration.Document#getThreadType()
	 * @see #getDocument()
	 * @generated
	 */
	public EAttribute getDocument_ThreadType() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference '{@link org.pprls.registration.Document#getInternalNumber <em>Internal Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Number</em>'.
	 * @see org.pprls.registration.Document#getInternalNumber()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_InternalNumber() {
		return (EReference)documentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.IncomingCommonSubject <em>Incoming Common Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incoming Common Subject</em>'.
	 * @see org.pprls.registration.IncomingCommonSubject
	 * @generated
	 */
	public EClass getIncomingCommonSubject() {
		return incomingCommonSubjectEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.IncomingCommonSubject#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see org.pprls.registration.IncomingCommonSubject#getSubject()
	 * @see #getIncomingCommonSubject()
	 * @generated
	 */
	public EAttribute getIncomingCommonSubject_Subject() {
		return (EAttribute)incomingCommonSubjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.IncomingCommonSubject#getDirectorateId <em>Directorate Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directorate Id</em>'.
	 * @see org.pprls.registration.IncomingCommonSubject#getDirectorateId()
	 * @see #getIncomingCommonSubject()
	 * @generated
	 */
	public EAttribute getIncomingCommonSubject_DirectorateId() {
		return (EAttribute)incomingCommonSubjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.OutgoingCommonSubject <em>Outgoing Common Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outgoing Common Subject</em>'.
	 * @see org.pprls.registration.OutgoingCommonSubject
	 * @generated
	 */
	public EClass getOutgoingCommonSubject() {
		return outgoingCommonSubjectEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.OutgoingCommonSubject#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see org.pprls.registration.OutgoingCommonSubject#getSubject()
	 * @see #getOutgoingCommonSubject()
	 * @generated
	 */
	public EAttribute getOutgoingCommonSubject_Subject() {
		return (EAttribute)outgoingCommonSubjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.OutgoingCommonSubject#getDirectorateId <em>Directorate Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directorate Id</em>'.
	 * @see org.pprls.registration.OutgoingCommonSubject#getDirectorateId()
	 * @see #getOutgoingCommonSubject()
	 * @generated
	 */
	public EAttribute getOutgoingCommonSubject_DirectorateId() {
		return (EAttribute)outgoingCommonSubjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see org.pprls.registration.Status
	 * @generated
	 */
	public EClass getStatus() {
		return statusEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.pprls.registration.Status#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler</em>'.
	 * @see org.pprls.registration.Status#getHandler()
	 * @see #getStatus()
	 * @generated
	 */
	public EReference getStatus_Handler() {
		return (EReference)statusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Status#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.pprls.registration.Status#getStatus()
	 * @see #getStatus()
	 * @generated
	 */
	public EAttribute getStatus_Status() {
		return (EAttribute)statusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Status#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.pprls.registration.Status#getDate()
	 * @see #getStatus()
	 * @generated
	 */
	public EAttribute getStatus_Date() {
		return (EAttribute)statusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.pprls.registration.Status#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owner</em>'.
	 * @see org.pprls.registration.Status#getOwner()
	 * @see #getStatus()
	 * @generated
	 */
	public EReference getStatus_Owner() {
		return (EReference)statusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Status#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log</em>'.
	 * @see org.pprls.registration.Status#getLog()
	 * @see #getStatus()
	 * @generated
	 */
	public EAttribute getStatus_Log() {
		return (EAttribute)statusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.EmployeeDescriptor <em>Employee Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee Descriptor</em>'.
	 * @see org.pprls.registration.EmployeeDescriptor
	 * @generated
	 */
	public EClass getEmployeeDescriptor() {
		return employeeDescriptorEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.EmployeeDescriptor#getUnitPath <em>Unit Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Path</em>'.
	 * @see org.pprls.registration.EmployeeDescriptor#getUnitPath()
	 * @see #getEmployeeDescriptor()
	 * @generated
	 */
	public EAttribute getEmployeeDescriptor_UnitPath() {
		return (EAttribute)employeeDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.EmployeeDescriptor#getUnitName <em>Unit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Name</em>'.
	 * @see org.pprls.registration.EmployeeDescriptor#getUnitName()
	 * @see #getEmployeeDescriptor()
	 * @generated
	 */
	public EAttribute getEmployeeDescriptor_UnitName() {
		return (EAttribute)employeeDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.EmployeeDescriptor#getDirectorate <em>Directorate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directorate</em>'.
	 * @see org.pprls.registration.EmployeeDescriptor#getDirectorate()
	 * @see #getEmployeeDescriptor()
	 * @generated
	 */
	public EAttribute getEmployeeDescriptor_Directorate() {
		return (EAttribute)employeeDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.EmployeeDescriptor#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see org.pprls.registration.EmployeeDescriptor#getFullName()
	 * @see #getEmployeeDescriptor()
	 * @generated
	 */
	public EAttribute getEmployeeDescriptor_FullName() {
		return (EAttribute)employeeDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.EmployeeDescriptor#getUnitId <em>Unit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Id</em>'.
	 * @see org.pprls.registration.EmployeeDescriptor#getUnitId()
	 * @see #getEmployeeDescriptor()
	 * @generated
	 */
	public EAttribute getEmployeeDescriptor_UnitId() {
		return (EAttribute)employeeDescriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.EmployeeDescriptor#getRegistrationNumber <em>Registration Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration Number</em>'.
	 * @see org.pprls.registration.EmployeeDescriptor#getRegistrationNumber()
	 * @see #getEmployeeDescriptor()
	 * @generated
	 */
	public EAttribute getEmployeeDescriptor_RegistrationNumber() {
		return (EAttribute)employeeDescriptorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.InternalNumber <em>Internal Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Number</em>'.
	 * @see org.pprls.registration.InternalNumber
	 * @generated
	 */
	public EClass getInternalNumber() {
		return internalNumberEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.InternalNumber#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.pprls.registration.InternalNumber#getNumber()
	 * @see #getInternalNumber()
	 * @generated
	 */
	public EAttribute getInternalNumber_Number() {
		return (EAttribute)internalNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.InternalNumber#getDirectorateId <em>Directorate Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directorate Id</em>'.
	 * @see org.pprls.registration.InternalNumber#getDirectorateId()
	 * @see #getInternalNumber()
	 * @generated
	 */
	public EAttribute getInternalNumber_DirectorateId() {
		return (EAttribute)internalNumberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.InternalNumber#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see org.pprls.registration.InternalNumber#getYear()
	 * @see #getInternalNumber()
	 * @generated
	 */
	public EAttribute getInternalNumber_Year() {
		return (EAttribute)internalNumberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.Sender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender</em>'.
	 * @see org.pprls.registration.Sender
	 * @generated
	 */
	public EClass getSender() {
		return senderEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Sender#getAfm <em>Afm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Afm</em>'.
	 * @see org.pprls.registration.Sender#getAfm()
	 * @see #getSender()
	 * @generated
	 */
	public EAttribute getSender_Afm() {
		return (EAttribute)senderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Sender#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.pprls.registration.Sender#getAddress()
	 * @see #getSender()
	 * @generated
	 */
	public EAttribute getSender_Address() {
		return (EAttribute)senderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.Sender#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.pprls.registration.Sender#getName()
	 * @see #getSender()
	 * @generated
	 */
	public EAttribute getSender_Name() {
		return (EAttribute)senderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.pprls.registration.Sender#getPhones <em>Phones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Phones</em>'.
	 * @see org.pprls.registration.Sender#getPhones()
	 * @see #getSender()
	 * @generated
	 */
	public EAttribute getSender_Phones() {
		return (EAttribute)senderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link org.pprls.registration.Sender#getRegistryNumber <em>Registry Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registry Number</em>'.
	 * @see org.pprls.registration.Sender#getRegistryNumber()
	 * @see #getSender()
	 * @generated
	 */
	public EReference getSender_RegistryNumber() {
		return (EReference)senderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.PostageInfo <em>Postage Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postage Info</em>'.
	 * @see org.pprls.registration.PostageInfo
	 * @generated
	 */
	public EClass getPostageInfo() {
		return postageInfoEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.PostageInfo#getPostageTime <em>Postage Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postage Time</em>'.
	 * @see org.pprls.registration.PostageInfo#getPostageTime()
	 * @see #getPostageInfo()
	 * @generated
	 */
	public EAttribute getPostageInfo_PostageTime() {
		return (EAttribute)postageInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.PostageInfo#getPostageMethod <em>Postage Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postage Method</em>'.
	 * @see org.pprls.registration.PostageInfo#getPostageMethod()
	 * @see #getPostageInfo()
	 * @generated
	 */
	public EAttribute getPostageInfo_PostageMethod() {
		return (EAttribute)postageInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.PostageInfo#getVoucherNumber <em>Voucher Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voucher Number</em>'.
	 * @see org.pprls.registration.PostageInfo#getVoucherNumber()
	 * @see #getPostageInfo()
	 * @generated
	 */
	public EAttribute getPostageInfo_VoucherNumber() {
		return (EAttribute)postageInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.SenderRegistryNumber <em>Sender Registry Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Registry Number</em>'.
	 * @see org.pprls.registration.SenderRegistryNumber
	 * @generated
	 */
	public EClass getSenderRegistryNumber() {
		return senderRegistryNumberEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.SenderRegistryNumber#getRegistryNumber <em>Registry Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registry Number</em>'.
	 * @see org.pprls.registration.SenderRegistryNumber#getRegistryNumber()
	 * @see #getSenderRegistryNumber()
	 * @generated
	 */
	public EAttribute getSenderRegistryNumber_RegistryNumber() {
		return (EAttribute)senderRegistryNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.SenderRegistryNumber#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.pprls.registration.SenderRegistryNumber#getDate()
	 * @see #getSenderRegistryNumber()
	 * @generated
	 */
	public EAttribute getSenderRegistryNumber_Date() {
		return (EAttribute)senderRegistryNumberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.StateTransition <em>State Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Transition</em>'.
	 * @see org.pprls.registration.StateTransition
	 * @generated
	 */
	public EClass getStateTransition() {
		return stateTransitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.StateTransition#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.pprls.registration.StateTransition#getState()
	 * @see #getStateTransition()
	 * @generated
	 */
	public EAttribute getStateTransition_State() {
		return (EAttribute)stateTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.StateTransition#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.pprls.registration.StateTransition#getOperation()
	 * @see #getStateTransition()
	 * @generated
	 */
	public EAttribute getStateTransition_Operation() {
		return (EAttribute)stateTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.RegistryRecord <em>Registry Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Record</em>'.
	 * @see org.pprls.registration.RegistryRecord
	 * @generated
	 */
	public EClass getRegistryRecord() {
		return registryRecordEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.RegistryRecord#getAttachedFilesDescription <em>Attached Files Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attached Files Description</em>'.
	 * @see org.pprls.registration.RegistryRecord#getAttachedFilesDescription()
	 * @see #getRegistryRecord()
	 * @generated
	 */
	public EAttribute getRegistryRecord_AttachedFilesDescription() {
		return (EAttribute)registryRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.RegistryRecord#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.pprls.registration.RegistryRecord#getComments()
	 * @see #getRegistryRecord()
	 * @generated
	 */
	public EAttribute getRegistryRecord_Comments() {
		return (EAttribute)registryRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.RegistryRecord#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see org.pprls.registration.RegistryRecord#getSubject()
	 * @see #getRegistryRecord()
	 * @generated
	 */
	public EAttribute getRegistryRecord_Subject() {
		return (EAttribute)registryRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.pprls.registration.RegistryRecord#getFilepaths <em>Filepaths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Filepaths</em>'.
	 * @see org.pprls.registration.RegistryRecord#getFilepaths()
	 * @see #getRegistryRecord()
	 * @generated
	 */
	public EAttribute getRegistryRecord_Filepaths() {
		return (EAttribute)registryRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.RegistryRecord#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.pprls.registration.RegistryRecord#getType()
	 * @see #getRegistryRecord()
	 * @generated
	 */
	public EAttribute getRegistryRecord_Type() {
		return (EAttribute)registryRecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.RegistryRecord#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.pprls.registration.RegistryRecord#getId()
	 * @see #getRegistryRecord()
	 * @generated
	 */
	public EAttribute getRegistryRecord_Id() {
		return (EAttribute)registryRecordEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.RegistryRecord#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see org.pprls.registration.RegistryRecord#getClassification()
	 * @see #getRegistryRecord()
	 * @generated
	 */
	public EAttribute getRegistryRecord_Classification() {
		return (EAttribute)registryRecordEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.RegistryRecord#getAda <em>Ada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ada</em>'.
	 * @see org.pprls.registration.RegistryRecord#getAda()
	 * @see #getRegistryRecord()
	 * @generated
	 */
	public EAttribute getRegistryRecord_Ada() {
		return (EAttribute)registryRecordEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.pprls.registration.RegistryRecord#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document</em>'.
	 * @see org.pprls.registration.RegistryRecord#getDocument()
	 * @see #getRegistryRecord()
	 * @generated
	 */
	public EReference getRegistryRecord_Document() {
		return (EReference)registryRecordEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference '{@link org.pprls.registration.RegistryRecord#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tag</em>'.
	 * @see org.pprls.registration.RegistryRecord#getTag()
	 * @see #getRegistryRecord()
	 * @generated
	 */
	public EReference getRegistryRecord_Tag() {
		return (EReference)registryRecordEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference '{@link org.pprls.registration.RegistryRecord#getRegistrynumber <em>Registrynumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registrynumber</em>'.
	 * @see org.pprls.registration.RegistryRecord#getRegistrynumber()
	 * @see #getRegistryRecord()
	 * @generated
	 */
	public EReference getRegistryRecord_Registrynumber() {
		return (EReference)registryRecordEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.pprls.registration.RegistryRecord#getRecipients <em>Recipients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recipients</em>'.
	 * @see org.pprls.registration.RegistryRecord#getRecipients()
	 * @see #getRegistryRecord()
	 * @generated
	 */
	public EReference getRegistryRecord_Recipients() {
		return (EReference)registryRecordEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.RegistryNumber <em>Registry Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Number</em>'.
	 * @see org.pprls.registration.RegistryNumber
	 * @generated
	 */
	public EClass getRegistryNumber() {
		return registryNumberEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.RegistryNumber#getRegistryNumber <em>Registry Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registry Number</em>'.
	 * @see org.pprls.registration.RegistryNumber#getRegistryNumber()
	 * @see #getRegistryNumber()
	 * @generated
	 */
	public EAttribute getRegistryNumber_RegistryNumber() {
		return (EAttribute)registryNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.RegistryNumber#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see org.pprls.registration.RegistryNumber#getYear()
	 * @see #getRegistryNumber()
	 * @generated
	 */
	public EAttribute getRegistryNumber_Year() {
		return (EAttribute)registryNumberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.pprls.registration.RegistryNumber#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.pprls.registration.RegistryNumber#getDate()
	 * @see #getRegistryNumber()
	 * @generated
	 */
	public EAttribute getRegistryNumber_Date() {
		return (EAttribute)registryNumberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link org.pprls.registration.RegistrationService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.pprls.registration.RegistrationService
	 * @generated
	 */
	public EClass getRegistrationService() {
		return registrationServiceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link org.pprls.registration.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>File Type</em>'.
	 * @see org.pprls.registration.FileType
	 * @generated
	 */
	public EEnum getFileType() {
		return fileTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.pprls.registration.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Year</em>'.
	 * @see org.pprls.registration.Year
	 * @generated
	 */
	public EEnum getYear() {
		return yearEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.pprls.registration.DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Type</em>'.
	 * @see org.pprls.registration.DocumentType
	 * @generated
	 */
	public EEnum getDocumentType() {
		return documentTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.pprls.registration.PostalMethod <em>Postal Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Postal Method</em>'.
	 * @see org.pprls.registration.PostalMethod
	 * @generated
	 */
	public EEnum getPostalMethod() {
		return postalMethodEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.pprls.registration.DocumentStatus <em>Document Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Status</em>'.
	 * @see org.pprls.registration.DocumentStatus
	 * @generated
	 */
	public EEnum getDocumentStatus() {
		return documentStatusEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.pprls.registration.MeasurementUnits <em>Measurement Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measurement Units</em>'.
	 * @see org.pprls.registration.MeasurementUnits
	 * @generated
	 */
	public EEnum getMeasurementUnits() {
		return measurementUnitsEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.pprls.registration.AgrixProductTypes <em>Agrix Product Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Agrix Product Types</em>'.
	 * @see org.pprls.registration.AgrixProductTypes
	 * @generated
	 */
	public EEnum getAgrixProductTypes() {
		return agrixProductTypesEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.pprls.registration.IncomingDocumentOperations <em>Incoming Document Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Incoming Document Operations</em>'.
	 * @see org.pprls.registration.IncomingDocumentOperations
	 * @generated
	 */
	public EEnum getIncomingDocumentOperations() {
		return incomingDocumentOperationsEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.pprls.registration.OutgoingDocumentOperations <em>Outgoing Document Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Outgoing Document Operations</em>'.
	 * @see org.pprls.registration.OutgoingDocumentOperations
	 * @generated
	 */
	public EEnum getOutgoingDocumentOperations() {
		return outgoingDocumentOperationsEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.pprls.registration.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action</em>'.
	 * @see org.pprls.registration.Action
	 * @generated
	 */
	public EEnum getAction() {
		return actionEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.pprls.registration.ThreadType <em>Thread Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Thread Type</em>'.
	 * @see org.pprls.registration.ThreadType
	 * @generated
	 */
	public EEnum getThreadType() {
		return threadTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.pprls.registration.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Classification</em>'.
	 * @see org.pprls.registration.Classification
	 * @generated
	 */
	public EEnum getClassification() {
		return classificationEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.pprls.registration.RecipientType <em>Recipient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Recipient Type</em>'.
	 * @see org.pprls.registration.RecipientType
	 * @generated
	 */
	public EEnum getRecipientType() {
		return recipientTypeEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link java.util.UUID <em>Document Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Document Id Type</em>'.
	 * @see java.util.UUID
	 * @generated
	 */
	public EDataType getDocumentIdType() {
		return documentIdTypeEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RegistrationFactory getRegistrationFactory() {
		return (RegistrationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__NAME);

		dispatcherOrganizationEClass = createEClass(DISPATCHER_ORGANIZATION);
		createEAttribute(dispatcherOrganizationEClass, DISPATCHER_ORGANIZATION__LABEL);
		createEAttribute(dispatcherOrganizationEClass, DISPATCHER_ORGANIZATION__LATIN_NAME);
		createEAttribute(dispatcherOrganizationEClass, DISPATCHER_ORGANIZATION__ACTIVE);
		createEReference(dispatcherOrganizationEClass, DISPATCHER_ORGANIZATION__HAS_UNITS);

		dispatcherUnitEClass = createEClass(DISPATCHER_UNIT);
		createEReference(dispatcherUnitEClass, DISPATCHER_UNIT__BELONGS_TO);
		createEAttribute(dispatcherUnitEClass, DISPATCHER_UNIT__LABEL);

		recipientEClass = createEClass(RECIPIENT);
		createEAttribute(recipientEClass, RECIPIENT__VAT_ID);
		createEAttribute(recipientEClass, RECIPIENT__NAME);
		createEAttribute(recipientEClass, RECIPIENT__ADDRESS);
		createEAttribute(recipientEClass, RECIPIENT__COMMENTS);
		createEAttribute(recipientEClass, RECIPIENT__INTERNAL_UNIT_ID);
		createEReference(recipientEClass, RECIPIENT__POSTAGEINFO);
		createEAttribute(recipientEClass, RECIPIENT__RECIPIENT_TYPE);

		outgoingEClass = createEClass(OUTGOING);
		createEReference(outgoingEClass, OUTGOING__REISSUED);
		createEReference(outgoingEClass, OUTGOING__RELATED_INCOMING);
		createEAttribute(outgoingEClass, OUTGOING__NUMBER_OF_REPEATS);
		createEReference(outgoingEClass, OUTGOING__EDITOR);

		generalProtocolNumberEClass = createEClass(GENERAL_PROTOCOL_NUMBER);
		createEAttribute(generalProtocolNumberEClass, GENERAL_PROTOCOL_NUMBER__YEAR);
		createEAttribute(generalProtocolNumberEClass, GENERAL_PROTOCOL_NUMBER__NUMBER);

		dispatcherEClass = createEClass(DISPATCHER);
		createEAttribute(dispatcherEClass, DISPATCHER__UID);

		incomingEClass = createEClass(INCOMING);
		createEAttribute(incomingEClass, INCOMING__RELATED_TO_OUTGOING);
		createEReference(incomingEClass, INCOMING__SENDER);
		createEReference(incomingEClass, INCOMING__AGREXAGRIM);

		incomingStatusHistoryEClass = createEClass(INCOMING_STATUS_HISTORY);
		createEAttribute(incomingStatusHistoryEClass, INCOMING_STATUS_HISTORY__LOG_MESSAGE);
		createEAttribute(incomingStatusHistoryEClass, INCOMING_STATUS_HISTORY__INCOMING_THREAD_EID);
		createEReference(incomingStatusHistoryEClass, INCOMING_STATUS_HISTORY__STATUS);
		createEReference(incomingStatusHistoryEClass, INCOMING_STATUS_HISTORY__INTERNAL_NUMBER);

		agrexAgrimEClass = createEClass(AGREX_AGRIM);
		createEAttribute(agrexAgrimEClass, AGREX_AGRIM__QUANTITY);
		createEReference(agrexAgrimEClass, AGREX_AGRIM__PRODUCT);

		agrixProductEClass = createEClass(AGRIX_PRODUCT);
		createEAttribute(agrixProductEClass, AGRIX_PRODUCT__PRODUCT);
		createEAttribute(agrixProductEClass, AGRIX_PRODUCT__UNIT);

		producerEClass = createEClass(PRODUCER);
		createEAttribute(producerEClass, PRODUCER__FIRSTNAME);
		createEAttribute(producerEClass, PRODUCER__LASTNAME);
		createEAttribute(producerEClass, PRODUCER__AFM);
		createEAttribute(producerEClass, PRODUCER__FATHERNAME);
		createEAttribute(producerEClass, PRODUCER__IDNO);
		createEAttribute(producerEClass, PRODUCER__PHONE1);
		createEAttribute(producerEClass, PRODUCER__PHONE2);
		createEAttribute(producerEClass, PRODUCER__MOBILEPHONE);
		createEAttribute(producerEClass, PRODUCER__ADDRESS);

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__ID);
		createEReference(documentEClass, DOCUMENT__CURRENTSTATUS);
		createEReference(documentEClass, DOCUMENT__INITIALSTATUS);
		createEAttribute(documentEClass, DOCUMENT__LAST_DONE_DATE);
		createEAttribute(documentEClass, DOCUMENT__LAST_ACCEPT_DATE);
		createEAttribute(documentEClass, DOCUMENT__PHYSICAL_LOCATION);
		createEAttribute(documentEClass, DOCUMENT__ACTION);
		createEAttribute(documentEClass, DOCUMENT__COMMENTS);
		createEAttribute(documentEClass, DOCUMENT__ACCEPTING_UNITS);
		createEAttribute(documentEClass, DOCUMENT__THREAD_TYPE);
		createEReference(documentEClass, DOCUMENT__INTERNAL_NUMBER);

		incomingCommonSubjectEClass = createEClass(INCOMING_COMMON_SUBJECT);
		createEAttribute(incomingCommonSubjectEClass, INCOMING_COMMON_SUBJECT__SUBJECT);
		createEAttribute(incomingCommonSubjectEClass, INCOMING_COMMON_SUBJECT__DIRECTORATE_ID);

		outgoingCommonSubjectEClass = createEClass(OUTGOING_COMMON_SUBJECT);
		createEAttribute(outgoingCommonSubjectEClass, OUTGOING_COMMON_SUBJECT__SUBJECT);
		createEAttribute(outgoingCommonSubjectEClass, OUTGOING_COMMON_SUBJECT__DIRECTORATE_ID);

		statusEClass = createEClass(STATUS);
		createEReference(statusEClass, STATUS__HANDLER);
		createEAttribute(statusEClass, STATUS__STATUS);
		createEAttribute(statusEClass, STATUS__DATE);
		createEReference(statusEClass, STATUS__OWNER);
		createEAttribute(statusEClass, STATUS__LOG);

		employeeDescriptorEClass = createEClass(EMPLOYEE_DESCRIPTOR);
		createEAttribute(employeeDescriptorEClass, EMPLOYEE_DESCRIPTOR__UNIT_PATH);
		createEAttribute(employeeDescriptorEClass, EMPLOYEE_DESCRIPTOR__UNIT_NAME);
		createEAttribute(employeeDescriptorEClass, EMPLOYEE_DESCRIPTOR__DIRECTORATE);
		createEAttribute(employeeDescriptorEClass, EMPLOYEE_DESCRIPTOR__FULL_NAME);
		createEAttribute(employeeDescriptorEClass, EMPLOYEE_DESCRIPTOR__UNIT_ID);
		createEAttribute(employeeDescriptorEClass, EMPLOYEE_DESCRIPTOR__REGISTRATION_NUMBER);

		internalNumberEClass = createEClass(INTERNAL_NUMBER);
		createEAttribute(internalNumberEClass, INTERNAL_NUMBER__NUMBER);
		createEAttribute(internalNumberEClass, INTERNAL_NUMBER__DIRECTORATE_ID);
		createEAttribute(internalNumberEClass, INTERNAL_NUMBER__YEAR);

		senderEClass = createEClass(SENDER);
		createEAttribute(senderEClass, SENDER__AFM);
		createEAttribute(senderEClass, SENDER__ADDRESS);
		createEAttribute(senderEClass, SENDER__NAME);
		createEAttribute(senderEClass, SENDER__PHONES);
		createEReference(senderEClass, SENDER__REGISTRY_NUMBER);

		postageInfoEClass = createEClass(POSTAGE_INFO);
		createEAttribute(postageInfoEClass, POSTAGE_INFO__POSTAGE_TIME);
		createEAttribute(postageInfoEClass, POSTAGE_INFO__POSTAGE_METHOD);
		createEAttribute(postageInfoEClass, POSTAGE_INFO__VOUCHER_NUMBER);

		senderRegistryNumberEClass = createEClass(SENDER_REGISTRY_NUMBER);
		createEAttribute(senderRegistryNumberEClass, SENDER_REGISTRY_NUMBER__REGISTRY_NUMBER);
		createEAttribute(senderRegistryNumberEClass, SENDER_REGISTRY_NUMBER__DATE);

		stateTransitionEClass = createEClass(STATE_TRANSITION);
		createEAttribute(stateTransitionEClass, STATE_TRANSITION__STATE);
		createEAttribute(stateTransitionEClass, STATE_TRANSITION__OPERATION);

		registryRecordEClass = createEClass(REGISTRY_RECORD);
		createEAttribute(registryRecordEClass, REGISTRY_RECORD__ATTACHED_FILES_DESCRIPTION);
		createEAttribute(registryRecordEClass, REGISTRY_RECORD__COMMENTS);
		createEAttribute(registryRecordEClass, REGISTRY_RECORD__SUBJECT);
		createEAttribute(registryRecordEClass, REGISTRY_RECORD__FILEPATHS);
		createEAttribute(registryRecordEClass, REGISTRY_RECORD__TYPE);
		createEAttribute(registryRecordEClass, REGISTRY_RECORD__ID);
		createEAttribute(registryRecordEClass, REGISTRY_RECORD__CLASSIFICATION);
		createEAttribute(registryRecordEClass, REGISTRY_RECORD__ADA);
		createEReference(registryRecordEClass, REGISTRY_RECORD__DOCUMENT);
		createEReference(registryRecordEClass, REGISTRY_RECORD__TAG);
		createEReference(registryRecordEClass, REGISTRY_RECORD__REGISTRYNUMBER);
		createEReference(registryRecordEClass, REGISTRY_RECORD__RECIPIENTS);

		registryNumberEClass = createEClass(REGISTRY_NUMBER);
		createEAttribute(registryNumberEClass, REGISTRY_NUMBER__REGISTRY_NUMBER);
		createEAttribute(registryNumberEClass, REGISTRY_NUMBER__YEAR);
		createEAttribute(registryNumberEClass, REGISTRY_NUMBER__DATE);

		registrationServiceEClass = createEClass(REGISTRATION_SERVICE);

		// Create enums
		fileTypeEEnum = createEEnum(FILE_TYPE);
		yearEEnum = createEEnum(YEAR);
		documentTypeEEnum = createEEnum(DOCUMENT_TYPE);
		postalMethodEEnum = createEEnum(POSTAL_METHOD);
		documentStatusEEnum = createEEnum(DOCUMENT_STATUS);
		measurementUnitsEEnum = createEEnum(MEASUREMENT_UNITS);
		agrixProductTypesEEnum = createEEnum(AGRIX_PRODUCT_TYPES);
		incomingDocumentOperationsEEnum = createEEnum(INCOMING_DOCUMENT_OPERATIONS);
		outgoingDocumentOperationsEEnum = createEEnum(OUTGOING_DOCUMENT_OPERATIONS);
		actionEEnum = createEEnum(ACTION);
		threadTypeEEnum = createEEnum(THREAD_TYPE);
		classificationEEnum = createEEnum(CLASSIFICATION);
		recipientTypeEEnum = createEEnum(RECIPIENT_TYPE);

		// Create data types
		documentIdTypeEDataType = createEDataType(DOCUMENT_ID_TYPE);
		dateEDataType = createEDataType(DATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dispatcherOrganizationEClass.getESuperTypes().add(this.getDispatcher());
		dispatcherUnitEClass.getESuperTypes().add(this.getDispatcher());
		outgoingEClass.getESuperTypes().add(this.getRegistryRecord());
		incomingEClass.getESuperTypes().add(this.getRegistryRecord());

		// Initialize classes and features; add operations and parameters
		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Name(), theXMLTypePackage.getString(), "name", "", 1, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(tagEClass, null, "newOperation1", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dispatcherOrganizationEClass, DispatcherOrganization.class, "DispatcherOrganization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDispatcherOrganization_Label(), theXMLTypePackage.getString(), "label", "", 0, 1, DispatcherOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDispatcherOrganization_LatinName(), theXMLTypePackage.getString(), "latinName", null, 0, 1, DispatcherOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDispatcherOrganization_Active(), theXMLTypePackage.getBoolean(), "active", null, 0, 1, DispatcherOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDispatcherOrganization_HasUnits(), this.getDispatcherUnit(), null, "hasUnits", null, 0, -1, DispatcherOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dispatcherUnitEClass, DispatcherUnit.class, "DispatcherUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDispatcherUnit_BelongsTo(), this.getDispatcherOrganization(), null, "belongsTo", null, 1, 1, DispatcherUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDispatcherUnit_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, DispatcherUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recipientEClass, Recipient.class, "Recipient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecipient_VatId(), theXMLTypePackage.getString(), "vatId", "", 0, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecipient_Name(), theXMLTypePackage.getString(), "name", "", 1, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecipient_Address(), theXMLTypePackage.getString(), "address", "", 0, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecipient_Comments(), theXMLTypePackage.getString(), "comments", "", 0, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecipient_InternalUnitId(), theXMLTypePackage.getShort(), "internalUnitId", "-1", 0, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipient_Postageinfo(), this.getPostageInfo(), null, "postageinfo", null, 0, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecipient_RecipientType(), this.getRecipientType(), "recipientType", null, 0, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(recipientEClass, this.getPostageInfo(), "createPostageInfo", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getDate(), "postageDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPostalMethod(), "postalMethod", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "voucherNumber", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(outgoingEClass, Outgoing.class, "Outgoing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutgoing_Reissued(), this.getOutgoing(), null, "reissued", null, 0, 1, Outgoing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutgoing_RelatedIncoming(), this.getIncoming(), null, "relatedIncoming", null, 0, 1, Outgoing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutgoing_NumberOfRepeats(), theXMLTypePackage.getInt(), "numberOfRepeats", "0", 0, 1, Outgoing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getOutgoing_Editor(), this.getEmployeeDescriptor(), null, "editor", null, 1, -1, Outgoing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(outgoingEClass, this.getEmployeeDescriptor(), "getBasicEditor", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(outgoingEClass, this.getEmployeeDescriptor(), "getOwner", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(outgoingEClass, this.getDocumentStatus(), "getState", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(outgoingEClass, theXMLTypePackage.getBoolean(), "isSigned", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(outgoingEClass, null, "close", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEmployeeDescriptor(), "handler", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "log", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(outgoingEClass, this.getOutgoing(), "reissue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(generalProtocolNumberEClass, GeneralProtocolNumber.class, "GeneralProtocolNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralProtocolNumber_Year(), this.getYear(), "year", null, 1, 1, GeneralProtocolNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralProtocolNumber_Number(), theXMLTypePackage.getShort(), "number", null, 1, 1, GeneralProtocolNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dispatcherEClass, Dispatcher.class, "Dispatcher", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDispatcher_Uid(), theXMLTypePackage.getInt(), "uid", null, 0, 1, Dispatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(dispatcherEClass, theXMLTypePackage.getString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(incomingEClass, Incoming.class, "Incoming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncoming_RelatedToOutgoing(), theXMLTypePackage.getBoolean(), "relatedToOutgoing", "false", 1, 1, Incoming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncoming_Sender(), this.getSender(), null, "sender", null, 1, -1, Incoming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncoming_Agrexagrim(), this.getAgrexAgrim(), null, "agrexagrim", null, 0, 1, Incoming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(incomingEClass, this.getSender(), "createSender", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "afm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "address", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "phones", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "registryNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getDate(), "date", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(incomingEClass, theXMLTypePackage.getBoolean(), "hasSenderRegistryNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(incomingEClass, this.getSenderRegistryNumber(), "getSenderRegistryNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(incomingEClass, this.getOutgoing(), "reply", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(incomingStatusHistoryEClass, IncomingStatusHistory.class, "IncomingStatusHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncomingStatusHistory_LogMessage(), theXMLTypePackage.getString(), "logMessage", null, 0, 1, IncomingStatusHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncomingStatusHistory_Incoming_thread_e_id(), theXMLTypePackage.getShort(), "incoming_thread_e_id", "0", 1, 1, IncomingStatusHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncomingStatusHistory_Status(), this.getStatus(), null, "status", null, 1, 1, IncomingStatusHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncomingStatusHistory_InternalNumber(), this.getInternalNumber(), null, "internalNumber", null, 1, 1, IncomingStatusHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agrexAgrimEClass, AgrexAgrim.class, "AgrexAgrim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgrexAgrim_Quantity(), theXMLTypePackage.getDecimal(), "quantity", null, 0, 1, AgrexAgrim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgrexAgrim_Product(), this.getAgrixProduct(), null, "product", null, 0, 1, AgrexAgrim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agrixProductEClass, AgrixProduct.class, "AgrixProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgrixProduct_Product(), this.getAgrixProductTypes(), "product", null, 0, 1, AgrixProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgrixProduct_Unit(), this.getMeasurementUnits(), "unit", null, 0, 1, AgrixProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(producerEClass, Producer.class, "Producer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProducer_Firstname(), theXMLTypePackage.getString(), "firstname", "", 1, 1, Producer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducer_Lastname(), theXMLTypePackage.getString(), "lastname", "", 1, 1, Producer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducer_Afm(), theXMLTypePackage.getString(), "afm", "", 1, 1, Producer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducer_Fathername(), theXMLTypePackage.getString(), "fathername", "", 1, 1, Producer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducer_Idno(), theXMLTypePackage.getString(), "idno", "", 1, 1, Producer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducer_Phone1(), theXMLTypePackage.getString(), "phone1", "", 1, 1, Producer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducer_Phone2(), theXMLTypePackage.getString(), "phone2", "", 1, 1, Producer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducer_Mobilephone(), theXMLTypePackage.getString(), "mobilephone", "", 1, 1, Producer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducer_Address(), theXMLTypePackage.getString(), "address", "", 1, 1, Producer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_Id(), this.getDocumentIdType(), "id", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_Currentstatus(), this.getStatus(), null, "currentstatus", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_Initialstatus(), this.getStatus(), null, "initialstatus", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_LastDoneDate(), this.getDate(), "lastDoneDate", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_LastAcceptDate(), this.getDate(), "lastAcceptDate", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_PhysicalLocation(), theXMLTypePackage.getString(), "physicalLocation", "", 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Action(), this.getAction(), "action", "", 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Comments(), theXMLTypePackage.getString(), "comments", "", 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_AcceptingUnits(), theXMLTypePackage.getShort(), "acceptingUnits", null, 1, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_ThreadType(), this.getThreadType(), "threadType", "RECIPIENT", 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_InternalNumber(), this.getInternalNumber(), null, "internalNumber", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(documentEClass, this.getInternalNumber(), "getCurrentInternalNunber", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentEClass, null, "cancel", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEmployeeDescriptor(), "handler", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "log", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentEClass, null, "close", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEmployeeDescriptor(), "handler", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "log", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentEClass, null, "accept", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEmployeeDescriptor(), "handler", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "log", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentEClass, null, "forward", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEmployeeDescriptor(), "owner", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEmployeeDescriptor(), "handler", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "log", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentEClass, theXMLTypePackage.getBoolean(), "hasBeenThroughThisDirectorateBefore", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getShort(), "directorateId", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(documentEClass, this.getIncomingDocumentOperations(), "allowedOperationsFromThisState", 1, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentEClass, null, "changeState", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIncomingDocumentOperations(), "operation", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "logMessage", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEmployeeDescriptor(), "handler", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(documentEClass, this.getEmployeeDescriptor(), "getOwner", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(documentEClass, theXMLTypePackage.getBoolean(), "isPending", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(documentEClass, theXMLTypePackage.getBoolean(), "isAccepted", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(documentEClass, theXMLTypePackage.getBooleanObject(), "isDone", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(documentEClass, theXMLTypePackage.getBoolean(), "isCancelled", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(documentEClass, this.getDocumentStatus(), "getState", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(incomingCommonSubjectEClass, IncomingCommonSubject.class, "IncomingCommonSubject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncomingCommonSubject_Subject(), theXMLTypePackage.getString(), "subject", null, 0, 1, IncomingCommonSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncomingCommonSubject_DirectorateId(), theXMLTypePackage.getShort(), "directorateId", null, 0, 1, IncomingCommonSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outgoingCommonSubjectEClass, OutgoingCommonSubject.class, "OutgoingCommonSubject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutgoingCommonSubject_Subject(), theXMLTypePackage.getString(), "subject", null, 0, 1, OutgoingCommonSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutgoingCommonSubject_DirectorateId(), theXMLTypePackage.getShort(), "directorateId", null, 0, 1, OutgoingCommonSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusEClass, Status.class, "Status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatus_Handler(), this.getEmployeeDescriptor(), null, "handler", null, 1, 1, Status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatus_Status(), this.getDocumentStatus(), "status", "\u03a3\u03b5 \u03b1\u03bd\u03b1\u03bc\u03bf\u03bd\u03ae", 1, 1, Status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatus_Date(), theXMLTypePackage.getDate(), "date", null, 1, 1, Status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatus_Owner(), this.getEmployeeDescriptor(), null, "owner", null, 1, 1, Status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatus_Log(), theXMLTypePackage.getString(), "log", null, 1, 1, Status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(employeeDescriptorEClass, EmployeeDescriptor.class, "EmployeeDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployeeDescriptor_UnitPath(), theXMLTypePackage.getString(), "unitPath", "", 1, 1, EmployeeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployeeDescriptor_UnitName(), theXMLTypePackage.getString(), "unitName", null, 1, 1, EmployeeDescriptor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployeeDescriptor_Directorate(), theXMLTypePackage.getString(), "directorate", null, 1, 1, EmployeeDescriptor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployeeDescriptor_FullName(), theXMLTypePackage.getString(), "fullName", "", 1, 1, EmployeeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployeeDescriptor_UnitId(), theXMLTypePackage.getShort(), "unitId", null, 1, 1, EmployeeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployeeDescriptor_RegistrationNumber(), theXMLTypePackage.getShort(), "registrationNumber", null, 1, 1, EmployeeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(employeeDescriptorEClass, null, "newOperation1", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(internalNumberEClass, InternalNumber.class, "InternalNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalNumber_Number(), theXMLTypePackage.getLong(), "number", null, 1, 1, InternalNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalNumber_DirectorateId(), theXMLTypePackage.getShort(), "directorateId", "-1", 1, 1, InternalNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalNumber_Year(), this.getYear(), "year", null, 1, 1, InternalNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(internalNumberEClass, theXMLTypePackage.getBoolean(), "hasBeenSet", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(senderEClass, Sender.class, "Sender", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSender_Afm(), theXMLTypePackage.getString(), "Afm", "000000000", 1, 1, Sender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSender_Address(), theXMLTypePackage.getString(), "address", "", 1, 1, Sender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSender_Name(), theXMLTypePackage.getString(), "name", "", 1, 1, Sender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSender_Phones(), theXMLTypePackage.getString(), "phones", "", 1, -1, Sender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSender_RegistryNumber(), this.getSenderRegistryNumber(), null, "registryNumber", null, 1, 1, Sender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(senderEClass, theXMLTypePackage.getBoolean(), "hasRegistryNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(senderEClass, null, "setRegistryNumber", 1, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "number", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getDate(), "date", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(postageInfoEClass, PostageInfo.class, "PostageInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostageInfo_PostageTime(), this.getDate(), "postageTime", null, 0, 1, PostageInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostageInfo_PostageMethod(), this.getPostalMethod(), "postageMethod", "", 0, 1, PostageInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostageInfo_VoucherNumber(), theXMLTypePackage.getString(), "voucherNumber", "", 1, 1, PostageInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senderRegistryNumberEClass, SenderRegistryNumber.class, "SenderRegistryNumber", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSenderRegistryNumber_RegistryNumber(), theXMLTypePackage.getString(), "registryNumber", null, 1, 1, SenderRegistryNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSenderRegistryNumber_Date(), this.getDate(), "date", null, 0, 1, SenderRegistryNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateTransitionEClass, StateTransition.class, "StateTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateTransition_State(), this.getDocumentStatus(), "state", "\u03a3\u03b5 \u03b1\u03bd\u03b1\u03bc\u03bf\u03bd\u03ae", 1, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateTransition_Operation(), this.getIncomingDocumentOperations(), "operation", null, 1, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryRecordEClass, RegistryRecord.class, "RegistryRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegistryRecord_AttachedFilesDescription(), theXMLTypePackage.getString(), "attachedFilesDescription", "", 0, 1, RegistryRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryRecord_Comments(), theXMLTypePackage.getString(), "comments", "", 0, 1, RegistryRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryRecord_Subject(), theXMLTypePackage.getString(), "subject", "", 1, 1, RegistryRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryRecord_Filepaths(), theXMLTypePackage.getString(), "filepaths", "", 0, -1, RegistryRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryRecord_Type(), this.getDocumentType(), "type", null, 1, 1, RegistryRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryRecord_Id(), this.getDocumentIdType(), "id", null, 1, 1, RegistryRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryRecord_Classification(), this.getClassification(), "classification", "\u0395\u03c3\u03c9\u03c4\u03b5\u03c1\u03b9\u03ba\u03cc", 0, 1, RegistryRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryRecord_Ada(), theXMLTypePackage.getString(), "ada", "", 0, 1, RegistryRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryRecord_Document(), this.getDocument(), null, "document", null, 1, -1, RegistryRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRegistryRecord_Tag(), this.getTag(), null, "tag", null, 0, 1, RegistryRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryRecord_Registrynumber(), this.getRegistryNumber(), null, "registrynumber", null, 1, 1, RegistryRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryRecord_Recipients(), this.getRecipient(), null, "recipients", null, 1, -1, RegistryRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(registryRecordEClass, theXMLTypePackage.getBoolean(), "requiresProtocolNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(registryRecordEClass, this.getDocument(), "getThreadForId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDocumentIdType(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(registryRecordEClass, this.getDocument(), "startNewThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEmployeeDescriptor(), "handler", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEmployeeDescriptor(), "owner", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAction(), "action", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "comments", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInternalNumber(), "number", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(registryRecordEClass, null, "cancelAllThreads", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(registryRecordEClass, null, "reserve", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEmployeeDescriptor(), "handler", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEmployeeDescriptor(), "owner", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInternalNumber(), "number", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(registryRecordEClass, theXMLTypePackage.getBoolean(), "canEdit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(registryRecordEClass, null, "cancel", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEmployeeDescriptor(), "handler", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "log", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(registryRecordEClass, theXMLTypePackage.getBoolean(), "isCancelled", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(registryRecordEClass, null, "revert", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEmployeeDescriptor(), "handler", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "log", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(registryRecordEClass, theXMLTypePackage.getString(), "mapToFilepath", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "filepath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(registryNumberEClass, RegistryNumber.class, "RegistryNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegistryNumber_RegistryNumber(), theXMLTypePackage.getShort(), "registryNumber", null, 0, 1, RegistryNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryNumber_Year(), this.getYear(), "year", null, 0, 1, RegistryNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryNumber_Date(), this.getDate(), "date", null, 1, 1, RegistryNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registrationServiceEClass, RegistrationService.class, "RegistrationService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(registrationServiceEClass, this.getRegistryNumber(), "getNumberForYear", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYear(), "year", 1, 1, IS_UNIQUE, IS_ORDERED);


		// Initialize data types
		initEDataType(documentIdTypeEDataType, UUID.class, "DocumentIdType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// teneo.jpa
		createTeneoAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (tagEClass, 
		   source, 
		   new String[] {
			 "name", "Tag"
		   });	
		addAnnotation
		  (getIncoming_RelatedToOutgoing(), 
		   source, 
		   new String[] {
			 "name", "relatedToOutgoing"
		   });
	}

	/**
	 * Initializes the annotations for <b>teneo.jpa</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneoAnnotations() {
		String source = "teneo.jpa";	
		addAnnotation
		  (getDispatcherOrganization_Active(), 
		   source, 
		   new String[] {
			 "value", "@Type(type = \"org.hibernate.type.NumericBooleanType\")"
		   });	
		addAnnotation
		  (getDispatcherUnit_BelongsTo(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(HbFetchType.SELECT)"
		   });	
		addAnnotation
		  (getOutgoing_RelatedIncoming(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOutgoing_NumberOfRepeats(), 
		   source, 
		   new String[] {
			 "appinfo", " @Formula(\"(select count(*) from Outgoing o where o.outgoing_reissued_e_id=e_id)\")"
		   });	
		addAnnotation
		  (getIncoming_RelatedToOutgoing(), 
		   source, 
		   new String[] {
			 "value", "@Type(type = \"org.hibernate.type.NumericBooleanType\")"
		   });	
		addAnnotation
		  (getProducer_Afm(), 
		   source, 
		   new String[] {
			 "appinfo", "@NaturalId"
		   });	
		addAnnotation
		  (getDocument_Initialstatus(), 
		   source, 
		   new String[] {
			 "appinfo", "\r\n@Embedded\r\n@AttributeOverrides({\r\n@AttributeOverride(name=\"unitId\", column=@Column(name=\"initialUnitId\")),   \r\n@AttributeOverride(name=\"directorateId\",column=@Column(name=\"initialDirectorateId\")),   \r\n@AttributeOverride(name=\"internalNumber\", column=@Column(name=\"initialInternalNumber\")),   \r\n@AttributeOverride(name=\"editorId\", column=@Column(name=\"initialEditorId\")),   \r\n@AttributeOverride(name=\"handlerId\", column=@Column(name=\"initialHandlerId\")) \r\n})"
		   });	
		addAnnotation
		  (statusEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Embeddable"
		   });	
		addAnnotation
		  (getStatus_Handler(), 
		   source, 
		   new String[] {
			 "appInfo", "@Embedded\r\n@AttributeOverrides({\r\n@AttributeOverride(name=\"path\", column=@Column(name=\"registeringUnitPath\"))\r\n})"
		   });	
		addAnnotation
		  (internalNumberEClass, 
		   source, 
		   new String[] {
			 "appInfo", "@Embedded\r\n@AttributeOverrides({\r\n@AttributeOverride(name=\"number\", column=@Column(name=\"internalNumber\"))\r\n})"
		   });	
		addAnnotation
		  (getSender_Phones(), 
		   source, 
		   new String[] {
			 "appinfo", "@OneToMany(fetch=EAGER)\r\n@Fetch(FetchMode.JOIN)"
		   });	
		addAnnotation
		  (getRegistryRecord_Filepaths(), 
		   source, 
		   new String[] {
			 "appinfo", " @OneToMany(fetch =EAGER,cascade=CascadeType.ALL)"
		   });	
		addAnnotation
		  (getRegistryRecord_Recipients(), 
		   source, 
		   new String[] {
			 "appinfo", " @OneToMany(fetch =EAGER)"
		   });
	}

} //RegistrationPackageImpl
