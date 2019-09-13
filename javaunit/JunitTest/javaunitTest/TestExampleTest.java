package javaunitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestExampleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testADDInts() {
		int a=1;
		int b=2;
		TestExample test1=new TestExample();
		int result=test1.ADDInts(a, b);
		assertEquals(3, result);
	}

	@Test
	public void testADDString()
	{
		String a="surya";
		String b="pattanayak";
		TestExample test2=new TestExample();
		String result1=test2.ADDString(a, b);
		assertEquals("suryapattanayak", result1);
	}
}
