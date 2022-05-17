import static java.util.Objects.requireNonNull;

public class Borrador {
  private TipoPrenda tipoPrenda;
  private Material material;
  private Color colorPri;
  private Color colorSec;
  private Trama trama;

  public Borrador(TipoPrenda tipoPrenda, Material material, Color colorPri, Color colorSec, Trama trama) {
    especificarTipo(tipoPrenda);
    especificarMaterial(material);
    especificarColorPri(colorPri);
    especificarColorSec(colorSec);
    especificarTrama(trama);
  }

  public void especificarTipo(TipoPrenda tipoPrenda) {
    this.tipoPrenda = requireNonNull(tipoPrenda, "El tipo de prenda es obligatorio.");
  }

  public void especificarMaterial(Material material) {
    /* if(validarMaterialConTipo(meterial)) {
          this.material = material;
        }
     */
    this.material = material;
  }

  public void especificarColorPri(Color color) {
    /* if(validarColorPConTipo(color)) {
          this.colorPri = colorPri;
        }
     */
    this.colorPri = color;
  }

  public void especificarColorSec(Color color) {
    /* if(validarColorSConTipo(color)) {
          this.colorSec = colorSec;
        }
     */
    this.colorSec = color;
  }

  public void especificarTrama(Trama trama) {
    /* if(validarTrama(trama)) {
          this.trama = trama;
        }
     */
    this.trama = trama;
  }
}
