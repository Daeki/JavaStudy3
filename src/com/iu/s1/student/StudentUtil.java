package com.iu.s1.student;

import java.util.Scanner;

public class StudentUtil {
	
	public Student makeStudent() {
		//키보드로 부터 이름, 번호, 국어 영어 수학 입력 리턴
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = sc.next();
		System.out.println("번호 입력");
		int num = sc.nextInt();
		System.out.println("국어 입력");
		int kor = sc.nextInt();
		System.out.println("영어 입력");
		int eng = sc.nextInt();
		System.out.println("수학 입력");
		int math = sc.nextInt();
		//1. 배열 - 같은 데이터타입(X)
		//2. class
		Student student = new Student();
		student.name=name;
		student.num = num;
		student.kor = kor;
		student.eng = eng;
		student.math = math;
		
		return student;
	}

}
