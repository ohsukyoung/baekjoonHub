import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj25304{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int x_toal = Integer.parseInt(br.readLine());	//-- �ѱݾ�
		int n_total = Integer.parseInt(br.readLine());	//-- ����������
		int x_count = 0;	//-- ���� �ݾ� ���� ����

		StringBuilder sb = new StringBuilder();

		for(int i=1; i<=n_total; i++){
			st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());	//-- ������ �ݾ�
			int n = Integer.parseInt(st.nextToken());	//-- ������ ������

			x_count += x*n;
		}

		if(x_toal == x_count)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}