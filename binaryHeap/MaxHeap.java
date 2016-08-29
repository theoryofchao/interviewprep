package binaryHeap;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * Implementation of MaxHeap Using Priority Queue
 * The Comparator is overridden to change how priority queue works
 */
public class MaxHeap {
	PriorityQueue<Integer> pq;
	
	public MaxHeap(){
		this.pq = new PriorityQueue<Integer>(10, new Comparator<Integer>(){

			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return arg0 - arg1;
			}
			
		});
	}
	
	public void insert(int value){
		this.pq.add(value);
	}
	
	public void insert(int[] values){
		for(int value: values){
			this.pq.add(value);
		}
	}
	
	public int peek(){
		return pq.peek();
	}
	
	public int extractMax(){
		return this.pq.poll();
	}
	
	public int getSize(){
		return this.pq.size();
	}
	
	public void print(){
		System.out.println(this.pq);
	}
}
