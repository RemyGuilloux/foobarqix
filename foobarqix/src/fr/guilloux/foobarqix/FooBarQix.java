package fr.guilloux.foobarqix;

public class FooBarQix {
	
		
		public String given(Integer number) {
			if (number % 3 == 0) return "FooFoo";
			if (number % 5 == 0) return "BarBar";
			if (number % 7 == 0) return "QixQix";
			return number.toString();
		}
	}




