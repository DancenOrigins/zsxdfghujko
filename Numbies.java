package trsdfcykfxdi;

import java.util.Scanner;

public class Numbies {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("gimme a number divisible by 2 or 3");
		double Nymbo = scanner.nextDouble();
		double NymboMod3 = (Nymbo % 3);
		double NymboMod2 = (Nymbo % 2);
		
		if (NymboMod2 == 0){
			System.out.println("this number is divisible by two");
		}else if (NymboMod3 == 0){
			System.out.println("this number is divisible by three");
		}else{
			System.out.println("this number isn't anything you idyot");
		}
		scanner.close();
		

	}

}
