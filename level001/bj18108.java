// [백준 Java] 18108: 1998년생인 내가 태국에서는 2541년생?!
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj18108{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int bYear = Integer.parseInt(br.readLine());

		System.out.println(bYear - 543);

	}
}