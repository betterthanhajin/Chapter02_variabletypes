package ch02_1_variable;

public class VariableExchangeExample {

	public static void main(String[] args) {
//		int x = 3;
//		int y = 5;
//		System.out.println("x:"+ x + ",y:" + y);
//		
//		int temp = x;
//		x = y;
//		y = temp;
//		System.out.println("x:" + x + ",y:" +y);
//		
//		[������ �Ҵ�� �� ������]
		int x = 100;
		int y = 200;
		int temp = x;
//		x = 200 , y = 100
		System.out.println("x�� ��: " + x);
		System.out.println("y�� ��: " + y);
		
		x = y;
		System.out.println("x=y, x�� ��: " + x);
		System.out.println("x=y, y�� ��: " + y);
		
		
		y = temp;
		System.out.println("x�ǰ�:" + x);
		System.out.println("y�ǰ�:" + y);
		
	}
}
