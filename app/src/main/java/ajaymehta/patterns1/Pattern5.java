package ajaymehta.patterns1;

/**
 * Created by Avi Hacker on 7/3/2017.
 */
/*

        7 6 5 4 3 2 1
        7 6 5 4 3 2
        7 6 5 4 3
        7 6 5 4
        7 6 5
        7 6
        7

*/

  //.see fist column it always start with 7 (so j=7 always) n last digonal line.. it has a increasing order  mean our i will increase
    // n j will go down to i   j=7 j>=i

public class Pattern5 {

    public static void forloop() {

        for(int i=1; i<=7; i++){

            for(int j=7; j >=i; j--){  // what we describle in inner loop it is just from printing..it will always start with 7 each time its coming from outer loop..

                System.out.print(j+" ");
            }
            System.out.println();

        }
    }

    public static void  main(String args[]) {

        forloop();
    }
}
