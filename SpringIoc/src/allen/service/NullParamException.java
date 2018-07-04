package allen.service;

public class NullParamException extends Exception {
	public NullParamException(){
		
	}
	public NullParamException(String msg){
		super(msg);
	}
	public NullParamException(Throwable cause){
		super(cause);
	}
	public NullParamException(String msg,Throwable cause){
		super(msg,cause);
	}

}
