import java.util.*;

public class gudu19 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        
        int marks[]=new int[size];

        // int marks[]={68,39,30};
        //int [] marks = new int[3];
        //marks[0]=96;
        //marks[1]=90;
        //marks[2]=100;

        for(int i = 0;i<size;i++){
            marks[i] = sc.nextInt();
        }

        for(int i = 0;i<size  ;i++){
            System.out.println(marks[i]);
      }

      //int i = 0;
     // while (i<size) {
       // System.out.println(number[i]);
       // i++;
        
      //}
      
    }
}
