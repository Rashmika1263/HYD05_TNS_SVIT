package com.svit.day3;

public class TestThisInstance {
	public static void main(String args[]) 
	{
	 
	InstanceDemo id = new InstanceDemo();
	id.callme();	
	System.out.println("The value of a = " + InstanceDemo.a);
	System.out.println();

	}
}
