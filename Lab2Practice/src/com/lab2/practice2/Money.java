package com.lab2.practice2;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		
		// declaring input variables
		int size = 0, amount = 0;
		
		Scanner sc = new Scanner(System.in);
		
				
		// getting inputs size from user
		System.out.println("Enter the size of currency denominations ");
		size = sc.nextInt();
			
		// declaring and Initializing array with size
		int[] denominations = new int[size];
				
		// getting array values in a loop
		System.out.println("Enter the currency denominations value ");
		for(int i = 0; i < size; i++) {
			
			denominations[i] = sc.nextInt();
		}
		
		// getting amount from user
		System.out.println("Enter the amount you want to pay ");
		amount = sc.nextInt();
		
		
		// sorting the array of denominations in descending order
		MergeSort merge = new MergeSort();
		denominations = merge.sort(denominations, 0, denominations.length-1);
		
		// get denominations split-up
		getDemonimations(amount, denominations);
		
		
		// closing scanner
		sc.close();		

	}

	private static void getDemonimations(int amount, int[] denominations) {
		
		int balance = amount;
		int[] count = new int[denominations.length];
		
		// get minimum no of notes in denominations split-up
		try {
			
			for(int i = 0; i < denominations.length; i++) {			
				
				if(balance > 0 && balance >= denominations[i]) {
					
					count[i] = balance / denominations[i];
					balance = balance % denominations[i];
				}
			}
			
			if(balance > 0 || amount == 0) {
				System.out.println("Entered amount cannot be equally split-up with the given currency value of notes");
			}
			else {
				System.out.println("Your payment approach in order to give min no of notes will be ");
				
				for(int i = 0; i < denominations.length; i++) {
					
					if(count[i] > 0) {
						System.out.println(denominations[i] + ": " + count[i]);
					}
				}
			}
		}
		catch (ArithmeticException e) {
			
			System.out.println(e + " :: Invalid demonimation count for denomination 0");
		}
	}

}
