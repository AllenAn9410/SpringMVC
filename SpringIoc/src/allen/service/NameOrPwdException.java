package allen.service;

public class NameOrPwdException extends Exception{
	public NameOrPwdException(){
		
	}
	public NameOrPwdException(String msg){
		super(msg);
	}
	public NameOrPwdException(Throwable cause){
		super(cause);
	}
}
