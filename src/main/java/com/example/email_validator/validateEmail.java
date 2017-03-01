package com.example.email_validator;

public class validateEmail 
{
	public boolean validateEmail(String email)
	{
		boolean result = true;
		
		//Check if there is a single @ character
		int counter = 0;
		for( int i=0; i<email.length(); i++ ) {
		    if( email.charAt(i) == '@' ) {
		        counter++;
		    } 
		}
		
		if(counter!=1)
		{
			result = false;
		}
		
		//Check if there is an . character
		if(!email.contains("."))
		{
			result = false;
		}
		return result;
	}
}
