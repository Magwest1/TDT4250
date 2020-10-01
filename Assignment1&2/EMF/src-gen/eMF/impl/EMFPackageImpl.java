/**
 */
package eMF.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import eMF.Course;
import eMF.EMFFactory;
import eMF.EMFPackage;
import eMF.Institute;
import eMF.Programme;
import eMF.Semester;
import eMF.Specialization;
import eMF.Year;
import eMF.courseInSemester;
import eMF.util.EMFValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFPackageImpl extends EPackageImpl implements EMFPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseInSemesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instituteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType creditsEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eMF.EMFPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EMFPackageImpl() {
		super(eNS_URI, EMFFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EMFPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EMFPackage init() {
		if (isInited)
			return (EMFPackage) EPackage.Registry.INSTANCE.getEPackage(EMFPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEMFPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EMFPackageImpl theEMFPackage = registeredEMFPackage instanceof EMFPackageImpl
				? (EMFPackageImpl) registeredEMFPackage
				: new EMFPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEMFPackage.createPackageContents();

		// Initialize created meta-data
		theEMFPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theEMFPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return EMFValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theEMFPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EMFPackage.eNS_URI, theEMFPackage);
		return theEMFPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramme() {
		return programmeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramme_Name() {
		return (EAttribute) programmeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramme_Years() {
		return (EReference) programmeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramme_NumberOfYears() {
		return (EAttribute) programmeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramme_Specializations() {
		return (EReference) programmeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemester() {
		return semesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemester_SemesterNumber() {
		return (EAttribute) semesterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemester_Courses() {
		return (EReference) semesterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemester_SemesterInYear() {
		return (EReference) semesterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getYear() {
		return yearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYear_YearNumber() {
		return (EAttribute) yearEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getYear_Semesters() {
		return (EReference) yearEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYear_NumberOfSemesters() {
		return (EAttribute) yearEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getYear_YearInProgramme() {
		return (EReference) yearEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_CourseName() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_CourseCode() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Credits() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_Course() {
		return (EReference) courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecialization() {
		return specializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecialization_Name() {
		return (EAttribute) specializationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecialization_RequiredSpecialization() {
		return (EReference) specializationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecialization_SpecializationInProgramme() {
		return (EReference) specializationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecialization_Year() {
		return (EReference) specializationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getcourseInSemester() {
		return courseInSemesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getcourseInSemester_Mandatory() {
		return (EAttribute) courseInSemesterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getcourseInSemester_CourseIn() {
		return (EReference) courseInSemesterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getcourseInSemester_Level() {
		return (EAttribute) courseInSemesterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getcourseInSemester_Course() {
		return (EReference) courseInSemesterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstitute() {
		return instituteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstitute_Name() {
		return (EAttribute) instituteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstitute_Programme() {
		return (EReference) instituteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstitute_Course() {
		return (EReference) instituteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCredits() {
		return creditsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMFFactory getEMFFactory() {
		return (EMFFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		programmeEClass = createEClass(PROGRAMME);
		createEAttribute(programmeEClass, PROGRAMME__NAME);
		createEReference(programmeEClass, PROGRAMME__YEARS);
		createEAttribute(programmeEClass, PROGRAMME__NUMBER_OF_YEARS);
		createEReference(programmeEClass, PROGRAMME__SPECIALIZATIONS);

		semesterEClass = createEClass(SEMESTER);
		createEAttribute(semesterEClass, SEMESTER__SEMESTER_NUMBER);
		createEReference(semesterEClass, SEMESTER__COURSES);
		createEReference(semesterEClass, SEMESTER__SEMESTER_IN_YEAR);

		yearEClass = createEClass(YEAR);
		createEAttribute(yearEClass, YEAR__YEAR_NUMBER);
		createEReference(yearEClass, YEAR__SEMESTERS);
		createEAttribute(yearEClass, YEAR__NUMBER_OF_SEMESTERS);
		createEReference(yearEClass, YEAR__YEAR_IN_PROGRAMME);

		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__COURSE_NAME);
		createEAttribute(courseEClass, COURSE__COURSE_CODE);
		createEAttribute(courseEClass, COURSE__CREDITS);
		createEReference(courseEClass, COURSE__COURSE);

		specializationEClass = createEClass(SPECIALIZATION);
		createEAttribute(specializationEClass, SPECIALIZATION__NAME);
		createEReference(specializationEClass, SPECIALIZATION__REQUIRED_SPECIALIZATION);
		createEReference(specializationEClass, SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME);
		createEReference(specializationEClass, SPECIALIZATION__YEAR);

		courseInSemesterEClass = createEClass(COURSE_IN_SEMESTER);
		createEAttribute(courseInSemesterEClass, COURSE_IN_SEMESTER__MANDATORY);
		createEReference(courseInSemesterEClass, COURSE_IN_SEMESTER__COURSE_IN);
		createEAttribute(courseInSemesterEClass, COURSE_IN_SEMESTER__LEVEL);
		createEReference(courseInSemesterEClass, COURSE_IN_SEMESTER__COURSE);

		instituteEClass = createEClass(INSTITUTE);
		createEAttribute(instituteEClass, INSTITUTE__NAME);
		createEReference(instituteEClass, INSTITUTE__PROGRAMME);
		createEReference(instituteEClass, INSTITUTE__COURSE);

		// Create data types
		creditsEDataType = createEDataType(CREDITS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(programmeEClass, Programme.class, "Programme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramme_Name(), ecorePackage.getEString(), "name", null, 0, 1, Programme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramme_Years(), this.getYear(), this.getYear_YearInProgramme(), "years", null, 0, -1,
				Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramme_NumberOfYears(), ecorePackage.getEInt(), "numberOfYears", null, 0, 1,
				Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProgramme_Specializations(), this.getSpecialization(),
				this.getSpecialization_SpecializationInProgramme(), "specializations", null, 0, -1, Programme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semesterEClass, Semester.class, "Semester", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemester_SemesterNumber(), ecorePackage.getEInt(), "semesterNumber", null, 0, 1,
				Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSemester_Courses(), this.getcourseInSemester(), this.getcourseInSemester_CourseIn(),
				"courses", null, 0, -1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemester_SemesterInYear(), this.getYear(), this.getYear_Semesters(), "semesterInYear", null,
				0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yearEClass, Year.class, "Year", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYear_YearNumber(), ecorePackage.getEInt(), "yearNumber", null, 0, 1, Year.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYear_Semesters(), this.getSemester(), this.getSemester_SemesterInYear(), "semesters", null, 0,
				-1, Year.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYear_NumberOfSemesters(), ecorePackage.getEInt(), "numberOfSemesters", null, 0, 1, Year.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getYear_YearInProgramme(), this.getProgramme(), this.getProgramme_Years(), "yearInProgramme",
				null, 0, 1, Year.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_CourseName(), ecorePackage.getEString(), "courseName", null, 0, 1, Course.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_CourseCode(), ecorePackage.getEString(), "courseCode", null, 0, 1, Course.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Credits(), this.getCredits(), "credits", null, 0, 1, Course.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Course(), this.getcourseInSemester(), this.getcourseInSemester_Course(), "course",
				null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specializationEClass, Specialization.class, "Specialization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecialization_Name(), ecorePackage.getEString(), "name", null, 0, 1, Specialization.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialization_RequiredSpecialization(), this.getSpecialization(), null,
				"requiredSpecialization", null, 0, -1, Specialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialization_SpecializationInProgramme(), this.getProgramme(),
				this.getProgramme_Specializations(), "specializationInProgramme", null, 0, 1, Specialization.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialization_Year(), this.getYear(), null, "year", null, 0, -1, Specialization.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseInSemesterEClass, courseInSemester.class, "courseInSemester", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getcourseInSemester_Mandatory(), ecorePackage.getEBoolean(), "mandatory", null, 0, 1,
				courseInSemester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getcourseInSemester_CourseIn(), this.getSemester(), this.getSemester_Courses(), "courseIn", null,
				0, 1, courseInSemester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getcourseInSemester_Level(), ecorePackage.getEInt(), "level", null, 0, 1, courseInSemester.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getcourseInSemester_Course(), this.getCourse(), this.getCourse_Course(), "course", null, 0, 1,
				courseInSemester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instituteEClass, Institute.class, "Institute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstitute_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Institute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstitute_Programme(), this.getProgramme(), null, "programme", null, 0, -1, Institute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstitute_Course(), this.getCourse(), null, "course", null, 0, -1, Institute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(creditsEDataType, Float.class, "Credits", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/acceleo/query/1.0
		create_1Annotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] { "validationDelegates", "http://www.eclipse.org/acceleo/query/1.0" });
		addAnnotation(programmeEClass, source, new String[] { "constraints", "programmeYearNonZero" });
		addAnnotation(yearEClass, source, new String[] { "constraints", "creditsInAYear" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/acceleo/query/1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_1Annotations() {
		String source = "http://www.eclipse.org/acceleo/query/1.0";
		addAnnotation(programmeEClass, source, new String[] { "programmeYearNonZero", "self.numberOfYears > 0" });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(creditsEDataType, source, new String[] { "enumeration", "5 7.5 10 15 30" });
	}

} //EMFPackageImpl
