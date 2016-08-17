package insertionSort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void insertionSort(int[] input){
		
		//if input size is 1 consider it sorted
		if(input.length < 2){
			return;
		}
		
		
		int temp;	//temporary variable to hold element that gets moved
		for(int i=1; i<input.length; i++){	//1. Consider the first element "sorted" go through every other element
			for(int j=i; j>0; j--){			//2. Go backwards and check where to put into the sorted portion
				if(input[j] < input[j-1]){
					temp=input[j];
					input[j]=input[j-1];
					input[j-1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] input = {5,2,6,4,1,9,8,7};
		insertionSort(input);
		System.out.println(Arrays.toString(input));
	}

}
