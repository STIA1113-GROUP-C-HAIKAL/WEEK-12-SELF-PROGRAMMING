package myMethod;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Haikal";
		int y = 17;
		double z = 55;
		System.out.println("Hello World");
		showMethod();
		showMethod1(x);
		showMethod2(y);
		showMethod3(z);
		showMethod4(z);
		
	}
	
	public static void showMethod() {
		System.out.println("Hello Malaysia");
	}
	
	public static void showMethod1 (String x) {
		System.out.println("My name is " + x);
	}
	public static void showMethod2(int y) {
		System.out.println("I am " + (y + 2) + " years old");
	}
	
	public static void showMethod3(double z) {
		double a = (((z + 5 * 25) - 55)* 360) / 100;
		System.out.println("The result is " + a);
	}
	
	public static void showMethod4(double z) {
		double a = 250 * 50 / 100;
		if (a < 55) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Pass");
		}
		System.out.println(a);
	}
}
