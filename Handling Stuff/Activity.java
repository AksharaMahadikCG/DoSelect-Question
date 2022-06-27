package com.java;

class Activity {
	// Implement Activity class here..
	String string1;
	String string2;
	String operator;

	Activity(String string1, String string2, String operator) {
		this.string1 = string1;
		this.string2 = string2;
		this.operator = operator;
	}
}

class MyException extends Exception {
	MyException(String msg) {
		super(msg);
	}
}
