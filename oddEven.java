package com.test;
import java.util.Scanner;

public class oddeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		for(int i=2; i<=n; i+=2) {
			System.out.println(i + " ");
		} System.out.println("\n");
		
		int i=1;
		while(i<=n) {
			System.out.println(i + " ");
			i += 2;
		}
		
		sc.close();
				
	}

}
