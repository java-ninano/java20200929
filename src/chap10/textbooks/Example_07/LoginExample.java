package chap10.textbooks.Example_07;

public class LoginExample {
public static void main(String[] args) {
	try {
		login("white", "12345");
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	try {
		login("blue", "54321");
	}catch(Exception e){
		System.out.println(e.getMessage());
		
	}
}

public static void login(String id, String password) {
	//id가 "blue가 아니라면 NotExistIDException 발생시킴
	if(!id.equals("blue")){
	 throw new NotExistIDException("아이디가 존재하지 않습니다.")
	}
	
	//password가 "12345가 아니라면 WrongPasswordException 발생시킴
	if(password.equals("12345")) {
		
	}
}
}
