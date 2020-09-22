package com.javahungry.icompass;

import java.util.LinkedHashSet;
import java.util.Set;

class Exc0 extends Exception {}
class Exc1 extends Exc0 {}
public class ExceptionTest {

	public static void main(String[] args) {
		try {
			throw new Exc1();
		} catch (Exc0 e0) {
			System.out.println("Exc0 caught");
		} catch (Exception e) {
			System.out.println("exception caught");
		}
		
		Set s = new LinkedHashSet<>();
		s.add(10);
		s.add(14);
		s.add(12);
		s.add(8);
		
		System.out.println(s);

	}

}
