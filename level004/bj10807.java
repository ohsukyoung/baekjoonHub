import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj10807{
	public static void main(String[] args) throws IOException{
		
		// 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, searchNum, cnt=0;	// 정수개수, 비교할 정수, 비교정수 갯수
		
		// 값 받기-1
		n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		// 값 받기-2(공백기준)
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 값 받기-3
		searchNum = Integer.parseInt(br.readLine());

		// 3번째로 받은 값과 같은 숫자 찾아 갯수세기
		for(int i=0; i<arr.length; i++){
			if(arr[i] == searchNum){
				cnt ++;
			}
		}

		// 출력
		System.out.println(cnt);
	}
}