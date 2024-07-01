/**
 */
package dockerCompose;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockerCompose.Network#getName <em>Name</em>}</li>
 *   <li>{@link dockerCompose.Network#getDriver <em>Driver</em>}</li>
 * </ul>
 *
 * @see dockerCompose.DockerComposePackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dockerCompose.DockerComposePackage#getNetwork_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dockerCompose.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' attribute.
	 * The default value is <code>"bridge"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' attribute.
	 * @see #setDriver(String)
	 * @see dockerCompose.DockerComposePackage#getNetwork_Driver()
	 * @model default="bridge"
	 * @generated
	 */
	String getDriver();

	/**
	 * Sets the value of the '{@link dockerCompose.Network#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' attribute.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(String value);

} // Network
