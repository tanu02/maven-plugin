package com.example.jacocobddunittest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PalindromeServiceTest {

	@Autowired
	private PalindromeService palindromeService;

	@Test
	public void testNullString() {
		assertFalse(palindromeService.isPalindrome(null));
	}

	@Test
	public void testEmptyString() {
		assertTrue(palindromeService.isPalindrome(""));
	}
}
