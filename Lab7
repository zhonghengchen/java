/*
Write a method that has an ArrayList of Booleans as a parameter that returns the number of true elements.
Write a method that has an ArrayList of Strings and a String as parameters. It should remove all copies of that String from the list, then return the number of copies removed.
Write a void method that removes all elements in even indices from an ArrayList.
*/

package lab7;

import java.util.ArrayList;

public class Lab7 {

	public static void main(String[] args) {
		ArrayList<Boolean> list1 = new ArrayList<Boolean>();
		list1.add(true); list1.add(true); list1.add(false); list1.add(true);
		System.out.println(countTrue(list1));
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Hello"); list2.add("Hello"); list2.add("Zero"); list2.add("One"); list2.add("Hello"); list2.add("Two"); list2.add("Three"); list2.add("Four"); list2.add("Five");
		System.out.println(removeString(list2, "Hello"));
		System.out.println(list2);
		removeEvenIndices(list2);
		System.out.println(list2);
	}
	
	// Write a method that has an ArrayList of Booleans as a parameter that returns the number of true elements
	public static int countTrue (ArrayList<Boolean> arr) {
		int count = 0;
		for (boolean x : arr) {
			if (x) {
				count++;
			}
		}
		return count;
	}
	//Write a method that has an ArrayList of Strings and a String as parameters. It should remove all copies of that String from the list, then return the number of copies removed.
	public static int removeString (ArrayList<String> arr, String a) {
			int count = 0;
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals(a)) {
					arr.remove(i);
					count++;
					i--;
				}
			}
			return count;
	}
	//Write a void method that removes all elements in even indices from an ArrayList.
	public static void removeEvenIndices(ArrayList<String> arr) {
		for (int i = arr.size()-1; i >=0 ; i--) {
			if (i%2==0) {
				arr.remove(i);
			}
		}
	}
}

/* outcome:
3
3
[Zero, One, Two, Three, Four, Five]
[One, Three, Five]
*/
