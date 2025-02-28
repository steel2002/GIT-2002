import java.util.Scanner; 
public class ArrayMain{

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number ");        // Find Maximum & Minimum Element:

    int n = scan.nextInt();
    int [] number = new int [n];

    

    for ( int i =0;i<n;i++)
    {
        number[i]=scan.nextInt();                     // max or min
    }
        int max = number[0];
        int min= number [0];

          

          for (int num : number)
    {

        if (num > max)
        {
            max =  num;
        }
            if (num < min)
            {
                min = num;
            }
    }
    
       System.out.println("Enter the max "  + max );
       System.out.println("Enter the min "  + min  );
    }
}

 // Sum of Array Elements:

class Hope1{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter the number");
        int n = scan.nextInt();
        int sum=0;
        int []number=new int [n];

        for (int i=0;i<n;i++){
            number [i]=scan.nextInt();                              //sum 
        }
        for (int num: number){
            sum+=num;
        }
         System.out.println(+sum );

    }
}

// Average of Array Elements:

class Hope2{
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.print("Enter thr number ");
        int n = scan.nextInt();
        int sum=0;

        int [] number = new int[n];
        
        for ( int i=0;i<n;i++){
            number[i]= scan.nextInt();                               // average number 

        }
         for ( int num : number){
            sum+=num;
         }
            double average  =(double) sum / n;

         

        System.out.println( +average );
    }
}

// Count Even & Odd Numbers:

class Hope3{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner (System.in);
        System.out.print(" Enter the number ");

        int n = scan.nextInt();

        int[] number = new int [n];
        int evencount =0;
        int oddcount = 0;
         
        for (int i =0;i<n;i++){
            number [i]=scan.nextInt();                                                 // even odd number 
            
        }
        for (int num : number) {
            if (num % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
        }
                System.out.println("Total even number " +evencount);
                System.out.println( "Total odd number " +oddcount);
    }
}

}

//   Sort an Array ():(discending oder)        -- (Ascending Order)

class Hope4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = scan.nextInt();
        int [] arr = new int[n];
        
        for (int k =0;k<n;k++){
            arr[k]=scan.nextInt();                               // Reversed Array numbers
}
        int i=0,j=n-1,temp;

        while (i<j) 
    {
            
            temp = arr[i];
            arr[i]=arr[j];                                     // temp value swiping 
            arr[j]=temp;
            i++;
            j--;

    }
        System.out.println("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
    }
}
} 

class Array6{
 public static void main(String[] args) {
    
          int []a={3,1,4,2};
          for(int i = 0;i<a.length;i++)
          {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
            System.out.print(a[i]+" ");
          }
 
        
            }
        }





class Hope5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number ");
         
        int n = scan.nextInt();

        System.out.print("Enter the words");

        char [] arr = new char[n];

        
        
        for (int k =0;k<n;k++){
            arr[k]=scan.next().charAt(0);                     // Reversed Array letters
                                                         
              
        }
           int i = 0, j = n - 1; 
           char temp;

        while (i<j) 
    {
            
            temp = arr[i];
            arr[i]=arr[j];                                     // temp value swiping 
            arr[j]=temp;
            i++;
            j--;

    }
        System.out.println("Reversed array: ");
        for (char num : arr) {
            System.out.print(num + " ");
    }
}
} 


class Hope6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter the number  ");
        int n =scan .nextInt();

        System.out.print("Enter the key   ");
         int key = scan.nextInt();
       
         int [] arr = new int [n];

         for (int i=0;i<n;i++){
            arr [i]= scan.nextInt();                // (Linear Search) :
        }

         for (int num :arr){
            if (num == key){

                System.out.println(key + " is present  in the array.");
              
               break;
            }
         else {
            System.out.println(key + " is not  present in the array.");
            break;

        }
        
    }
}
}

class Hope7{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the number ");
        int n=scan.nextInt();


        System.out.print("Enter the character ");

         char key =scan.next().charAt(0);                  // (Linear Search)
        
        char[] arr =new char [n];
      

        for (int i=0;i<n;i++){
             arr [i]=scan.next().charAt(0);
        }
         for (int ch :arr){
            if (ch==key){
                System.out.println(key + " is present in the words.");
               break;
            }
        
        
         else {
            System.out.println(key + " is not present.");
            break;
         }
        
        }

    }
    }

    class Hope8{
        public static void main(String[] args) {
            int[]num ={1,2,3,4,5,6};
            int n= 4;

            for (int i=0;i<num.length;i++){      // (Linear Search)   possition check  frequenc
                if (n==num [i]){
                    System.out.println(i);
                    break;
                }
                
            }
        }
    }  

                            // Find Second Largest Element:
    class Hope9{
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Array value  ");
        int n= scan.nextInt();
        int dum=0;
        int []arr= new int[n];
        for(int k=0;k<n;k++){
            arr[k]=scan.nextInt();
            
        }
        int i=0,j=n-1,temp;
        

        while (i<j) {
             temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j--;
        }
           System.out.println("Revers Array ");
           for (int num : arr){
            System.out.print(num + " ");
           }
           if(arr[0]==arr[1])
           {
           while(dum<n)
           {
           if(arr[1]!=arr[dum])
           {
               System.out.println("The second largest element in an array: "+arr[dum]);
               break;
           }
           dum++;
           }
           }
           else{
               System.out.println("The second largest element in an array: "+arr[1]);  
           }
        }
    }
         
    
    
