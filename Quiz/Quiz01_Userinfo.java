import java.util.Scanner;

public class Quiz01_Userinfo {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner (System.in);
	   
	   System.out.println("�λ縻�� �Է��ϼ���.");
	   System.out.print(">> "); //�̷������� �ص� ��
	   String hello = sc.nextLine();
	   
	   System.out.print("�̸��� �Է��ϼ���." + "\n>> ");
	   String name = sc.nextLine();
	   
	   System.out.print("�����̸��� �Է��ϼ���." + "\n>> ");
	   String ename = sc.nextLine(); // ename = eng_name
	   
	   System.out.print("���̸� �Է��ϼ���." + "\n>> ");
	   int age = Integer.parseInt(sc.nextLine());
	   
	   System.out.print("ü������ ����� �Է��ϼ���." + "\n>> ");
	   double temperature = Double.parseDouble(sc.nextLine());
	   
	   System.out.println(hello);
	   System.out.println("���� �̸��� " + name + "�Դϴ�. " + "���� �̸��� " + ename + " �Դϴ�.");
	   System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
	   System.out.println("������ ü������ ����� " + temperature + "�� �Դϴ�.");
}
}
