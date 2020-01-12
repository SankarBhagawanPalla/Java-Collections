package com.javalambdas;

public class Greeter {

	public static void greet(Greeting greeting) {
		greeting.perform();
	}
	public static void main(String[] args) {

		
		Greeting myLambdaFunction = () -> System.out.println("Hello World!!!!!");
		greet(myLambdaFunction);
		
		Greeting innerClassGreeting = new Greeting() {
			
			public void perform() {
				System.out.println("Hello World perform!");
			}
		};
		greet(innerClassGreeting);
		
	}

}
