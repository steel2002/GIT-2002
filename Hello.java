import java.util.Scanner;
public class Hello{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner (System.in);
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();
    if (num1==num2)
    {
      System.out.println("Both number are equal");
    } 
    else 
    {
      System.out.println("not equal");
    }
} 
}

