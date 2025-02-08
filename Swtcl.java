import java.util.Scanner;
public class Swtcl{
public static void main (String [] args )
{
    int a,b;
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter the first number:");
    a = scan.nextInt();
    System.out.println("Enter the second number :");
    b = scan.nextInt();
    char operator;
    System.out.println("Enter the operator (+, -, *,/,):");
   operator = scan.next().charAt(0);
   switch(operator) {
    case '+':
        System.out.println(a + "+" + b + "=" + (a+b) );
        break;
    case '-':
        System.out.println(a + "-" + b + "=" + (a-b) );
        break;
    case '*':
        System.out.println(a + "*" + b + "=" + (a*b) );
        break;     
    case'/':
         System.out.println(a + "/" + b + "=" + (a/b) );
         break;
         default:
            System.out.println("you have entered incorrect operator :");

   }

}            
}