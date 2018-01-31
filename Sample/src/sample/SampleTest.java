package sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {
	
	public Sample sample = new Sample();

	@Test
	public void testAdd() {
		assertEquals(7, sample.add(4, 3));
	}
}
