package fr.guilloux.foobarqix;
;
public class FooBarQix {
	
		
		public String imperative(Integer number) {
			String result ="";
			if (number % 3 == 0 && number == 3) return "FooFoo";
			if (number % 5 == 0 && number == 5) return "BarBar";
			if (number % 7 == 0 && number == 7) return "QixQix";
			if (number % 3 == 0) { 
				  result +="Foo";
			}
			if(number % 5 == 0) {
				result += "Bar";
			}
			if(number % 7 == 0) {
				result += "Qix";
			}
			
			
			String toFooBar = String.valueOf(number);
			for (int i = 0; i < toFooBar.length(); i++) {
				char element = toFooBar.charAt(i);
				if(element =='3');
				result += "Foo";
				if(element =='5');
				result += "Bar";
				if(element =='7');
				result += "Qix";
			}
			return result.isEmpty() ? toFooBar : result;
			
		}
		
	}




