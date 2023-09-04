//[น้มุ Java] 10950: A+B - 3 >> 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj10950_2{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int t;
		StringBuilder sb = new StringBuilder();

		t=Integer.parseInt(br.readLine());

		for(int i=0;i<t;i++){
			st = new StringTokenizer(br.readLine());
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
}