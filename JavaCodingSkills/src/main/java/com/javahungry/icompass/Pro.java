package com.javahungry.icompass;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import ch.qos.logback.core.util.Duration;

class Animal {}
class Dog extends Animal {}
public class Pro {

	public static void main(String[] args) {
		List<Dog> c2 = new ArrayList<Dog>();
//		List<Animal> c3 = new ArrayList<Dog>();
//		ArrayList<Object> c4 = new ArrayList<Animal>();
		
		Instant ins = Instant.now();
		System.out.println(ins);
		System.out.println(ins.plus(1, ChronoUnit.HOURS).plus(10, ChronoUnit.MINUTES));
//		System.out.println(ins);

		String[][] names = {{"Piumi ", "Buddhika ", "and "}, {"Rekha ", "Sankalpa "}};
		
		System.out.println(names[0][0] + names[1][0] + names[0][2] + names[0][1] + names[1][1]);
		
		List list = new ArrayList<>();
		list.add(new Integer(10));
		list.add(new Integer(11));
		list.add(new Integer(13));
		list.add(new Integer(14));
//		list.removeIf(in -> in%2 != 0); //- Type safety: The method removeIf(Predicate) belongs to the raw type Collection. References to generic type Collection<E> should be 
//		 parameterized
		System.out.println(list);
		
		LocalDate ld = LocalDate.of(2016, 1, 31).plusMonths(1);
		System.out.println(ld);
		

	}

}
