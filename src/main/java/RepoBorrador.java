import java.util.ArrayList;
import java.util.List;

public class RepoBorrador {
  private static RepoBorrador instance = new RepoBorrador();
  private List<Borrador> borradores = new ArrayList<>();

  public RepoBorrador() {}

  public static RepoBorrador getInstance() {
    return instance;
  }

  public List<Borrador> getBorradores() {
    return borradores;
  }

  public void addBorradores(Borrador borrador) {
    this.borradores.add(borrador);
  }


}
