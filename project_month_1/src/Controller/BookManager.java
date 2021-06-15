package Controller;

import java.util.Scanner;

public class BookManager {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		start_BookManager();
		
	} // main end
	
	public static void start_BookManager() {
		
		while (true) {
			System.out.println("*** 도서 대여 프로그램 ***");
			System.out.println("1.회원가입  2.로그인  3.종료  4.관리자전용");
			System.out.print("---> 메뉴선택 : "); int 선택 = scanner.nextInt();
			
			if (선택 == 1) {
				
			}
			else if (선택 == 2) {
				
			}
			else if (선택 == 3) {
				break;
			}
			else if (선택 == 4) {
				
			}
			else {
				System.out.println("---> 제시한 메뉴 번호를 입력해주세요~ [다시 입력]");
			}			
		} // while end	
		
	}
	
} // class end
