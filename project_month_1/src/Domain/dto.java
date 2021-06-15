package Domain;

import java.util.ArrayList;

public class dto {

	public static ArrayList< 회원 > 회원리스트 = new ArrayList<>();
	
	public static ArrayList< 관리자 > 관리자리스트 = new ArrayList<>();
	
	public static ArrayList< 도서 > 대여리스트 = new ArrayList<>();
	


	public Integer 관리자찾기(String 아이디) {
		int result = 0;
		
		for (int i=0; i<관리자리스트.size(); i++) {
			if (관리자리스트.get(i).get아이디().equals(아이디)) {
				return i;
			}
		}
		
		return result;
	}
	
	
} // class end
