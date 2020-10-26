package chap07.textbook.example.s0702;

public class DmbCellPhoneExample {
public static void main(String[] args) {
	//DmbCellPhone 객체 생성
	DmbCellPhone dmbCellPhone/*(필드)*/ = new DmbCellPhone("갤럭시", "검정", 23);
	
	//CellPhone으로부터 상속받은 필드
	System.out.println("모델:" + dmbCellPhone.model);
	System.out.println("색상:" + dmbCellPhone.color);
	
	//DmbCellPhone의 필드
    System.out.println("채널:"+dmbCellPhone.channel);
    
    
	
}
}
