//	[백준 Java] 1000: A + B

// 방법1 ------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer; //클래스를 이용하여 분리 StringTokenizer( "문자열" , 구분자 );

public class bj1000{
    public static void main(String[] args) throws IOException{
        
		//생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        //처리
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
            
        //출력
        System.out.println(num1 + num2);
    }
}

// 결과 출력
/* 
1 2
3
계속하려면 아무 키나 누르십시오 . . .
*/


// 방법2 ------------------------------------------------
/*
import java.util.Scanner;
 
public class bg1000 {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(a+b);
	}
}
*/