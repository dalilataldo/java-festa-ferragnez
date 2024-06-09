package com.ferragnez.party;

import java.util.Scanner;
 
public class CheckGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		String[] guest = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"
		};
		
		
		
		boolean nameFound = false;
		
				for (int index = 0 ; index < guest.length ; index++) {	
					
					System.out.println("Digita il tuo nome");
					String userName = input.nextLine();
					guest[index] = userName;
					
					if (guest [index] == userName) {
						nameFound = true;
						System.out.println("Puoi entrare");
						}
					else {
						nameFound = false;
						System.out.println("Non puoi entrare");
						break;	
					}
				
				}
		
	}}
	

