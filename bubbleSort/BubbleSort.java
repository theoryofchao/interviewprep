package bubbleSort;

import java.util.Arrays;

public class BubbleSort {
	
	public static void bubbleSort(int[] input){
		
		//if input size is 1 consider it sorted
		if(input.length<2){
			return;
		}
		
		int swap=0;
		
		for(int i=0; i<input.length; i++){
			for(int j=1; j<(input.length-i); j++){
				if(input[j-1] > input[j]){
					swap=input[j-1];
					input[j-1]=input[j];
					input[j]=swap;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] input = {5,2,6,4,1,9,8,7};
		bubbleSort(input);
		System.out.println(Arrays.toString(input));
	}

}
