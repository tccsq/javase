package com.test.jase01;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		test2();
	}

	public static void test1() {
		String s1 = null;
		String s2 = "";
		String s3 = new String();
		String s4 = new String("");

		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));

		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
	}

	public static void test2() {
		String s1 = "abc";
		String s = "a";
		String s2 = "a" + "b" + "c";

		String s3 = s + "b" + "c";
		String s4 = new String("abc");
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
	}
}
