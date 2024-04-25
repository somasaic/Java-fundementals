public class countDigits {
    public static void main(String[] args) {
        int number = 12345; // Example: Number to count digits
        
        // Initialize digit count to 0
        int digitCount = 0;
        int tempNumber = number; // Create a copy of the original number
        
        // Iterate through each digit of the number
        while (tempNumber != 0) {
            // Increment digit count for each iteration
            digitCount++;
            // Remove the last digit from the number
            tempNumber /= 10; //
        }
        
        System.out.println("Number of digits in " + number + " is: " + digitCount);
    }
}

