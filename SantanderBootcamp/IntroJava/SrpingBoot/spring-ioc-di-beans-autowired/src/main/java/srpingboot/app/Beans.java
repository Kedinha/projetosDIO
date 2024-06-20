package srpingboot.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import com.google.gson.Gson;

@Configuration
public class Beans {

  @Bean
  public ConversorJson conversor() {
    return new ConversorJson();
  }

}
