package com.kh.test;

import java.util.ArrayList;

import student시험.Student;

public class test {

	public static void main(String[] args) {
		ArrayList<Student> list = null;
		list.add(new Student("강건강",84));
		list.add(new Student("남나눔",78));
		list.add(new Student("도대담",96));
		list.add(new Student("류라라",67));
		
		for(int i = 0; i < list.length(); i++) {
			Student s = list.get(i);
			System.out.println(s);
		}
	}

}
