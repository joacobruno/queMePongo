package atuendo;

public class Prenda {
	String colorPrincipal;
	String colorSecundario = null;
	String tela;
	Categoria tipoCategoria;
	String tipoPrenda;
	
	public Prenda(String colorPrincipal, String tela, Categoria tipoCategoria, String tipoPrenda) {
		
		if(!tipoCategoria.getPartes().contains(tipoPrenda)) {
			//Throw new error 
		}else {
			this.colorPrincipal = colorPrincipal;
			this.tela = tela;
			this.tipoCategoria = tipoCategoria;
			this.tipoPrenda = tipoPrenda;
			}		
		}



	public Prenda(String colorPrincipal, String colorSecundario, String tela, Categoria tipoCategoria,
			String tipoPrenda) {
		
		if(!tipoCategoria.getPartes().contains(tipoPrenda)){ 
			//Throw new error
		}else {
		this.colorPrincipal = colorPrincipal;
		this.colorSecundario = colorSecundario;
		this.tela = tela;
		this.tipoCategoria = tipoCategoria;
		this.tipoPrenda = tipoPrenda;
		}
	}
	
	
	
}
