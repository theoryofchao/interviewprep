package selectionSort;

import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSort(int[] input){
		
		////if input size is 1 consider it sorted
		if(input.length < 2){
			return;
		}
		
		for(int i=0; i<input.length; i++){
			
			int index=i;	//holds the index of the smallest element going forward
			
			for(int j=i+1; j<input.length; j++){	//finds the smallest going forwards and sets it to index	
				if(input[j] < input[index]){
					index=j;
				}
			}
			
			int temp=input[index];
			input[index]=input[i];
			input[i]=temp;
		}
	}

	public static void main(String[] args) {
		int[] input = {5,2,6,4,1,9,8,7};
		selectionSort(input);
		System.out.println(Arrays.toString(input));
	}

}
