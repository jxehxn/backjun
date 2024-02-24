import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_01_0102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[][] num = new int[9][9];
		int max=0;
		int godgod = 0;//행
		int dufduf = 0;//열

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				num[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (num[i][j]>=max) {
					max=num[i][j];
					godgod=i+1;
					dufduf=j+1;
				}
			}
		}
//		System.out.println("최댓값은 : >>" + max);
//		System.out.println(godgod+"행 "+dufduf+"열 이다");
		System.out.println(max);
		System.out.println(godgod+" "+dufduf);
	}

}
