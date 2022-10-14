/*The challenge given to us today is to check if any given input number is prime or not.*/
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a positve number: "); //Asking user to enter a number
        int num = sc.nextInt(); //Taking input from user

        boolean isPrime = true;

        for(int i=2; i<num; i++){  //for loop is for non prime number
            //condition for non prime number
            if(num % 2 == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime)
        System.out.println(num+" is Prime number");

        else
            System.out.println(num+" is not Prime number");
    }
}