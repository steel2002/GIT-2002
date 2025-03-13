import java.util.*;
/*After Greating Transporst :
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4 */
public class Mularr {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the row col values :");             // Transporst 
        int row = scan.nextInt();
        int col = scan . nextInt();
        int [][] arr=new int [row][col];

        System.out.print("Enter the Materix value :");

        for (int i=0;i<row;i++){

            for (int j=0;j<col;j++){
                arr[i][j] = scan.nextInt(); 
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("After Greating Transporst :");
        for (int j=0;j<col;j++){
            
            for (int i=0;i<row;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
}

class Mularr1{
    public static void main(String[] args) {
        int [][] arr= {{1,2,3},{4,5,6},{7,8,9} };
        int [][]tr=new int [3][3];
        for (int i=0;i<3;i++){

            for (int j=0;j<3;j++){

                tr[i][j]=arr[j][i];

            }
            
        }
        System.out.println("Printing Transpord Array : ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(tr[i][j]+" ");
    }
    System.out.println(" ");
}
   
}
}

/*To print a spiral in the format:
1  2  3  4
12 13 14 5
11 16 15 6
10 9  8  7
*/
class Mularr2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row Col Value :");
        int row = scan.nextInt();
        int col = scan.nextInt();
        System.out.println("Enter the User Input :");
        int n= scan.nextInt();
        int [][] arr = new int[row][col];
        int value=1;
        int mincol=0,minrow=0,maxcol=col-1,maxrow=row-1;
        while (value<=n) {
        for(int j=mincol;j<=maxcol && value<=n;j++){
            arr[minrow][j]=value;
            value++;
        }
        for (int i=minrow+1;i<=maxrow && value <=n;i++){
            arr[i][maxcol]=value;
            value++;
        }
        for(int j=maxcol-1;j>=mincol && value <=n;j--){
            arr[maxrow][j]=value;
            value++;
        }
        for(int i=maxrow-1;i>minrow && value <=n;i--){
            arr[i][mincol]=value;
            value++;
        }
        mincol++;
        minrow++;
        maxcol--;
        maxrow--;

    }
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(arr[i][j]+"\t");
        }
        System.out.println(" ");
    }
}
}

/* TO PRINT THE MATRIX IN SNAKE FORMAT
1       2       3       4       5
10      9       8       7       6
11      12      13      14      15
20      19      18      17      16
21      22      23      24      25
*/

class Mularr3{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Row Col Value :");
        int row =scan.nextInt();
        int col=scan.nextInt();
        System.out.println("Enter the user Input :");
        int n= scan .nextInt();
        int [][] arr=new int[row][col];
        int value=1;
        int mincol=0,minrow=0,maxrow=row-1,maxcol=col-1;
        while (value<=n) {
            for(int j=mincol;j<=maxcol && value<=n;j++){
                arr[minrow][j]=value;
                value++;
            }
            minrow++;
            for(int i=maxcol;i>=mincol && value <=n;i--){
                arr[minrow][i]=value;
                value++;
            }
            minrow++;
            
        }
        for(int j=0;j<row;j++){
            for(int i=0;i<col;i++){
                System.out.print(arr[j][i]+"\t");
            }
            System.out.println(" ");
        }
        }
}
//Reverse a Matrix

/*   13 14 15 16
     16 15 14 13
     12 11 10 9
      8 7 6 5
      4 3 2 1 
*/

class Mularr4{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter tha Row Col Value :");
        int row=scan.nextInt();
        int col=scan.nextInt();
        int [][]arr=new int[row][col];
        int [][] rev=new int[row ][col];
        System.out.println("Enter the user Input :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0,k=row-1;i<row && k>=0;i++,k--){
            for (int j=0,l=col-1;j<col && l>=0;j++,l--){
                rev[k][l]=arr[i][j];
            }
        }
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                System.out.print(rev[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}

//Rotate a matrix 90 % 
/*After 90% :
7 4 1
8 5 2
9 6 3 */

class Mularr5{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println( "Enter the Row col value : ");
        int row =scan.nextInt();
        int col=scan.nextInt();
        int [][]arr=new int[row][col];
        int [][] tra=new int[col][row];
        System.out.println( "Enter the user input : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=scan.nextInt();

            }
        }
        System.out.println("After Getting transposed: ");
        for(int i=0;i<col;i++){

            for(int j=0;j<row;j++){

                tra[i][j]= arr[j][i];
                System.out.print(tra[i][j] + " ");
            }
            System.out.println(" ");
        }
        // Rotating the matrix by 90 degrees clockwise

        System.out.println("After 90% rotation : ");
        for(int i=0;i<col;i++){
            for(int j=0,k=row-1;j<k;j++,k--){

                int temp=tra[i][j];
                tra[i][j]=tra[i][k];
                tra[i][k]=temp;
            }
           
        }
        for (int i=0;i<tra.length;i++){
            for(int j=0;j<tra[i].length;j++){
                System.out.print(tra[i][j]+" ");
            }
            System.out.println(" ");
                
        }
    }
}

//To find the Average of Array Elements using arrays and functions.
/*10 20 30 40 50
The average of the given array: 30  All Input add + to divid / = Average */ 

class Mularr6{
    static int Met(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
           sum=sum+arr[i];
        }
        return sum/arr.length;

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=scan.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the values for the array: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("The average of the given array: "+ Met(arr));
    }
}

//To find the sum  of Array Elements using arrays and functions.

/*  Enter the A of Matrixs :
    1 2 3 4
    Enter the B matrixs :
    1 2 3 4
 
2       4
6       8 */

