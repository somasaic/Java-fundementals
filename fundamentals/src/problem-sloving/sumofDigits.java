public class sumofDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt(); // Example: Integer to find the sum of digits
        
        int sum = 0;
        int tempNumber = number; // Create a copy of the original number
        
        // Iterate through each digit of the number
        while (tempNumber != 0) {
            // Extract the last digit of the number
            int digit = tempNumber % 10;
            
            // Add the extracted digit to the sum
            sum += digit;
            
            // Remove the last digit from the number
            tempNumber /= 10;
        }
        
        // Print the sum of digits
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}
