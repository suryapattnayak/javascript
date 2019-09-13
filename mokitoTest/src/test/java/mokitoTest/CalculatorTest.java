package mokitoTest;

import static org.junit.Assert.*;

import  static org.mockito.Mockito.when;
import  static org.mockito.Mockito.verify;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

public class CalculatorTest {
	Calculator c=null;
	@Mock
	CalculatorService service;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		c=new Calculator(service);
	}

	@After
	public void tearDown() throws Exception {
	}

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	/*@Test
	public void testAdd() throws Exception
	{
		c.add(2, 3);
	}
	*/
	
	
	@Test
	public void testperform() {
		
		c.add(2, 3);
		when(service.add(2, 3)).thenReturn(10);
		assertEquals(10, c.add(2, 3));
		verify(service).add(2,3);
	}

	
}
