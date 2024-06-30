public class PujaLovesGudu {
    public static int[] Gudu(int[] arr, int k) {
        int n= arr.length;
        int[] result =new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            int max=arr[i];

            for(int j= 1;j<k;j++){
                if (arr[i+j]>max) {
                    max=arr[i+j];
                }
            }
            result[i]=max;
        }
        return result; 
    }
   
    
    public static void main(String[] args) {
        int[]arr={2,4,7,1,6,3};
        int k=3;
        int[] maxElements = Gudu(arr, k);
        for (int maxElement : maxElements) {
            System.out.print(maxElement+" ");
            
        }
    }
}



