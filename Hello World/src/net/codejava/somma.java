package net.codejava;
import java.util.Scanner;

public class somma {

	public static void main(String[] args) {
		
		double Somma = 0.0;
		double V = 0.0;
		int n_valori = 0;
		Scanner read = new Scanner (System.in);
		
		System.out.print("Valore: ");
		V = read.nextDouble();
		
		while(V != 0){
			n_valori++;
			Somma += V;
			System.out.print("Valore: ");
			V = read.nextDouble();
		}
		
		System.out.println();
		System.out.println("Numero di valori: " + n_valori);
		System.out.print("Somma: " + Somma);
	}

}
