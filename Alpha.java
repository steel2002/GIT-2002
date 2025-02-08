import java.util.Scanner;
public class Alpha {
        public static void main(String[] args) {
            int n = 5; // Change this value to print a bigger pattern
            
            for (int i = 1; i <= n; i++) {  // Outer loop for rows
                for (int j = 1; j <= i; j++) { // Inner loop for columns
                    System.out.print(j +" "); // Print numbers
                }
                System.out.println(); // Move to the next line
            }
        }
    }
    
 
 
 
 /* 1 
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5 
 /




   class Number3 {
        public static void main(String[] args) {
            int n = 5;
            
            for (int i = 1; i <= n; i++) {  
                for (int j = 1; j <= i; j++) { 
                    if (j % 2 == 0) {
                        System.out.print("*  "); // Replace even numbers with "*"
                    } else {
                        System.out.print(j); // Print odd numbers
                    }
                }
                System.out.println(); 
            }
        }
    }
    


/*
  
      1
      1*
      1* 3
      1* 3*
      1* 3* 5
  
  
 */




 class Bot1{

 public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == j || i + j == rows + 1) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


 }