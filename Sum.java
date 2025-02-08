import java.util.Scanner;

 class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number (N): ");
        int N = scan.nextInt();
        
        int sum = 0; 
        for (int i = 1; i <= N; i++) {
            sum +=i; 
              
        }
        System.out.println("Sum of first " + N + " natural numbers: " + sum);
        
    }
    }

 
    

