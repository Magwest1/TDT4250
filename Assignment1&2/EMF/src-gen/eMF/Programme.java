/**
 */
package eMF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMF.Programme#getName <em>Name</em>}</li>
 *   <li>{@link eMF.Programme#getYears <em>Years</em>}</li>
 *   <li>{@link eMF.Programme#getNumberOfYears <em>Number Of Years</em>}</li>
 *   <li>{@link eMF.Programme#getSpecializations <em>Specializations</em>}</li>
 * </ul>
 *
 * @see eMF.EMFPackage#getProgramme()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='programmeYearNonZero'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 programmeYearNonZero='self.numberOfYears &gt; 0'"
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eMF.EMFPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eMF.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Years</b></em>' containment reference list.
	 * The list contents are of type {@link eMF.Year}.
	 * It is bidirectional and its opposite is '{@link eMF.Year#getYearInProgramme <em>Year In Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Years</em>' containment reference list.
	 * @see eMF.EMFPackage#getProgramme_Years()
	 * @see eMF.Year#getYearInProgramme
	 * @model opposite="yearInProgramme" containment="true"
	 * @generated
	 */
	EList<Year> getYears();

	/**
	 * Returns the value of the '<em><b>Number Of Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Years</em>' attribute.
	 * @see #setNumberOfYears(int)
	 * @see eMF.EMFPackage#getProgramme_NumberOfYears()
	 * @model
	 * @generated
	 */
	int getNumberOfYears();

	/**
	 * Sets the value of the '{@link eMF.Programme#getNumberOfYears <em>Number Of Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Years</em>' attribute.
	 * @see #getNumberOfYears()
	 * @generated
	 */
	void setNumberOfYears(int value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link eMF.Specialization}.
	 * It is bidirectional and its opposite is '{@link eMF.Specialization#getSpecializationInProgramme <em>Specialization In Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see eMF.EMFPackage#getProgramme_Specializations()
	 * @see eMF.Specialization#getSpecializationInProgramme
	 * @model opposite="specializationInProgramme" containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

} // Programme
