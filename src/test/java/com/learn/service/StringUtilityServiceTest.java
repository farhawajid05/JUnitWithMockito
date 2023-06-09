package com.learn.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringUtilityServiceTest {
	StringUtilityService service;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		service = new StringUtilityService();
	}

	@After
	public void tearDown() throws Exception {
		service = null;
	}

	@Test
	public void testGetLengthForInputString() {
		int len = service.getLengthForInputString("Annes");
		assertEquals("Length of the string expected to be 5 actual "+len, 5, len);
	}
	@Test(expected=NullPointerException.class)
	public void testValidateException() {
		assertTrue("Null values are not allowed",service.validate(null, "admin123"));
	}
	
	@Test
	public void testValidate() {
		assertTrue("Input credentails are invalid",service.validate("admin", "admin123"));
	}

	@Test
	public void testConvertToUpperCase() {
		assertEquals("Data need to be WELCOME","WELCOME",service.convertToUpperCase("welcome"));
	}

}
