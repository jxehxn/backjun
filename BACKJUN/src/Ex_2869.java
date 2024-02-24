import java.util.Iterator;
import java.util.Scanner;

public class Ex_2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt(); // 아래 출력 갯수
		int goal_num = sc.nextInt(); // 목표 낙찰 지면수
		int[] Mol_a = new int[num1];
		int[] Mol_b = new int[num1];
		int[] count = new int[num1]; // 배열에다가 데이터 집어 넣어서 1이면 낙찰 받았다는 거
		int cnt = 0;

		int X_count = 0; // 더한 횟수
		for (int i = 0; i < num1; i++) {
			Mol_a[i] = sc.nextInt();
			Mol_b[i] = sc.nextInt();
		}

		for (int i = 0; i < num1; i++) {
			if (Mol_a[i] >= Mol_b[i]) {
				count[i] = 1;			
			}
			if (count[i] == 1) {
				cnt++;
			} // count[i] =
		}

		while (true) {
			if (cnt >= goal_num) {
				System.out.println(X_count);
				break;
			}
			for (int i = 0; i < num1; i++) {
				if (Mol_a[i] >= Mol_b[i]) {
					count[i] = 1;
				}

			}

			for (int i = 0; i < num1; i++) {
				Mol_a[i] = Mol_a[i] + 1;
				if (count[i] == 1) {
					cnt++;
				} // count[i] =
			}
			
			X_count++;
		}

	}

}
