package chap07.textbook.example.s0702;

public class DmbCellPhone extends Cellphone {
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		this.model = model; // Cellphone으로부터 상속받은 필드
		this.color =color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널: "+ channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void ChangeChnnelDmb(int channel){
		this.channel =channel;
		System.out.println("채널: "+ channel + "번으로 바꿉니다." );
	}
	void turnOff() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
