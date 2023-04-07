package com.javalab.collection.pkg10;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {

		List<Integer> number = new ArrayList<>();
		
		for (int i = 0; i < 11; i++) {
			number.add(i);
		}
		for (int i = 0; i < number.size(); i++) {
			System.out.print(number.get(i) + "\t");
		}
		System.out.println();
//		number.add(1);
//		number.add(2);
//		number.add(3);
//		number.add(4);
//		number.add(5);
//		number.add(6);
//		number.add(7);
//		number.add(8);
//		number.add(9);
//		number.add(10);
//
//		for (Integer integer : number) {
//			System.out.println(integer);
//		}
//		System.out.println();
		
		List<String> car = new ArrayList<>();
		
		car.add("Volvo");
		car.add("Benz");
		car.add("BMW");
		car.add("Hyundai");
		
		for (String string : car) {
			System.out.println(string);
			
		}
		System.out.println();
		
		Student str1 = new Student("1234" , "123456-1234567" , "홍길동" , 3 , "천안" , 210);
		Student str2 = new Student("5678" , "987456-2334567", "김길동", 4, "대전", 220);
		Student str3 = new Student("8970", "357556-2334789", "이길동", 1, "서울", 230);
		
		List<Student> students = new ArrayList<>();
		students.add(str1);
		students.add(str2);
		students.add(str3);
		
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

}
