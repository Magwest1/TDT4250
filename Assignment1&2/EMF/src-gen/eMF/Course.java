/**
 */
package eMF;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMF.Course#getCourseName <em>Course Name</em>}</li>
 *   <li>{@link eMF.Course#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link eMF.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link eMF.Course#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see eMF.EMFPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Name</em>' attribute.
	 * @see #setCourseName(String)
	 * @see eMF.EMFPackage#getCourse_CourseName()
	 * @model
	 * @generated
	 */
	String getCourseName();

	/**
	 * Sets the value of the '{@link eMF.Course#getCourseName <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Name</em>' attribute.
	 * @see #getCourseName()
	 * @generated
	 */
	void setCourseName(String value);

	/**
	 * Returns the value of the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Code</em>' attribute.
	 * @see #setCourseCode(String)
	 * @see eMF.EMFPackage#getCourse_CourseCode()
	 * @model id="true"
	 * @generated
	 */
	String getCourseCode();

	/**
	 * Sets the value of the '{@link eMF.Course#getCourseCode <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Code</em>' attribute.
	 * @see #getCourseCode()
	 * @generated
	 */
	void setCourseCode(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(Float)
	 * @see eMF.EMFPackage#getCourse_Credits()
	 * @model dataType="eMF.Credits"
	 * @generated
	 */
	Float getCredits();

	/**
	 * Sets the value of the '{@link eMF.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(Float value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference list.
	 * The list contents are of type {@link eMF.courseInSemester}.
	 * It is bidirectional and its opposite is '{@link eMF.courseInSemester#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference list.
	 * @see eMF.EMFPackage#getCourse_Course()
	 * @see eMF.courseInSemester#getCourse
	 * @model opposite="course"
	 * @generated
	 */
	EList<courseInSemester> getCourse();

} // Course
