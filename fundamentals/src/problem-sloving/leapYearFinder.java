public class leapYearFinder {
    public static void main(String[] args) {
        int year = 2024; // Example: Year to check
        
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; // Divisible by 400, so it is a leap year
                } else {
                    return false; // Divisible by 100 but not by 400, so it is not a leap year
                }
            } else {
                return true; // Divisible by 4 but not by 100, so it is a leap year
            }
        } else {
            return false; // Not divisible by 4, so it is not a leap year
        }
    }
}
