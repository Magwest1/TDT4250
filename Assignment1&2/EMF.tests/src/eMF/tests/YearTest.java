/**
 */
package eMF.tests;

import eMF.EMFFactory;
import eMF.Semester;
import eMF.Year;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link eMF.Year#getNumberOfSemesters() <em>Number Of Semesters</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class YearTest extends TestCase {

	/**
	 * The fixture for this Year test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Year fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(YearTest.class);
	}

	/**
	 * Constructs a new Year test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YearTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Year test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Year fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Year test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Year getFixture() {
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
		setFixture(EMFFactory.eINSTANCE.createYear());
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

	/**
	 * Tests the '{@link eMF.Year#getNumberOfSemesters() <em>Number Of Semesters</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMF.Year#getNumberOfSemesters()
	 * @generated NOT
	 */
	public void testGetNumberOfSemesters() {
		try {
			this.setUp();			
		} catch(Exception e) {}
		Semester sem1 = EMFFactory.eINSTANCE.createSemester();
		Semester sem2 = EMFFactory.eINSTANCE.createSemester();
		sem1.setSemesterInYear(this.fixture);
		sem2.setSemesterInYear(this.fixture);
		int actual = this.fixture.getNumberOfSemesters();
		int expect = 2;
		assertEquals(expect, actual);
		
	}

} //YearTest
