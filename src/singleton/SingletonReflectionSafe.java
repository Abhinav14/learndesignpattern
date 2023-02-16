package singleton;

public class SingletonReflectionSafe {

	private static SingletonReflectionSafe sSoleInstance;
	
	//private constructor so that no other can create instance of this class
	private SingletonReflectionSafe() {
		//preventing from Reflection API. If instance exists and an attempt is being made to create a new instance, throw runtime exception.
		if(sSoleInstance != null) {
			throw new RuntimeException("Use getInstance() to create instance");
		}
	}
	
	public static SingletonReflectionSafe getInstance() {
		if(sSoleInstance == null) {
			sSoleInstance = new SingletonReflectionSafe();
		}
		return sSoleInstance;
	}
	
}
