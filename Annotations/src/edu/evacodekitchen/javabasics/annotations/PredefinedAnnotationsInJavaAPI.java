package edu.evacodekitchen.javabasics.annotations;

public class PredefinedAnnotationsInJavaAPI {
	
	public static void main(String[] args) {
		
		Long someWrongLongValue = new Long(2);
		
		@SuppressWarnings("deprecation")
		Long someLongValue = Long.valueOf(3);
		
		System.out.println(someLongValue);
	}
	
}
