package chap15.lecture.s150602;

import java.util.LinkedList;
import java.util.Queue;


public class QueueExample {
public static void main(String[] args) {
	Queue<Message>messageQueue = new LinkedList<Message>();
	//FIFO (first in first out)
	messageQueue.offer(new Message("sendMail", "홍길동")); //투입
	messageQueue.offer(new Message("sendSMS", "신용권"));
	messageQueue.offer(new Message("sendkakaotalk", "홍두깨"));
	
    while(!messageQueue.isEmpty()) {
    	Message message = messageQueue.poll();
    	switch(message.command) {
    	case " sendMail":
    		System.out.println(message.to + "님에게 메일을 보냅니다.");
    		break;
    	case " sendSMS":
    		System.out.println(message.to + "님에게 SMS을 보냅니다.");
    		break;
    	case " kakaotalk":
    		System.out.println(message.to + "님에게 kakaotalk을 보냅니다.");
    		break;
    	}
    }
}
}
