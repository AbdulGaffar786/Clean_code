package home_task4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class House_construction_cost_test {

	HouseConstructionCost obj1=new HouseConstructionCost();
	@Test
	public void testCost1()
	{
	assertEquals(494000,obj1.cost_per_square_feet("standard",260,'Y'));
	}
	@Test
	public void testCost2()
	{
	assertEquals(572000,obj1.cost_per_square_feet("above",260,'y'));
	}
	@Test
	public void testCost3()
	{
	assertEquals(650000,obj1.cost_per_square_feet("high",260,'y'));
	}
	@Test
	public void testCost4()
	{
	assertEquals(312000,obj1.cost_per_square_feet("standard",260,'N'));
	}
	@Test
	public void testCost5()
	{
	assertEquals(390000,obj1.cost_per_square_feet("above",260,'n'));
	}
	@Test
	public void testCost6()
	{
	assertEquals(468000,obj1.cost_per_square_feet("high",260,'n'));
	}
	@Test
	public void testCost7()
	{
	assertEquals(0,obj1.cost_per_square_feet("unknown",260,'Y'));
	}
	
}
