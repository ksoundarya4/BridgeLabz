/********************
 * Basic Core Programs
 * 
 * @purpose  User Input and Replace String Template 
 *           “Hello <<UserName>>, How are you?”
 *@file Relace.java
 *@author soundarya<ksoundarya4>
 *@version 1.0
 *@since 09/12/2019           
 */
package com.bridgelabs.FunctionalProgram;

public class Replace {
	/**
	 * to replace <<UserName>> with Username
	 * 
	 * @param{String}name - input User name
	 */
	public static void toReplace(String name) {
		String s1 = "Hello <<UserName>> ,How are you ?";

		StringBuffer sb = new StringBuffer(s1);
		sb = sb.replace(s1.indexOf("<<"), (s1.indexOf(">>") + 2), name);

		System.out.println(sb);
	}

	public static void main(String[] args) {

		System.out.println("Enter your name");
		String name = utilclass.InputString();

		toReplace(name);
	}
}
