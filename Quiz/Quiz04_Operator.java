import java.util.Scanner;

public class Quiz04_Operator {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�ο��� : ");
	int people = Integer.parseInt(sc.nextLine());
	
	System.out.print("���� ���� : ");
	int candy = Integer.parseInt(sc.nextLine());
	
	System.out.println("\n1�δ� ���� ���� : " + (candy / people));
	System.out.println("���� ���� ���� : " + (candy % people));
	
}
}
