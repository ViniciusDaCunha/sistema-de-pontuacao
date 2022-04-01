package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionário;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Funcionário> lista = new ArrayList<>();

		System.out.print("Quantos funcionários serão bonificados? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Funcionário " + i + ": ");

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Independência: ");
			Integer independencia = sc.nextInt();

			System.out.print("Produtividade: ");
			Integer produtividade = sc.nextInt();

			System.out.print("Pontualidade: ");
			Integer pontualidade = sc.nextInt();

			System.out.print("Regras de convivência: ");
			Integer regrasConv = sc.nextInt();

			System.out.print("Regras da casa: ");
			Integer regrasCasa = sc.nextInt();

			Integer soma = 0;

			Funcionário funcionario = new Funcionário(nome, independencia, produtividade, pontualidade, regrasConv,
					regrasCasa, soma);

			lista.add(funcionario);
			funcionario.somaBonificacao();
		}

		System.out.println();
		System.out.println("Soma das notas da bonificação: ");
		for (Funcionário funcionario : lista) {
			System.out.println(funcionario);
		}

		sc.close();
	}
}
