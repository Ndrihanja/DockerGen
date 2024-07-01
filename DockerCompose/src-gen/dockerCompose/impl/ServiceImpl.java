/**
 */
package dockerCompose.impl;

import dockerCompose.DockerComposePackage;
import dockerCompose.Environment;
import dockerCompose.Image;
import dockerCompose.Network;
import dockerCompose.Port;
import dockerCompose.Service;
import dockerCompose.Volume;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dockerCompose.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link dockerCompose.impl.ServiceImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link dockerCompose.impl.ServiceImpl#getImage <em>Image</em>}</li>
 *   <li>{@link dockerCompose.impl.ServiceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link dockerCompose.impl.ServiceImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link dockerCompose.impl.ServiceImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link dockerCompose.impl.ServiceImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link dockerCompose.impl.ServiceImpl#getDepends_on <em>Depends on</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected String command = COMMAND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected Image image;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected EList<Volume> volume;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected EList<Network> network;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> environment;

	/**
	 * The cached value of the '{@link #getDepends_on() <em>Depends on</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepends_on()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> depends_on;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerComposePackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerComposePackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommand(String newCommand) {
		String oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerComposePackage.SERVICE__COMMAND, oldCommand,
					command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(Image newImage, NotificationChain msgs) {
		Image oldImage = image;
		image = newImage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockerComposePackage.SERVICE__IMAGE, oldImage, newImage);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(Image newImage) {
		if (newImage != image) {
			NotificationChain msgs = null;
			if (image != null)
				msgs = ((InternalEObject) image).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockerComposePackage.SERVICE__IMAGE, null, msgs);
			if (newImage != null)
				msgs = ((InternalEObject) newImage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockerComposePackage.SERVICE__IMAGE, null, msgs);
			msgs = basicSetImage(newImage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerComposePackage.SERVICE__IMAGE, newImage,
					newImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<Port>(Port.class, this, DockerComposePackage.SERVICE__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Volume> getVolume() {
		if (volume == null) {
			volume = new EObjectContainmentEList<Volume>(Volume.class, this, DockerComposePackage.SERVICE__VOLUME);
		}
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Network> getNetwork() {
		if (network == null) {
			network = new EObjectContainmentEList<Network>(Network.class, this, DockerComposePackage.SERVICE__NETWORK);
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Environment> getEnvironment() {
		if (environment == null) {
			environment = new EObjectContainmentEList<Environment>(Environment.class, this,
					DockerComposePackage.SERVICE__ENVIRONMENT);
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getDepends_on() {
		if (depends_on == null) {
			depends_on = new EObjectResolvingEList<Service>(Service.class, this,
					DockerComposePackage.SERVICE__DEPENDS_ON);
		}
		return depends_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DockerComposePackage.SERVICE__IMAGE:
			return basicSetImage(null, msgs);
		case DockerComposePackage.SERVICE__PORT:
			return ((InternalEList<?>) getPort()).basicRemove(otherEnd, msgs);
		case DockerComposePackage.SERVICE__VOLUME:
			return ((InternalEList<?>) getVolume()).basicRemove(otherEnd, msgs);
		case DockerComposePackage.SERVICE__NETWORK:
			return ((InternalEList<?>) getNetwork()).basicRemove(otherEnd, msgs);
		case DockerComposePackage.SERVICE__ENVIRONMENT:
			return ((InternalEList<?>) getEnvironment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DockerComposePackage.SERVICE__NAME:
			return getName();
		case DockerComposePackage.SERVICE__COMMAND:
			return getCommand();
		case DockerComposePackage.SERVICE__IMAGE:
			return getImage();
		case DockerComposePackage.SERVICE__PORT:
			return getPort();
		case DockerComposePackage.SERVICE__VOLUME:
			return getVolume();
		case DockerComposePackage.SERVICE__NETWORK:
			return getNetwork();
		case DockerComposePackage.SERVICE__ENVIRONMENT:
			return getEnvironment();
		case DockerComposePackage.SERVICE__DEPENDS_ON:
			return getDepends_on();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DockerComposePackage.SERVICE__NAME:
			setName((String) newValue);
			return;
		case DockerComposePackage.SERVICE__COMMAND:
			setCommand((String) newValue);
			return;
		case DockerComposePackage.SERVICE__IMAGE:
			setImage((Image) newValue);
			return;
		case DockerComposePackage.SERVICE__PORT:
			getPort().clear();
			getPort().addAll((Collection<? extends Port>) newValue);
			return;
		case DockerComposePackage.SERVICE__VOLUME:
			getVolume().clear();
			getVolume().addAll((Collection<? extends Volume>) newValue);
			return;
		case DockerComposePackage.SERVICE__NETWORK:
			getNetwork().clear();
			getNetwork().addAll((Collection<? extends Network>) newValue);
			return;
		case DockerComposePackage.SERVICE__ENVIRONMENT:
			getEnvironment().clear();
			getEnvironment().addAll((Collection<? extends Environment>) newValue);
			return;
		case DockerComposePackage.SERVICE__DEPENDS_ON:
			getDepends_on().clear();
			getDepends_on().addAll((Collection<? extends Service>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DockerComposePackage.SERVICE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DockerComposePackage.SERVICE__COMMAND:
			setCommand(COMMAND_EDEFAULT);
			return;
		case DockerComposePackage.SERVICE__IMAGE:
			setImage((Image) null);
			return;
		case DockerComposePackage.SERVICE__PORT:
			getPort().clear();
			return;
		case DockerComposePackage.SERVICE__VOLUME:
			getVolume().clear();
			return;
		case DockerComposePackage.SERVICE__NETWORK:
			getNetwork().clear();
			return;
		case DockerComposePackage.SERVICE__ENVIRONMENT:
			getEnvironment().clear();
			return;
		case DockerComposePackage.SERVICE__DEPENDS_ON:
			getDepends_on().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DockerComposePackage.SERVICE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DockerComposePackage.SERVICE__COMMAND:
			return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
		case DockerComposePackage.SERVICE__IMAGE:
			return image != null;
		case DockerComposePackage.SERVICE__PORT:
			return port != null && !port.isEmpty();
		case DockerComposePackage.SERVICE__VOLUME:
			return volume != null && !volume.isEmpty();
		case DockerComposePackage.SERVICE__NETWORK:
			return network != null && !network.isEmpty();
		case DockerComposePackage.SERVICE__ENVIRONMENT:
			return environment != null && !environment.isEmpty();
		case DockerComposePackage.SERVICE__DEPENDS_ON:
			return depends_on != null && !depends_on.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", command: ");
		result.append(command);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
