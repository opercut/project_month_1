package Domain;

import Controller.BookManager;

public class ȸ�� {
	
	// �ʵ�
	private String ���̵�;
	private String ��й�ȣ;
	private String �̸�;
	private String ��ȭ��ȣ;
	private String �ּ�;
	
	// ������
	public ȸ��() {}
	
	public ȸ��(String ���̵�, String ��й�ȣ, String �̸�, String ��ȭ��ȣ, String �ּ�) {
		this.���̵� = ���̵�;
		this.��й�ȣ = ��й�ȣ;
		this.�̸� = �̸�;
		this.��ȭ��ȣ = ��ȭ��ȣ;
		this.�ּ� = �ּ�;
	}

	public String get���̵�() {
		return ���̵�;
	}

	public void set���̵�(String ���̵�) {
		this.���̵� = ���̵�;
	}

	public String get��й�ȣ() {
		return ��й�ȣ;
	}

	public void set��й�ȣ(String ��й�ȣ) {
		this.��й�ȣ = ��й�ȣ;
	}

	public String get�̸�() {
		return �̸�;
	}

	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}

	public String get��ȭ��ȣ() {
		return ��ȭ��ȣ;
	}

	public void set��ȭ��ȣ(String ��ȭ��ȣ) {
		this.��ȭ��ȣ = ��ȭ��ȣ;
	}

	public String get�ּ�() {
		return �ּ�;
	}

	public void set�ּ�(String �ּ�) {
		this.�ּ� = �ּ�;
	}

	// �޼ҵ�(�����)
	public void ȸ������() {
		System.out.println("***** ȸ������ *****");
		System.out.print("1.���̵� : "); String ���̵� = BookManager.scanner.next();
		System.out.print("2.��й�ȣ : "); String ��й�ȣ = BookManager.scanner.next();
		
		for (ȸ�� temp : dto.ȸ������Ʈ) {
			if (temp.get���̵�().equals(���̵�) && temp.get��й�ȣ().equals(��й�ȣ)) {
				System.out.println("---> �̹� ������ ȸ���Դϴ�. [�ٽ� �Է�]");
				return;
			}
		}

		System.out.print("3.�̸� : "); String �̸� = BookManager.scanner.next();
		System.out.print("4.��ȭ��ȣ : "); String ��ȭ��ȣ = BookManager.scanner.next();
		System.out.print("5.�ּ� : "); String �ּ� = BookManager.scanner.next();
		
		ȸ�� temp2 = new ȸ��(���̵�, ��й�ȣ, �̸�, ��ȭ��ȣ, �ּ�);
		
		dto.ȸ������Ʈ.add(temp2);
		// �������� �߰� �ʿ�
	}
	
	public Integer �α���(String ���̵�, String ��й�ȣ) {

		for (ȸ�� temp : dto.ȸ������Ʈ) {
			if (temp.get���̵�().equals(���̵�) && temp.get��й�ȣ().equals(��й�ȣ)) {
				System.out.println("---> ���� �α��� �Ǿ����ϴ�!!!");
				return 0;
			}
		}
		
		return 1;
	}

	public Integer ȸ��ã��(String ���̵�) {
		for (int i=0; i<dto.ȸ������Ʈ.size(); i++) {
			if (dto.ȸ������Ʈ.get(i).get���̵�().equals(���̵�)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void ȸ������(String ���̵�) {
		
		int �ε��� = ȸ��ã��(���̵�);
		
		if (�ε��� == -1) {
			System.out.println("---> ȸ�� ���� ã�µ� �����Ͽ����ϴ�");
			return;
		}
		else {
			while (true) {
				ȸ�� temp = new ȸ��();
				
				String ����_���̵� = dto.ȸ������Ʈ.get(�ε���).���̵�;
				String ����_��й�ȣ = dto.ȸ������Ʈ.get(�ε���).��й�ȣ;
				String ����_�̸� = dto.ȸ������Ʈ.get(�ε���).�̸�;
				String ����_��ȭ��ȣ = dto.ȸ������Ʈ.get(�ε���).��ȭ��ȣ;
				String ����_�ּ� = dto.ȸ������Ʈ.get(�ε���).�ּ�;
				
				System.out.println("=== [ȸ�� ����] ===");
				System.out.println("[1] ���̵� : " + ����_���̵�);
				System.out.println("[2] ��й�ȣ : " + ����_��й�ȣ);
				System.out.println("[3] �̸� : " + ����_�̸�);
				System.out.println("[4] ��ȭ��ȣ : " + ����_��ȭ��ȣ);
				System.out.println("[5] �ּ� : " + ����_�ּ�);
				System.out.println("=============");
				
				System.out.println("\n[ȸ������ ����]");
				System.out.println("1.��й�ȣ  2.�̸�  3.��ȭ��ȣ  4.�ּ�  5.���� �޴�");
				System.out.print("---> �޴� ���� : "); int ���� = BookManager.scanner.nextInt();

				if (���� == 1) { // ��й�ȣ
					System.out.print("---> ������ ��й�ȣ �Է� : "); 
					String ��й�ȣ = BookManager.scanner.next();
					
					temp.set��й�ȣ(��й�ȣ);
					dto.ȸ������Ʈ.set(�ε���, temp);
					// �������� �߰� �ʿ�
				}
				else if (���� == 2) { // �̸�
					System.out.print("---> ������ �̸� �Է� : "); 
					String �̸� = BookManager.scanner.next();
					
					temp.set�̸�(�̸�);
					dto.ȸ������Ʈ.set(�ε���, temp);
					// �������� �߰� �ʿ�							
				}
				else if (���� == 3) { // ��ȭ��ȣ
					System.out.print("---> ������ ��ȭ��ȣ �Է� : "); 
					String ��ȭ��ȣ = BookManager.scanner.next();
						
					temp.set��ȭ��ȣ(��ȭ��ȣ);
					dto.ȸ������Ʈ.set(�ε���, temp);
					// �������� �߰� �ʿ�							
				}
				else if (���� == 4) { // �ּ�
					System.out.print("---> ������ ��й�ȣ �Է� : "); 
					String �ּ� = BookManager.scanner.next();
						
					temp.set�ּ�(�ּ�);
					dto.ȸ������Ʈ.set(�ε���, temp);
					// �������� �߰� �ʿ�							
				}
				else if (���� == 5) { // ���� �޴�
					System.out.println("---> �̹� �޴� �̵��մϴ�");
					return;
				}
				else { 
					System.out.println("---> ������ �޴� �� �������ּ��� [�ٽ� �Է�]");
				}											
			} // while end
		}
		
	}
	
	public void �޴�(String ���̵�) {
		while (true) {
			System.out.println("===== �޴� =====");
			System.out.println("1.ȸ������  2.å��Ϻ���  3.�뿩  4.�븮����Ʈ(����)  5.�ݳ�  6.����");
			System.out.print("--> ���� :"); int ���� = BookManager.scanner.nextInt();
			
			if (���� == 1) {
				ȸ������(���̵�);
			}
			else if (���� == 2) {
				
			}
			else if (���� == 3) {
				
			}
			else if (���� == 4) {
		
			}
			else if (���� == 5) {
		
			}
			else if (���� == 6) {
				System.out.println("---> �α׾ƿ�");
				return;
			}
			
		} // while end

	}
	
} // class end
