package ajaymehta.patterns1;

import java.util.Scanner;

/**
 * Created by Avi Hacker on 7/6/2017.
 */
/*

1010101
1010101
1010101
1010101
1010101
1010101
1010101
*/

    // you can see...first row ..j will start from the constant value 1 and go upto n ..same with i it will start from 1 and go upto n. u can see they end in the same like so both loop will go uptoo n..
    // so when j is odd print 1 when j i even print 0..


public class Pattern14 {


    static Scanner sc = new Scanner(System.in);

    public static void forloop(int n) {

        for(int i=1; i<=n;i++){

            for(int j=1; j<=n;j++){

                if(j%2==0){
                    System.out.print(0);
                }else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }

    }


    public static void main(String args[]) {

        System.out.print("How many rows to create a pattern:");

        int x = sc.nextInt();

        System.out.println();

        forloop(x);
    }
}
