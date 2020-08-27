package main.java.yaksha;

import java.util.Scanner;


public class BikeRaceMain {
	public static void main(String[] args) {
		BikeRace bike=new BikeRace();
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the distance travelled");
        int d=sc.nextInt();
		String bonus=bike.findBonusPoint(d);
		System.out.println(bonus);
	
	}
	
}

  