import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj10818{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// ���� ���� �� �Է¹ޱ�-1(ù°��)
		int n = Integer.parseInt(br.readLine());	// ���� ���� ����
		
		// �迭 ����
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//�ִ밪, �ּҰ�
		int max=arr[0], min=arr[0];
		
		// x���� ������ ���
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		
		// ���
		System.out.println(min + " " + max);
	}
}