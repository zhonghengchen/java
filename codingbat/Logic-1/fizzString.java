/*
Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. 
fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
*/


public String fizzString(String str) {
    String result = str;
    if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
        result = "FizzBuzz";
    } else if (str.charAt(0) == 'f') {
        result = "Fizz";
    } else if (str.charAt(str.length() - 1) == 'b') {
        result = "Buzz";
    }
    return result;
}

/*
public String fizzString(String str) {
  boolean f = str.startsWith("f");
  boolean b = str.endsWith("b");
  
  if (f && b) return "FizzBuzz";
  if (f) return "Fizz";
  if (b) return "Buzz";
  return str;
*/
