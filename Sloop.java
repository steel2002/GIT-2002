import java.util.Scanner;
public class Sloop{
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the value for n: ");
        int n = java.nextInt();
        for (int i=0;i<n;i++){
        for(int j=0;j<n+i;j++){
        if (j<(n-i-1)){
         System.out.print("  ");
        
                } else {
                    System.out.print("* ");
            }

        }
          System.out.println();
    }
    }
    }
