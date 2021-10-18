package fr.guilloux.foobarqix;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FooBarQixTest {

	@Test
	public void shouldReturnInputAsString() {
		new FooBarQix();
		Assert.assertEquals("1", FooBarQix.given(1));
		new FooBarQix();
		Assert.assertEquals("2", FooBarQix.given(2));
	}
	
	
	@Test
	public void shouldReturnFooWhenOutisDivisibleBy3() {
		new FooBarQix();
		Assert.assertEquals("Foo", FooBarQix.given(9));
	}
	
	@Test
	public void shouldReturnBarWhenOutisDivisibleBy5() {
		new FooBarQix();
		Assert.assertEquals("Bar", FooBarQix.given(10));
	}
	@Test
	public void shouldReturnQixWhenOutisDivisibleBy7() {
		new FooBarQix();
		Assert.assertEquals("Qix", FooBarQix.given(14));
	}
	@Test
	public void shouldReturnCombinationFoo_Bar_Qix() {
		new FooBarQix();
		Assert.assertEquals("FooBar", FooBarQix.given(3*5));
		Assert.assertEquals("BarQix", FooBarQix.given(5*7));
		Assert.assertEquals("FooBarQix", FooBarQix.given(3*5*7));
	}
	@Test
	public void shouldReplace3ByFoo() {
		new FooBarQix();
		Assert.assertEquals("Foo", FooBarQix.given(13));
	}
	
	
	

}
