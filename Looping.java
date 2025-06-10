import java.util.Scanner;
public class Looping{
    public static void main(String[] args) {
    }
    }
/*
     
         1 
       2 3 4 
     5 6 7 8 9 
10 11 12 13 14 15 16 

*/

class Number 
{

    public static void main(String[] args) 
    {
         int count =1;
         int n =4;
    
          for (int i=0;i<n;i++)
       {
              for(int j=0;j<n+i;j++)
            {
               if (j<(n-i-1))
               {
                   System.out.print("  ");
        
                } 
                else
                {
                   System.out.print(count ++ + " ");
                }
                    

           }
            System.out.println();
        }
    }
}
/*
      1 
    2 2 2
  3 3 3 3 3
4 4 4 4 4 4 4
 */
class Number1 
{

public static void main(String[] args) 
{
     int n =4;

      for (int i=1;i<=n;i++)
   {
          for(int j=1;j<=n+i-1;j++)
        {
           if (j<=(n-i))
           {
               System.out.print("  ");
    
            } 
            else
            {
               System.out.print(i + " ");
            }
                

       }
        System.out.println();
    }
}
}

    

  
/*
        1 
      2 1
    3 2 1
  4 3 2 1
5 4 3 2 1
 */
class Pat13 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the number of rows: ");
      int n = scanner.nextInt();
      int count = 1;
      for (int i = 0; i < n; i++) 
      {
          count = 1+i;
          for (int j = 0; j < n; j++)
          {
             if(j<(n-i-1))
             {
              System.out.print("  ");
             }
             else
             {
              System.out.print(count-- + " ");
             }    
          }
          System.out.println("");     
      }     
  }
}
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
class Pat14 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the number of rows: ");
      int n = scanner.nextInt();
      int count = 1;
      for (int i = 0; i < n; i++) 
      {
          count = 1;
          for (int j = 0; j < n; j++)
          {
             if(j<(i+1))
             {
              System.out.print(count++ + " ");
             }
             else
             {
              System.out.print("  ");
             }   
          }
          System.out.println("");
      }     
  }
}
/*
        1 
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
*/
class Pat15 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the number of rows: ");
      int n = scanner.nextInt();
      int count = 1;
      int add;
      for (int i = 5; i < n; i++) 
      {
          count = 1+i;
          add = 1;
          for (int j = 0; j < n+i; j++)
          {
             if(j<(n-i-1))
             {
              System.out.print("  ");
             }
             else if(j<n)
             {
              System.out.print(count-- + " ");
             }
             else if(j>=n)
             {
              System.out.print(++add + " ");
             }   
          }
          System.out.println("");
      }     
  }
}


 class Diamond {
  public static void main(String[] args) {
      int n = 4; 
      for (int i = 1; i <= 2 * n - 1; i++) { 
          int limit;
          
         
          if (i <= n) {
              limit = i; 
          } else {
              limit  = 2 * n - i; 
          }

        
          for (int j = 1; j <= n - limit; j++) {
              System.out.print(" ");
          }

   
          for (int j = 1; j <= limit; j++) {
              System.out.print(j + " ");
          }

          System.out.println();
      }
  }
}
/*
 

    1 
   1 2
  1 2 3 
 1 2 3 4
1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1
*/


 class Pat16 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the number of rows: ");
      int n = scanner.nextInt();
      for (int i = 0; i < n; i++) 
      {
          for (int j = 0; j < n; j++)
          {
             if(j<(n-i-1))
             {
              System.out.print("  ");
             }
             else
             {
              System.out.print(j-- + " ");
             }    
          }
          System.out.println("");     
      }     
  }
}



class Pat17{
public static void main(String[] args) {
Scanner java = new Scanner(System.in);
  System.out.println("Enter the value for n: ");
  int n = java.nextInt();
  for (int i=0;i<n;i++)
  {
      {
          for(int j=0;j<2*n-i-1;j++)
          {
              if (j<i)
              {
                  System.out.print("  ");
                 
              } 
              else 
              {
                  System.out.print( i );
              }
          }
      }
      System.out.println();
  }

}
}



 class Pat18 {
  public static void main(String[] args) {
      
      int n = 5;  

      
      for (int i = 1; i <= n; i++) {
          
          for (int j = 1; j <= i; j++) {
              
              if ((i + j) % 2 == 0) {
                  System.out.print("1 ");  
              } else {
                  System.out.print("0 ");
              }
          }
          System.out.println();  
      }
  }
}

/* 
   
    1 
    0 1 
    1 0 1 
    0 1 0 1 
    1 0 1 0 1 
    */


class Pat19{
    public static void main(String[] args) {
        int n=5;
        for (int i=1,p=1;i<=n;i++,p++){
            for(int j=1;j<=i;j++ ){
                System.out.print(p+" ");

            }
        System.out.println();
        }
    }
}




/*
*           * 
  *       *
    *   *
      *
    *   *
  *       *
*           *
 */
class Pat20{

    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        for(int i=1;i<=n;i++)
        {
          
            for(int j = 1;j<=n; j++)
            {
                if(i==j||i+j==n+1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
/*
1           1 
  2       2   
    3   3     
      4       
    5   5     
  6       6   
7           7 
 */
class Pat21
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        for(int i=1;i<=n;i++)
        {
          
            for(int j = 1;j<=n; j++)
            {
                if(i==j||i+j==n+1)
                {
                    System.out.print(i+ " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
/*
A           A 
  B       B
    C   C
      D
    E   E
  F       F
G           G 
 */
class Pat22
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        char n = java.next().charAt(0);
        for(char i='A';i<=n;i++)
        {
          
            for(char j = 'A';j<=n; j++)
            {
                if(i==j||i+j==n+'A')
                {
                    System.out.print(i + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}


          
  /*
T                   T 
  I               I   
    R           R     
      U       U       
        N   N
          E
        L   L
      V       V       
    E           E     
  L               L
I                   I
 */
class Pat23
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        String a = "TIRUNELVELI";
        int s = a.length();
        for( int i=0;i<s;i++)
        {
          
            for(int j = 0;j<s; j++)
            {
                if(i==j||i+j==s-1)
                {
                    System.out.print(a.charAt(i) + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
/*
T                   I 
  I               L
    R           E
      U       V
        N   L
          E
        N   L
      U       V       
    R           E
  I               L
T                   I
 */
class Pat24
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        String a = "TIRUNELVELI";
        int s = a.length();
        for( int i=0;i<s;i++)
        {
          
            for(int j = 0;j<s; j++)
            {
                if(i==j||i+j==s-1)
                {
                    System.out.print(a.charAt(j) + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
/*
Z O H O 
    H
  O
Z O H O
 */
class Pat25
{
    public static void main(String[] args) 
    {
        String a = "ZOHOCRPLIMITED";
        for( int i=0;i<5;i++)
        {
          
            for(int j = 0;j<4; j++)
            {
                if(i==0||i+j==4-1||i==3)
                {
                    System.out.print(a.charAt(j) + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
/*
Z O H O C O R P   
              O
            R
          A
        T
      I
    O
  I
N L I M I T E D
 */
class Pat26
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        String a = "ZOHOCORP ORATIOINLIMITED  ";
        int count = 0;
        for( int i=0;i<n;i++)
        {
          
            for(int j = 0;j<n; j++)
            {
                if(i==0||i+j==n-1||i==(n-1))
                {
                    System.out.print(a.charAt(count++) + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}        
          

 






























