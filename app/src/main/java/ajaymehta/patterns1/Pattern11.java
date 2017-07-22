package ajaymehta.patterns1;

import java.util.Scanner;

/**
 * Created by Avi Hacker on 7/6/2017.
 */


/*

        1234567
        234567
        34567
        4567
        567
        67
        7
        67
        567
        4567
        34567
        234567
        1234567
*/

    //upper half here our n=7 ..n see its 1st digit inceasing..so it must be starting with i and going to n in every j loop....so our i will go from 1 to n  and our j will also go from 1 to 7
    // lower half... see first column is decreasing so j cant always start with the constant value.. so our i will be surely be decreaing ..n our j will start with i n will go upto the number n

public class Pattern11 {

    static Scanner sc = new Scanner(System.in);

    public static void forloop(int n) {

      for(int i=1; i<=n; i++){

          for(int j=i; j<=n;j++){
              System.out.print(j+" ");

          }
          System.out.println();

      }

        // another i j loop

        for(int i=n-1; i>=1;i--){

            for(int j=i ; j<=n; j++){

                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();

    }


    public static void main(String args[]) {

        System.out.print("How many rows to create a pattern:");

        int x = sc.nextInt();

        System.out.println();

        forloop(x);
    }
}