package simple_projrams;

public class pyramid {
	
	public static void pyramid1() {
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
public static void numPyramid() {
	for(int i=0; i<=6; i++) {
		for(int j=0; j<=i; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
public static void revpyramid(){
	for(int i=6; i>=1; i--) {
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
	public static void main(String[] args) {
		pyramid1();
		numPyramid(); revpyramid();
			}
}
