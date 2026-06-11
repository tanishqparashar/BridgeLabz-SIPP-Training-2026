import java.util.Scanner;
public class OddEven {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a valid natural number.");
            return;
        }

        int[] oddNumbers = new int[number];
        int[] evenNumbers = new int[number];

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                evenNumbers[evenCount] = i;
                evenCount++;
            } else {
                oddNumbers[oddCount] = i;
                oddCount++;
            }
        }

        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        sc.close();
    }
}
