package com.rackerrank.exe03;

public class StairCase {

	public static void main(String[] args) {
		int n = 6;
		for(int i = 1; i <= n; i++) {
			int spaces = n - i;
			int stair = n - spaces;
			if(spaces == n) {
				for(int u = 0; u < spaces; u++)
					System.out.print("#");
				break;
			}
			for(int s = 0; s < spaces; s++)
				System.out.print(" ");
			for(int s = 0; s < stair; s++)
				System.out.print("#");
			System.out.println();
		}
	}
	
}
