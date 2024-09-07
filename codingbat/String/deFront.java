/*
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
*/

public String deFront(String str) {    
  if (str.length()>2){
    String key1 = str.substring(0,1);
    String key2 = str.substring(1,2);
    String key3 = str.substring(0,2);
  if (key3.equals("ab")) { return str;}
  if (key1.equals("a")){return "a" + str.substring(2);}
  if (key2.equals("b")) {return "b" + str.substring(2);}
  return str.substring(2);
  }
  if (str == "ab") {return str;}
  if (str == "ba") {return "";}
  if (str.charAt(0)== 'a'){return "a";}
  if (str.charAt(0)== 'b') {return "b";}
  return "";
}

/*

public String deFront(String str) {
    if (str.length() > 1) {
        // Check if the string starts with "ab"
        if (str.startsWith("ab")) {
            return str;
        }
        // Check if the string starts with "a" or "b"
        if (str.startsWith("a")) {
            return "a" + str.substring(2);
        }
        if (str.startsWith("b")) {
            return "b" + str.substring(2);
        }
        // If it does not start with "a" or "b", remove the first two characters
        return str.substring(2);
    }

    // Handle single character or empty strings
    if (str.equals("ab")) return str;
    if (str.equals("ba")) return "";
    if (str.charAt(0) == 'a') return "a";
    if (str.charAt(0) == 'b') return "b";
    
    return "";
}
*/
