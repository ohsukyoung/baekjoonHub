import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
N: 바구니 갯수
M: 바구니 역순만들 반복 횟수
i: 역순으로 만들 시작 번째
j: 역순으로 만들 마지막 번째

N M
i j
*/

public class bj10811
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 선언: 주요 변수
		int N, M, i=0, j=0;
		int temp;
		
		// 입력1: 첫번째 줄
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());	//-- 바구니 갯수
		M = Integer.parseInt(st.nextToken());	//-- 반복 횟수

		// 연산1: 입력받은 N 만큼 배열만들기
		int[] arr = new int[N];					//-- 공이 들어간 배열
		for(int k=0; k<N; k++)
		{
			arr[k]=k+1;
		}
		
		// 입력2: 두번째~마지막 줄
		int[][] arr2 = new int[M][2];			//-- 역순 시작, 마지막 담을 배열
		for(int k=0; k<M; k++)
		{
			st = new StringTokenizer(br.readLine());
			arr2[k][0] = Integer.parseInt(st.nextToken())-1;	//-- 역순 시작
			arr2[k][1] = Integer.parseInt(st.nextToken())-1;	//-- 역순 마지막
		}

		//System.out.println(" ------------- 연산: 배열 뒤집기 -------------");

		// 연산1: 바구니 순서 역순
		for(int k=0; k<M; k++)									//-- 역순횟수만큼 루프
		{
			int a = arr2[k][0];									//-- 역순 시작
			int b = arr2[k][1];									//-- 역순 마지막

			if(a!=b){											//-- 같을경우 뒤집기X
				for(; a<=arr2[k][0]+(arr2[k][1]-arr2[k][0])/2; a++,b--)
				//-- 시작값 <= 시작값+(끝값-시작값)/2
				//-- 시작값이 끝과 시작이 차이의 반까지 실행
				{
					//System.out.printf("  ㄴ 역순 전: arr[a]: %d, arr[b]: %d\n", arr[a], arr[b]);	//출력test
					temp	= arr[a];
					arr[a]	= arr[b];
					arr[b]	= temp;
					//System.out.printf("  ㄴ 역순 후: arr[a]: %d, arr[b]: %d\n", arr[a], arr[b]);	//출력test
					
					
					//-- 출력 test: 바뀐 배열
					/*
					System.out.print("   → ");
					for(int m=0; m<arr.length; m++)
					{
						System.out.printf("%d ", arr[m]);
					}
					*/
				}
			}
		}
		
		// 출력: 배열사이 공백으로 구분되어야 함
		//System.out.println(" \n------------- 출력: 최종배열 ------------- ");
		for(int m=0; m<arr.length; m++)
		{
			System.out.printf("%d ", arr[m]);
		}
	}
}

// 실행 결과
/*
5 4
1 2
3 4
1 4
2 2
 ------------- 연산: 배열 뒤집기 -------------
  ㄴ 역순 전: arr[a]: 1, arr[b]: 2
  ㄴ 역순 후: arr[a]: 2, arr[b]: 1
   → 2 1 3 4 5   ㄴ 역순 전: arr[a]: 3, arr[b]: 4
  ㄴ 역순 후: arr[a]: 4, arr[b]: 3
   → 2 1 4 3 5   ㄴ 역순 전: arr[a]: 2, arr[b]: 3
  ㄴ 역순 후: arr[a]: 3, arr[b]: 2
   → 3 1 4 2 5   ㄴ 역순 전: arr[a]: 1, arr[b]: 4
  ㄴ 역순 후: arr[a]: 4, arr[b]: 1
   → 3 4 1 2 5
------------- 출력: 최종배열 -------------
3 4 1 2 5 계속하려면 아무 키나 누르십시오 . . .
*/