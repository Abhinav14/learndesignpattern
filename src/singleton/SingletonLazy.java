package singleton;

public class SingletonLazy {
	
	private static SingletonLazy sSoleInstance;
	
	private SingletonLazy() {};
	
	//Its lazy initialization as the object is created when getInstance() is called. And not at the time of loading the class.
	public static SingletonLazy getInstance() {
		if(sSoleInstance == null) {
			sSoleInstance = new SingletonLazy();
		}
		return sSoleInstance;
	}

}
