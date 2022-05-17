import static java.util.Objects.requireNonNull;

public class Uniforme {
  private Prenda superior;
  private Prenda inferior;
  private Prenda calzado;

  public Uniforme(Prenda superior, Prenda inferior, Prenda calzado) {
    this.superior = requireNonNull(superior, "La prenda superior es obligatoria.");
    this.inferior = requireNonNull(inferior, "La prenda inferior es obligatoria.");
    this.calzado = requireNonNull(calzado, "La prenda calzado es obligatoria.");
  }

  static void fabricar(Sastre sastre) {
    new Uniforme(sastre.fabricarParteSuperior(), sastre.fabricarParteInferior(), sastre.fabricarCalzado());
  }

}
