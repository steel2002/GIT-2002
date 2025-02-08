import java.util.Scanner;
class Prime {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number :");
    int n = scan.nextInt();
    int i;
    for (i=2;i<n;i++)
    {
        if (n % i==0)
        {
        i = 0;
        break;
        }
    }
    if(i==0)
    {
        System.out.println("not a prime number");
    }
    else{
        System.out.println("prime number");
    }   
  }  
}

