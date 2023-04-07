package com.javalab.collection.pkg11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListMain { // class s

	public static void main(String[] args) { // main s
		
		Board bad1 = new Board(100,"객체 배열을 통하여 학생명단 평균점수 최고점수 최고점 학생을 출력하세요", "김정희", "2023.03.03", 84);
		Board bad2 = new Board(101,"객체지향 프로그래밍 - 인스턴스 멤버와 정적멤버", "최윤희", "2021.07.21", 99);
		Board bad3 = new Board(102,"클래스와 객체지향 프로그래밍(Object Oriented Programming)", "우성민", "2020.06.10", 264);
		Board bad4 = new Board(103,"[정렬] 선택 정렬(Selection Sort)", "정민태", "2023.01.02", 77);
		Board bad5 = new Board(104,"Math.random() 메소드를 통한 난수 발생시키기", "김갑철", "2022.10.12", 94);
		Board bad6 = new Board(105,"배열을 통한 사원 정보 관리 #2", "이수영", "2021.07.25", 70);
		Board bad7 = new Board(106,"배열을 통한 학생 정보 관리 #1", "박영준", "2023.02.01", 80);
		Board bad8 = new Board(107,"문자열(장문) 처리하기", "성수정", "2019.12.30", 56);
		Board bad9 = new Board(108,"[과제] 주말과제 - 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2020.05.17", 84);
		Board bad10 = new Board(109,"[모듈화] 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2023.03.03", 64);
		Board bad11 = new Board(110,"다차원 배열 자료 저장 구조와 인덱스", "서동욱", "2022.07.010", 94);
		Board bad12 = new Board(111,"제어문 반복문", "정연남", "2022.08.03", 84);
		Board bad13 = new Board(112,"연산자(Operator)", "최정빈", "2020.01.01", 64);
		Board bad14 = new Board(113,"키보드를 통해서 데이터 읽어들이기", "오민희", "2022.09.12", 984);
		Board bad15 = new Board(114,"변수와 자료형 #1", "이의정", "2022.09.03", 164);
		
		List<Board> boards = new ArrayList<>();
		boards.add(bad1);
		boards.add(bad2);
		boards.add(bad3);
		boards.add(bad4);
		boards.add(bad5);
		boards.add(bad6);
		boards.add(bad7);
		boards.add(bad8);
		boards.add(bad9);
		boards.add(bad10);
		boards.add(bad11);
		boards.add(bad12);
		boards.add(bad13);
		boards.add(bad14);
		boards.add(bad15);
		
		// 1.전체 출력 메소드
		printAllBoard(boards);
		
		// 2.게시물 중에서 우성민, 홍세나가 작성한 게시물을 찾아서 반환해주는 메소드를 만드세요.
		System.out.println("2. 우성민 , 홍세나가 작성한 게시물의 목록을 출력");
		List<Board> boardName = getBoardByName(boards);
		for (Board b : boardName) {
			System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + b.getWriter() + "\t" + b.getDate() + "\t" + b.getHitCount());
		}
		System.out.println();
		
		// 3.배열과 관련된 게시물을 출력해주는 메소드를 만드세요.
		printBoard(boards);
		
		// 4.조회수가 가장 큰 게시물을 출력해주는 메소드를 만드세요.
		printHitCountBoard(boards);
		
		// 5.게시물 객체를 Set 컬렉션에 저장하고 출력해주는 메소드를 만드세요.
		printSetBoard(boards);
		
		// 6.게시물번호를 키(key)로 하여 HashMap에 학생 객체를 저장하고 출력해주는 메소드를 통해서 출력하세요.
		printMapBoard(boards);
		

	} // main e
	
	// 6.게시물번호를 키(key)로 하여 HashMap에 학생 객체를 저장하고 출력해주는 메소드를 통해서 출력하세요.
	private static void printMapBoard(List<Board> boards) {
		System.out.println("6. HashMap을 통하여 전체 게시물 출력");
		Map<Integer , Board> map = new HashMap<>();
		for (Board b : boards) {
			map.put(b.getId() , b);
		}
		for (Integer Key : map.keySet()) { // keySet 하는 이유는 중복되면 안되서
			
			System.out.println(map.get(Key).getId() + "\t" + map.get(Key).getTitle() + "\t" + map.get(Key).getWriter() + "\t" + map.get(Key).getDate() + "\t" + map.get(Key).getHitCount());
		}
		
}

	// 5.게시물 객체를 Set 컬렉션에 저장하고 출력해주는 메소드를 만드세요.
	// Set 중복저장 (x)
	private static void printSetBoard(List<Board> boards) {
		System.out.println("5. HashSet을 통하여 전체 게시물 출력");
		Set<Board> boardSet = new HashSet<>(boards);
		
		for (Board b : boardSet) {
			System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + b.getWriter() + "\t" + b.getDate() + "\t" + b.getHitCount());
		}
		System.out.println();
}
	
	// 4.조회수가 가장 큰 게시물을 출력해주는 메소드를 만드세요.
	private static void printHitCountBoard(List<Board> boards) {
		System.out.println("4. 조회수가 가장 큰 게시물 출력");
		int max = 0;
		int index = 0;
		String a = "";
		for (int i = 0; i < boards.size(); i++) {
			if (max < boards.get(i).getHitCount()) {
				max = boards.get(i).getHitCount();
				index = boards.get(i).getId();
				a = boards.get(i).getId() + "\t" + boards.get(i).getTitle() + "\t" + boards.get(i).getWriter() + "\t" + boards.get(i).getDate() + "\t" + boards.get(i).getHitCount();
			}
		}
		System.out.println("찾아진 인덱스 : " + index);
//		for (Board board : boards) {
//			if (board.getId() == index) {
//				
//			}
//		}
		System.out.println(a);
		System.out.println();
				
				
}

	// 3.배열과 관련된 게시물을 출력해주는 메소드를 만드세요.
	private static void printBoard(List<Board> boards) {
		System.out.println("3. 배열과 관련된 게시물 출력");
		for (Board board : boards) {
			if (board.getTitle().contains("배열")) {
				System.out.println(board.getId() + "\t" + board.getTitle() + "\t" + board.getWriter() + "\t" + board.getDate() + "\t" + board.getHitCount());
				// System.out.printf("%d \t %s \t %s \t %d \n " , board.getId());
			}
		}
	System.out.println();
}

	// 2.게시물 중에서 우성민, 홍세나가 작성한 게시물을 찾아서 반환해주는 메소드를 만드세요.
	private static List<Board> getBoardByName(List<Board> boards) {
		List<Board> boardName = new ArrayList<>();
		for (Board b : boards) {
			if (b.getWriter().equals("우성민") || b.getWriter().equals("홍세나")) {
				boardName.add(b);
			}
	}
	return boardName;	
}


	// 1.전체 출력 메소드
	private static void printAllBoard(List<Board> boards) {
		// 일반 for문
		System.out.println("1. 일반 for문으로 전체 게시물 출력");
		for (int i = 0; i < boards.size(); i++) {
			Board b = boards.get(i);
			System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + b.getWriter() + "\t" + b.getDate() + "\t" + b.getHitCount());
		}
		System.out.println();
		// 향상된 for문
		System.out.println("1. 향상된 for문으로 전체 게시물 출력");
		for (Board b : boards) {
			System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + b.getWriter() + "\t" + b.getDate() + "\t" + b.getHitCount());
		}
		
		System.out.println();
		
	}

} // class e

