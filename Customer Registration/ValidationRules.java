package utils;

import java.text.ParseException;
import java.util.Date;

import com.app.core.Customer;
import com.app.core.CustomerType;

import custom_exceptions.CustomerHandlingException;
import static com.app.core.Customer.sdf;


public class ValidationRules {
	private static Date endDate;
	static {
		try {
			endDate = sdf.parse("1-1-1995");
		} catch (ParseException e) {
			System.out.println("err in static init block " + e);
		}
	}

	public static void validateEmail(String email, Customer[] customers) 
		throws CustomerHandlingException {
		if (email.contains("@") && email.endsWith(".com")) {
			Customer c1 = new Customer(email);
			for (Customer c : customers) {
				if (c != null) {
					if (c.equals(c1))
						throw new CustomerHandlingException("Dup email ID!!!!!");
				}
		}
		} else 
			throw new CustomerHandlingException("Invalid email format!!!!!");

	}

	public static void validatePassword(String password) throws CustomerHandlingException {
		if (password.length() < 4 || password.length() > 10)
			throw new CustomerHandlingException("Invalid password length!!!!");
	}

	public static Date parseAndValidateDoB(String dob) throws ParseException, CustomerHandlingException {
		Date d1 = sdf.parse(dob);
		if (!d1.before(endDate))
			throw new CustomerHandlingException("Invalid DoB!!!!");
		return d1;
	}

	public static CustomerType parseAndValidateType(String custType) {
		return CustomerType.valueOf(custType.toUpperCase());
	}

	public static Customer validateAllInputs(String name, String email, String password, double regAmount, String dob,
			String type, Customer[] customers) throws ParseException, CustomerHandlingException {
		validateEmail(email, customers);
		validatePassword(password);
		Date validatedDate = parseAndValidateDoB(dob);
		CustomerType cTYpe = parseAndValidateType(type);
		return new Customer(name, email, password, regAmount, validatedDate, cTYpe);
	}
}
