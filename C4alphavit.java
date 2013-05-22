import java.util.HashMap;
import java.util.Map.Entry;
 
 /*Пример входных данных 
*one two three four five
*      a quick brown fox
*Пример выходных данных:
*f 3
*t 2 
*a 1
*b 1 
*o 1 
*e 2
*/
public class Main
{
  public static void main (String[] args) throws java.lang.Exception
  {
     java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
     HashMap<String, Integer> letters = new HashMap<String, Integer>();
     String alphabet = "abcdefghijklmnopqrstuvwxyz";
     String input_string = null;
     while (input_string != "*") {
         input_string = r.readLine();
 
         if (input_string == null) break;
         
         String[] words = input_string.split(" ");
         for (String word : words) {
             if ("".equals(word)) continue;
             
             String letter = Character.toString(word.charAt(0));
             
             if (!alphabet.contains(letter)) continue;
             
             if (letters.containsKey(letter)) {
                 letters.put(letter, letters.get(letter) + 1);
             } else {
                 letters.put(letter, 1);
             }
         }
     }
     
     for (Entry<String, Integer> entry : letters.entrySet()) {
         System.out.println(entry.getKey() + " " + Integer.toString(entry.getValue()));
     }
  }
}
