/**
 */
package eMF.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ecore.util.InternalEList;
import eMF.EMFPackage;
import eMF.Programme;
import eMF.Specialization;
import eMF.Year;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eMF.impl.SpecializationImpl#getName <em>Name</em>}</li>
 *   <li>{@link eMF.impl.SpecializationImpl#getRequiredSpecialization <em>Required Specialization</em>}</li>
 *   <li>{@link eMF.impl.SpecializationImpl#getSpecializationInProgramme <em>Specialization In Programme</em>}</li>
 *   <li>{@link eMF.impl.SpecializationImpl#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
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
	 * The cached value of the '{@link #getRequiredSpecialization() <em>Required Specialization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredSpecialization()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> requiredSpecialization;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected EList<Year> year;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFPackage.Literals.SPECIALIZATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.SPECIALIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getRequiredSpecialization() {
		if (requiredSpecialization == null) {
			requiredSpecialization = new EObjectContainmentEList<Specialization>(Specialization.class, this,
					EMFPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION);
		}
		return requiredSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getSpecializationInProgramme() {
		if (eContainerFeatureID() != EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME)
			return null;
		return (Programme) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecializationInProgramme(Programme newSpecializationInProgramme,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSpecializationInProgramme,
				EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecializationInProgramme(Programme newSpecializationInProgramme) {
		if (newSpecializationInProgramme != eInternalContainer()
				|| (eContainerFeatureID() != EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME
						&& newSpecializationInProgramme != null)) {
			if (EcoreUtil.isAncestor(this, newSpecializationInProgramme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecializationInProgramme != null)
				msgs = ((InternalEObject) newSpecializationInProgramme).eInverseAdd(this,
						EMFPackage.PROGRAMME__SPECIALIZATIONS, Programme.class, msgs);
			msgs = basicSetSpecializationInProgramme(newSpecializationInProgramme, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME, newSpecializationInProgramme,
					newSpecializationInProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Year> getYear() {
		if (year == null) {
			year = new EObjectContainmentEList<Year>(Year.class, this, EMFPackage.SPECIALIZATION__YEAR);
		}
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSpecializationInProgramme((Programme) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EMFPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION:
			return ((InternalEList<?>) getRequiredSpecialization()).basicRemove(otherEnd, msgs);
		case EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME:
			return basicSetSpecializationInProgramme(null, msgs);
		case EMFPackage.SPECIALIZATION__YEAR:
			return ((InternalEList<?>) getYear()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME:
			return eInternalContainer().eInverseRemove(this, EMFPackage.PROGRAMME__SPECIALIZATIONS, Programme.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EMFPackage.SPECIALIZATION__NAME:
			return getName();
		case EMFPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION:
			return getRequiredSpecialization();
		case EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME:
			return getSpecializationInProgramme();
		case EMFPackage.SPECIALIZATION__YEAR:
			return getYear();
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
		case EMFPackage.SPECIALIZATION__NAME:
			setName((String) newValue);
			return;
		case EMFPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION:
			getRequiredSpecialization().clear();
			getRequiredSpecialization().addAll((Collection<? extends Specialization>) newValue);
			return;
		case EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME:
			setSpecializationInProgramme((Programme) newValue);
			return;
		case EMFPackage.SPECIALIZATION__YEAR:
			getYear().clear();
			getYear().addAll((Collection<? extends Year>) newValue);
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
		case EMFPackage.SPECIALIZATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EMFPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION:
			getRequiredSpecialization().clear();
			return;
		case EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME:
			setSpecializationInProgramme((Programme) null);
			return;
		case EMFPackage.SPECIALIZATION__YEAR:
			getYear().clear();
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
		case EMFPackage.SPECIALIZATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EMFPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION:
			return requiredSpecialization != null && !requiredSpecialization.isEmpty();
		case EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME:
			return getSpecializationInProgramme() != null;
		case EMFPackage.SPECIALIZATION__YEAR:
			return year != null && !year.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SpecializationImpl
