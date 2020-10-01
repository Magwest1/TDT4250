/**
 */
package eMF.util;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import eMF.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see eMF.EMFPackage
 * @generated
 */
public class EMFValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EMFValidator INSTANCE = new EMFValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eMF";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return EMFPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case EMFPackage.PROGRAMME:
			return validateProgramme((Programme) value, diagnostics, context);
		case EMFPackage.SEMESTER:
			return validateSemester((Semester) value, diagnostics, context);
		case EMFPackage.YEAR:
			return validateYear((Year) value, diagnostics, context);
		case EMFPackage.COURSE:
			return validateCourse((Course) value, diagnostics, context);
		case EMFPackage.SPECIALIZATION:
			return validateSpecialization((Specialization) value, diagnostics, context);
		case EMFPackage.COURSE_IN_SEMESTER:
			return validatecourseInSemester((courseInSemester) value, diagnostics, context);
		case EMFPackage.INSTITUTE:
			return validateInstitute((Institute) value, diagnostics, context);
		case EMFPackage.CREDITS:
			return validateCredits((Float) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(programme, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProgramme_programmeYearNonZero(programme, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the programmeYearNonZero constraint of '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROGRAMME__PROGRAMME_YEAR_NON_ZERO__EEXPRESSION = "self.numberOfYears > 0";

	/**
	 * Validates the programmeYearNonZero constraint of '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme_programmeYearNonZero(Programme programme, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(EMFPackage.Literals.PROGRAMME, programme, diagnostics, context,
				"http://www.eclipse.org/acceleo/query/1.0", "programmeYearNonZero",
				PROGRAMME__PROGRAMME_YEAR_NON_ZERO__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(year, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(year, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(year, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(year, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(year, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(year, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(year, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(year, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(year, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateYear_creditsInAYear(year, diagnostics, context);
		return result;
	}

	/**
	 * Validates the creditsInAYear constraint of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateYear_creditsInAYear(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// Checks that mandatory course credits dont exceed 60 points in a year
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		float credits = 0.0f;
		for (Semester semester : year.getSemesters()) {
			for (courseInSemester course : semester.getCourses()) {
				if (course.isMandatory()) {
					credits += course.getCourse().getCredits();
				}
			}
		}

		if (credits > 60) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "creditsInAYear", getObjectLabel(year, context) }, new Object[] { year },
								context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecourseInSemester(courseInSemester courseInSemester, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseInSemester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitute(Institute institute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(institute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCredits(Float credits, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCredits_Enumeration(credits, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCredits_Enumeration
	 */
	public static final Collection<Object> CREDITS__ENUMERATION__VALUES = wrapEnumerationValues(
			new Object[] { new Float(5.0F), new Float(7.5F), new Float(10.0F), new Float(15.0F), new Float(30.0F) });

	/**
	 * Validates the Enumeration constraint of '<em>Credits</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCredits_Enumeration(Float credits, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = CREDITS__ENUMERATION__VALUES.contains(credits);
		if (!result && diagnostics != null)
			reportEnumerationViolation(EMFPackage.Literals.CREDITS, credits, CREDITS__ENUMERATION__VALUES, diagnostics,
					context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EMFValidator
