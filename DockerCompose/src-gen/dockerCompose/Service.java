/**
 */
package dockerCompose;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockerCompose.Service#getName <em>Name</em>}</li>
 *   <li>{@link dockerCompose.Service#getCommand <em>Command</em>}</li>
 *   <li>{@link dockerCompose.Service#getImage <em>Image</em>}</li>
 *   <li>{@link dockerCompose.Service#getPort <em>Port</em>}</li>
 *   <li>{@link dockerCompose.Service#getVolume <em>Volume</em>}</li>
 *   <li>{@link dockerCompose.Service#getNetwork <em>Network</em>}</li>
 *   <li>{@link dockerCompose.Service#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link dockerCompose.Service#getDepends_on <em>Depends on</em>}</li>
 * </ul>
 *
 * @see dockerCompose.DockerComposePackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dockerCompose.DockerComposePackage#getService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dockerCompose.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see dockerCompose.DockerComposePackage#getService_Command()
	 * @model
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link dockerCompose.Service#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(Image)
	 * @see dockerCompose.DockerComposePackage#getService_Image()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Image getImage();

	/**
	 * Sets the value of the '{@link dockerCompose.Service#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Image value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link dockerCompose.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see dockerCompose.DockerComposePackage#getService_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' containment reference list.
	 * The list contents are of type {@link dockerCompose.Volume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' containment reference list.
	 * @see dockerCompose.DockerComposePackage#getService_Volume()
	 * @model containment="true"
	 * @generated
	 */
	EList<Volume> getVolume();

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference list.
	 * The list contents are of type {@link dockerCompose.Network}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference list.
	 * @see dockerCompose.DockerComposePackage#getService_Network()
	 * @model containment="true"
	 * @generated
	 */
	EList<Network> getNetwork();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference list.
	 * The list contents are of type {@link dockerCompose.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference list.
	 * @see dockerCompose.DockerComposePackage#getService_Environment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironment();

	/**
	 * Returns the value of the '<em><b>Depends on</b></em>' reference list.
	 * The list contents are of type {@link dockerCompose.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends on</em>' reference list.
	 * @see dockerCompose.DockerComposePackage#getService_Depends_on()
	 * @model
	 * @generated
	 */
	EList<Service> getDepends_on();

} // Service
