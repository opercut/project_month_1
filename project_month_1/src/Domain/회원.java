package Domain;

import Controller.BookManager;

public class 회원 {
	
	// 필드
	private String 이름;
	private String 전화번호;
	private String 주소;
	private int 회원번호;
	private Boolean 관리자여부;
	
	// 생성자
	public 회원() {}
	
	public 회원(String 이름, String 전화번호, String 주소, int 회원번호, Boolean 관리자여부) {
		super();
		this.이름 = 이름;
		this.전화번호 = 전화번호;
		this.주소 = 주소;
		this.회원번호 = 회원번호;
		this.관리자여부 = 관리자여부;
	}

	// 메소드 (get/set)
	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public String get전화번호() {
		return 전화번호;
	}

	public void set전화번호(String 전화번호) {
		this.전화번호 = 전화번호;
	}

	public String get주소() {
		return 주소;
	}

	public void set주소(String 주소) {
		this.주소 = 주소;
	}

	public int get회원번호() {
		return 회원번호;
	}

	public void set회원번호(int 회원번호) {
		this.회원번호 = 회원번호;
	}

	public Boolean get관리자여부() {
		return 관리자여부;
	}

	public void set관리자여부(Boolean 관리자여부) {
		this.관리자여부 = 관리자여부;
	}

	// 메소드(사용자)
	public void 회원가입() {
		System.out.println("***** 회원가입 *****");
		System.out.print("1.이름 : "); String 이름 = BookManager.scanner.next();
		System.out.print("1.이름 : "); String 전화번호 = BookManager.scanner.next();
		System.out.print("1.이름 : "); String 주소 = BookManager.scanner.next();
		
		for (회원 temp : dto.회원목록) {
			if (temp.이름.equals(이름) && temp.전화번호.equals(전화번호) && temp.주소.equals(주소)) {
				System.out.println("---> 이미 가입한 회원입니다. [다시 입력]");
				return;
			}
		}
		
		//회원 temp2 = new 회원(이름, 전화번호, 주소, (dto.회원목록.size()+1), False);
		
		//dto.회원목록.add(temp2);
	}
	
	public void 메뉴() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1.회원가입(정정)  2.로그인  3.책목록보기  4.대여  5.대리리스트(본인)  6.반납  7.종료");
		System.out.print("--> 선택 :"); int 선택 = BookManager.scanner.nextInt();
		
		if (선택 == 1) {
			
		}
		else if (선택 == 2) {
			
		}
		else if (선택 == 3) {
			
		}
		else if (선택 == 4) {
	
		}
		else if (선택 == 5) {
	
		}
		else if (선택 == 6) {
	
		}
		else if (선택 == 7) {
			System.out.println("---> 로그아웃");
			return;
		}
	}
	
} // class end
