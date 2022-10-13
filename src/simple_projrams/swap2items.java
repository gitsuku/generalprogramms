package simple_projrams;

public class swap2items {
	public static void swapString(String first, String last) {
		last = first+last;
		first = last.substring(first.length());
		last = last.substring(0, last.length() -first.length());
		System.out.println("first "+first);
		System.out.println("last is "+last);
	}
	public static void swapNum(int a, int b) {
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("a value "+a);
		System.out.println("b value "+b);
		System.out.println();
	}
public static void main(String[] args) {
	swapString("sukumar", "reddy");
	swapNum(10, 5);
}
}
