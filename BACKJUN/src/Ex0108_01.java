import java.util.Scanner;

public class Ex0108_01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
//		System.out.println("B진법 N숫자");
		String Str_original = sc.next();
		int base = sc.nextInt();
		double result = 0;
		int arr_number = 0;

//		int[] Number = new int[user_Str.length()];
		char[] user_char = new char[Str_original.length()];  //
		int[] asciiCode = new int[Str_original.length()];  //아스키코드로 변형하여 숫자 받기
		int[] N = new int[Str_original.length()]; 
		String str[]= Str_original.split("");
		
		for (int i = 0; i < str.length; i++) {
			
			
			user_char[i] = str[i].charAt(0);  //
			asciiCode[i] = (int) user_char[i];	  //아스키코드로 변형하여 숫자 받기
//			N = (asciiCode[i] - 55);
//			System.out.println(asciiCode[i]);
			
		}
		
		
		for(int arr : asciiCode) {
			if (arr >= 9) {
				System.out.println((double) Math.pow(base,arr_number));
				result = result + ((arr-55) * ((double)Math.pow(base,arr_number)));
				arr_number = arr_number +1;
				System.out.println(">>>>>>>>>>"+result);
			}
			else {
				System.out.println((int) Math.pow(base,arr_number));
				result = result + ((arr) * ((int) Math.pow(base,arr_number)));
				arr_number = arr_number +1;
//				System.out.println(result);
			}
		}
//		System.out.println(result);
	}
}
