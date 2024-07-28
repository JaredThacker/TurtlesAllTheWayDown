import java.time.Duration;
import java.time.Instant;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {

    int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // recursive approach
    public int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

    //non-recursive approach
    public int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    // Compute length of LCS for all subproblems.
    public String lcs(String x, String y) {
        int m = x.length(), n = y.length();
        int[][] opt = new int[m+1][n+1];
        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if (x.charAt(i) == y.charAt(j)) {
                    opt[i][j] = opt[i+1][j+1] + 1;
                }
                else {
                    opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
                }
            }
        }

        // Recover LCS itself.
        String lcs = "";
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (x.charAt(i) == y.charAt(j)) {
                lcs += x.charAt(i);
                i++;
                j++;
            }
            else if (opt[i+1][j] >= opt[i][j+1]) i++;
            else
                j++;
        }
        return lcs;
    }

    public static void main(String[] args) {
        Turtles turtles = new Turtles();

        long timeElapsed = 0;
        for (int i = 0; i < 100; i++) {
            Instant start = Instant.now();
            turtles.gcd(123456789, 987654321);
            Instant finish = Instant.now();
            timeElapsed += Duration.between(start, finish).toNanos();
        }
        System.out.println(timeElapsed);

        long timeElapsed2 = 0;
        for (int i = 0; i < 100; i++) {
            Instant start2 = Instant.now();
            turtles.gcd2(123456789, 987654321);
            Instant finish2 = Instant.now();
            timeElapsed2 += Duration.between(start2, finish2).toNanos();
        }
        System.out.println(timeElapsed2);
    }
}
