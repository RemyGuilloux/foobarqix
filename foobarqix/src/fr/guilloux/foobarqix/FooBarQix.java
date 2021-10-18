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
				for (Integer divisible  : divisibles.keySet()) {
					if(value % divisible == 0) return divisibles.get(divisible);
					
				}
			return value.toString();
		}
}





