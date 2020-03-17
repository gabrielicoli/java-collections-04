package br.fai.colletcions04;

	
public class Cachorro extends Animais {

		public Cachorro(String nome) // construtor
		{
			
			setNome(nome);
		}

		@Override
		public void som() {
			System.out.println("Eu gosto de latir");// sobrescreve o metodo som da main
		}

		public void euGostDeFazer() {
			System.out.println("Gosto de morder os carteiros");
		}
	}


