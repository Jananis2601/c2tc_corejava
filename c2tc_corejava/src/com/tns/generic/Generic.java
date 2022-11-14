package com.tns.generic;

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>list=new ArrayList<String>();
		list.add("java");
		list.add("2");
		for(Object ob:list) {
			String Str=(String)ob;
			System.out.println(Str);
		
		}


	}

}
