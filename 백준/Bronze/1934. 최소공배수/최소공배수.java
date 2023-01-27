import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // number of test cases
        for (int i = 0; i < t; i++) {
            String[] nums = br.readLine().split(" ");
            int x = Integer.parseInt(nums[0]);
            int y = Integer.parseInt(nums[1]);
            System.out.println(x * y / gcd(x, y));
        }
    }
    
    private static int gcd(int x, int y) {
        if (y == 0 ) return x;
        else return gcd(y, x % y);
    }
}
