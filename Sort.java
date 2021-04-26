import java.io.*;

class Sort {
	public static void main(String args[]) {
		int numbers[] = { 43, 23, 54, 62, 10 };
		System.out.print("the numbers before sorting are: " );
		//to print the array
		for(int index=0;index<numbers.length;index++) {
			System.out.print(numbers[index]+" | ");
			
		}
		for (int rounds = 0; rounds < numbers.length; rounds++) {
			for (int index = 0; index < numbers.length-1; index++) {
				if (numbers[index] < numbers[index + 1]) {
					int temp = numbers[index];
					numbers[index] = numbers[index + 1];
					numbers[index + 1] = temp;
				}
			}
			
		}
		System.out.print("\nthe numbers after sorting  are: " );
		for(int index=0;index<numbers.length;index++) {
			System.out.print(numbers[index]+" | ");
		}
	
	}
}
