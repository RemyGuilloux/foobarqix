package fr.guilloux.foobarqix;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FooBarQixTest {

	@Test
	public void shouldReturnInputAsString() {
		Assert.assertEquals("1", new FooBarQix().imperative(1));
		Assert.assertEquals("2", new FooBarQix().imperative(2));
	}
	
	@Test
	public void shouldReturnFooFooWhenOutisDivisibleBy3andEqual3() {
		Assert.assertEquals("FooFoo", new FooBarQix().imperative(3));
	}

	@Test
	public void shouldReturnBarBarWhenOutisDivisibleBy5andEqual5() {
		Assert.assertEquals("BarBar", new FooBarQix().imperative(5));
	}
	
	@Test
	public void shouldReturnQixQixWhenOutisDivisibleBy7andEqual7() {
		Assert.assertEquals("QixQix", new FooBarQix().imperative(7));
	}
	@Test
	public void shouldReturnFooWhenOutisDivisibleBy3() {
		Assert.assertEquals("Foo", new FooBarQix().imperative(9));
	}
	
	@Test
	public void shouldReturnBarWhenOutisDivisibleBy5() {
		Assert.assertEquals("Bar", new FooBarQix().imperative(10));
	}
}
