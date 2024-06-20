package srpingboot.app;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// import srpingboot.app.Beans.Gson;

@Component
public class ConversorJson {
  @Autowired
  private Gson gson;

  public ViaCepResponse converter(String json) {
    ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
    return response;
  }
}
