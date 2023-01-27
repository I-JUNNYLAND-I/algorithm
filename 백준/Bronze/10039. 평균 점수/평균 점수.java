import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
        a = a > 40 ? a : 40;
		int b = Integer.parseInt(br.readLine());
        b = b > 40 ? b : 40;
        int c = Integer.parseInt(br.readLine());
        c = c > 40 ? c : 40;
        int d = Integer.parseInt(br.readLine());
        d = d > 40 ? d : 40;
        int e = Integer.parseInt(br.readLine());
        e = e > 40 ? e : 40;
        System.out.println((a + b + c + d + e) / 5);
	}
}