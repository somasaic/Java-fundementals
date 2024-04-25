

public class primeCheck {
    public static void main(String[] args) {
        int number = 17; // Example: Number to check
        
        boolean isPrime = checkPrime(number);
        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
    
    // Method to check if a number is prime
    public static boolean checkPrime(int number) {
        if (number < 2) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by i, hence not prime
            }
        }
        return true; // Number is not divisible by any number in the range, hence prime
    }
}
