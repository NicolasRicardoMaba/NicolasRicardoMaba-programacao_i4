package exerciciofixacao;

import java.util.Scanner;

public class Contacorrente {
	public String nome;
	public long cpf;
	public int accountn;
	public float saldo;

	public float sacar(float valordosaque) {

		if (valordosaque <= saldo) {

			saldo = saldo - valordosaque;

		} else
			System.out.println("Saldo Insuficiente");

		return valordosaque;
	}

	public float depositar(float depositado) {
		saldo = saldo + depositado;
		return saldo;

	}

	public void mostrardados() {
		System.out.println("Nome" + nome);
		System.out.println("Cpf:" + cpf);
		System.out.println("número da conta:" + accountn);
		System.out.println("Saldo da conta:" + saldo);
	}

}

/*
 * Escreva uma classe ContaCorrente tendo como atributos (public) o nome do
 * titular, cpf, numero da conta e saldo. Implemente os métodos sacar, depositar
 * e mostrarDados. Crie u ma classe ContaCorrenteMain com um método main que
 * instancia um objeto de ContaCorrente e testa a classe criada.
 */
