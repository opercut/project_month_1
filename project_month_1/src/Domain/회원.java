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
		super();
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
		System.out.print("3.�̸� : "); String �̸� = BookManager.scanner.next();
		System.out.print("4.��ȭ��ȣ : "); String ��ȭ��ȣ = BookManager.scanner.next();
		System.out.print("5.�ּ� : "); String �ּ� = BookManager.scanner.next();
		
		for (ȸ�� temp : dto.ȸ������Ʈ) {
			if (temp.get���̵�().equals(���̵�) && temp.get��й�ȣ().equals(��й�ȣ)) {
				System.out.println("---> �̹� ������ ȸ���Դϴ�. [�ٽ� �Է�]");
				return;
			}
		}
		
		ȸ�� temp2 = new ȸ��(���̵�, ��й�ȣ, �̸�, ��ȭ��ȣ, �ּ�);
		
		dto.ȸ������Ʈ.add(temp2);
	}
	
	public Integer �α���() {
		System.out.println("[�α���]");
		System.out.print("ȸ�� ���̵� : "); String ���̵� = BookManager.scanner.next();
		System.out.print("ȸ�� ��й�ȣ : "); String ��й�ȣ = BookManager.scanner.next();
		
		for (ȸ�� temp : dto.ȸ������Ʈ) {
			if (temp.get���̵�().equals(���̵�) && temp.get��й�ȣ().equals(��й�ȣ)) {
				System.out.println("---> ���� �α��� �Ǿ����ϴ�!!!");
				return 0;
			}
		}
		
		return 1;
	}
	
	public void �޴�() {
		System.out.println("===== �޴� =====");
		System.out.println("1.ȸ������  2.å��Ϻ���  3.�뿩  4.�븮����Ʈ(����)  5.�ݳ�  6.����");
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
			System.out.println("---> �α׾ƿ�");
			return;
		}
	}
	
} // class end
