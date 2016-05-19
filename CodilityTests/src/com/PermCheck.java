package com;

import java.util.HashSet;

public class PermCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4};
		System.out.println("Is permutted array-->"+isPermArray(A));
	}
	
	public static int isPermArray(int[] A){
		int missingInteger = 1;
		int sum = 0;
		int maxNum = 0;
		boolean cutLogic = false;
		HashSet<Integer> sett1 = new HashSet<Integer>();
		if(A.length == 1 && A[0]>1){
			return 0;
		}
		for(int i=0;i<A.length;i++){
			sum += A[i];
			if(sett1.contains(A[i])){
				cutLogic = true;
				break;
			}else{
				sett1.add(A[i]);
			}
			if(A[i] > maxNum){
				maxNum = A[i];
			}
		}
		if(cutLogic){
			return 0;
		}
		int reqdSum = (maxNum*(maxNum+1))/2;
		//System.out.println("sum--"+sum+"--reqdSum--"+reqdSum+"--diff--"+(reqdSum-sum));
		if((reqdSum - sum) > 0){
			missingInteger = 0;
		}
		
		return missingInteger;
	}
}
