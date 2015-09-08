package com.medicalproj.common.util;

public class RadomNumberUtil {

	public static int get6BitRadomNumber(){
		return (int)((Math.random()*9+1)*100000);
	}

	public static void main(String[] args){
		System.out.println(RadomNumberUtil.get6BitRadomNumber());
	}
}
