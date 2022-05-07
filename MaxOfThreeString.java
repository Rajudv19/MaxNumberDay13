package com.BridgeLabs.day13;
import java.util.Scanner;

public class MaxOfThreeString {
	public static <MaxOfThreeString extends Comparable> String maximumThreeNumbers(MaxOfThreeString name1, MaxOfThreeString name2, MaxOfThreeString name3) {

		String maximumNum;

		if ((name1.compareTo(name2) > 0) && (name1.compareTo(name3) > 0)){
			maximumNum = (String) name1;  
		}
		else if (name2.compareTo(name3) > 0){
			maximumNum = (String) name2;
		}
		else{
			maximumNum = (String) name3;
		}
		return maximumNum;
	}

	public static void main(String[] args) {
		System.out.println("Code to Find maximum among 3 numbers...");
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the first, second & third no's....");
		String name1=scanner.next();
		String name2=scanner.next();
		String name3=scanner.next();

		String maximum=maximumThreeNumbers(name1,name2,name3);
		System.out.println("The Maximum numbers is: "+ maximum);
	}
}