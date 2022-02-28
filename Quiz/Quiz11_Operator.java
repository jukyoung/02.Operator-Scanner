import java.util.Scanner;

public class Quiz11_Operator {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("A사원의 연봉 : ");
	int A = sc.nextInt();
	
	System.out.print("B사원의 연봉 : ");
	int B = sc.nextInt();
	
	System.out.print("C사원의 연봉 : ");
	int C = sc.nextInt();
	
	double Aa = (A * 0.4) + A; 
	double Ba = B;
	double Ca = (C * 0.15) + C;
	//double 형이랑 int형 이랑 연산할때 소숫점이 다르게되서 같이 연산을 하려면 자료형을 맞춰서 해야함
	System.out.println("A사원의 연봉/연봉+a : " + A + "/" + Aa +(Aa>=3000? "\n3000 이상":"\n3000 미만") );
	System.out.println("B사원의 연봉/연봉+a : " + B + "/" + Ba + (Ba>=3000? "\n3000 이상":"\n3000 미만"));
	System.out.println("C사원의 연봉/연봉+a : " + C +"/" + Ca + (Ca>=3000? "\n3000 이상":"\n3000 미만"));
	
	// 인센티브를 이해를 잘 못햇음 머슥;; 아닌가? 정수랑 실수 사칙연산 문제인감( 0.4로 계산햇을경우..)
}
}
