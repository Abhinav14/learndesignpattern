package singleton;

public class SingletonThreadTester {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				SingletonReflectionSafe instance1 = SingletonReflectionSafe.getInstance();
				System.out.println("instance1: "+instance1.hashCode());
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				SingletonReflectionSafe instance2 = SingletonReflectionSafe.getInstance();
				System.out.println("instance2: "+instance2.hashCode());
			}
		});
		
		t1.start();
		t2.start();
	}

}
