package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("What's n1?");
        int n2 = ap.nextInt("What's n2?");

        System.out.println("The average is " + (n1+n2)/2.0);







    }

}
