package BasicProgram;
import java.util.Scanner;
public class GreetingAsName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Name for Greeting:");
		String Name = input.nextLine();
		System.out.print("Welcome to java programing "+ Name);
		input.close();
	}
}