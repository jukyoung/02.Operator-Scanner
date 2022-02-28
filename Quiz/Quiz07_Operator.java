import java.util.Scanner;

public class Quiz07_Operator {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("국어 : ");
	int korean = Integer.parseInt(sc.nextLine());
	
	System.out.print("영어 : ");
	int english =  Integer.parseInt(sc.nextLine());
	
	System.out.print("수학 : ");
	int math = Integer.parseInt(sc.nextLine());
	
	int sum = (korean + english + math);
	float average = (sum/3);
	String result = (sum>=40 && average>=60? "합격":"불합격");
	
	System.out.println("합계 : "+ sum + "\n평균 : " + average +"\n" + result);
	
}
}
