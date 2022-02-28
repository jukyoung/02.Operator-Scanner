import java.util.Scanner;

public class Quiz08_Operator {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("주민번호를 입력하세요(- 포함) : ");
	String num = sc.nextLine();
	char gender = num.charAt(7);
	System.out.println(gender%2==0? "\n여자":"\n남자");
	
	
}
}
