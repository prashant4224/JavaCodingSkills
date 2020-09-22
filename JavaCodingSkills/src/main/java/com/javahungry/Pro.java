package com.javahungry;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.omg.CORBA.OMGVMCID;

class Animal {}
class Dog extends Animal {}
class Test<Double> {}

class Alpha {}
class Beta extends Alpha {}
class Gamma extends Alpha {}
public class Pro {

	public static void main(String[] args) {
		
//		Movable.speed=10;
		System.out.println(Movable.s);
		Optional.empty();
		Alpha a = new Beta();
//		Gamma g = (Gamma)a;
		
		/*
		Beta b = new Beta();
		Alpha c = (Alpha)b;
		*/
		
//		System.out.println(c);
		
//		System.out.println(g.hashCode());
		
		List<Dog> d = new ArrayList<Dog>();
//		List<Animal> a = new ArrayList<Dog>();
		/*int i = 2;
		int array[] = new int[++i];
		System.out.println(array.length);*/
		
		IntStream ints = IntStream.of(5,10,15);
//		Stream stngs = ints.boxed().map(Integer::toString);
//		System.out.println(stngs.findAny());
		
//		IntStream ints = IntStream.of(3,2,1,5,3,4,5);
//		System.out.println(ints.filter(e -> e>3).distinct().average().getAsDouble());

//		Test<String> my = new Test<>();
		
//		return;
		String[] units = {"boo", "foo", "loo"};
		String str = (units.length > 0) ? units[0] : null;
		System.out.println(str);
	}

}
