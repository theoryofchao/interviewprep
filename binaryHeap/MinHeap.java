package binaryHeap;

import java.util.PriorityQueue;

/*
 * Implementation of MinHeap Using Priority Queue
 */
public class MinHeap {
	PriorityQueue<Integer> pq;
	
	public MinHeap(){
		this.pq = new PriorityQueue<Integer>();
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
	
	public int extractMin(){
		return this.pq.poll();
	}
	
	public int getSize(){
		return this.pq.size();
	}
	
	public void print(){
		System.out.println(this.pq);
	}
}
