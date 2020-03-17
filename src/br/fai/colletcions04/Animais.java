package br.fai.colletcions04;



	public abstract class Animais {
		
		public void som() {
			System.out.println("Esse é o som"
		+ "padrão de um animal: zzzzz");
			System.out.println("Eu gosto de latir");
		}
		
		
		public void dizerMeuNome(){
			System.out.println("Nome do animal:"+getNome());
			
		}
		
		

		public void setCor(String cor) {
			this.cor = cor;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public void dizerMinhaIdade(){
			System.out.println("Minha idade é: xxx");
		}
		private String cor= "preto";
		private int idade= 5;
		private String nome = "não indentificado";
		
		public String getCor() {
			return cor;
		}

		public int getIdade() {
			return idade;
		}

		public String getNome() {
			return nome;
		}
		
		
		
		
	}


