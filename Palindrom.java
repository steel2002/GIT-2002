import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
            
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j <= i) {
                   System.out.print( j + " " );
                } else {
                    System.out.print( (j - i + 1) + " ");
                }
            }
            
            System.out.println();
        }
        
        
    }
}

            
            

