package ajaymehta.patterns1;

import java.util.Scanner;

/**
 * Created by Avi Hacker on 7/14/2017.
 */

/*

        1
        2 6
        3 7 10
        4 8 11 13
        5 9 12 14 15
*/
//pattern is going if you see it in a long line -- 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15..

public class Pattern18Alternative {
    static Scanner sc = new Scanner(System.in);

    static int adder = 0;


    public static void forloop(int rows) {

        for (int i = 1; i <= rows; i++) {

            int num = i;

            for (int j = 1; j <= i; j++) {

                System.out.print(num + " "); // printing the first column ...for second column ..lets calculate ..see when our i=1 ..we dont have second column ..so our calulation for not print for i=1 ..it will print for when i =2 ..so go on
                // lets calculate num value for next column
// num has got value of i ...
                num += rows - j;   // 2+5-1 // j value is 1 when calculating for second column ...j will be 2 when calculation for 3rd column
                //  num = num+rows-j; // same as above..


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
