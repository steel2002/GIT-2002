// Java Methods
import java.util.Scanner;
public class Methods  {

    void iphone(){
        System.out.print("This is iphone ");
    }




    public static  void main(String[] args) {

        Methods obj1=new Methods();
        obj1.iphone();
        
    }
}


class Met1{
    int a=10;
    int b=20;
    void sum(){
        System.out.print(a*b);
    }
    public static void main(String[] args) {
        Met1 obj =new Met1();
         obj.sum();
    }
}


class Met2{
    int apple =20;
    int count =5;
    void sum(){
        System.out.print(apple*count);
    }
    public static void main(String[] args) {
        Met2 obj = new Met2();
       obj.sum();
    }
}


class Met3{
    void Hope(int a,int b){

        System.out.println(a*b);
    }
    void Hope(double a1,double b1){

         System.out.println(a1/b1);
    }
    public static void main(String[] args) {
        Met3 obj1=new Met3();
        obj1.Hope(10,20);
        obj1.Hope(20,30);
    }
    
}

    



// prints all the even numbers using a for-each loop. Methods

class Met4{
    
     void even(int[]array){
        System.out.println("Even numbers in the array:");
        for (int num : array){
            if (num %2==0){

                System.out.println(num); 
       
            }
             
        }

 }
 public static void main(String[] args) {
    int [] arr={1,2,3,4,5,6,7,8,9,10};
    Met4 obj =new Met4();
    obj.even(arr);
 }
}


// Left Rotate an Array by 1 Position: Methods
class Met5{
    void Left(int[]arr){
        int temp=arr[0];
        for (int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=temp;

        for (int num : arr){
            System.out.print(+num);

        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        Met5 obj=new Met5();
        obj.Left(arr);
    }
}


// right Rotate an Array by 1 Position: Methods

class Met6{
    void Right(int []array){
        int temp=array [array.length-1];
        for (int i=array.length-1;i>0;i--){
            array[i]=array[i-1];
        }
       array[0]=temp;
       for (int num : array){
        System.out.print(+num);
       }
       }
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        Met6 obj=new Met6();
        obj.Right(arr);
        
    }
}

// // Find Missing Number in an Array (1 to N): Methods

class Met7{
    void Missing(int []array){
        int sum1=0;
        for (int i=0;i<array.length;i++){
            sum1=sum1+ array[i];
            
        }
      
        int sum2=0;
        for (int i=1;i<=10;i++){
            sum2=sum2+i;
        }
            System.out.println("Enter the Missing number : "+(sum1-sum2));
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,7,8,9,10};
        Met7 obj = new Met7();
        obj.Missing(arr);
        
    }
}

// palindrome or not */ Methods 

class Met8{
    void Pali(int []arr){
        int s=1;
        int i=0,j=arr.length-1;
        while (i<j) {
            if (arr[i]!=arr[j]){
                s=0;
                break;
            }
            i++;
            j--;
        }

            if (s==0){
                System.out.println(" Not palindrome  :");
            }
            else{
                System.out.println("palindrome :");
            }
            
     }
    public static void main(String[] args) {
        int []arr={1,2,3};
        Met8 obj = new  Met8();
        obj.Pali(arr);

        
    }
}

// * Reversed number in Methods   (discending oder)        -- (Ascending Order)

