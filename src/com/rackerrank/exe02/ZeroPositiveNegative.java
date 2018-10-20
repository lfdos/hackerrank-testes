package com.rackerrank.exe02;

import java.text.DecimalFormat;

public class ZeroPositiveNegative {
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.000000");
		int[] arr = new int[] {-4, 3, -9, 0, 4, 1};
		int qtZero = 0, qtPositive = 0, qtNegative = 0;
		float tamArr = arr.length;
        for(int i = 0; i < tamArr; i++){
            if(arr[i] == 0)
            	qtZero++;
            else if(arr[i] > 0)
            	qtPositive++;
            else if(arr[i] < 0)
            	qtNegative++;
        }
        System.out.println(tamArr);        
        System.out.println(df.format(qtPositive/tamArr));
        System.out.println(df.format(qtNegative/tamArr));
        System.out.println(df.format(qtZero/tamArr));
	}

}
