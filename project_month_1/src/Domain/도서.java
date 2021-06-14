package domain;

import java.util.Scanner;

public class 도서 {

	Scanner scanner = new Scanner(System.in);
	
	String 도서명;
	String 저자;
	String 출판사;
	boolean 대여;
	int 고유번호;
	int 조회수;
	
	public 도서() {
		
	}
	
	public 도서(String 도서명, String 저자, String 출판사, int 조회수) {
		this.도서명 = 도서명;
		this.저자 = 저자;
		this.출판사 = 출판사;
		this.조회수 = 조회수;
		
	}
	
	public void 도서등록() {
		System.out.println("=====> 도서 등록");
		System.out.print("도서명 : "); String 도서명 = scanner.next();
		System.out.print("저자 : "); String 저자 = scanner.next();
		System.out.print("출판사 : "); String 출판사 = scanner.next();
		
		도서 temp = new 도서(도서명, 저자, 출판사, 0);
		
	}
	
	public void 도서목록() {
		
		
	}
	
	public void 대여리스트() {
		
		
	}
	
	public void 대여조회수() {
		this.조회수++;
		
	}
	
}
