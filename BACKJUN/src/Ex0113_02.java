import java.util.Iterator;
import java.util.Scanner;

public class Ex0113_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] Squa_len = new int[N+1];
		Squa_len[0] = 2;
		int result = 0;
		int num = 1;
		
		for (int i = 0 ; i < N; i++) {  //N 사각형의 변의 점의 갯수 구하기????
			Squa_len[num] = Squa_len[num-1]*2-1;
			num++;
		}
//		System.out.println(Squa_len[N]);
		
		for (int i = 1; i < Squa_len[N]; i++) {
			result = result+(i*2);
		}
		result = result + Squa_len[N];
		
		System.out.println(result);
	}

}
