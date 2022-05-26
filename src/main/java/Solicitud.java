import java.time.Period;

public abstract class Solicitud {
  private EstadoSolicitud estado;
  protected Prenda prenda;

  public Solicitud(Prenda prenda) {
    this.prenda = prenda;
    this.estado = EstadoSolicitud.PENDIENTE;
  }

  public EstadoSolicitud getEstado() {
    return estado;
  }

  public void aceptarEn(Guardarropa guardarropa) {
    this.efectoAceptar(guardarropa);
    this.estado = EstadoSolicitud.ACEPTADA;
  }

  public void deshacerEn(Guardarropa guardarropa) {
    this.efectoDeshacer(guardarropa);
    this.estado = EstadoSolicitud.PENDIENTE;
  }

  protected abstract void efectoDeshacer(Guardarropa guardarropa);

  protected abstract void efectoAceptar(Guardarropa guardarropa);

  public void rechazar() {
    this.estado = EstadoSolicitud.RECHAZADA;
  }
}
