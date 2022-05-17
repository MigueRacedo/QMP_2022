import static java.util.Objects.requireNonNull;

public class Color {
  private int rojo;
  private int verde;
  private int azul;

  public Color(int rojo, int verde, int azul) {
    this.rojo = requireNonNull(rojo, "El rojo es obligatorio.");
    this.verde = requireNonNull(verde, "El verde es obligatorio.");
    this.azul = requireNonNull(azul, "El azul es obligatorio.");
  }
}
