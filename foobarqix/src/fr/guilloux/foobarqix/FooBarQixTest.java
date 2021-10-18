package fr.guilloux.foobarqix;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FooBarQixTest {
/**
 * @Test
	public void shouldReturnCombinationFoo_Bar_Qix() {
		new FooBarQix();
		Assert.assertEquals("FooBar", FooBarQix.given(3*5*4));
		Assert.assertEquals("BarQix", FooBarQix.given(5*7*2));
		Assert.assertEquals("FooBarQix", FooBarQix.given(3*5*7*2));
	}
 */
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
	public void shouldReplace3ByFoo() {
		new FooBarQix();
		Assert.assertEquals("Foo", FooBarQix.given(13));
	}
	@Test
	public void shouldReplace5ByBar() {
		new FooBarQix();
		Assert.assertEquals("Bar", FooBarQix.given(52));
	}
	@Test
	public void shouldReplace7ByQix() {
		new FooBarQix();
		Assert.assertEquals("Qix", FooBarQix.given(71));
	}
	
	
	
	

}
