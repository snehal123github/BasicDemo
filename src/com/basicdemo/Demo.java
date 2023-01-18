package com.basicdemo;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		
		for(Integer i:list) {
			System.out.println(i);
		}

	}

}
