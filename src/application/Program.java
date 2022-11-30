package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Dados[] vect = new Dados[n];
		System.out.println();
		
		double sum = 0.0;
		int cont = 0;
		for(int i = 0; i < n; i++) {
		   System.out.println("Dados da " + (i + 1) + "º pessoa:");
		   System.out.print("Nome: ");
		   sc.nextLine();
		   String nome = sc.nextLine();
		   System.out.print("Idade: ");
		   int idade = sc.nextInt();
		   System.out.print("Altura: ");
		   double altura = sc.nextDouble();
		   
		   
		   vect[i] = new Dados(nome, idade, altura);  
		   System.out.println();
		  
		   
		   sum += altura;
		   if (idade < 16) {
			  cont++; 
			  
		   }
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "º pessoa: ");
			System.out.println(vect[i].toString());
		}
		
		
		double media = sum/n;
		double percent = (cont * 100.0)/n;
		
		System.out.println();
		System.out.println("Altura media:" + media );
		System.out.println("Pessoas com menos de 16 anos: " + percent + "%");
	
		
		
		
		
		
		sc.close();
	}

}
