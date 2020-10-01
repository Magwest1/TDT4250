/**
 */
package eMF;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMF.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link eMF.Specialization#getRequiredSpecialization <em>Required Specialization</em>}</li>
 *   <li>{@link eMF.Specialization#getSpecializationInProgramme <em>Specialization In Programme</em>}</li>
 *   <li>{@link eMF.Specialization#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see eMF.EMFPackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eMF.EMFPackage#getSpecialization_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eMF.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Required Specialization</b></em>' containment reference list.
	 * The list contents are of type {@link eMF.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Specialization</em>' containment reference list.
	 * @see eMF.EMFPackage#getSpecialization_RequiredSpecialization()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getRequiredSpecialization();

	/**
	 * Returns the value of the '<em><b>Specialization In Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eMF.Programme#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization In Programme</em>' container reference.
	 * @see #setSpecializationInProgramme(Programme)
	 * @see eMF.EMFPackage#getSpecialization_SpecializationInProgramme()
	 * @see eMF.Programme#getSpecializations
	 * @model opposite="specializations" transient="false"
	 * @generated
	 */
	Programme getSpecializationInProgramme();

	/**
	 * Sets the value of the '{@link eMF.Specialization#getSpecializationInProgramme <em>Specialization In Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization In Programme</em>' container reference.
	 * @see #getSpecializationInProgramme()
	 * @generated
	 */
	void setSpecializationInProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' containment reference list.
	 * The list contents are of type {@link eMF.Year}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' containment reference list.
	 * @see eMF.EMFPackage#getSpecialization_Year()
	 * @model containment="true"
	 * @generated
	 */
	EList<Year> getYear();

} // Specialization
