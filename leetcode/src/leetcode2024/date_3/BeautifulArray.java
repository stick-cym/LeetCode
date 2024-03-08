package leetcode2024.date_3;

import java.util.HashSet;
import java.util.Set;

public class BeautifulArray {
    public static void main(String[] args) {
        System.out.println(minimumPossibleSum(63623,82276));
    }

    public static int minimumPossibleSum(int n, int target) {
            final int MOD = (int) 1e9 + 7;
            int m = target / 2;
            if (n <= m) {
                return (int) ((long) (1 + n) * n / 2 % MOD);
            }
            return (int) (((long) (1 + m) * m / 2 +
                    ((long) target + target + (n - m) - 1) * (n - m) / 2) % MOD);
        }
    }

