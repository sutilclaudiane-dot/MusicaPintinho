		  package TodosAnimais;

		  public class MusicaDosAnimais {
			  
		  public static void main(String[] args) {
			  
	        Animal[] animais = {
	            new Animal("pintinho", "piu", "o"),
	            new Animal("galo", "cocoricó", "o"),
	            new Animal("galinha", "có", "a"),
	            new Animal("cachorro", "auau", "o"),
	            new Animal("gato", "miau", "o")
	        };
	        
	        cantarMusica(animais);
	    }

	    public static void cantarMusica(Animal[] animais) {
	        for (int i = 0; i < animais.length; i++) {
	            Animal animalAtual = animais[i];
	            
	            System.out.println("Lá em casa tinha um " + animalAtual.getNome());
	            System.out.println("Lá em casa tinha um " + animalAtual.getNome());
	           
	            animalAtual.emitirSom();
	            
	            for (int j = i - 1; j >= 0; j--) {
	                animais[j].emitirSom();
	            }
	            
	            int repeticoesPintinho = (i == 0) ? 5 : (6 - i);
	            for (int k = 0; k < repeticoesPintinho; k++) {
	                animais[0].emitirSom();
	            }
	            
	            System.out.println();
	        }
	    }	

}
