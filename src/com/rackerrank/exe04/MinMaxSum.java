package com.rackerrank.exe04;

public class MinMaxSum {

	public static void main(String[] args) {
		// int[] arr = new int[] {5, 3, 2, 4, 1};
		int[] arr = new int[] {7, 69, 2, 221, 8974};
		// int[] arr = new int[] {256741038, 623958417, 467905213, 714532089, 938071625};
		// int[] arr = new int[] {5, 5, 5, 5, 5};
		int tamArr = arr.length, me = arr[0], ma = arr[0];
        long sumMin = 0, sumMax = 0;
        for(int i = 0; i < tamArr; i++) {
            if(arr[i] < me)
                me = arr[i];
            if(arr[i] > ma)
                ma = arr[i];
        }
        if(me == ma) {
            for(int i = 0; i < tamArr; i++) {
                sumMax += arr[i];
                sumMin += arr[i];
            }
            sumMax -= me;
            sumMin -= ma;
        }else {
            for(int i = 0; i < tamArr; i++) {
                if(arr[i] != me)
                    sumMax += arr[i];
                if(arr[i] != ma)
                    sumMin += arr[i];
            }
        }        
        System.out.print(sumMin+" "+sumMax);
		System.exit(0);
	}
}
