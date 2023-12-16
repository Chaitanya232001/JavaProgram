//How to Print an Integer entered by an user
package OnlineSource.OnlineSource;

import java.util.Scanner;

class IntegerByUser {
    public static void main(String[] args) {
        // input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input:");
        // read the nextInt from Keyboard
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println( number);
        } 
        input.close();
    }
}