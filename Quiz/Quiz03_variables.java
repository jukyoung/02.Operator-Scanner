import java.util.Scanner;

public class Quiz03_variables {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("가로 : ");
	float width = Float.parseFloat(sc.nextLine());
	
	System.out.print("세로 : ");
	float length = Float.parseFloat(sc.nextLine());
	
	System.out.println("\n면적 : " + (width * length));
	System.out.println("둘레 : " + ((width + length)*2));
	
	
	}
}
