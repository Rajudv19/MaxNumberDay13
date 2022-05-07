package com.BridgeLabs.day13;
import java.util.Scanner;

public class MaxOfThreeNoInt {

	public static <MaxOfThreeNoInt extends Comparable> int maximumThreeNumbers(MaxOfThreeNoInt num1, MaxOfThreeNoInt num2, MaxOfThreeNoInt num3) {

		int maximumNum;

		if ((num1.compareTo(num2) > 0) && (num1.compareTo(num3) > 0)){
			maximumNum = (int) num1;  
		}
		else if (num2.compareTo(num3) > 0){
			maximumNum = (int) num2;
		}
		else{
			maximumNum = (int) num3;
		}
		return maximumNum;
	}

	public static void main(String[] args) {
		System.out.println("Code to Find maximum among 3 numbers...");
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the first, second & third no's....");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int num3=scanner.nextInt();

		int maximum=maximumThreeNumbers(num1,num2,num3);
		System.out.println("The Maximum numbers is: "+ maximum);
	}
}

