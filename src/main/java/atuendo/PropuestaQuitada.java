package ropa;

import atuendo.Guardaropa;
import atuendo.Prenda;
import atuendo.Propuesta;
import java.util.*;


public class PropuestaQuitada extends Propuesta {


  public PropuestaQuitada(Prenda prenda) {
    super(prenda);
  }

  @Override
  public void aceptar() {
    guardaropa.remove(this.prenda);
  }

  @Override
  public void deshacer() {
    guardaropa.add(this.prenda);
  }

}