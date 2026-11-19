import java.util.*;

public class TwoSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int leftIdx = 0, rightIdx = 0;
        long leftSum = 0, rightSum = 0;
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        for (int i = n; i >= 1; i--) {
            if (leftSum <= rightSum) {
                leftSum += i;
                leftIdx++;
                left.append(i + " ");
            } else {
                rightSum += i;
                rightIdx++;
                right.append(i + " ");
            }
        }
        
        if (leftSum == rightSum) {
            System.out.println("YES");
            System.out.println(leftIdx);
            System.out.println(left.toString());
            System.out.println(rightIdx);
            System.out.println(right.toString());
        } else System.out.println("NO");

        sc.close();
    }
}