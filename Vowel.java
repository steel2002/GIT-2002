import java.util.Scanner;
public class Vowel {
    public static void main(String []args){
   Scanner scan = new Scanner(System.in);
    System.out.print("Enter a single character :");
    char ch = scan.next().charAt(0); // this charAt (0) = first litter is 0 so first input to output
     
       if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch=='A') 
       {                           //  Capital litters conster panna this tayps work 
          System.out.println ( ch + " is a vowel .");
       }
      else 
        { 
           System.out.println (ch + " is a consonant .");
        }
    } 
    
}




