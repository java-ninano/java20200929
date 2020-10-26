package chap10.textbooks.Example_07;

public class NotExistIDException extends Exception {
public NotExistIDException() {
	public void NotExistIDException(String message) throws NotExistIDException  {
		if(ID !=Exist) {
			throw new NotExistIDException("존재하지 않는 ID: " + NotExistIDException + "일치하지 않음");
		}
	}
	
}
}
