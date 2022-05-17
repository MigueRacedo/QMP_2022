import static java.util.Objects.requireNonNull;

public class Prenda {
  private TipoPrenda tipoPrenda;
  private Material material;
  private Color colorPri;
  private Color colorSec;
  private Trama trama;

  // constructor sin Color secundario
  public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPri, Trama trama) {
    this.tipoPrenda = requireNonNull(tipoPrenda, "El tipo de prenda es obligatorio.");
    this.material = requireNonNull(material, "El material es obligatorio.");
    this.colorPri = requireNonNull(colorPri, "El color primario es obligatorio.");
    this.trama = requireNonNull(trama, "La trama es obligatoria.");
  }

  // constructor con Color secundario
  public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPri, Color colorSec, Trama trama) {
    this.tipoPrenda = requireNonNull(tipoPrenda, "El tipo de prenda es obligatorio.");
    this.material = requireNonNull(material, "El material es obligatorio.");
    this.colorPri = requireNonNull(colorPri, "El color primario es obligatorio.");
    this.colorSec = colorSec;
    this.trama = requireNonNull(trama, "La trama es obligatoria.");
  }

  //La categoria de una prenda, se encuentra en su tipo de prenda.
  // De esa forma, evito que es ingresen prendas cuyo tipo no coincida con su categoria.
  public Categoria getCategoria() {
    return this.tipoPrenda.getCategoria();
  }
}
