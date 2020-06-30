package de.lobster.testen;

public class DemoClass {

	public static void main(String[] args) {
		DemoClass a = new DemoClass();
		double res1 = a.execute(2, 3);
		double res2 = a.add(2, 2);
		System.out.println(res1);
		System.out.println(res2);

	}

	public double execute(double a, double b) {
		return a * b;
	}
	
	public int add(int a, int b) {
		return a + b;
	}
}
