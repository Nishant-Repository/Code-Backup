package com.Lambda;

public class DemoThreadMethodRef {
	
	public void m1() {
		for(int i = 0; i<5;i++) {
			System.out.println("Child thread "+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThreadMethodRef dt = new DemoThreadMethodRef();
		Runnable r = dt :: m1;
		Thread t = new Thread(r);
		t.start();
		for(int i = 0; i<5;i++) {
			System.out.println("Main thread "+i);
		}
	}

}
