package FlowOfProgram;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the table which you want to display :");
		int Tableof=input.nextInt();
		for (int i=1; i<=10;i++) {
			// System.out.print(i*Tableof);
			System.out.println(i+"*"+Tableof+"="+i*Tableof);
		}
		input.close();
	}
	
}