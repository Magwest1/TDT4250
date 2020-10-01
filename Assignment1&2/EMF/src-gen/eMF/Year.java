/**
 */
package eMF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMF.Year#getYearNumber <em>Year Number</em>}</li>
 *   <li>{@link eMF.Year#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link eMF.Year#getNumberOfSemesters <em>Number Of Semesters</em>}</li>
 *   <li>{@link eMF.Year#getYearInProgramme <em>Year In Programme</em>}</li>
 * </ul>
 *
 * @see eMF.EMFPackage#getYear()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='creditsInAYear'"
 * @generated
 */
public interface Year extends EObject {
	/**
	 * Returns the value of the '<em><b>Year Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Number</em>' attribute.
	 * @see #setYearNumber(int)
	 * @see eMF.EMFPackage#getYear_YearNumber()
	 * @model
	 * @generated
	 */
	int getYearNumber();

	/**
	 * Sets the value of the '{@link eMF.Year#getYearNumber <em>Year Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Number</em>' attribute.
	 * @see #getYearNumber()
	 * @generated
	 */
	void setYearNumber(int value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link eMF.Semester}.
	 * It is bidirectional and its opposite is '{@link eMF.Semester#getSemesterInYear <em>Semester In Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see eMF.EMFPackage#getYear_Semesters()
	 * @see eMF.Semester#getSemesterInYear
	 * @model opposite="semesterInYear" containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Number Of Semesters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Semesters</em>' attribute.
	 * @see eMF.EMFPackage#getYear_NumberOfSemesters()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumberOfSemesters();

	/**
	 * Returns the value of the '<em><b>Year In Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eMF.Programme#getYears <em>Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year In Programme</em>' container reference.
	 * @see #setYearInProgramme(Programme)
	 * @see eMF.EMFPackage#getYear_YearInProgramme()
	 * @see eMF.Programme#getYears
	 * @model opposite="years" transient="false"
	 * @generated
	 */
	Programme getYearInProgramme();

	/**
	 * Sets the value of the '{@link eMF.Year#getYearInProgramme <em>Year In Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year In Programme</em>' container reference.
	 * @see #getYearInProgramme()
	 * @generated
	 */
	void setYearInProgramme(Programme value);

} // Year
