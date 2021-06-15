package Domain;

import Controller.BookManager;

public class 회원 {
	
	// 필드
	private String 아이디;
	private String 비밀번호;
	private String 이름;
	private String 전화번호;
	private String 주소;
	private int 관리자여부; // 0: 일반회원 1:관리자
	
	// 생성자
	public 회원() {}
	
	public 회원(String 아이디, String 비밀번호, String 이름, String 전화번호, String 주소, int 관리자여부) {
		super();
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
		this.이름 = 이름;
		this.전화번호 = 전화번호;
		this.주소 = 주소;
		this.관리자여부 = 관리자여부;
	}

	public String get아이디() {
		return 아이디;
	}

	public void set아이디(String 아이디) {
		this.아이디 = 아이디;
	}

	public String get비밀번호() {
		return 비밀번호;
	}

	public void set비밀번호(String 비밀번호) {
		this.비밀번호 = 비밀번호;
	}

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

	public int get관리자여부() {
		return 관리자여부;
	}

	public void set관리자여부(int 관리자여부) {
		this.관리자여부 = 관리자여부;
	}

	// 메소드(사용자)
	public void 회원가입() {
		System.out.println("***** 회원가입 *****");
		System.out.print("1.아이디 : "); String 아이디 = BookManager.scanner.next();
		System.out.print("1.비밀번호 : "); String 비밀번호 = BookManager.scanner.next();
		System.out.print("1.이름 : "); String 이름 = BookManager.scanner.next();
		System.out.print("1.전화번호 : "); String 전화번호 = BookManager.scanner.next();
		System.out.print("1.주소 : "); String 주소 = BookManager.scanner.next();
		
		for (회원 temp : dto.회원리스트) {
			if (temp.아이디.equals(아이디) && temp.비밀번호.equals(비밀번호)) {
				System.out.println("---> 이미 가입한 회원입니다. [다시 입력]");
				return;
			}
		}
		
		회원 temp2 = new 회원(아이디, 비밀번호, 이름, 전화번호, 주소, 0);
		
		dto.회원리스트.add(temp2);
	}
	
	public void 로그인() {
		System.out.println("[로그인]");
		System.out.println("");
	}
	
	public void 메뉴() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1.회원가입(정정)  2.로그인  3.책목록보기  4.대여  5.대리리스트(본인)  6.반납  7.종료");
		System.out.print("--> 선택 :"); int 선택 = BookManager.scanner.nextInt();
		
		if (선택 == 1) {
			회원가입();
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
