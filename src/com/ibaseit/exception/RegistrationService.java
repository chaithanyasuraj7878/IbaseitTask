package com.ibaseit.exception;

import java.util.Arrays;
import java.util.List;

public class RegistrationService {
	List<String> registeredEmails = Arrays.asList("chaithanyas@ibaseit.com", "xyz@ibaseit.com", "abc@ibaseit.com");

	public void validateEmail(String email) {

		if (registeredEmails.contains(email)) {
			try {
				throw new EmailNotUniqueException("errour found");
			} catch (EmailNotUniqueException e) {
				e.printStackTrace();
			}

		} else {
			registeredEmails.add(email);
		}

	}
}