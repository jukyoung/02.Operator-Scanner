import java.util.Scanner;

public class Quiz03_variables {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���� : ");
	float width = Float.parseFloat(sc.nextLine());
	
	System.out.print("���� : ");
	float length = Float.parseFloat(sc.nextLine());
	
	System.out.println("\n���� : " + (width * length));
	System.out.println("�ѷ� : " + ((width + length)*2));
	
	
	}
}
