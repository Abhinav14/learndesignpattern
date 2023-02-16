package singleton;

public class TestSingletonLazy {

	public static void main(String[] args) {
		
		SingletonLazy obj1 = SingletonLazy.getInstance();
		SingletonLazy obj2 = SingletonLazy.getInstance();
		
		System.out.println("Instance-1: "+obj1.hashCode());
		System.out.println("Instance-2: "+obj2.hashCode());
		
	}

}
