import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int line = 20;
		String[] major = new String[line];
		float[] score = new float[line]; // 학점
		float[] subject_aver = new float[line];//과목평점
		String[] Subject_aver_str = new String[line]; // 과목이름
		float score_sum = 0; //학점의 총합
		float major_aver = 0; // 전공 평점
		int major_count=0;
//		major_aver = (score*subject_aver)/score_sum;
		 // 전공평점
		float Subject_aver_sum = 0; //과목평점 합계
		float scoreXsubject_aver = 0;

		for (int i = 0; i < line; i++) {
			major[i] = sc.next();
			score[i] = sc.nextFloat(); 
			Subject_aver_str[i] = sc.next();
			
			if (Subject_aver_str[i].equals("A+")) {
				subject_aver[i] = (float) 4.5;
				major_count = major_count+1;
				scoreXsubject_aver = (subject_aver[i] * score[i])+scoreXsubject_aver;
			}
			else if (Subject_aver_str[i].equals("A0")) {
				subject_aver[i] = (float) 4.0;
				major_count = major_count+1;
				scoreXsubject_aver = (subject_aver[i] * score[i])+scoreXsubject_aver;
			}
			else if (Subject_aver_str[i].equals("B+")) {
				subject_aver[i] = (float) 3.5;
				major_count = major_count+1;
				scoreXsubject_aver = (subject_aver[i] * score[i])+scoreXsubject_aver;
			}
			else if (Subject_aver_str[i].equals("B0")) {
				subject_aver[i] = (float) 3.0;
				major_count = major_count+1;
				scoreXsubject_aver = (subject_aver[i] * score[i])+scoreXsubject_aver;
			}
			else if (Subject_aver_str[i].equals("C+")) {
				subject_aver[i] = (float) 2.5;
				major_count = major_count+1;
				scoreXsubject_aver = (subject_aver[i] * score[i])+scoreXsubject_aver;
			}
			else if (Subject_aver_str[i].equals("C0")) {
				subject_aver[i] = (float) 2.0;
				major_count = major_count+1;
				scoreXsubject_aver = (subject_aver[i] * score[i])+scoreXsubject_aver;
			}
			else if (Subject_aver_str[i].equals("D+")) {
				subject_aver[i] = (float) 1.5;
				major_count = major_count+1;
				scoreXsubject_aver = (subject_aver[i] * score[i])+scoreXsubject_aver;
			}
			else if (Subject_aver_str[i].equals("D0")) {
				subject_aver[i] = (float) 1.0;
				major_count = major_count+1;
				scoreXsubject_aver = (subject_aver[i] * score[i])+scoreXsubject_aver;
			}
			else if (Subject_aver_str[i].equals("F")) {
				subject_aver[i] = (float) 0.0;
				major_count = major_count+1;
				scoreXsubject_aver = (subject_aver[i] * score[i])+scoreXsubject_aver;
			}
			else {
				score[i] = 0;
				major_count = major_count-1;
				//P일때 계산
			}
			
			
		
		}
		for (float arr : subject_aver) {
			Subject_aver_sum = Subject_aver_sum + arr;
		}
		
//		System.out.println("과목평점합계"+Subject_aver_sum);
//		System.out.println("윗 합계는.>>>>"+scoreXsubject_aver);
		for(float arr : score) {
			score_sum = arr + score_sum;
		}
//		System.out.println("학점의총합계"+score_sum);
		
		float result = scoreXsubject_aver / score_sum;
		System.out.println(result);

	}

}
