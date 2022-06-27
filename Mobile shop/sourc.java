package com.java;

public class sourc {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to 
		STDOUT */
		 Mobile obj = new Mobile();
		 System.out.println(obj.addMobile("Oppo", "K3"));
		 System.out.println(obj.getModels("Oppo"));
		 System.out.println(obj.buyMobile("Oppo", "K3"));
		}
}
