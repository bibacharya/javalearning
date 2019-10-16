import java.util.HashSet;

public class LearnHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> animals = new HashSet<>();
		 animals.add("lion");
		 animals.add("Tiger");
		 animals.add("Deer");
		 animals.add("rabbit");
		 
		 System.out.println(animals);
		 
		 animals.remove("Tiger");
		 System.out.println(animals);
		 
		 System.out.println(animals.size());
		 
		 animals.add("lion");
		 
		 System.out.println(animals);
		 
		
	}

}
