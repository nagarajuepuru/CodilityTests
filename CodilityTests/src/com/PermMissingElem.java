package com;

public class PermMissingElem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4,6,7};
		System.out.println("missingElem-->"+solution(A));
		
	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
                int sum = 0;
        int arrLen = A.length;
        int i =0;
        for(i=0; i< arrLen; i++) {
        	sum+=(i+1);
            sum-=A[i];
        }
        sum+=(i+1);
        //System.out.println("result :: "+sum);
        return sum;
    }
}
