import java.util.Scanner;
public class StaticExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxSize = 10; 
        int[] stack = new int[maxSize];
        int top = -1; 

        while (true) {
            System.out.println("\nStack:");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");

            System.out.print("Enter your choice (1/2/3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (top < maxSize - 1) {
                        System.out.print("Enter the element to push onto the stack: ");
                        int item = scanner.nextInt();
                        top++;
                        stack[top] = item;
                        System.out.println(item + " pushed onto the stack.");
                    } else {
                        System.out.println("Stack is full. Cannot push.");
                    }
                    break;

                case 2:
                    if (top >= 0) {
                        int poppedElement = stack[top];
                        top--;
                        System.out.println("Popped element: " + poppedElement);
                    } else {
                        System.out.println("Stack is empty. Cannot pop.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
