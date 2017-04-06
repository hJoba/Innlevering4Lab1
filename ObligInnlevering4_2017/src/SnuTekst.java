import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class SnuTekst {
	
	public static void baklengs(String tekst){
		// System.out.println("Teksten baklengs: " + new StringBuilder(tekst).reverse().toString());
		
		char[] chars = tekst.toCharArray();
		String newTekst = "";
		int antall =0;
		for (int i = chars.length-1;i>=0;i--) {
			newTekst+=chars[i];
		 	antall++;
		}
		System.out.println("Teksten baklengs er " + newTekst + " det er "+  antall + " bokstaver.");
		baklengs(tekst);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn en tekst: ");
		baklengs(input.nextLine());
	}
}
