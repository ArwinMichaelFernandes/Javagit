package gitdemo;

import java.util.Scanner;

public class gittest {
	
	int sum;
	
	int add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int num1=scan.nextInt();
		System.out.println("Enter Number 2");
		int num2=scan.nextInt();
		sum=num1+num2;
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		gittest t = new gittest();
        System.out.println("The Sum of numbers is "+t.add());
	}

}
