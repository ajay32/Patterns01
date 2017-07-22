package ajaymehta.patterns1;

import java.util.Scanner;

/**
 * Created by Avi Hacker on 7/6/2017.
 */
/*

        1010101
        0101010
        1010101
        0101010
        1010101
        0101010
        1010101

*/
// here see the first row ..its like 1010101 ..its not constant..so our j loop has to start with i...
    //i loop will go from 1 to n ..if our j loop will go from i to n ...  (i is increating ) so our numbers that are printing getting less..
    // for that we will make our j loop go from  i=i to n+i   (means jitne number humare i main kam honge uthe hum n main jod denge
    // example  i =3  so our j=i (j=3)  j<n+i (j<7+3)  so no 3 to 10 ..(we will go 7 digits as we want ) ...here is thing we starting from 3 (means we want two numbers to add to n so that it completes total number n we adding i that is 3 ...1 extra ..so we will go less the <n+i ..not <=n+i ..clear ??

public class Pattern15 {

    static Scanner sc = new Scanner(System.in);

    public static void forloop(int n) {

     for(int i=1; i<=n; i++){

         for(int j =i ; j<n+i; j++){  // less then because n+i == 7+1 =8  ..but we want to go upto 7..

             if(j%2==0){
                 System.out.print(0);
             } else{
                 System.out.print(1);
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
