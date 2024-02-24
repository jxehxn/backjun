package ExP_0123;

import java.util.Scanner;

public class Ex_0123 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] nums = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 }; // 대시 합들
		Scanner sc = new Scanner(System.in);

		System.out.println("첫자리 0을 제외한 숫자를 입력해주세요>>");
		
		String str = sc.next();
		String[] result_str = str.split("");// 입력받은 숫자 쪼개서 String 형으로 저장.
		
		while (true) {
			if (result_str[0].equals("0")) {
				System.out.println("첫자리가 0입니다 다시 입력하세요");
				break;
			}
			else {
				int[] result_num = new int[str.length()];;  //string을 int로 변환해서 담을 int형 배열
				int result = 0; // 최종으로 더할 변수
				
				for (int i = 0; i < result_str.length; i++) {
					result_num[i] = Integer.parseInt(result_str[i]);
				}
				
				
				for (int i = 0; i < str.length(); i++) {
					 result = result+nums[result_num[i]];
				}
				System.out.println(result);
				break;
			}
		}
			
		
		
		
		
		
//		for (int i = 0; i < result_str.length; i++) {
//			int b = nums[Integer.parseInt(a)];
//			result = result + b;
//		}
//		

//		System.out.println(result);

	}

}
