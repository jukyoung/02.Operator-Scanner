import java.util.Scanner;

public class Quiz01_Userinfo {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner (System.in);
	   
	   System.out.println("인사말을 입력하세요.");
	   System.out.print(">> "); //이런식으로 해도 됨
	   String hello = sc.nextLine();
	   
	   System.out.print("이름을 입력하세요." + "\n>> ");
	   String name = sc.nextLine();
	   
	   System.out.print("영문이름을 입력하세요." + "\n>> ");
	   String ename = sc.nextLine(); // ename = eng_name
	   
	   System.out.print("나이를 입력하세요." + "\n>> ");
	   int age = Integer.parseInt(sc.nextLine());
	   
	   System.out.print("체온측정 결과를 입력하세요." + "\n>> ");
	   double temperature = Double.parseDouble(sc.nextLine());
	   
	   System.out.println(hello);
	   System.out.println("저의 이름은 " + name + "입니다. " + "영어 이름은 " + ename + " 입니다.");
	   System.out.println("제 나이는 " + age + "살 입니다.");
	   System.out.println("오늘의 체온측정 결과는 " + temperature + "도 입니다.");
}
}
