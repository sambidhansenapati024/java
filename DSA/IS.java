import java.util.*;

public class IS {
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={7,9,5,1,2};

        //insertion

        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
           while (j>=0 && current<arr[j]) {
            int temp= current;
            arr[j+1]=arr[j];
            arr[j]=temp;
            j--;
            
           }

           arr[j+1]=current;

           
        }
        printArray(arr);
        
    }
}
