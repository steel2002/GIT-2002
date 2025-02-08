 class Leftside {
        public static void main(String[] args) {
            int n = 4; // 
    
            for (int i = 1; i <= n; i++) {
               
                for (int j = 1; j <= n + i - 1; j++) {
                    if (j <= n - i) {
                        System.out.print("  "); 
                    } 
                    else if ((n-j)> 0) {
                    System.out.print((n - j) + 1 + " ");}
                    else{
                        System.out.print(-(n - j) + 1 + " ");
                    }
                }
                            
                System.out.println();
            }
        }
    }









            
            

                
            
        
    
    
    

 
