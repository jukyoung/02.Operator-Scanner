import java.util.Scanner;

public class Exam01_Scanner {
   public static void main(String[] args) {
	 /*
	  * Scanner : 출력용으로만 쓰던 console 창에 입력도 가능하게 해주는 자바(jdk)에 내장된 도구
	  * 
	  * import : 외부로부터 필요한 도구를 가져오는 작업
	  * */
	  // ctrl + shift + o : import 단축키 
	   Scanner sc = new Scanner(System.in);
	   // 변수가 대문자로 시작함 -> 참조 자료형 sc -> 변수 이름 (이름 바꿀 수 있음)
	   // 입력을 하기위해서 이러한 코드가 필요하다	   
	   //sc.next(); // console 창에서 입력이 가능하게 되었음
	   //Enter 키를 기준으로 입력이 끝났음을 판단	   
	   //입력한 데이터의 저장이 필요함
	   
	   //String input = sc.next(); //변수를 만들려면 가장 먼저 입력해야 하는 것은 변수의 자료형 (타입)	    
	   //System.out.println("input : " + input);
	   // next() : 첫번째 띄어쓰기 혹은 엔터키 앞까지의 문자만 출력
	   
	   //nextLine() : 엔터키 앞까지의 모든 문자를 출력
	   //String input = sc.nextLine();
       //System.out.println("input : " + input);
	   
	   // 사용자에게 이름, 나이, 직업을 입력받아서 출력해 보세요.
	   // 1. 사용자의 이름을 입력받기
//	   System.out.println("이름을 입력하세요.");//사용자의 관점에서 봤을때 프로그램이 원하는대로 흘러가길 원할때 안내를 해야할때
//	   String name = sc.nextLine();	  
//	   // 2. 사용자의 나이를 입력받기
//	   System.out.println("나이를 입력하세요.");
//	   String age = sc.nextLine();
//	   // 3. 사용자의 직업을 입력받기
//	   System.out.println("직업을 입력하세요.");
//	   String job = sc.nextLine();	   	   
//	   // 4. 사용자의 이름 + 나이 + 직업을 한번에 출력
//	   System.out.println("사용자의 이름은 " + name + ", 나이는 " + age + "살, 직업은 " + job);
	   
	   // 나이를 입력하세요.
//	   System.out.println("나이를 입력하세요."); // 문자열을 더하라 하면 문자열이 됨 (예: 1+10 = 110)
	   //int input = sc.nextLine()오류 남 연산해야하는 경우에는 String 형 말고 숫자형 변수에 값을 담는 기능 쓸것
	   // 사용자에게 숫자 그대로를 입력받기 위한 방법 2가지
	   // 1. nextInt() 사용
	   // 명시적인 자료형을 이용한 next 기능을 사용할 때 주의해야하는 점
	   // -> 입력을 종료하는 엔터키가 여전히 대기실(버퍼)에 남아서 다음 입력시에 영향을 끼칠 수 있음
//	   int input = sc.nextInt();
//	   System.out.println("input : " + input);
	   
//	   sc.nextLine(); // ㄴ.중간에 끼워넣기
	   
//	   System.out.println("직업을 입력하세요.");
//	   String job = sc.nextLine();
//	   System.out.println("직업 : " + job); // ㄱ.직업을 입력할 수 없게됨 직업을 입력안했는데 실행됨
	   //ㄷ. 이제 직업입력이 가능해짐
	   
	   // 2.nextLine() 을 사용 -> String -> 형변환해서 사용
//	    int input = Integer.parseInt(sc.nextLine());
	   // 암기하기 도구의이름.기능을 사용
	   // Integer : int
	   //parseInt : 변환한다 -> 소가로에 있는 값을 변환한다 => ()값을 int로 변환한다
//	   System.out.println("나이를 입력하세요.");
//	   int input = Integer.parseInt(sc.nextLine());
//	   System.out.println("age : " + input);
	   
	   // nextLine()을 이용해 String -> boolean
	   System.out.println("true 혹은 false 를 입력하세요.");
	   boolean b = Boolean.parseBoolean(sc.nextLine());
	   System.out.println("b : " + b);
	   
	   // nextLine()을 이용해 String -> char
	   System.out.println("성별을 입력하세요."); // 남자, 여자, 남성, 여성, 남, 여 첫글자가 중요 -> char 사용
	   char c = sc.nextLine().charAt(0); // charArt() 소가로안에 index(=번호)를 가져오면됨
	   //0 첫글자 가져오는것
	   // 남자 라고 하는 이 두글자 -> 두 개의 번호를 메길 수 있음 (예 - 0:남 1:자)
	   // 0번을 부르면 우리가 원하는 남자가 나옴
	   // 자바에서 번호를 메길때는 0번부터 시작
	   System.out.println("c : " + c); //남자남자남자 이렇게 치면 남이렇게 여자여자여자 이렇게 치면 여 이렇게 나옴
	   
			   
			   
     }
}
