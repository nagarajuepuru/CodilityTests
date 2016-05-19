package com;

import java.util.HashMap;

public class PapsTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String solution(String S){
		String finalReq = S;
		
		HashMap<String, String> basicRules = new HashMap<String, String>();
		basicRules.put("AB", "AA");
		basicRules.put("BA", "AA");
		basicRules.put("CB", "CC");
		basicRules.put("BC", "CC");
		basicRules.put("AA", "A");
		basicRules.put("CC", "C");
		
		while (S.length() > 1) {
			
			
		}
		
		return finalReq;
		
	}
}
