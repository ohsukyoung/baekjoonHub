import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj2562{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 배열 선언
		int[] arr = new int[9];
		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//최대값, 최대값 순서
		int max=arr[0], max_i=0;
		
		// 최대값
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];
				max_i = i;
			}
		}
		
		// 출력
		System.out.println(max);
		System.out.println(max_i+1);
	}
}