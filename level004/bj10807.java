import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj10807{
	public static void main(String[] args) throws IOException{
		
		// ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, searchNum, cnt=0;	// ��������, ���� ����, ������ ����
		
		// �� �ޱ�-1
		n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		// �� �ޱ�-2(�������)
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// �� �ޱ�-3
		searchNum = Integer.parseInt(br.readLine());

		// 3��°�� ���� ���� ���� ���� ã�� ��������
		for(int i=0; i<arr.length; i++){
			if(arr[i] == searchNum){
				cnt ++;
			}
		}

		// ���
		System.out.println(cnt);
	}
}