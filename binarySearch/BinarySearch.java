package binarySearch;

public class BinarySearch {
	
	public static int binarySearch(int[] input, int search){
		int low=0;
		int high=input.length;
		int mid;
		
		while(low<=high){
			mid=(low+high)/2;
			if(input[mid]<search){
				low=mid+1;
			}
			else if(input[mid]>search){
				high=mid-1;
			}
			else{
				return mid;
			}
		}
		return -1;	//error
	}
	
	public static int recursiveBinarySearch(int[] input, int search){
		int low=0;
		int high=input.length;
		
		return recursiveBinarySearch(input, search, low, high);
	}
	
	public static int recursiveBinarySearch(int[] input, int search, int low, int high){
		if(low>high){
			return -1;
		}
		
		int mid = (low+high)/2;
		if(input[mid]>search){
			return recursiveBinarySearch(input, search, low, mid-1);
		}
		else if(input[mid]<search){
			return recursiveBinarySearch(input, search, mid+1, high);
		}
		else{
			return mid;
		}
		
	}

	public static void main(String[] args) {
		int[] input = {1,2,3,4,5,6,7,8};
		int result = recursiveBinarySearch(input, 5);
		System.out.println(result);
	}

}
