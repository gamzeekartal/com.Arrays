package com.Arrays;

public class Arrays {

	public static void main(String[] args) {	
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(sumOfNumbers(numbers));
		addOneToValues(numbers);
		invenseOrder(numbers);
		System.out.println("\n");
		addOneToListMember(numbers);
		invenseOrder(numbers);
	}
	
	
	public static int sumOfNumbers(int[] num){
		int sum=0;
		for(int i:num){
			sum+=i;
		}
		return sum;			
	}
	
	public static void invenseOrder(int[] num){
		for(int i=num.length-1; i>=0; --i){
			System.out.print(num[i] +  " ");
		}		
	}
	
	public static void addOneToValues(int[] num){
		int val=0;
		for(int i=0; i<=num.length-1; i++){
			val=num[i];
			val=val+1;
		}
	}
	
	public static void addOneToListMember(int[] num){
		for(int i=0; i<=num.length-1; i++){
			num[i]=num[i]+1;
		}		
	}
	

}
