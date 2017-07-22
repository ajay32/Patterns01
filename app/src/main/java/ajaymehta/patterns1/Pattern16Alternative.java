package ajaymehta.patterns1;


import java.util.Scanner;

/**
 * Created by Avi Hacker on 7/7/2017.
 */
/*


        1111111
        1111122
        1111333
        1114444
        1155555
        1666666
        7777777

*/

    // other simple way to do it ..it to just think of pattern...threre are two patterns in it...forming two triangles
    // see upperhalf trinage is formed by all 1's ..n (left triange) ...n lower half (right) triangle is formed by 1 to 7...
    // first code for upper half trainge using i and j ..then for lower half triangle...1 to 7...


    // see last columns are increasing (to left) as i increasing ..when i is 2 ,, it goes last 2 element  2,2  ..so on..
    // so we will print first half trainger ..j will go upto  n-i  ....
    // for second pattern k will start from 1 and will go upto 1 ...if coz i are the only digits left in 2nd row 2 ,,in 3rd row 3..n so on.

public class Pattern16Alternative {

    static Scanner sc = new Scanner(System.in);

    public static void forloop(int n) {

       for(int i= 1; i<=n; i++) {

           for(int j=1; j<=n-i; j++){

               System.out.print(1);
           }

           // start of k loop

           for(int k=1; k<=i; k++){
               System.out.print(i);
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
