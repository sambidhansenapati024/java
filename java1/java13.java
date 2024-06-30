import java.util.*;

public class java13 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       for(int i= 1; i<=a;i++){
        int spaces = a-i;
        for(int j=1; j<=spaces;j++){
            System.out.print(" ");
            }
            for(int j =1; j<=a;j++){
                System.out.print("*");
            }

            System.out.println();
        }
       } 
    }

