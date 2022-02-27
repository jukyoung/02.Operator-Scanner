
public class Exam01_Intro {
   public static void main(String[] args) {
	/*
	 * 연산자
	 * 1. 산술 연산자 (+ - * \/ %)  역슬래시 escape 문자 
	 * 슬래시 라는 기호는 별도의 의미를 가지고 있음 역슬래시를 붙여서 문자열로 인식하게끔
	 * 2. 대입 연산자 (=, +=, -=, /=, %=, *=)
	 * 3. 비교 연산자 ( <, >  <=, >=, ==, != ) 
	 * 자바에서 같다라고 하는것은 == / 두개쓰는것 같지 않다라는것은 != 
	 * 4. 증감 연산자 ( 전위 연산, 후위 연산)
	 * 5. 논리 연산자 ( && and  || or ) || -> 파이프라인 이라고함
	 * 6. 삼항 연산자 ( 조건식? 식1 : 식2 ) 기본적인 틀 조건식이 틀리면 식2 를 출력 맞으면 식1 출력
	 * */
	   
	   int a = 10;
	   int b = 4;
	   int c = 4;
	   
	   // 산술 연산자
//	   System.out.println("==== 산술 연산자 ====");
//	   System.out.println( a + b );
//	   System.out.println( a - b );
//	   System.out.println( a * b );
//	   System.out.println( a / b ); // 몫 연산
//	   System.out.println( a % b ); // 나머지 연산
	   
	   // 비교 연산자 ( <, >  <=, >=, ==, != ) -> 두 수를 비교했을 때 나오는 결과 값은 true/false
	   System.out.println(" a > b " + (a > b));
	   System.out.println(" a < b " + (a < b));
	   System.out.println(" a == b : " + (a == b));
	   System.out.println(" a != b : " + (a != b));
	   System.out.println(" b <= c " + (b <= c)); // b는 c 보다 작거나 같다 (작은건 아니지만 같기때문에 true)
	   
	   char c1 = 'a'; // 97
	   char c2 = 'A'; // 65
	   System.out.println(" c1 == c2 : " + (c1 == c2));
	   System.out.println(" c1 > c2 : " + (c1 > c2));
	   
	   // 참조자료형 String 값에 대한 비교를 할 때는 == 쓰지 X
	   // equals() 기능을 이용해 문자열을 비교
	   String str1 = "abc";
	   String str2 = "abc";
	   String str3 = "def";
	   //기능이나 함수를 쓰고싶을 때는 점 . 을 찍기 사용할수 있는 기능 목록이 뜸
	   System.out.println( str1.equals(str2)); //비교 대상 기준을 앞에 ()안에 비교하려는 다른 대상
	   // 같으면 true 값 틀리면 false 값 나옴
	   System.out.println( str2.equals(str3));
	   
	   // 대입 연산자 (=, +=, -=, /=, %=, *=)
	   int d = 5; // 가장 기본적인 대입 연산자
	   d += 3; // d라는 공간안에 원래 있는 데이터에 3을 대입과 동시에 더하기
	   System.out.println(d);
	   d -= 4;
	   System.out.println(d); // d 안에 8이 있는데 여기에 4를 대입과 동시에 빼기
	   d *= 10;
	   System.out.println(d);
	   
	   // 증감 연산자 (전위/후위) : ++ (+1) , -- (-1) (원래있던 수에 1을 더하고++ , 1을 뺀다--)
	   int e = 20;
	   int f = 20;
	   
	   System.out.println("원본 데이터 : " + e + " / " + f);
	   
	   // 전위 연산
	   System.out.println( ++e ); // 그 즉시 +1을 함 (붙이는 순간)
	   System.out.println( e ); // 21이 나옴 -> 더하고 사라지는게 아니라 변한상태로 유지 되기 때문 +1이 영구적 반영
	   System.out.println( --e ); // 그 즉시 -1을 함 20이 나옴 -> 21이라는 숫자 있었으니까
	   System.out.println( e ); // 21-1 = 20 이라는 데이터가 계속 유지 -> 20 출력
	   
	   // 후위 연산 -> 일단은 값이 쓰인 후에 연산이 이루어짐.
	   System.out.println( f++ ); // 20이 나옴 원본 f 출력, 출력이 끝나고 나서 더함
	   System.out.println( f ); // 21이 나옴 
	   System.out.println( f-- );
	   System.out.println( f );
	   
	   System.out.println(" 연산 1 : " + (++e + 5));
	   System.out.println(" 연산 2 : " + (f++ + 5));
	   System.out.println("f : " + f); // 위에 연산에서 출력되고나서 +1을 한 상태
	   
	   int x = 10;
	   int y = x -- + 5 + --x; // ()로 순서 정해지지 않은 이상 왼쪽에서부터 시작
	   // x-- : 후위연산 이므로 10 / x-- + 5 : 15 
	   // 이 상태에서 x에 다가 -1을 함 (15에 -1을 하는거 아님) x : 9
	   // 15 + --x 이므로 (x가 9인 상태에서 전위연산 -1이므로 결과적으로 x는 8) :23
	   System.out.println("y : " + y); 
	   
	   //문제 1 int y = --x + 5 + x--;
	  
	   // 논리 연산자 (and or 연산, ! 부정 연산)
	   // 결과값은 항상 true / false  비교 연산자와 함께 복합적으로 사용됨
	   
	   // and (&&) 연산은 연산자를 기준으로 양쪽의 두 조건이 모두 true 여야만 true 라는 결과값이 나옴
	   System.out.println("a > b && a > c : " + (a > b && a > c ) ); // a가 b 보다 크면서 a가 c 보다 크다.
	   System.out.println("a < b && a > c : " + (a < b && a > c ) ); // a가 b 보다 작으면서 a가 c보다 크다.
	   System.out.println("a < b && a < c : " + (a < b && a < c ) ); // a가 b 보다 작으면서 a가 c보다 작다.
	   
	   // or (||) 연산은 연산자를 기준으로 양쪽의 두 조건 중에 하나라도 true가 되면 true 라는 결과 값이 나옴.
	   System.out.println("a > b || a > c : " + (a > b || a > c)); //a가 b보다 크거나 a가 c보다 크다.
	   //shortcut 연산 이 이루어짐-> 앞에 조건이 true 가 되면 뒤에 조건안봐도 결과는 true 
	   System.out.println("a > b || a < c : " + (a > b || a < c)); //a가 b보다 크거나 a가 c보다 작다.
	   
	   // ! not
	   System.out.println(!true);
	   System.out.println(!false);
	   System.out.println( !(10 == 5));
	   
	   
	   // 삼항 연산자
	   // 비교식? A : B   -> 비교식이 참이면 A 실행 거짓이면 B 실행
	   System.out.println( a > b ? 50 : 100);
	   System.out.println( a < b ? "참" : "거짓"); //A 나 B 자리에 연산식 넣어도 됨
	   
	   // ctrl + shift + w 한번에 창 닫히기  
	   
	   
	   
}
}
