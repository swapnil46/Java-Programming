# Java If-Else

#Hackerrank problem solved using java.
  

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scanner = new Scanner(System.in);
      int n= scanner.nextInt();
     if(n%2!=0 ) 
     {
         System.out.println("Weird");
     } 
     else
     {
          if((n>2) && (n<5))
        {
            System.out.println("Not Weird");
        }
        if((n>6) && (n<=20))
        {
            System.out.println("Weird");
        }
        if(n>20)
        {
            System.out.println("Not Weird");
        }
    }
  }
}


