package Domain;

import Controller.BookManager;

public class ������ extends ȸ�� {

	// ������
	public ������() {}
	
	public ������(String ���̵�, String ��й�ȣ, String �̸�, String ��ȭ��ȣ, String �ּ�) {
		super(���̵�, ��й�ȣ, �̸�, ��ȭ��ȣ, �ּ�);
	}
	
	@Override
	public String get��й�ȣ() {
		// TODO Auto-generated method stub
		return super.get��й�ȣ();
	}
	
	@Override
	public String get�̸�() {
		// TODO Auto-generated method stub
		return super.get�̸�();
	}
	
	@Override
	public String get�ּ�() {
		// TODO Auto-generated method stub
		return super.get�ּ�();
	}
	
	@Override
	public String get���̵�() {
		// TODO Auto-generated method stub
		return super.get���̵�();
	}
	
	@Override
	public String get��ȭ��ȣ() {
		// TODO Auto-generated method stub
		return super.get��ȭ��ȣ();
	}
	
	@Override
	public void set��й�ȣ(String ��й�ȣ) {
		// TODO Auto-generated method stub
		super.set��й�ȣ(��й�ȣ);
	}
	
	@Override
	public void set���̵�(String ���̵�) {
		// TODO Auto-generated method stub
		super.set���̵�(���̵�);
	}
	
	@Override
	public void set�̸�(String �̸�) {
		// TODO Auto-generated method stub
		super.set�̸�(�̸�);
	}
	
	@Override
	public void set��ȭ��ȣ(String ��ȭ��ȣ) {
		// TODO Auto-generated method stub
		super.set��ȭ��ȣ(��ȭ��ȣ);
	}
	
	@Override
	public void set�ּ�(String �ּ�) {
		// TODO Auto-generated method stub
		super.set�ּ�(�ּ�);
	}
	
	
	// �޼ҵ�
	@Override
	public void ȸ������() {
		System.out.println("***** ������ ��� *****");
		System.out.print("1.���̵� : "); String ���̵� = BookManager.scanner.next();
		System.out.print("2.��й�ȣ : "); String ��й�ȣ = BookManager.scanner.next();
		
		for (������ temp : dto.�����ڸ���Ʈ) {
			if (temp.get���̵�().equals(���̵�) && temp.get��й�ȣ().equals(��й�ȣ)) {
				System.out.println("---> �̹� ����� �������Դϴ�. [�ٽ� �Է�]");
				return;
			}
		}
		
		System.out.print("3.�̸� : "); String �̸� = BookManager.scanner.next();
		System.out.print("4.��ȭ��ȣ : "); String ��ȭ��ȣ = BookManager.scanner.next();
		System.out.print("5.�ּ� : "); String �ּ� = BookManager.scanner.next();		
		
		������ temp2 = new ������(���̵�, ��й�ȣ, �̸�, ��ȭ��ȣ, �ּ�);
		
		dto.�����ڸ���Ʈ.add(temp2);
	}
	
	@Override
	public Integer �α���(String ���̵�, String ��й�ȣ) {
		for (������ temp : dto.�����ڸ���Ʈ) {
			if (temp.get���̵�().equals(���̵�) && temp.get��й�ȣ().equals(��й�ȣ)) {
				System.out.println("---> [������] ���� �α��� �Ǿ����ϴ�!!!");
				return 0;
			}
		}
		
		return 1;
	}
	
	@Override
	public Integer ȸ��ã��(String ���̵�) {
		for (int i=0; i<dto.�����ڸ���Ʈ.size(); i++) {
			if (dto.�����ڸ���Ʈ.get(i).get���̵�().equals(���̵�)) {
				return i;
			}
		}
		
		return -1;
	}
	
