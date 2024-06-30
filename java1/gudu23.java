import java.util.*;

public class gudu23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Rows:");
        int rows = sc.nextInt();

        System.out.println("Enter number of Columns:");
        int cols = sc.nextInt();

        int Matrix [][] = new int[rows][cols];

        
        System.out.println("Enter Elements:");
        for(int i= 0; i<rows;i++){
            for(int j =0;j<cols;j++){
                Matrix[i][j]= sc.nextInt();
            }
        }
//        System.out.println("Enter the number to Find:");
//        int x = sc.nextInt();

//        for(int i = 0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                if (Matrix[i][j]==x) {
  //                  System.out.println("The  number is found at ("+i+ ","+j+ ")");
                   
    //            }
     //       }
     //   }

    System.out.println("The Array is");

        for(int i = 0;i<rows;i++){
           for(int j = 0; j<cols;j++){
               System.out.print(Matrix[i][j]+" ");
                
           }
           System.out.println();
        }
        


    }
      
} 

