import java.util.Scanner;

public class Quiz04_variables {
    public static void main(String[] args) {
    	// ����ڿ��� �Է¹޾Ƽ� 1,2,3��° ���ڸ� ����ض�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String word = sc.nextLine();
		char word1 = word.charAt(0); // �� ���� �� �����ϱ� char�� �ϱ�
		char word2 = word.charAt(1); // ����� �Ǵ� ���ڿ��� �������� �ؼ� charAt ����ϱ�
		char word3 = word.charAt(2);
		
		System.out.println("ù ��° ���� : " + word1 );
		System.out.println("�� ��° ���� : " + word2);
		System.out.println("�� ��° ���� : " + word3);
		
		
	}
}
