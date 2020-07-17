package Ex2;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton singleton;

	private ThreadSafeSingleton() {
		System.out.println("Object created for ThreadSafeSingleton.");
	}

	public static ThreadSafeSingleton getInstance() {
		if (singleton == null) {

			synchronized (ThreadSafeSingleton.class) {
				if (singleton == null)
					singleton = new ThreadSafeSingleton();
				
			}

		}
		return singleton;

	}

}
