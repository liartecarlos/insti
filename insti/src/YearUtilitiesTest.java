import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class YearUtilitiesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}

	@Test
	public void test1() {
		System.out.println("Test1 para verificar caso con año 400 (visiesto)");
		assertEquals(true, YearUtilities.isLeap(400));
	}
	
	@Test
	public void test2() {
		System.out.println("Test1 para verificar caso con año 404 (no-visiesto)");
		assertEquals(false, YearUtilities.isLeap(404));
	}
	
	@Test
	public void test3() {
		System.out.println("Test1 para verificar caso con año 0 (no-visiesto)");
		assertEquals(true, YearUtilities.isLeap(0));
	}

}
