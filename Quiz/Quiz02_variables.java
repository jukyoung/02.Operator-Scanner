import java.util.Scanner;

public class Quiz02_variables {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
    System.out.print("첫 번째 정수 : ");
    int f = Integer.parseInt(sc.nextLine());
    
    System.out.print("두 번째 정수 : ");
    int s = Integer.parseInt(sc.nextLine());
    
    System.out.println("\n더하기 결과 : " + (f + s));
    System.out.println("빼기 결과 : " + (f - s));
    System.out.println("곱하기 결과 : " + (f * s));
    System.out.println("나누기 몫 결과 : " + (f / s));
    
	   
}
}
