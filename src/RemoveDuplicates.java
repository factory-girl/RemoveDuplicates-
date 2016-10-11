import java.util.*;
/**
 * Class that removes duplicates from an array.
 * @author McKayla 
 *
 */
public class RemoveDuplicates {
	
	/**
	 * Method which iterates every time a duplicate is found and removes the value if count
	 * is iterated.
	 * @param values ArrayList of Integer values
	 * @return values ArrayList with duplicates removed
	 */
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> values) {
		for (int i = 0; i < values.size(); i++) {
			for (int j = i + 1; j < values.size(); j++) {
				if (values.get(i) == values.get(j)) {
					values.remove(j);
					j++;
				}
			}
			i++;
		}
		return values;
	}
}