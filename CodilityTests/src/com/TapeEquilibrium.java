package com;

public class TapeEquilibrium {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,1,4,2,4,3};
		System.out.println("minAbsoluteDiff-->"+getAbsoluteDifference(A));
	}
	
	public static int getAbsoluteDifference(int A[]){
		int minAbsoluteDiff = 0;
		try {
			
			int N = A.length;
			int totalSum = 0;
			if(N>2){
				for(int i=0;i<A.length;i++){
					totalSum += A[i];
				}
			}else if(N == 1){
				return Math.abs(A[0]);
			}else if(N == 2){
				return Math.abs(A[0] - A[1]);
			}
				int tempSum = 0;
				int temp1 = 0;
				for(int j=0;j<A.length-1;j++){
					temp1 +=A[j];
					tempSum = temp1;
					int sum1 = totalSum - tempSum;
					int sum2 = Math.abs(sum1 - tempSum);
					if(j==0){
						minAbsoluteDiff = sum2;
					}else{
						if(sum2 < minAbsoluteDiff){
							minAbsoluteDiff = sum2;
						}
					}
				}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return minAbsoluteDiff;
	}
}
