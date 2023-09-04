// [πÈ¡ÿ Java] 11382: ≤ø∏∂ ¡§πŒ

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj11382{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long num1 = Long.parseLong(st.nextToken());
		long num2 = Long.parseLong(st.nextToken());
		long num3 = Long.parseLong(st.nextToken());

		System.out.println(num1 + num2 + num3);
	}
}