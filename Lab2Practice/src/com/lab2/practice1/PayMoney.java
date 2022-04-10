package com.lab2.practice1;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		
		// declaring input variables
		int size = 0, target = 0;
		int[] transaction = null;
		
		Scanner sc = new Scanner(System.in);
		
		// getting inputs size from user
		System.out.println("Enter the size of transaction array ");
		size = sc.nextInt();
		
		// initializing array with size
		transaction = new int[size];
		
		// getting array values in a loop
		System.out.println("Enter the values of array ");
		for(int i = 0; i < size; i++) {
			
			transaction[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved ");
		target = sc.nextInt();
		
		for(int i = 0; i < target; i++) {
			
			System.out.println("Enter the value of target ");
			checkIfTransactionAchieved(sc.nextInt(), transaction);			// checking if transaction is achieved
		}
		
		// closing scanner
		sc.close();

	}

	private static void checkIfTransactionAchieved(int target, int[] transaction) 
	{
		int sum = 0, position = 0;
		
		// checking if transaction is achieved
		while(target > sum && position < transaction.length) {
			
			sum += transaction[position++];
		}
		
		
		if(position >= transaction.length) {			
			System.out.println(" Given target is not achieved");
		}
		else {			
			System.out.println("Target achieved after " + position + " transactions");
		}
	}

}
