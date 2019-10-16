import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		float x, y, add, sub, mult;
		float div;
		 
		System.out.print("Please Enter First Num:" );
		x= inp.nextFloat();
		System.out.print("Please Enter Second Num:");
		y = inp.nextFloat();
		 add = x+y;
		 sub = x-y;
		 mult= x*y;
		 div = (x/y);
		 
		
		System.out.println("The Sum is: "+ add);
		System.out.println("The Difference is: "+ sub);
		System.out.println("The Multiplication is: "+ mult);
		System.out.println("The Division is: "+ div);
		
	

	}

}
