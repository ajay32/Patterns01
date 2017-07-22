package ajaymehta.patterns1;

/**
 * Created by Avi Hacker on 7/3/2017.
 */

/*

        1 2 3 4 5 6 7
        1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
*/
// see our first column is constatnt so j will always start with j=1;
    // now see our last digonally trianlge line..its decreasing... 7,6,5......its not constant...
    // so our j will go upto i ..for that i have to start from 7 .. i=7;i>=1; i--  and j=1; j<=i

public class Pattern4 {

    public static void forloop(){

        for(int i=7 ; i>=1 ; i--){

            for(int j=1; j<=i; j++){

                System.out.print(j+" ");

            }

            System.out.println();
        }


    }

    public static void main(String args[]) {

        forloop();
    }

}
