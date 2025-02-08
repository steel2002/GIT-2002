import java.util.Scanner;
public class Grade{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.print(" Enter a score ( 0 - 100):");
int score = scan.nextInt();

if (score >= 90 && score <= 100){
System.out.println("Grade : A ");

} else if (score >= 80 && score < 90){
System.out.println("Grade : B ");

} else if (score >= 70 && score < 80){
System.out.println("Grade : C ");

} else if (score >= 60 && score < 70){
System.out.println("Grade : D");

} else if (score >= 0 && score < 60){
System.out.println("Grade : F");

} else 
System.out.println("Invalid score! Please enter a number between 0 and 100.");{
 }
}
}
         
    

