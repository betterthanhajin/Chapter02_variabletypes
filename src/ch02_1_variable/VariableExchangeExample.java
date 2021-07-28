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
//		[변수에 할당된 값 스와핑]
		int x = 100;
		int y = 200;
		int temp = x;
//		x = 200 , y = 100
		System.out.println("x의 값: " + x);
		System.out.println("y의 값: " + y);
		
		x = y;
		System.out.println("x=y, x의 값: " + x);
		System.out.println("x=y, y의 값: " + y);
		
		
		y = temp;
		System.out.println("x의값:" + x);
		System.out.println("y의값:" + y);
		
	}
}
