import java.util.List;
import java.util.stream.Collectors;

public class Guardarropa {

  private Criterio criterio;
  private List<Prenda> prendas;
  private List<Solicitud> solicitudes;

  public Guardarropa(List<Prenda> prendas) {
    this.prendas = prendas;
  }

  public void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    this.prendas.remove(prenda);
  }

  private void agregarSolicitud(Solicitud solitud) {
    this.solicitudes.add(solitud);
  }

  private void quitarSolicitud(Solicitud solitud) {
    this.solicitudes.remove(solitud);
  }

  public void solicitarAgregarPrenda(Prenda prenda) {
    SolicitudAgregar solitudNueva = new SolicitudAgregar(prenda);
    this.agregarSolicitud(solitudNueva);
  }

  public void solicitarQuitarPrenda(Prenda prenda) {
    SolicitudQuitar solitudNueva = new SolicitudQuitar(prenda);
    this.agregarSolicitud(solitudNueva);
  }

  public List<Solicitud> getSolicitudesPendientes() {
    return solicitudes.stream().filter(x -> x.getEstado().equals(EstadoSolicitud.PENDIENTE)).collect(Collectors.toList());
  }
}
