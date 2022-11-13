package ineuronAssignment1;

import java.util.Scanner;

public class Assignment1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		// to print INEURON
		
		for(int i = 0 ;i<n; i++) {
			for(int j = 0 ; j<n;j++) {
				if(i==0 && j>(n-1)/4 && j<3*(n-1)/4 || i==(n-1) && j>(n-1)/4 && j<3*(n-1)/4 || j==(n-1)/2  ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for(int j = 0 ; j<n ; j++) {
				if(j==0 || j==(n-1) || i==j ) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
					
			}
			
			for(int j = 0 ;j<n ; j++) {
				if(j==(n-1)/4 || i==0 && j>(n-1)/4 && j<=3*(n-1)/4 || i == (n-1)/2 && j>(n-1)/4 && j<=3*(n-1)/4 
						|| i == (n-1) && j>(n-1)/4 && j<=3*(n-1)/4) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			
			for(int j = 0; j <n ; j++) {
				if(j==(n-1)/4 && i<(n-1) || i==(n-1) && j>(n-1)/4 && j < 3*(n-1)/4 || j==3*(n-1)/4 && i<(n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for(int j = 0 ; j<n ; j++) {
				if(j==(n-1)/2 || i==0 && j>(n-1)/2 && j<(n-1) || j== (n-1) && i>0 && i<(n-1)/2  
						|| i==(n-1)/2 && j>(n-1)/2 && j<(n-1) || i>(n-1)/2 && i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for(int j = 0 ; j<n ; j++) {
				if(i==0&& j>(n-1)/4 && j<3*(n-1)/4 || i==(n-1) && j>(n-1)/4 && j<3*(n-1)/4 || j==(n-1)/4 && i>0 && i<(n-1)||
						j==3*(n-1)/4 && i>0 && i<(n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for(int j = 0 ; j<n ; j++) {
				if(j==0 || j==(n-1) || i==j ) {
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
