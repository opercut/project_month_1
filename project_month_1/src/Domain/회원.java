package Domain;

import Controller.BookManager;

public class ȸ�� {
	
	// �ʵ�
	private String �̸�;
	private String ��ȭ��ȣ;
	private String �ּ�;
	private int ȸ����ȣ;
	private Boolean �����ڿ���;
	
	// ������
	public ȸ��() {}
	
	public ȸ��(String �̸�, String ��ȭ��ȣ, String �ּ�, int ȸ����ȣ, Boolean �����ڿ���) {
		super();
		this.�̸� = �̸�;
		this.��ȭ��ȣ = ��ȭ��ȣ;
		this.�ּ� = �ּ�;
		this.ȸ����ȣ = ȸ����ȣ;
		this.�����ڿ��� = �����ڿ���;
	}

	// �޼ҵ� (get/set)
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

	public int getȸ����ȣ() {
		return ȸ����ȣ;
	}

	public void setȸ����ȣ(int ȸ����ȣ) {
		this.ȸ����ȣ = ȸ����ȣ;
	}

	public Boolean get�����ڿ���() {
		return �����ڿ���;
	}

	public void set�����ڿ���(Boolean �����ڿ���) {
		this.�����ڿ��� = �����ڿ���;
	}

	// �޼ҵ�(�����)
	public void ȸ������() {
		System.out.println("***** ȸ������ *****");
		System.out.print("1.�̸� : "); String �̸� = BookManager.scanner.next();
		System.out.print("1.�̸� : "); String ��ȭ��ȣ = BookManager.scanner.next();
		System.out.print("1.�̸� : "); String �ּ� = BookManager.scanner.next();
		
		for (ȸ�� temp : dto.ȸ�����) {
			if (temp.�̸�.equals(�̸�) && temp.��ȭ��ȣ.equals(��ȭ��ȣ) && temp.�ּ�.equals(�ּ�)) {
				System.out.println("---> �̹� ������ ȸ���Դϴ�. [�ٽ� �Է�]");
				return;
			}
		}
		
		//ȸ�� temp2 = new ȸ��(�̸�, ��ȭ��ȣ, �ּ�, (dto.ȸ�����.size()+1), False);
		
		//dto.ȸ�����.add(temp2);
	}
	
	public void �޴�() {
		System.out.println("===== �޴� =====");
		System.out.println("1.ȸ������(����)  2.�α���  3.å��Ϻ���  4.�뿩  5.�븮����Ʈ(����)  6.�ݳ�  7.����");
		System.out.print("--> ���� :"); int ���� = BookManager.scanner.nextInt();
		
		if (���� == 1) {
			
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
	
		}
		else if (���� == 7) {
			System.out.println("---> �α׾ƿ�");
			return;
		}
	}
	
} // class end
