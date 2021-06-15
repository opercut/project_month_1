package Controller;

import java.util.Scanner;

import Domain.관리자;
import Domain.회원;

public class BookManager {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		start_BookManager();
		
	} // main end
	
	public static void start_BookManager() {
		
		while (true) {
			System.out.println("*** 도서 대여 프로그램 ***");
			System.out.println("1.회원가입  2.회원로그인  3.종료  4.관리자전용");
			System.out.print("---> 메뉴선택 : "); int 선택 = scanner.nextInt();
			
			회원 temp = new 회원();
			관리자 temp2 = new 관리자();
			
			if (선택 == 1) {
				temp.회원가입();
			}
			else if (선택 == 2) {
				System.out.println("[로그인]");
				System.out.print("회원 아이디 : "); String 아이디 = scanner.next();
				System.out.print("회원 비밀번호 : "); String 비밀번호 = scanner.next();
				
				if (temp.로그인(아이디, 비밀번호) == 0) { // 정상 로그인
					temp.메뉴(아이디);
				}
				else { // 로그인 실패 
					System.out.println("---> 로그인에 실패하셨습니다 [다시 실행]");
				}
			}
			else if (선택 == 3) {
				System.out.println("---> 도서 대여 프로그램 종료!!!");
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
