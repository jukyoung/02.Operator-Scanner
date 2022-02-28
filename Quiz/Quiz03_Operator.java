import java.util.Scanner;

public class Quiz03_Operator {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수 : ");
	int num = Integer.parseInt(sc.nextLine());
	
	System.out.println((num % 2 == 0)? "\n짝수다" : "\n홀수다");
	//짝수인 경우 2의 배수로 나타내니까 2로 나눴을때 나머지 값이 0이어야 짝수임
}
}
