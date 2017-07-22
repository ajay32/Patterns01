package ajaymehta.patterns1;

import java.util.Scanner;

/**
 * Created by Avi Hacker on 7/6/2017.
 */

/*


        1
        2 1
        3 2 1
        4 3 2 1
        5 4 3 2 1
        6 5 4 3 2 1
        7 6 5 4 3 2 1
*/

    // i is increasing ..on every step...as or just is starting from 1 more on every step(ist digit)...cordination with i ..so j shoud start will i n go down to 1


public class Pattern10 {

    static Scanner sc = new Scanner(System.in);

    public static void forloop(int n) {

        for(int i =1; i<=n; i++){

            for(int j=i; j>=1; j--){

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
