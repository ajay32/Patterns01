package ajaymehta.patterns1;

/**
 * Created by Avi Hacker on 7/3/2017.
 */

/*

        7 6 5 4 3 2 1
        6 5 4 3 2 1
        5 4 3 2 1
        4 3 2 1
        3 2 1
        2 1
        1

        // inner loop start with 7 to 1 then 6 to 1..n so on..   so our outer will will start from 7 then 6 then 5....
        //so our inner loop will start with i .coz its decreaing 7,6,5 ..n go upto 1
*/

public class Pattern7 {

    public static void forloop() {

        for(int i=7; i>=1; i--){

            for(int j=i; j>=1; j--){

                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        forloop();
    }
}
