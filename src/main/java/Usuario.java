import java.util.ArrayList;
import java.util.List;

public class Usuario {

  private String nombre;
  private List<Guardarropa> guardarropas = new ArrayList<>(); //mismos usuario puede tener un mismos guardarropas

  public Usuario(String nombre) {
    this.nombre = nombre;
  }

  public void agregarGuardarropa(Guardarropa guardarropa) {
    this.guardarropas.add(guardarropa);
  }

  public void solicitarAgregarPrenda(Usuario usuario, Guardarropa guardarropa, Prenda prenda) {
    validarUsuarioEmisor(usuario,guardarropa);
    guardarropa.solicitarAgregarPrenda(prenda);
  }

  public void solicitarQuitarPrenda(Usuario usuario, Guardarropa guardarropa, Prenda prenda) {
    validarUsuarioEmisor(usuario,guardarropa);
    guardarropa.solicitarQuitarPrenda(prenda);
  }

  private void validarUsuarioEmisor(Usuario usuario, Guardarropa guardarropa) {
    if(!this.esCompartidoCon(usuario,guardarropa)) {
      throw new RuntimeException("El guardarropas no es compartido con " + usuario.getNombre());
    }
  }

  private boolean esCompartidoCon(Usuario usuario, Guardarropa guardarropa) {
    return this.mePertenece(guardarropa) && usuario.mePertenece(guardarropa);
  }

  private boolean mePertenece(Guardarropa guardarropa) {
    return this.guardarropas.contains(guardarropa);
  }

  public String getNombre() {
    return nombre;
  }
}