// Remove Duplicates from an Array:


    class Hope10
{
        public static void main(String[] args) 
   {
            Scanner scan =new Scanner (System.in);
            System.out.println("Enter the Array length:  ");
            int n = scan.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the array values: ");
            for(int i = 0;i<n;i++)
            {
                arr[i]=scan.nextInt();  //{1,2,3,3,2}
            }
            for(int i = 0;i<n;i++)
            {
                int count =0;
                for(int j = i+1;j<n;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                    }
                }
                if(count == 0)
                {
                    System.out.println(arr[i]);
                }
            }
        }
}    
 
// Find Duplicate Elements in an Array:

class Hope11{
    public static void main(String[] args) {
        int [] n = {1,2,3,4,5,6,7,1,2,7,8,9,99,88,77,66,55,44,33,22,11,23,24,25,262,77,};

         for (int i=0;i<n.length;i++){

            for (int j=i+1;j<n.length;j++){
                if (n[i]==n[j]){
                    System.out.println("Enter the duplicate value :  " +n[i]);
                }
                }
           
         }
    }
}


// Merge Two Arrays:


class Hope12{
    public static void main(String[] args) {

        int [] a={1,2,3,4,5,};
        int [] b={6,7,8,9,0,};
        int [] c= new int [a.length + b.length];

         for (int i=0;i<a.length;i++){
            c[i]=a[i];
         }
          for (int i =0;i<b.length;i++){
            c[i+a.length]=b[i];
          }
          System.out.print("Merged Array: ");
          for (int num : c) {
              System.out.print(num + " ");
          }
        }

}

// Left Rotate an Array by 1 Position:

class Hope13{
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.print("Enter the Array length ");
        int n=scan.nextInt();
        int []arr=new int [n];
        System.out.print("Enter the Array number ");

        for (int k=0;k<n;k++){
            arr[k]=scan.nextInt();
        }
         int temp =arr[0];
         for (int i=0;i<n-1;i++){
             arr[i]=arr[i+1];
         }
          
         arr[n-1]=temp;
         
          //System.out.print("Left shift Array : ");
          for (int num : arr ){
            
            System.out.println(num);
            
          }  

        }

    }

    // Right Rotate an Array

    class Hope14{
        public static void main(String[] args) {
            Scanner scan =new Scanner (System.in);
            System.out.print("Enter the Array length ");
            int n=scan.nextInt();
            int []arr=new int [n];
            System.out.print("Enter the Array number ");
    
            for (int k=0;k<n;k++){
                arr[k]=scan.nextInt();
            }
             int temp =arr[n-1];
             for (int i=n-1;i>0;i--){
                 arr[i]=arr[i-1];
             }
              
             arr[0]=temp;
             
              
              for (int num : arr ){
                
                System.out.println(num);
              }
            }

        } 

        // Find Missing Number in an Array (1 to N):

        class Hope15{
            public static void main(String[] args) {
                int []arr ={1,2,3,4,5,7,8,9,10};
                int sum1=0;

                for (int i=0;i<arr.length;i++){
                   sum1=sum1+ arr[i];
                   
                }
                 System.out.println( "Sum of element of array :" +sum1);
                
                int sum2=0;
                 for (int i=1;i<=10;i++){
                    sum2=sum2+i;
                 }
                 System.out.println("Sum of range of :"+sum2);

              System.out.println(" missing number of array :" +(sum2-sum1));
                    }
                }


                //  Check if Array is Palindrome:


class Hope16{
    public static void main(String[] args) {
        String word =  " MalayalaM ";
        String word2="";

        for (int i = word.length()-1;i>=0;i--){
             word2=word2 + word.charAt(i);
        }
        System.out.println(word2);
        if(word .equals (word2)){
           System.out.println("Palindrome :");
        }

           else {
              System.out.println("Not Palindrome :");
           }
        
    }
}

/* Program to find whether the given array is palindrome or not */
class Hope17
{
    public static void main(String[]args)
    {
        int[]arr = {1,3,4,5,4,3,1,2};
        int s=1;
        for(int i = 0, j=arr.length-1; i<arr.length && j>=0; i++,j--)
        {
            if(arr[i]!=arr[j])
            {
                s=0;
                break;
            }
        } 
     if(s==0) 
     {
        System.out.println("The given array is not a palindrome");
     }
     else{
        System.out.println("The given array is a palindrome");
     }
        
    }
}

/* Program to find whether the given array is palindrome or not */

class Hope18{
    public static void main(String[]args){
        int []a ={1,2,3,4,3,2,1};
        int s=1;
        int i =0,j=a.length-1;
        while (i<j) {
            if (a[i]!=a[j]){

                s=0;
                break;
             }
             i++;
            j--;
            }
            
        if (s==0){
           System.out.println("Not");
        }
        else {
            System.out.println(" yes ");
        }
        
        
        }

    }
