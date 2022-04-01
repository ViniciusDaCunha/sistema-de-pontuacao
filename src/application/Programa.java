package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcion�rio;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Funcion�rio> lista = new ArrayList<>();

		System.out.print("Quantos funcion�rios ser�o bonificados? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Funcion�rio " + i + ": ");

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Independ�ncia: ");
			Integer independencia = sc.nextInt();

			System.out.print("Produtividade: ");
			Integer produtividade = sc.nextInt();

			System.out.print("Pontualidade: ");
			Integer pontualidade = sc.nextInt();

			System.out.print("Regras de conviv�ncia: ");
			Integer regrasConv = sc.nextInt();

			System.out.print("Regras da casa: ");
			Integer regrasCasa = sc.nextInt();

			Integer soma = 0;

			Funcion�rio funcionario = new Funcion�rio(nome, independencia, produtividade, pontualidade, regrasConv,
					regrasCasa, soma);

			lista.add(funcionario);
			funcionario.somaBonificacao();
		}

		System.out.println();
		System.out.println("Soma das notas da bonifica��o: ");
		for (Funcion�rio funcionario : lista) {
			System.out.println(funcionario);
		}

		sc.close();
	}
}
