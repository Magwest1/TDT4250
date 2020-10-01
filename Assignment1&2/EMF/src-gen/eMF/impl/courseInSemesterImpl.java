/**
 */
package eMF.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import eMF.Course;
import eMF.EMFPackage;
import eMF.Semester;
import eMF.courseInSemester;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>course In Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eMF.impl.courseInSemesterImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link eMF.impl.courseInSemesterImpl#getCourseIn <em>Course In</em>}</li>
 *   <li>{@link eMF.impl.courseInSemesterImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link eMF.impl.courseInSemesterImpl#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class courseInSemesterImpl extends MinimalEObjectImpl.Container implements courseInSemester {
	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected courseInSemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFPackage.Literals.COURSE_IN_SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.COURSE_IN_SEMESTER__MANDATORY,
					oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getCourseIn() {
		if (eContainerFeatureID() != EMFPackage.COURSE_IN_SEMESTER__COURSE_IN)
			return null;
		return (Semester) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseIn(Semester newCourseIn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newCourseIn, EMFPackage.COURSE_IN_SEMESTER__COURSE_IN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseIn(Semester newCourseIn) {
		if (newCourseIn != eInternalContainer()
				|| (eContainerFeatureID() != EMFPackage.COURSE_IN_SEMESTER__COURSE_IN && newCourseIn != null)) {
			if (EcoreUtil.isAncestor(this, newCourseIn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCourseIn != null)
				msgs = ((InternalEObject) newCourseIn).eInverseAdd(this, EMFPackage.SEMESTER__COURSES, Semester.class,
						msgs);
			msgs = basicSetCourseIn(newCourseIn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.COURSE_IN_SEMESTER__COURSE_IN, newCourseIn,
					newCourseIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.COURSE_IN_SEMESTER__LEVEL, oldLevel,
					level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getCourse() {
		if (course != null && course.eIsProxy()) {
			InternalEObject oldCourse = (InternalEObject) course;
			course = (Course) eResolveProxy(oldCourse);
			if (course != oldCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFPackage.COURSE_IN_SEMESTER__COURSE,
							oldCourse, course));
			}
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourse(Course newCourse, NotificationChain msgs) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EMFPackage.COURSE_IN_SEMESTER__COURSE, oldCourse, newCourse);
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
	public void setCourse(Course newCourse) {
		if (newCourse != course) {
			NotificationChain msgs = null;
			if (course != null)
				msgs = ((InternalEObject) course).eInverseRemove(this, EMFPackage.COURSE__COURSE, Course.class, msgs);
			if (newCourse != null)
				msgs = ((InternalEObject) newCourse).eInverseAdd(this, EMFPackage.COURSE__COURSE, Course.class, msgs);
			msgs = basicSetCourse(newCourse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.COURSE_IN_SEMESTER__COURSE, newCourse,
					newCourse));
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
		case EMFPackage.COURSE_IN_SEMESTER__COURSE_IN:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetCourseIn((Semester) otherEnd, msgs);
		case EMFPackage.COURSE_IN_SEMESTER__COURSE:
			if (course != null)
				msgs = ((InternalEObject) course).eInverseRemove(this, EMFPackage.COURSE__COURSE, Course.class, msgs);
			return basicSetCourse((Course) otherEnd, msgs);
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
		case EMFPackage.COURSE_IN_SEMESTER__COURSE_IN:
			return basicSetCourseIn(null, msgs);
		case EMFPackage.COURSE_IN_SEMESTER__COURSE:
			return basicSetCourse(null, msgs);
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
		case EMFPackage.COURSE_IN_SEMESTER__COURSE_IN:
			return eInternalContainer().eInverseRemove(this, EMFPackage.SEMESTER__COURSES, Semester.class, msgs);
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
		case EMFPackage.COURSE_IN_SEMESTER__MANDATORY:
			return isMandatory();
		case EMFPackage.COURSE_IN_SEMESTER__COURSE_IN:
			return getCourseIn();
		case EMFPackage.COURSE_IN_SEMESTER__LEVEL:
			return getLevel();
		case EMFPackage.COURSE_IN_SEMESTER__COURSE:
			if (resolve)
				return getCourse();
			return basicGetCourse();
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
		case EMFPackage.COURSE_IN_SEMESTER__MANDATORY:
			setMandatory((Boolean) newValue);
			return;
		case EMFPackage.COURSE_IN_SEMESTER__COURSE_IN:
			setCourseIn((Semester) newValue);
			return;
		case EMFPackage.COURSE_IN_SEMESTER__LEVEL:
			setLevel((Integer) newValue);
			return;
		case EMFPackage.COURSE_IN_SEMESTER__COURSE:
			setCourse((Course) newValue);
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
		case EMFPackage.COURSE_IN_SEMESTER__MANDATORY:
			setMandatory(MANDATORY_EDEFAULT);
			return;
		case EMFPackage.COURSE_IN_SEMESTER__COURSE_IN:
			setCourseIn((Semester) null);
			return;
		case EMFPackage.COURSE_IN_SEMESTER__LEVEL:
			setLevel(LEVEL_EDEFAULT);
			return;
		case EMFPackage.COURSE_IN_SEMESTER__COURSE:
			setCourse((Course) null);
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
		case EMFPackage.COURSE_IN_SEMESTER__MANDATORY:
			return mandatory != MANDATORY_EDEFAULT;
		case EMFPackage.COURSE_IN_SEMESTER__COURSE_IN:
			return getCourseIn() != null;
		case EMFPackage.COURSE_IN_SEMESTER__LEVEL:
			return level != LEVEL_EDEFAULT;
		case EMFPackage.COURSE_IN_SEMESTER__COURSE:
			return course != null;
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
		result.append(" (mandatory: ");
		result.append(mandatory);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //courseInSemesterImpl
