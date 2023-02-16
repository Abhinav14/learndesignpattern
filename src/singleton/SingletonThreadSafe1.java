package singleton;

public class SingletonThreadSafe1 {
	
	private static SingletonThreadSafe1 sSoleInstance;
	
	//making singleton by making constructor private
	private SingletonThreadSafe1() {
		//making it reflection proof
		if(sSoleInstance != null) {
			throw new RuntimeException("use getInstance() for object creation.");
		}
	}

	public synchronized static SingletonThreadSafe1 getInstance() {
		if(sSoleInstance == null) {
			sSoleInstance = new SingletonThreadSafe1();
		}
		return sSoleInstance;
	}
}
