//java Program to Read The Number From Standard Input


import java.util.*;

public class stdInput{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int readNumber = sc.nextInt();
        System.out.println("\nYou entered the number " + readNumber);

        sc.close();
    }
}