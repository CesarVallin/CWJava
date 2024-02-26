package cw;

public class HelloWorld {
	
	public static String sayHello(String s) {
		return "Hello " + s;
	}
	
	public static int addTwo(int number) {
		return number + 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(HelloWorld.sayHello("Testing this one"));
		System.out.println(HelloWorld.addTwo(2));

	}

}
