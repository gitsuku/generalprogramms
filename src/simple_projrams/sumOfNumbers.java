package simple_projrams;

public class sumOfNumbers {
	public static void main(String[] args) {
		int sum = sumofNum(123);
		System.out.println(sum);
		
	}
	public static int sumofNum(int num) {
		
		int sum=0;
		while(num != 0) {

			//finds the last digit from the number and add it to the variable sum
			sum = sum +num %10;
			//removes the last digit  
			num= num/10;
		}
		return sum;
	}

}
