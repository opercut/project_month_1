package Domain;

import Controller.BookManager;

public class 회원 {
	
	// 필드
	private String 아이디;
	private String 비밀번호;
	private String 이름;
	private String 전화번호;
	private String 주소;
	
	// 생성자
	public 회원() {}
	
	public 회원(String 아이디, String 비밀번호, String 이름, String 전화번호, String 주소) {
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
		this.이름 = 이름;
		this.전화번호 = 전화번호;
		this.주소 = 주소;
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

	// 메소드(사용자)
	public void 회원가입() {
		System.out.println("***** 회원가입 *****");
		System.out.print("1.아이디 : "); String 아이디 = BookManager.scanner.next();
		System.out.print("2.비밀번호 : "); String 비밀번호 = BookManager.scanner.next();
		
		for (회원 temp : dto.회원리스트) {
			if (temp.get아이디().equals(아이디) && temp.get비밀번호().equals(비밀번호)) {
				System.out.println("---> 이미 가입한 회원입니다. [다시 입력]");
				return;
			}
		}

		System.out.print("3.이름 : "); String 이름 = BookManager.scanner.next();
		System.out.print("4.전화번호 : "); String 전화번호 = BookManager.scanner.next();
		System.out.print("5.주소 : "); String 주소 = BookManager.scanner.next();
		
		회원 temp2 = new 회원(아이디, 비밀번호, 이름, 전화번호, 주소);
		
		dto.회원리스트.add(temp2);
		// 파일저장 추가 필요
	}
	
	public Integer 로그인(String 아이디, String 비밀번호) {

		for (회원 temp : dto.회원리스트) {
			if (temp.get아이디().equals(아이디) && temp.get비밀번호().equals(비밀번호)) {
				System.out.println("---> 정상 로그인 되었습니다!!!");
				return 0;
			}
		}
		
		return 1;
	}

	public Integer 회원찾기(String 아이디) {
		for (int i=0; i<dto.회원리스트.size(); i++) {
			if (dto.회원리스트.get(i).get아이디().equals(아이디)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void 회원정보(String 아이디) {
		
		int 인덱스 = 회원찾기(아이디);
		
		if (인덱스 == -1) {
			System.out.println("---> 회원 정보 찾는데 실패하였습니다");
			return;
		}
		else {
			while (true) {
				회원 temp = new 회원();
				
				String 기존_아이디 = dto.회원리스트.get(인덱스).아이디;
				String 기존_비밀번호 = dto.회원리스트.get(인덱스).비밀번호;
				String 기존_이름 = dto.회원리스트.get(인덱스).이름;
				String 기존_전화번호 = dto.회원리스트.get(인덱스).전화번호;
				String 기존_주소 = dto.회원리스트.get(인덱스).주소;
				
				System.out.println("=== [회원 정보] ===");
				System.out.println("[1] 아이디 : " + 기존_아이디);
				System.out.println("[2] 비밀번호 : " + 기존_비밀번호);
				System.out.println("[3] 이름 : " + 기존_이름);
				System.out.println("[4] 전화번호 : " + 기존_전화번호);
				System.out.println("[5] 주소 : " + 기존_주소);
				System.out.println("=============");
				
				System.out.println("\n[회원정보 수정]");
				System.out.println("1.비밀번호  2.이름  3.전화번호  4.주소  5.이전 메뉴");
				System.out.print("---> 메뉴 선택 : "); int 선택 = BookManager.scanner.nextInt();

				if (선택 == 1) { // 비밀번호
					System.out.print("---> 변경할 비밀번호 입력 : "); 
					String 비밀번호 = BookManager.scanner.next();
					
					temp.set비밀번호(비밀번호);
					dto.회원리스트.set(인덱스, temp);
					// 파일저장 추가 필요
				}
				else if (선택 == 2) { // 이름
					System.out.print("---> 변경할 이름 입력 : "); 
					String 이름 = BookManager.scanner.next();
					
					temp.set이름(이름);
					dto.회원리스트.set(인덱스, temp);
					// 파일저장 추가 필요							
				}
				else if (선택 == 3) { // 전화번호
					System.out.print("---> 변경할 전화번호 입력 : "); 
					String 전화번호 = BookManager.scanner.next();
						
					temp.set전화번호(전화번호);
					dto.회원리스트.set(인덱스, temp);
					// 파일저장 추가 필요							
				}
				else if (선택 == 4) { // 주소
					System.out.print("---> 변경할 비밀번호 입력 : "); 
					String 주소 = BookManager.scanner.next();
						
					temp.set주소(주소);
					dto.회원리스트.set(인덱스, temp);
					// 파일저장 추가 필요							
				}
				else if (선택 == 5) { // 이전 메뉴
					System.out.println("---> 이번 메뉴 이동합니다");
					return;
				}
				else { 
					System.out.println("---> 제시한 메뉴 중 선택해주세요 [다시 입력]");
				}											
			} // while end
		}
		
	}
	
	public void 메뉴(String 아이디) {
		while (true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1.회원정보  2.책목록보기  3.대여  4.대리리스트(본인)  5.반납  6.종료");
			System.out.print("--> 선택 :"); int 선택 = BookManager.scanner.nextInt();
			
			if (선택 == 1) {
				회원정보(아이디);
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
				System.out.println("---> 로그아웃");
				return;
			}
			
		} // while end

	}
	
} // class end
