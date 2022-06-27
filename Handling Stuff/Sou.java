package com.java;

public class Sou {
	// Implement the two function given in description in here...
	public String handleException(Activity a) {
		String s1 = a.string1;
		String s2 = a.string2;
		String s3 = a.operator;
		try {
			if (s1 == null || s2 == null)
				throw new NullPointerException("Null values found");
			else if (s3 != "+" && s3 != "-")
				throw new MyException(s3);
		} catch (NullPointerException e) {
			return e.getMessage();
		} catch (MyException ex) {
			return ex.getMessage();
		}
		return "No Exception Found";
	}

	public String doOperation(Activity a) {
		String s1 = a.string1;
		String s2 = a.string2;
		String s3 = a.operator;
		String s = "";
		switch (s3) {
		case "+":
			s = s1 + s2;
			break;
		case "-":
			s = s1.replace(s2, "");
			break;
		}
		return s;
	}

	public static void main(String args[]) throws Exception {
		// Write your own main to check the program...
		String s1 = "abc";
		String s2 = "xyz";
		String s3 = "-";
		Activity a = new Activity(s1, s2, s3);
		Sou obj = new Sou();
		System.out.println(obj.handleException(a));
		System.out.println(obj.doOperation(a));
		
	}
}
