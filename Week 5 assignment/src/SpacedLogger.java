
public class SpacedLogger implements Logger{

	@Override
	public void Log(String Log) {
		
	StringBuilder log = new StringBuilder();
    for (int i = 0; i < Log.length(); i++) {
    	log.append(Log.charAt(i)).append(" ");
    }
	System.out.println(log);
	}
	@Override
	public void Error(String Error) {
		
		StringBuilder error = new StringBuilder();
	    for (int i = 0; i < Error.length(); i++) {
	    	error.append(Error.charAt(i)).append(" ");
		
	}
	    System.out.println("ERROR: " + error);

}
}
