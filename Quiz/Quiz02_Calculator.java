import java.util.Scanner;

public class Quiz02_Calculator {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   
	System.out.println("==== ���� ��Ģ���� ���α׷� ====");
	System.out.print("ù ��° ������ �Է��� �ּ��� >> ");
	int n1 = Integer.parseInt(sc.nextLine());
	
	System.out.print("�� ��° ������ �Է��� �ּ��� >> ");
	int n2 = Integer.parseInt(sc.nextLine());
	
	System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));//���ڿ� ���ڸ� �����Ҷ� ������ �׻� �Ұ��η�
	System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
	System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
	System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
	   
    }
  }
