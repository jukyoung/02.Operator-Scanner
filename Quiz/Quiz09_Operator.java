import java.util.Scanner;

public class Quiz09_Operator {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
   System.out.print("����1 : ");
   int num1 = Integer.parseInt(sc.nextLine());
   
   System.out.print("����2 : ");
   int num2 = Integer.parseInt(sc.nextLine());
   
   System.out.print("�Է� : ");
   int num3 = Integer.parseInt(sc.nextLine());
   
   System.out.println("\n" +( num3<=num1 || num3>num2));
}
}
