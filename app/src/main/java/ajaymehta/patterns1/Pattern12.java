package ajaymehta.patterns1;

import java.util.Scanner;

/**
 * Created by Avi Hacker on 7/6/2017.
 */
/*

1 2 3 4 5 6 7                  1 2 3 4 5 6 7
 2 3 4 5 6 7                   * 2 3 4 5 6 7
  3 4 5 6 7                    * * 3 4 5 6 7
   4 5 6 7                     * * * 4 5 6 7
    5 6 7                       * * * * 5 6 7
     6 7                       * * * * * 6 7
      7                                   7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7
*/
// THE EXAMPLE I CREATED ABOVE IS BECAUSE I WANT YOU TO THINK THERE A PATTERN BEOFRE NUMBER (*) NOT SPACE N WE HAVE TO PRINT IT USING LOOP.

    // first inside the i loop print space..if i is 1 one space ..if i is 5 then 5 space ..then start printing..
    //   our first digonally row in changinge so our j will start from i ..n it is increasing ..so i loop will increase
    // n it will go upto n ... j loop will also go upto n

    // lower half.. see our 1st digonaly vertical rows are decreasing..so our j will start with i ..n go upto n..n for j ..i has to start with n-1 n go down 1..

public class Pattern12 {

    static Scanner sc = new Scanner(System.in);

    public static void forloop(int n) {

        for (int i = 1; i <= n; i++) {

            for (int space = 1; space <= i; space++) { // dont think it as of space ..think it as of pattern that we have to print..before our i and j working..
                System.out.print(" ");
            }


            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");

            }
            System.out.println();



        }  // end of ist half

        for(int i= n-1; i>=1; i--){

            for(int space=1; space<=i; space++){
                System.out.print(" ");

            }
            for(int j=i; j<=n; j++) {

                System.out.print(j+" ");
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
