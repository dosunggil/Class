package com.cho.classes.exec;

public class StringEx2 {

	public static void main(String[] args) {
		
		String strText = "홍길동,90,80,77";
		
		String[] names = {"홍","이","성","박"};
		
		String[] items = strText.split(",");
		for(int i=0 ; i < items.length;i++) {
			System.out.println(items[i]);
		}
	}
}
