package BasicProgram;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the Number:");
   int number=input.nextInt();
   if(number%2==0) {
	   System.out.print("You Entered Even Number:"+ number); 
   }else {
	   System.out.print("You Entered Odd Number:"+ number);  
   }
   input.close();
	}
}
