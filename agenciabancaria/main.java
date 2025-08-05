package agenciabancaria;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("\nEscolha uma opção:");
		System.out.println("1 - Saldo");
		System.out.println("2 - Depósito");
		System.out.println("3 - Saque");
		System.out.println("0 - Sair");
		System.out.println("Opção: ");
		int opcao = Integer.parseInt(input.nextLine());
		
		double Saldo = 0;
		
		switch (opcao) {
		case 1:
			System.out.println("Seu Saldo = R$" + Saldo);
			break;
		case 2:
			System.out.println("Qual valor do Depósito : ");
			double Deposito = input.nextDouble();
			Saldo = Saldo + Deposito;
			break;
		case 3:
			System.out.println("Qual valor do Saque : ");
			double Saque = input.nextDouble();
			if (Saldo >= Saque) {				
				Saldo = Saldo - Saque;
			} else {
				System.out.println("Não há saldo !!");
			}
			break;
			
		}
		
	

	}

}
