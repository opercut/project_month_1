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
		System.out.print("3.�̸� : "); String �̸� = BookManager.scanner.next();
		System.out.print("4.��ȭ��ȣ : "); String ��ȭ��ȣ = BookManager.scanner.next();
		System.out.print("5.�ּ� : "); String �ּ� = BookManager.scanner.next();
		
		for (������ temp : dto.�����ڸ���Ʈ) {
			if (temp.get���̵�().equals(���̵�) && temp.get��й�ȣ().equals(��й�ȣ)) {
				System.out.println("---> �̹� ������ ȸ���Դϴ�. [�ٽ� �Է�]");
				return;
			}
		}
		
		������ temp2 = new ������(���̵�, ��й�ȣ, �̸�, ��ȭ��ȣ, �ּ�);
		
		dto.ȸ������Ʈ.add(temp2);
	}
	
	@Override
	public Integer �α���() {
		// TODO Auto-generated method stub
		return super.�α���();
	}
	
	@Override
	public void �޴�() {
		// TODO Auto-generated method stub
		super.�޴�();
	}

	
	
	
} // class end
