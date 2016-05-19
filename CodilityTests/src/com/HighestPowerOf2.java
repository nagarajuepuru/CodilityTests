package com;

public class HighestPowerOf2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("final Value is-->"+findHighestPowerOf2(1));
	}

	public static int findHighestPowerOf2(int N){
		int powerVal = 0;
		int incrementVal = 1;
		while(N > 0){
			int val1 = (int) Math.pow(2, incrementVal);
			System.out.println("val1-->"+val1);
			int modVal = N%val1;
			System.out.println("modVal-->"+modVal);
			if(modVal !=0){
				System.out.println("incrementVal-->"+incrementVal);
				powerVal = incrementVal-1;
				break;
			}
			incrementVal++;
		}
		return powerVal;
	}
}
