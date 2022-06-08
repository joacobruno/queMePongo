package atuendo;
import atuendo.Propuesta;


import java.util.*;

public class PropuestaAgregada extends Propuesta {


  public PropuestaAgregada(Prenda prenda) {
    super(prenda);
  }

  @Override
  public void aceptar() {
    guardaropa.add(this.prenda);
    guardaropa.getPropuestasPendientes().remove(this);
    guardaropa.getPropuestasAceptadas().add(this);
  }

  @Override
  public void deshacer() {
    guardaropa.remove(this.prenda);

  }
}