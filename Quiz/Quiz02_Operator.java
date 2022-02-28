import java.util.Scanner;

public class Quiz02_Operator {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수 : ");
	int number = Integer.parseInt(sc.nextLine());
	System.out.println(number>0? "\n양수다" : (number==0? "\n0이다":"\n음수다"));
	
	//자바의 정석 130페이지 보기
	
	
	
	
}
}
