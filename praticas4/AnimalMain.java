package praticas4;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Gato gato1 = new Gato();
		Gato gato2 = new Gato();
		ArrayList<Gato> gatos = new ArrayList<>();
		
		gato.setNome("Kleber");
		gato.setCor("azul");
		gato.setEcossistema("Rua");
		gato.setRaca("Mestiço");
		gato.setComprimento(20.0f);
		gato.setNumeroPatas(4);
		gatos.add(gato);
		
		gato1.setNome("Joao");
		gato1.setCor("marrom");
		gato1.setEcossistema("Floresta");
		gato1.setRaca("Gato");
		gato1.setComprimento(13.0f);
		gato1.setNumeroPatas(4);
		gatos.add(gato1);
		
		gato2.setNome("Maria");
		gato2.setCor("Rosa");
		gato2.setEcossistema("Hotel");
		gato2.setRaca("Rico");
		gato2.setComprimento(20.0f);
		gato2.setNumeroPatas(2);
		gatos.add(gato2);
		
		Cachorro cachorro = new Cachorro();
		Cachorro cachorro1 = new Cachorro();
		Cachorro cachorro2 = new Cachorro();
		ArrayList<Cachorro> cachorros = new ArrayList<>();
		
		cachorro.setNome("Emerson");
		cachorro.setCor("laranja");
		cachorro.setEcossistema("Oceano pacífico");
		cachorro.setRaca("Bullterrier");
		cachorro.setComprimento(7.0f);
		cachorro.setNumeroPatas(3);
		cachorros.add(cachorro);
		
		cachorro1.setNome("Kafú");
		cachorro1.setCor("Roxo");
		cachorro1.setEcossistema("Petrópolis");
		cachorro1.setRaca("Canalha");
		cachorro1.setComprimento(30.09f);
		cachorro1.setNumeroPatas(1);
		cachorros.add(cachorro1);
		
		cachorro2.setNome("Amoedo");
		cachorro2.setCor("Novo");
		cachorro2.setEcossistema("Privatizado");
		cachorro2.setRaca("Nordestino");
		cachorro2.setComprimento(14.0f);
		cachorro2.setNumeroPatas(4);
		cachorros.add(cachorro2);
		
		for (Cachorro cachorro11 : cachorros) {
			System.out.println(cachorro11.getNome());
			System.out.println(cachorro11.getRaca());
			System.out.println(cachorro11.getCor());
			System.out.println(cachorro11.getComprimento());
			System.out.println(cachorro11.getEcossistema());
			System.out.println(cachorro11.getNumeroPatas());
			cachorro11.latir();
		}


		for (Gato gatos1 : gatos) {
			System.out.println(gatos1.getNome());
			System.out.println(gatos1.getRaca());
			System.out.println(gatos1.getCor());
			System.out.println(gatos1.getComprimento());
			System.out.println(gatos1.getEcossistema());
			System.out.println(gatos1.getNumeroPatas());
			gatos1.miar();
		}
		

	}

}
