import java.util.Iterator;
import java.util.Scanner;

public class d2 {
//백준 10798 문제
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		ArrayList<String> list1 = new ArrayList<String>();
		char charArr[][] = new char[5][15];
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<5; i++)
		{
			String st = sc.next();
			for(int j=0; j<st.length(); j++)
			{
				charArr[i][j] = st.charAt(j);		
			}			
		}
		
		for(int i=0; i < 15; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(charArr[j][i] != 0)
				{
					sb.append(charArr[j][i]);
				}
				else {
					System.out.print("");
				}
			}
		}
		System.out.print(sb);
		
	}

}
