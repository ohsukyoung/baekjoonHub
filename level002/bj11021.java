//[น้มุ Java] 11021: A+B - 7
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj11021{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());

		for(int i=1; i<=num; i++){
			st = new StringTokenizer(br.readLine()," ");
			sb.append("Case #"+i+": ").append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append("\n");
		}
		System.out.println(sb);
	}
}