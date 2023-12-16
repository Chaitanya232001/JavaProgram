package onlineAssessment;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MaxOfMinInSubarrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the segment (x):");
        int x = scanner.nextInt();

        System.out.println("Enter the size of the array (n):");
        int n = scanner.nextInt();

        System.out.println("Enter the array elements:");
        int[] space = new int[n];
        for (int i = 0; i < n; i++) {
            space[i] = scanner.nextInt();
        }

      
        int result = maxOfMinInSubarrays(x, space);

        System.out.println("Maximum of minimums in subarrays: " + result);


        scanner.close();
    }

    private static int maxOfMinInSubarrays(int x, int[] space) {
        int result = Integer.MIN_VALUE;
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < space.length; i++) {
       
            while (!deque.isEmpty() && deque.peek() < i - x + 1) {
                deque.poll();
            }

            while (!deque.isEmpty() && space[deque.peekLast()] > space[i]) {
                deque.pollLast();
            }
            deque.offer(i);

            if (i >= x - 1) {
                result = Math.max(result, space[deque.peek()]);
            }
        }

        return result;
    }
}

