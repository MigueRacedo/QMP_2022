public class SolicitudQuitar extends Solicitud {
  public SolicitudQuitar(Prenda prenda) {
    super(prenda);
  }

  @Override
  public void efectoAceptar(Guardarropa guardarropa) {
    guardarropa.quitarPrenda(this.prenda);
  }

  @Override
  public void efectoDeshacer(Guardarropa guardarropa) {
    guardarropa.agregarPrenda(this.prenda);
  }
}
