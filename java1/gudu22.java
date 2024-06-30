import java.util.*;

public class gudu22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int marks [] = new int[number];

        for(int i =0;i<marks.length;i++){
            marks[i]= sc.nextInt();
        }
//            for(int i = 0; i<marks.length;i++){
//                System.out.println(marks[i]);
//          }
            int x = sc.nextInt();

            for(int i=0;i<marks.length;i++){
                if (marks[i]== x) {
                    System.out.println("The number is found at:" + i);
                    
                }

            }
            
    }
}

