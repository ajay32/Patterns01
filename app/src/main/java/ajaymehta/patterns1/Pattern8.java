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
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
        1 2 3 4 5 6 7

        */

    // upper half..we have to print 1 to 7 ..so our j loop...value decreasing..so let make our i loop decrease one by one n our j loop will go uptop that n first print upto 7, then upto 6, then upto 5..
    // lower half simple..i will go upto 7 n j will go upto i ..both are incrementing at the same pace..

public class Pattern8 {

    public static void forloop() {

        for(int i=7; i>1; i--){

            for(int j=1; j<=i; j++){
                System.out.print(j+" ");

            }
            System.out.println();
        } // end of first for loop  // it will first complete the first outside for loop then it will come second outside for loop
        for(int i=1; i<=7; i++){

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
