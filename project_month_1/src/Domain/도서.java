package domain;

import java.util.Scanner;

public class ���� {

	Scanner scanner = new Scanner(System.in);
	
	String ������;
	String ����;
	String ���ǻ�;
	boolean �뿩;
	int ������ȣ;
	int ��ȸ��;
	
	public ����() {
		
	}
	
	public ����(String ������, String ����, String ���ǻ�, int ��ȸ��) {
		this.������ = ������;
		this.���� = ����;
		this.���ǻ� = ���ǻ�;
		this.��ȸ�� = ��ȸ��;
		
	}
	
	public void �������() {
		System.out.println("=====> ���� ���");
		System.out.print("������ : "); String ������ = scanner.next();
		System.out.print("���� : "); String ���� = scanner.next();
		System.out.print("���ǻ� : "); String ���ǻ� = scanner.next();
		
		���� temp = new ����(������, ����, ���ǻ�, 0);
		
	}
	
	public void �������() {
		
		
	}
	
	public void �뿩����Ʈ() {
		
		
	}
	
	public void �뿩��ȸ��() {
		this.��ȸ��++;
		
	}
	
}
