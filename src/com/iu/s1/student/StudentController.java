package com.iu.s1.student;

import java.util.Scanner;

public class StudentController {
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		StudentUtil studentUtil = new StudentUtil();
		StudentView studentView = new StudentView();
		Student [] students = null;
		while(check) {
			System.out.println("1. 학생들의 정보 입력");
			System.out.println("2. 학생들의 정보 출력");
			System.out.println("3. 프 로 그 램  종료");
			int select = sc.nextInt();
			
			switch (select) {
			case 1 :
				students = studentUtil.makeStudents();
				break;
			case 2 :
				studentView.viewStudents(students);
				break;
			default :
				//check = !check;
				check=false;
				break;
			}
			
		//switch case
		}//while 끝
	}//Main 끝

}// class 끝
