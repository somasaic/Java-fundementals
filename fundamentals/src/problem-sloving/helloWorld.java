

//basic java syntax
//packages
//import java.util.*;

import java.util.Scanner;

//public class
public class helloWorld {


    public static void main(String[] args){

        //print hello world msg from user input?
        Scanner in = new Scanner(System.in);
        long number = in.nextLong(); 

        if(number % 2 ==0){
            System.out.println("Given"+number+" is even.");
        }else{
            System.out.println("Given"+number+" is odd.");
        }
        

    }   
}






