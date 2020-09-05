package com.two.units;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo 
{

	@Test
	public void m1()
	{
		
		System.out.println("m1 of Test");
	}
	
	@Before
	public void m2()
	{
		System.out.println("m2 of before");
		
	}
	
	@After
	public void m3()
	{
		
		System.out.println("m3 of after");
	}
	
	@BeforeClass
	public static void m4()
	{
		System.out.println("m4 of beforeclass");
		
	}
	
	@AfterClass
	public static void m5()
	{
		System.out.println("m5 of afterclass");
		
	}
	@Test
	public void m6()
	{
		System.out.println("m6 of Test 2");
		
	}
}
