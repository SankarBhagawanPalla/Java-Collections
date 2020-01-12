package com.javalambdas;

public class TypeInference {

	public static void main(String[] args) {
 
		printLambda(s -> s.length());
		
	}
	
	public static void printLambda(Stringlength l) {
		
		System.out.println(l.calculateLength("Hello World!"));

	}

}
interface Stringlength{
	int calculateLength(String s);
}
