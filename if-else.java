/*
Task
Given an integer,n , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of  to , print Not Weird
If n is even and in the inclusive range of  to , print Weird
If n is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        String ans = "" ;//Declaring empty string
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        //condition checking
if (n%2 != 0) {
    ans = "Weird";
} 
else {
    if (n>=2 && n<5)
        ans = "Not Weird";
     else if (n>=6 && n<=20)
        ans = "Weird";
        else 
            ans = "Not Weird";  
}
System.out.println(ans);

        scanner.close();
    }
}
