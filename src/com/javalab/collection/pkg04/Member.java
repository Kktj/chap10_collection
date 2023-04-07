package com.javalab.collection.pkg04;

public class Member {
	
	private String name;
	private int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// 객체가 같은지 틀린지 알아보려면 아래 코드가 있어야 함
	@Override
	public int hashCode() {
		System.out.println("여기는 hashCode : " + name.hashCode() + age);
		return name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return name.equals(other.name) && age == other.age;
	}
	
	

}