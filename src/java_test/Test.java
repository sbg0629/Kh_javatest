package java_test;

import java.util.Random;

public class Test {
public static void main(String[] args) {
	Random rd = new Random();
	int sum =0;
	int[][] array = new int[3][4];
	
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 4; j++) {
			array[i][j]=rd.nextInt(10);
			sum += array[i][j];
		}	
	}
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 4; j++) {
			System.out.print(array[i][j]+"\t");
		}
		System.out.println();
	}
	System.out.println("합은 "+sum);
}
}
