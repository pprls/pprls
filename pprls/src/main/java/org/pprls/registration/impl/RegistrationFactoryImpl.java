/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration.impl;

import java.util.UUID;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pprls.registration.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegistrationFactoryImpl extends EFactoryImpl implements RegistrationFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RegistrationFactoryImpl eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RegistrationFactoryImpl init() {
		try {
			RegistrationFactoryImpl theRegistrationFactory = (RegistrationFactoryImpl)EPackage.Registry.INSTANCE.getEFactory(RegistrationPackageImpl.eNS_URI);
			if (theRegistrationFactory != null) {
				return theRegistrationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RegistrationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RegistrationPackageImpl.TAG: return (EObject)createTag();
			case RegistrationPackageImpl.DISPATCHER_ORGANIZATION: return (EObject)createDispatcherOrganization();
			case RegistrationPackageImpl.DISPATCHER_UNIT: return (EObject)createDispatcherUnit();
			case RegistrationPackageImpl.RECIPIENT: return (EObject)createRecipient();
			case RegistrationPackageImpl.OUTGOING: return (EObject)createOutgoing();
			case RegistrationPackageImpl.GENERAL_PROTOCOL_NUMBER: return (EObject)createGeneralProtocolNumber();
			case RegistrationPackageImpl.INCOMING: return (EObject)createIncoming();
			case RegistrationPackageImpl.INCOMING_STATUS_HISTORY: return (EObject)createIncomingStatusHistory();
			case RegistrationPackageImpl.AGREX_AGRIM: return (EObject)createAgrexAgrim();
			case RegistrationPackageImpl.AGRIX_PRODUCT: return (EObject)createAgrixProduct();
			case RegistrationPackageImpl.PRODUCER: return (EObject)createProducer();
			case RegistrationPackageImpl.DOCUMENT: return (EObject)createDocument();
			case RegistrationPackageImpl.INCOMING_COMMON_SUBJECT: return (EObject)createIncomingCommonSubject();
			case RegistrationPackageImpl.OUTGOING_COMMON_SUBJECT: return (EObject)createOutgoingCommonSubject();
			case RegistrationPackageImpl.STATUS: return (EObject)createStatus();
			case RegistrationPackageImpl.EMPLOYEE_DESCRIPTOR: return (EObject)createEmployeeDescriptor();
			case RegistrationPackageImpl.INTERNAL_NUMBER: return (EObject)createInternalNumber();
			case RegistrationPackageImpl.SENDER: return (EObject)createSender();
			case RegistrationPackageImpl.POSTAGE_INFO: return (EObject)createPostageInfo();
			case RegistrationPackageImpl.STATE_TRANSITION: return (EObject)createStateTransition();
			case RegistrationPackageImpl.REGISTRY_RECORD: return (EObject)createRegistryRecord();
			case RegistrationPackageImpl.REGISTRY_NUMBER: return (EObject)createRegistryNumber();
			case RegistrationPackageImpl.REGISTRATION_SERVICE: return (EObject)createRegistrationService();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RegistrationPackageImpl.FILE_TYPE:
				return createFileTypeFromString(eDataType, initialValue);
			case RegistrationPackageImpl.YEAR:
				return createYearFromString(eDataType, initialValue);
			case RegistrationPackageImpl.DOCUMENT_TYPE:
				return createDocumentTypeFromString(eDataType, initialValue);
			case RegistrationPackageImpl.POSTAL_METHOD:
				return createPostalMethodFromString(eDataType, initialValue);
			case RegistrationPackageImpl.DOCUMENT_STATUS:
				return createDocumentStatusFromString(eDataType, initialValue);
			case RegistrationPackageImpl.MEASUREMENT_UNITS:
				return createMeasurementUnitsFromString(eDataType, initialValue);
			case RegistrationPackageImpl.AGRIX_PRODUCT_TYPES:
				return createAgrixProductTypesFromString(eDataType, initialValue);
			case RegistrationPackageImpl.INCOMING_DOCUMENT_OPERATIONS:
				return createIncomingDocumentOperationsFromString(eDataType, initialValue);
			case RegistrationPackageImpl.OUTGOING_DOCUMENT_OPERATIONS:
				return createOutgoingDocumentOperationsFromString(eDataType, initialValue);
			case RegistrationPackageImpl.ACTION:
				return createActionFromString(eDataType, initialValue);
			case RegistrationPackageImpl.THREAD_TYPE:
				return createThreadTypeFromString(eDataType, initialValue);
			case RegistrationPackageImpl.CLASSIFICATION:
				return createClassificationFromString(eDataType, initialValue);
			case RegistrationPackageImpl.RECIPIENT_TYPE:
				return createRecipientTypeFromString(eDataType, initialValue);
			case RegistrationPackageImpl.DOCUMENT_ID_TYPE:
				return createDocumentIdTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RegistrationPackageImpl.FILE_TYPE:
				return convertFileTypeToString(eDataType, instanceValue);
			case RegistrationPackageImpl.YEAR:
				return convertYearToString(eDataType, instanceValue);
			case RegistrationPackageImpl.DOCUMENT_TYPE:
				return convertDocumentTypeToString(eDataType, instanceValue);
			case RegistrationPackageImpl.POSTAL_METHOD:
				return convertPostalMethodToString(eDataType, instanceValue);
			case RegistrationPackageImpl.DOCUMENT_STATUS:
				return convertDocumentStatusToString(eDataType, instanceValue);
			case RegistrationPackageImpl.MEASUREMENT_UNITS:
				return convertMeasurementUnitsToString(eDataType, instanceValue);
			case RegistrationPackageImpl.AGRIX_PRODUCT_TYPES:
				return convertAgrixProductTypesToString(eDataType, instanceValue);
			case RegistrationPackageImpl.INCOMING_DOCUMENT_OPERATIONS:
				return convertIncomingDocumentOperationsToString(eDataType, instanceValue);
			case RegistrationPackageImpl.OUTGOING_DOCUMENT_OPERATIONS:
				return convertOutgoingDocumentOperationsToString(eDataType, instanceValue);
			case RegistrationPackageImpl.ACTION:
				return convertActionToString(eDataType, instanceValue);
			case RegistrationPackageImpl.THREAD_TYPE:
				return convertThreadTypeToString(eDataType, instanceValue);
			case RegistrationPackageImpl.CLASSIFICATION:
				return convertClassificationToString(eDataType, instanceValue);
			case RegistrationPackageImpl.RECIPIENT_TYPE:
				return convertRecipientTypeToString(eDataType, instanceValue);
			case RegistrationPackageImpl.DOCUMENT_ID_TYPE:
				return convertDocumentIdTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatcherOrganization createDispatcherOrganization() {
		DispatcherOrganizationImpl dispatcherOrganization = new DispatcherOrganizationImpl();
		return dispatcherOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatcherUnit createDispatcherUnit() {
		DispatcherUnitImpl dispatcherUnit = new DispatcherUnitImpl();
		return dispatcherUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipient createRecipient() {
		RecipientImpl recipient = new RecipientImpl();
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outgoing createOutgoing() {
		OutgoingImpl outgoing = new OutgoingImpl();
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralProtocolNumber createGeneralProtocolNumber() {
		GeneralProtocolNumberImpl generalProtocolNumber = new GeneralProtocolNumberImpl();
		return generalProtocolNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Incoming createIncoming() {
		IncomingImpl incoming = new IncomingImpl();
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingStatusHistory createIncomingStatusHistory() {
		IncomingStatusHistoryImpl incomingStatusHistory = new IncomingStatusHistoryImpl();
		return incomingStatusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgrexAgrim createAgrexAgrim() {
		AgrexAgrimImpl agrexAgrim = new AgrexAgrimImpl();
		return agrexAgrim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgrixProduct createAgrixProduct() {
		AgrixProductImpl agrixProduct = new AgrixProductImpl();
		return agrixProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Producer createProducer() {
		ProducerImpl producer = new ProducerImpl();
		return producer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingCommonSubject createIncomingCommonSubject() {
		IncomingCommonSubjectImpl incomingCommonSubject = new IncomingCommonSubjectImpl();
		return incomingCommonSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingCommonSubject createOutgoingCommonSubject() {
		OutgoingCommonSubjectImpl outgoingCommonSubject = new OutgoingCommonSubjectImpl();
		return outgoingCommonSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatus() {
		StatusImpl status = new StatusImpl();
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeDescriptor createEmployeeDescriptor() {
		EmployeeDescriptorImpl employeeDescriptor = new EmployeeDescriptorImpl();
		return employeeDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalNumber createInternalNumber() {
		InternalNumberImpl internalNumber = new InternalNumberImpl();
		return internalNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sender createSender() {
		SenderImpl sender = new SenderImpl();
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostageInfo createPostageInfo() {
		PostageInfoImpl postageInfo = new PostageInfoImpl();
		return postageInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTransition createStateTransition() {
		StateTransitionImpl stateTransition = new StateTransitionImpl();
		return stateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryRecord createRegistryRecord() {
		RegistryRecordImpl registryRecord = new RegistryRecordImpl();
		return registryRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryNumber createRegistryNumber() {
		RegistryNumberImpl registryNumber = new RegistryNumberImpl();
		return registryNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationService createRegistrationService() {
		RegistrationServiceImpl registrationService = new RegistrationServiceImpl();
		return registrationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType createFileTypeFromString(EDataType eDataType, String initialValue) {
		FileType result = FileType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year createYearFromString(EDataType eDataType, String initialValue) {
		Year result = Year.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYearToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentType createDocumentTypeFromString(EDataType eDataType, String initialValue) {
		DocumentType result = DocumentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalMethod createPostalMethodFromString(EDataType eDataType, String initialValue) {
		PostalMethod result = PostalMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPostalMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentStatus createDocumentStatusFromString(EDataType eDataType, String initialValue) {
		DocumentStatus result = DocumentStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUnits createMeasurementUnitsFromString(EDataType eDataType, String initialValue) {
		MeasurementUnits result = MeasurementUnits.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurementUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgrixProductTypes createAgrixProductTypesFromString(EDataType eDataType, String initialValue) {
		AgrixProductTypes result = AgrixProductTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAgrixProductTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingDocumentOperations createIncomingDocumentOperationsFromString(EDataType eDataType, String initialValue) {
		IncomingDocumentOperations result = IncomingDocumentOperations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIncomingDocumentOperationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingDocumentOperations createOutgoingDocumentOperationsFromString(EDataType eDataType, String initialValue) {
		OutgoingDocumentOperations result = OutgoingDocumentOperations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutgoingDocumentOperationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createActionFromString(EDataType eDataType, String initialValue) {
		Action result = Action.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadType createThreadTypeFromString(EDataType eDataType, String initialValue) {
		ThreadType result = ThreadType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThreadTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification createClassificationFromString(EDataType eDataType, String initialValue) {
		Classification result = Classification.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassificationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipientType createRecipientTypeFromString(EDataType eDataType, String initialValue) {
		RecipientType result = RecipientType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecipientTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UUID createDocumentIdTypeFromString(EDataType eDataType, String initialValue) {
		return (UUID)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentIdTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationPackageImpl getRegistrationPackage() {
		return (RegistrationPackageImpl)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RegistrationPackageImpl getPackage() {
		return RegistrationPackageImpl.eINSTANCE;
	}

} //RegistrationFactoryImpl
