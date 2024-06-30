import java.util.Scanner;

public class ClimbingStairs {
    public static int countWays(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        
        int[] ways = new int[n + 1];
        ways[0] = 1;
        ways[1] = 1;
        ways[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 3];
        }
        
        return ways[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int steps = scanner.nextInt();
        scanner.close();

        System.out.println("Number of distinct ways: " + countWays(steps));
    }
}
