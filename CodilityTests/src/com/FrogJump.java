package com;

public class FrogJump {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jumpsReq-->"+solution(1, 5, 2));
	}
	
	public static int solution(int X, int Y, int D){
		int jumpsReq = 0;
		int Q = (Y-X)/D;
		int R = (Y-X)%D;
		jumpsReq = (R!=0)? Q+1: Q;
		return jumpsReq;
	}
}
