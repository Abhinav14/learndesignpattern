package singleton;

public class TestSingletonEager {

	public static void main(String[] args) {
		
		SingletonEager obj1 = SingletonEager.getInstance();
		SingletonEager obj2 = SingletonEager.getInstance();
		
		System.out.println("Instance-1 : "+obj1.hashCode());
		System.out.println("Instance-2 : "+obj2.hashCode());
		
		
	}

}
