import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class practise {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        //read input
        int n = sc.nextInt();

        /*
         * Square pattern

            * * * * *
            * * * * *
            * * * * *
            * * * * *
            * * * * *
        */
        /* 
        //outer loop for rows of stars
        for(int row = 1; row<=n; row++){

            //inner loop to handle spaces between stars in a row
            for(int column = 1;  column<=n; column++){
                System.out.print("*"+" ");
            }
            //new line after each row is printed
            System.out.println();
        }
        */

        /*
         * left angle trinagle pattern
            * 
            * * 
            * * * 
            * * * * 
        */
        /* 
        //outer loop for rows of stars
        for(int row = 1; row<=n; row++){

            //inner loop to handle spaces between stars in a row
            for(int column = 1;  column<=row; column++){
                System.out.print("*"+" ");
            }
            //new line after each row is printed
            System.out.println();
        }
        */

        /*
         * right angle trinagle pattern
                  * 
                * * 
              * * * 
            * * * * 
        */
        /* 
        //outer loop for rows of stars
        for(int row = 1; row<=n; row++){

            //inner loop to handle spaces between stars in a row
            for(int column = 1;  column<n; column++){
                System.out.print(" "+n-column);//printing space
            }

            //new line after each row is printed
            System.out.println();
        }
        */
        /* 
        int row = 1;
        //outer loop // 4
        //row treats -> 1, 4
        while(row<=n){
            int space = 1;
            //inner loop // 4 , 16
            // column treats
            while(space<=row){
                System.out.print(65+" ");
                space++;

            }
            System.out.println();
            row++;
        }

        */
        //initialize -> variable and size is created in os
        char ch = 'A'; // only varaible name -> declare ch(name of varaible -> char datatype -> size 1 byte.) but not assigned any value.
        //outer loop // 4
        //row treats -> 1, 4
        int row = 1;
        while(row<=n){
            //initialization -> value is assigned to ch.
            //ch = 'A'; // declaring "A" to the ch variable which already initilized above.
            int space = 1;
            //inner loop // 4 , 16
            // column treats
            while(space<=n){
                System.out.print(ch+" ");
                //ch++; //a,b,c, d
                space++;

            }
           
            System.out.println();
            ch++;
            row++;
            
        }





    }
    
}
