package br.fai.colletcions04;


public class Gato extends Animais {
		
		public Gato() {
			setCor("Branco");
		}
		
		public Gato(String cor) {
			setCor(cor);
		}
	@Override
	public void som() {
		System.out.println("Eu gosto de miar");
	}
	public void euGostDeFazer() {
		System.out.println("Gosto de pular a cerca toda noite");
	 }


	}


