import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int e = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int m = Integer.parseInt(input[2]);
        int ecopy = 1;
        int scopy = 1;
        int mcopy = 1;
        int count = 1;
        while (true) {
            if (e == ecopy && s == scopy && m == mcopy) break;
            ecopy++; scopy++; mcopy++; count++;
            if (ecopy > 15) ecopy = 1;
            if (scopy > 28) scopy = 1;
            if (mcopy > 19) mcopy = 1;
        } 
        System.out.println(count);
    }
}