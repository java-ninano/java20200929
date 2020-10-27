package chap15.lecture.s150601;

import java.util.*;
public class StackExample {
	
	// LIFO(Last in first out)
public static void main(String[] args) {
	Stack<Coin> coinBox = new Stack<Coin>();
	
	coinBox.push(new Coin(100));
	coinBox.push(new Coin(50));
	coinBox.push(new Coin(500));
	coinBox.push(new Coin(10));
	
	System.out.println(coinBox.get(0).getValue());
	System.out.println(coinBox.get(1).getValue());
	System.out.println(coinBox.get(2).getValue());
	System.out.println(coinBox.get(3).getValue());
	
	while(!coinBox.isEmpty()) {
		Coin coin = coinBox.pop();
		System.out.println("꺼내는 동전: " + coin.getValue()+ "원");
	}
}
}
