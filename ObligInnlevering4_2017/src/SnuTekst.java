import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class SnuTekst {
	
	public static void baklengs(String tekst){
		System.out.println("Teksten baklengs: " + new StringBuilder(tekst).reverse().toString());
		baklengs(tekst);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn en tekst: ");
		baklengs(input.nextLine());
	}
}
