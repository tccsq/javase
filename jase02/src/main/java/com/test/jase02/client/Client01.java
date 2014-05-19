package com.test.jase02.client;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.test.jase02.model.Person;

public class Client01 {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException {

		Person p = new Person();
		p.setAddress("北京");
		p.setAge(11);
		p.setEmployID("001");
		p.setName("小明");
		p.setPhoneNum("13434343434");

		Class clz = p.getClass();
		// clz.getFields(); 父类继承的和可操作的field
		// clz.getDeclaredFields() 获取本类所有的field
		Field[] fields = clz.getDeclaredFields();

		for (Field field : fields) {
			System.out.print(Modifier.toString(field.getModifiers()) + " ");
			System.out.print(field.getType().getSimpleName() + " ");
			System.out.print(field.getName());
			// System.out.println("Declaring:"+field.getDeclaringClass());
			field.setAccessible(true);
			System.out.println(" 值:"+field.get(p));
		}

	}

}
