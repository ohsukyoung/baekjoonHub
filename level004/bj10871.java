import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj10871{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 변수 선언 및 입력받기-1(첫째줄)
		int n = Integer.parseInt(st.nextToken());	// 받을 정수 갯수
		int x = Integer.parseInt(st.nextToken());	// 기준 정수
		
		// 배열 선언
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// x보다 작은수 출력
		for(int i=0; i<arr.length; i++){
			if(arr[i]<x)
				System.out.printf("%d ",arr[i]);
		}
		
	}
}