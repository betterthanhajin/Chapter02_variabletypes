package ch02_4_console_int_out;

import java.util.Scanner;

public class SystemInOut {

	public static void main(String[] args) {
		//KeyCodeExample.java
		
		//int keyCode;
		
//		try {
//			
//			System.out.printf("keyCode: %d\n", System.in.read());
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
		//[CountinueKeyCodeReadExample.java
		
//		while(true) {
//			try {
//				System.out.printf("keyCode : %d\n" , System.in.read());
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		

//		[QSyopExample.java]
//		boolean working = true;
//		int keyCode;
//		
//		while(working) {
//			try {
//				keyCode = System.in.read();
//				System.out.printf("keyCode : %d\n" , keyCode);
//				
//				if(keyCode == 'q' || keyCode == 'Q') {
//					working = false;
//				}
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} //----->
//		
//		System.out.println("프로그램이 정상적으로 종료");
		
//		[ScannerExample.java]
		
		Scanner scan = new Scanner(System.in);
		String str = "";
		
		while(true) {
			System.out.println("♥---------♥");
			System.out.println("    메 뉴       ");
			System.out.println("♥---------♥\n");
			str = scan.nextLine();
//			if(str.equals("")) {
//				//logic
//				
//			}
			System.out.printf("\"입력문자열은 \"%s\"입니다.\"\n" , str);
			if(str.equalsIgnoreCase("q")) {
				break;
			}
			
		}
		//System.out.println();
		System.out.println("프로그램이 정상적으로 종료");
		
		scan.close();
	}

}
