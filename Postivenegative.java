import java.util.Scanner;

public class Postivenegative{

   public static void main(String[]args)
   {

   Scanner scan = new Scanner(System.in);

    System.out.print("enter the number");

     int number = scan.nextInt();
      
      if (number > 0 ){
         System.out.println("This number are positive.");

      } else if (number < 0){
        System.out.println("This number are nagetive.");

      } else {
         System.out.println("This number is zero.");
      }
     
}
}






