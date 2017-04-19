/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;

import java.util.List;
import java.util.UUID;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registration.Document#getId <em>Id</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getCurrentstatus <em>Currentstatus</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getInitialstatus <em>Initialstatus</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getLastDoneDate <em>Last Done Date</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getLastAcceptDate <em>Last Accept Date</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getPhysicalLocation <em>Physical Location</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getAction <em>Action</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getComments <em>Comments</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getAcceptingUnits <em>Accepting Units</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getThreadType <em>Thread Type</em>}</li>
 *   <li>{@link org.pprls.registration.Document#getInternalNumber <em>Internal Number</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface Document {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(UUID)
	 * @model id="true" dataType="org.pprls.registration.DocumentIdType" required="true"
	 * @generated
	 */
	UUID getId();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(UUID value);

	/**
	 * Returns the value of the '<em><b>Currentstatus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currentstatus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currentstatus</em>' reference.
	 * @see #setCurrentstatus(Status)
	 * @model required="true"
	 * @generated
	 */
	Status getCurrentstatus();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getCurrentstatus <em>Currentstatus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currentstatus</em>' reference.
	 * @see #getCurrentstatus()
	 * @generated
	 */
	void setCurrentstatus(Status value);

	/**
	 * Returns the value of the '<em><b>Initialstatus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialstatus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialstatus</em>' reference.
	 * @see #setInitialstatus(Status)
	 * @model required="true"
	 *        annotation="teneo.jpa appinfo='\r\n@Embedded\r\n@AttributeOverrides({\r\n@AttributeOverride(name=\"unitId\", column=@Column(name=\"initialUnitId\")),   \r\n@AttributeOverride(name=\"directorateId\",column=@Column(name=\"initialDirectorateId\")),   \r\n@AttributeOverride(name=\"internalNumber\", column=@Column(name=\"initialInternalNumber\")),   \r\n@AttributeOverride(name=\"editorId\", column=@Column(name=\"initialEditorId\")),   \r\n@AttributeOverride(name=\"handlerId\", column=@Column(name=\"initialHandlerId\")) \r\n})'"
	 * @generated
	 */
	Status getInitialstatus();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getInitialstatus <em>Initialstatus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialstatus</em>' reference.
	 * @see #getInitialstatus()
	 * @generated
	 */
	void setInitialstatus(Status value);

	/**
	 * Returns the value of the '<em><b>Last Done Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Done Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Done Date</em>' attribute.
	 * @see #setLastDoneDate(XMLGregorianCalendar)
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 * @generated
	 */
	XMLGregorianCalendar getLastDoneDate();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getLastDoneDate <em>Last Done Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Done Date</em>' attribute.
	 * @see #getLastDoneDate()
	 * @generated
	 */
	void setLastDoneDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Last Accept Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Accept Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Accept Date</em>' attribute.
	 * @see #setLastAcceptDate(XMLGregorianCalendar)
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 * @generated
	 */
	XMLGregorianCalendar getLastAcceptDate();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getLastAcceptDate <em>Last Accept Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Accept Date</em>' attribute.
	 * @see #getLastAcceptDate()
	 * @generated
	 */
	void setLastAcceptDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Physical Location</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Location</em>' attribute.
	 * @see #setPhysicalLocation(String)
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getPhysicalLocation();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getPhysicalLocation <em>Physical Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Location</em>' attribute.
	 * @see #getPhysicalLocation()
	 * @generated
	 */
	void setPhysicalLocation(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.pprls.registration.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see org.pprls.registration.Action
	 * @see #setAction(Action)
	 * @model default=""
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see org.pprls.registration.Action
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Accepting Units</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Short}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepting Units</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepting Units</em>' attribute list.
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Short" required="true"
	 * @generated
	 */
	List<Short> getAcceptingUnits();

	/**
	 * Returns the value of the '<em><b>Thread Type</b></em>' attribute.
	 * The default value is <code>"RECIPIENT"</code>.
	 * The literals are from the enumeration {@link org.pprls.registration.ThreadType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Type</em>' attribute.
	 * @see org.pprls.registration.ThreadType
	 * @see #setThreadType(ThreadType)
	 * @model default="RECIPIENT" required="true"
	 * @generated
	 */
	ThreadType getThreadType();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getThreadType <em>Thread Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Type</em>' attribute.
	 * @see org.pprls.registration.ThreadType
	 * @see #getThreadType()
	 * @generated
	 */
	void setThreadType(ThreadType value);

	/**
	 * Returns the value of the '<em><b>Internal Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Number</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Number</em>' reference.
	 * @see #setInternalNumber(InternalNumber)
	 * @model required="true"
	 * @generated
	 */
	InternalNumber getInternalNumber();

	/**
	 * Sets the value of the '{@link org.pprls.registration.Document#getInternalNumber <em>Internal Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Number</em>' reference.
	 * @see #getInternalNumber()
	 * @generated
	 */
	void setInternalNumber(InternalNumber value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	InternalNumber getCurrentInternalNunber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model logDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	void cancel(EmployeeDescriptor handler, String log);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model logDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	void close(EmployeeDescriptor handler, String log);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model logDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	void accept(EmployeeDescriptor handler, String log);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model logDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	void forward(EmployeeDescriptor owner, EmployeeDescriptor handler, String log);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true" directorateIdDataType="org.eclipse.emf.ecore.xml.type.Short"
	 * @generated
	 */
	boolean hasBeenThroughThisDirectorateBefore(short directorateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	List<IncomingDocumentOperations> allowedOperationsFromThisState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model operationRequired="true" logMessageDataType="org.eclipse.emf.ecore.xml.type.String" logMessageRequired="true" handlerRequired="true"
	 * @generated
	 */
	void changeState(IncomingDocumentOperations operation, String logMessage, EmployeeDescriptor handler);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	EmployeeDescriptor getOwner();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isPending();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isAccepted();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject" required="true"
	 * @generated
	 */
	Boolean isDone();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isCancelled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	DocumentStatus getState();


} // Document
