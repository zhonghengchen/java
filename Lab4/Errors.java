package labs;

public class Errors{

	public static void main(String[] args){
		System.out.println(findSingletons("abracadabra"));
	}
	/*The findSingletons method in the Errors class is intended to return a String containing only the letters that appear exactly once in the parameter str. It contains three errors (one syntax error, one runtime error, and one semantic error). Find and fix all three errors.
	//contains all three error types
	public static String findSingletons(String str){
		String singletons = "";
		for (int i = 0; i < str.length(); i++){
			String letter = str.substring(i, i - 1);
			int count = 0;
			for (int j = 0; j < str.length(); i++){
				if (str.substring(j, j + 1).equalsIgnoreCase(letter)){
					count++;
				}
			}
			if (count == 1){
				singletons += letter;
			}
		}
	}
	*/
	public static String findSingletons(String str){
		String singletons = "";
		for (int i = 0; i < str.length(); i++){
			String letter = str.substring(i, i + 1);
			int count = 0;
			for (int j = 0; j < str.length(); j++){
				if (str.substring(j, j + 1).equalsIgnoreCase(letter)){
					count++;
				}
			}
			if (count == 1){
				singletons += letter;
			}
		}
		return singletons;
	}
}

/* outcome:
cd
*/
