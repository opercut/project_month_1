package Controller;

import java.util.Scanner;

import Domain.������;
import Domain.ȸ��;

public class BookManager {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		start_BookManager();
		
	} // main end
	
	public static void start_BookManager() {
		
		while (true) {
			System.out.println("*** ���� �뿩 ���α׷� ***");
			System.out.println("1.ȸ������  2.ȸ���α���  3.����  4.����������");
			System.out.print("---> �޴����� : "); int ���� = scanner.nextInt();
			
			ȸ�� temp = new ȸ��();
			������ temp2 = new ������();
			
			if (���� == 1) {
				temp.ȸ������();
			}
			else if (���� == 2) {
				System.out.println("[�α���]");
				System.out.print("ȸ�� ���̵� : "); String ���̵� = scanner.next();
				System.out.print("ȸ�� ��й�ȣ : "); String ��й�ȣ = scanner.next();
				
				if (temp.�α���(���̵�, ��й�ȣ) == 0) { // ���� �α���
					temp.�޴�(���̵�);
				}
				else { // �α��� ���� 
					System.out.println("---> �α��ο� �����ϼ̽��ϴ� [�ٽ� ����]");
				}
			}
			else if (���� == 3) {
				System.out.println("---> ���� �뿩 ���α׷� ����!!!");
				break;
			}
			else if (���� == 4) {
				
			}
			else {
				System.out.println("---> ������ �޴� ��ȣ�� �Է����ּ���~ [�ٽ� �Է�]");
			}			
		} // while end	
		
	}
	
} // class end
