package com.lab2.practice2;

public class MergeSort {

	public int[] sort(int[] denominations, int left, int right)
	{
		// Merge sort implementation for descending order
		
		if (left < right)
	    {
	        int midpoint = (left + right) / 2;
	 
	        sort(denominations, left, midpoint);
	        sort(denominations , midpoint + 1, right);
	 
	        merge(denominations, left, midpoint, right);
	    }
	    
	    return denominations;
	}

	public void merge(int[] denominations, int left, int midpoint, int right)
	{
	    int size1 = midpoint - left + 1;
	    int size2 = right - midpoint;
	 
	    int[] leftArray = new int [size1];
	    int[] rightArray = new int [size2];
	 
	    for (int i = 0; i < size1; i++) {
	        leftArray[i] = denominations[left+i];
	    }
	    
	    for (int j = 0; j < size2; j++) {
	        rightArray[j] = denominations[midpoint+1+j];
	    }
	    
	    
	    int i = 0, j = 0;	 
	    int k = left;	    
	    
	    while (i < size1 && j < size2) {
	    	
	        if (leftArray[i] >= rightArray[j]) {	        	
	        	denominations[k] = leftArray[i];
	            i++;
	        }
	        else {	        	
	        	denominations[k] = rightArray[j];
	            j++;
	        }
	        k++;
	    }
	 
	    while (i < size1) {    	
	    	denominations[k] = leftArray[i];
	        i++;
	        k++;
	    }
	 
	    while (j < size2) {	    	
	    	denominations[k] = rightArray[j];
	        j++;
	        k++;
	    }
	}
	
}
