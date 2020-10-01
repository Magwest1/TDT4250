/**
 */
package eMF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Institute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMF.Institute#getName <em>Name</em>}</li>
 *   <li>{@link eMF.Institute#getProgramme <em>Programme</em>}</li>
 *   <li>{@link eMF.Institute#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see eMF.EMFPackage#getInstitute()
 * @model
 * @generated
 */
public interface Institute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eMF.EMFPackage#getInstitute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eMF.Institute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Programme</b></em>' containment reference list.
	 * The list contents are of type {@link eMF.Programme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' containment reference list.
	 * @see eMF.EMFPackage#getInstitute_Programme()
	 * @model containment="true"
	 * @generated
	 */
	EList<Programme> getProgramme();

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link eMF.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see eMF.EMFPackage#getInstitute_Course()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourse();

} // Institute
