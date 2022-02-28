import java.util.Scanner;

public class Quiz02_Calculator {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   
	System.out.println("==== 정수 사칙연산 프로그램 ====");
	System.out.print("첫 번째 정수를 입력해 주세요 >> ");
	int n1 = Integer.parseInt(sc.nextLine());
	
	System.out.print("두 번째 정수를 입력해 주세요 >> ");
	int n2 = Integer.parseInt(sc.nextLine());
	
	System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));//문자와 숫자를 연결할때 연산은 항상 소가로로
	System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
	System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
	System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
	   
    }
  }
