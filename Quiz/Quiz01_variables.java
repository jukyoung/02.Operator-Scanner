import java.util.Scanner;

public class Quiz01_variables {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�̸��� �Է��ϼ��� : ");
	String name = sc.nextLine();
	
	System.out.print("������ �Է��ϼ���(��/��) : ");
	char gender = sc.nextLine().charAt(0);
	
	System.out.print("���̸� �Է��ϼ��� : ");		
	int age = Integer.parseInt(sc.nextLine());
	
	System.out.print("Ű�� �Է��ϼ���(cm) : ");
	double cm = Double.parseDouble(sc.nextLine());
	
	System.out.println("\nŰ" + cm + "cm�� " + age + "�� " + gender +"�� " + name + "�� �ݰ����ϴ�^^");
			
			  
}
}
