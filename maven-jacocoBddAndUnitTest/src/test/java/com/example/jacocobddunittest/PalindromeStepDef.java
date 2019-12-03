package com.example.jacocobddunittest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = MavenJacocoApplication.class)
public class PalindromeStepDef {

	@Autowired
	private TestRestTemplate template;

	ResponseEntity<Boolean> responseEntity;

	@When("I invoke palindrome service with {string} as input")
	public void invokeIsPalindrome(String pal) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString("/palindrome/" + pal);
		responseEntity = template.getForEntity(builder.toUriString(), Boolean.class);
	}

	@Then("I should get true")
	public void validateIsPalindromeResponse() {
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
		assertTrue(responseEntity.getBody());
	}
}
