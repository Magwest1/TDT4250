/**
 */
package eMF.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import eMF.EMFPackage;
import eMF.Programme;
import eMF.Semester;
import eMF.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eMF.impl.YearImpl#getYearNumber <em>Year Number</em>}</li>
 *   <li>{@link eMF.impl.YearImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link eMF.impl.YearImpl#getNumberOfSemesters <em>Number Of Semesters</em>}</li>
 *   <li>{@link eMF.impl.YearImpl#getYearInProgramme <em>Year In Programme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YearImpl extends MinimalEObjectImpl.Container implements Year {
	/**
	 * The default value of the '{@link #getYearNumber() <em>Year Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYearNumber() <em>Year Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearNumber()
	 * @generated
	 * @ordered
	 */
	protected int yearNumber = YEAR_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * The default value of the '{@link #getNumberOfSemesters() <em>Number Of Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSemesters()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SEMESTERS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YearImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFPackage.Literals.YEAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getYearNumber() {
		return yearNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearNumber(int newYearNumber) {
		int oldYearNumber = yearNumber;
		yearNumber = newYearNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.YEAR__YEAR_NUMBER, oldYearNumber,
					yearNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentWithInverseEList<Semester>(Semester.class, this,
					EMFPackage.YEAR__SEMESTERS, EMFPackage.SEMESTER__SEMESTER_IN_YEAR);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getNumberOfSemesters() {
		int numberOfSemesters = this.getSemesters().size();
		return numberOfSemesters;
		// TODO: implement this method to return the 'Number Of Semesters' attribute
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getYearInProgramme() {
		if (eContainerFeatureID() != EMFPackage.YEAR__YEAR_IN_PROGRAMME)
			return null;
		return (Programme) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYearInProgramme(Programme newYearInProgramme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newYearInProgramme, EMFPackage.YEAR__YEAR_IN_PROGRAMME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearInProgramme(Programme newYearInProgramme) {
		if (newYearInProgramme != eInternalContainer()
				|| (eContainerFeatureID() != EMFPackage.YEAR__YEAR_IN_PROGRAMME && newYearInProgramme != null)) {
			if (EcoreUtil.isAncestor(this, newYearInProgramme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newYearInProgramme != null)
				msgs = ((InternalEObject) newYearInProgramme).eInverseAdd(this, EMFPackage.PROGRAMME__YEARS,
						Programme.class, msgs);
			msgs = basicSetYearInProgramme(newYearInProgramme, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.YEAR__YEAR_IN_PROGRAMME,
					newYearInProgramme, newYearInProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EMFPackage.YEAR__SEMESTERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSemesters()).basicAdd(otherEnd, msgs);
		case EMFPackage.YEAR__YEAR_IN_PROGRAMME:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetYearInProgramme((Programme) otherEnd, msgs);
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
		case EMFPackage.YEAR__SEMESTERS:
			return ((InternalEList<?>) getSemesters()).basicRemove(otherEnd, msgs);
		case EMFPackage.YEAR__YEAR_IN_PROGRAMME:
			return basicSetYearInProgramme(null, msgs);
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
		case EMFPackage.YEAR__YEAR_IN_PROGRAMME:
			return eInternalContainer().eInverseRemove(this, EMFPackage.PROGRAMME__YEARS, Programme.class, msgs);
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
		case EMFPackage.YEAR__YEAR_NUMBER:
			return getYearNumber();
		case EMFPackage.YEAR__SEMESTERS:
			return getSemesters();
		case EMFPackage.YEAR__NUMBER_OF_SEMESTERS:
			return getNumberOfSemesters();
		case EMFPackage.YEAR__YEAR_IN_PROGRAMME:
			return getYearInProgramme();
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
		case EMFPackage.YEAR__YEAR_NUMBER:
			setYearNumber((Integer) newValue);
			return;
		case EMFPackage.YEAR__SEMESTERS:
			getSemesters().clear();
			getSemesters().addAll((Collection<? extends Semester>) newValue);
			return;
		case EMFPackage.YEAR__YEAR_IN_PROGRAMME:
			setYearInProgramme((Programme) newValue);
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
		case EMFPackage.YEAR__YEAR_NUMBER:
			setYearNumber(YEAR_NUMBER_EDEFAULT);
			return;
		case EMFPackage.YEAR__SEMESTERS:
			getSemesters().clear();
			return;
		case EMFPackage.YEAR__YEAR_IN_PROGRAMME:
			setYearInProgramme((Programme) null);
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
		case EMFPackage.YEAR__YEAR_NUMBER:
			return yearNumber != YEAR_NUMBER_EDEFAULT;
		case EMFPackage.YEAR__SEMESTERS:
			return semesters != null && !semesters.isEmpty();
		case EMFPackage.YEAR__NUMBER_OF_SEMESTERS:
			return getNumberOfSemesters() != NUMBER_OF_SEMESTERS_EDEFAULT;
		case EMFPackage.YEAR__YEAR_IN_PROGRAMME:
			return getYearInProgramme() != null;
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
		result.append(" (yearNumber: ");
		result.append(yearNumber);
		result.append(')');
		return result.toString();
	}

} //YearImpl
