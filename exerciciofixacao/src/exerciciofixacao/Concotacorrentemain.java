package exerciciofixacao;

public class Concotacorrentemain {

	public static void main(String[] args) {
		Contacorrente c =new Contacorrente();
		c.nome = "Nicolas";
		c.cpf = 12593925973l;
		c.accountn = 665322365;
		c.saldo = 10000000;

		c.mostrardados();
		
		c.depositar(50);
		c.sacar(67);
		
		c.mostrardados();
	}

}
