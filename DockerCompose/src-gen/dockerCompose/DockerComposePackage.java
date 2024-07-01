/**
 */
package dockerCompose;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dockerCompose.DockerComposeFactory
 * @model kind="package"
 * @generated
 */
public interface DockerComposePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dockerCompose";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dockerCompose";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dockerCompose";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DockerComposePackage eINSTANCE = dockerCompose.impl.DockerComposePackageImpl.init();

	/**
	 * The meta object id for the '{@link dockerCompose.impl.ComposeImpl <em>Compose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dockerCompose.impl.ComposeImpl
	 * @see dockerCompose.impl.DockerComposePackageImpl#getCompose()
	 * @generated
	 */
	int COMPOSE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSE__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSE__SERVICE = 1;

	/**
	 * The number of structural features of the '<em>Compose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Compose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dockerCompose.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dockerCompose.impl.ServiceImpl
	 * @see dockerCompose.impl.DockerComposePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__COMMAND = 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PORT = 3;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VOLUME = 4;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NETWORK = 5;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ENVIRONMENT = 6;

	/**
	 * The feature id for the '<em><b>Depends on</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DEPENDS_ON = 7;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dockerCompose.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dockerCompose.impl.ImageImpl
	 * @see dockerCompose.impl.DockerComposePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dockerCompose.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dockerCompose.impl.PortImpl
	 * @see dockerCompose.impl.DockerComposePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PROTOCOL = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dockerCompose.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dockerCompose.impl.VolumeImpl
	 * @see dockerCompose.impl.DockerComposePackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dockerCompose.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dockerCompose.impl.NetworkImpl
	 * @see dockerCompose.impl.DockerComposePackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__DRIVER = 1;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dockerCompose.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dockerCompose.impl.EnvironmentImpl
	 * @see dockerCompose.impl.DockerComposePackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link dockerCompose.Compose <em>Compose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compose</em>'.
	 * @see dockerCompose.Compose
	 * @generated
	 */
	EClass getCompose();

	/**
	 * Returns the meta object for the attribute '{@link dockerCompose.Compose#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see dockerCompose.Compose#getVersion()
	 * @see #getCompose()
	 * @generated
	 */
	EAttribute getCompose_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link dockerCompose.Compose#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see dockerCompose.Compose#getService()
	 * @see #getCompose()
	 * @generated
	 */
	EReference getCompose_Service();

	/**
	 * Returns the meta object for class '{@link dockerCompose.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see dockerCompose.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link dockerCompose.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dockerCompose.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link dockerCompose.Service#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see dockerCompose.Service#getCommand()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Command();

	/**
	 * Returns the meta object for the containment reference '{@link dockerCompose.Service#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see dockerCompose.Service#getImage()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Image();

	/**
	 * Returns the meta object for the containment reference list '{@link dockerCompose.Service#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see dockerCompose.Service#getPort()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link dockerCompose.Service#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volume</em>'.
	 * @see dockerCompose.Service#getVolume()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Volume();

	/**
	 * Returns the meta object for the containment reference list '{@link dockerCompose.Service#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network</em>'.
	 * @see dockerCompose.Service#getNetwork()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Network();

	/**
	 * Returns the meta object for the containment reference list '{@link dockerCompose.Service#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment</em>'.
	 * @see dockerCompose.Service#getEnvironment()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Environment();

	/**
	 * Returns the meta object for the reference list '{@link dockerCompose.Service#getDepends_on <em>Depends on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends on</em>'.
	 * @see dockerCompose.Service#getDepends_on()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Depends_on();

	/**
	 * Returns the meta object for class '{@link dockerCompose.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see dockerCompose.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link dockerCompose.Image#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dockerCompose.Image#getName()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Name();

	/**
	 * Returns the meta object for the attribute '{@link dockerCompose.Image#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see dockerCompose.Image#getTag()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Tag();

	/**
	 * Returns the meta object for class '{@link dockerCompose.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see dockerCompose.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link dockerCompose.Port#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see dockerCompose.Port#getNumber()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Number();

	/**
	 * Returns the meta object for the attribute '{@link dockerCompose.Port#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see dockerCompose.Port#getProtocol()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Protocol();

	/**
	 * Returns the meta object for class '{@link dockerCompose.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see dockerCompose.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the attribute '{@link dockerCompose.Volume#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see dockerCompose.Volume#getSource()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Source();

	/**
	 * Returns the meta object for the attribute '{@link dockerCompose.Volume#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see dockerCompose.Volume#getTarget()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Target();

	/**
	 * Returns the meta object for class '{@link dockerCompose.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see dockerCompose.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link dockerCompose.Network#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dockerCompose.Network#getName()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Name();

	/**
	 * Returns the meta object for the attribute '{@link dockerCompose.Network#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see dockerCompose.Network#getDriver()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Driver();

	/**
	 * Returns the meta object for class '{@link dockerCompose.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see dockerCompose.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link dockerCompose.Environment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dockerCompose.Environment#getName()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Name();

	/**
	 * Returns the meta object for the attribute '{@link dockerCompose.Environment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dockerCompose.Environment#getValue()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DockerComposeFactory getDockerComposeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dockerCompose.impl.ComposeImpl <em>Compose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dockerCompose.impl.ComposeImpl
		 * @see dockerCompose.impl.DockerComposePackageImpl#getCompose()
		 * @generated
		 */
		EClass COMPOSE = eINSTANCE.getCompose();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSE__VERSION = eINSTANCE.getCompose_Version();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSE__SERVICE = eINSTANCE.getCompose_Service();

		/**
		 * The meta object literal for the '{@link dockerCompose.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dockerCompose.impl.ServiceImpl
		 * @see dockerCompose.impl.DockerComposePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__COMMAND = eINSTANCE.getService_Command();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__IMAGE = eINSTANCE.getService_Image();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PORT = eINSTANCE.getService_Port();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__VOLUME = eINSTANCE.getService_Volume();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__NETWORK = eINSTANCE.getService_Network();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__ENVIRONMENT = eINSTANCE.getService_Environment();

		/**
		 * The meta object literal for the '<em><b>Depends on</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DEPENDS_ON = eINSTANCE.getService_Depends_on();

		/**
		 * The meta object literal for the '{@link dockerCompose.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dockerCompose.impl.ImageImpl
		 * @see dockerCompose.impl.DockerComposePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__NAME = eINSTANCE.getImage_Name();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__TAG = eINSTANCE.getImage_Tag();

		/**
		 * The meta object literal for the '{@link dockerCompose.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dockerCompose.impl.PortImpl
		 * @see dockerCompose.impl.DockerComposePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NUMBER = eINSTANCE.getPort_Number();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__PROTOCOL = eINSTANCE.getPort_Protocol();

		/**
		 * The meta object literal for the '{@link dockerCompose.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dockerCompose.impl.VolumeImpl
		 * @see dockerCompose.impl.DockerComposePackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__SOURCE = eINSTANCE.getVolume_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__TARGET = eINSTANCE.getVolume_Target();

		/**
		 * The meta object literal for the '{@link dockerCompose.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dockerCompose.impl.NetworkImpl
		 * @see dockerCompose.impl.DockerComposePackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__NAME = eINSTANCE.getNetwork_Name();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__DRIVER = eINSTANCE.getNetwork_Driver();

		/**
		 * The meta object literal for the '{@link dockerCompose.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dockerCompose.impl.EnvironmentImpl
		 * @see dockerCompose.impl.DockerComposePackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__NAME = eINSTANCE.getEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__VALUE = eINSTANCE.getEnvironment_Value();

	}

} //DockerComposePackage