class Met9{
    void Revers(int [] array){
        int i=0,j=array.length-1,temp;
        while (i<j) {
            temp= array[i];
             array[i]=array[j];
             array[j]=temp;
             i++;
       j--;
        }
        
    
       for (int num : array){
        System .out .println("Enter the reversed number :"+num);
       }
    
    }

public static void main(String[] args) {
    int []arr={1,2,3,4};
    Met9 obj=  new Met9();
    obj .Revers(arr);
}
}

 // (Linear Search) : Methods

 class Met10{
    void Linear(int []array){
        int key=0;
        for (int num : array){
            if (key==num){
                System.out.println("present in Array :");
                break;

            }
        
            else{
                System.out.println("Not present int Array : ");
                break;
            }
        }

    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        Met10 obj = new Met10();
        obj.Linear(arr);
    }
 }

   // Find Second Largest Element Methods

   class Met11{
    void Second(int[] array){
        int n=0;
        int i=0,j=array.length-1,temp;
        while (i<j) {
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
            
        }
        for (int num : array){
            System.out.println(+num);
        }
        if (array[0]==array[1]){
            while (n<array.length) {
           if (array[1]!=array[n]){
            System.out.println("Enter the  Find Second Largest Element  :"+array[n]);
            break;
           }
           n++;
                
            }

        }
        else {
            System.out.println("Enter the  Find Second Largest Element  :"+array[1]);
        }

    }
    public static void main(String[] args) {

        int []arr={100,200,300,400,500,600,700,800,900};
        Met11 obj = new Met11();
        obj .Second(arr);
        
    }
   }

   // Factorial Methods 

   class Met12{
    void Factorial(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial *=i;
        }
        System.out.println("The factorial of " + n + " is " + factorial);    
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number :");
        int n = scan .nextInt();
        Met12 obj = new Met12();
        obj .Factorial(n);

    }
   }

   // Fibonacci series 

   class Met13{
    void Fibonacci(int n){
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        int first = 0, second = 1;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
               first = second;
                second = next;
                }
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scan.nextInt();
        Met13 obj = new Met13();
        obj.Fibonacci(n);
    }
   }

   // demo 
class Met15{
    int sum(int a , int b){
        int c =a+b;
        return c;
        
    }
  
    public static void main(String[] args) {
        Met15 obj = new Met15();
      int sum = obj.sum(10,20);
        
      System.out.println(sum);
    }
}
// Dome 2

class Met16{
    String getname(){
        return "SELVIN";

    }
    public static void main(String[] args) {
       Met16 obj = new Met16();
       String myname = obj.getname();
       System.out.println(myname);
        
    }
}

// * Java Recursion                   // * Java Recursion                   // * Java Recursion            // * Java Recursion
 
 // To print the FIBONACCI SERIES...
 class Met17
 {
     static int met(int f, int s, int n)
     {
         if(n<=0)
         {
             return f;
         }
         else
         {
         f = s - f;
         s = s + f;
         System.out.println(f);
         return met(f, s, n-1);
         }
         
     }
     public static void main(String[]args)
     {
         Scanner java = new Scanner(System.in);
         System.out.println("Enter the size of the fibonacci series: ");
         int n = java.nextInt();
         met(1,1,n);
     }
 }

 
   //Factorial..
class Met14
{
    static int Met(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n * Met(n-1);
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = java.nextInt();
        System.out.println(Met(n));
    }
}

// Add 10 number Recursion 
 
class Met18{
    static int sum(int j){
        if (j>0){
            return j + sum (j-1);
        } else {
            return 0;
        }

    }
    public static void main(String[] args) {
        int i = sum(10);
        System.out.println(i);
    }
}

// Add 5 to 10 number Recursion 

class Met19{

    static int sum(int i,int j){
        if (j>i){
            return j+sum(i, j-1);

        }else{
            return j;
        }

    }
    public static void main(String[] args) {
        int i =sum(5,10);
        System .out.println(i);
        
    }
}
// Factorial 
class Met20{
    static int Fact(int n){
        if (n==0){
            return 1;
        }
        return n *Fact(n-1);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scan.nextInt();
        System.out.println(Fact(n));

    }
}
// Tocheck whether the given number is prime or nott...

class Met21{
    static int Met(int n , int m){
        int count =0;
        if (m==0){
            return 0;
        }
        if (n%m==0){
            count++;
        }
        return count +Met(n, m-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         System.out.println("Enter the number :");
        int n= scan.nextInt();

        if (n==2){
            System.out.println("This Prime Number :");

        }
        if (Met( n,n )<=2){
          System.out.println("This Prime Number :");
          
        }   else{
            System.out.println("This is Not Prime Number :");
        }     
       }
      }

//Sum of the given digits..

class Met22{
    static int Met(int n,int num){
        if (n>0){
            num=num+n%10;
        }
        else {
            return num;
        }
        return Met(n/10, num);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scan.nextInt();
        System.out.println("Digits number :"+Met(n,0));
    }
}

// Power Function

class Met23{
    static int Met(int n,int m){
        return (int)Math.pow(n,m);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base value :");
        int n=scan.nextInt();
        System.out.println("Enter the exponend value :");
        int m=scan.nextInt();
        System.out.println("Value After Powerd "+ Met(n,m));
    }
}

