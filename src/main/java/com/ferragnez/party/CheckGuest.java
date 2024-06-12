package com.ferragnez.party;

import java.util.Arrays;
import java.util.Scanner;
 
public class CheckGuest {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		//faccio inserire il nome all'utente
		System.out.println("Digita il tuo nome");
		String userName = input.nextLine();
		
		String[] guest = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
		
		boolean nameFound = false;
		
		//ciclo for per determinare se il nome inserito è in lista
		
		//OPZIONE 1 CON ARRAYS.ASLIST.CONTAINS
		/*for (int i = 0 ; i < guest.length ; i++) {	
						
			if (Arrays.asList(guest).contains(userName)){
				nameFound = true;
				break;
				} 				
	     }*/
		
		//OPZIONE 2 CON .EQUALS
		for (int i = 0; i < guest.length ; i++) {
			if (userName.toLowerCase().equals(guest[i].toLowerCase())) {
				nameFound = true; 
				break;
			}
		}
		
		//OPZIONE 3 CON CICLO WHILE
		/*int i = 0;
		while (!nameFound && i < guest.length) {
			if (userName.toLowerCase().equals(guest[i].toLowerCase())) {
				nameFound = true;
			}
			i++;
		}*/
		
		//se la condizione si avvera, puoi entrare --> altrimenti, non puoi entrare
		if (nameFound) {
		System.out.println("Puoi entrare");
		}
		
		else {System.out.println("Non puoi entrare");		
        }
		
		
     }
}

