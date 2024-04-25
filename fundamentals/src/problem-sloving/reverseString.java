import java.util.*;

public class reverseString {
    String rString;

    public static void printChars(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            // System.out.print(str.charAt(i));
            // char c []= str.charAt(i);
            String rs = String.valueOf(str.charAt(i));
        }
        return rs;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        printChars(str);

        /*
         * String str = "String-Concept";
         * System.out.println("Given String:\n"+str);
         * 
         * for(int i = str.length(); i>=0; i--){
         * 
         * char ch[];
         * String reversedString = new String(ch);
         * ch = str.toCharArray();
         * // Printing Reversed String using toCharArray() method of String Class
         * System.out.print("\nReversed String Using toCharArray(): \t"
         * +reversedString);
         * 
         * // Printing Reversed String by Iterating through the Given String in Reverse
         * Order
         * StringBuilder sb = new StringBuilder(str);
         * System.out.print("\nReversed String Using StringBuilder: \t"
         * +sb.reverse().toString());
         * 
         * // Printing Original and Reversed Strings Separately
         * System.out.println("\nOriginal String: "+str+"\nReversed String: "+sb.reverse
         * ().toString());
         * 
         * // Removing First Character from the String and Continuing the Loop
         * str= str.substring(1, str.length());
         * 
         * 
         * }
         */
    }
}

/*
 * Output :
 * Given String:
 * String-Concept
 * 
 * Reversed String Using toCharArray(): tpnocneS-gnirts
 * Reversed String Using StringBuilder: tpnocneS-gnirts
 * Original String: String-Concept
 * Reversed String: Concept-gniTS
 * 
 * Reversed String Using toCharArray(): eptucS-gnirts
 * Reversed String Using StringBuilder: uctecS-gnirts
 * Original String: Concept-gniTS
 * Reversed String: gniTS-ectuc
 * 
 */
