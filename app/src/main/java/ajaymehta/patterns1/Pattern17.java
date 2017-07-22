package ajaymehta.patterns1;

import java.util.Scanner;

/**
 * Created by Avi Hacker on 7/7/2017.
 */
/*

        0000000
        0100000
        0020000
        0003000
        0000400
        0000050
        0000006

*/
// see divide the triange into two..1st half ...sare zero...as second get started it..it fist print i values then all zeros after it
    // for i start with zero..so k will print all the zeros..for first..then j loop will come into existance..
    // as j print the fist half triange...as k loop start it first print the i value n it will go upto n ..

public class Pattern17 {

    static Scanner sc = new Scanner(System.in);

    public static void forloop(int n) {

      for(int i=0; i<=n; i++){

          for(int j=1; j<=i; j++) { // this loop will first not move coz its starting with 1 and but it will go upt i --> 0  ..so first time this loop will skip..
              System.out.print(0);  // before k value j will go print 0's before k loop will do its work..
          }

          for(int k=i; k<=n; k++){

              if(k == i) {  // k start will i ..so it will print its first value as of i  0,1,2,3,4,5

                  System.out.print(i);
              } else{
                  System.out.print(0);  // after printing ith number k will print rest the zeros's
              }

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
