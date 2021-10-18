package fr.guilloux.foobarqix;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FooBarQixTest {

	@Test
	public void shouldReturnInputAsString() {
		Assert.assertEquals("1", new FooBarQix().given(1));
		Assert.assertEquals("2", new FooBarQix().given(2));
	}
	
	@Test
	public void shouldReturnFooFooWhenOutisDivisibleBy3() {
		Assert.assertEquals("FooFoo", new FooBarQix().given(3));
	}

	@Test
	public void shouldReturnBarBarWhenOutisDivisibleBy5() {
		Assert.assertEquals("BarBar", new FooBarQix().given(5));
	}
	
	@Test
	public void shouldReturnBarBarWhenOutisDivisibleBy7() {
		Assert.assertEquals("QixQix", new FooBarQix().given(7));
	}
	
}
