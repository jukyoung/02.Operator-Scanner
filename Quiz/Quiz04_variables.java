import java.util.Scanner;

public class Quiz04_variables {
    public static void main(String[] args) {
    	// 영어문자열을 입력받아서 1,2,3번째 문자를 출력해라
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String word = sc.nextLine();
		char word1 = word.charAt(0); // 한 글자 만 나오니까 char로 하기
		char word2 = word.charAt(1); // 대상이 되는 문자열을 기준으로 해서 charAt 사용하기
		char word3 = word.charAt(2);
		
		System.out.println("첫 번째 문자 : " + word1 );
		System.out.println("두 번째 문자 : " + word2);
		System.out.println("세 번째 문자 : " + word3);
		
		
	}
}
