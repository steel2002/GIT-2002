import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        double radius, length, width, base, height,area;
         System.out.println(" choose a shape to calculate:");
         System.out.println("1 for circle :");
         System.out.println("2 for Triangle :");
         System.out.println("3 for Rectangle :");
         int choice = scan. nextInt();
         switch (choice) {
            case 1:
            System.out.println("Enter radius :");
            radius = scan.nextDouble();
            double circleArea = 3.14* radius*radius;
            System.out.println("Circle Area: " + circleArea);
            break;
            case 2:
            System.out.println("Enter height :");
            height = scan.nextDouble();
            System.out.println("Enter base :");
            base = scan.nextDouble();
            double triangleArea = base*height*1/2;
            System.out.println("Triangle Area: " + triangleArea);
            break;
            case 3:
            System.out.println("Enter the length:");
            length = scan.nextDouble();
            System.out.println("Enter width :");
            width = scan.nextDouble();
            double RectangleArea = length * width;
            System.out.println("Rectangle Area: " + RectangleArea );
            break;
            default:
            System.out.println("Invalid choice. Please select 1, 2, or 3.");
            
         }
    }
}
