package com.tns.generic;

public class GenericClass <T>{
	GenericClass()
	{
		System.out.println("this is generic class");
	}
	public void methodGeneric(T obj) {
		System.out.println("this is generic method"+" "+obj.getClass().getSimpleName());

	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass <Integer> test=new GenericClass<Integer>();
		Integer a=5;
		test.methodGeneric(a);
		GenericClass<String>test1=new GenericClass<String>();
		String s="pmc";
		test1.methodGeneric(s);
		
		
	

	}
}
