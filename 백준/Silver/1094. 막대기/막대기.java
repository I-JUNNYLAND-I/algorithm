import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int count = 0;
        for (char c : Integer.toBinaryString(input).toCharArray()) {
            if (c == '1') count++;
        }
        System.out.println(count);
    }
}