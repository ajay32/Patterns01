package ajaymehta.patterns1;

/**
 * Created by Avi Hacker on 7/3/2017.
 */

/*
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
        6 6 6 6 6 6
        7 7 7 7 7 7 7

        */

//our first column is (increaminting) but here is a trick..all values are constart  like 2 2, 3 3 3
    // so it will go as our previous like simple our j will go upto i..but it will print i ..when i is true it will go form j=1; j<=i ..and will print i ..if i is at 2..j will move 2 time n print 2 two times..


public class Pattern2 {


    public static void forloop(){

        for(int i=1; i<=7 ; i++) {

            for(int j =1; j<=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }


    public static void forWhileLoop() {
        for(int i=1; i<=7; i++){

            int j=1;
            while(j<=i) {
                System.out.print(i+" ");
                j++;
            }
            System.out.println();
        }

    }

    public static void main(String args[]){

      //  forloop();
        forWhileLoop();
    }


}
