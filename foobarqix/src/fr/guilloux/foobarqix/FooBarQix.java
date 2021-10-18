package fr.guilloux.foobarqix;

public class FooBarQix {
	
		
		public String given(Integer number) {
			if (number % 3 == 0 && number == 3) return "FooFoo";
			if (number % 5 == 0 && number == 5) return "BarBar";
			if (number % 7 == 0 && number == 7) return "QixQix";
			if (number % 3 == 0) return "Foo";
			return number.toString();
		}
	}




