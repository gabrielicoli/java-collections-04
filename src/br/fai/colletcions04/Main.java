package br.fai.colletcions04;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
		
		
	}

	private void start() {
		
		Cachorro primeiroCachorro = new Cachorro("Tibursinho");
		primeiroCachorro.setCor("azul");
		Cachorro segundoCachorro = new Cachorro("Aroldo");
		segundoCachorro=new Cachorro("amarelo");
		List<Cachorro>listaDeCachorros=
				new ArrayList<Cachorro>();
				listaDeCachorros.add(primeiroCachorro);
				listaDeCachorros.add(segundoCachorro);
				
				for(Cachorro cachorro: listaDeCachorros) {
					
					cachorro.som();
					cachorro.dizerMeuNome();
					cachorro.euGostDeFazer();
					System.out.println("Cor do cachorro: "+cachorro.getCor());
					System.out.println("---------------------");
				}
				
				Gato g = new Gato();
				Gato primeiroGato= new Gato();
				primeiroGato.setNome("chupetinha");
				Gato segundoGato = new Gato("Vermelho");
				List<Gato> listaDeGatos = new ArrayList<Gato>();
				listaDeGatos.add(primeiroGato);
				listaDeGatos.add(segundoGato);
				
				g.som();
				g.dizerMeuNome();
				g.euGostDeFazer();
				System.out.println("cor do gato: " +g.getCor());
				System.out.println("----------------");
				
				
	}
	
	
	
	
	
	
}
	