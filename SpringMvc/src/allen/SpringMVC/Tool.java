package allen.SpringMVC;

public class Tool {
	public static boolean isEmpty(String msg) {
		if ( msg == null || msg.length() == 0 ) {
			return  true;
		}
		return false;
	}
}
