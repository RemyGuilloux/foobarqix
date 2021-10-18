package fr.guilloux.foobarqix;

import java.util.HashMap;
import java.util.Map;

public class FooBarQix {
	 
			public static Map<Integer, String> divisibles = new HashMap<>();
			static {
				divisibles.put(3, "Foo");
				divisibles.put(5, "Bar");
				divisibles.put(7, "Qix");
				
			}
			
			public static String given (Integer value) {
				
				String result = "";
				boolean isDivisible = false;
				
				for (Integer divisible  : divisibles.keySet()) {
					if(value % divisible == 0) {
						
						result += divisibles.get(divisible);
						isDivisible = true;
							
					}
					
				}
				
				String[] numbers = value.toString().split("");
				
				for (String number : numbers) {
					
					if(number.equals("3"))
						return "Foo";
					
				}
				if (isDivisible) return result;
					return value.toString();
		}
}





