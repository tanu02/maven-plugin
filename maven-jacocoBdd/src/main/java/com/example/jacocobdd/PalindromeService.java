package com.example.jacocobdd;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {

	public boolean isPalindrome(String inputString) {

		if (inputString == null)
			return false;
		if (inputString.isEmpty())
			return true;

		String reverseString = new StringBuilder(inputString).reverse().toString();
		return reverseString.equals(inputString);
	}
}
