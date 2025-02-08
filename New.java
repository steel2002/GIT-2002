import java.util.Scanner;
class New {
public static void main(String [] args) 
{  
Scanner scan = new Scanner(System.in);
int number = scan.nextInt();
if (number%3==0 && number % 5==0 )
{
System.out.println( number +" The number is divisible by 3 and 5 :");
} else {
System.out.println( number + " The number is not divisible by 3 and 5 :");
}
}
}
