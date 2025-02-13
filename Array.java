import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num =new int[10];

        for (int i=0;i<=10;i++){
            num[i]= scan .nextInt();
        }
         for (int i=0;i<=10;i++){
         System.out.println(num [i]);
        }

    }
}

class Array1 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50}; 
        
    for (int num : numbers) {
            System.out.print(num + " ");               // Arrry intiger 
        }
    }
}


class Array3 {
    public static void main(String[] args) {
        
        int[] numbers = {15, 3, 25, 7, 19, 1};

        
        int min = numbers[0];
        int max = numbers[0];

        
        for (int num : numbers) {
            if (num < min) {                         // min or max 
                min = num;
            }
            if (num > max) { 
                max = num;
            }
        }

        
        System.out.println( + min);
        System.out.println( + max);
    }
}


class Array4{
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }                                                      // sum = average

        double average = (double) sum / numbers.length;

        System.out.println( + sum);
        System.out.println(+ average);
    }
}
 



 class  Array5{
    public static void main(String[] args) {
        String[] names = {"BOT", "SELVIN", "RP", "CAT"};
                                
        for (String name : names) {
            System.out.println(name);                                  // StringArray
        }
    }
}





class Array6 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int num : numbers) {
            sum += num;                                 // SumArray
        }

        System.out.println( + sum);
    }
}


class Array7 {
    public static void main(String[] args) {
        int[] numbers = {3, 8, 12, 5, 20, 7, 14};
      
        for (int num : numbers) {                           // PrintEvenNumbers
            if (num % 2 == 0) { 
                System.out.println(num);
            }
        }
    }
}


class Array8 {
    public static void main(String[] args) {
        int[] numbers = {18, 45, 32, 67, 29, 90, 21};
        int largest = numbers[0]; 

        for (int num : numbers) {
            if (num > largest) {            // largest number 
                largest = num; 
            }
        }

        System.out.println( + largest);
    }
}

class Array9 {
    public static void main(String[] args) {

   char[] characters = {'a', 'b', 'e', 'f', 'i', 'o', 'u', 'z'};

for (char ch : characters) {
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch =='A' ) {
        System.out.print(ch + " ");
    }
}
System.out.println();

    }
}


class Array10 {
    public static void main(String[] args) {

int[] marks = {85, 90, 78, 88, 76, 95};
        int total = 5;
        for (int mark : marks) {             
            total += mark;
        }
        double average = (double) total / marks.length;
        System.out.println( + average);
    }
}


class Array11 {
    public static void main(String[] args) {

        String[] words = {"Apple", "Banana", "Avocado", "Cherry", "Apricot"};
        System.out.println("\nWords starting with 'A':");

        for (String word : words) {
            if (word.startsWith("A")) {

                System.out.println(word);
            }
        }
    }
}



