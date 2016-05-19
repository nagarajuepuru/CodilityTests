package com;

import java.util.HashMap;

public class BinaryGap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binaryval = "";
		int reqdVal = 74901729;
		int N = reqdVal;
		if(N > 0){
            while(N > 0){
               HashMap<String, Integer> abc = (HashMap<String, Integer>)commonFunctionForBinaryVal(N);
               int r = abc.get("remainder");
               int q = abc.get("quotient");
               N = q;
               binaryval = r+ ""+binaryval;
           }
       }
		String lcin = "LCIN:IN82828222";
		String phoneNum = "9246920383";
		String s1 = "Registration of new mobile number failed. UNREGISTERED NEW MOBILE NUMBER: +91 #";
		s1 = s1.replace("#", phoneNum);
		System.out.println("s1-->"+lcin+"|"+s1);
		System.out.println("binaryval-->"+binaryval);
		int finalLength = solution(reqdVal);
		System.out.println("finalLength-->"+finalLength);
		//checkForOccurences(inputText);
	}
	//Find longest sequence of zeros in binary representation of an integer.
	public static int solution(int N) {
        int finalLength = 0;
        boolean isCounterStrted = false;
        int tempLength = 0;
        if(N > 0){
             while(N > 0){
                 int remainder = 0;
                 remainder = N%2;
                 N = N/2;
                 System.out.println("remainder-->"+remainder);
                 if(remainder == 1){
                	 if(!isCounterStrted){
                		 isCounterStrted = true;
                	 }else{
                		 tempLength = 0;
                		 if(finalLength == 0){
                			 finalLength = tempLength;
                			 //isCounterStrted = false;
                		 }else if(tempLength > finalLength){
                			 finalLength = tempLength;
                		 }
                	 }
                 }else{
                	if(isCounterStrted){
                		tempLength++;
                	}
                 }
            }
        }
        return finalLength;
    }
    
    public static HashMap<String,Integer> commonFunctionForBinaryVal(int quotient){
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        int q = 0;
        int r = 0;
        String binaryVal = "";
        q = quotient/2;
        r = quotient%2;
        map1.put("remainder",r);
        map1.put("quotient",q);
        return map1;
    }

}
