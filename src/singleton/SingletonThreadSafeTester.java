package singleton;

public class SingletonThreadSafeTester {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				SingletonThreadSafe1 instance1 = SingletonThreadSafe1.getInstance();
				System.out.println("instance1: "+instance1.hashCode());
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				SingletonThreadSafe1 instance2 = SingletonThreadSafe1.getInstance();
				System.out.println("instance2: "+instance2.hashCode());
			}
		});
		
		t1.start();
		t2.start();
	}

}
