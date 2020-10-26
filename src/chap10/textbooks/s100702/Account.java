package chap10.textbooks.s100702;

public class Account {
private long balance;

public Account() {}

public long getBalance() {
	return balance;
}
public void desposit(int money) {
	balance +=money;
}
public void withdraw(int money) throws BalanceInsufficientException{
	if(balance < money) {
		throw new BalanceInsufficientException("잔고부족 : "+ (money -balance)+ "모자람");
	}
  balance -=money;
}

}

