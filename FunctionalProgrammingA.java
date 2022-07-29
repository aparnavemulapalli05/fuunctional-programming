package com.advance.basics;

public class FunctionalProgrammingA {

	public static void main(String[] args) {
		WelcomeMessageService welcomeMessageService= new WelcomeMessageService();
		Greeter greeter=new LoggedInUserGreeter();
		WelcomeMessageService.greet(greeter);
		
		MyFunctionType loggedInUserGreeter=()->System.out.println("welcome back");
		}

}
interface MyFunctionType{
	void myFunction();
}
