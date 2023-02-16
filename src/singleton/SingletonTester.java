package singleton;

import java.lang.reflect.Constructor;

public class SingletonTester {

	public static void main(String[] args) {
		
		//Created first instance
		SingletonLazy instance1 = SingletonLazy.getInstance();
		//Will create second instance by Reflection API
		SingletonLazy instance2 = null;
		
		try {
			Class<SingletonLazy> classRef = SingletonLazy.class;
			Constructor<SingletonLazy> cons = classRef.getDeclaredConstructor();
			cons.setAccessible(true);
			instance2 = cons.newInstance();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Instance-1: "+instance1.hashCode());
		System.out.println("Instance-2: "+instance2.hashCode());
	}

}