	@Override
	public void ȸ������(String ���̵�) {
		System.out.println("=== [������ ����] ===");
		
		for (������ temp : dto.�����ڸ���Ʈ) {
			if (temp.get���̵�().equals(���̵�)) {
				String ����_���̵� = temp.get���̵�();
				String ����_��й�ȣ = temp.get��й�ȣ();
				String ����_�̸� = temp.get�̸�();
				String ����_��ȭ��ȣ = temp.get��ȭ��ȣ();
				String ����_�ּ� = temp.get�ּ�();
				
				System.out.println("[1] ���̵� : " + ����_���̵�);
				System.out.println("[2] ��й�ȣ : " + ����_��й�ȣ);
				System.out.println("[3] �̸� : " + ����_�̸�);
				System.out.println("[4] ��ȭ��ȣ : " + ����_��ȭ��ȣ);
				System.out.println("[5] �ּ� : " + ����_�ּ�);
				System.out.println("=============");
				
				while (true) {
					System.out.println("\n\n[���������� ����]");
					System.out.println("1.��й�ȣ  2.�̸�  3.��ȭ��ȣ  4.�ּ�  5.���� �޴�");
					System.out.print("---> �޴� ���� : "); int ���� = BookManager.scanner.nextInt();

					int �ε��� = ȸ��ã��(���̵�);
					
					if (�ε��� == -1) {
						System.out.println("---> ������ ���� ã�µ� �����Ͽ����ϴ�");
						return;
					}
					else {
						if (���� == 1) { // ��й�ȣ
							System.out.print("---> ������ ��й�ȣ �Է� : "); 
							String ��й�ȣ = BookManager.scanner.next();
							
							temp.set��й�ȣ(��й�ȣ);
							dto.�����ڸ���Ʈ.set(�ε���, temp);
							// �������� �߰� �ʿ�
						}
						else if (���� == 2) { // �̸�
							System.out.print("---> ������ �̸� �Է� : "); 
							String �̸� = BookManager.scanner.next();
							
							temp.set�̸�(�̸�);
							dto.�����ڸ���Ʈ.set(�ε���, temp);
							// �������� �߰� �ʿ�							
						}
						else if (���� == 3) { // ��ȭ��ȣ
							System.out.print("---> ������ ��ȭ��ȣ �Է� : "); 
							String ��ȭ��ȣ = BookManager.scanner.next();
							
							temp.set��ȭ��ȣ(��ȭ��ȣ);
							dto.�����ڸ���Ʈ.set(�ε���, temp);
							// �������� �߰� �ʿ�							
						}
						else if (���� == 4) { // �ּ�
							System.out.print("---> ������ ��й�ȣ �Է� : "); 
							String �ּ� = BookManager.scanner.next();
							
							temp.set�ּ�(�ּ�);
							dto.�����ڸ���Ʈ.set(�ε���, temp);
							// �������� �߰� �ʿ�							
						}
						else if (���� == 5) { // ���� �޴�
							System.out.println("---> �̹� �޴� �̵��մϴ�");
							return;
						}
						else { 
							System.out.println("---> ������ �޴� �� �������ּ��� [�ٽ� �Է�]");
						}											
						
					}					
					
				} // while end				
				
			}
		} // for end
	}
	
	public void ȸ������_��ü( ) {
		System.out.println("[ȸ�� ����Ʈ]");
		System.out.println("==================================================");
		System.out.println("���̵�\t�̸�\t��ȭ��ȣ\t�ּ�");
		System.out.println("==================================================");
		
		for (ȸ�� temp : dto.ȸ������Ʈ) {
			System.out.println(temp.get���̵�() + "\t" +
		                       temp.get�̸�() + "\t" +
					           temp.get��ȭ��ȣ() + "\t" +
		                       temp.get�ּ�());
			
		} // for end
	}
	
	public void ȸ������_������() {
		ȸ������_��ü();
		
		while (true) {
			System.out.println("\n==================================================");
			System.out.println("1.ȸ������ ����  2.����");
			System.out.print("---> �޴� ���� : "); int ���� = BookManager.scanner.nextInt();
			
			ȸ�� temp = new ȸ��();
			
			if (���� == 1) {
				System.out.println("[ȸ������ ����]");
				System.out.print("---> ������ ȸ�� ���̵� �Է� :"); String ���̵� = BookManager.scanner.next();
				temp.ȸ������(���̵�);
			}
			else if (���� == 2) {
				System.out.println("---> ���� �޴� �̵�");
				break;
			}
			else {
				System.out.println("---> ������ �޴� �� �������ּ��� [�ٽ� �Է�]");
			}			
			
		} // while end

	}
	
	@Override
	public void �޴�(String ���̵�) {
		while (true) {
			System.out.println("===== �޴� =====");
			System.out.println("1.ȸ������  2.å��Ϻ���  3.å���  4.�뿩����Ʈ(��ü)  5.�����ڰ���  6.����");
			System.out.print("--> ���� :"); int ���� = BookManager.scanner.nextInt();
			
			if (���� == 1) { // ȸ�� ���� ����
				ȸ������_������();
			}
			else if (���� == 2) {
				
			}
			else if (���� == 3) {
				
			}
			else if (���� == 4) {
		
			}
			else if (���� == 5) { // �ش� ������ ���� ���� ����
				ȸ������(���̵�); 
			}
			else if (���� == 6) {
				System.out.println("---> �α׾ƿ�");
				return;
			}	
			
		} // while end
	
	}

	
	
	
} // class end
