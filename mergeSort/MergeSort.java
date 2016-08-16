package mergeSort;

import java.util.Arrays;

public class MergeSort {
	
	public static void mergeSort(int[] input) {
		
		//if input size is 1 consider it sorted
		if(input.length<2){
			return;
		}
		
		//helper array used for recursive mergeSort
		int[] helper = new int[input.length];
		mergeSort(input, helper, 0, input.length-1);
	}
	
	public static void mergeSort(int[] input, int[] helper, int low, int high){
		
		if (low < high){
			int middle = (low+high)/2;					//1. Find the middle of the array we are splitting
			mergeSort(input, helper, low, middle);		//2. Perform mergeSort on the left half of the array
			mergeSort(input, helper, middle+1, high);	//3. Perform mergeSort on the right half of the array
			merge(input, helper, low, middle, high);	//4. Merge the results
		}
	}
	
	public static void merge(int[] input, int[] helper, int low, int middle, int high){
		//Copy both halves into the helper array
		for(int i=low; i<=high; i++){
			helper[i]=input[i];
		}
		
		int helperLeft=low;
		int helperRight=middle+1;
		int current=low;
		
		/* 
		 * Iterate through the helper array.
		 * Compare the left and right,
		 * and copy back to the original array the smaller of the two halves
		 */
		while(helperLeft <= middle && helperRight <= high){	//To satisfy that the two arrays are comparing against each other
			if(helper[helperLeft] <= helper[helperRight]){	//Left is smaller or equivalent to right
				input[current]=helper[helperLeft];			//Then we copy the one on the left to the original array
				helperLeft++;								//Increment helperLeft to move to the next element 
			}
			else {											//Right is smaller than left
				input[current]=helper[helperRight];			//Then we copy the one on the right to the original array
				helperRight++;								//Increment helperRight to move to the next element
			}
			current++;										//Increment current so we can track which elements remain after we finish the initial sorting
		}
		
		/*
		 * Copy the remaining arrays that weren't used into the our initial array
		 */
		int remaining = middle-helperLeft;
		for(int i=0; i<=remaining; i++){
			input[current+i]=helper[helperLeft+i];
		}
		
	}

	public static void main(String[] args) {
		int[] input = {5,2,6,4,1,9,8,7};
		mergeSort(input);
		System.out.println(Arrays.toString(input));
	}

}
