import java.util.Scanner;

public class Quiz10_Operator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("입력1 : ");
    float num1 = Float.parseFloat(sc.nextLine());
    
    System.out.print("입력2 : ");
    float num2 = Float.parseFloat(sc.nextLine());
    
    System.out.print("입력3 : ");
    float num3 = Float.parseFloat(sc.nextLine());
    
    System.out.println("\n" + (num1 == num2 && num2 ==num3) );
    
}
}
