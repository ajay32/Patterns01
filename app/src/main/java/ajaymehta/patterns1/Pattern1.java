package ajaymehta.patterns1;

/**
 * Created by Avi Hacker on 7/3/2017.
 */

/*

Pattern 1 :

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
        1 2 3 4 5 6 7
*/

// Pattern CheatSheet
    // we know our j loop will print stuff..so first just think about how the stuff is prinitng ..n how j loop will print the stuff
    // first column is starting with (1 in all the rows) so j will start with j = 1;
    //as row increating -> column number also increasing (so row n column number are woking together) so j will go upto  j<=i

    // now about row...(i) ..our j is going upto i ..so it will surely will increase  i=1; i<=n ;i++
public class Pattern1 {


    public static void forloop(){

        for(int i=1;i <=7 ; i++) {

            for(int j=1; j<=i; j++) {

                System.out.print(j);
            }
            System.out.println();

        }

    }


    public static void forWhileLoop(){

        for(int i=1; i<=7; i++) {  // so while loop shoud be inside for ..so evey part of while loop willl be inside for even initilization..

            int j=1;
            while(j<=i) {
                System.out.print(j);
                j++;
            }
            System.out.println();

        }
    }





    public static void main(String args[]) {

      //  forloop();
        forWhileLoop();


    }
}
