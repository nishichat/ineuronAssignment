package ineuronAssignment1;

import java.util.Scanner;

public class Assignment1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		for(int i = 0 ; i<n ;i++) {
			for(int j = 0 ; j<n ; j++) {
				if( i == 0 || i+j<=(n-1)/2 || j-i >= (n-1)/2|| j == 0 || i == (n-1) || j == (n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
