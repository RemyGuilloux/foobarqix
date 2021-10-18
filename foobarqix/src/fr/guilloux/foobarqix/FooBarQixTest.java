package fr.guilloux.foobarqix;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FooBarQixTest {

	@Test
	public void shoulReturnInputAsString() {
		Assert.assertEquals("1", new FooBarQix().given(1));
		Assert.assertEquals("2", new FooBarQix().given(2));
	}

}
