package com.ps.beans;

public class ReverseString {
	public static void main(String[] args) {
		String input="hello";
		System.out.println("input string:"+input);
	    String	reverse="";
		for(int i = input.length()-1;i>=0;i--) {
			reverse=reverse+input.charAt(i);
		}
		System.out.println("Reversed String:"+reverse);
	}

}
