package com.example.jacocobdd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/palindrome")
public class PalindromeController {

	@Autowired
	private PalindromeService palindromeService;

	@GetMapping("/{pal}")
	public Boolean checkPalindrome(@PathVariable String pal) {
		return palindromeService.isPalindrome(pal);
	}

}
