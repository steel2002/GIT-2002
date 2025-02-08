import java.util.Scanner;
 class Demo {
  public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the number ");
   int number = scan.nextInt();
   for ( int i=1;i<=10;i++){
    System.out.println(number + "x" + i + "="+(number * i) );
   }
  }  
}


