public class Reverse {
    public static void main(String[] args) {
       int count=0;
        for (int i=100;i>=1;i--){
          System.out.print(" " +i);
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
                
            }
    }

}
