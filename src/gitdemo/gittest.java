package gitdemo;

import java.util.Scanner;

public class gittest {
	
	int sum,sub,num1,num2;
	
	int add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number 1");
	    num1=scan.nextInt();
		System.out.println("Enter Number 2");
		num2=scan.nextInt();
		sum=num1+num2;
		return sum;
	}
	int sub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number 1");
	    num1=scan.nextInt();
		System.out.println("Enter Number 2");
		num2=scan.nextInt();
		sub=num1-num2;
		return sub;
	}
	
	
	public static void main(String[] args) {
		
		gittest t = new gittest();
        System.out.println("The Sum of numbers is "+t.add());
        System.out.println("The Sub of numbers is "+t.sub());
	}

}
