/**
 */
package dockerCompose;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockerCompose.Compose#getVersion <em>Version</em>}</li>
 *   <li>{@link dockerCompose.Compose#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see dockerCompose.DockerComposePackage#getCompose()
 * @model
 * @generated
 */
public interface Compose extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see dockerCompose.DockerComposePackage#getCompose_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link dockerCompose.Compose#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link dockerCompose.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see dockerCompose.DockerComposePackage#getCompose_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getService();

} // Compose
