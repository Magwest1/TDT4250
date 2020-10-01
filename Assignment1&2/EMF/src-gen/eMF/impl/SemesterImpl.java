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
import eMF.Semester;
import eMF.Year;
import eMF.courseInSemester;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eMF.impl.SemesterImpl#getSemesterNumber <em>Semester Number</em>}</li>
 *   <li>{@link eMF.impl.SemesterImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link eMF.impl.SemesterImpl#getSemesterInYear <em>Semester In Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getSemesterNumber() <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEMESTER_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSemesterNumber() <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterNumber()
	 * @generated
	 * @ordered
	 */
	protected int semesterNumber = SEMESTER_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<courseInSemester> courses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSemesterNumber() {
		return semesterNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesterNumber(int newSemesterNumber) {
		int oldSemesterNumber = semesterNumber;
		semesterNumber = newSemesterNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.SEMESTER__SEMESTER_NUMBER,
					oldSemesterNumber, semesterNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<courseInSemester> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentWithInverseEList<courseInSemester>(courseInSemester.class, this,
					EMFPackage.SEMESTER__COURSES, EMFPackage.COURSE_IN_SEMESTER__COURSE_IN);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Year getSemesterInYear() {
		if (eContainerFeatureID() != EMFPackage.SEMESTER__SEMESTER_IN_YEAR)
			return null;
		return (Year) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemesterInYear(Year newSemesterInYear, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSemesterInYear, EMFPackage.SEMESTER__SEMESTER_IN_YEAR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesterInYear(Year newSemesterInYear) {
		if (newSemesterInYear != eInternalContainer()
				|| (eContainerFeatureID() != EMFPackage.SEMESTER__SEMESTER_IN_YEAR && newSemesterInYear != null)) {
			if (EcoreUtil.isAncestor(this, newSemesterInYear))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSemesterInYear != null)
				msgs = ((InternalEObject) newSemesterInYear).eInverseAdd(this, EMFPackage.YEAR__SEMESTERS, Year.class,
						msgs);
			msgs = basicSetSemesterInYear(newSemesterInYear, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.SEMESTER__SEMESTER_IN_YEAR,
					newSemesterInYear, newSemesterInYear));
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
		case EMFPackage.SEMESTER__COURSES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCourses()).basicAdd(otherEnd, msgs);
		case EMFPackage.SEMESTER__SEMESTER_IN_YEAR:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSemesterInYear((Year) otherEnd, msgs);
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
		case EMFPackage.SEMESTER__COURSES:
			return ((InternalEList<?>) getCourses()).basicRemove(otherEnd, msgs);
		case EMFPackage.SEMESTER__SEMESTER_IN_YEAR:
			return basicSetSemesterInYear(null, msgs);
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
		case EMFPackage.SEMESTER__SEMESTER_IN_YEAR:
			return eInternalContainer().eInverseRemove(this, EMFPackage.YEAR__SEMESTERS, Year.class, msgs);
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
		case EMFPackage.SEMESTER__SEMESTER_NUMBER:
			return getSemesterNumber();
		case EMFPackage.SEMESTER__COURSES:
			return getCourses();
		case EMFPackage.SEMESTER__SEMESTER_IN_YEAR:
			return getSemesterInYear();
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
		case EMFPackage.SEMESTER__SEMESTER_NUMBER:
			setSemesterNumber((Integer) newValue);
			return;
		case EMFPackage.SEMESTER__COURSES:
			getCourses().clear();
			getCourses().addAll((Collection<? extends courseInSemester>) newValue);
			return;
		case EMFPackage.SEMESTER__SEMESTER_IN_YEAR:
			setSemesterInYear((Year) newValue);
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
		case EMFPackage.SEMESTER__SEMESTER_NUMBER:
			setSemesterNumber(SEMESTER_NUMBER_EDEFAULT);
			return;
		case EMFPackage.SEMESTER__COURSES:
			getCourses().clear();
			return;
		case EMFPackage.SEMESTER__SEMESTER_IN_YEAR:
			setSemesterInYear((Year) null);
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
		case EMFPackage.SEMESTER__SEMESTER_NUMBER:
			return semesterNumber != SEMESTER_NUMBER_EDEFAULT;
		case EMFPackage.SEMESTER__COURSES:
			return courses != null && !courses.isEmpty();
		case EMFPackage.SEMESTER__SEMESTER_IN_YEAR:
			return getSemesterInYear() != null;
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
		result.append(" (semesterNumber: ");
		result.append(semesterNumber);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
