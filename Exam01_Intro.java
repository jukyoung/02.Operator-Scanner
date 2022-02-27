
public class Exam01_Intro {
   public static void main(String[] args) {
	/*
	 * ������
	 * 1. ��� ������ (+ - * \/ %)  �������� escape ���� 
	 * ������ ��� ��ȣ�� ������ �ǹ̸� ������ ���� �������ø� �ٿ��� ���ڿ��� �ν��ϰԲ�
	 * 2. ���� ������ (=, +=, -=, /=, %=, *=)
	 * 3. �� ������ ( <, >  <=, >=, ==, != ) 
	 * �ڹٿ��� ���ٶ�� �ϴ°��� == / �ΰ����°� ���� �ʴٶ�°��� != 
	 * 4. ���� ������ ( ���� ����, ���� ����)
	 * 5. �� ������ ( && and  || or ) || -> ���������� �̶����
	 * 6. ���� ������ ( ���ǽ�? ��1 : ��2 ) �⺻���� Ʋ ���ǽ��� Ʋ���� ��2 �� ��� ������ ��1 ���
	 * */
	   
	   int a = 10;
	   int b = 4;
	   int c = 4;
	   
	   // ��� ������
//	   System.out.println("==== ��� ������ ====");
//	   System.out.println( a + b );
//	   System.out.println( a - b );
//	   System.out.println( a * b );
//	   System.out.println( a / b ); // �� ����
//	   System.out.println( a % b ); // ������ ����
	   
	   // �� ������ ( <, >  <=, >=, ==, != ) -> �� ���� ������ �� ������ ��� ���� true/false
	   System.out.println(" a > b " + (a > b));
	   System.out.println(" a < b " + (a < b));
	   System.out.println(" a == b : " + (a == b));
	   System.out.println(" a != b : " + (a != b));
	   System.out.println(" b <= c " + (b <= c)); // b�� c ���� �۰ų� ���� (������ �ƴ����� ���⶧���� true)
	   
	   char c1 = 'a'; // 97
	   char c2 = 'A'; // 65
	   System.out.println(" c1 == c2 : " + (c1 == c2));
	   System.out.println(" c1 > c2 : " + (c1 > c2));
	   
	   // �����ڷ��� String ���� ���� �񱳸� �� ���� == ���� X
	   // equals() ����� �̿��� ���ڿ��� ��
	   String str1 = "abc";
	   String str2 = "abc";
	   String str3 = "def";
	   //����̳� �Լ��� ������� ���� �� . �� ��� ����Ҽ� �ִ� ��� ����� ��
	   System.out.println( str1.equals(str2)); //�� ��� ������ �տ� ()�ȿ� ���Ϸ��� �ٸ� ���
	   // ������ true �� Ʋ���� false �� ����
	   System.out.println( str2.equals(str3));
	   
	   // ���� ������ (=, +=, -=, /=, %=, *=)
	   int d = 5; // ���� �⺻���� ���� ������
	   d += 3; // d��� �����ȿ� ���� �ִ� �����Ϳ� 3�� ���԰� ���ÿ� ���ϱ�
	   System.out.println(d);
	   d -= 4;
	   System.out.println(d); // d �ȿ� 8�� �ִµ� ���⿡ 4�� ���԰� ���ÿ� ����
	   d *= 10;
	   System.out.println(d);
	   
	   // ���� ������ (����/����) : ++ (+1) , -- (-1) (�����ִ� ���� 1�� ���ϰ�++ , 1�� ����--)
	   int e = 20;
	   int f = 20;
	   
	   System.out.println("���� ������ : " + e + " / " + f);
	   
	   // ���� ����
	   System.out.println( ++e ); // �� ��� +1�� �� (���̴� ����)
	   System.out.println( e ); // 21�� ���� -> ���ϰ� ������°� �ƴ϶� ���ѻ��·� ���� �Ǳ� ���� +1�� ������ �ݿ�
	   System.out.println( --e ); // �� ��� -1�� �� 20�� ���� -> 21�̶�� ���� �־����ϱ�
	   System.out.println( e ); // 21-1 = 20 �̶�� �����Ͱ� ��� ���� -> 20 ���
	   
	   // ���� ���� -> �ϴ��� ���� ���� �Ŀ� ������ �̷����.
	   System.out.println( f++ ); // 20�� ���� ���� f ���, ����� ������ ���� ����
	   System.out.println( f ); // 21�� ���� 
	   System.out.println( f-- );
	   System.out.println( f );
	   
	   System.out.println(" ���� 1 : " + (++e + 5));
	   System.out.println(" ���� 2 : " + (f++ + 5));
	   System.out.println("f : " + f); // ���� ���꿡�� ��µǰ��� +1�� �� ����
	   
	   int x = 10;
	   int y = x -- + 5 + --x; // ()�� ���� �������� ���� �̻� ���ʿ������� ����
	   // x-- : �������� �̹Ƿ� 10 / x-- + 5 : 15 
	   // �� ���¿��� x�� �ٰ� -1�� �� (15�� -1�� �ϴ°� �ƴ�) x : 9
	   // 15 + --x �̹Ƿ� (x�� 9�� ���¿��� �������� -1�̹Ƿ� ��������� x�� 8) :23
	   System.out.println("y : " + y); 
	   
	   //���� 1 int y = --x + 5 + x--;
	  
	   // �� ������ (and or ����, ! ���� ����)
	   // ������� �׻� true / false  �� �����ڿ� �Բ� ���������� ����
	   
	   // and (&&) ������ �����ڸ� �������� ������ �� ������ ��� true ���߸� true ��� ������� ����
	   System.out.println("a > b && a > c : " + (a > b && a > c ) ); // a�� b ���� ũ�鼭 a�� c ���� ũ��.
	   System.out.println("a < b && a > c : " + (a < b && a > c ) ); // a�� b ���� �����鼭 a�� c���� ũ��.
	   System.out.println("a < b && a < c : " + (a < b && a < c ) ); // a�� b ���� �����鼭 a�� c���� �۴�.
	   
	   // or (||) ������ �����ڸ� �������� ������ �� ���� �߿� �ϳ��� true�� �Ǹ� true ��� ��� ���� ����.
	   System.out.println("a > b || a > c : " + (a > b || a > c)); //a�� b���� ũ�ų� a�� c���� ũ��.
	   //shortcut ���� �� �̷����-> �տ� ������ true �� �Ǹ� �ڿ� ���ǾȺ��� ����� true 
	   System.out.println("a > b || a < c : " + (a > b || a < c)); //a�� b���� ũ�ų� a�� c���� �۴�.
	   
	   // ! not
	   System.out.println(!true);
	   System.out.println(!false);
	   System.out.println( !(10 == 5));
	   
	   
	   // ���� ������
	   // �񱳽�? A : B   -> �񱳽��� ���̸� A ���� �����̸� B ����
	   System.out.println( a > b ? 50 : 100);
	   System.out.println( a < b ? "��" : "����"); //A �� B �ڸ��� ����� �־ ��
	   
	   // ctrl + shift + w �ѹ��� â ������  
	   
	   
	   
}
}
