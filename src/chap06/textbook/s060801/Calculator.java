package chap06.textbook.s060801;

public class Calculator {
void powerOn() {
	System.out.println("������ ŵ�ϴ�"); 
	// powerOn�� return ���� ��� ������ ����Ÿ�Կ� void�� �°��̴�. 
}

int plus(int x, int y) {// ����Ÿ�� �޼ҵ�� + return��, int= result�� Ÿ���� ���ƾ��Ѵ�. 
	int result = x+y;
	return result;
}

double divide(int x, int y) {
	double result = (double)x / (double)y;
//   int result   =divide(10, 20); : ������ ����
	return result;
}

void powerOff() {
	System.out.println("������ ���ϴ�.");
}
}
