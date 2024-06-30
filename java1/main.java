import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of steps:");
        int n = scanner.nextInt();
        scanner.close();
        
        int ways = 1; // Initialize to 1 for n <= 1
        if (n > 2) {
            ways = 2; // For n = 2
        }
        if (n >= 3) {
            int[] dp = new int[n + 1];
            dp[0] = dp[1] = 1;
            dp[2] = 1;
            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 3];
            }
            ways = dp[n];
        }
        
        System.out.println("Number of ways to climb " + n + " steps: " + ways);
    }
}
