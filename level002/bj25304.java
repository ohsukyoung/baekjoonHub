import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj25304{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int x_toal = Integer.parseInt(br.readLine());	//-- 총금액
		int n_total = Integer.parseInt(br.readLine());	//-- 물건종류수
		int x_count = 0;	//-- 물건 금액 담을 공간

		StringBuilder sb = new StringBuilder();

		for(int i=1; i<=n_total; i++){
			st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());	//-- 구매한 금액
			int n = Integer.parseInt(st.nextToken());	//-- 구매한 종류수

			x_count += x*n;
		}

		if(x_toal == x_count)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}