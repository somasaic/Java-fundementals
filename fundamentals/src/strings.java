public class strings {
    
    public static void main(String[] args) {
        String str = "hello, world!"; //using string literals " ".
        System.out.println(str);  // creating instances of the string class.
        String str1 = new String("Strings Concept");

        //concatenation of two string using  + operator and concat()
        String result =str+", "+str1+" ."; // using + operator
        String result1 =str.concat(", ").concat(str1).concat("."); // using concat() method
        System.out.println("\nConcatenated Strings : \n"+result + "\n" + result1); 

        //length of the string using length() method
        int len = str1.length();
        System.out.print("\nLength of the String :\n"+len); 
        
        //to access individual characters in a string using the charAt() method:
        char firstChar = str1.charAt(len-1);  
        System.out.println("\nFirst Character is : "+firstChar); 


        //compareTo() method
        String a ="abcd";
        String b="abcda";
        System.out.println(a.compareTo(b));
        /*
          The comporeTo method is used to compore two strings in Jovo. 
          It returns on integer volue thot indicates the lexicographic {dictionary) ordering of the strings. 
          Here's how it works: If the tv,'0 strings ore of different lengths, it returns the difference 
          in their lengths. This means it returns o positih..'e value if the first string is longer, a
          negative value if the second string is longer, ond O if the lengths ore equal. 
          If the lengths of the t'vvo strings ore equal, it compores the chorocters in both strings from
          left to right {storting from the 0th index) until it finds o poir of chorocters thot ore different 
          It then returns the difference in ASCII values of those chorocters. If all the charocters in 
          the compared portion of the strings ore the some, it means the tv,'0 strings ore equal, 
          ond it returns 0.
        */

        char arr[]={'C','o','d','i','n','g'};
        String str1="Coding";
        String str2="is fun";
        String str3="Ceding";
        System.out.println(str1.contains("ing"));
        str1=str1.concat(str2);
        System.out.println(str1.equals(str3));
        System.out.println(str1.compareTo(str3));
        //str1+=str2
        //System.out.println(str1.length());
        System.out.println(str1);
        //System.out.println(str.charAt(2));
        //System.out.println(str.charAt(6));
    }
}




/*
 * Strings is a sequence of characters
 * 'space' also  considered as character in java.
 * The Java String is immutable which means it cannot be changed. 
   Whenever we change any string, a new instance is created. 
   For mutable strings, you can use StringBuffer and StringBuilder classes. 
 * String class internally wraps the  character array to store the value.
 * A string object contains a reference to an array of characters.
 * If we don’t initialize a String object explicitly then JVM will automatically create one for us
 * The String Closs length method returns on int. the maximum length thot would be returned by 
   the method would be Integer.MAkVALlJE, which is 2A31 - 1, which is equivalent to 2.1474.83647.
 * string class provieds  various methods like substring(), indexOf(), replace(), split(), trim()....etc.
 */