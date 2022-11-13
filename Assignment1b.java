package ineuronAssignment1;

import java.util.Scanner;

public class Assignment1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");//4
		int n = sc.nextInt();
		for(int i = 1 ; i<=n ;i++) {
			for(int j = 1 ; j<=n ; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		

	}

}
