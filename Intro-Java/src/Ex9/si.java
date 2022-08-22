package Ex9;
import java.util.Scanner;//biblioteca do Scanner
import java.util.ArrayList;//biblioteca Array
public class si {

	// criandoListas
ArrayList<String> listaFrutas = new ArrayList<>();//cria uma lista

listaFrutas.add("Maçã");
/*listaFrutas.add("Maçã");
listaFrutas.set(0, "Melão");//Substituir
listaFrutas.remove(0);//remove o elemento colocado()
listaFrutas.size();//retorna o tamanho da lista*/



Scanner leitura = new Scanner(System.in);

for (int i = 0; i < 5; i++) {
	System.out.println("Insira uma fruta:");
	String fruta =leitura.nextLine();
if (!fruta.isEmpty()) {
	listaFrutas.add(fruta);
}}}}





