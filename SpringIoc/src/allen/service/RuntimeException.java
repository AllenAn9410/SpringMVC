package allen.service;

public class RuntimeException extends Exception {
	public RuntimeException(){
		
	}
	public RuntimeException(String msg){
		super(msg);
	}
	public RuntimeException(Throwable cause){
		super(cause);
	}

}
