import java.util.Scanner;

public class Quiz05_Operator {
    public static void main(String[] args) {
		// �л��� �̸�/�г�/��/��ȣ/����/���� �Է¹޾Ƽ� ���
    	// ������ M�̸� ���л� �ƴϸ� ���л����� ���
    	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�̸� : ");
	String name = sc.nextLine();
	
	System.out.print("�г�(���ڸ�) : ");
	int schoolyear = Integer.parseInt(sc.nextLine());
	
	System.out.print("��(���ڸ�) : ");
	int c1 = Integer.parseInt(sc.nextLine()); 
	// class -> ����� : �������� �� �� ���� (�ڹٶ�� �ϴ� ���� Ư���� ���� �ִ�, ������ �뵵�� �ִ� �ܾ�)
	
	System.out.print("��ȣ(���ڸ�) : ");
	int num = Integer.parseInt(sc.nextLine());
	
	System.out.print("����(M/F) : ");
	String gender = sc.nextLine();
	// "M" "F" ��� String �� �Է�
	gender = (gender.equals("M")? " ���л�":" ���л�"); //���ڿ� ���Ҷ��� == ���� ���� equals ��� ����
	// ��������� ���� ������� "���л�", "���л�"�̶�� ���ڿ��̱� ������ String �� ������ ��´�.
	// ������ �ִ� ���ο� ���� ��ü�� "���л�" �̶�� ���� ����� 
	//gender�� M�̶�� �����Ͱ� ������ �ִ� ������ (������ �ݷ���: ���̻� �ʿ䰡 ������������ �˾Ƽ� �����ִ� ����)
	System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
	double grade = Double.parseDouble(sc.nextLine());
		
	System.out.println("\n"+ schoolyear + "�г� " + c1 + "�� " + num + "�� " + name + gender + "�� ������ " + grade + "�̴�.");
	
	
	
}
}
