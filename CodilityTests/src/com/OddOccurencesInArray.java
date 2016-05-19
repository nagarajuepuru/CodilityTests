package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class OddOccurencesInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {9, 3, 9, 3, 9, 7, 9};
		System.out.println("OddValue-->"+getOddOccurence(A, A.length));
	}
	
	public static int getOddOccurence(int A[],int N){
		int oddNumberOut = -1;
		try {
			HashMap<Integer, Integer> reqdMap = new HashMap<Integer, Integer>();
			for(int i=0;i<A.length;i++){
				if(reqdMap.containsKey(A[i])){
					//reqdMap.put(A[i], reqdMap.get(A[i])+1);
					reqdMap.remove(A[i]);
				}else{
					reqdMap.put(A[i], 1);
				}
			}
			Iterator it = reqdMap.entrySet().iterator();
			 while (it.hasNext()) {
		        @SuppressWarnings("rawtypes")
				Map.Entry pairs = (Map.Entry)it.next();
		        //System.out.println("key--"+pairs.getKey()+"--value--"+pairs.getValue());
		        if((int)(Integer)pairs.getValue()==1){
		        	System.out.println("before assigning odd value--");
		        	oddNumberOut = (int)(Integer)pairs.getKey();
		        	break;
		        }
		        
			 }
		} catch (Exception e) {
			//System.out.println("Exception occured-->"+e);
		}
		return oddNumberOut;
	}
}
