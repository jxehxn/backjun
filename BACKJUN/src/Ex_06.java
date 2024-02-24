//import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] str_word = {"c=","c-","d-","lj","nj","s=","z=","dz="};

		List<String> str_List = new ArrayList<>(Arrays.asList(str));
		int count = 0;
		
		String[] str1 = str.split("");
		
		
		
		System.out.println(str_List);
		//		for(int x = 0; x<10; x++) {
		//			String str_split = str.substring(0,2);
		//			for (String arr : str_word) {
		//				//System.out.println(arr);
		//				if (str_split.equals(arr)) {
		//					System.out.println("참");
		//					str_List.remove(arr);
		//					str_word = str_List.toArray(new String[0]);
		//					System.out.println("str_List>>>>>>>"+str_List);
		//					count = count+1;
		//				}					
		//			}
		//			str_split = str.substring(0,3);
		//			for (String arr : str_word) {
		//				//System.out.println(arr);
		//				if (str_split.equals(arr)) {
		//					str_List.remove(arr);
		//					str_word = str_List.toArray(new String[0]);
		//					System.out.println("참");
		//					count = count+1;
		//				}
		//			}
		//			System.out.println(count);
		//		}



	}

}
