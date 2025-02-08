import java.util.Scanner;
class Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
    
        int sum = 0;

        for (int n = number; n != 0; n /= 10) {     // sum of digits program
            sum += n % 10;
        }
        
        System.out.println("Sum of digits: " + sum);
    }
}

