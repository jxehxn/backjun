package backjun0108;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	
//		System.out.println("B진법 N숫자");
		String Str_original = sc.next();
		int base = sc.nextInt();
		long result = 0L;
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
			result = result + ((arr-55) * (int) Math.pow(base,arr_number));
			arr_number = arr_number +1;
			
		}
		System.out.println(result);
	}

}
