
import java.util.Arrays;
import java.util.Scanner;

public class ee0114EEE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // 전체 분석 대상 광고 지면의 수
		int K = scanner.nextInt(); // 목표 낙찰 지면 수

		int[] A = new int[N];
		int[] B = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt(); // MOLOCO의 입찰 가격
			B[i] = scanner.nextInt(); // 다른 회사의 최고 입찰 가격
		}

		int result = findMinBidIncrement(N, K, A, B);
		System.out.println(result);
	}

	private static int findMinBidIncrement(int N, int K, int[] A, int[] B) {
		Arrays.sort(A);
		Arrays.sort(B);

		int left = 0;
		int right = Integer.MAX_VALUE;
		int count = 0;;
		
		while (left < right) {
			int mid = left + (right - left) / 2;

			
			for (int i = 0; i < N; i++) {
				if (A[i] + mid >= B[N - i - 1]) {
					count++;
				}
			}

			if (count >= K) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}

		return count;
	}
}
