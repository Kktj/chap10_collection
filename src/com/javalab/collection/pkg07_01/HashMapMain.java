package com.javalab.collection.pkg07_01;


public class HashMapMain {

	public static void main(String[] args) {
		
		// 1. 과일 객체 생성
		// 과일 변수명 : apple , banna , orange
		Fruit apple = new Fruit("Apple" , 3000);
		Fruit banna = new Fruit("Banna" , 3500);
		Fruit orange = new Fruit("Orange" , 4000);
		
		// 2. 과일 객체를 담을 박스(Box) 객체 생성
		Box<Fruit> box = new Box<>();
		box.addItem(apple);
		box.addItem(banna);
		box.addItem(orange);
		
		// 3. 박스의 내용 확인
		for (Fruit fruit : box.getItems()) {
			System.out.println(fruit.getName() + "\t" + fruit.getPrice());
		}
		System.out.println();
		
		// 4. 야채 객체 생성
		Vegitable 시금치 = new Vegitable("시금치" , 1500);
		Vegitable 양배추 = new Vegitable("양배추" , 2500);
		Vegitable 대파 = new Vegitable("대파" , 3500);
		
		// Box 생성
		Box<Vegitable> box1 = new Box<>();
		box1.addItem(시금치);
		box1.addItem(양배추);
		box1.addItem(대파);
		
		// 박스의 내용 확인
		for (Vegitable vegitable : box1.getItems()) {
			System.out.println(vegitable.getName() + "\t" + vegitable.getPrice());
		}
	}

}
