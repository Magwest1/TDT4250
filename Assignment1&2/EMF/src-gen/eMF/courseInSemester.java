/**
 */
package eMF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>course In Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMF.courseInSemester#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link eMF.courseInSemester#getCourseIn <em>Course In</em>}</li>
 *   <li>{@link eMF.courseInSemester#getLevel <em>Level</em>}</li>
 *   <li>{@link eMF.courseInSemester#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see eMF.EMFPackage#getcourseInSemester()
 * @model
 * @generated
 */
public interface courseInSemester extends EObject {
	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see eMF.EMFPackage#getcourseInSemester_Mandatory()
	 * @model
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link eMF.courseInSemester#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Course In</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eMF.Semester#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course In</em>' container reference.
	 * @see #setCourseIn(Semester)
	 * @see eMF.EMFPackage#getcourseInSemester_CourseIn()
	 * @see eMF.Semester#getCourses
	 * @model opposite="courses" transient="false"
	 * @generated
	 */
	Semester getCourseIn();

	/**
	 * Sets the value of the '{@link eMF.courseInSemester#getCourseIn <em>Course In</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course In</em>' container reference.
	 * @see #getCourseIn()
	 * @generated
	 */
	void setCourseIn(Semester value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see eMF.EMFPackage#getcourseInSemester_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link eMF.courseInSemester#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eMF.Course#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see eMF.EMFPackage#getcourseInSemester_Course()
	 * @see eMF.Course#getCourse
	 * @model opposite="course"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link eMF.courseInSemester#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

} // courseInSemester
