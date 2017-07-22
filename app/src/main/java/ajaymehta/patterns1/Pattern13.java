package ajaymehta.patterns1;

import java.util.Scanner;

/**
 * Created by Avi Hacker on 7/6/2017.
 */
/*

        1
        10
        101
        1010
        10101
        101010
        1010101
*/
    // see if you alternative printing numbers..then think of location n print em like odd even..
    // see we have just 2 numbers 0 and 1.  1 is printing at odd location (1,3,5) and 0 is printing at even location
    // the pattern is increasing at the same pace from i and j loop..so they both will be incremented...
    // if j is odd we will print 1 there .if j is even (2) we will print 0 there..cool ?

public class Pattern13 {

    static Scanner sc = new Scanner(System.in);

    public static void forloop(int n) {

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++){

                if(j %2 ==0){
                    System.out.print(0+" ");
                }
                else{
                    System.out.print(1+" ");
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
