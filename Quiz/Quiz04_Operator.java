import java.util.Scanner;

public class Quiz04_Operator {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("인원수 : ");
	int people = Integer.parseInt(sc.nextLine());
	
	System.out.print("사탕 개수 : ");
	int candy = Integer.parseInt(sc.nextLine());
	
	System.out.println("\n1인당 사탕 개수 : " + (candy / people));
	System.out.println("남는 사탕 개수 : " + (candy % people));
	
}
}
