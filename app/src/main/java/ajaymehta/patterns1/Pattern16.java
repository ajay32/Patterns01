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
    // Decoding the Pattern ..
    // whole pattern is like a square..so we now i will go 1 to n ..n j will too go 1 to n.
    // see the last column ..when i is 1  1 row last column is 1  ,, when i is 2 ..  2nd row is 2 ,, when i is 3 , 3th row last column is 3.
    // and also when i  is 2 last 2 didigt are 2 ..when 3 last 2 digit are 3...n so on...


    // so here j will print 1 to 7 ...when i is 2  ..when j will reach n-2 =5 (n-i) [ then start another loop that print i value simple ) but it should start from 6th position not fifth ..so n-i = 5+1 (n-i+1)
    // n then break it..so our pattern is end n we dont want to print anything else..

    // see our above condition only work upto n-1 )  here in this case 6 values ....
    // when i is 7 and n is 7  then j == n-1 -->   j == 7-7 =0   ..n j always start with 1 ..so this condition cant satisfy..
    // in that case ..create a new 2nd  case when i ==n  ....then print from 1 to n (value of i ..simple)





public class Pattern16 {

    static Scanner sc = new Scanner(System.in);

    public static void forloop(int n) {

    for(int i=1; i<=n; i++) {

        if(i == n){          // 2nd case when  i==n
            for(int last=1; last<=n; last++){
                System.out.print(i);
            }
            break;  // break bcoz...after this loop execute we dont want to execute anything..like last System.out  vali line ..execute unconditionaly..so we dont want to print ..coz all work will be done by this loop
        }



        for(int j=1; j<=n; j++) {  // 1st case when j = n-1  -> it wil suppot upto n-1 digits

            if(j == (n-i)) {
                System.out.print(1);  // see when j become 6 ..we have to print 1 then start kn-i+1 = 7  (then start k with seven) other wise i column will be missed..
                for(int k=(n-i+1); k<=n; k++){ // we starting here n-i+1 // dont forget to print for n-i digit ..outside the loop
                    System.out.print(i);
                }
                break;  // this loop will print upto n ..so after that we dont want that below System line print 1..so put a break !
            }

            System.out.print(1);
        }
        System.out.println();
    }  // end of I loop...

        sc.close();



    }


    public static void main(String args[]) {

        System.out.print("How many rows to create a pattern:");

        int x = sc.nextInt();

        System.out.println();

        forloop(x);
    }
}
