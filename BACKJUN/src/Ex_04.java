import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int str_len = str.length();

		String[] new_str= str.split("");
		//		String[] new_str2 = new_str.clone();
		String[] rever_str2 = new String[str_len];

		for (int i = 0, j=rever_str2.length-1; i < rever_str2.length ; i++,j--) {
			rever_str2[j] = new_str[i];
		}
//		System.out.println(Arrays.toString(rever_str2));
//		System.out.println(Arrays.toString(new_str));

		if (Arrays.equals(rever_str2, new_str)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
}
