import static java.util.Objects.requireNonNull;

public class Prenda {
  private TipoPrenda tipoPrenda;
  private Material material;
  private String colorPri; //se almacena en hexadecimal
  private String colorSec;

  public Prenda(TipoPrenda tipoPrenda, Material material, String colorPri, String colorSec) {
    this.tipoPrenda = requireNonNull(tipoPrenda, "El tipo de prenda es obligatorio.");
    this.material = requireNonNull(material, "El material es obligatorio.");
    this.colorPri = requireNonNull(colorPri, "El color primario es obligatorio.");
    this.colorSec = colorSec;
  }

  //La categoria de una prenda, se encuentra en su tipo de prenda.
  // De esa forma, evito que es ingresen prendas cuyo tipo no coincida con su categoria.
  public Categoria getCategoria() {
    return this.tipoPrenda.getCategoria();
  }
}
