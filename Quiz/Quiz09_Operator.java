import java.util.Scanner;

public class Quiz09_Operator {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
   System.out.print("정수1 : ");
   int num1 = Integer.parseInt(sc.nextLine());
   
   System.out.print("정수2 : ");
   int num2 = Integer.parseInt(sc.nextLine());
   
   System.out.print("입력 : ");
   int num3 = Integer.parseInt(sc.nextLine());
   
   System.out.println("\n" +( num3<=num1 || num3>num2));
}
}
