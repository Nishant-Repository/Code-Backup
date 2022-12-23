package com.Lambda;

@FunctionalInterface
 interface Inter {
	 public void m1();
}
public class DemoLambdaExpr {

	public static void main(String args[]) {
		Inter i = () -> { System.out.println("Lambda Expression implementation");};
		i.m1();
		
	}
}
