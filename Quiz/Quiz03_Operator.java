import java.util.Scanner;

public class Quiz03_Operator {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���� : ");
	int num = Integer.parseInt(sc.nextLine());
	
	System.out.println((num % 2 == 0)? "\n¦����" : "\nȦ����");
	//¦���� ��� 2�� ����� ��Ÿ���ϱ� 2�� �������� ������ ���� 0�̾�� ¦����
}
}
