package com.svit.day3;

public class StaticInstanceVariables {
	static int countOfOrders; // static variables
	static int countOfitems;
	String orderId; // Instance variables

	public static void main(String[] args) {

		StaticInstanceVariables orderInst = new StaticInstanceVariables();
		StaticInstanceVariables.countOfOrders = 10;
		System.out.println(StaticInstanceVariables.countOfOrders);
		countOfitems = 20;
		System.out.println(countOfitems);
		orderInst.orderId = "Ord1_11Nov2017_3578923";

		System.out.println(orderInst.orderId);

		String name = "Jan";
		System.out.println(name);

	}
}
