import java.util.Scanner;

public class Quiz07_Operator {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���� : ");
	int korean = Integer.parseInt(sc.nextLine());
	
	System.out.print("���� : ");
	int english =  Integer.parseInt(sc.nextLine());
	
	System.out.print("���� : ");
	int math = Integer.parseInt(sc.nextLine());
	
	int sum = (korean + english + math);
	float average = (sum/3);
	String result = (sum>=40 && average>=60? "�հ�":"���հ�");
	
	System.out.println("�հ� : "+ sum + "\n��� : " + average +"\n" + result);
	
}
}
