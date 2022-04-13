import static java.util.Objects.requireNonNull;

public class TipoPrenda {
  private Categoria categoria;

  public TipoPrenda(Categoria categoria) {
    this.categoria = requireNonNull(categoria, "La categoria es obligatorio.");
  }

  public Categoria getCategoria() {
    return this.categoria;
  }
}
