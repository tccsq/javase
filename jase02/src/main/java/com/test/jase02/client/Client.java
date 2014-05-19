package com.test.jase02.client;

public class Client {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Class clz = Class.forName("java.lang.String");
		System.out.println(clz.getName());
		
		String s = "abc";
		System.out.println(s.getClass());
		
		System.out.println(clz == s.getClass());
		
		System.out.println(void.class);
	}

}
