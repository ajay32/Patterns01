package ajaymehta.patterns1;

import java.util.Scanner;

/**
 * Created by Avi Hacker on 7/6/2017.
 */

/*

        1
        1 2 1
        1 2 3 2 1
        1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
        1 2 3 4 5 6 5 4 3 2 1
        1 2 3 4 5 6 7 6 5 4 3 2 1
*/

    // see the pattern ..exact triange it.prints from 1 to 7 same.... 1, 12 ,123 ,123 ..n another pattern added to it ...1, 121 [after 12] it starts adding
    //so other patter going like   1,21,321,4321  ,,,means  if i is 3 ..it goes from 2 to 1 , if i is 5 it goes from 4 to 1 ..so it will start from (i-1) n will upto 1..for this create another loop who shoud execute after thhe J loop..


public class Pattern9 {

  static  Scanner sc = new Scanner(System.in);

    public static void forloop(int n) {

        for(int i=1; i <=n; i++) {

            // J loop                       first J will be exectue ..after it finished ..it will go to K loop
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }

            // K looop                    as J finished k start executing..
            for(int k=i-1; k>=1; k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }

        sc.close(); // after finishing everything closing the Scanner...

    }



    public static void main(String args[]) {

      System.out.print("How many rows to create a pattern:");

        int x = sc.nextInt();

        System.out.println();

        forloop(x);
    }
}
