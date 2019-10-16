import java.util.Scanner;

public class ReverseString2 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter String Here: ");
		sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		
		System.out.print("Reversed String is:");
		System.out.println(sb.reverse());
	}

}
