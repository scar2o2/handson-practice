
public class SingletonTest {

	public static void main(String[] args) {
		Logger logger1=Logger.getInstance();
		Logger logger2=Logger.getInstance();
		logger1.log("Logger 1");
		logger2.log("Logger 2");
		System.out.println(logger1.hashCode()+" "+logger2.hashCode());
		if(logger1.hashCode()==logger2.hashCode()) {
			System.out.println("Singleton object design implemented");
		}
		else {
			System.out.println("Singleton pattern not implemented");
		}
	}

}
