import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); // 총 인원 n명
        int k = Integer.parseInt(input[1]); // 제거될 순서 k
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> answer = new LinkedList<>();
        for (int i = 0; i < n; i++) queue.add(i + 1);
        int count = 0;
        while (answer.size() < n) {
            int temp = queue.poll();
            count++;
            if (count % k == 0) answer.add(temp);
            else queue.add(temp);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        count = 0;
        while (count < n - 1) {
            sb.append(answer.poll() + ", ");
            count++;
        }
        sb.append(answer.poll() + ">");
        System.out.println(sb.toString());
    }
}