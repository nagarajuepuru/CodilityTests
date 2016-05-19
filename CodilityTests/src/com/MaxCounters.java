package com;

import java.util.Arrays;

public class MaxCounters {

	/**
	 * 100% correctness but only 60% performance
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {3,4,4,6,1,4,4}; 
		int[] reqdArray = maxCountersMethod(5, inputArray);
		System.out.println("Final Required Array-->"+Arrays.toString(reqdArray));
	}
	
	public static int[] maxCountersMethod(int N, int[] A){
		int[] finalArray = null;
		try {
			if(A.length > 0 && N > 0){
				finalArray = new int[N];
				int maxCounterVal = 0;
				for(int j=0; j<A.length; j++){
					if( A[j] == N+1){
						finalArray = initializeArray(maxCounterVal, finalArray);
					}else{
						finalArray[A[j]-1] = finalArray[A[j]-1] + 1;
						if(maxCounterVal < finalArray[A[j]-1]){
							maxCounterVal = finalArray[A[j]-1];
						}
					}
					System.out.println("Array print in loop-->"+Arrays.toString(finalArray));
				}
			}
			
		} catch (Exception e) {
			System.out.println("Exception occured-->"+e);
		}
		return finalArray;
	}
	
	
	public static int[] initializeArray(int defaulval, int[] finalArray){
		java.util.Arrays.fill(finalArray, defaulval);
		System.out.println("Array in fn initializeArray-->"+Arrays.toString(finalArray));
		return finalArray;
	}

}
