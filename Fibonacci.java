/*Print Fibonacci number in Java */

import java.util.Scanner;

public class Fibonacci{
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);

    System.out.println("Enter the size of number to be printed:");
        int n = sc.nextInt();

    int a = 0, b = 1, c; //these has to be fixed variable
    System.out.print(a+" "+b);

    for(int i=1; i<n; i++){ 
        c = a + b; //adding the two first numbers

        System.out.print(" "+c);

        //Updating the value of a and b
        a = b;
        b = c;
        sc.close();
    }
}
}