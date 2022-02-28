import java.util.Scanner;

public class Quiz06_Operator {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("나이 : ");
	int age = Integer.parseInt(sc.nextLine());
	
	System.out.println(age<=13? "\n어린이":(age>19? "\n성인":"\n청소년"));
}
}
