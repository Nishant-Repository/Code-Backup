package com.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(20);
		list.add(15);
		list.add(25);
		list.add(12);
		list.add(22);
		list.add(33);
		System.out.println("Original List " +list);
				
		List<Integer> l1 = list.stream().filter(i-> (i%2== 0)).map(i-> i+0).collect(Collectors.toList());
		System.out.println("Even List by filter "+l1);
		
		List<Integer> l2 = list.stream().map(i-> (i*2)).collect(Collectors.toList());
		System.out.println("Doubled List by Map "+l2);
		
		Long evenNum = list.stream().filter(i -> (i%2 ==0)).count();
		System.out.println("Even num count : "+evenNum);
		
		Long oddNum = list.stream().filter(i -> (i%2 != 0)).count();
		System.out.println("Odd num count : "+oddNum);
		
		List<Integer> l3 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Default sorted List : "+l3);
		
		List<Integer> l4 = list.stream().sorted((i1,i2)-> i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Sorted list by ComparedTo List : "+l4);
		
		List<Integer> l5 = list.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("Reverse List by CompareTo : "+l5);
		
		int min = list.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println("Minimum Value of list : "+min);
		
		int max = list.stream().max((i1,i2)-> i1.compareTo(i2)).get();
		System.out.println("Maximun Value of list : "+max);
		
		Stream<Integer> s = Stream.of(9,99,999,9999,99999,999999);
		System.out.print("Covert Group of element into Stream :");
		s.map(i-> (i+1)).forEach(System.out :: println);		
	}

}
