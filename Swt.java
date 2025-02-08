  import java.util.Scanner;
  public class Swt {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the day (1- 7):");
         int day = scan. nextInt();
        int d = day % 7;
         switch (d)
         {
         case 1:
         System.out.println("Monday");
         break;
         case 2:
         System.out.println("Tuesday");
         break;
         case 3:
         System.out.println("Wednesday");
         break;
         case 4:
         System.out.println("Thursday");
         break;
         case 5:
         System.out.println("Friday");
         break;
         case 6:
         System.out.println("Saturday");
         break;
         case 0 :
         System.out.println("Sunday");
         break;
        default : 
        System.out.println ("enter proper day ");

         }
         }
         }