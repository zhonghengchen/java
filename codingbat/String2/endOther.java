/*
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
*/

public boolean endOther(String a, String b) {
  String na = a.toLowerCase();
  String nb = b.toLowerCase();
  String key = na;
  String longstr = nb;
  if (a.length() > b.length()) { key = nb; longstr =na;}
  return longstr.endsWith(key);

}


/*
public boolean endOther(String a, String b) {
  String na = a.toLowerCase();
  String nb = b.toLowerCase();
  return na.endsWith(nb) || nb.endsWith(na);
}
  
*/
