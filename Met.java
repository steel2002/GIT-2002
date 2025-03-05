import java.util.Scanner;

// Factorial 

public class Met{
    static int Met(int n){
        if (n==0){
            return 1;
        }
        return n*Met( n-1);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value :");
        int n= scan.nextInt();
        System.out.println(Met(n));
    }
}

// Prime Number 

class Met1{
    static  int Met(int n,int m){
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
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the Value :");
        int n=scan.nextInt();
        if (n==2){
            System.out.println("This is Prime Number :"+n);
        }
        if(Met(n,n)<=2){
            System.out.println("This is Prime Number :"+n);
        }
        else {
            System.out.println("This is Not Prime Number :");
        }
    }
}

// Fibinacci 

class Met2{
    static int Met(int f,int s ,int n){
       if (n==0){
        return f;
       }
       else {
        f=s-f;
        s=s+f;
        
       }
       System.out.println(f);
       return Met(f, s, n-1);
       
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the Value :");
        int n=scan.nextInt();
        System.out.println(Met(1,1,n));
    }
    
}

// Sum of digits 

class Met3{
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
        System.out.println("Enter the Value :");
        int n=scan .nextInt();
        System.out.println(Met(n,0));
    }
}

// Palindrome 

class Met4{
    static boolean Met(String str,int start ,int end ){
        if (start>=end){
            return true;
        }
        if (str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return Met(str, start+1, end-1);
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("Eny Words :");
            String str=scan.nextLine();
            if (Met(str, 0, str.length()-1)==true){
                System.out.println("This is Palindrome :");
            }
            else {
                System.out.println("This Not Palindrome :");
            }
    }
}
// GCM AND LCM

class Met5{
    static int Met(int n1,int n2){
        if (n2==0)
            return n1;

            return Met (n2, n1%n2);
        
    }
        static int Met(int n1,int n2,int max){

            if ((max%n1==0)  && ( max%n2==0))
                return max;
                
            return Met(n1, n2, ++max);
        }
       
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the base Value :");
        int n1=scan.nextInt();
        System.out.println("Enter the Expond value :");
        int n2=scan.nextInt();
        int max=n1>n2?n1:n2;
        System.out.println(Met(n1,n2));
        System.out.println(Met(n1, n2,max));
}
}



// Factor count 

class Met6{
    static int Met(int n,int m){
        int count=0;
        if(m==0){
            return 0;
        }
        if (n%m==0){
            count =1;
        }
        return count +Met(n, m-1);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Value :");
        int n=scan.nextInt();
       System.out.println("This count Facter "+Met(n, n));


    }
    
}

// Perfect Number

class Met7{
    static int Met(int n,int m){
        if (m==0){
            return 0;
        }
        if (n%m==0){
            return m+Met(n,m-1);
        }
        return Met(n, m-1);
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Value :");
        int n=scan.nextInt();
        int sum=Met(n, n-1);

        if (sum==n){
            System.out.println("This Number is Perfect Number :");
        }
        else {
            System.out.println("This Number is Not Perfect Number :");
        }
    }
}

// Power Functions 

class Met8{
    static int Met(int n1,int n2){
      return (int)Math.pow(n1, n2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base value :");
        int n1=scan.nextInt();
        System.out.println("Enter the Exponent value :");
        int n2=scan.nextInt();
        System.out.println("Power The Number "+Met(n1, n2));
    }
}

// Digits Revers 

class Met9{
    static int Met(int n,int m){
        if (n==0){
            return m;
        }
        if (n>0){
             m= m*10+n%10;
        }
        return Met(n/10, m);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value :");
        int n=scan.nextInt();
        System.out.println("This Reversd Number "+Met(n,0));
    }
}

// Armstorng Number 

class Met10{
    static int Met(int n,int size){
        if (n==0){
            return 0;
        }
        int arm=n%10;
        return(int)Math.pow(arm, size)+Met(n/10, size);
           }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=scan.nextInt();
        int x=n,length =0;
        while (n>0) {
            n=n/10;
            length++;
            
        }
         if (Met(x, length)==x){
             System.out.println("This Amstorng Number :");
        }
        else {
            System.out.println("This is Not Amstorng Number :");
        }
    }
 }

 // Perfect Number Any digits 

class Met11{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=scan.nextInt();
        
        for(int i=2;i<n;i++){
            int   num=0;
            for (int j=1;j<=i/2;j++){

                if (i%j==0){
                   num=num+j;
                }

            }
            if(num==i){
                System.out.println(i);
            }
        }
    }
}

// Eny Number Perfect Number 

class Met12 {
    static int Perf1(int num, int dev) {
        if (dev == 0) 
            return 0;
        
        if (num % dev == 0) 
 
 
        return dev + Perf1(num, dev - 1);
        
        return Perf1(num, dev - 1);
    }

    static void Met13(int n, int i) {
        if (i >= n) 
            return;
        
        int sum = Perf1(i, i / 2);
        if (sum == i) 
            System.out.println(i);
        
        Met13(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = scan.nextInt();
        System.out.println("Perfect Numbers up to " + n + ":");
        Met13(n, 2);
    }
}

// Triangle in Recurtion 

class Met14{
    static int Met(int n){
        if (n==1){
            return 1;
        }
       else {
        
        return n+Met(n-1);
       }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value :");
        int n=scan.nextInt();
        int result =Met(n);
        System.out.println("Enter the Triangle Value "+n+"  is " +result);

    }
}



    
    












