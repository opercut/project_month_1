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
		
		for (관리자 temp : dto.관리자리스트) {
			if (temp.get아이디().equals(아이디) && temp.get비밀번호().equals(비밀번호)) {
				System.out.println("---> 이미 등록한 관리자입니다. [다시 입력]");
				return;
			}
		}
		
		System.out.print("3.이름 : "); String 이름 = BookManager.scanner.next();
		System.out.print("4.전화번호 : "); String 전화번호 = BookManager.scanner.next();
		System.out.print("5.주소 : "); String 주소 = BookManager.scanner.next();		
		
		관리자 temp2 = new 관리자(아이디, 비밀번호, 이름, 전화번호, 주소);
		
		dto.관리자리스트.add(temp2);
	}
	
	@Override
	public Integer 로그인(String 아이디, String 비밀번호) {
		for (관리자 temp : dto.관리자리스트) {
			if (temp.get아이디().equals(아이디) && temp.get비밀번호().equals(비밀번호)) {
				System.out.println("---> [관리자] 정상 로그인 되었습니다!!!");
				return 0;
			}
		}
		
		return 1;
	}
	
	@Override
	public Integer 회원찾기(String 아이디) {
		for (int i=0; i<dto.관리자리스트.size(); i++) {
			if (dto.관리자리스트.get(i).get아이디().equals(아이디)) {
				return i;
			}
		}
		
		return -1;
	}
	
	@Override
	public void 회원정보(String 아이디) {
		System.out.println("=== [관리자 정보] ===");
		
		for (관리자 temp : dto.관리자리스트) {
			if (temp.get아이디().equals(아이디)) {
				String 기존_아이디 = temp.get아이디();
				String 기존_비밀번호 = temp.get비밀번호();
				String 기존_이름 = temp.get이름();
				String 기존_전화번호 = temp.get전화번호();
				String 기존_주소 = temp.get주소();
				
				System.out.println("[1] 아이디 : " + 기존_아이디);
				System.out.println("[2] 비밀번호 : " + 기존_비밀번호);
				System.out.println("[3] 이름 : " + 기존_이름);
				System.out.println("[4] 전화번호 : " + 기존_전화번호);
				System.out.println("[5] 주소 : " + 기존_주소);
				System.out.println("=============");
				
				while (true) {
					System.out.println("\n\n[관리자정보 수정]");
					System.out.println("1.비밀번호  2.이름  3.전화번호  4.주소  5.이전 메뉴");
					System.out.print("---> 메뉴 선택 : "); int 선택 = BookManager.scanner.nextInt();

					int 인덱스 = 회원찾기(아이디);
					
					if (인덱스 == -1) {
						System.out.println("---> 관리자 정보 찾는데 실패하였습니다");
						return;
					}
					else {
						if (선택 == 1) { // 비밀번호
							System.out.print("---> 변경할 비밀번호 입력 : "); 
							String 비밀번호 = BookManager.scanner.next();
							
							temp.set비밀번호(비밀번호);
							dto.관리자리스트.set(인덱스, temp);
							// 파일저장 추가 필요
						}
						else if (선택 == 2) { // 이름
							System.out.print("---> 변경할 이름 입력 : "); 
							String 이름 = BookManager.scanner.next();
							
							temp.set이름(이름);
							dto.관리자리스트.set(인덱스, temp);
							// 파일저장 추가 필요							
						}
						else if (선택 == 3) { // 전화번호
							System.out.print("---> 변경할 전화번호 입력 : "); 
							String 전화번호 = BookManager.scanner.next();
							
							temp.set전화번호(전화번호);
							dto.관리자리스트.set(인덱스, temp);
							// 파일저장 추가 필요							
						}
						else if (선택 == 4) { // 주소
							System.out.print("---> 변경할 비밀번호 입력 : "); 
							String 주소 = BookManager.scanner.next();
							
							temp.set주소(주소);
							dto.관리자리스트.set(인덱스, temp);
							// 파일저장 추가 필요							
						}
						else if (선택 == 5) { // 이전 메뉴
							System.out.println("---> 이번 메뉴 이동합니다");
							return;
						}
						else { 
							System.out.println("---> 제시한 메뉴 중 선택해주세요 [다시 입력]");
						}											
						
					}					
					
				} // while end				
				
			}
		} // for end
	}
	
	public void 회원정보_전체( ) {
		System.out.println("[회원 리스트]");
		System.out.println("==================================================");
		System.out.println("아이디\t이름\t전화번호\t주소");
		System.out.println("==================================================");
		
		for (회원 temp : dto.회원리스트) {
			System.out.println(temp.get아이디() + "\t" +
		                       temp.get이름() + "\t" +
					           temp.get전화번호() + "\t" +
		                       temp.get주소());
			
		} // for end
	}
	
	public void 회원정보_관리자() {
		회원정보_전체();
		
		while (true) {
			System.out.println("\n==================================================");
			System.out.println("1.회원정보 수정  2.종료");
			System.out.print("---> 메뉴 선택 : "); int 선택 = BookManager.scanner.nextInt();
			
			회원 temp = new 회원();
			
			if (선택 == 1) {
				System.out.println("[회원정보 수정]");
				System.out.print("---> 수정할 회원 아이디 입력 :"); String 아이디 = BookManager.scanner.next();
				temp.회원정보(아이디);
			}
			else if (선택 == 2) {
				System.out.println("---> 이전 메뉴 이동");
				break;
			}
			else {
				System.out.println("---> 제시한 메뉴 중 선택해주세요 [다시 입력]");
			}			
			
		} // while end

	}
	
	@Override
	public void 메뉴(String 아이디) {
		while (true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1.회원정보  2.책목록보기  3.책등록  4.대여리스트(전체)  5.관리자관리  6.종료");
			System.out.print("--> 선택 :"); int 선택 = BookManager.scanner.nextInt();
			
			if (선택 == 1) { // 회원 정보 수정
				회원정보_관리자();
			}
			else if (선택 == 2) {
				
			}
			else if (선택 == 3) {
				
			}
			else if (선택 == 4) {
		
			}
			else if (선택 == 5) { // 해당 관리자 본인 정보 수정
				회원정보(아이디); 
			}
			else if (선택 == 6) {
				System.out.println("---> 로그아웃");
				return;
			}	
			
		} // while end
	
	}

	
	
	
} // class end
