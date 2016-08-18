package quickSort;

import java.util.Arrays;

public class QuickSort {
	
	public static void quickSort(int[] input){
		//if input size is 1 consider it sorted
		if(input==null || input.length<2){
			return;
		}
		
		//not a good way to find a low and a high, usually quicksorts will have a method of calculating that
		quickSort(input, 0, input.length-1);	
	}
	
	public static void quickSort(int[] input, int low, int high){
		int index = partition(input, low, high);	//sort the input based around the pivot found by low and high
		
		if(low < index-1){	//if low smaller than index-1, sort the left half
			quickSort(input, low, index-1);
		}
		
		if(index < high){	//if index smaller than high, sort the right half
			quickSort(input, index, high);
		}
	}
	
	public static int partition(int[] input, int low, int high){
		int pivot=input[(low+high)/2];	//find the pivot based on the low and high
		
		while(low<=high){
			while(input[low] < pivot){
				low++;
			}
			while(input[high] > pivot) {
				high--;
			}
			
			if(low <= high){
				int temp = input[low];
				input[low]=input[high];
				input[high]=temp;
				low++;
				high--;
				
			}
		}
		return low;
	}

	public static void main(String[] args) {
		int[] input = {5,2,6,4,1,9,8,7};
		quickSort(input);
		System.out.println(Arrays.toString(input));
	}

}
