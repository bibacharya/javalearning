import java.util.ArrayList;

public class LearnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> shapes = new ArrayList<>();
		
		ArrayList<Integer> length = new ArrayList<>();
		
		shapes.add("Circle");
		shapes.add("Square");
		shapes.add("Triangle");
		shapes.add("Rectangle");
		
		length.add(12);
		length.add(1, 15);
		length.add(13);
		
		System.out.println(shapes);
		shapes.remove("Circle");
		System.out.println(shapes);
		
		System.out.println(length);
		
	}

}
