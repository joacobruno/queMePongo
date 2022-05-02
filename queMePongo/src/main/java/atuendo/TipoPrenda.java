package atuendo;

public class TipoPrenda {

	  private Categoria categoria;

	  private TipoPrenda(Categoria categoria) {
	    this.categoria = categoria;
	  }

	  public Categoria getCategoria() {
	    return this.categoria;
	  }


	}