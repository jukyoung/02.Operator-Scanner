import java.util.Scanner;

public class Quiz05_Operator {
    public static void main(String[] args) {
		// 학생의 이름/학년/반/번호/성별/성적 입력받아서 출력
    	// 성별이 M이면 남학생 아니면 여학생으로 출력
    	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("이름 : ");
	String name = sc.nextLine();
	
	System.out.print("학년(숫자만) : ");
	int schoolyear = Integer.parseInt(sc.nextLine());
	
	System.out.print("반(숫자만) : ");
	int c1 = Integer.parseInt(sc.nextLine()); 
	// class -> 예약어 : 변수명을 쓸 수 없음 (자바라고 하는 언어에서 특정한 뜻이 있는, 정해진 용도가 있는 단어)
	
	System.out.print("번호(숫자만) : ");
	int num = Integer.parseInt(sc.nextLine());
	
	System.out.print("성별(M/F) : ");
	String gender = sc.nextLine();
	// "M" "F" 라는 String 값 입력
	gender = (gender.equals("M")? " 남학생":" 여학생"); //문자열 비교할때는 == 쓰지 않음 equals 기능 쓰기
	// 결과적으로 오는 결과물이 "남학생", "여학생"이라는 문자열이기 때문에 String 형 변수에 담는다.
	// 변수에 있는 새로운 값이 대체됨 "남학생" 이라는 값만 기억함 
	//gender에 M이라는 데이터가 가지고 있는 공간은 (가비지 콜렉터: 더이상 필요가 없어진값들을 알아서 지워주는 역할)
	System.out.print("성적(소수점 아래 둘째자리까지) : ");
	double grade = Double.parseDouble(sc.nextLine());
		
	System.out.println("\n"+ schoolyear + "학년 " + c1 + "반 " + num + "번 " + name + gender + "의 성적은 " + grade + "이다.");
	
	
	
}
}
