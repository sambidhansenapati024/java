import java.util.*;

public class gudu21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] number = new int[rows][columns];

        for(int i = 0; i <rows;i++){
            for(int j = 0;j<columns;j++){
                number[i][j]= sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                if (number[i][j]==x) {
                    System.out.println("The number is found at : ("+i+ ","+j+ ")");  
                    
                }
            }
        } 
                                                            
                                                                                                        
     //   for(int i = 0; i< rows;i++){
       //     for(int j=0;j<columns;j++){
         //       System.out.print(number[i][j]+ " ");
           // }
           // System.out.println();
        //}
  
    }
}
   