package ajaymehta.patterns1;

import java.util.Scanner;

/**
 * Created by Avi Hacker on 7/14/2017.
 */

/*

        0000000        i j ->0
        0100000        i j ->1  so print 1
        0020000        i j ->2  so print 2
        0003000        i j -> 3 so print 3 ...
        0000400
        0000050
        0000006

*/

public class Pattern17Alternative {

    static Scanner sc = new Scanner(System.in);

    public static void forloop(int n) { // think it as a martix //see its just a mtrix structure...we just have to do ..when i and j is equal just print i .. when i is 1 n j is 1  .. so on

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i == j) {
                   System.out.print(i + " ");  // a space can divide a pattern into two..
                //    System.out.print(i); // to simply print the pattern ..print here..


                } else {
                    System.out.print(0);
                }

            } // end of j loop

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
