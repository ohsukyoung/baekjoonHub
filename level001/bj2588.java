// [���� Java] 2588: ����

// ���1 ------------------------------------------------
/*
import java.util.Scanner;

public class bj2588{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		String B = in.next();

		System.out.println(A * (B.charAt(2) - '0')); //0���� ����: ���尪�� �ƴ� ��¥ ���ڸ� �������� ����
		System.out.println(A * (B.charAt(1) - '0'));
		System.out.println(A * (B.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(B)); //int������ �ٲٱ�
	}
}
*/


// ���2 ------------------------------------------------
/*import java.util.Scanner;

public class bj2588{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();

		System.out.println(A*(B%10));		//A*(385%10) �� A*(5)
		System.out.println(A*(B/10%10));	//A*(385/10%10) �� A*(38%10) �� A*(8)
		System.out.println(A*(B/100));		//A*(B/100) �� A*(3)
		System.out.println(A*B);
	}
}*/

// ���3 ------------------------------------------------
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj2588{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();

		char[] b = B.toCharArray();		//toCharArray(): ���ڿ��� char�迭 ���·� ��ȯ �޼ҵ�

		System.out.println(A*(B[2]-0));
		System.out.println(A*(B[1]-0));
		System.out.println(A*(B[0]-0));
		System.out.println(A*Integer.parseInt(B));
	}
}
*/


// ���4 ------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj2588{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());

		br.close();			// ��������� close()�����Ͽ� �ݾ���
							// Garbage Collector�� ������ �Ϸ�� �� ���� �Ҵ�� ���ҽ��� �״�� �����Ǿ� ����ȭ �������� close()���
							// (���ǻ���) close()���� �ݰԵǸ� ���α׷� �󿡼� close()�� �� ���X

		StringBuilder sb = new StringBuilder();
		
		sb.append(A*(B%10));
		sb.append('\n');

		sb.append(A*(B%100/10));
		sb.append('\n');

		sb.append(A*(B/100));
		sb.append('\n');

		sb.append(A*B);
		

		System.out.print(sb);
	}
}