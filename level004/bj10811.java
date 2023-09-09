import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
N: �ٱ��� ����
M: �ٱ��� �������� �ݺ� Ƚ��
i: �������� ���� ���� ��°
j: �������� ���� ������ ��°

N M
i j
*/

public class bj10811
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// ����: �ֿ� ����
		int N, M, i=0, j=0;
		int temp;
		
		// �Է�1: ù��° ��
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());	//-- �ٱ��� ����
		M = Integer.parseInt(st.nextToken());	//-- �ݺ� Ƚ��

		// ����1: �Է¹��� N ��ŭ �迭�����
		int[] arr = new int[N];					//-- ���� �� �迭
		for(int k=0; k<N; k++)
		{
			arr[k]=k+1;
		}
		
		// �Է�2: �ι�°~������ ��
		int[][] arr2 = new int[M][2];			//-- ���� ����, ������ ���� �迭
		for(int k=0; k<M; k++)
		{
			st = new StringTokenizer(br.readLine());
			arr2[k][0] = Integer.parseInt(st.nextToken())-1;	//-- ���� ����
			arr2[k][1] = Integer.parseInt(st.nextToken())-1;	//-- ���� ������
		}

		//System.out.println(" ------------- ����: �迭 ������ -------------");

		// ����1: �ٱ��� ���� ����
		for(int k=0; k<M; k++)									//-- ����Ƚ����ŭ ����
		{
			int a = arr2[k][0];									//-- ���� ����
			int b = arr2[k][1];									//-- ���� ������

			if(a!=b){											//-- ������� ������X
				for(; a<=arr2[k][0]+(arr2[k][1]-arr2[k][0])/2; a++,b--)
				//-- ���۰� <= ���۰�+(����-���۰�)/2
				//-- ���۰��� ���� ������ ������ �ݱ��� ����
				{
					//System.out.printf("  �� ���� ��: arr[a]: %d, arr[b]: %d\n", arr[a], arr[b]);	//���test
					temp	= arr[a];
					arr[a]	= arr[b];
					arr[b]	= temp;
					//System.out.printf("  �� ���� ��: arr[a]: %d, arr[b]: %d\n", arr[a], arr[b]);	//���test
					
					
					//-- ��� test: �ٲ� �迭
					/*
					System.out.print("   �� ");
					for(int m=0; m<arr.length; m++)
					{
						System.out.printf("%d ", arr[m]);
					}
					*/
				}
			}
		}
		
		// ���: �迭���� �������� ���еǾ�� ��
		//System.out.println(" \n------------- ���: �����迭 ------------- ");
		for(int m=0; m<arr.length; m++)
		{
			System.out.printf("%d ", arr[m]);
		}
	}
}

// ���� ���
/*
5 4
1 2
3 4
1 4
2 2
 ------------- ����: �迭 ������ -------------
  �� ���� ��: arr[a]: 1, arr[b]: 2
  �� ���� ��: arr[a]: 2, arr[b]: 1
   �� 2 1 3 4 5   �� ���� ��: arr[a]: 3, arr[b]: 4
  �� ���� ��: arr[a]: 4, arr[b]: 3
   �� 2 1 4 3 5   �� ���� ��: arr[a]: 2, arr[b]: 3
  �� ���� ��: arr[a]: 3, arr[b]: 2
   �� 3 1 4 2 5   �� ���� ��: arr[a]: 1, arr[b]: 4
  �� ���� ��: arr[a]: 4, arr[b]: 1
   �� 3 4 1 2 5
------------- ���: �����迭 -------------
3 4 1 2 5 ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/