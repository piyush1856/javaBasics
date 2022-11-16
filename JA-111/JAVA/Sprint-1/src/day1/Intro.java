package day1;

public class Intro {
	//entry point
	//signature:
	public static void main(String[] args) {
		System.out.print("Hello Java");  //'ln' will insert empty line before next print
		System.out.println(90);
		multiplication();
		System.out.println("back to main");
	}
	static void multiplication() {
		System.out.println("inside the multiplication method");
		int a= 10;
		int y=7;
		System.out.println(a*y);
	}
}
