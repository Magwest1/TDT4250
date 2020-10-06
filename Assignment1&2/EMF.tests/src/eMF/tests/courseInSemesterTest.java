/**
 */
package eMF.tests;

import eMF.EMFFactory;
import eMF.courseInSemester;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>course In Semester</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class courseInSemesterTest extends TestCase {

	/**
	 * The fixture for this course In Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected courseInSemester fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(courseInSemesterTest.class);
	}

	/**
	 * Constructs a new course In Semester test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public courseInSemesterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this course In Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(courseInSemester fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this course In Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected courseInSemester getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EMFFactory.eINSTANCE.createcourseInSemester());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //courseInSemesterTest
