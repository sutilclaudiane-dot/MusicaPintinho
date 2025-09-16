package TodosAnimais;

	public class Animal {
		private String nome;
	    private String som;
	    private String artigo;
	    
	 public Animal(String nome, String som, String artigo) {
	        this.nome = nome;
	        this.som = som;
	        this.artigo = artigo;
	        
	}
	 public String getNome() {
	        return nome;
	}
	 public String getSom() {
	        return som;
	 }
	 public String getArtigo() {
	        return artigo;
	 }
	        public void emitirSom() {
	            System.out.println("E " + artigo + " " + nome + " " + som);
	        }
	}
