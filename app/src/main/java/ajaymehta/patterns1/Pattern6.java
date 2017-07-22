package ajaymehta.patterns1;

/**
 * Created by Avi Hacker on 7/3/2017.
 */

/*
        7
        7 6
        7 6 5
        7 6 5 4
        7 6 5 4 3
        7 6 5 4 3 2
        7 6 5 4 3 2 1
        */

    // here just focus on inside loop... first it shoud print 7 , then 7 ,6  then 7,6,5 ..means our inside loop is decreasing.. one by one..
    // if i starts with 7 then it goes to 6 then 5 ...n we can move our inside loop till ..i ...n odne..

public class Pattern6 {


    public static void forloop() {

       for(int i=7; i>=1; i--){

           for(int j=7; j>=i ; j--) {

               System.out.print(j+" ");
           }
           System.out.println();

       }


    }

    public static void main(String args[]) {

        forloop();

    }
}
