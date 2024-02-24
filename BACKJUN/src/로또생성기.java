import java.util.Random;
import java.util.Scanner;

public class 로또생성기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] Lotto = new int[6];

		Random rd = new Random();
		int[] number = new int[6];

		for (int i = 0; i < number.length; i++) {
			number[i] = rd.nextInt(44)+1;
			for (int j = 1; j < i; j++) {
				if (number[i]==number[j]) {
					number[j] = number[j];
					j--;
				}
				else {
					number[j] = number[j];
				}

			}
		}
		for (int i = 0; i < Lotto.length; i++) {
			System.out.println(number[i]);
		}

		

//		for (int i = 0; i < num.length; i++) {
//			
//		}
	}

}
