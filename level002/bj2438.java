// [백준 Java] 2438: 별 찍기 - 1
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class bj2438{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());

		for(int i=1; i<=n; i++){		//열
			for(int j=1; j<=i; j++){	//공백			
				System.out.print("*");
			}
			System.out.println();
		}
	}
}