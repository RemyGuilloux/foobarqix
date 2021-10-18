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
				
				String contain = contains(value);
				if(!"".equals(contain)) return contain;
				
				String result = divisor(value);
				if(!"".equals(result)) return result;
				
				
				return value.toString();
			}
				
				private static String contains(Integer value) {
					String[] numbers = value.toString().split("");
					
					for (String number : numbers) {
						for(Integer divisible : divisibles.keySet()) {
							if(number.equals(divisible.toString())) return divisibles.get(divisible);
						}
						
					}
					return "";
				}
				
				private static String divisor(Integer value) {
					String result = "";
					for (Integer divisible  : divisibles.keySet()) {
						if(value % divisible == 0) {
							
							result += divisibles.get(divisible);
							
						}
						
					}
					return result;
				}
				
		}






