package FlowOfProgram;
//Take two numbers and print the sum of both 
import java.util.Scanner;
public class SumofTwoInput {

	public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter your First Number to add:");
     int number1 = input.nextInt();
     System.out.println("Enter your Second Number to add:");
     int number2 = input.nextInt();
     int sum= number1+number2;
     System.out.println("Addition of Two number is:"+ sum); 
     input.close();
	}

}
