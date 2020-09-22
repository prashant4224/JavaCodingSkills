package com.javahungry.icompass;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Features {

	public static void main(String[] args) {
		//60
		List<String> list = Arrays.asList("1Z0-809", "1Z0-810", "1Z1-811", "1Z0-803");
		List<String> list2 = list.stream().flatMap(e -> Stream.of(e.split("-")))
		.distinct().sorted().collect(Collectors.toList());
		System.out.println(list2);
		
		//58
		Integer i = new Integer(2) + new Integer(2);
		switch (i) {
		case 4: System.out.println("foo");	break;
		default: System.out.println("other");	break;
		}
		
		
		//56
		try {
			throw new NullPointerException();
		} catch (NullPointerException e2) {
			System.out.print("a");
		} catch (Exception ex) {
			System.out.print("b");
		} finally {
			System.out.print("c");
		}
		
		//55
		long ls[] = {4,8,12};
		Arrays.parallelPrefix(ls, Long::sum);
		System.out.println(Arrays.toString(ls));
		
		Test ab = new Test();
		ab.throwing("IO");
	}

}

class Test{

	public void throwing(String s) {
		switch (s) {
		case "IO":
//			throw new IOException();//  here breaks
//			break;
		case "Run":
			throw new RuntimeException();
//			break;

		default: try { 
			throw new Exception();			
		} catch (Exception e) {
			// TODO: handle exception
		}
			break;
	}
		
	}
}
