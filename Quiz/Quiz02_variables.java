import java.util.Scanner;

public class Quiz02_variables {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
    System.out.print("ù ��° ���� : ");
    int f = Integer.parseInt(sc.nextLine());
    
    System.out.print("�� ��° ���� : ");
    int s = Integer.parseInt(sc.nextLine());
    
    System.out.println("\n���ϱ� ��� : " + (f + s));
    System.out.println("���� ��� : " + (f - s));
    System.out.println("���ϱ� ��� : " + (f * s));
    System.out.println("������ �� ��� : " + (f / s));
    
	   
}
}
