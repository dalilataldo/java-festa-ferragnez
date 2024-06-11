package com.ferragnez.party;

import java.util.Arrays;
import java.util.Scanner;
 
public class CheckGuest {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digita il tuo nome");
		String userName = input.nextLine();
		
		String[] guest = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
		
		boolean nameFound = false;
		
		for (int index = 0 ; index < guest.length ; index++) {	
			
			
				if (Arrays.asList(guest).contains(userName)){
					nameFound = true;
					System.out.println("Puoi entrare");
					break;
				} 	
				
				else { System.out.println("Non puoi entrare");
				       nameFound = false;
				       break;
					
				}
			
	   }
		
     }
}

