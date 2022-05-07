package com.BridgeLabs.day13;
import java.util.Scanner;

public class MaxOfThreeNoFloat {
	public static <MaxOfThreeNoFloat extends Comparable> double maximumThreeNumbers(MaxOfThreeNoFloat num1, MaxOfThreeNoFloat num2, MaxOfThreeNoFloat num3) {
		double maximumNum;


		if ((num1.compareTo(num2) > 0.0) && (num1.compareTo(num3) > 0.0)){
			maximumNum = (double) num1;
		}
		else if (num2.compareTo(num3) > 0.0){
			maximumNum = (double) num2;
		}
		else{
			maximumNum = (double) num3;
		}
		return maximumNum;
	}

	public static void main(String[] args) {
		System.out.println("Code to Find maximum among 3 numbers...");
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the first, second & third no's....");
		double num1=scanner.nextDouble();
		double num2=scanner.nextDouble();
		double num3=scanner.nextDouble();

		double maximum=maximumThreeNumbers(num1,num2,num3);
		System.out.println("The Maximum numbers is: "+ maximum);
	}
}
