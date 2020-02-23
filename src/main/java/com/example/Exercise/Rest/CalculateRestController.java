package com.example.Exercise.Rest;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculateRestController{

	private final RateLimiter rateLimiter = RateLimiter.create(100); // used to limit the rate of the API up to 100 requests per second

	
	@RequestMapping(method = RequestMethod.POST, value = "/api")
	public String CalculateBigNumbers(@RequestParam String num1, @RequestParam String num2) {

		rateLimiter.acquire(1);

		try {
			//create string without the first letter of num1 and num2
			String num1FirstLetter = num1.substring(1, num1.length());
			String num2FirstLetter = num2.substring(1, num2.length());

			//checks if the num1 or num2 are not containing only numbers from 1 to 9 and "-" charecter and num1FirstLetter
			//and num2FirstLetter containing "-" charecter
			if (!num1.matches("[0-9-]+") || !num2.matches("[0-9-]+") ||
					num1FirstLetter.contains("-") || num2FirstLetter.contains("-")) {
				return "Please use only integers and '-' operator for declaring negative integers!";
			} else {
				String tempnum1 = num1;
				String tempnum2 = num2;

				// Check condition if one string is negative
				if (num1.charAt(0) == '-' && num2.charAt(0) != '-') {
					num1 = num1.substring(1);
				} else if (num1.charAt(0) != '-' && num2.charAt(0) == '-') {
					num2 = num2.substring(1);
				} else if (num1.charAt(0) == '-' && num2.charAt(0) == '-') {
					num1 = num1.substring(1);
					num2 = num2.substring(1);
				}
				String s1 = new StringBuffer(num1).reverse().toString();
				String s2 = new StringBuffer(num2).reverse().toString();

				int[] m = new int[s1.length() + s2.length()];

				// Go from right to left in num1
				for (int i = 0; i < s1.length(); i++) {
					// Go from right to left in num2
					for (int j = 0; j < s2.length(); j++) {
						m[i + j] = m[i + j] + (s1.charAt(i) - '0') * (s2.charAt(j) - '0');

					}
				}


				String product = new String();
				// Multiply with current digit of first number
				// and add result to previously stored product
				// at current position.
				for (int i = 0; i < m.length; i++) {
					int digit = m[i] % 10;
					int carry = m[i] / 10;
					if (i + 1 < m.length) {
						m[i + 1] = m[i + 1] + carry;
					}
					product = digit + product;

				}
				// ignore '0's from the right
				while (product.length() > 1 && product.charAt(0) == '0') {
					product = product.substring(1);
				}
				// Check condition if one string is negative
				if (tempnum1.charAt(0) == '-' && tempnum2.charAt(0) != '-') {
					product = new StringBuffer(product).insert(0, '-').toString();
				} else if (tempnum1.charAt(0) != '-' && tempnum2.charAt(0) == '-') {
					product = new StringBuffer(product).insert(0, '-').toString();
				} else if (tempnum1.charAt(0) == '-' && tempnum2.charAt(0) == '-') {
					product = product;
				}

				//performing a check to see if the product will be equal to -0, if yes - setting it to just 0.
				if (product.substring(0, 1).equals("-") && product.substring(1, 2).equals("0")) {
					product = product.substring(1, product.length());
				}

				return product;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
}
