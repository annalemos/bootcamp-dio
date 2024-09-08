package pkgdefault;

import java.util.ArrayList;
import java.util.List;

class Dev {

	 	private String nome;
	    private List<Conteudo> conteudosInscritos = new ArrayList<>();
	    private List<Conteudo> conteudosConcluidos = new ArrayList<>();

	    public void inscreverBootcamp(Bootcamp bootcamp) {
	        this.conteudosInscritos.addAll(bootcamp.getConteudos());
	    }

	    public void progredir() {
	        if (!conteudosInscritos.isEmpty()) {
	            Conteudo conteudo = conteudosInscritos.remove(0);
	            conteudosConcluidos.add(conteudo);
	        }
	    }

	    public double calcularTotalXP() {
	        return conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
	    }

	    // Getters e Setters
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public List<Conteudo> getConteudosInscritos() {
	        return conteudosInscritos;
	    }

	    public List<Conteudo> getConteudosConcluidos() {
	        return conteudosConcluidos;
	    }
}
