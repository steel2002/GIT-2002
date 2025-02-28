import java.util.Scanner;

// 1. Maximum Element in an Array
public class Array22 {
    public static void main(String[] args) {
        int []a={3,5,1,9};
        int max=a[0];
        for (int i=0;i<a.length;i++){
        
        }
         for (int num: a){
            if (num>max);
            max=num;
         }
         System.out.println("Enter the max number " +max);
        
    }
}

// 2. Minimum Element in an Array

class Array1{
    public static void main(String[] args) {
        int []a={7,2,10,4};
        int min =a[0];
        for (int i=0;i<a.length;i++){

        }
        for (int num : a){
            if (num<min){
                min=num;
            }
        }
        System.out.println("Enter the min value "+min);
    }
}

// 3. Average of Array Elements

class Array2{
    public static void main(String[] args) {
         int []a={3,5,7,9};
         int sum=0;

         for (int i=0;i<a.length;i++){

         }
         for(int num : a){
            sum+=num;
         }
         double Average = (double) sum / a.length;
         System.out.println(+Average);
    }
}

// 3. Average of Array Elements
 
class Array3{
    public static void main(String[] args) {
        int []a={2,3,4,5,6,};
        int evencount=0;
        int oddcount=0;
           for (int i=0;i<a.length;i++){

           }
           for (int num : a){
            if (num %2==0){
                evencount++;
            }
            else {
                oddcount++;
            }
           }
           System.out.println("Enter the evencount "+evencount);
           System.out.println("Enter the oddcount "+oddcount);
    }
}

// 5. Find Second Largest Element

 class Array4{
    public static void main(String[] args) {
        int n=0;
        int []a={12, 10, 1, 34, 35};
        
           for (int i=0;i<a.length;i++){

           }
           
           int i=0,j=a.length-1,temp;

           while (i<j) {
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
                  i++;
                  j--;
           }
           for (int num : a){
                 System.out.println(+num);
           }
           if (a[0]==a[1]){
            while (a.length<n) {
                
                if(a[1]!=a[n])
                {
                    System.out.println("Enter the Second Largest Element " + a[n]);
                    break;
                 }
                 n++;
                 
                }
                
            }
            else {
                    System.out.println(" Enter the Second Largest Element " +a[1]);
                  
                 }
            
           }
        }



// 6. Sum of Elements at Even Indices
class Array10
{
    public static void main(String[] args)
    {
        int[] a = {2, 4, 6, 8, 10};    
        int sum = 0;
        for(int i= 0;i<a.length;i++)
        {
            if(i == 0 || i%2 == 0)
            {
                sum = sum + a[i];
            }
        }
        System.out.println("The sum of elements at even indices in an array: "+sum);
    }
}

 // 7. Merge Two Arrays
 
 class Array5{
    public static void main(String[] args) {
        int [] a={1, 3, 5};
        int [] b={2, 4, 6};
        int [] c= new int[a.length + b.length];
   
         for (int i=0;i<a.length;i++){
            c[i]=a[i];
         }
         for (int i=0;i<b.length;i++){
            c[i+a.length]=b[i];
         }
         for (int num : c){
            System.out.println(+num);
         }
    }
 }
 // 8. Sort an Array

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

        // 9. Frequency of Elements 

class Array7{
    public static void main(String[] args) {
        int []a={2, 3, 2, 5, 3};
        int key=1;
        for (int i =0;i<a.length;i++){

        }
        for (int num : a){
            if (key==num){
                System.out.println("Enter Frequency of Elements  " +num);
                break;
            }
            else {
                System.out.println("Enter not  Frequency of Elements  " );
                break;
            }

        }
    }
}

// 10. Remove Duplicates from Array

 class Array8{
    public static void main(String[] args) {
        int [] a={1, 2, 2, 3, 4, 4, 5};

            for(int i = 0;i<a.length;i++)
            {
                int count =0;
                for(int j = i+1;j<a.length;j++)
                {
                    if(a[i]==a[j])
                    {
                        count++;
                    }
                }
                if(count == 0)
                {
                    System.out.println(a[i]);
                }
            }
        }
}    


 