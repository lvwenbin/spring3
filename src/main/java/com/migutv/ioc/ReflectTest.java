package com.migutv.ioc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
//java反射获取特定的构造函数
public class ReflectTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<Apple> con=Apple.class.getConstructor(String.class,String.class);
		Apple apple=null;
		
			 apple=(Apple) con.newInstance(new Object[]{"yellow","200"});
		
		System.out.println(apple.toString());
	}

}
