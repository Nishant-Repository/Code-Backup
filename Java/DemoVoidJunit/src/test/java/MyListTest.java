import org.junit.jupiter.api.*;

public class MyListTest {
	
	private static MyList lstTest = new MyList();
	
	@BeforeAll
	public static void init() {
		lstTest.add("Apple");
		lstTest.add("Banana");
		lstTest.add("Chiku");
	}
	@Test
	public void testSize() {
		Assertions.assertEquals(3, lstTest.size());
	}
	@Test
	public void testAdd() {
		lstTest.add("Guava");
		Assertions.assertEquals(3, lstTest.size());
	}
	@Test
	public void testRemove() {
		lstTest.add("Banana");
		Assertions.assertEquals(2, lstTest.size());
	}	
	@Test
	public void testRemoveException() {
		lstTest.add("Kiwi");
		Assertions.assertEquals(2, lstTest.size());
	}
	@AfterAll
	public static void destroy() {
		lstTest.removeAll();
	}
	
}
