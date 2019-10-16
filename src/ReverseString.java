import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter String Here:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reverse = "";
		for(int i = str.length()-1; i>=0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
	
	System.out.println("Reveresed String is:" + reverse);
	//System.out.print(reverse);
	
	System.out.println("There is another Java inbuild method to reveser an String");
	
	StringBuilder rev = new StringBuilder(str);
	
	System.out.print("Reveresed String is:" + rev.reverse() );
	

}
}
