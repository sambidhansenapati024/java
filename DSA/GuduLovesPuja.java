public class GuduLovesPuja {

    public static int countSubarraysWithSum(int[] nums, int targetSum) {
        int totalSubarrays = 0;

        // Iterate through each element of the array
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            // Consider all subarrays starting from index i
            for (int j = i; j < nums.length; j++) {
                sum += nums[j]; // Add the current element to the sum

                // Check if the sum equals the target sum
                if (sum == targetSum) {
                    totalSubarrays++; // Increment the count of subarrays
                    // Print the subarray
                    System.out.print("Subarray: [");
                    for (int k = i; k <= j; k++) {
                        System.out.print(nums[k]);
                        if (k < j) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println("]");
                }
            }
        }

        return totalSubarrays; // Return the total count of subarrays
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -7, 1, 3, 3, 1, 4};
        int targetSum = 7;
        System.out.println("Total number of subarrays with sum 7: " + countSubarraysWithSum(nums, targetSum));
    }
}