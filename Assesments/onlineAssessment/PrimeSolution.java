package onlineAssessment;
import java.util.Scanner;

class Prime {
    public void checkPrime(int... nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean foundPrime = false;

            for (int j = 2; j <= nums[i]; j++) {
                boolean isPrime = true;

                for (int k = 2; k < j; k++) {
                    if (j % k == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    foundPrime = true;
                    System.out.print(j + " ");
                }
            }

            if (foundPrime) {
                System.out.println();
            }
        }
    }
}

public class PrimeSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Prime primeObj = new Prime();

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        primeObj.checkPrime(numbers);

        scanner.close();
    }
}

