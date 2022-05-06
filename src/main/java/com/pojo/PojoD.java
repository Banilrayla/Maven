package com.pojo;
public class PojoD{
public static void main(String[] args) {
	
	
	PojoC obj =new PojoC();
	String a2= obj.getS();
	System.out.println(a2);
	
	
	obj.setS("gotit");
	String a3=obj.getS();
	System.out.println(a3);
	
	
	
}}