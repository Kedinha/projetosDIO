package ked.spring_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import ked.spring_jpa.model.User;
import ked.spring_jpa.repository.UserRepository;

public class StartApp implements CommandLineRunner {
  @Autowired
  private UserRepository repository;

  @Override
  public void run(String... args) throws Exception {
    User user = new User();
    user.setName("Kedma");
    user.setUsername("keds");
    user.setPassword("ked123");

    repository.save(user);

    for (org.springframework.boot.autoconfigure.security.SecurityProperties.User u : repository.findAll()) {
      System.out.println(u);
    }
  }
}
