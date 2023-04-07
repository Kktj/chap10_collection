package com.javalab.collection.pkg10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		String[] member = new String[10];
		member[0] = "임재,20190509,20190510,8,남,30대후반";
		member[1] = "성열,20190509,20190510,1,남,30대중반";
		member[2] = "천재,20190509,20190510,3,남,30대초반";
		member[3] = "현수,20190509,20190509,1,남,20대후반";
		member[4] = "진우,20190509,20190510,2,남,30대초반";
		member[5] = "영수,20190509,20190510,2,여,40대후반";
		member[6] = "종화,20190509,20190509,0,남,20대후반";
		member[7] = "윤정,20190509,20190510,3,여,40대후반";
		member[8] = "종호,20190509,20190510,3,남,20대중반";
		member[9] = "동현,20190509,20190510,5,남,20대중반";
		
		// 맴버 타입 어레이리스트
		List<Member> members = new ArrayList<>();

		for (int i = 0; i < member.length; i++) {
			String[] arr = member[i].split(","); // 콤머로 구분해서 자르고 배열
			int numVisit = Integer.parseInt(arr[3]);
			char gender = arr[4].charAt(0);
			members.add(new Member(arr[0], arr[1], arr[2], numVisit, gender, arr[5]));

		}
		// 2. 이름이 "천재"인 회원을 찾고 별도의 메소드를 통해서 해당 회원을 출력하세요.
		printMember(members);
		
		// 3. 전체 회원을 출력해주는 메소드를 만드세요.
		printAllMember(members);
		
		// 4. 30대인 회원들을 찾아주는 메소드를 만들고 ArrayList에 담아서 반환하세요.반환받은 리스트를 main 메소드에서 출력하세요.
		List<Member> member30list = printThirtyMember(members);
		System.out.println("==========================30대인 회원==============================");
		for (Member member2 : member30list) {
			System.out.println(member2.getName() + "\t" + member2.getJoinDate() + "\t" + member2.getLastVisitDate()
			+ "\t" + member2.getNumVisit() + "\t" + member2.getGender() + "\t" + member2.getAge());
		}
		System.out.println();
		
		// 5. 20대 후반들의 방문 회수를 구해주는 메소드를 만들어서 값을 반환받고 출력하세요.
		int count = printGetCount20(members);
		System.out.println("20대 후반 방문 횟수 : " + count);
		System.out.println();
		  

	}
	
	// 20대 후반 회원들의 방문 횟수를 구해주는 메소드
	private static int printGetCount20(List<Member> members) {
		int count = 0;
		for (Member member : members) {
			if (member.getAge().equals("20대후반")) {
				count += member.getNumVisit();
			}
		}
		return count; // 방문횟수 반환
	}
	
	// 30대인 회원들을 찾아주는 메소드
	private static List<Member> printThirtyMember(List<Member> members) {
		List<Member> members30list = new ArrayList<Member>();
		
		for (Member member : members) {
			String ageTest = member.getAge().substring(0 , 2);
			if (Integer.parseInt(ageTest) == 30) {
				members30list.add(member);
			}
		}
		return members30list;
	}
	
	// 전체 회원을 출력해주는 메소드
	private static void printAllMember(List<Member> members) {
		System.out.println("=============================전체 회원=============================");
		for (Member member : members) {
			System.out.println(member.getName() + "\t" + member.getJoinDate() + "\t" + member.getLastVisitDate()
			+ "\t" + member.getNumVisit() + "\t" + member.getGender() + "\t" + member.getAge());
		}
		System.out.println();
		
	}
	// 이름이 "천재"인 회원을 찾는 메소드
	private static void printMember(List<Member> members) {
		for (Member member : members) {
			if (member.getName().equals("천재")) {
				System.out.println("========================이름이 천재인 회원============================");
				System.out.println(member.getName() + "\t" + member.getJoinDate() + "\t" + member.getLastVisitDate()
						+ "\t" + member.getNumVisit() + "\t" + member.getGender() + "\t" + member.getAge());
			}
		}
		System.out.println();

	}

}
