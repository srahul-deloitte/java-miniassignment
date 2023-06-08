package datavalidation;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class DataValidation {
	public static List<String> isValid(String email, String phno, String credno)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        
        String phoneRegex = "^\\d{10}$";
        
        String creditCardRegex = "^\\d{12}$";
                              
        Pattern emailPat = Pattern.compile(emailRegex);
        Pattern phonePat = Pattern.compile(phoneRegex);
        Pattern creditCardPat = Pattern.compile(creditCardRegex);
        
        List<String> messages = new ArrayList();
        
        if (!emailPat.matcher(email).matches()) {
        	messages.add("Email validation failed");
        } else {
        	messages.add("Email validation success");
        }
        
        if (!phonePat.matcher(phno).matches()) {
        	messages.add("PhoneNumber validation failed");
        } else {
        	messages.add("PhoneNumber validation success");
        }
        
        if (!creditCardPat.matcher(credno).matches()) {
        	messages.add("Credit card validation failed");
        } else {
        	messages.add("Credit card validation success");
        }
        
        return messages;
        
    }

}
