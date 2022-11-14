package com.tns.generic;

import java.util.ArrayList;

public class Genericsjava {
	

	public static void main(String[] args) {
		ArrayList <String>list=new ArrayList<String>();
		list.add("java");
		list.add("2");
		for(Object ob:list) {
			String Str=(String)ob;
			System.out.println(Str);
		
		}
		
		// TODO Auto-generated method stub

	}

}
