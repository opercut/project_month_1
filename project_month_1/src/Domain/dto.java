package Domain;

import java.util.ArrayList;

public class dto {

	public static ArrayList< ȸ�� > ȸ������Ʈ = new ArrayList<>();
	
	public static ArrayList< ������ > �����ڸ���Ʈ = new ArrayList<>();
	
	public static ArrayList< ���� > �뿩����Ʈ = new ArrayList<>();
	


	public Integer ������ã��(String ���̵�) {
		int result = 0;
		
		for (int i=0; i<�����ڸ���Ʈ.size(); i++) {
			if (�����ڸ���Ʈ.get(i).get���̵�().equals(���̵�)) {
				return i;
			}
		}
		
		return result;
	}
	
	
} // class end
