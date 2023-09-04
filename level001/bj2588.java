// [백준 Java] 2588: 곱셈

// 방법1 ------------------------------------------------
/*
import java.util.Scanner;

public class bj2588{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		String B = in.next();

		System.out.println(A * (B.charAt(2) - '0')); //0빼는 이유: 저장값이 아닌 진짜 숫자를 가져오기 위해
		System.out.println(A * (B.charAt(1) - '0'));
		System.out.println(A * (B.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(B)); //int형으로 바꾸기
	}
}
*/


// 방법2 ------------------------------------------------
/*import java.util.Scanner;

public class bj2588{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();

		System.out.println(A*(B%10));		//A*(385%10) → A*(5)
		System.out.println(A*(B/10%10));	//A*(385/10%10) → A*(38%10) → A*(8)
		System.out.println(A*(B/100));		//A*(B/100) → A*(3)
		System.out.println(A*B);
	}
}*/

// 방법3 ------------------------------------------------
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj2588{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();

		char[] b = B.toCharArray();		//toCharArray(): 문자열을 char배열 형태로 반환 메소드

		System.out.println(A*(B[2]-0));
		System.out.println(A*(B[1]-0));
		System.out.println(A*(B[0]-0));
		System.out.println(A*Integer.parseInt(B));
	}
}
*/


// 방법4 ------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj2588{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());

		br.close();			// 명시적으로 close()선언하여 닫아줌
							// Garbage Collector가 실행이 완료될 때 까지 할당된 리소스가 그대로 유지되어 최적화 관점에서 close()사용
							// (유의사항) close()통해 닫게되면 프로그램 상에서 close()한 것 사용X

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