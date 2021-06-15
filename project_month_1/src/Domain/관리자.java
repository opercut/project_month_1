package Domain;

import Controller.BookManager;

public class 관리자 extends 회원 {

	// 생성자
	public 관리자() {}
	
	public 관리자(String 아이디, String 비밀번호, String 이름, String 전화번호, String 주소) {
		super(아이디, 비밀번호, 이름, 전화번호, 주소);
	}
	
	@Override
	public String get비밀번호() {
		// TODO Auto-generated method stub
		return super.get비밀번호();
	}
	
	@Override
	public String get이름() {
		// TODO Auto-generated method stub
		return super.get이름();
	}
	
	@Override
	public String get주소() {
		// TODO Auto-generated method stub
		return super.get주소();
	}
	
	@Override
	public String get아이디() {
		// TODO Auto-generated method stub
		return super.get아이디();
	}
	
	@Override
	public String get전화번호() {
		// TODO Auto-generated method stub
		return super.get전화번호();
	}
	
	@Override
	public void set비밀번호(String 비밀번호) {
		// TODO Auto-generated method stub
		super.set비밀번호(비밀번호);
	}
	
	@Override
	public void set아이디(String 아이디) {
		// TODO Auto-generated method stub
		super.set아이디(아이디);
	}
	
	@Override
	public void set이름(String 이름) {
		// TODO Auto-generated method stub
		super.set이름(이름);
	}
	
	@Override
	public void set전화번호(String 전화번호) {
		// TODO Auto-generated method stub
		super.set전화번호(전화번호);
	}
	
	@Override
	public void set주소(String 주소) {
		// TODO Auto-generated method stub
		super.set주소(주소);
	}
	
	
	// 메소드
	@Override
	public void 회원가입() {
		System.out.println("***** 관리자 등록 *****");
		System.out.print("1.아이디 : "); String 아이디 = BookManager.scanner.next();
		System.out.print("2.비밀번호 : "); String 비밀번호 = BookManager.scanner.next();
		System.out.print("3.이름 : "); String 이름 = BookManager.scanner.next();
		System.out.print("4.전화번호 : "); String 전화번호 = BookManager.scanner.next();
		System.out.print("5.주소 : "); String 주소 = BookManager.scanner.next();
		
		for (관리자 temp : dto.관리자리스트) {
			if (temp.get아이디().equals(아이디) && temp.get비밀번호().equals(비밀번호)) {
				System.out.println("---> 이미 가입한 회원입니다. [다시 입력]");
				return;
			}
		}
		
		관리자 temp2 = new 관리자(아이디, 비밀번호, 이름, 전화번호, 주소);
		
		dto.회원리스트.add(temp2);
	}
	
	@Override
	public Integer 로그인() {
		// TODO Auto-generated method stub
		return super.로그인();
	}
	
	@Override
	public void 메뉴() {
		// TODO Auto-generated method stub
		super.메뉴();
	}

	
	
	
} // class end
