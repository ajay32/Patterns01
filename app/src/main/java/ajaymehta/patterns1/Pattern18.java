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
// see we aways manipulate i and j ...here like u see in second column we need .. i+ 4  ...in 3rd column we need i+4+3 ..n so on..
    // so we if we take 4 then add 3 then 2..it seems constant ..if our patter is of 8 rows ..so it totally gonna ruin..so what we can do bout it ..
    // think think ...we got ek or thing to manipulate ..that is  ( n ) ki kitni rows hame chaea ...
    // when we are 1st column when j is 1 (starting from 1 )  it print i value ...see when ist row i is 1, 2nd row i is 2..so on
    // see the pattern we are going ... i n j increasing in context..so our j will go upto i..  ..so when i=2 j=2  , when i=3; j=3,  we are taking about upto ending of loop..not starting
    // see second elementsss of second column ... here our j =2  ..so  i =2 (upto i) , (n+1)5  -->  i + (n+1)-j) = 2 + (5+1)- 2 = 6..  it is same for all the 2nd columns in all the rows
    // see the 3rd elemeneetsss of thrid coulmn -- j=3 ,so i=3 ..now here to get to thrid we have to add  [[ i + secondCoulumn((n - (j-1)) + 3rd column((n - (j-1)) ]] or above calulation done is in bit diff way.


public class Pattern18 {

    static Scanner sc = new Scanner(System.in);

    static int adder=0;


    public static void forloop(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j<=i; j++) {

                if(j>1) {

                    adder += (n - (j-1)) ;

                    System.out.print(i+adder +" ");
                } else {

                    System.out.print(i + " ");
                }

            } // end of j loop
        adder = 0;
    System.out.println();
        } // end of i loop


        sc.close();


    }


    public static void main(String args[]) {

        System.out.print("How many rows to create a pattern:");

        int x = sc.nextInt();

        System.out.println();

        forloop(x);
    }
}