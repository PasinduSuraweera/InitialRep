package ArrayOp;

import java.util.ArrayList;
import java.util.Scanner;

public class TestOperations {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList <Integer> num = new ArrayList <>();
		
		System.out.println("Enter 5 Integers: ");
		
		for (int i=0 ; i<5 ;i++) {
			int nums = scanner.nextInt();
			num.add(nums);
		}
		
		scanner.close();
		
		ArrayListOperations.removeOddNumbers(num);
		ArrayListOperations.doubleEvenNumbers(num);
		
	}
	

}
