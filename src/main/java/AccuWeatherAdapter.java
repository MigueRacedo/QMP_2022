import java.util.List;
import java.util.Map;

public class AccuWeatherAdapter implements Clima {

  AccuWeatherAPI accuWeatherAPI;

  public AccuWeatherAdapter(AccuWeatherAPI accuWeatherAPI) {
    this.accuWeatherAPI = accuWeatherAPI;
  }

  public List<Map<String, Object>> getClima(String ciudad) {
    return accuWeatherAPI.getWeather(ciudad);
  }
}
