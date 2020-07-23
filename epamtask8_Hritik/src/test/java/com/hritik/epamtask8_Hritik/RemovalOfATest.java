package com.hritik.epamtask8_Hritik;

import static org.junit.Assert.*;
import org.junit.Test;


public class RemovalOfATest {

	/*To-do list
	 * 1. "ABCD" => "BCD"
	 * 2. "AACD" => "CD"
	 * 3. "BACD" => "BCD"
	 * 4. "BBAA" => "BBAA"
	 * 5. "AABAA" => "BAA"
	 */
	
	RemovalOfA remove;
				
	@Test
	public void testFirstA() {
		remove = new RemovalOfA();
		assertEquals("BCD", remove.removeOfA("ABCD"));
	}
	
	@Test
	public void testFirst2As() {
		remove = new RemovalOfA();
		assertEquals("CD", remove.removeOfA("AACD"));
	}
	@Test
	public void test2ndA() {
		remove = new RemovalOfA();
		assertEquals("BCD", remove.removeOfA("BACD"));
	}
	@Test
	public void testNoAs() {
		remove = new RemovalOfA();
		assertEquals("BBAA", remove.removeOfA("BBAA"));
	}
	@Test
	public void test2As() {
		remove = new RemovalOfA();
		assertEquals("BAA", remove.removeOfA("AABAA"));
	}
}
