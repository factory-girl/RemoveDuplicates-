import java.util.ArrayList;


public class RemoveDuplicatesTest {
	public static void main(String args[]) {
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(4);
		values.add(5);
		values.add(3);
		values.add(6);
		values.add(3);
		values.add(4);
		values.add(7);
		System.out.println("Original list: \n" + values);
		RemoveDuplicates.removeDuplicates(values);
		System.out.println("List without duplicates: \n" + values);
	}

}