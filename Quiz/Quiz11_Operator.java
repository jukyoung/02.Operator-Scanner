import java.util.Scanner;

public class Quiz11_Operator {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("A����� ���� : ");
	int A = sc.nextInt();
	
	System.out.print("B����� ���� : ");
	int B = sc.nextInt();
	
	System.out.print("C����� ���� : ");
	int C = sc.nextInt();
	
	double Aa = (A * 0.4) + A; 
	double Ba = B;
	double Ca = (C * 0.15) + C;
	//double ���̶� int�� �̶� �����Ҷ� �Ҽ����� �ٸ��ԵǼ� ���� ������ �Ϸ��� �ڷ����� ���缭 �ؾ���
	System.out.println("A����� ����/����+a : " + A + "/" + Aa +(Aa>=3000? "\n3000 �̻�":"\n3000 �̸�") );
	System.out.println("B����� ����/����+a : " + B + "/" + Ba + (Ba>=3000? "\n3000 �̻�":"\n3000 �̸�"));
	System.out.println("C����� ����/����+a : " + C +"/" + Ca + (Ca>=3000? "\n3000 �̻�":"\n3000 �̸�"));
	
	// �μ�Ƽ�긦 ���ظ� �� ������ �ӽ�;; �ƴѰ�? ������ �Ǽ� ��Ģ���� �����ΰ�( 0.4�� ����������..)
}
}
