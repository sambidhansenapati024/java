// Take an array as a input from  the user. search for a given number x and print the index at which it occurs.


import java.util.*;

public class gudu20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();

        int marks[]= new int[size];

        for(int i =0; i<size;i++){  
            marks[i]=sc.nextInt();
        }

        int x = sc.nextInt();

        for(int i=0;i<marks.length;i++){
            if (marks[i]==x) {
                System.out.println(" x is found at index :" + i);
                
            }
        }

    }
}
