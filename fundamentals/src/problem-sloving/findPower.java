
import java.util.Scanner;

public class findPower {
    static long result = 1;
    
    //function-
    private static long getPower(long base, int exponent) {
        //long result = 1;
        for(int i = 0; i<exponent;i++){
            result *= base;
        }
        return result;
    }

    public static long multiply(long num){
        long  product = num * result;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long base = sc.nextLong();
        int exponent = sc.nextInt();

        long result =  getPower(base,exponent); //method calling
        System.out.println(base+" raised the power of " + exponent +"  is: "+result); 

        long num = sc.nextLong();
        long res =  multiply(num); //method calling
        System.out.println("power after Multiply:"+res);
    }
    
}
