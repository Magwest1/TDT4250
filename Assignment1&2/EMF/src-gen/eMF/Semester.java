/**
 */
package eMF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMF.Semester#getSemesterNumber <em>Semester Number</em>}</li>
 *   <li>{@link eMF.Semester#getCourses <em>Courses</em>}</li>
 *   <li>{@link eMF.Semester#getSemesterInYear <em>Semester In Year</em>}</li>
 * </ul>
 *
 * @see eMF.EMFPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Number</em>' attribute.
	 * @see #setSemesterNumber(int)
	 * @see eMF.EMFPackage#getSemester_SemesterNumber()
	 * @model
	 * @generated
	 */
	int getSemesterNumber();

	/**
	 * Sets the value of the '{@link eMF.Semester#getSemesterNumber <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Number</em>' attribute.
	 * @see #getSemesterNumber()
	 * @generated
	 */
	void setSemesterNumber(int value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link eMF.courseInSemester}.
	 * It is bidirectional and its opposite is '{@link eMF.courseInSemester#getCourseIn <em>Course In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see eMF.EMFPackage#getSemester_Courses()
	 * @see eMF.courseInSemester#getCourseIn
	 * @model opposite="courseIn" containment="true"
	 * @generated
	 */
	EList<courseInSemester> getCourses();

	/**
	 * Returns the value of the '<em><b>Semester In Year</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eMF.Year#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester In Year</em>' container reference.
	 * @see #setSemesterInYear(Year)
	 * @see eMF.EMFPackage#getSemester_SemesterInYear()
	 * @see eMF.Year#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	Year getSemesterInYear();

	/**
	 * Sets the value of the '{@link eMF.Semester#getSemesterInYear <em>Semester In Year</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester In Year</em>' container reference.
	 * @see #getSemesterInYear()
	 * @generated
	 */
	void setSemesterInYear(Year value);

} // Semester
