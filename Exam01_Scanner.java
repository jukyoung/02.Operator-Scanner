import java.util.Scanner;

public class Exam01_Scanner {
   public static void main(String[] args) {
	 /*
	  * Scanner : ��¿����θ� ���� console â�� �Էµ� �����ϰ� ���ִ� �ڹ�(jdk)�� ����� ����
	  * 
	  * import : �ܺηκ��� �ʿ��� ������ �������� �۾�
	  * */
	  // ctrl + shift + o : import ����Ű 
	   Scanner sc = new Scanner(System.in);
	   // ������ �빮�ڷ� ������ -> ���� �ڷ��� sc -> ���� �̸� (�̸� �ٲ� �� ����)
	   // �Է��� �ϱ����ؼ� �̷��� �ڵ尡 �ʿ��ϴ�	   
	   //sc.next(); // console â���� �Է��� �����ϰ� �Ǿ���
	   //Enter Ű�� �������� �Է��� �������� �Ǵ�	   
	   //�Է��� �������� ������ �ʿ���
	   
	   //String input = sc.next(); //������ ������� ���� ���� �Է��ؾ� �ϴ� ���� ������ �ڷ��� (Ÿ��)	    
	   //System.out.println("input : " + input);
	   // next() : ù��° ���� Ȥ�� ����Ű �ձ����� ���ڸ� ���
	   
	   //nextLine() : ����Ű �ձ����� ��� ���ڸ� ���
	   //String input = sc.nextLine();
       //System.out.println("input : " + input);
	   
	   // ����ڿ��� �̸�, ����, ������ �Է¹޾Ƽ� ����� ������.
	   // 1. ������� �̸��� �Է¹ޱ�
//	   System.out.println("�̸��� �Է��ϼ���.");//������� �������� ������ ���α׷��� ���ϴ´�� �귯���� ���Ҷ� �ȳ��� �ؾ��Ҷ�
//	   String name = sc.nextLine();	  
//	   // 2. ������� ���̸� �Է¹ޱ�
//	   System.out.println("���̸� �Է��ϼ���.");
//	   String age = sc.nextLine();
//	   // 3. ������� ������ �Է¹ޱ�
//	   System.out.println("������ �Է��ϼ���.");
//	   String job = sc.nextLine();	   	   
//	   // 4. ������� �̸� + ���� + ������ �ѹ��� ���
//	   System.out.println("������� �̸��� " + name + ", ���̴� " + age + "��, ������ " + job);
	   
	   // ���̸� �Է��ϼ���.
//	   System.out.println("���̸� �Է��ϼ���."); // ���ڿ��� ���϶� �ϸ� ���ڿ��� �� (��: 1+10 = 110)
	   //int input = sc.nextLine()���� �� �����ؾ��ϴ� ��쿡�� String �� ���� ������ ������ ���� ��� ��� ����
	   // ����ڿ��� ���� �״�θ� �Է¹ޱ� ���� ��� 2����
	   // 1. nextInt() ���
	   // ������� �ڷ����� �̿��� next ����� ����� �� �����ؾ��ϴ� ��
	   // -> �Է��� �����ϴ� ����Ű�� ������ ����(����)�� ���Ƽ� ���� �Է½ÿ� ������ ��ĥ �� ����
//	   int input = sc.nextInt();
//	   System.out.println("input : " + input);
	   
//	   sc.nextLine(); // ��.�߰��� �����ֱ�
	   
//	   System.out.println("������ �Է��ϼ���.");
//	   String job = sc.nextLine();
//	   System.out.println("���� : " + job); // ��.������ �Է��� �� ���Ե� ������ �Է¾��ߴµ� �����
	   //��. ���� �����Է��� ��������
	   
	   // 2.nextLine() �� ��� -> String -> ����ȯ�ؼ� ���
//	    int input = Integer.parseInt(sc.nextLine());
	   // �ϱ��ϱ� �������̸�.����� ���
	   // Integer : int
	   //parseInt : ��ȯ�Ѵ� -> �Ұ��ο� �ִ� ���� ��ȯ�Ѵ� => ()���� int�� ��ȯ�Ѵ�
//	   System.out.println("���̸� �Է��ϼ���.");
//	   int input = Integer.parseInt(sc.nextLine());
//	   System.out.println("age : " + input);
	   
	   // nextLine()�� �̿��� String -> boolean
	   System.out.println("true Ȥ�� false �� �Է��ϼ���.");
	   boolean b = Boolean.parseBoolean(sc.nextLine());
	   System.out.println("b : " + b);
	   
	   // nextLine()�� �̿��� String -> char
	   System.out.println("������ �Է��ϼ���."); // ����, ����, ����, ����, ��, �� ù���ڰ� �߿� -> char ���
	   char c = sc.nextLine().charAt(0); // charArt() �Ұ��ξȿ� index(=��ȣ)�� ���������
	   //0 ù���� �������°�
	   // ���� ��� �ϴ� �� �α��� -> �� ���� ��ȣ�� �ޱ� �� ���� (�� - 0:�� 1:��)
	   // 0���� �θ��� �츮�� ���ϴ� ���ڰ� ����
	   // �ڹٿ��� ��ȣ�� �ޱ涧�� 0������ ����
	   System.out.println("c : " + c); //���ڳ��ڳ��� �̷��� ġ�� ���̷��� ���ڿ��ڿ��� �̷��� ġ�� �� �̷��� ����
	   
			   
			   
     }
}
