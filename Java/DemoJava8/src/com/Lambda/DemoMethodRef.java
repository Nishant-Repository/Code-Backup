package com.Lambda;

interface Inter1 {
	public void m1();
}
public class DemoMethodRef {
	
	public static void m2()
	{
		System.out.println("Method Refrence Implementation");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//  Interface reference = CLASSNAME :: method which we need to reuse or call from interface method	
		Inter1 i = DemoMethodRef :: m2;
		i.m1();

	}

}
