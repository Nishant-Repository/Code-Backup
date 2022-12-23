import org.junit.jupiter.api.*;


class CalculatorTesting {

	@Test
	void test() {
		//System.out.println("Not yet implemented");
	}
	
	@BeforeAll
	static void setup() 	{
		System.out.println("@Before all Execution");
	}
	@BeforeEach
	void setupThis() 	{
		System.out.println("@Before Each  Execution");
	}
	@AfterEach
	void tearThis() 	{
		System.out.println("@After Each Execution");
	}
	@AfterAll 
	static void tear() 	{
		System.out.println("@After all Execution");
	}
	
	
	Calculator c = new Calculator();
	
	@Test
	void testSum() 	{
		int expRes =6;
		int acRes = c.doSum(3, 3);
		Assertions.assertEquals(expRes,acRes);
	}
	@Test
	void testProud() 	{
		int expRes =6;
		int acRes = c.doProud(2, 3);
		Assertions.assertEquals(expRes,acRes);
	}
	@Test
	void testComp() 	{
		boolean acRes = c.compTonum(2, 2);
		Assertions.assertTrue(acRes);
	}
	
}
