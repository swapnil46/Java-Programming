#Java Stdin and Stdout II

#Hackerrank problem solved using java.


import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
            Scanner scanner=new Scanner(System.in);
            int ivalue=scanner.nextInt();
            double dvalue=scanner.nextDouble();
            scanner.nextLine();
            String mystring=scanner.nextLine();
            
            
            System.out.println("String: "+mystring);
            System.out.println("Double: "+dvalue);
            System.out.println("Int: "+ivalue);
    }
}
