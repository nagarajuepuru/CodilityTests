package com;

import java.util.Arrays;
import java.util.Collections;

public class CircularRotation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {};
		int k = 3;
		System.out.println("Array is-->"+Arrays.toString(solution(A, k)));
	}
	
	public static int[] solution(int[] A, int k){
		if(A.length > 1){
			int[] B = new int[A.length];
			System.out.println("Array length-->"+A.length);
			int shiftPositions = k%A.length;
			System.out.println("shiftPositions-->"+shiftPositions);
			for(int i=0;i<A.length;i++){
				System.out.println("shiftPositions 77777-->"+(i+shiftPositions));
				if((i+shiftPositions) >= A.length){
					int diff = (i+shiftPositions) - A.length;
					B[diff] = A[i];
				}else{
					System.out.println("99999");
					B[i+shiftPositions] = A[i];
				}
			}
			return B;
		}
		return null;
	}
}
