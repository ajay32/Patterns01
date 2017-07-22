package ajaymehta.patterns1;

/**
 * Created by Avi Hacker on 7/3/2017.
 */

/*

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
        1 2 3 4 5 6 7
        1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1

*/

  // first half..first column always starting from 1 so..our j will start from 1 n go upto i  j=1; j<=i
    // lower half...see the last diganolly line of triange ...it is going in decreaing  7,6,5,4,3,2,1...means our j will go upto i...if our i is 6 then j=1 to 6 ..then i =5 ..our j =1 to j<=5 ..so j will go upto i..for that i have to start with 6.. n go upto 1


public class Pattern3 {

    public static void forloop() {


        for(int i=1;i <=7; i++){

            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();

            } // end of i loop
        // now printing lower half...

        for(int i= 6; i>=1; i--) {

            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }  // end of 2nd four loop

        }



    public static void main(String args[]) {

        forloop();
    }

}
