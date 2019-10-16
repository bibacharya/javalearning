
public class LearnTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = new int[3];
		
		try {
			
			for (int j =0; j<=intArr.length; j++) {
				int i = intArr[j];
				System.out.println("Valuve of intArr at" +j+" index is " +i);
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occured: !");
		}
		
		finally {
			System.out.println("Inside Finally Block!");
		}
	}

}
