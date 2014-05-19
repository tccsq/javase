package com.test.jase02.client;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.test.jase02.model.Person;
import com.test.jase02.vo.PersonVO;

public class Client02 {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws ClassNotFoundException,
			IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {

		Person p = new Person();
		PersonVO p1 = new PersonVO();

		p.setAddress("北京");
		p.setAge(11);
		p.setEmployID("001");
		p.setName("小明");
		p.setPhoneNum("13434343434");
		p.setFalg(true);

		Class clz = p.getClass();
		Method[] methods = clz.getMethods();
		for (Method method : methods) {
			// System.out.print(Modifier.toString(method.getModifiers())+" ");
			// System.out.print(method.getReturnType().getSimpleName()+" ");
			// System.out.println(method.getName());
			String methodName = method.getName();
			String fieldName = null;
			if (methodName.startsWith("get")) {
				fieldName = methodName.substring(3, methodName.length());
			} else if (methodName.startsWith("Is")) {
				fieldName = methodName.substring(3, methodName.length());
			}

			System.out.println(fieldName);
			if (fieldName != null) {
				try {
					Class returnType = method.getReturnType();
					Object obj = method.invoke(p);
					Method m = p1.getClass().getMethod("set" + fieldName, returnType);
					System.out.println(m.isAccessible());

					m.invoke(p1, obj);

				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchMethodException e) {

					System.out.println("没有找到：" + "set" + fieldName + "方法！");
					e.printStackTrace();
				}
			}

		}
		Class clz1 = p1.getClass();
		printFieldsValue(clz1, p1);

	}

	/**
	 * 打印实例中所有的所有的属性 修饰符/名称/值 // clz.getFields(); 父类继承的和可操作的field //
	 * clz.getDeclaredFields() 获取本类所有的field
	 * 
	 * @param clz
	 * @param t
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	private static <T> void printFieldsValue(Class<T> clz, T t)
			throws IllegalArgumentException, IllegalAccessException {
		Field[] fields = clz.getDeclaredFields();
		if (fields == null || fields.length == 0) {
			System.out.print("属性为空");
			return;
		}
		for (Field field : fields) {
			System.out.print(Modifier.toString(field.getModifiers()) + " ");
			System.out.print(field.getType().getSimpleName() + " ");
			System.out.print(field.getName());
			field.setAccessible(true);
			System.out.println(" 值:" + field.get(t));
		}
	}

}
