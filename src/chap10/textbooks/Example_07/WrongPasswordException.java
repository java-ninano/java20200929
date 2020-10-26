package chap10.textbooks.Example_07;

public class WrongPasswordException extends Exception{
public WrongPasswordException(){}
public void WrongPasswordException(String message) throws WrongPasswordException {
	if (Password != correct) {
		throws new WrongPasswordException("존재하지 않는 Password:" + WrongPasswordException +"일치하지 않음");
	}
}
}
