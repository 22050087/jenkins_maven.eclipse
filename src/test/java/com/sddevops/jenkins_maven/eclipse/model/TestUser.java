package com.sddevops.jenkins_maven.eclipse.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestUser {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testUserEmptyConstructor() {
		User user = new User();
		assertEquals("", user.getFirstName());
		assertEquals("", user.getLastName());
		assertEquals("", user.getEmail());
		assertEquals("", user.getPassword());
	}

	@Test
	void testUser() {
		User user = new User("a", "b","c","d");
		assertEquals("a", user.getFirstName());
		assertEquals("b", user.getLastName());
		assertEquals("c", user.getEmail());
		assertEquals("d", user.getPassword());
	}

	@Test
	void testGetSetId() {
		User user = new User();
		user.setId(Long.valueOf(1));
		assertEquals(Long.valueOf(1), user.getId());
	}

	@Test
	void testGetSetFirstName() {
		User user = new User();
		user.setFirstName("a");
		assertEquals("a", user.getFirstName());
	}

	@Test
	void testGetSetLastName() {
		User user = new User();
		user.setLastName("b");
		assertEquals("b", user.getLastName());
	}

	@Test
	void testGetSetEmail() {
		User user = new User();
		user.setEmail("c");
		assertEquals("c", user.getEmail());
	}

	@Test
	void testGetSetPassword() {
		User user = new User();
		user.setPassword("d");
		assertEquals("d", user.getPassword());
	}
}
