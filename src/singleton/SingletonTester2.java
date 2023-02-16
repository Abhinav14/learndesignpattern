package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTester2 {

	public static void main(String[] args) {
		
		SingletonReflectionSafe instance1 = SingletonReflectionSafe.getInstance();
		SingletonReflectionSafe instance2 = null;
		
		
		try {
			Class<SingletonReflectionSafe> classRef = SingletonReflectionSafe.class;
			Constructor<SingletonReflectionSafe> cons = classRef.getDeclaredConstructor();
			cons.setAccessible(true);
			instance2 = cons.newInstance();
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("isntance1: "+instance1.hashCode());
		System.out.println("instance2: "+instance2.hashCode());
	}

}
