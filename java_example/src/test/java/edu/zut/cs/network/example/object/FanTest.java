package edu.zut.cs.network.example.object;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.zut.cs.network.example.object.Fan;

public class FanTest {

	Fan fan;

	@Test
	public void testFan() {
		this.fan = new Fan();
		assertNotNull(this.fan);
	}

}
