package ArrayOp;

import java.util.ArrayList;

public class ArrayListOperations {

	public static void removeOddNumbers(ArrayList <Integer> number) {
		System.out.println("Inputs-> "+number);
		number.removeIf(n->n%2 != 0);
		System.out.println("After removing odd numbers,");
		System.out.println("Output-> "+number);
	}
	
	public static void doubleEvenNumbers(ArrayList <Integer> number) {
		ArrayList <Integer> Dlist = new ArrayList<>();
		
		for(int num: number) {
			if(num%2 == 0) {
				num=num*2;
				Dlist.add(num);
			}
		}
		System.out.println("After doubling even numbers,");
		System.out.println("Output-> "+Dlist);
	}
}
