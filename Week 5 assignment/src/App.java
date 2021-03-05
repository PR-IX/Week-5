
public class App {

	public static void main(String[] args) {
		
Logger logger = new AsteriskLogger();

Logger logger2 = new SpacedLogger();
		
		logger.Log("Phill");
		
		logger.Error("Pizza");
		
		logger2.Log("Cheese");
		
		logger2.Error("Pool");

	}
	

    
}
