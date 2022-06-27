package com.java;

import java.util.Scanner;

public class So {
	String searchForJob(int age, String highestQualification) throws NotEligibleException {
		String s = "";
		if (age >= 200 || age <= 0) {
			throw new NotEligibleException("The age entered is not typical for a human being");
		} else {
			s = CompanyJobRepository.getJobPrediction(age, highestQualification);
		}
		return s;
	}

	public static void main(String args[]) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String education = "";
		System.out.println("Please choose education from below : \n"
				+ "1) B.E.\n"
				+ "2) M.S.\n"
				+ "3) PhD \n"
				+ "4) None of the above");
		int edu = sc.nextInt();
		if(edu == 1) {
			education = "B.E.";
		}else if(edu == 2) {
			education = "M.S.";
		}else if(edu == 3) {
			education = "PhD";
		}else {
			education = "NA";
		}
		So obj = new So();
		try {
			System.out.println(obj.searchForJob(age, education));
		} catch (NotEligibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class NotEligibleException extends Exception {
	NotEligibleException(String msg) {
		super(msg);
	}
}
