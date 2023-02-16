package singleton;

public class SingletonEager {
	
	//Created object eagerly...just when class loaded...not when object was needed by some other class. This is called eager initialization
	private static volatile SingletonEager sSoleInstance = new SingletonEager();
	
	private SingletonEager() {}
	
	
	public static SingletonEager getInstance() {
		return sSoleInstance;
	}
	

}
