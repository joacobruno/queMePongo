package atuendo;

import java.util.Arrays;
import java.util.List;

public class Calzado implements Categoria {
	List <String> calzados = Arrays.asList("crocs","zapasTurras","botas");
;

	public List <String> getPartes() {
		return calzados;
	}
}
