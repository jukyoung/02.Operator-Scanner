import java.util.Scanner;

public class Quiz06_Operator {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���� : ");
	int age = Integer.parseInt(sc.nextLine());
	
	System.out.println(age<=13? "\n���":(age>19? "\n����":"\nû�ҳ�"));
}
}
