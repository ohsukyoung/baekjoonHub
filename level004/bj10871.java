import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj10871{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// ���� ���� �� �Է¹ޱ�-1(ù°��)
		int n = Integer.parseInt(st.nextToken());	// ���� ���� ����
		int x = Integer.parseInt(st.nextToken());	// ���� ����
		
		// �迭 ����
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// x���� ������ ���
		for(int i=0; i<arr.length; i++){
			if(arr[i]<x)
				System.out.printf("%d ",arr[i]);
		}
		
	}
}