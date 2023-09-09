//
/*
- 변수
ㄴ M: 최대값
- 계산
ㄴ 새로운 점수: 기존점수/M * 100
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj1546
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
				
		// 선업: 주요 변수
		int subNum;		//-- 과목갯수
		int M;			//-- 최대값
		double sum=0;	//-- 새로운 점수 합계
		
		// 입력1: 과목갯수
		subNum = Integer.parseInt(br.readLine());		// 과목갯수 입력받기
		int[] arr = new int[subNum];					// 과목갯수 만큼 배열생성
		double[] arr2 = new double[subNum];				// 새로운 점수 배열
		
		// 입력2: 과목 점수
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<subNum; i++)
		{
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 연산1: 최대값찾기
		M = arr[0];
		for(int i=0; i<subNum; i++)
		{
			if(arr[i]>M)
			{
				M = arr[i];
			}
		}

		// 연산2: 새로운 점수
		for(int i=0; i<subNum; i++)
		{
			arr2[i] = (double)arr[i]/M*100;		//-- 연산의 결과가 double로 저장되기 위해
			sum += arr2[i];
		}

		// 출력
		System.out.printf("%.2f", (double)(sum/subNum));
	}
}