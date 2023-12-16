//write a function that takes in a strings of lower case English alphabet letters and returns the index of string first non repeatings character.the first non repeating character is the first character in the string that occurs only onces.if the input string does not have non repeating charcter the function should return -1
package OnlineSource.OnlineSource;
import java.util.Scanner;
public class StringChecking {
    public static void main(String[] args){
   Scanner input = new Scanner (System.in);
   String charInput = input.nextLine();
   System.out.println(charInput);
   input.close();
    }
}
