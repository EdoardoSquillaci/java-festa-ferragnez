package com.ferragnez.party;


import java.util.Scanner; //scanner

public class CheckGuest { //inizio classe

	
	
	
	public static void main(String[] args) { //inizio main
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner (System.in); //scanner
		
		
		
		//array lista
		
		String [] listaInvitati = {  "Edoardo" , "Luca" , "Mario" , "Giovanni" , "Marco" , "Matteo" , "Laura" , "Lucrezia"};
		
		
		
		//input utente
		
		System.out.println("Inserisci il tuo nome per verificare l'invito");
		
		
		
		String inputNomeUtente  = scanner.nextLine();
		
		//Istruzioni condizionali di verifica con if
				
		
		//dichiarazione valore booleano di partenza
		boolean found = false;
		
		for (String invitato : listaInvitati){ //ciclo per vedere se l'utente è invitato: attribuisco a lista invitati una stringa/elemento (invitato) per poterlo iterare con ogni elemento dell'array e compararlo con l'input utente
			
			
			
			
			
		
			if (inputNomeUtente.equals(invitato)) { //if per verificare se l'input inserito dall'utente ritorna un valore booleano dato dall'uguaglianza con uno degli elementi nell'array, .equals è un metodo utilizzato per verificare uguaglianze dentro array Java
				
				found = true; //valore booleano risultante in caso in cui input e l'elemento invitato corrispondano
				
				break;} //fine istruzione condizionale
		
		
		}//fine ciclo
			
		
	//output in console
		
		
		if (found) {
			
			
			System.out.printf("Il tuo nome è in lista, puoi entrare alla festa");
			
		}else {
			
			
			System.out.printf("Il tuo nome non è nella lista, non puoi entrare");
			
		} //fine output
	
	
	
	}// fine main
			
		
		
		
		
	}//fine classe

