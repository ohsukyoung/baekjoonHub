// [백준 Java] 25314: 코딩은 체육과목 입니다

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj25314{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int num;
		int numdiv;

		num=Integer.parseInt(st.nextToken());

		numdiv=num/4;
		for(int i=0;i<numdiv;i++){
			System.out.print("long ");		
		}
		System.out.print("int");	
	}
}