package Controller;

import java.util.Scanner;

public class BookManager {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		start_BookManager();
		
	} // main end
	
	public static void start_BookManager() {
		
		while (true) {
			System.out.println("*** ���� �뿩 ���α׷� ***");
			System.out.println("1.ȸ������  2.�α���  3.����  4.����������");
			System.out.print("---> �޴����� : "); int ���� = scanner.nextInt();
			
			if (���� == 1) {
				
			}
			else if (���� == 2) {
				
			}
			else if (���� == 3) {
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
