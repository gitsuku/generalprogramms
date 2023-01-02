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
	/*
*	 *
**
***
****
*****
******

	 */
	
public static void numPyramid() {
	for(int i=0; i<=6; i++) {
		for(int j=0; j<=i; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
/*
0
01
012
0123
01234
012345
0123456
 */
public static void revpyramid(){
	for(int i=6; i>=1; i--) {
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
/*
******
*****
****
***
**
*
 */
public static void py() {
	for(int i=1; i<10; i++) {
		for(int j=1; j<i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

}

public static void numWithout_reassigning() {

	int length=10; int num=0;
	for(int i=1; i<length; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print(num +" ");
			num = num+1;
			
		}
		System.out.println();
	
	}
}
/*
0 
1 2 
3 4 5 
6 7 8 9 
10 11 12 13 14 
15 16 17 18 19 20 
21 22 23 24 25 26 27 
28 29 30 31 32 33 34 35 
36 37 38 39 40 41 42 43 44 
 */

public static void rev() {
	String s= "sukumar";
	//char ch[] = s.toCharArray();
	String rev="";
	for(int i= s.length()-1; i>=0; i--) {
		rev= rev+ s.charAt(i);
	}
	System.out.println(rev);
	
	
}
public static void numWithout_reassigning1() {

	int length=10; int num=0;
	int count=1;
	for(int i=1; i<length; i++) {
		for(int j=1; j<=3; j++) {
			System.out.print(num +" ");
			num = num+1;
			
		}
		System.out.println();
	}
	
	}
/*
0 1 2 
3 4 5 
6 7 8
 */

	public static void main(String[] args) {
		pyramid1();
		numPyramid(); 
		revpyramid();
		py();
		rev();
		numWithout_reassigning();
		
		numWithout_reassigning1();
			}
}
