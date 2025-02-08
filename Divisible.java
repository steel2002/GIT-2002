import java.util.Scanner;
public class Divisible{
    public static void main(String[]args){

     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the number.");

      int number = scan.nextInt();

     if ( number % 5 == 0 ){
         System.out.println(number + " is divisible by 5 ");
     } else {
        System.out.println(number + " is not divisible by 5");

     }
    }
} 