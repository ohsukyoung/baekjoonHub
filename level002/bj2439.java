// [백준 Java] 2439: 별 찍기 - 2
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj2439{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());

		for(int i=1; i<=n; i++){		//열
			for(int j=1; j<=n-i; j++){	//공백			
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){	//별
				System.out.print("*");
			}
			System.out.println();
		}
	}
}