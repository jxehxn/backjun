import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> str_List= new ArrayList<String>();
		String str = sc.next();
		
		str = str.toUpperCase();
		String[] str2 = new String[str.length()];
		
		str2 = str.split("");
		
		for (int i = 0; i < str2.length; i++) {
			str_List.add(str2[i]);
		}


		
//		Collections.sort(str_List);
//		System.out.println(str_List);
//		
//		Set<String> set = new HashSet<String>(str_List);
//		
//		for (String a : set) {
//		System.out.println(a + ":" + Collections.frequency(str_List,a));	
//		}
		

	}

}


//toUpperCase() 대문자로 변환
//toLowerCase() 소문자로 변환