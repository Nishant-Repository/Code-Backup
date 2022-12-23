package com.Lambda;

class Sample {
	Sample() {
			System.out.println("Sample class constructor");
			}
}
interface Interf {
	public Sample getObject();
}
public class DemoConstructorRef {

	public static void main(String[] args) {
		Interf i = Sample :: new;
		i.getObject();
	}

}
