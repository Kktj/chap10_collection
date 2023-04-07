package com.javalab.collection.pkg13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductMain {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(1, "자전거", 250000));
		list.add(new Product(2, "노트북", 1250000));
		list.add(new Product(3, "쌀", 150000));
		list.add(new Product(4, "세탁기", 800000));
		list.add(new Product(5, "시금치", 2500));
		list.add(new Product(6, "대파", 10000));
		list.add(new Product(7, "에어컨", 3500000));
		list.add(new Product(8, "쇼파", 3000000));
		list.add(new Product(9, "우유", 2500));
		list.add(new Product(10, "운동화", 600000));
		
		// 전체 상품 출력 메소드
		printAllProduct(list);
		
		// 원하는 상품을 파라미터로 전달받아서 검색해주는 메소드
		String wantedProduct = "";
		wantedProduct = "세탁기";
		int price = getProductPrice(list , wantedProduct);
		System.out.println("===========원하는 상품을 파라미터로 전달받아서 출력===========");
		System.out.println(price);
		System.out.println();
		
		// 구매한 제품의 평균 구매 가격을 조회해서 main메소드에서 출력
		double avg = getAverage(list);
		System.out.println("=========구매한 제품의 평균 구매 가격을 출력==========");
		System.out.println("평균 구매 가격 : " + avg);
		System.out.println();
		
		// 제품 중에서 100만원이 넘는 제품들을 찾아서 ArrayList로 반환해주는 메소드 만들고 , main()메소드에서 출력
		List<Product> getList = product100List(list);
		System.out.println("=========제품 중에서 100만원이 넘는 제품 출력===========");
		for (Product product : getList) {
			System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
		}
		System.out.println();
		
		// HashMap을 통한 제품 출력 메소드 만들기
		printProductMap(list);
	}
	
	/**
	 * 
	 * @param list
	 */
	// HashMap을 통한 제품 출력 메소드 만들기
	public static void printProductMap(List<Product> list) {
		System.out.println("=============HashMap===============");
		Map<Integer , Product> map = new HashMap<>();
		for (Product product : list) {
			map.put(product.getId() , product);
		}
		for (Integer Key : map.keySet()) {
			System.out.println(map.get(Key).getId() + "\t" + map.get(Key).getName() + "\t" + map.get(Key).getPrice());
		}
		
//		Map<Integer , Product> map = new HashMap<>();
//		map.put(1 , new Product(1, "자전거", 250000));
//		map.put(1 , new Product(2, "노트북", 1250000));
//		map.put(1 , new Product(3, "쌀", 150000));
//		map.put(1 , new Product(4, "세탁기", 800000));
//		map.put(1 , new Product(5, "시금치", 2500));
//		map.put(1 , new Product(6, "대파", 10000));
//		map.put(1 , new Product(7, "에어컨", 3500000));
//		map.put(1 , new Product(8, "쇼파", 3000000));
//		map.put(1 , new Product(9, "우유", 2500));
//		map.put(1 , new Product(10, "운동화", 600000));
		
		
	}
	
	/**
	 * 
	 * @param list
	 * @return
	 */
	// 제품 중에서 100만원이 넘는 제품들을 찾아서 ArrayList로 반환해주는 메소드 만들고 , main()메소드에서 출력
	public static List<Product> product100List(List<Product> list) {
		List<Product> getList = new ArrayList<>();
		for (Product product : list) {
			if (product.getPrice() >= 1000000) {
				getList.add(product);
			}
		}
		return getList;
	}
	
	/**
	 * 
	 * @param list
	 * @return
	 */
	// 구매한 제품의 평균 구매 가격을 조회해서 main메소드에서 출력
	public static double getAverage(List<Product> list) {
		int sum = 0;
		for (Product product : list) {
			sum += product.getPrice();
		}
		double avg =  (sum * 1.0) / list.size();
		return avg;
	}
	
	/**
	 * 
	 * @param list
	 * @param wantedProduct
	 * @return
	 */
	// 원하는 상품을 파라미터로 전달받아서 검색해주는 메소드
	public static int getProductPrice(List<Product> list , String wantedProduct) {
		int price = 0; 
		for (Product product : list) {
			if (product.getName().equals(wantedProduct)) {
				price = product.getPrice();
			}
		}
		return price;
	}
	
	/**
	 * 
	 * @param list
	 */
	// 전체 상품 출력 메소드
	public static void printAllProduct(List<Product> list) {
		System.out.println("============전체 상품 출력 ============");
		for (Product product : list) {
			System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice() );
		}
		System.out.println();
	}


}
