package com.java.demo;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8functions {

	public static void main(String[] args) {
		Consumer<String> cons = (s)->{
			System.out.println(s);
		};
		
		cons.accept("Amol");
		
		Supplier<String> spp = ()->{
			return "Amol";
		};
		
		System.out.println(spp.get());
		
		Predicate<String> p =(s) ->{
		if(s.equals("Saci"))
			return true;
		else
			return false;
		};
		
		System.out.println(p.test("Amol"));
		
		Function<String, Integer> fun = (s)->{
			return 1;
		};
		
		System.out.println(fun.apply("Amol"));
		
		test(p,"Amol");
	}

	public static boolean test(Predicate<String> p,String s) {
		return p.test(s);
	}
	
	public static void printVal(Consumer<String> cons, List<String> strList) {
		strList.forEach((s)->{
			cons.accept(s);
		});
	
	}
}
