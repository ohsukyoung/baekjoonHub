//	[���� Java] 1000: A + B

// ���1 ------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer; //Ŭ������ �̿��Ͽ� �и� StringTokenizer( "���ڿ�" , ������ );

public class bj1000{
    public static void main(String[] args) throws IOException{
        
		//����
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        //ó��
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
            
        //���
        System.out.println(num1 + num2);
    }
}

// ��� ���
/* 
1 2
3
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


// ���2 ------------------------------------------------
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