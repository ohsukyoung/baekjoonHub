import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj10818{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// 변수 선언 및 입력받기-1(첫째줄)
		int n = Integer.parseInt(br.readLine());	// 받을 정수 갯수
		
		// 배열 선언
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//최대값, 최소값
		int max=arr[0], min=arr[0];
		
		// x보다 작은수 출력
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		
		// 출력
		System.out.println(min + " " + max);
	}
}