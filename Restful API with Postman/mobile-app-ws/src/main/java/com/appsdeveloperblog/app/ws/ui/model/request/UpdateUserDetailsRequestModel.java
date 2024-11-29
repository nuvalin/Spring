package com.appsdeveloperblog.app.ws.ui.model.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UpdateUserDetailsRequestModel {
	@NotNull(message="First name cannot be null")
	@Size(min=2, message = "First name must not be less than 2 characters")
private String fristName;
	
	@NotNull(message="Last name cannot be null")
	@Size(min=2, message = "Last name must not be less than 2 characters")
private String lastName;

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
