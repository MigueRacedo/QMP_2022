import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

public class ClimaService {

  List<Clima> apisClima; //lista de api pasa usar
  int temperatura;
  int temperaturaAnterior;
  LocalDateTime ultimaConsulta;

  public int obtenerClima(String ciudad) {

    int tempAux = 0;

    if (ultimaConsulta != null) {
      return temperatura;
    }
    //no encontre una forma adecuada es escribir el for con lambda
    for (Clima clima : apisClima) {
      //no se porque no funciona el segundo get(0), pero no encontre otra forma de hacerlo
      //tempAux = clima.getClima(ciudad).get(0).get("Temperature").get(0).get("Value");

      //si falla va a agarrar otra api de la lista
      if (tempAux != 0) {
        temperaturaAnterior = temperatura;
        temperatura = tempAux;
        ultimaConsulta = LocalDateTime.now();
        break;
      }
    }
    return tempAux;
  }
}
