import java.util.Scanner;
public class Array33 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
      System.out.print("enter the number ");

        int N = scan.nextInt();
        
        int[] numbers = new int[N]; 

        for (int i = 0; i < N; i++) {
            numbers[i] = scan.nextInt();
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        
    }
}
 
class Array41{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number");
        int N =scan.nextInt();
         
        int[] arr =new int [N];

        for (int i=0;i<N;i++){
           arr [i] = scan.nextInt();
        }
        

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        
        System.out.println( "Max number "+ max);
        System.out.println( "Min number" + min);


    }
}
    

class Array42{
public static void main(String[] args) {
    int[] number = {10,20,30,40,};
    int sum=0;

    for (int num: number){
        sum +=num;
    }
    System.out.println(  +sum  );
    
}
    
}


 class Array43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      
        System.out.print("Enter the number  ");
        int N = scan.nextInt();

     
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scan.nextInt();
        }

        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

       
        float average = (float) sum / N;

        
        System.out.println( + average);

        
    }
}
