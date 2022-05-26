public class SolicitudAgregar extends Solicitud {
  public SolicitudAgregar(Prenda prenda) {
    super(prenda);
  }

  @Override
  public void efectoAceptar(Guardarropa guardarropa) {
    guardarropa.agregarPrenda(this.prenda);
  }

  @Override
  public void efectoDeshacer(Guardarropa guardarropa) {
    guardarropa.quitarPrenda(this.prenda);
  }
}
