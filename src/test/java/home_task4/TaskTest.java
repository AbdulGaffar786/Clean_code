package home_task4;

import static org.junit.Assert.*;

import org.junit.*;

public class TaskTest {
	Task4 obj =new Task4();
	@Test
	public void testsimpleInterest1()
	{
	assertEquals(360,obj.simpleInterest(2000,3,6));
	}
	@Test
	public void testcompoundInterest()
	{
	assertEquals(2185,obj.compoundInterest(2000,3,0.03));
	}
}
