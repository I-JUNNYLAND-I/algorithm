import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int H = Integer.parseInt(st.nextToken());	// 세로
		int W = Integer.parseInt(st.nextToken());	// 가로
		char[][] cArr = new char[H][W];
		for(int i=0; i<H; i++) {
			String str = bf.readLine();
			for(int j=0; j<W; j++) {
				cArr[i][j] = str.charAt(j);
			}
		}
		
		for(int i=0; i<H; i++) {
			int time = 0;
			for(int j=0; j<W; j++) {
				
				/* 현재 'c'일경우 -> time 초기화, 0 출력 */
				if(cArr[i][j] == 'c') {
					time = 1;
					sb.append("0 ");
				}
				
				/* 현재 '.'일경우 -> 전에 'c'가 없을경우 -> -1출력, 'c'가 있었을경우 -> time 출력 */
				else if(cArr[i][j] == '.') {
					if(time == 0) {
						sb.append("-1 ");
					}
					else {
						sb.append(time + " ");
						time ++;
					}
				}
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bf.close();
		bw.close();
	}

}