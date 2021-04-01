package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
	public static void main(String[] args) {
		// 1. declare and Initialize an array 5 Strings
		String[] fruit = new String[5];

		fruit[0] = "banana";
		fruit[1] = "apple";
		fruit[2] = "strawberry";
		fruit[3] = "watermelon";
		fruit[4] = "blackberries";
		// 2. print the third element in the array
		System.out.println("Fruit of choice is " + fruit[2]);

		// 3. set the third element to a different value
		fruit[2] = "orange";
		// 4. print the third element again
		System.out.println("Fruit of choice is " + fruit[2]);

		// 5. use a for loop to set all the elements in the array to a string
		// of your choice
		for (int i = 0; i < fruit.length; i++) {
			fruit[i] = "watermelon";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		System.out.println("Here's the array of fruit:\n");

		for (int i = 0; i < fruit.length; i++) {
			String s = fruit[i];
			System.out.println("Fruit " + i + " is " + s);
		}
		System.out.println("\n");

		// 7. make an array of 50 integers
		int[] ints = new int[50];
		Random random = new Random();
		// 8. use a for loop to make every value of the integer array a random
		// number
		for (int i = 0; i < ints.length; i++) {
			ints[i] = random.nextInt(1000000);
			System.out.println(ints[i]);
		}

		// 9. without printing the entire array, print only the smallest number
		// on the array
		int smallestInt = ints[0];
		for (int i = 1; i < ints.length; i++) {
			if (ints[i] < smallestInt) {
				smallestInt = ints[i];
			}
		}

		System.out.println("smallest integer is " + smallestInt);

		// 10 print the entire array to see if step 8 was correct

		// 11. print the largest number in the array.
		int largestInt = ints[ints.length - 1];
		for (int i = ints.length - 2; i >= 0; i--) {
			if (ints[i] > largestInt) {
				largestInt = ints[i];
			}
		}
		System.out.println("largest integer is " + largestInt);
		// 12. print only the last element in the array
System.out.println("last number is "+ints[ints.length-1]);
	}
}
