import java.util.Scanner;

    public class Control1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + i; j++) {
                if (j < n - i - 1) {
                    System.out.print("  "); 
                } else if (j==3) {
                    System.out.print("1 "); 
                } 
                else if (j==2 || j==4){
                    System.out.print("2 "); 
                }
                else if (j==1 || j==5) {
                 
                    System.out.print("3 "); 
                }
                else if (j==0|| j==6) {
                    System.out.print("4 "); 
                }
            }
            System.out.println();
        }
        
       

        
    }
}


