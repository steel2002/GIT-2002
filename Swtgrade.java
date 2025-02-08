import java .util.Scanner;
public class Swtgrade{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print (" Enter the mark (0 to 100):");
        int mark = scan.nextInt();
        String grade; 
        switch (mark / 10){
            case 10 :
            case 9 :
            grade = "A";
            break;
            case 8 :
            grade = "B";
            break;
            case 7 :
            grade = "C";
            break;
            case 6 :
            grade = "D"; 
            break;   
            case 5 :
            grade = "E";
            break;
            default:
            grade = "F (Less then 50:)";
            break;
        }
                System .out.println ("The grade is :" + grade);



        }
         
    }
