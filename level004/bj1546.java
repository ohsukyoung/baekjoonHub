//
/*
- ����
�� M: �ִ밪
- ���
�� ���ο� ����: ��������/M * 100
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
				
		// ����: �ֿ� ����
		int subNum;		//-- ���񰹼�
		int M;			//-- �ִ밪
		double sum=0;	//-- ���ο� ���� �հ�
		
		// �Է�1: ���񰹼�
		subNum = Integer.parseInt(br.readLine());		// ���񰹼� �Է¹ޱ�
		int[] arr = new int[subNum];					// ���񰹼� ��ŭ �迭����
		double[] arr2 = new double[subNum];				// ���ο� ���� �迭
		
		// �Է�2: ���� ����
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<subNum; i++)
		{
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// ����1: �ִ밪ã��
		M = arr[0];
		for(int i=0; i<subNum; i++)
		{
			if(arr[i]>M)
			{
				M = arr[i];
			}
		}

		// ����2: ���ο� ����
		for(int i=0; i<subNum; i++)
		{
			arr2[i] = (double)arr[i]/M*100;		//-- ������ ����� double�� ����Ǳ� ����
			sum += arr2[i];
		}

		// ���
		System.out.printf("%.2f", (double)(sum/subNum));
	}
}