class Mularr7{
     static int [][] Met(int[][]A,int[][]B, int[][]C){
        for(int i=0;i<C.length;i++){
           for(int j=0;j<C[i].length;j++){
              C[i][j]=A[i][j]+B[i][j];
           }
        }
        return C;

     }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the row col value :");
        int row =scan.nextInt();
        int col =scan.nextInt();
        int [][] A = new int[row][col];
        int [][] B = new int[row][col];
        int [][] C = new int[row][col];
         System.out.println("Enter the A of Matrixs :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                A[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter the B matrixs :");
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                B[i][j]=scan.nextInt();
            }

        }
        Met(A,B,C);

        for(int i=0;i<C.length;i++){
            for(int j=0;j<C[i].length;j++){
                System.out.print(C[i][j]+"\t");
            }
            System.out.println("");
        }
        
    }
}
//To multiply Array Elements using arrays and functions.
/*Enter the A :
1 2 3
4 5 6
Enter the B :
1 2
3 4
5 6
22      28       
49      64 */
class Mularr8{
    static void Met(int [][]A,int [][]B,int[][]C){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B[i].length;j++){
                for(int k=0;k<A[i].length;k++){
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        for(int i=0;i<C.length;i++){
            for(int j=0;j<C[i].length;j++){
                System.out.print(C[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the row1 and col1 value :");
        int row1=scan.nextInt();
        int col1=scan.nextInt();
        System.out.println("Enter the row2 and col2 value :");
        int row2=scan.nextInt();
        int col2=scan.nextInt();
        int [][] A=new int[row1][col1];
        int [][] B = new int[row2][col2];
        int [][] C = new int[row1][col2];

         System.out.println("Enter the A :");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                A[i][j]=scan.nextInt();

            }
        }
        System.out.println("Enter the B :");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                B[i][j]=scan.nextInt();
            }
        }
        Met(A, B, C);
    }
}

//Find maximum element in the given array
/*
Enter the Value :
3
20 30 40
Enter the Max Number :40
 */
class Mularr9{
 static int Met(int []arr){
    int max=arr[0];
    for(int i=1;i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i];

        }
    }
    return max;
 }
public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter the size  :");
    int n=scan.nextInt();
    int [] arr=new int[n];
    System.out.println("Enter the Array value :");
    for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }
    System.out.println("Enter the Max Number :"+Met(arr));
}
}
//Program that searches for an element in an array and return its position
/*
Enter the Array value :
10 20 30 0
Enter the element you want search in the given array:
0
This element  0 is in the Position  3
 */
class  Mularr10{
    static int Met(int []arr ,int m){
        for(int i=0;i<arr.length;i++ ){
            if(arr[i]==m){
                System.out.println("This element  " + m + " is in the Position  "+i);
                continue;
            }
        }
        return 0;
    }
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Array size :");
    int n= scan.nextInt();
    int [] arr=new int[n];
    System.out.println("Enter the Array value :");
    for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();

    }
    System.out.println("Enter the element you want search in the given array: ");
    int m=scan.nextInt();
    Met(arr,m);
 }
}

//To calculate the sum of diagonal elements
/*
Enter the Array value :
1 2 3
4 5 6
6 7 8
The sum of the diagnols in the given matrix: 14
 */
class Mularr11{
    static int Met(int [][]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i+j==arr.length-1){
                    sum=sum+arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the row col size  :");
        int row=scan.nextInt();
        int col=scan.nextInt();
        int [][]arr=new int[row][col];
        System.out.println("Enter the Array value :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=scan.nextInt();
            }

        }
        System.out.println("The sum of the diagnols in the given matrix: "+Met(arr));
    }
}

//Funtion to calculate the sum of elements
/*
Enter the Array value :
1 2 3
4 5 6
7 8 9
The sum of 0 row: 6
The sum of 1 row: 15
The sum of 2 row: 24
 */
class Mularr12{
    static int[] Met(int[][]arr){
        
        int []res=new int [arr.length];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
          res[i]=sum;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the row and col value  :");
        int row =scan.nextInt();
        int col=scan.nextInt();
        int [][] arr=new int[row][col];
        System.out.println("Enter the Array value :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=scan.nextInt();

            }

        }

        int [] res=Met(arr);
        for(int i=0;i<res.length;i++){
            System.out.println("The sum of "+ i + " row: " + res[i]);
        }
      
    }
}
//Funtion to count even and odd numbers in an array;
/*
Enter the Value :
1 2 3
The total number of even numbers: 1
The total number of odd numbers: 2
 */
class Mularr13{
    static int [] Met(int []arr){
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        return new int []{even,odd};
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Size Of Array ");
        int n=scan.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the Value :");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int[] res=Met(arr);
        System.out.println("The total number of even numbers: "+ res[0]);
        System.out.println("The total number of odd numbers: "+ res[1]);
    }
}

//To print the given 2x2 array in spiral order
/*
Enter the Array value :
1 2
3 4
1 
2
4
3 
 */
class Mularr14{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the row and col value :");
        int row=scan.nextInt();
        int col=scan.nextInt();
        int [][] arr=new int[row][col];
        System.out.println("Enter the Array value :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        int total=row*col;
        int count=0,mincol=0,minrow=0,maxrow=row-1,maxcol=col-1;
        while (count<total) {
            for(int j=mincol;j<=maxcol && count<total;j++){
                System.out.println(arr[minrow][j]+" ");
                count++;
            }
            for(int i=minrow+1;i<=maxrow && count<total;i++){
                System.out.println(arr[i][maxcol]);
                count++;
            }
            for(int j=maxcol-1;j>=mincol && count<total;j--){
                System.out.println(arr[maxrow][j]+" ");
                count++;

            }
            mincol++;
            minrow++;
            maxcol--;
            maxrow--;
            
        }
    }
}
